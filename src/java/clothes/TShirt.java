package clothes;

public class TShirt extends Clothes {

    String color;
    boolean hasPattern;

    public TShirt() {
    }

    public TShirt(String[] parts) {
        this(parts[0], parts[1], parts[2], parts[3], parts[4]);
    }

    private boolean transformHasPatternFromString(String hasPattern) {
        if (hasPattern.equals("igen")) {
            return true;
        } else {
            return false;
        }
    }

    public TShirt(String name, String genderType, String qualityMark, String color, String hasPattern) {
        super(name, genderType, qualityMark);
        this.color = color;
        this.hasPattern = transformHasPatternFromString(hasPattern);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasPattern() {
        return hasPattern;
    }

    public void setHasPattern(boolean hasPattern) {
        this.hasPattern = hasPattern;
    }
}
