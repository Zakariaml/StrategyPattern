package Strategy;

public class PngType implements Compressor{

    @Override
    public void compress() {
        System.out.println("PNG Type Used!");
    }
}
