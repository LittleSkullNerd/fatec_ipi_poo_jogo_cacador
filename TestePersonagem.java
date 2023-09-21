public class TestePersonagem {
    public static void main(String[] args) {
        //java 10(compilador): interferencia de tipos
        var p = new Personagem();
        p.nome = "José ";
        p.cacar();
        p.comer();
        p.sono();
    }
}
