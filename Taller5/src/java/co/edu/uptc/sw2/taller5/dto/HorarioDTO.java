package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class HorarioDTO {

    public HorarioDTO(){
        //constructor base
    }
    
    public HorarioDTO(Long id){
        this.id=id;
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
    private Integer diaSemana;
    
    /**
    * @generated
    */
    private Integer horaInicio;
    
    /**
    * @generated
    */
    private Integer horaFin;
    
    
    /**
    * @generated
    */
    public Integer getDiaSemana() {
        return this.diaSemana;
    }
    
    /**
    * @generated
    */
    public void setDiaSemana(Integer diaSemana) {
        this.diaSemana = diaSemana;
    }
    /**
    * @generated
    */
    public Integer getHoraInicio() {
        return this.horaInicio;
    }
    
    /**
    * @generated
    */
    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }
    /**
    * @generated
    */
    public Integer getHoraFin() {
        return this.horaFin;
    }
    
    /**
    * @generated
    */
    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }
    
	
}
