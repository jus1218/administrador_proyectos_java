package com.mycompany.colaborador;

public class ColaboradorEntity extends Persona {

    private String especialidad;
    private Boolean estado;

    //------------------ Constructores --------------------------
    public ColaboradorEntity(String especialidad, Boolean estado) {
        this.especialidad = especialidad;
        this.estado = estado;
    }

    public ColaboradorEntity(String[] datos) {
        super(datos[0], datos[1], datos[2], datos[3], datos[4]);
        this.especialidad = datos[5];
        this.estado = Boolean.parseBoolean(datos[6]);//resive string,entones toca pasarlo a boolean.
    }
    //----------------- Metodos propios -------------------------
    
    public String getEspecialidad() {
        return especialidad;
    }

    public Boolean getEstado() {
        return estado;
    }

    //------------------ Metodos Heredados ----------------------
    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getApellidos() {
        return this.apellidos;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public String getCorreo() {
        return this.correo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" => ");
        sb.append("ColaboradorEntity{especialidad = ").append(especialidad);
        sb.append(", estado = ").append(estado);
        sb.append('}');
        return sb.toString();
    }
}
