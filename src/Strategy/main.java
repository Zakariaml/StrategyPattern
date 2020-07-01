package Strategy;

public class main {

    public static void main(String[] args) {

        ImageStorage myimage = new ImageStorage(new PaoloFilter(),new PngType());
        myimage.store();
    }

}
