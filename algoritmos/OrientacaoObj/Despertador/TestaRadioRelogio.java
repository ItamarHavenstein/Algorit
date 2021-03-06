package Despertador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestaRadioRelogio {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("HH:mm");

		List<RadioRelogio> radios = new ArrayList();
		List<RadioRelogio> desperta = new ArrayList();

		int inicio = 0;
		while (inicio == 0) {
			System.out.println("Aperte 1 para ligar");
			int aperte = scanner.nextInt();
			if (aperte != 1) {
				System.out.println("OPção invalidada");
			}
			while (aperte == 1) {
				System.out.println("Bem Vindo ao seu Rádio\n");
				System.out.println("Menu \n1-Rádio \n2-Relógio\n3-Info\n0-Desligar");
				int menu = scanner.nextInt();
				int submenu = 1;
				while (submenu != 0) {
					if (menu == 1) {
						System.out.println("1-Inserir 5 Estações   \n 0-Voltar");
						submenu = scanner.nextInt();
						if (submenu == 1) {
							System.out.println("Digite O nome da Estação");
							String nome = scanner.next();
							System.out.println("Digite o tipo da Estação AM ou FM");
							String tipo = scanner.next();
							radios.add(new RadioRelogio(nome, tipo));
						}
						if (submenu == 3) {
							System.out.println("Defina o Volume(0 à 10).");
							int vol = scanner.nextInt();
							RadioRelogio volume = new RadioRelogio(vol);
						}
					}
					if (menu == 2) {
						System.out.println("\n1-Alterar Hora \n2-Despertador \n3- Volume \n0-Voltar");
						submenu = scanner.nextInt();
						if (submenu == 1) {
							System.out.println("Digite a hora correta(hh:mm).");
							String hora = scanner.next();
							Date date = df.parse(hora);
							RadioRelogio horas = new RadioRelogio(date);
						}
						if (submenu == 2) {
							System.out.println("Ajustar hora para despertar");
							String despertar = scanner.next();
							Date data1 = df.parse(despertar);
							RadioRelogio despertas = new RadioRelogio();
							despertas.setHorarioAlarme(data1);
							desperta.add(despertas);
						}
						if (submenu == 3) {
							System.out.println("Ajustar volume(0 à 10).");
							int volrelogio = scanner.nextInt();
							RadioRelogio relogiovol = new RadioRelogio();
							relogiovol.setVolumeRelogio(volrelogio);
						}
					}
					if (menu == 3) {
						System.out.println("1-Estações salvas\n2-Despertador\n0-Voltar");
						submenu = scanner.nextInt();
						if (submenu == 1) {
							for (RadioRelogio radioRelogio : radios) {
								System.out.println(radioRelogio.info());
							}
						}
						if (submenu == 2) {
							for (RadioRelogio radioRelogio : desperta) {
								System.out.println("Hora para despertar  " + radioRelogio.infodesperta());
							}
						}
					}
				}
			}
		}
		scanner.close();
	}
}
