package clothes;

public class Shoes extends Clothes {

    int size;

    public Shoes() {
    }

    public Shoes(String[] parts) {
        this(parts[0], parts[1], parts[2], parts[3]);
    }

    public Shoes(String name, String genderType, String qualityMark, String size) {
        super(name, genderType, qualityMark);
        this.size = Integer.parseInt(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
