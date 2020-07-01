package Strategy;

public class TimeFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("TimeFilter applied to the picture");
    }
}
