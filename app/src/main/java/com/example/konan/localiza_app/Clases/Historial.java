package com.example.konan.localiza_app.Clases;

/**
 * Created by konan on 13/06/2017.
 */

public class Historial {

    private String idCliente;
    private String fechaGestion;
    private String nombreGestion;
    private String resultadoGestion;
    private String urlFoto;

    public Historial() {
        super();
    }

    public Historial(String idCliente) {
        super();
        this.idCliente = idCliente;
    }

    public Historial(String idCliente, String fechaGestion, String nombreGestion, String resultadoGestion) {
        super();
        this.idCliente = idCliente;
        this.fechaGestion = fechaGestion;
        this.nombreGestion= nombreGestion;
        this.resultadoGestion= resultadoGestion;
    }
    public Historial( String fechaGestion, String nombreGestion, String resultadoGestion) {
        super();
        this.fechaGestion = fechaGestion;
        this.nombreGestion= nombreGestion;
        this.resultadoGestion= resultadoGestion;
    }

    public Historial(String idCliente, String fechaGestion, String nombreGestion, String resultadoGestion, String urlFoto) {
        super();
        this.idCliente = idCliente;
        this.fechaGestion = fechaGestion;
        this.nombreGestion= nombreGestion;
        this.resultadoGestion= resultadoGestion;
        this.urlFoto= urlFoto;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaGestion() {
        return fechaGestion;
    }

    public void setFechaGestion(String fechaGestion) {
        this.fechaGestion= fechaGestion;
    }

    public String getNombreGestion() {
        return nombreGestion;
    }

    public void setNombreGestion(String nombreGestion) {
        this.nombreGestion= nombreGestion;
    }

    public String getResultadoGestion() {
        return resultadoGestion;
    }

    public void setResultadoGestion(String resultadoGestion) {
        this.resultadoGestion = resultadoGestion;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto= urlFoto;
    }

}
