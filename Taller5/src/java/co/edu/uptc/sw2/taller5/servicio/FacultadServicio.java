package co.edu.uptc.sw2.taller5.servicio;

import co.edu.uptc.sw2.taller5.dto.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/Facultad")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FacultadServicio {

    /**
     * retorna una lista con los Facultad que se encuentran en la base de datos
     *
     * @return retorna una lista de FacultadDTO
     * @generated
     */
    @GET
    public List<FacultadDTO> obtenerTodosFacultads() {
        return ProveedorInformacion.instance().obtenerTodos(FacultadDTO.class);
    }

    /**
     * @param id identificador del elemento Facultad
     * @return Facultad del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public FacultadDTO obtenerFacultad(@PathParam("id") Long id) {
        return (FacultadDTO) ProveedorInformacion.instance().obtener(FacultadDTO.class, id);
    }

    /**
     * almacena la informacion de Facultad
     *
     * @param dto Facultad a guardar
     * @return Facultad con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public FacultadDTO guardarFacultad(FacultadDTO dto) {
        return (FacultadDTO) ProveedorInformacion.instance().guardar(dto);
    }

    /**
     * elimina el registro Facultad con el identificador dado
     *
     * @param id identificador del Facultad
     * @generated
     */
    @DELETE
    @Path("/{id}")
    public void borrarFacultad(@PathParam("id") Long id) {
        ProveedorInformacion.instance().eliminar(FacultadDTO.class, id);
    }
    
    @GET
    @Path("/consulta")
    public List<FacultadDTO> consultarFacultades(@QueryParam("nombre") String nombre){
        List<FacultadDTO> lista=obtenerTodosFacultads();
        List<FacultadDTO> respuesta=new ArrayList<>();
        for(FacultadDTO f:lista){
            if(f.getNombre().toUpperCase().contains(nombre.toUpperCase())){
                respuesta.add(f);
            }
        }
        return respuesta;
    }
    
    

}
