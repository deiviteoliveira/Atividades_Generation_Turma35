package br.com.generation.ClasseObjeto;

public class TesteProduto {
	
	public static void main(String[] args) {
        ProdutoEletronico p = new ProdutoEletronico();
        p.setModelo("Pc Asus");
        p.setCor("Ecru");
        p.setNumeroSeries(1234);
        p.setSaldo(2000.00);
        p.setPreco(1500.00);


        System.out.println(p.getModelo());
        System.out.println("cor do modelo:  " + p.getCor());
        System.out.println("Numero de Série: " + p.getNumeroSeries());
        System.out.println("Saldo Cliente R$" + p.getSaldo());
        System.out.println("Salto atual pós pagamento:" + p.getPreco());
		}

}
