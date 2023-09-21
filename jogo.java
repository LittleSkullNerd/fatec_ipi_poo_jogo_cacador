import java.util.Random;
public class jogo {
    public  static void main(String[] args) throws Exception {
        var gerador = new Random();
        var personagem = new Personagem();
        personagem.nome = "John ";
        var soneca = new Personagem();
        //nasce com muito sono e sem energia. fome mais ou menos
        //ele tem probabilidade 80% de dormir
        //10% caçar
        //10% comer
        soneca.nome = "Soneca ";
        soneca.sono = 10;
        soneca.energia = 0;
        soneca.fome = 4;
        
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

            System.out.println("--------------------------------");

            var oQueOSonecaVaiFazer = gerador.nextDouble();
            if (oQueOSonecaVaiFazer <= 0.8)
                soneca.sono();
            else if (oQueOSonecaVaiFazer <= 0.9)
                soneca.comer();
            else
                soneca.cacar();
            System.out.printf(
            "e: %d, f: %d, s: %d\n",
            soneca.energia,
            soneca.fome,
            soneca.sono);
            System.out.println("********************************");
            Thread.sleep(8000);
        }
    }
}
