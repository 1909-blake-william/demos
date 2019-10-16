package com.revature.s.generics;

import java.util.List;
import java.util.Scanner;

public class GenericDriver {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Tree<String> revature = new Tree<String>();
		Node<String> root = new Node<String>("Ravi");
		revature.setRoot(root);

		// managers
		Node<String> steve = new Node<String>("Steve");
		Node<String> karan = new Node<String>("Karan");
		Node<String> peter = new Node<String>("Peter");

		// trainers
		Node<String> carolyn = new Node<>("Carolyn");
		Node<String> adam = new Node<>("Adam");
		Node<String> blake = new Node<>("Blake");

		Node<String> nick = new Node<>("Nick");
		Node<String> wezley = new Node<>("Wezley");

		Node<String> andrew = new Node<>("Andrew");

		// associates
		Node<String> takumi = new Node<>("Takumi");
		Node<String> wyatt = new Node<>("Wyatt");
		Node<String> jae = new Node<>("Jae");

		blake.addChild(takumi);
		blake.addChild(wyatt);
		blake.addChild(jae);

		peter.addChild(blake);
		peter.addChild(carolyn);
		peter.addChild(adam);

		karan.addChild(andrew);

		steve.addChild(nick);
		steve.addChild(wezley);

		root.addChild(steve);
		root.addChild(karan);
		root.addChild(peter);

		navigate(root);

	}

	private static void navigate(Node<String> n) {
		while (true) {
			System.out.println("Node: " + n.getInformation());
			List<Node<String>> children = n.getChildren();
			if (children.size() == 0) {
				System.out.println("no children, go back? y/n");
				String selection = scan.nextLine();
				if (selection.equals("y")) {
					return;
				}
			} else {
				for (int i = 0; i < children.size(); i++) {
					System.out.println("Enter '" + i + "' to go to child: " + children.get(i).getInformation());
				}
				System.out.println("Enter 'b' to go back up");
				String selection = scan.nextLine();
				if (selection.equals("b")) {
					return;
				} else {
					try {
						int sel = Integer.parseInt(selection);
						if (sel >= 0 && sel < children.size()) {
							navigate(children.get(sel));
						} else {
							System.out.println("invalid selection");
						}
					} catch (NumberFormatException e) {
						System.out.println("invalid selection");
					}
				}
			}
		}
	}
}
