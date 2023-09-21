public class jogo {
    public  static void main(String[] args) throws Exception {
        var personagem = new Personagem();
        personagem.nome = "John ";
        while(true){
            personagem.cacar();
            personagem.comer();
            personagem.sono();


            Thread.sleep(8000);
            System.out.println("********************************");
        }
    }
    
}
