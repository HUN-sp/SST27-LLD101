public interface IFrameCache {
    void cache(Frame frame);
    Frame getLast();
}