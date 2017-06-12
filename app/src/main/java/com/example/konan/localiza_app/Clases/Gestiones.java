package com.example.konan.localiza_app.Clases;

/**
 * Created by konan on 30/05/2017.
 */

public class Gestiones {
    private String idClienteGest;
    private String idGestion;
    private String nombreGestiones;
    private String statusGestion;

    public Gestiones() {
        super();
    }

    public Gestiones(String idClienteGest, String idGestion, String nombreGestiones, String statusGestion) {
        super();
        this.idClienteGest = idClienteGest;
        this.idGestion = idGestion;
        this.nombreGestiones = nombreGestiones;
        this.statusGestion = statusGestion;
    }

    public Gestiones(String idClienteGest, String idGestion) {
        super();
        this.idClienteGest = idClienteGest;
        this.idGestion = idGestion;
    }
    public Gestiones(String nombreGestiones) {
        super();
        this.nombreGestiones = nombreGestiones;
    }

    public String getIdClienteGest() {
        return idClienteGest;
    }

    public void setIdClienteGest(String idClienteGest) {
        this.idClienteGest = idClienteGest;
    }

    public String getIdGestion() {
        return idGestion;
    }

    public void setIdGestion(String idGestion) {
        this.idGestion = idGestion;
    }

    public String getNombreGestiones() {
        return nombreGestiones;
    }

    public void setNombreGestiones(String nombreGestiones) {
        this.nombreGestiones = nombreGestiones;
    }

    public String getStatusGestion() {
        return statusGestion;
    }

    public void setStatusGestion(String statusGestion) {
        this.statusGestion = statusGestion;
    }
}
