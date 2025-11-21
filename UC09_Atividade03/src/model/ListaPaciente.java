
package model;

import java.util.List;
import java.util.ArrayList;

public class ListaPaciente {
    
    private static final List<Paciente> lista = new ArrayList<>();
    
    public static List<Paciente> listar() {
        return lista;
    }
    
    public static void adicionar(Paciente p) {
        lista.add(p);  
    }
    
}
