package exercicios.CondeInter;
/*5. Peça para o usuário digitar a idade e ano de nascimento. Pegue os valores que o usuário digitou. 
 * Verifique se a idade digitada condiz com o ano de nascimento do usuário, ou seja, se realmente ele tem 
 * a idade que disse ter. Caso sim imprima “Você não mentiu para mim”, caso contrário, 
 * imprima “Você mentiu para mim, você não é mais meu amigo”.*/

import java.util.Scanner;

public class Item5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		System.out.print("Digite sua idade: ");
		idade = scanner.nextInt();
		int Ano;
		System.out.print("Digite o ano de seu nascimento: ");
		Ano = scanner.nextInt();
		int Subt = 2017 - Ano;
		if(Subt == idade){
			System.out.println("Você não mentiu pra mim");
		}else{
			System.out.println("Você mentiu para mim, você não é mais meu amigo");
		}
		scanner.close();
	}
}
