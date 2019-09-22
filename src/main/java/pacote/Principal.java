package pacote;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        //Telefone t = new Telefone();
        //t.update("a", "(48) 99175-6848");

       // t.add("pessoal", "9555");

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
        String no;
        String so;
        String da;
        String rotu;
        String nume;
        String indi;
        int indic;
        String ende;
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
                    no = teclado.nextLine();

                    System.out.println("Digite o sobrenome do contato que deseja adicionar");
                    so = teclado.nextLine();

                    System.out.println("Digite a data de nascimento do contato que deseja adicionar");
                    da = teclado.nextLine();

                    c.Contato(no, so, da);

                    a.addContato(c);
                    break;

                case "2":

                    System.out.println("Digite o nome do contato que deseja remover");
                    no = teclado.nextLine();

                    System.out.println("Digite o sobrenome do contato que deseja remover");
                    so = teclado.nextLine();

                    a.removeContato(no, so);
                    break;

                case "3":

                    System.out.println("Digite o rotulo do telefone que deseja adicionar");
                    rotu = teclado.nextLine();

                    System.out.println("Digite o numero de telefone que deseja adicionar");
                    nume = teclado.nextLine();

                    System.out.println("Digite o indice deseja adicionar");
                    indi = teclado.nextLine();

                    indic = Integer.parseInt(indi);

                    a.addTelefone(rotu, nume, indic);
                    break;

                case "4":

                    System.out.println("Digite o rotulo do email que deseja adicionar");
                    rotu = teclado.nextLine();

                    System.out.println("Digite o endereco de email que deseja adicionar");
                    ende = teclado.nextLine();

                    System.out.println("Digite o indice deseja adicionar");
                    indi = teclado.nextLine();

                    indic = Integer.parseInt(indi);

                    a.addEmail(rotu, ende, indic);
                    break;

                case "5":

                    System.out.println("Digite o rotulo do telefone que deseja atualizar");
                    rotu = teclado.nextLine();

                    System.out.println("Digite o numero de telefone que deseja atualizar");
                    nume = teclado.nextLine();

                    System.out.println("Digite o indice deseja adicionar");
                    indi = teclado.nextLine();

                    indic = Integer.parseInt(indi);

                    a.updateTelefone(rotu, nume, indic);
                    break;

                case "6":

                    System.out.println("Digite o rotulo do email que deseja atualizar");
                    rotu = teclado.nextLine();

                    System.out.println("Digite o endereco de email que deseja atualizar");
                    nume = teclado.nextLine();

                    System.out.println("Digite o indice deseja adicionar");
                    indi = teclado.nextLine();
                    indic = Integer.parseInt(indi);

                    a.updateEmail(rotu, nume, indic);
                    break;

                case "7":
                    System.out.println("Digite o rotulo do telefone que deseja remover");
                    rotu = teclado.nextLine();

                    System.out.println("Digite o indice deseja remover");
                    indi = teclado.nextLine();

                    indic = Integer.parseInt(indi);

                    a.removeTelefone(rotu, indic);
                    break;

                case "8":

                    System.out.println("Digite o rotulo do email que deseja remover");
                    rotu = teclado.nextLine();

                    System.out.println("Digite o indice deseja remover");
                    indi = teclado.nextLine();

                    indic = Integer.parseInt(indi);

                    a.removeEmail(rotu, indic);
                    break;

            }

        }
    }



}
