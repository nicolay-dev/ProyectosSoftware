package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class MateriaDTO {

    public MateriaDTO() {
        //constructor base
    }

    public MateriaDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private String nombre;

    /**
     * @generated
     */
    private Integer creditos;

    /**
     * @generated
     */
    private ProfesorDTO profesor;

    private List<HorarioDTO> horario;
    
    public List<HorarioDTO> getHorario(){
    	if(this.horario==null){
    		horario=new ArrayList<HorarioDTO>();
    	}
    	return horario;
    }
    
    public void setHorario(List<HorarioDTO> horario){
    	this.horario=horario;
    }
    
    /**
     * @generated
     */
    private CarreraDTO carrera;

    /**
     * @generated
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @generated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @generated
     */
    public Integer getCreditos() {
        return this.creditos;
    }

    /**
     * @generated
     */
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    /**
     * @generated
     */
    public ProfesorDTO getProfesor() {
        return this.profesor;
    }

    /**
     * @generated
     */
    public void setProfesor(ProfesorDTO profesor) {
        this.profesor = profesor;
    }

    /**
     * @generated
     */
    public CarreraDTO getCarrera() {
        return this.carrera;
    }

    /**
     * @generated
     */
    public void setCarrera(CarreraDTO carrera) {
        this.carrera = carrera;
    }

}
