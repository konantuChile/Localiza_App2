package com.example.konan.localiza_app.Clases;

import android.graphics.drawable.Drawable;

/**
 * Created by konan on 30/05/2017.
 */

public class Clientes {
    private String title;
    private String idCliente;
    private String nombreCliente;
    private String direccionCliente;
    private Drawable imagen;

    public Clientes() {
        super();
    }
    public Clientes(String idCliente, String nombreCliente, String direccionCliente,  Drawable imagen) {
        super();
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente= direccionCliente;
        this.imagen = imagen;
    }

    public Clientes(String nombreCliente, String direccionCliente) {
        super();
        this.nombreCliente = nombreCliente;
        this.direccionCliente= direccionCliente;
    }

    public String getTitle() {
        return title;
    }

    public void setTittle(String title) {
        this.title = title;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Drawable getImage() {
        return imagen;
    }

    public void setImagen(Drawable imagen) {
        this.imagen = imagen;
    }

    public String getIdCliente(){
        return idCliente;
    }

    public void setIdCliente(String categoryId) {
        this.idCliente = idCliente;
    }
    public String getDireccionCliente(){
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

}