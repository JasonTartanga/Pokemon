package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int opc;
		do {
			String[] movimientosCharizard = { "Lanzallamas", "Ataque Ala", "Respiro", "Fuego Fatuo" };
			String[] pokemons = { "Charizard", "Greninja", "Decidueye" };
			String[] opciones = { "Cambiar Pokemon", "Atacar" };

			opc = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "nombrePokemon", 0, 3, null, opciones,
					0);

			switch (opc) {
			case 0:
				cambiarPokemon(movimientosCharizard, pokemons, opciones);
				break;
			case 1:
				atacar(movimientosCharizard, pokemons, opciones);
				break;
			case -1:
				JOptionPane.showMessageDialog(null, "Eres un pussy");
				break;
			default:
				break;
			}
		} while (opc != -1);
	}

	private static void atacar(String[] movimientosCharizard, String[] pokemons, String[] opciones) {
		int opc2;
		opc2 = JOptionPane.showOptionDialog(null, "", "¿A que pokemon quieres cambiar?", 0, -1, null,
				movimientosCharizard, 0);

		switch (opc2) {
		case 0:
			JOptionPane.showMessageDialog(null, "Has usado ataque1");
			return;
		case 1:
			JOptionPane.showMessageDialog(null, "Has usado ataque2");
			return;
		case 2:
			JOptionPane.showMessageDialog(null, "Has usado ataque3");
			return;
		case 3:
			JOptionPane.showMessageDialog(null, "Has usado ataque4");
			return;
		case -1:
		default:
			return;
		}
	}

	private static void cambiarPokemon(String[] movimientosCharizard, String[] pokemons, String[] opciones) {
		int opc1;
		opc1 = JOptionPane.showOptionDialog(null,
				"Pokemon1: nombre\nPS1: nombre\nPokemon2: nombre\nPS2: nombre\nPokemon3: nombre\nPS3: nombre",
				"¿A que pokemon quieres cambiar?", 0, 3, null, pokemons, 0);

		switch (opc1) {
		case 0:
			JOptionPane.showMessageDialog(null, "Has sacado a Pokemon1");
			return;
		case 1:
			JOptionPane.showMessageDialog(null, "Has sacado a Pokemon2");
			return;
		case 2:
			JOptionPane.showMessageDialog(null, "Has sacado a Pokemon3");
			return;
		case -1:
		default:
			return;

		}
	}
}
