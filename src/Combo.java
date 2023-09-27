import java.util.ArrayList;

public class Combo {
	
	ArrayList<Produto> produtos = new ArrayList<>();
	
	public void criarCombo(int tipo) {
		
		if(tipo == 1) {
			produtos.add(new Sobremesa("Danoninho", "Pequeno"));
            produtos.add(new Burguer("X salada", 12, 200));
		    produtos.add(new Bebida("Fanta laranja", 5, 250));


		} if(tipo ==2) {
		
        produtos.add(new Sobremesa("Sorvete", "Grande"));
		produtos.add(new Burguer("X tudo", 20, 350));
		produtos.add(new Bebida("Coca", 10, 250));
        }
	}
	
	@Override
	public String toString() {
		String  combo = "";
		
		for (Produto produto: produtos) {
			combo += produto.toString() + "\n";
		}
		
		return combo;
	}
}
