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
	int topPipeY = (int)random(-125, 1);
	int pipeHeight = 400;
	int pipeSpace = topPipeY + pipeHeight + 100;
	int x = WIDTH / 4;
	
	

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
    	
    	image(topPipe, pipeX, topPipeY, 50, pipeHeight);
    	image(bottomPipe, pipeX , pipeSpace, 50, pipeHeight);
    	pipeX -= 5;
    	
    	if (pipeX < -50) {
    		pipeX = 500;
    		topPipeY = (int)random(-125, 1);
    		pipeSpace = topPipeY + pipeHeight + 100;
    	}
    	
    	
    	
    	if (mousePressed) {
    		birdYVelocity = -10;
    		
    		
    		 
    	}
    	birdYVelocity = birdYVelocity + gravity;
		y = y + birdYVelocity;
		image(bird, x, y );	
		
		
	}
    
    boolean intersectsPipes() { 
        if (y < topPipeY && x > pipeX && x < (pipeX + 50)){
           return true; 
        }else if (y > pipeSpace && x > pipeX && x < (pipeX + 50)) {
           return true; 
        }else { return false; }
    }
        
    

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
