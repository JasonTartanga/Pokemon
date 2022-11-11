package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc;
		int sacar = 0;

		Movimientos movimientos = new Movimientos();
		Pokemons pokemon = new Pokemons();

		do {

			opc = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", pokemon.pokemons[sacar], 0, 3, null,
					pokemon.opciones, 0);

			switch (opc) {
			case 0:
				sacar = cambiarPokemon(sacar, pokemon.pokemons, pokemon.opciones);
				break;
			case 1:
				atacar(sacar, pokemon.pokemons, pokemon.opciones, movimientos.charizard, movimientos.greninja,
						movimientos.decidueye);
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "Eres un pussy");
				break;
			default:
				break;
			}
		} while (opc != -1);
	}

	private static void atacar(int sacar, String[] pokemons, String[] opciones, String[] charizard, String[] greninja,
			String[] decidueye) {

		int opc2;

	
		if (sacar == 0) {
			opc2 = JOptionPane.showOptionDialog(null, "", "¿Que movimiento quieres usar?", 0, -1, null, charizard, 0);
			switch (opc2) {
			case 0:
				JOptionPane.showMessageDialog(null, "Has usado " + charizard[opc2]);
				return;
			case 1:
				JOptionPane.showMessageDialog(null, "Has usado" + charizard[opc2]);
				return;
			case 2:
				JOptionPane.showMessageDialog(null, "Has usado" + charizard[opc2]);
				return;
			case 3:
				JOptionPane.showMessageDialog(null, "Has usado " + charizard[opc2]);
				return;
			case -1:
			default:
				return;
			}
		} else if (sacar == 1) {
			opc2 = JOptionPane.showOptionDialog(null, "", "¿Que movimiento quieres usar?", 0, -1, null, greninja, 0);
			switch (opc2) {
			case 0:
				JOptionPane.showMessageDialog(null, "Has usado " + greninja[opc2]);
				return;
			case 1:
				JOptionPane.showMessageDialog(null, "Has usado" + greninja[opc2]);
				return;
			case 2:
				JOptionPane.showMessageDialog(null, "Has usado" + greninja[opc2]);
				return;
			case 3:
				JOptionPane.showMessageDialog(null, "Has usado " + greninja[opc2]);
				return;
			case -1:
			default:
				return;
			}
		} else {
			opc2 = JOptionPane.showOptionDialog(null, "", "¿Que movimiento quieres usar?", 0, -1, null, decidueye, 0);
			switch (opc2) {
			case 0:
				JOptionPane.showMessageDialog(null, "Has usado " + decidueye[opc2]);
				return;
			case 1:
				JOptionPane.showMessageDialog(null, "Has usado" + decidueye[opc2]);
				return;
			case 2:
				JOptionPane.showMessageDialog(null, "Has usado" + decidueye[opc2]);
				return;
			case 3:
				JOptionPane.showMessageDialog(null, "Has usado " + decidueye[opc2]);
				return;
			case -1:
			default:
				return;
			}
		}

	}

	private static int cambiarPokemon(int sacar, String[] pokemons, String[] opciones) {
		int opc1;
		opc1 = JOptionPane.showOptionDialog(null,
				pokemons[0] + "\nPS: \n" + pokemons[1] + "\nPS: \n" + pokemons[2] + "\nPS: \n",
				"¿A que pokemon quieres cambiar?", 0, 3, null, pokemons, 0);

		switch (opc1) {
		case 0:
			JOptionPane.showMessageDialog(null, "Has sacado a Charizard");
			sacar = 0;
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Has sacado a Greninja");
			sacar = 1;
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Has sacado a Decidueye");
			sacar = 2;
			break;
		case -1:
		default:
			break;
		}
		return sacar;
	}
}
