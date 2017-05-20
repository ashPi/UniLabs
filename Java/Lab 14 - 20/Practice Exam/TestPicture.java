/**
 * Auto Generated Java Class.
 */
public class TestPicture {
   
   
   public static void main(String[] args) { 
     //Just once to set the media path to the folder
     //FileChooser.setMediaPath(FileChooser.pickADirectory() );
     
     //Select picture
     Picture pic = new Picture(FileChooser.pickAFile());
     pic.explore();
     //pic.cycleColours();
     //pic.quadrantify();
     pic.makeShadow();
     pic.explore();
     
   }
   
}
