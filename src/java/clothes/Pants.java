package clothes;

public class Pants extends Clothes {

    String lengthOfPants;

    public Pants() {
    }

    public Pants(String[] parts) {
        this(parts[0], parts[1], parts[2], parts[3]);
    }

    public Pants(String name, String genderType, String qualityMark, String lengthOfPants) {
        super(name, genderType, qualityMark);
        this.lengthOfPants = lengthOfPants;
    }

    public String getLengthOfPants() {
        return lengthOfPants;
    }

    public void setLengthOfPants(String lengthOfPants) {
        this.lengthOfPants = lengthOfPants;
    }
}
