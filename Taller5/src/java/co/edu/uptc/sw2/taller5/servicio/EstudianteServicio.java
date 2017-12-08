/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller5.servicio;


import co.edu.uptc.sw2.taller5.dto.EstudianteDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Dreyk
 */
@Path("/Estudiante")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstudianteServicio {
    
    @GET
    public java.util.List<EstudianteDTO> obtenerTodosEstudiantes() {
        return ProveedorInformacion.instance().obtenerTodos(EstudianteDTO.class);
    }
    
    /**
     * @param id identificador del elemento Carrera
     * @return Carrera del id dado
     * @generated
     */
    @GET
    @Path("/{id}")
    public EstudianteDTO obtenerEstudiante(@PathParam("id") Long id) {
        return (EstudianteDTO) ProveedorInformacion.instance().obtener(EstudianteDTO.class, id);
    }
    
    /**
     * almacena la informacion de Carrera
     *
     * @param dto Carrera a guardar
     * @return Carrera con los cambios realizados por el proceso de guardar
     * @generated
     */
    @POST
    public EstudianteDTO guardarCarrera(EstudianteDTO dto) {
        return (EstudianteDTO) ProveedorInformacion.instance().guardar(dto);
    }

    @GET
    @Path("/consulta")
    public List<EstudianteDTO> consultarEstudiantes(@QueryParam("nombres") String nombre, @QueryParam("apellidos") String apellidos){
        List<EstudianteDTO> lista=obtenerTodosEstudiantes();
        List<EstudianteDTO> respuesta=new ArrayList<>();
        for(EstudianteDTO e:lista){
            if(e.getNombres().toUpperCase().contains(nombre.toUpperCase())||e.getApellidos().toUpperCase().contains(apellidos.toUpperCase())){
                respuesta.add(e);
            }
        }
        return respuesta;
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
        ProveedorInformacion.instance().eliminar(EstudianteDTO.class, id);
    }
}
