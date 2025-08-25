public class ConsoleRenderer implements IFrameRenderer {
    @Override
    public void drawUI(Frame frame) {
        System.out.println("\u25B6 Playing " + frame.data.length + " bytes on the console.");
    }
}