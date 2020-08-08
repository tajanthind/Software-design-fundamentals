/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public interface Turn extends DiscardPile{
    public default void playerTurn(Player player, ArrayList<Card> discard, ArrayList<Card> deck,
			ArrayList<Player> players) {
		Scanner scan = new Scanner(System.in);
		int userChoice = 0;
		int playerHand = player.hand.size();
		player.getPlayerID();
		System.out.println(player.showCards());
		if (discard.isEmpty()) {
			System.out.println(discard.toString());
		} else
			System.out.println(discard.get(discard.size() - 1));
		for (int x = 0; x < playerHand; x++) {
			System.out.println("Press " + x + " to play " + player.hand.get(x));
			// prints options for player
		}
		System.out.println("Press " + player.hand.size() + " to draw a card");
		userChoice = scan.nextInt();
		for (int x = 0; x <= userChoice; x++) {
			if (x == userChoice && x != player.hand.size()) {
				playingCard1(player, player.hand.get(x), discard, player.hand, players, deck);
				// plays card
			} else if (userChoice == player.hand.size()) {
				player.draw(player.hand, deck);
				break;
				// draws card
			}
		}
	}

}
