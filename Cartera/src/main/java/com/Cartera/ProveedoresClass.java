package com.Cartera;

public class ProveedoresClass {
    private int idpreoveedor;
    private double ingreso;
    private double egresos;
    private String compras;
    private int idcartera;
    private int idusuario;

    public int getIdpreoveedor() {
        return idpreoveedor;
    }

    public void setIdpreoveedor(int idpreoveedor) {
        this.idpreoveedor = idpreoveedor;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getEgresos() {
        return egresos;
    }

    public void setEgresos(double egresos) {
        this.egresos = egresos;
    }

    public String getCompras() {
        return compras;
    }

    public void setCompras(String compras) {
        this.compras = compras;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProveedoresClass that = (ProveedoresClass) o;

        if (idpreoveedor != that.idpreoveedor) return false;
        if (Double.compare(ingreso, that.ingreso) != 0) return false;
        if (Double.compare(egresos, that.egresos) != 0) return false;
        if (idcartera != that.idcartera) return false;
        if (idusuario != that.idusuario) return false;
        if (compras != null ? !compras.equals(that.compras) : that.compras != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idpreoveedor;
        temp = Double.doubleToLongBits(ingreso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(egresos);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (compras != null ? compras.hashCode() : 0);
        result = 31 * result + idcartera;
        result = 31 * result + idusuario;
        return result;
    }
}
