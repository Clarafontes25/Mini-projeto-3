import java.util.Scanner; 

public class Capitulo{

    String nome;
    String texto;
    String escolha1;
    String escolha2;
    Personagem perso;
    int alterarEnergia;
    Scanner input;

    Capitulo(String nome, 
             String texto, 
             String escolha1, 
             String escolha2, 
             Personagem perso, 
             int alterarEnergia, 
             Scanner input){

        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.perso = perso;
        this.alterarEnergia = alterarEnergia;
        this.input = input;
    }

    void mostrar(){
        System.out.println(this.texto);
        System.out.println(this.escolha1);
        System.out.println(this.escolha2);
        this.perso.alterarEnergia(this.alterarEnergia);
    }

    int opcao(){
        int resultado = 0;
        if (this.escolha1 != null && this.escolha2 != null){
                String receba = input.nextLine();
                if(receba.equalsIgnoreCase(escolha1)){
                    resultado = 1;
                } else if(receba.equalsIgnoreCase(escolha2)) {
                    resultado = 2;
                }

        } 

                return resultado;
    }
}
