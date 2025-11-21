
package controller;

import javax.swing.JOptionPane;
import model.ListaPaciente;
import model.Paciente;
import validation.ValidarDadosPaciente;

public class PacienteController {
    
    
    //Os métodos aqui presentes fazem:
    //1. Verifica a formatação dos datos
    //2. Realiza o cadastro do cliente
    
    public static boolean cadastrarPaciente(String _nome, String _tel, String _cpf, String _dataConsulta, boolean _isCliente) {
        
        //Verifica se todos os dados foram preenchidos
        if(_nome.isEmpty() || _tel.isEmpty() || _cpf.isEmpty() || _dataConsulta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todods os campos.");
            return false;

        //Verifica se dados estão corretos
        } else {

            //Telefone
            if(!ValidarDadosPaciente.isTelefoneValido(_tel)){
                JOptionPane.showMessageDialog(null, "Informe um telefone com 11 dígitos");
                return false;
            }

            //Cpf
            if(!ValidarDadosPaciente.isCpfValido(_cpf)) {
                JOptionPane.showMessageDialog(null, "Informe um CPF correto\nEx.: 000.000.000-00");
                return false;
            }

            //Data
            if(!ValidarDadosPaciente.isDataConsultaValido(_dataConsulta)==true){
                JOptionPane.showMessageDialog(null, "Informe uma data correta.\nEx.: 00/00/00");
                return false;
            }
            
        }
        
        //cadastra o cliente
        Paciente novo = new Paciente(_nome, _tel, _cpf, _cpf, _isCliente);
        ListaPaciente.adicionar(novo);

        //Retorna que tudo deu certo
        //caso não as informações não tenha caido em nenhuma das condições acima,
        //trocando o valor de "true" para "false".
        return true;
    }
    
    //Não é IA
}
