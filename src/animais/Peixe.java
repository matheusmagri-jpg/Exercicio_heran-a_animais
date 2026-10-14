public class Peixe extends Animal {
    private String caracteristica;

    // Peixe: 0 patas, ambiente "mar" e cor "cinzenta" por padrão
    public Peixe(String nome, String caracteristica, int comprimento, float velocidade) {
        super(nome, "cinzenta", "mar", comprimento, velocidade, 0);
        this.caracteristica = caracteristica;
    }

    public void alteraCaracteristica(String caracteristica) { this.caracteristica = caracteristica; }

    // retorna a característica de um determinado peixe
    public String caracteristica() { return caracteristica; }

    @Override
    public void dados() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}
