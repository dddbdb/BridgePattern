public class SmallPen extends Pen{
    @Override
    public void draw(String name) {
        String penType ="小号笔";
        this.color.paint(penType,name);
    }
}
