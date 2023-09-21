public class Personagem{

    //atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;
    //comportamentos (metódos)
    void cacar (){
       System.out.println(nome + "caçando..."); 
    }

    void comer(){
        System.out.println(nome + "comendo...");
    }

    void sono(){
        System.out.println(nome + "dormindo...");
    }

    

}