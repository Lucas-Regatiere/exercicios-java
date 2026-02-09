public class Lampada {
    // Propriedades (Atributos)
    private String cor;
    private int potenciaWatts;
    private boolean ligada;

    // Construtor (Para criar a lâmpada com características específicas)
    public Lampada(String cor, int potenciaWatts) {
        this.cor = cor;
        this.potenciaWatts = potenciaWatts;
        this.ligada = false; // Por padrão, começa desligada
    }

    // Métodos Simples (Comportamentos)

    public void ligar() {
        ligada = true;
        System.out.println("A lâmpada está ligada.");
    }

    public void desligar() {
        ligada = false;
        System.out.println("A lâmpada está desligada.");
    }

    public void mostrarStatus() {
        String status = ligada ? "acesa" : "apagada";
        System.out.println("A lâmpada " + cor + " de " + potenciaWatts + "W está " + status + ".");
    }
}