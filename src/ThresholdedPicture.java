import processing.core.PImage;
import processing.core.PApplet;

public class ThresholdedPicture implements PictureFilter {

    private PApplet p;
    
    public ThresholdedPicture(PApplet p) {
        this.p = p;
    }
    
    @Override
    public PImage filter(PImage image) {
        
        int pixels[] = image.pixels;
        
        int colour;
        int red;
        int green;
        int blue;
        int gray;

        for (int i = 0; i < pixels.length; i++) {
            colour = pixels[i];
            red = (int) p.red(colour);
            blue = (int) p.blue(colour);
            green = (int) p.green(colour);
//            if(red>=155){red=255;}else{red=0;}
//            if(blue>=155){blue=255;}else{blue=0;}
//            if(green>=155){green=255;}else{green=0;}
          if((red+green+blue)>=400){gray=255;}else{gray=0;}

            pixels[i] = p.color(gray);
        }
        
        PImage newImage = new PImage(image.width, image.height);
        
        for (int i = 0; i < pixels.length; i++) {
            newImage.pixels[i] = pixels[i];
        }
        
        newImage.loadPixels();
        
        return newImage;
    }

}