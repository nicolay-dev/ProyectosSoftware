package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas
 * como servicios REST
 *
 * @author daperador
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.edu.uptc.sw2.taller5.servicio.CarreraServicio.class);
        resources.add(co.edu.uptc.sw2.taller5.servicio.EstudianteServicio.class);
        resources.add(co.edu.uptc.sw2.taller5.servicio.FacultadServicio.class);
        resources.add(co.edu.uptc.sw2.taller5.servicio.MunicipioServicio.class);
        resources.add(org.netbeans.rest.application.config.GsonMessageBodyHandler.class);
    }

}
