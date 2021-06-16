public class main {
    public static void main(String[] args) {
        Color color=(Color)XMLUtil.getBean("color");
        Pen pen=(Pen) XMLUtil.getBean("pen");
        pen.setColor(color);
        pen.draw("画");
    }
}
