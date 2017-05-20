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
 
////////////////////// My methods ///////////////////////////////////////
  
  //-------------------------Lab 19---------------------------------------------------
  
  /**
   * Rotates a picture anticlockwise by 90 degrees
   * @return The rotated picture
   */
  public Picture rotateLeft90() 
  {
   Picture blank = new Picture(getHeight(), getWidth());
   
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   
   for(int sourceY = 0; sourceY < getHeight(); sourceY++) 
   {
     for(int sourceX = 0; sourceX < getWidth(); sourceX++) 
     {
       int targetX = sourceY;
       int targetY = getWidth() - 1 - sourceX;
       targetPixel = blank.getPixel(targetX, targetY);
       sourcePixel = getPixel(sourceX, sourceY);
       
       targetPixel.setColor(sourcePixel.getColor());
     }
   }
   return blank;
  }
  
  /**
   * Rotates a picture by 180 degrees
   * @return The rotated picture
   */
  public Picture rotate180() 
  {
   Picture blank = new Picture(getWidth(), getHeight());
   
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   
   for(int sourceY = 0, targetY = getHeight() - 1; sourceY < getHeight(); sourceY++, targetY--) 
   {
     for(int sourceX = 0, targetX = getWidth() - 1; sourceX < getWidth(); sourceX++, targetX--) 
     {
       targetPixel = blank.getPixel(targetX, targetY);
       sourcePixel = getPixel(sourceX, sourceY);
       
       targetPixel.setColor(sourcePixel.getColor());
     }
   }
   return blank;
  }
  
  /**
   * Rotates a picture clockwise by 90 degrees
   * @return The rotated picture
   */
  public Picture rotateRight90() 
  {
   Picture blank = new Picture(getHeight(), getWidth());
   
   Pixel sourcePixel = null;
   Pixel targetPixel = null;
   
   for(int sourceY = 0; sourceY < getHeight(); sourceY++) 
   {
     for(int sourceX = 0; sourceX < getWidth(); sourceX++) 
     {
       int targetX = getHeight() - 1 - sourceY;
       int targetY = sourceX;
       targetPixel = blank.getPixel(targetX, targetY);
       sourcePixel = getPixel(sourceX, sourceY);
       
       targetPixel.setColor(sourcePixel.getColor());
     }
   }
   return blank;
  }
  
  
  /**
   * Detects horizontal edges and turns them black
   */
  public Picture horizontalEdgeDetection(double amount) 
  {
    Picture blank = new Picture(getWidth(), getHeight());
    
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel targetPixel = null;
    
    for(int topY = 0; topY < getHeight() - 1; topY++) 
    {
      for(int topX = 0; topX < getWidth(); topX++) 
      {
        topPixel = getPixel(topX, topY);
        bottomPixel = getPixel(topX, topY + 1);
        targetPixel = blank.getPixel(topX, topY);
        
        if(Math.abs(topPixel.getAverage() - bottomPixel.getAverage()) < amount) 
        {
          targetPixel.setColor(Color.WHITE);
        }
        else 
        {
          targetPixel.setColor(Color.BLACK);
        }
      }
    }
    return blank;
  }
  
  
  /**
   * Detects vertical edges and turns them black
   */
  public Picture verticalEdgeDetection(double amount) 
  {
    Picture blank = new Picture(getWidth(), getHeight());
    
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel targetPixel = null;
    
    for(int topY = 0; topY < getHeight(); topY++) 
    {
      for(int topX = 0; topX < getWidth() - 1; topX++) 
      {
        topPixel = getPixel(topX, topY);
        bottomPixel = getPixel(topX + 1, topY);
        targetPixel = blank.getPixel(topX, topY);
        
        if(Math.abs(topPixel.getAverage() - bottomPixel.getAverage()) < amount) 
        {
          targetPixel.setColor(Color.WHITE);
        }
        else 
        {
          targetPixel.setColor(Color.BLACK);
        }
      }
    }
    return blank;
  }
  
  /**
   * Detects vertical edges and turns them white
   */
  public Picture whiteEdgeDetection(double amount) 
  {
    Picture blank = new Picture(getWidth(), getHeight());
    
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel targetPixel = null;
    
    for(int topY = 0; topY < getHeight(); topY++) 
    {
      for(int topX = 0; topX < getWidth() - 1; topX++) 
      {
        topPixel = getPixel(topX, topY);
        bottomPixel = getPixel(topX + 1, topY);
        targetPixel = blank.getPixel(topX, topY);
        
        if(Math.abs(topPixel.getAverage() - bottomPixel.getAverage()) < amount) 
        {
          targetPixel.setColor(Color.BLACK);
        }
        else 
        {
          targetPixel.setColor(Color.WHITE);
        }
      }
    }
    return blank;
  }
  
  //-------------------------Lab 20---------------------------------------------------
  /**
   * Scales a picture up by a given factor
   * @param the factor by which the picture is scaled
   * @return The scaled picture
   */
  public Picture scaleUp(int factor) 
  {
    //final int FACTOR = 2;
    Picture blank = new Picture (getWidth() * factor, getHeight() * factor);
    
    Pixel blankPixel = null;
    Pixel sourcePixel = null;
    
    for(double sourceY = 0, targetY = 0; sourceY < getHeight(); sourceY+= (double) 1 / factor, targetY++) 
    {
      for(double sourceX = 0, targetX = 0; sourceX < getWidth(); sourceX+= (double) 1 / factor, targetX++)
      {
        blankPixel = blank.getPixel((int)targetX, (int)targetY);
        sourcePixel = getPixel((int)sourceX, (int)sourceY);
        
        blankPixel.setColor(sourcePixel.getColor());
      }
    }
    
    return blank;
  }
  
  /**
   * 
   */
  public void beachSmall() 
  {
    //Picture beachPicture = new Picture("H:\\Sis\\Software Design and Development\\Java\\lab 20\\mediasources\\beach.jpg ");
    Picture beachPicture = new Picture(FileChooser.getMediaPath("beach.jpg"));
    
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for (int sourceX = 0, targetX=0; sourceX < beachPicture.getWidth(); sourceX = sourceX + 2, targetX++){
      for(int sourceY = 0, targetY = 0; sourceY < beachPicture.getHeight(); sourceY= sourceY + 2, targetY++){
        sourcePixel = beachPicture.getPixel(sourceX,sourceY);
        targetPixel = getPixel(targetX,targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  /**
   * Scales a picture down by a given factor
   * @param the factor by which the picture is scaled
   * @return the scaled picture
   */
  public Picture scaleDown(int factor) 
  {
    Picture blank = new Picture((int)Math.ceil((double)getWidth() / factor), (int)Math.ceil((double)getHeight() / factor));
    System.out.println(getWidth() / factor + " " + getHeight() / factor);
    //Picture blank = new Picture((int)(getWidth() / factor), (int)(getHeight() / factor));
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = 0, targetX = 0; sourceX < getWidth(); sourceX+= factor, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < getHeight(); sourceY+= factor, targetY++) 
      {
        //System.out.println(targetX + " " + targetY + " " + sourceX + " " + sourceY);
        sourcePixel = getPixel(sourceX, sourceY);
        targetPixel = blank.getPixel(targetX, targetY);
        
        targetPixel.setColor(sourcePixel.getColor());
      }
    }   
    return blank;
  }
  
  
} // this } is the end of class Picture, put all new methods before this
 