package com.springapp.example.learnspringapp.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	private GamingConsole game;
	
	//private Mario game2;

	public GameRunner(GamingConsole game) {
		this.game=game;
	}
	
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
