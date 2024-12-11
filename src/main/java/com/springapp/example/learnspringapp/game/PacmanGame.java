package com.springapp.example.learnspringapp.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("pac- up");
	}
	public void down() {
		System.out.println("pac -down");
	}
	public void left() {
		System.out.println("pac- left");
	}
	public void right() {
		System.out.println("pac-right");
	}
}
