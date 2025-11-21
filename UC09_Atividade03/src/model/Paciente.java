
package model;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class Paciente {
    
    private String nome;
    private String telefone;
    private String cpf;
    private String dataConsulta;
    private boolean isPaciente;
    
    //Construtor
    public Paciente(String _nome, String _tel, String _cpf, String _data, boolean _paciente) {
        this.nome=_nome;
        this.telefone=_tel;
        this.cpf=_cpf;
        this.dataConsulta=_data;
        this.isPaciente=_paciente;
    }
    
    //Get
    public String getNome() {
        return nome;
    }
    
    public String getTelefone() {
        return telefone;}
    
    public String getCpf(){
        return cpf;
    }
    
    public String getDataConsulta(){
        return dataConsulta;
    }
    
    public boolean getIsPaciente(){
        return isPaciente;
    }
    
    //Set
    public void setNome(String _nome){
        this.nome=_nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public void setIsPaciente(boolean isPaciente) {
        this.isPaciente = isPaciente;
    }
    
    
    //Mostar dados
    public void mostarDadosPaciente(){
        JOptionPane.showMessageDialog(null, 
                "Nome: " + nome
                + "Telefone: " + telefone
                + "CPF: " + cpf
                + "Data da Consulta: " + dataConsulta);
    }
    
    
}
