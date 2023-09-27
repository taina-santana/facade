import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.printIn("Selecione o seu combo: ");
		System.out.printIn("1. Combo Master");
		System.out.printIn("2. Super Combo");
		System.out.print("Sua escolha: ");

		Scanner input = new Scanner(System.in);
		
		int tipo = input.nextInt();
		Combo combo = new Combo();
		combo.criarCombo(tipo);
		System.out.printIn(combo);

	}

}
