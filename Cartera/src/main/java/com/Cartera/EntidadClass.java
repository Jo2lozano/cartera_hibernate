package com.Cartera;

public class EntidadClass {
    private int identidad;
    private int idcartera;
    private String transaccion;

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public int getIdcartera() {
        return idcartera;
    }

    public void setIdcartera(int idcartera) {
        this.idcartera = idcartera;
    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntidadClass that = (EntidadClass) o;

        if (identidad != that.identidad) return false;
        if (idcartera != that.idcartera) return false;
        if (transaccion != null ? !transaccion.equals(that.transaccion) : that.transaccion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identidad;
        result = 31 * result + idcartera;
        result = 31 * result + (transaccion != null ? transaccion.hashCode() : 0);
        return result;
    }
}
