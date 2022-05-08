package com.edu;

public class Human {
private Heart heart;

public Heart getHeart() {
	return heart;
}

public void setHeart(Heart heart) {
	this.heart = heart;
}
public void humanFunction() {
	if(heart!=null) {
		heart.pump();
	}
	System.out.println("Not Alive");
}
}
