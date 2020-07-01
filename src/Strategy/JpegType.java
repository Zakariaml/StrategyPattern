package Strategy;

public class JpegType implements Compressor{

    @Override
    public void compress() {
        System.out.println("JPEG Type compressor");
    }
}
