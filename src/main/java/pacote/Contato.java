package pacote;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

public class Contato {

    //atributos

    public String nome;
    public String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefone;
    private Email email;


    //metodos



    public String formata(String mascara, String valor){
        Scanner teclado = new Scanner(System.in);
        String resultado = "";
        while (resultado == "") {
            MaskFormatter mask = null;

            try {
                mask = new MaskFormatter(mascara);
                //   mask.setValueContainsLiteralCharacters(false);
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



    public void Contato(String n, String s, String d){

        String nom = formata("??????????????", n);
        String sob = formata("??????????????", s);
        String dat = formata("####/##/##", d);


        int ano = Integer.parseInt(dat.substring(0,4));
        int mes = Integer.parseInt(dat.substring(5,7));
        int dia = Integer.parseInt(dat.substring(8,10));

        //System.out.println(ano);
        //System.out.println(mes);
        //System.out.println(dia);

        this.nome = nom;
        this.sobrenome = sob;
        this.dataNasc = LocalDate.of(ano, mes, dia);

    }


    public void addTelefone(String r, String n){
        Telefone t = new Telefone();
        t.add(r, n);

    }

    public void addEmail(String r, String e){
        Email em = new Email();
        em.add(r, e);

    }

    public void removeTelefone(String r){
        Telefone t = new Telefone();
        t.remove(r);
    }

    public void removeEmail(String r){
        Email em = new Email();
        em.remove(r);
    }

    public void updateTelefone(String r, String n){
        Telefone t = new Telefone();
        t.update(r, n);
    }

    public void updateEmail(String r, String e){
        Email em = new Email();
        em.update(r, e);
    }


}
