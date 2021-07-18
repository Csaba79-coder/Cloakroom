package clothes;

public class Socks extends Clothes {

    String typeOfSucks;

    public Socks() {
    }

    public Socks(String[] parts) {
        this(parts[0], parts[1], parts[2], parts[3]);
    }

    public Socks(String name, String genderType, String qualityMark, String typeOfSucks) {
        super(name, genderType, qualityMark);
        this.typeOfSucks = typeOfSucks;
    }

    public String getTypeOfSucks() {
        return typeOfSucks;
    }

    public void setTypeOfSucks(String typeOfSucks) {
        this.typeOfSucks = typeOfSucks;
    }
}
