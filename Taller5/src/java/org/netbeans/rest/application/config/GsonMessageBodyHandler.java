/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MultivaluedMap;

@Provider
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public final class GsonMessageBodyHandler implements MessageBodyWriter<Object>,
        MessageBodyReader<Object> {

    private static final String UTF_8 = "UTF-8";

    private Gson gson;

    private Gson getGson() {
        if (gson == null) {
            JsonSerializer<Date> ser = new JsonSerializer<Date>(){

                @Override
                public JsonElement serialize(Date src, Type type, JsonSerializationContext jsc) {
                    return src == null ? null : new JsonPrimitive(src.getTime());
                }
                
            };

            JsonDeserializer<Date> deser = new JsonDeserializer<Date>() {

                @Override
                public Date deserialize(JsonElement json, Type type, JsonDeserializationContext jdc) throws JsonParseException {
                    return json == null ? null : new Date(json.getAsLong());
                }
            };

            final GsonBuilder gsonBuilder = new GsonBuilder();
            gson = gsonBuilder.registerTypeAdapter(Date.class, ser)
                    .registerTypeAdapter(Date.class, deser).create();
        }
        return gson;
    }

    @Override
    public boolean isReadable(Class<?> type, Type genericType,
            java.lang.annotation.Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) {
        try{
            try(InputStreamReader streamReader = new InputStreamReader(entityStream, UTF_8)){
                Type jsonType;
                if (type.equals(genericType)) {
                    jsonType = type;
                } else {
                    jsonType = genericType;
                }
                return getGson().fromJson(streamReader, jsonType);
            }
        } catch (Exception ex) {
            Logger.getLogger(GsonMessageBodyHandler.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("Error al procesar la entrada json", ex);
        }
    }

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(Object object, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Object object, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        OutputStreamWriter writer = new OutputStreamWriter(entityStream, UTF_8);
        try {
            Type jsonType;
            if (type.equals(genericType)) {
                jsonType = type;
            } else {
                jsonType = genericType;
            }
            getGson().toJson(object, jsonType, writer);
        } finally {
            writer.close();
        }
    }
}