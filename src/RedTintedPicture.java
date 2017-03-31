import processing.core.PImage;
import processing.core.PApplet;

public class RedTintedPicture implements PictureFilter {

	private PApplet papplet;
	
	public RedTintedPicture(PApplet papplet) {
		this.papplet = papplet;// TODO Auto-generated constructor stub
	}
	
	@Override
	public PImage filter(PImage image) {
		
		int pixels[] = image.pixels;
		
		int colour;
		int red;
		for (int i = 0; i < pixels.length; i++) {
			colour = pixels[i];
			red = (int) papplet.red(colour);
			pixels[i] = papplet.color(red, 55, 54);
		}
		
		PImage newImage = new PImage(image.width, image.height);
		
		for (int i = 0; i < pixels.length; i++) {
			newImage.pixels[i] = pixels[i];
		}
		
		newImage.loadPixels();
		
		return newImage;
	}

}