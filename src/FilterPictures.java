import processing.core.PApplet;
import processing.core.PImage;

public class FilterPictures extends PApplet {
	public static void main(String[] args) {
		PApplet.main("FilterPictures");
	}
	
	PImage myPicture;
	
	public void settings() {
		size(1000, 500);
		myPicture = loadImage("HappyDog.jpg");
	}
	
	public void setup() {
//		// Apply a red tint
//	    RedTintedPicture rtp = new RedTintedPicture(this);
//		PImage redTintedPicture = rtp.filter(myPicture);
//		// Apply a blue tint
		BlueTintedPicture btp = new BlueTintedPicture(this);
		PImage blueTintedPicture = btp.filter(myPicture);
//		// Apply a green tint
//		GreenTintedPicture gtp = new GreenTintedPicture(this);
//		PImage greenTintedPicture = gtp.filter(myPicture);
//		// Convert the image to greyscale
//		GreyscaledPicture gsp = new GreyscaledPicture(this);
//		PImage greyscaledPicture = gsp.filter(myPicture);
//		// Threshold the image at a value of say 50
//		// we will pass in the greyscaled picture for now
//		ThresholdedPicture tp = new ThresholdedPicture(this);
//		PImage thresholdedPicture = tp.filter(greyscaledPicture);
//		
//		redTintedPicture.resize(1000,500);
//		image(redTintedPicture, 0, 0);
		
		myPicture.resize(1000,500);
		image(myPicture, 0, 0);
		
		
		
	}
}
