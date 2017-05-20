/**
 * Auto Generated Java Class.
 */
public class TestPicture {
   
   
   public static void main(String[] args) { 
     
    //FileChooser.setMediaPath(FileChooser.pickADirectory() );
    Picture p = new Picture(FileChooser.getMediaPath("butterfly1.jpg")); 
    p.explore();
    //p.rotateLeft90().explore();
    //p.rotate180().explore(); 
    //p.rotateRight90().explore();
    p.horizontalEdgeDetection(50).explore();
    p.verticalEdgeDetection(25).explore();
    p.whiteEdgeDetection(25).explore();
     
     ////////////////////////////Lab 20\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
     /*Picture p = new Picture ("H:\\Sis\\Software Design and Development\\Java\\lab 20\\mediasources\\640x480.jpg ");
     //Picture p = new Picture(FileChooser.getMediaPath("640x480.jpg"));
     Picture p = new Picture(FileChooser.getMediaPath("640x480.jpg"));
     p.beachSmall() ;
     p.explore();*/
     
     //Picture source = new Picture ("H:\\Sis\\Software Design and Development\\Java\\lab 20\\mediasources\\redSnake.jpg ");
     //H:\Sis\Software Design and Development\Java\Lab 20\mediasources
     //source.explore();
     
     //source.scaleUp(4).explore();
     
     //source.scaleDown(4).explore();
     //source.explore();
   }
   
}
