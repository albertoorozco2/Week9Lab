import processing.core.PImage;
import processing.core.PApplet;

public class BlueTintedPicture implements PictureFilter {

	private PApplet p;
	
	public BlueTintedPicture(PApplet p) {
		this.p = p;
	}
	
	@Override
	public PImage filter(PImage image) {
		
		int pixels[] = image.pixels;
		
		int colour;
		int blue;
		for (int i = 0; i < pixels.length; i++) {
			colour = pixels[i];
			blue = (int) p.blue(colour);
			pixels[i] = p.color(40, 40, blue);
		}
		
		PImage newImage = new PImage(image.width, image.height);
		
		for (int i = 0; i < pixels.length; i++) {
			newImage.pixels[i] = pixels[i];
		}
		
		newImage.loadPixels();
		
		return newImage;
	}

}