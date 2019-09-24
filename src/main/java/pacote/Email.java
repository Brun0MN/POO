package pacote;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Email {

    //atributos

    private Map<String, String> dados = new HashMap<>();


    // metodos



    public String formata(String valor){
        Scanner teclado = new Scanner(System.in);
        MaskFormatter mask = null;
        String resultado = "";
        while(resultado == "") {
            try {
                mask = new MaskFormatter("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");  //MUDAR ISSO
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


    public void add(String r, String e){
        if (dados.containsKey(r) == true) return;
        String s = formata(e);
        dados.put(r, s);

    }

    public void remove(String r){

        dados.remove(r);
    }

    public void update(String r, String e){

        String num = formata(e);
        dados.put(r, num);

        //String str = dados.get(r);
        //System.out.println(str);


    }

}
