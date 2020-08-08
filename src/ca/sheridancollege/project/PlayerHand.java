/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public interface PlayerHand {
    public default ArrayList<Card> startHand(ArrayList<Card> deck) {
		ArrayList<Card> hand = new ArrayList<Card>();
		for (int x = 0; x < 7; x++) {
			hand.add(x, deck.get(x));
			deck.remove(x);
		}
		return hand;
		// creates hand for player
	}

	public default void draw(ArrayList<Card> hand, ArrayList<Card> deck) {
		hand.add(deck.get(0));
		deck.remove(0);
		// allows player to add card to hand
	}

	public default void draw2(ArrayList<Card> hand, ArrayList<Card> deck) {

		for (int x = 0; x < 2; x++) {
			hand.add(deck.get(0));
			deck.remove(0);
		}
		// allows player to add 2 cards to hand
	}

	public default void draw4(ArrayList<Card> hand, ArrayList<Card> deck) {

		for (int x = 0; x <= 4; x++) {
			hand.add(deck.get(0));
			deck.remove(0);
		}
		// allows player to add 4 cards to hand
	}

	public default void playcard(ArrayList<Card> hand, Card card) {
		hand.remove(card);
		// remove card from hand
	}
}
