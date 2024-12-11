package com.springapp.example.learnspringapp.game;

import org.springframework.stereotype.Component;


//Component is nothing but a class managed by spring framework
//@Component

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}

}
