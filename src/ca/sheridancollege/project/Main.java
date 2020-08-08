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
public class Main {
    public static void main(String[] args) {
        	GroupOfCards deck = new GroupOfCards();
		deck.shuffle();
		Game game = new Game("Uno", deck.showCards());
		while (true) {
			for (int x = 0; x < 4; x++) {
				game.start(game.players.get(x));
				x = skip(game.players.get(x), game.discard);
				game.gameEnd(game.players.get(x));
			}
		}
	}

	public static int skip(Player player, ArrayList<Card> discard) {
		if (discard.get(discard.size() - 1).getNum().contentEquals("Skip")) {
			return player.getPlayerID();
		} else
			return player.getPlayerID() - 1;

	}
    }

