import java.util.Scanner;

public class Controler{
	public static void main(String[] arg) {
		Scanner scan= new Scanner (System.in);
		Calculadora calculadora = null;
		
		// instaciar uma calculadora
		while(true) {
			String line = scan.nextLine();
			System.out.println("$" + line);
			if (line.equals("end"))
					break;
			String ui[]= line.split(" ");
			if (ui[0].equals("help"))
					System.out.println("Soma_a_b; Status; div_a_b;carregar_valorr");
			else if (ui[0].equals("init")) {
				int val = Integer.parseInt(ui[1]); // ler valor inteiro
				// instaciar uma calculadora com bateria igual ao  valor lido
				calculadora = new Calculadora(val);
			}else if (ui[0].equals("Status")) {
				// imprime conteudo da calculadora
				System.out.println("Bateria = " + calculadora.getBattery());
			}else if(ui[0].equals("Carregar")) {
				calculadora.charge(Integer.parseInt(ui[1]));
			}else if (ui[0].equals("Soma")) {
				//Ler dois valores inteiros, calculaa soma e imprime o resultado;
				String result = calculadora.som(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
				System.out.println(result);
			}else if (ui[0].equals("Div")) {
				String result = calculadora.div(Integer.parseInt(ui[1]), Integer.parseInt(ui[2]));
				System.out.println(result);
			}else 
				System.out.println("Erro, comando invalido");
				
		}
	}
}

