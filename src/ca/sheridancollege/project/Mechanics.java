/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public interface Mechanics {
    public default void reverse(ArrayList<Player> players) {
		Collections.reverse(players);
		for(int x = 0;x < players.size();x++) {
			players.get(x).setPlayerID(x);
		}
	}

	public default void changeColor(Card card, ArrayList<Card> discard) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What Color do you want to change to");
		System.out.println("Press 1 for Green");
		System.out.println("Press 2 for Blue");
		System.out.println("Press 3 for Red");
		System.out.println("Press 4 for Yellow");
		int x = scan.nextInt();
		switch (x) {
		case 1:
			discard.add(new Card("Green", "0"));
			break;
		case 2:
			discard.add(new Card("Blue", "0"));
			break;
		case 3:
			discard.add(new Card("Red", "0"));
			break;
		case 4:
			discard.add(new Card("Yellow", "0"));
			break;
		}
		System.out.println(discard.get(discard.size() - 1));
	}
}
