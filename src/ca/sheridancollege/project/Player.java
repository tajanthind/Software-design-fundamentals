/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author dancye, 2018
 */
public  class Player implements PlayerHand
{
   private int playerID;
	private String playerName;
	ArrayList<Card> hand = new ArrayList<Card>();

	public Player(int playerID, String playerName, ArrayList<Card> hand) {
		this.hand = startHand(hand);
		this.playerID = playerID;
		this.playerName = playerName;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String setPlayerName(String name) {
		return playerName = name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

	public int getPlayerID() {
		return playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public ArrayList<Card> showCards() {
		return hand;
	}
}
