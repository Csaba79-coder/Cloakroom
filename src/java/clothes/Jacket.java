package clothes;

public class Jacket extends Clothes {

    String typeOfCoat;

    public Jacket() {
    }

    public Jacket(String[] parts) {
        this(parts[0], parts[1], parts[2], parts[3]);
    }

    public Jacket(String name, String genderType, String qualityMark, String typeOfCoat) {
        super(name, genderType, qualityMark);
        this.typeOfCoat = typeOfCoat;
    }

    public String getTypeOfCoat() {
        return typeOfCoat;
    }

    public void setTypeOfCoat(String typeOfCoat) {
        this.typeOfCoat = typeOfCoat;
    }
}
