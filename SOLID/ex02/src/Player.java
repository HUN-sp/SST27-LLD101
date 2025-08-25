public class Player {
    private final IDecoder decoder;
    private final IFrameRenderer renderer;
    private final IFrameCache cache;

    public Player(IDecoder decoder, IFrameRenderer renderer, IFrameCache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    void play(byte[] fileBytes) {
        // Decoding
        Frame frame = decoder.decode(fileBytes);

        // 2. Draw UI
        renderer.drawUI(frame);

        // 3. Cachimg
        cache.cache(frame);
    }
}