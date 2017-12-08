package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class MunicipioDTO {

    public MunicipioDTO() {
        //constructor base
    }

    public MunicipioDTO(Long id) {
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
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @generated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
