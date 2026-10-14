public class Mamifero extends Animal {
    private String alimento;

    // Mamífero: ambiente "terra" por padrão
    public Mamifero(String nome, String cor, String alimento, int comprimento, float velocidade, int patas) {
        super(nome, cor, "terra", comprimento, velocidade, patas);
        this.alimento = alimento;
    }

    public void alteraAlimento(String alimento) { this.alimento = alimento; }

    // retorna o alimento preferido
    public String alimento() { return alimento; }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Alimento preferido: " + alimento);
    }
}
