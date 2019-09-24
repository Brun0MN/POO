package pacote;

import java.util.ArrayList;

public class Agenda {

    // atributos

    ArrayList<Contato> l = new ArrayList<>();


    // metodos

    public void Agenda(){

    }

    public void addContato(Contato c){
       // if(l.contains(c) == false) l.add(c);
        l.add(c);

        System.out.println("LISTANDO:");
        for(Contato p : l){ // percorrendo um ArrayList
             System.out.println(p.getNome().toString());
        }
    }

    public void removeContato(String n, String s){
        for(Contato co: l){
            System.out.println("Contato: " + co.getNome());
            if((co.getNome().equals(n)) && (co.getSobrenome().equals(s))){
                l.remove(co);
                System.out.println("Contato removido!");
                return;
            }

        }
        System.out.println("Nenhum contato encontrado!");
    }


    public void addTelefone(String r, String n, int pIndex){
        int i = 1;
        for(Contato co: l){
            if(i == pIndex){
                co.addTelefone(r, n);
                break;
            }
            i++;
        }
    }

    public void addEmail(String r, String e, int pIndex){
        int i = 1;
        for(Contato co: l){
            if(i == pIndex){
                co.addEmail(r, e);
                break;
            }
            i++;
        }
    }

    public void updateTelefone(String r, String n, int pIndex){
        int i = 1;
        for(Contato co: l){
            if(i == pIndex){
                co.updateTelefone(r, n);
                break;
            }
            i++;
        }
    }

    public void updateEmail(String r, String e, int pIndex){
        int i = 1;
        for(Contato co: l){
            if(i == pIndex){
                co.updateEmail(r, e);
                break;
            }
            i++;
        }
    }

    public void removeTelefone(String r, int pIndex){
        int i = 1;
        for(Contato co: l){
            if(i == pIndex){
                co.removeTelefone(r);
                break;
            }
            i++;
        }
    }

    public void removeEmail(String r, int pIndex){
        int i = 1;
        for(Contato co: l){
            if(i == pIndex){
                co.removeEmail(r);
                break;
            }
            i++;
        }
    }

    public void listarContatos(){
        System.out.println("LISTANDO:");
        for(Contato c : l){ // percorrendo um ArrayList
            System.out.println(c.getNome());
        }


    }


}
