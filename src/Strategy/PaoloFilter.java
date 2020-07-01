package Strategy;

public class PaoloFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Filter Paolo applied to the picture");
    }
}
