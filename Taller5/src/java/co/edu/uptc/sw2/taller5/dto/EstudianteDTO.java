package co.edu.uptc.sw2.taller5.dto;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class EstudianteDTO {

    public EstudianteDTO() {
        //constructor base
    }

    public EstudianteDTO(Long id) {
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
    private String codigo;

    /**
     * @generated
     */
    private String documento;

    /**
     * @generated
     */
    private String fechaNacimiento;

    /**
     * @generated
     */
    private MunicipioDTO lugarNacimiento;

    /**
     * @generated
     */
    private CarreraDTO carrera;

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
    public String getCodigo() {
        return this.codigo;
    }

    /**
     * @generated
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    /**
     * @generated
     */
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * @generated
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    /**
     * @generated
     */
    public MunicipioDTO getLugarNacimiento() {
        return this.lugarNacimiento;
    }

    /**
     * @generated
     */
    public void setLugarNacimiento(MunicipioDTO lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

}
