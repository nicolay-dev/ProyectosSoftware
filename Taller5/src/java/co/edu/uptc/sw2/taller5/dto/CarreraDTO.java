package co.edu.uptc.sw2.taller5.dto;



public class CarreraDTO {

    public CarreraDTO() {
        //constructor base
    }

    public CarreraDTO(Long id) {
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
    private FacultadDTO facultad;

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
    public FacultadDTO getFacultad() {
        return this.facultad;
    }

    /**
     * @generated
     */
    public void setFacultad(FacultadDTO facultad) {
        this.facultad = facultad;
    }

}
