import java.util.Scanner;
/**
 * Auto Generated Java Class.
 */
public class TestPicture {
   
   
   public static void main(String[] args) { 
     //Do something
     //FileChooser.setMediaPath(FileChooser("C:\\Users\\s4et0\\Desktop") );
     //Picture pict = new Picture(FileChooser.pickAFile()); 
    
     //Picture pict = new Picture(FileChooser.pickAFile());
     //pict.explore();
     //pict.clearBlue();
     //pict.increaseRed();
     //pict.decreaseRed();
     //pict.makeSunset();
     //pict.negate();
     //pict.greyscale();
     //pict.greyscaleWithLuminance();
     //pict.mirrorVertical();
     //pict.randomOffset();
     //pict.mirrorTemple();
     //pict.mirrorHorizontal();
     //pict.mirrorDiagonal();
     //pict.explore();
     
     //-----------------------------------------------------------------------------------------
     Scanner in = new Scanner(System.in);
     //FileChooser.setMediaPath(FileChooser.pickADirectory() );
     //System.out.println();
     Picture targetPicture = new Picture("C:\\Users\\s4et0\\Desktop\\Mediasources\\640x480.jpg ");
     //Picture source = new Picture(FileChooser.pickAFile());
     //targetPicture.explore();
     //source.explore();
     //targetPicture.copyCaterpillar();
     
     
    // targetPicture.copyToPosition(source, 20, 20);
     
     //targetPicture.copyPicture();
     //targetPicture.cropPicture(24, 0, 100,63);
     //targetPicture.explore();
     
     //snake
     /*int startX = in.nextInt();
     int startY = in.nextInt();
     int endX = in.nextInt();
     int endY = in.nextInt();
     //158 3 340 182
     targetPicture.cropToPosition(startX, startY, endX, endY, startX, startY);*/
     
     //sergio
     //targetPicture.theSergioMethod();*/
     
     //collage
     //targetPicture.collage();
     
     //Merging
     //targetPicture.merge();
     
     //Blending
     //targetPicture.blend();
     
     //Merge with blending factors
     //targetPicture.mergeWithFactor();
     
     //Blending with factor in the middle section
     targetPicture.blendWithFactor();
     
     targetPicture.explore();
     in.close();
   }
}



