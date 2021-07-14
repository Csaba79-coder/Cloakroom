package clothes;

public class TShirt extends Clothes {

    String color;
    boolean hasPattern;

    public TShirt() {
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
