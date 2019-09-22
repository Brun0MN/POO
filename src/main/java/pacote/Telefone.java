package pacote;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefone {

    // atributos

    private Map<String, String> dados = new HashMap<>();


    // metodos


    public String formata(String valor){
        Scanner teclado = new Scanner(System.in);
        MaskFormatter mask = null;
        String resultado = "";
        while(resultado == "") {
            try {
                mask = new MaskFormatter("(##) #####-####");
                resultado = mask.valueToString(valor);
            } catch (ParseException e) {
                e.printStackTrace();

                System.out.println("Ocorreu um erro!");
                System.out.println("Entrada '" + valor + "' invalida!");
                System.out.println("Digite novamente a entrada!");
                valor = teclado.nextLine();
            }
        }
        return resultado;
    }

    public void Telefone(){

    }

    public void add(String r, String n){
        if (dados.containsKey(r) == true) return;
        String num = formata(n);
        dados.put(r, num);

    }

    public void remove(String r){
        dados.remove(r);
    }

    public void update(String r, String n){

        String num = formata(n);
        dados.put(r, num);


    }



}
