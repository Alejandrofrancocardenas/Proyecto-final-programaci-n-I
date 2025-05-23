package co.edu.uniquindio.proyectofinal.model;

import java.util.LinkedList;

public class Paciente extends Usuario {
    private String numeroSeguroSocial;
    private HistorialMedico historialMedico;
    private LinkedList<CitaMedica> citas;
    public Paciente(String nombre, String cedula, Sexo sexo, int edad, String nombreUsuario, String contrasena, TipoUsuario tipoUsuario, String numeroSeguroSocial, HistorialMedico historialMedico) {
        super(nombre, cedula, sexo, edad, nombreUsuario, contrasena, tipoUsuario);
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.historialMedico = historialMedico;
        this.citas = new LinkedList<>();
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }
    public LinkedList<CitaMedica> getCitas() {
        return citas;
    }
    public void setCitas(LinkedList<CitaMedica> citas) {
        this.citas = citas;
    }
}
