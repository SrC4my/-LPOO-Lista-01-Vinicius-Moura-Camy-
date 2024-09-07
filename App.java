public class App {
    public static void main(String[] args) {
       
        Carro carro = new Carro("Fiat", "Uno", 2020);
        carro.exibirInformacoes();  
        carro.ligar();  

        Moto moto = new Moto("Honda", "CG 150", 2010, 250);
        moto.exibirInformacoes();
        moto.exibirCilindradas();  
        moto.ligar();  

        
        Veiculo[] veiculos = { carro, moto };

        
        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
        }
    }
}
