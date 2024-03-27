package com.Cartera;

public class UsuarioClass {
    private int idusuario;
    private int identificacion;
    private int telefono;

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsuarioClass that = (UsuarioClass) o;

        if (idusuario != that.idusuario) return false;
        if (identificacion != that.identificacion) return false;
        if (telefono != that.telefono) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idusuario;
        result = 31 * result + identificacion;
        result = 31 * result + telefono;
        return result;
    }
}
