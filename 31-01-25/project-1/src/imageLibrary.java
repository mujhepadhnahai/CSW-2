import java.util.*;

public class imageLibrary {
    private List<Image> images;
    public imageLibrary() {
        images = new ArrayList<>();
    }
    public void addImage(Image image) {
        images.add(image);
        System.out.println("Image added: img" + image.cc);
    }
    public int searchImage(int imgW, int imgH, int cc) {
        for (Image img : images) {
            if (img.getImgW() == imgW && img.getImgH() == imgH && img.getCc() == cc) {
                return img.getCc(); 
            }
        }
        return 0; 
    }
    public Image getImage(int index) {
        if (index >= 0 && index < images.size()) {
            return images.get(index);
        }
        return null; 
    }
    public void displayImages() {
        if (images.isEmpty()) {
            System.out.println("No images in the library.");
        } else {
            System.out.println("Images in the library:");
            for (Image img : images) {
                img.print();
            }
        }
    }
}
