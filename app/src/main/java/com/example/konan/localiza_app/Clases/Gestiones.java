package com.example.konan.localiza_app.Clases;

/**
 * Created by konan on 30/05/2017.
 */

public class Gestiones {
    private String title;
    private String idClienteGest;
    private String idGestion;
    private String nombreGestion;
    private String statusGestion;

    public Gestiones() {
        super();
    }

    public Gestiones(String idClienteGest, String idGestion, String nombreGestion, String statusGestion) {
        super();
        this.idClienteGest = idClienteGest;
        this.idGestion = idGestion;
        this.nombreGestion = nombreGestion;
        this.statusGestion = statusGestion;
    }

    public Gestiones(String idClienteGest, String idGestion) {
        super();
        this.idClienteGest = idClienteGest;
        this.idGestion = idGestion;
    }

    public String getIdClienteGest() {
        return idClienteGest;
    }

    public void setIdClienteGest(String idClienteGest) {
        this.idClienteGest = idClienteGest;
    }

    public Gestiones(String nombreGestion) {
        super();
        this.nombreGestion = nombreGestion;
    }

    public String getIdGestion() {
        return idGestion;
    }

    public void setIdGestion(String idGestion) {
        this.idGestion = idGestion;
    }

    public String getNombreGestion() {
        return nombreGestion;
    }

    public void setNombreGestion(String NombreGestion) {
        this.nombreGestion = nombreGestion;
    }

    public String getStatusGestion() {
        return statusGestion;
    }

    public void setStatusGestion(String statusGestion) {
        this.statusGestion = statusGestion;
    }
}
