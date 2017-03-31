import processing.core.PImage;
import processing.core.PApplet;

public class GreyscaledPicture implements PictureFilter {

    private PApplet p;
    
    public GreyscaledPicture(PApplet p) {
        this.p = p;
    }
    
    @Override
    public PImage filter(PImage image) {
        
        int pixels[] = image.pixels;
        
        int colour;
        int red;
        int green;
        int blue;

        for (int i = 0; i < pixels.length; i++) {
            colour = pixels[i];
            red = (int) p.red(colour);
            blue = (int) p.blue(colour);
            green = (int) p.green(colour);
            pixels[i] = p.color((red+blue+green)/3);
        }
        
        PImage newImage = new PImage(image.width, image.height);
        
        for (int i = 0; i < pixels.length; i++) {
            newImage.pixels[i] = pixels[i];
        }
        
        newImage.loadPixels();
        
        return newImage;
    }

}