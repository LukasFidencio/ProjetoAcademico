package model;

import java.util.ArrayList;

public class Bicicleta {

    private int codBicicleta;
    private String cor;
    private String tipo;
    private int marchas;
    private double valorAluguel;
    private ArrayList<Contrato> contratos = new ArrayList<>();

    //Construtor Personalizado.
    public Bicicleta(int codBicicleta, String cor, String tipo, int marchas, double aluguel) {
        this.codBicicleta = codBicicleta;
        this.cor = cor;
        this.marchas = marchas;
        this.valorAluguel = aluguel;
        this.tipo = tipo;
    }

    
    public int getCodBicicleta() {
        return codBicicleta;
    }

    public void setCodBicicleta(int codBicicleta) {
        this.codBicicleta = codBicicleta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }

    public double getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }
}
