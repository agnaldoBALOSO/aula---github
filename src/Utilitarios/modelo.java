package Utilitarios;

public class modelo {
 
    public static void main (String [] args) {
        exibirCabecalho();
        exibirMenu();
        exibirMensagemFinal();
     
    }

    public static void exibirCabecalho() {
    System.out.println ("=========================");
    System.out.println ("       SISTEMA ACADEMICO");
    System.out.println ("=========================");

    }

    public static void exibirMenu () {

        System.out.println ("1 - Cadastrar Aluno ");
        System.out.println ("2 - Consultar Aluno");
        System.out.println ("3 - Sair");
        System.out.println ("======================");

    }

    public static void exibirMensagemFinal(){

        System.out.println ("Programa Encerrado!");
        System.out.println ("========================");
    }


}

