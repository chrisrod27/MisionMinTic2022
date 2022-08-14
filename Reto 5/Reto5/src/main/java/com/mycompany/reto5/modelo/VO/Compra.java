package com.mycompany.reto5.modelo.VO;

public class Compra {
    
    private int id_compra;
    private String constructora;
    private String banco_vinculado;

    public Compra() {
    }

    public Compra(int id_compra, String constructora, String banco_vinculado) {
        this.id_compra = id_compra;
        this.constructora = constructora;
        this.banco_vinculado = banco_vinculado;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }

    @Override
    public String toString() {
        return "Compra{" + "id_compra=" + id_compra + ", constructora=" + constructora + ", banco_vinculado=" + banco_vinculado + '}';
    }
}
