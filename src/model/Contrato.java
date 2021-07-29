package model;

import java.util.ArrayList;


public class Contrato {
    private int codigoContrato;
    private Cliente cliente;
    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    private double valorContrato;
          

    public Contrato(Cliente cliente, int codContrato, double valor, ArrayList<Bicicleta> bicicletasContrato) {
    this.cliente = cliente;
        this.codigoContrato = codContrato;
        this.valorContrato = valor;
        this.bicicletas =  bicicletasContrato;
       }    
        
    public int getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(int codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    }

