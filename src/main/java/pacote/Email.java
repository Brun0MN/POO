package pacote;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

public class Email {

    //atributos

    private Map<String, String> dados = new HashMap<>();


    // metodos



    public String formata(String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$");
            resultado = mask.valueToString(valor);
        }

        catch (ParseException e) {
            e.printStackTrace();
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
