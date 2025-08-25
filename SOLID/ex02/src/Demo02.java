public class Demo02 {
    public static void main(String[] args) {
        IDecoder decoder = new SimpleDecoder();
        IFrameRenderer renderer = new ConsoleRenderer();
        IFrameCache cache = new InMemoryFrameCache();

        Player player = new Player(decoder, renderer, cache);

        player.play(new byte[]{1, 2, 3, 4});
    }
}