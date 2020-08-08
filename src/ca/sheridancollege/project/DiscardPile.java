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
public interface DiscardPile extends Mechanics{
    
	public default void playingCard1(Player player, Card card, ArrayList<Card> discard, ArrayList<Card> hand,
			ArrayList<Player> players, ArrayList<Card> deck) {
		if (discard.isEmpty()) {
			player.playcard(hand, card);
			discard.add(card);
			playingCard2(player, card, discard, hand, players, deck);
		} else if (card.getNum().contentEquals(discard.get(discard.size() - 1).getNum())) {
			player.playcard(hand, card);
			discard.add(card);
			playingCard2(player, card, discard, hand, players, deck);
			// allows card to be played if numbers match
		} else if (card.getColor().contentEquals(discard.get(discard.size() - 1).getColor())) {
			player.playcard(hand, card);
			discard.add(card);
			playingCard2(player, card, discard, hand, players, deck);
			// allows card to be played if colors match
		} else if (card.getColor().contentEquals("Wild")) {
			player.playcard(hand, card);
			discard.add(card);
			changeColor(card, discard);
			playingCard2(player, card, discard, hand, players, deck);
			// allows wild cards to be played
		}
	}

	public default void playingCard2(Player player, Card card, ArrayList<Card> discard, ArrayList<Card> hand,
			ArrayList<Player> players, ArrayList<Card> deck) {
		if (card.getNum().contentEquals("+4")) {
			if (player.getPlayerID() == 4) {
				players.get(0).draw4(hand, deck);
			} else
				players.get(player.getPlayerID()).draw4(hand, deck);
			// next player draws 4 cards
		} else if (card.getNum().contentEquals("Reverse")) {
			reverse(players);
			// reverses turn order
		} else if (card.getNum().contentEquals("+2")) {
			if (player.getPlayerID() == 4) {
				players.get(0).draw4(hand, deck);
			} else
				players.get(player.getPlayerID()).draw2(hand, deck);
			// next player draws 2 cards
		}
	}

	public default ArrayList<Card> clearPile(ArrayList<Card> discard) {
		return discard;
		// for converting pile to deck
	}

}
