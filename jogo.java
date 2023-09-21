import java.util.Random;
public class jogo {
    public  static void main(String[] args) throws Exception {
        var gerador = new Random();
        var personagem = new Personagem("John");
        var soneca = new Personagem("Soneca", 0, 4, 10);
        //nasce com muito sono e sem energia. fome mais ou menos
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
            personagem.exibirEstado();
            Thread.sleep(8000);
            System.out.println("--------------------------------");

            var oQueOSonecaVaiFazer = gerador.nextDouble();
            if (oQueOSonecaVaiFazer <= 0.8)
                soneca.sono();
            else if (oQueOSonecaVaiFazer <= 0.9)
                soneca.comer();
            else
                soneca.cacar();
            soneca.exibirEstado();
            System.out.println("********************************");
            Thread.sleep(8000);
        }
    }
}
