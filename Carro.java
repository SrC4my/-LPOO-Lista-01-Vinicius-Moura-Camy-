public class Carro extends Veiculo {

    
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano, "Carro");  // Chama o construtor da classe Veiculo
    }

    @Override
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
}
