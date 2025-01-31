import java.util.*;
public class Test {

	public static void main(String[] args) {
		System.out.println("Enter image details");
		Image img1 = new Image(500,200,1);
	    Image img2 = new Image(600,400,2);
	    Image img3 = new Image(700,100,3);
	    Image img4 = new Image(800,800,4);
	    
	    imageLibrary l1 = new imageLibrary();
	    l1.addImage(img1);
	    l1.addImage(img2);
	    l1.addImage(img3);
	    l1.addImage(img4);
	    
	    int cc = l1.searchImage(700, 180, 3);
	    if( cc ==0) {
	    	System.out.println("no image found");
	    }else {
	    	System.out.println("image found successively: img"+cc);
	    }
	    l1.displayImages();
	}
}
