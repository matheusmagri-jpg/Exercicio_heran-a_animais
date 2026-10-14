public class TesteAnimais {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", "amarelo", "capim", 150, 12.5f, 4);
        Peixe tubarao = new Peixe("Tubarão", "barbatanas e cauda", 400, 11.0f);
        Mamifero urso = new Mamifero("Urso-do-canadá", "castanho", "mel", 200, 13.0f, 4);

        System.out.println("Zoo:");
        System.out.println("-------------------------------");
        camelo.dados();
        System.out.println("-------------------------------");
        tubarao.dados();
        System.out.println("-------------------------------");
        urso.dados();
        System.out.println("-------------------------------");
    }
}
