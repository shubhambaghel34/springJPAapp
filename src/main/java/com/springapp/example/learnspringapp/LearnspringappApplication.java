package com.springapp.example.learnspringapp;

import java.lang.ModuleLayer.Controller;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springapp.example.learnspringapp.enterprise.mywebcontroller;
import com.springapp.example.learnspringapp.game.GameRunner;
import com.springapp.example.learnspringapp.game.GamingConsole;
import com.springapp.example.learnspringapp.game.MarioGame;
import com.springapp.example.learnspringapp.game.PacmanGame;
import com.springapp.example.learnspringapp.game.SuperContraGame;

@SpringBootApplication
public class LearnspringappApplication {

	public static void main(String[] args) {
		
		//MarioGame game= new MarioGame();
		//SuperContraGame game =new SuperContraGame();

		//this can be managed by spring
		
		//PacmanGame game =new PacmanGame();
        //GameRunner runner=new GameRunner(game);
		
		//auto-wire its basically spring identified as candidate and auto-wiring via constructor
//		GamingConsole game =new MarioGame();
//        GameRunner runner=new GameRunner(game);
		
		
		//spring application with context
		ConfigurableApplicationContext context = SpringApplication.run(LearnspringappApplication.class, args);
		
		//when spring manages the object/instance then we call it as beans
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
		//creating a bean for controller where we have auto-wired business class and database class
		mywebcontroller controller= context.getBean(mywebcontroller.class);
		System.out.println(controller.retrunBusinessValue());
		
	}

}
