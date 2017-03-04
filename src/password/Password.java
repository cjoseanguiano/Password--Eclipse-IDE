/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.util.Scanner;

/**
 *
 * @author carlosjoseanguiano
 */
public class Password {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = "";
		String verificar = "";
		int contador = 0;

		Scanner paScanner = new Scanner(System.in);
		Scanner verificarScanner = new Scanner(System.in);

		System.out.println("Guarda tu contraseña");
		password = paScanner.nextLine();
		if ((password != null) && (!password.equals(""))) {
			do {

				System.out.println("Adivinar mi contraseña ");
				verificar = verificarScanner.nextLine();

				if (password.equals(verificar)) {
					System.out.println("Correcto");
					return;
				} else {
					contador++;
					if (contador>=3) {
						System.out.println("Perdiste los intentos");
						return;
					}
				}

			} while (password != verificar);
			System.out.println("Verifica la contraseña");
		}
		else {
			System.out.println("No ingresaste nada");
		}
	}

}