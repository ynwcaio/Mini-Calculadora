package Controller;

import static View.Inicio_GUI.r_txt;
import static View.Inicio_GUI.valor1_txt;
import static View.Inicio_GUI.valor2_txt;
import java.awt.Color;

public class Calcula_DAO {
    public static double v1, v2 , r;
    //> metodo construtor
    //> torne as variáveis publicas e globais
    public static void soma(){
        //>TextField convertido
        v1 = Double.parseDouble(valor1_txt.getText());
        v2 = Double.parseDouble(valor2_txt.getText());
        r = v1+v2;
        //>Seta o valor das variáveis
        valor1_txt.setText("");
        valor2_txt.setText("");
        //> Converte o Double em uma String novamente
        r_txt.setText(String.valueOf(r));
}
    
    public static void subtracao(){
        v1 = Double.parseDouble(valor1_txt.getText());
        v2 = Double.parseDouble(valor2_txt.getText());
        r = v1-v2;
        valor1_txt.setText("");
        valor2_txt.setText("");
        r_txt.setText(String.valueOf(r));    
    }
    public static void divisao(){
        v1 = Double.parseDouble(valor1_txt.getText());
        v2 = Double.parseDouble(valor2_txt.getText());
        r = v1/v2;
        valor1_txt.setText("");
        valor2_txt.setText("");
        r_txt.setText(String.valueOf(r));
        
    }
    public static void multiplicacao(){
        v1 = Double.parseDouble(valor1_txt.getText());
        v2 = Double.parseDouble(valor2_txt.getText());
        r = v1*v2;
        valor1_txt.setText("");
        valor2_txt.setText("");
        r_txt.setText(String.valueOf(r));  
    }
    
}
