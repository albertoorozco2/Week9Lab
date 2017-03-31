import processing.core.PImage;
import processing.core.PApplet;

public class InvertedColors implements PictureFilter {

    private PApplet p;
    
    public InvertedColors(PApplet p) {
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
            red = 255 - (int) p.red(colour);
            blue = 255 -(int) p.blue(colour);
            green = 255 -(int) p.green(colour);
           
            pixels[i] = p.color(red,green,blue);
            
            }
        
        PImage newImage = new PImage(image.width, image.height);
        
        for (int i = 0; i < pixels.length; i++) {
            newImage.pixels[i] = pixels[i];
        }
        
        newImage.loadPixels();
        
        return newImage;
    }

}
