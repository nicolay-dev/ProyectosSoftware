package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Municipio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MunicipioServicio {

    /**
     * retorna una lista con los Municipio que se encuentran en la base de datos
     *
     * @return retorna una lista de MunicipioDTO
     * @generated
     */
    @GET
    public List<MunicipioDTO> obtenerTodosMunicipios() {
        return ProveedorInformacion.instance().obtenerTodos(MunicipioDTO.class);
    }

    /**
     * @param id identificador del elemento Municipio
     * @return Municipio del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public MunicipioDTO obtenerMunicipio(@PathParam("id") Long id) {
        return (MunicipioDTO) ProveedorInformacion.instance().obtener(MunicipioDTO.class, id);
    }

    /**
     * almacena la informacion de Municipio
     *
     * @param dto Municipio a guardar
     * @return Municipio con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public MunicipioDTO guardarMunicipio(MunicipioDTO dto) {
        return (MunicipioDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Municipio con el identificador dado
     *
     * @param id identificador del Municipio
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarMunicipio(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(MunicipioDTO.class, id);
    }

}
