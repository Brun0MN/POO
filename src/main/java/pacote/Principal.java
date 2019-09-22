package pacote;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


      //  Telefone t = new Telefone();
        //t.update("a", "(48) 99175-6848");

       // Email e = new Email();
       // e.update("pessoal", "brunomn9@hotmail.com");

       // Contato c = new Contato();
      //  c.Contato("Bruno", "Martins", "1997/12/23");


       // Agenda a = new Agenda();
        //a.addContato(c);

        Principal p = new Principal();

        p.menu();


    }


    public void menu(){
        Agenda a = new Agenda();
        Scanner teclado = new Scanner(System.in);
        while(true) {
            System.out.println("Digite um numero de 1 a 8 para selecionar uma das opcoes");
            System.out.println("1: Adicionar contato");
            System.out.println("2: Remover contato");
            System.out.println("3: Adicionar telefone");
            System.out.println("4: Adicionar Email");
            System.out.println("5: Atualizar Telefone");
            System.out.println("6: Atualizar Email");
            System.out.println("7: Remover Telefone");
            System.out.println("8: Remover Email");

            String s = teclado.nextLine();

            switch (s){
                case "1":
                    Contato c = new Contato();

                    System.out.println("Digite o nome do contato que deseja adicionar");
                    String no = teclado.nextLine();
                    no = teclado.nextLine();

                    System.out.println("Digite o sobrenome do contato que deseja adicionar");
                    String so = teclado.nextLine();
                    so = teclado.nextLine();

                    System.out.println("Digite a data de nascimento do contato que deseja adicionar");
                    String da = teclado.nextLine();
                    da = teclado.nextLine();

                    c.Contato(no, so, da);

                    a.addContato(c);

            }

        }
    }



}
