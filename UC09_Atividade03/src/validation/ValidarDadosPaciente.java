

package validation;

//Os métodos aqui presentes fazem:
//1. Recebe como parametro o texto do usuário (tel, cpf ou data)
//2. Faz a verificação com "matches" usando Regex
//3. retorna resultado como true ou false

public class ValidarDadosPaciente {
    
    //Telefone - 93991001111
    public static boolean isTelefoneValido(String _tel) {
        return _tel.matches("[0-9]{11}");
    }
    
    //CPF - 000.000.00-2
    public static boolean isCpfValido(String _cpf) {
        return _cpf.matches("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");
    }
    
    //Data Consulta 00/00/00
    public static boolean isDataConsultaValido(String _data){
        return _data.matches("[0-9]{2}/[0-9]{2}/[0-9]{2}");
    }
        
}
