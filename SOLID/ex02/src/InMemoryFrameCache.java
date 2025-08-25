public class InMemoryFrameCache implements IFrameCache {
    private Frame lastFrame;

    @Override
    public void cache(Frame frame) {
        this.lastFrame = frame;
        System.out.println("Cached last frame? " + (lastFrame != null));
    }

    @Override
    public Frame getLast() {
        return lastFrame;
    }
}