public class Bebida extends Produto {
	
	private int ml;
	
	public Bebida(String descricao, double preco, int ml) {
		super(descricao, preco);
		this.ml = ml;
	}
	
	@Override
	public String getMedida() {
		return ml + "ml";
	}
	
}
