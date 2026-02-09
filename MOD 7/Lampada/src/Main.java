public class Main {
    public static void main(String[] args) {
        // Criando o objeto 'minhaLampada'
        Lampada minhaLampada = new Lampada("Branca", 60);

        minhaLampada.mostrarStatus(); // Saída: ... está apagada.
        minhaLampada.ligar();         // Saída: A lâmpada está ligada.
        minhaLampada.mostrarStatus(); // Saída: ... está acesa.
    }
}