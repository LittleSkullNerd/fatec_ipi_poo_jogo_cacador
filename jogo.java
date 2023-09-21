import java.util.Random;
public class jogo {
    public  static void main(String[] args) throws Exception {
        var gerador = new Random();
        var personagem = new Personagem();
        personagem.nome = "John ";
        var soneca = new Personagem();
        personagem.nome = "Luciana";
        //nasce com muito e sem energia. fome mais ou menos
        //ele tem probabilidade 80% de dormir
        //10% caçar
        //10% comer
        while(true){
            int oQueFazer = gerador.nextInt(3); //[0..3[
            switch(oQueFazer) {
                case 1:
                personagem.cacar();
                break;
                case 2:
                personagem.comer();
                break;
                case 3:
                personagem.sono();
                break;
            }
            System.out.printf(
            "e: %d, f: %d, s: %d\n",
            personagem.energia,
            personagem.fome,
            personagem.sono);
            Thread.sleep(8000);
            System.out.println("********************************");
           
        }
    }
}
