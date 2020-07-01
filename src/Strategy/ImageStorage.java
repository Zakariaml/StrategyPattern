package Strategy;

public class ImageStorage {
    private Filter myfilter;
    private Compressor mycompressor;

    public Filter getMyfilter() {
        return myfilter;
    }

    public void setMyfilter(Filter myfilter) {
        this.myfilter = myfilter;
    }

    public Compressor getMycompressor() {
        return mycompressor;
    }

    public void setMycompressor(Compressor mycompressor) {
        this.mycompressor = mycompressor;
    }

    public ImageStorage(Filter myfilter, Compressor mycompressor) {
        this.myfilter = myfilter;
        this.mycompressor = mycompressor;
    }

    public void store(){
        myfilter.apply();
        mycompressor.compress();
    }
}
