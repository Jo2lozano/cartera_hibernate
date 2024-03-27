package com.Cartera;

import java.sql.Date;

public class CarteraClass {
    private int idcartera;
    private int idusuario;
    private double saldo;
    private Date fecha;

    public int getIdcartera() {
        return idcartera;
    }

    public void setIdcartera(int idcartera) {
        this.idcartera = idcartera;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarteraClass that = (CarteraClass) o;

        if (idcartera != that.idcartera) return false;
        if (idusuario != that.idusuario) return false;
        if (Double.compare(saldo, that.saldo) != 0) return false;
        if (fecha != null ? !fecha.equals(that.fecha) : that.fecha != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idcartera;
        result = 31 * result + idusuario;
        temp = Double.doubleToLongBits(saldo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        return result;
    }
}
