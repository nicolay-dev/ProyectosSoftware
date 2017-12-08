package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 * @author daperador
 * @generated
 */
@Path("/Carrera")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarreraServicio {

    /**
     * retorna una lista con los Carrera que se encuentran en la base de datos
     *
     * @return retorna una lista de CarreraDTO
     * @generated
     */
    @GET
    public List<CarreraDTO> obtenerTodosCarreras() {
        return ProveedorInformacion.instance().obtenerTodos(CarreraDTO.class);
    }

    /**
     * @param id identificador del elemento Carrera
     * @return Carrera del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public CarreraDTO obtenerCarrera(@PathParam("id") Long id) {
        return (CarreraDTO) ProveedorInformacion.instance().obtener(CarreraDTO.class, id);
    }

    /**
     * almacena la informacion de Carrera
     *
     * @param dto Carrera a guardar
     * @return Carrera con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public CarreraDTO guardarCarrera(CarreraDTO dto) {
        return (CarreraDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Carrera con el identificador dado
     *
     * @param id identificador del Carrera
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarCarrera(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(CarreraDTO.class, id);
    }

}
