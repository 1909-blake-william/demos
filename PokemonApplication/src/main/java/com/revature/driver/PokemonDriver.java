package com.revature.driver;

import java.util.Scanner;

import com.revature.models.Pokemon;
import com.revature.models.PokemonType;

public class PokemonDriver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		PokemonType[] types = new PokemonType[7];
		types[0] = new PokemonType(1, "Bug", null, null);
		types[1] = new PokemonType(2, "Fire", null, null);
		types[2] = new PokemonType(3, "Ghost", null, null);
		types[3] = new PokemonType(4, "Water", null, null);
		types[4] = new PokemonType(5, "Flying", null, null);
		types[5] = new PokemonType(6, "Grass", null, null);
		types[6] = new PokemonType(7, "Electric", null, null);
		
		types[0].setResistances(new PokemonType[] {types[5]});
		types[0].setWeaknesses(new PokemonType[] {types[4], types[1]});
		
		types[1].setResistances(new PokemonType[] {types[1], types[5], types[0]});
		types[1].setWeaknesses(new PokemonType[] {types[3]});
		
		types[2].setResistances(new PokemonType[] {types[0], types[2]});
		types[2].setWeaknesses(new PokemonType[] {types[2]});
		
		types[3].setResistances(new PokemonType[] {types[1], types[3]});
		types[3].setWeaknesses(new PokemonType[] {types[5], types[6]});
		
		types[4].setResistances(new PokemonType[] {types[5], types[0]});
		types[4].setWeaknesses(new PokemonType[] {types[6]});
		
		types[5].setResistances(new PokemonType[] {types[5], types[3], types[6]});
		types[5].setWeaknesses(new PokemonType[] {types[1], types[0], types[4]});
		
		types[6].setResistances(new PokemonType[] {types[4], types[6]});
		types[6].setWeaknesses(new PokemonType[] {});
		
		while(true) {
			System.out.println("Welcome, please choose an option");
			System.out.println("Enter 1 to view pokemon");
			System.out.println("Enter 2 to create pokemon");
			System.out.println("Enter 3 to free pokemon");
			
			// get user input
			String selection = scan.nextLine();
			
			switch (selection) {
			case "1":
				System.out.println("view all not yet implemented");
				break;
			case "2":
				System.out.println("Enter pokemon name: ");
				String name = scan.nextLine();
				System.out.println("Select pokemon type from the following: ");
					for(int i = 0; i < types.length; i++) {
						System.out.println("Enter " + i + " for " + types[i]);
					}
				int typeSelection = scan.nextInt();
				PokemonType type = types[typeSelection];
				scan.reset(); // reset scanner after getting numbers
				
				System.out.println("Enter health points");
				int healthPoints = scan.nextInt();
				scan.reset();
				
				System.out.println("Enter level");
				int level = scan.nextInt();
				scan.reset();
				
				Pokemon p = new Pokemon(1, name, level, healthPoints, type, null);
				System.out.println(p);
				break;
			case "3":
				System.out.println("free not yet implemented");
				break;
			default:
				System.out.println("invalid selection, try again.");
				break;
			}
		}
	}
}
