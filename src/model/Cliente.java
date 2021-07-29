package model;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String CPF;
    private int codigo;
    private String telefone;
    private ArrayList<Contrato> contratos = new ArrayList<>();
        
   
    public Cliente(int codCliente, String nome, String CPF, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.codigo = codCliente;        
    }  
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Contrato> getContratos() {
        return contratos;
    }

    public void setContratos(ArrayList<Contrato> contratos) {
        this.contratos = contratos;
    }

  
    
}
