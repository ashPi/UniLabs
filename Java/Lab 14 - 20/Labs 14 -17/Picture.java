import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
/*import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List*/

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
  /**
   * Removes the blue colour in the picture by setting the value of blue to 0
   */
  public void clearBlue() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        p.setBlue(0);
      }
    }
  }
  
  /**
   * Increases the amount of red colour in the picture
   */
  public void increaseRed() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        p.setRed(p.getRed() * 2);
      }
    }
  }
  
  /**
   * Decreases the amount of red colour in the picture
   */
  public void decreaseRed() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        p.setRed(p.getRed() / 2);
      }
    }
  }
  
  /**
   * Decreases the values of blue and green in order to emphasize the red in the picture
   */
  public void makeSunset() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        p.setBlue((int) (0.7 * p.getBlue()));
        p.setGreen((int) (0.7 * p.getGreen()));
      }
    }
  }
  
  /**
   * Turns a picture into a negative
   */
  public void negate() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        p.setRed(255 - p.getRed());
        p.setGreen(255 - p.getGreen());
        p.setBlue(255 - p.getBlue());
      }
    }
  }
  
  /**
   * Changes a picture to Grayscale
   */
  public void greyscale() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        int avg = (int) ((p.getRed() + p.getGreen() + p.getBlue()) / 3); 
        p.setRed(avg);
        p.setGreen(avg);
        p.setBlue(avg);
      }
    }
  }
  
  /**
   * Changes a picture to grayscale taking into account luminance
   */
  public void greyscaleWithLuminance() 
  {
    Pixel p = null;
    for(int x  = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        p = getPixel(x, y);
        int avg = (int) (p.getRed() * 0.299 + p.getGreen() * 0.587 + p.getBlue() * 0.114); 
        p.setRed(avg);
        p.setGreen(avg);
        p.setBlue(avg);
      }
    }
  }
  
  /**
   * Mirrors the left side of the picture
   */
  
  public void mirrorVerticalLeft() 
  {
    Pixel pr = null, pl = null;
    for(int x = getWidth() / 2 ; x < getWidth(); x++) 
    {
      for(int y = 0; y <  getHeight(); y++) 
      {
        pr = getPixel(x, y);
        pl = getPixel(getWidth() / 2 - 1 - x, y);
        pl.setColor(getPixel(x, y).getColor());
      }
    }
  }
  
  /**
   * 
   */
  public void randomOffset() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight(); y++) 
      {
        int offset = (int) (Math.random() * 50);
        p = getPixel(x, y);
        p.setRed(p.getRed()  -offset);
        p.setGreen(p.getGreen() - offset);
        p.setBlue(p.getBlue() - offset);
      }
    }
  }
  
  /**
   * Mirrors part of the Temple image
   */
  public void mirrorTemple() 
  {
    Pixel pl = null, pr = null;
    for(int x = 277; x < 539; x++) 
    {
      for(int y = 27; y < 97; y++) 
      {
        pl = getPixel(277 - 1 -(x - 277), y);
        pr = getPixel(x, y);
        pr.setColor(pl.getColor());
      }
    }
  }
  
  /**
   * Mirrors the right side of the picture
   */
  public void mirrorVerticalRight() 
  {
    Pixel p = null;
    for(int x = 0 ; x < getWidth() / 2; x++) 
    {
      for(int y = 0; y <  getHeight(); y++) 
      {
        p = getPixel(x, y);
        //p.setColor((getPixel.((getWidth() / 2 - 1 - x), y)).getColor());
        p.setColor(getPixel(getWidth() - 1 - x, y).getColor());
      }
    }
  }
  
  /**
   * Mirrors the picture horizontally
   */
  public void mirrorHorizontal() 
  {
    Pixel p = null;
    for(int x = 0; x < getWidth(); x++) 
    {
      for(int y = 0; y < getHeight() / 2; y++) 
      {
        p = getPixel(x, y);
        p.setColor(getPixel(x, getHeight() - 1 - y).getColor());
      }
    }
  }
  
  /**
   * Mirrors the picture diagonally 
   */
  public void mirrorDiagonal() 
  {
    Pixel p = null;
    for(int y = 1; y < getHeight(); y++) 
    {
      for(int x = 0; x < y; x++) 
      {
        p = getPixel(y, x);
        p.setColor(getPixel(x, y).getColor());
      }
    }
  }
  
  //--------------------------------------------------------------------------------------------------------------------------------
  
  /**
   * Copies a picture of caterpillar
   */
  public void copyCaterpillar() 
  {
    System.out.println("Please, choose the caterpillar picture");
    String sourceFile = FileChooser.pickAFile();
    Picture sourcePicture = new Picture(sourceFile);
    
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = 0, targetX = 0; targetX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }     
    }
  }
  
  
  /**
   * Copies any picture
   */
  public void copyPicture(Picture sourcePicture) 
  { 
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = 0, targetX = 0; targetX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }     
    }
  }
  
  
  /**
   * Copies a picture to a given position
   */
  public void copyToPosition(Picture sourcePicture, int x, int y) 
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = 0, targetX = x; sourceX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = y; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  /**
   * Crops a picture
   */
  public void cropPicture(int startX, int startY, int endX, int endY) 
  {
    System.out.println("Choose a picture to copy");
    Picture sourcePicture = new Picture(FileChooser.pickAFile());
    
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = startX, targetX = 0; sourceX < endX; sourceX++, targetX++) 
    {
      for(int sourceY = startY, targetY = 0; sourceY < endY; sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  /**
   * Crops certain parts of a picture
   */
  public void cropToPosition(Picture sourcePicture, int startX, int startY, int endX, int endY, int x, int y) 
  {
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = startX, targetX = x; sourceX < endX; sourceX++, targetX++) 
    {
      for(int sourceY = startY, targetY = y; sourceY < endY; sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
  }
  
  /**
   * The way Sergio insisted on making the collage
   */
  public void theSergioMethod() 
  {
    System.out.println("Choose first flower");
    Picture sourcePicture = new Picture(FileChooser.pickAFile());
    
    Pixel sourcePixel = null;
    Pixel targetPixel = null;
    
    for(int sourceX = 0, targetX = 0; sourceX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    int width = sourcePicture.getWidth();
    
    
    System.out.println("Choose second flower");
    sourcePicture = new Picture(FileChooser.pickAFile());
    
    sourcePixel = null;
    targetPixel = null;
    
    for(int sourceX = 0, targetX = width; sourceX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    width += sourcePicture.getWidth();
    
    System.out.println("Choose third flower");
    sourcePicture = new Picture(FileChooser.pickAFile());
    
    sourcePixel = null;
    targetPixel = null;
    
    for(int sourceX = 0, targetX = width; sourceX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    width += sourcePicture.getWidth();
    
    System.out.println("Choose third flower");
    sourcePicture = new Picture(FileChooser.pickAFile());
    
    sourcePixel = null;
    targetPixel = null;
    
    for(int sourceX = 0, targetX = width; sourceX < sourcePicture.getWidth(); sourceX++, targetX++) 
    {
      for(int sourceY = 0, targetY = 0; sourceY < sourcePicture.getHeight(); sourceY++, targetY++) 
      {
        sourcePixel = sourcePicture.getPixel(sourceX, sourceY);
        targetPixel = this.getPixel(targetX, targetY);
        targetPixel.setColor(sourcePixel.getColor());
      }
    }
    width = sourcePicture.getWidth();
  }
  
  
  /**
   * Makes a collage of two images choosing random effects
   */
  public void collage() 
  {
    Picture pic1 = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\flower1.jpg ");
    Picture pic2 = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\flower2.jpg ");
    Picture temp = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\flower1.jpg ");
    int width = pic1.getWidth();
    int height = pic1.getHeight();
    int randPic = 0, randEffect = 0;
    
    for(int y = 0; y < ((int)(getHeight() / 100)) * 100; y+= height) 
    {
      for(int x = 0; x < ((int)getWidth() / 100) * 100; x+= width) 
      {
        
        randPic = (int) (Math.random() * (2 - 1 + 1) + 1);
        if(randPic == 1) 
        {
          temp.copyPicture(pic1);
        }
        else 
        {
          temp.copyPicture(pic2);
        }
        System.out.println("(" + x + ", " + y + ")" + randPic + " " + randEffect);
        randEffect = (int)(Math.random() * 10 + 1);
        switch (randEffect) 
        {
          case 1: temp.clearBlue();break;
          case 2: temp.increaseRed(); break;
          case 3: temp.decreaseRed(); break;
          case 4: temp.makeSunset(); break;
          case 5: temp.negate(); break;
          case 6: temp.greyscaleWithLuminance(); break;
          case 7: temp.randomOffset(); break;
          case 8: temp.mirrorVerticalRight(); break;
          case 9: temp.mirrorHorizontal(); break;
          case 10: temp.mirrorDiagonal(); break;
        }
        this.copyToPosition(temp, x, y);
      }
    }
  }
  //-------------------------------------------------------------------------------------------------------------------------------
  
  /**
   * Merges two pictures into a terrible one
   */
  public void merge() 
  {
    Picture leftPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\beach.jpg ");
    Picture rightPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\greece.jpg ");
    
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel targetPixel = null;
    
    for(int x = 0; x < rightPic.getWidth(); x++) 
    {
      for(int y = 0; y < rightPic.getHeight(); y++) 
      {
        leftPixel = leftPic.getPixel(x, y);
        rightPixel = rightPic.getPixel(x, y);
        targetPixel = this.getPixel(x, y);
        
        Color averageCol = new Color((int)(leftPixel.getRed()*0.5 + rightPixel.getRed()*0.5), (int)(leftPixel.getGreen()*0.5 + rightPixel.getGreen()*0.5), (int)(leftPixel.getBlue()*0.5 + rightPixel.getBlue()*0.5)); 
        targetPixel.setColor(averageCol);
      }
    }
  }
  
  /**
   * Blend two pictures
   */
  public void blend() 
  {
    Picture leftPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\greece.jpg ");
    Picture rightPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\beach.jpg ");
    //leftPic.explore();
    //rightPic.explore();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel targetPixel = null;
    
    int x = 0, targetX = 0;
    
    for(; x < 200; x++) 
    {
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        leftPixel = leftPic.getPixel(x, y);
        targetPixel = getPixel(x, y);
        targetPixel.setColor(leftPixel.getColor());
        
        
      }
    }
    
    for(; x < 500; x++) 
    {
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        leftPixel = leftPic.getPixel(x, y);
        rightPixel = rightPic.getPixel(x, y + 40); 
        targetPixel = getPixel(x, y); 
        
        targetPixel.setRed((int)(leftPixel.getRed() * 0.5 + rightPixel.getRed() * 0.5));
        targetPixel.setGreen((int)(leftPixel.getGreen() * 0.5 + rightPixel.getGreen() * 0.5));
        targetPixel.setBlue((int)(leftPixel.getBlue() * 0.5 + rightPixel.getBlue() * 0.5));
      }
    }
    
    for(; x < rightPic.getWidth(); x++) 
    {
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        rightPixel = rightPic.getPixel(x, y + 40); 
        targetPixel = getPixel(x, y);
        targetPixel.setColor(rightPixel.getColor());
      }
    }
  }
  
  /**
   * Merges two pictures with a blending factor
   */
  public void mergeWithFactor() 
  {
    Picture leftPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\greece.jpg ");
    Picture rightPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\beach.jpg ");
    
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel targetPixel = null;
    float leftFactor = 0, rightFactor = 0;
    
    for(int x = 0; x < rightPic.getWidth(); x++) 
    {
      rightFactor = (float)x / (float)getWidth();
      leftFactor = 1 - rightFactor;
      //System.out.println(leftFactor + ", " + rightFactor);
        
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        
        
        leftPixel = leftPic.getPixel(x, y);
        rightPixel = rightPic.getPixel(x, y + 40);
        targetPixel = getPixel(x, y);
        
        Color averageCol = new Color((int)(leftPixel.getRed()* leftFactor + rightPixel.getRed()* rightFactor), 
                                     (int)(leftPixel.getGreen()* leftFactor + rightPixel.getGreen()* rightFactor), 
                                     (int)(leftPixel.getBlue()* leftFactor + rightPixel.getBlue()* rightFactor)); 
        targetPixel.setColor(averageCol);
      }
    }
  }
  
  /**
   * Blend two pictures with blending factor in the middle section
   */
  public void blendWithFactor() 
  {
    Picture leftPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\greece.jpg ");
    Picture rightPic = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\beach.jpg ");
    //leftPic.explore();
    //rightPic.explore();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel targetPixel = null;
    
    int x = 0, targetX = 0;
    float leftFactor = 0, rightFactor = 0;
    for(; x < 200; x++) 
    {
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        leftPixel = leftPic.getPixel(x, y);
        targetPixel = getPixel(x, y);
        targetPixel.setColor(leftPixel.getColor());
      }
    }
    
     
    for(; x < 500; x++) 
    {
      rightFactor = (float)(x - 200) / (float)300;
      leftFactor = 1 - rightFactor;
      System.out.println(leftFactor + ", " + rightFactor);
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        leftPixel = leftPic.getPixel(x, y);
        rightPixel = rightPic.getPixel(x, y + 40); 
        targetPixel = getPixel(x, y); 
        
        targetPixel.setRed((int)(leftPixel.getRed() * leftFactor + rightPixel.getRed() * rightFactor));
        targetPixel.setGreen((int)(leftPixel.getGreen() * leftFactor + rightPixel.getGreen() * rightFactor));
        targetPixel.setBlue((int)(leftPixel.getBlue() * leftFactor + rightPixel.getBlue() * rightFactor));
      }
    }
    
    for(; x < rightPic.getWidth(); x++) 
    {
      for(int y = 0; y < leftPic.getHeight(); y++) 
      {
        rightPixel = rightPic.getPixel(x, y + 40); 
        targetPixel = getPixel(x, y);
        targetPixel.setColor(rightPixel.getColor());
      }
    }
  }
  
} // this } is the end of class Picture, put all new methods before this
 