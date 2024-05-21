package com.example.prueba.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "USUARIO")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Integer idUsuario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "CEDULA")
    private String cedula;

    @Column(name = "PIN")
    private String contrasena;

    @Column(name = "FECHA_NACIMIENTO")
    private LocalDateTime fechaNacimiento;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "CORREO_ELECTRONICO")
    private String correo;

    @Column(name = "TELEFONO")
    private String telefono;


    //Tal vez ignorar en el mapper

//    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Estudiante estudiante;
//
//    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Profesor profesor;
//
//    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Empleado empleado;
//
//
//    public Estudiante getEstudiante() {
//        return estudiante;
//    }
//
//    public void setEstudiante(Estudiante estudiante) {
//        this.estudiante = estudiante;
//    }
//
//    public Profesor getProfesor() {
//        return profesor;
//    }
//
//    public void setProfesor(Profesor profesor) {
//        this.profesor = profesor;
//    }
//
//    public Empleado getEmpleado() {
//        return empleado;
//    }
//
//    public void setEmpleado(Empleado empleado) {
//        this.empleado = empleado;
//    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
