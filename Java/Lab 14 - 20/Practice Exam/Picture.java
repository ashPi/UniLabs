import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * Copyright Georgia Institute of Technology 2004-2005
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param width the width of the desired picture
   * @param height the height of the desired picture
   */
  public Picture(int width, int height)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
 
  //-----------------------------My Methods-------------------------------------------
  /**
   * Cycles the values of the colours so that
   * the new red is the old gree, the new green is the old blue
   * and the new blues is the old red
   */
  public void cycleColours() 
  {
    Picture newPic = new Picture(getWidth(), getHeight());
    Pixel newPixel = null;
    Pixel oldPixel = null;
    for(int y = 0; y < getHeight(); y++) 
    {
      for(int x = 0; x< getWidth(); x++) 
      {
        oldPixel = getPixel(x, y);
        newPixel = newPic.getPixel(x, y);
        newPixel.setGreen(oldPixel.getRed());
        newPixel.setBlue(oldPixel.getGreen());
        newPixel.setRed(oldPixel.getBlue());
        oldPixel.setColor(newPixel.getColor());
      }
    }
  }
  
  /**
   * Negates the colours if the pixel is situated
   * in the bottom left or top right quadrant
   */
  public void quadrantify() 
  { 
    Pixel pixel = null;
    
    for(int y = 0; y < getHeight(); y++) 
    {
      for(int x = 0; x < getWidth(); x++) 
      {
        if((x > getWidth() / 2 && y <= getHeight() / 2) ||(x <= getWidth() / 2 && y > getHeight() / 2))
        {
          pixel = getPixel(x, y);
          pixel.setRed(255 - pixel.getRed());
          pixel.setGreen(255 - pixel.getGreen());
          pixel.setBlue(255 - pixel.getBlue());
        }
      }
    }
  }
  
  /**
   * Creates a shadow effect on a picture
   */
  public void makeShadow() 
  {
    double factor;
    Pixel pixel = null;
    for(int y = 0; y < getHeight(); y++) 
    {
      factor = 1 - (double)y / getHeight();
      //System.out.rptinlnt();
      for(int x = 0; x < getWidth(); x++) 
      {
        pixel = getPixel(x, y);
        pixel.setRed((int)(pixel.getRed() * factor));
        pixel.setGreen((int)(pixel.getGreen() * factor));
        pixel.setBlue((int)(pixel.getBlue() * factor));
      }
    }
  }
} // this } is the end of class Picture, put all new methods before this
 