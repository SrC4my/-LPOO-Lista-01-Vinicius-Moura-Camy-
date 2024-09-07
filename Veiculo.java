public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String tipo;

   
    public Veiculo(String marca, String modelo, int ano, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

    public void exibirTipo() {
        System.out.println("Tipo de Veículo: " + tipo);
    }

   
    public void exibirInformacoes() {
        System.out.println(
            "Marca: " + marca + 
            ", Modelo: " + modelo + 
            ", Ano: " + ano
        );
    }

   
    public abstract void ligar();
}
