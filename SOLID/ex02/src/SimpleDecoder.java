public class SimpleDecoder implements IDecoder {
    @Override
    public Frame decode(byte[] fileBytes) {
        System.out.println("Decoding " + fileBytes.length + " bytes...");
        return new Frame(fileBytes);
    }
}