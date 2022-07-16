package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 500;
    static final int HEIGHT = 750;
    PImage background;
    PImage bird;
    PImage bottomPipe;
    PImage topPipe;
    int y = HEIGHT / 2;
    int birdYVelocity = 0;
	int gravity = 1;
	int pipeX = 500;
	int topPipeY = (int)random(0, );

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	background = loadImage("flappyBackground.jpg");
    	bird = loadImage("bird.png");
    	bird.resize(50, 50);
    	bottomPipe = loadImage("bottomPipe.png");
    	topPipe = loadImage("topPipe.png");
    	
    }

    @Override
    public void draw() {
    	
    	background(background);
    	fill(255, 255, 0);
    	stroke(255, 255, 255);
    	int x = WIDTH / 4;
    	
    	
    	image(bottomPipe, pipeX , pipeY);
    	pipeX -= 1;
    	image(topPipe, pipeX, pipeY);
    	if (pipeX < -50) {
    		pipeX = 500;
    	}
    	
    	
    	
    	if (mousePressed) {
    		birdYVelocity = -10;
    		
    		
    		 
    	}
    	birdYVelocity = birdYVelocity + gravity;
		y = y + birdYVelocity;
		image(bird, x, y );	

    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
