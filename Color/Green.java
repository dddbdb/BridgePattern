public class Green implements Color{
    @Override
    public void paint(String penType, String name) {
        System.out.println(penType+"绘制绿色的"+name);
    }
}
