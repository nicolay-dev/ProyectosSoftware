package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;

public class ProfesorDTO {

    public ProfesorDTO() {
        //constructor base
    }

    public ProfesorDTO(Long id) {
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
    private String nombres;

    /**
     * @generated
     */
    private String apellidos;

    /**
     * @generated
     */
    private String documento;

    /**
     * @generated
     */
    public String getNombres() {
        return this.nombres;
    }

    /**
     * @generated
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @generated
     */
    public String getApellidos() {
        return this.apellidos;
    }

    /**
     * @generated
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @generated
     */
    public String getDocumento() {
        return this.documento;
    }

    /**
     * @generated
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

}
