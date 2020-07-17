
package ca.sheridancollege.project;


public abstract class Card 
{
    private String color;
	private String num;
	public Card(String color, String num) {
		this.num = num;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public String getNum() {
		return num;
	}
	@Override
	public String toString() {
		return this.color +" "+ this.num ;
	}

}
