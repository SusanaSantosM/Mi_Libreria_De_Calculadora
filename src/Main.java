import com.Susana.libreria.Entrada;
import com.Susana.libreria.Salida;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Float retorno = Calculadora.opcion(4,Entrada.VENTANA("Escriba el 1er número"),Entrada.VENTANA("Escriba el 2do número"));

        //Visualizamos el retorno
        if(retorno==null){
            JOptionPane.showMessageDialog(null,"Algo falla");
        }else
            Salida.VENTANA(retorno);
    }
}