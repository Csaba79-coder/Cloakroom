package modell;

public enum GenderEnum {

    MAN("férfi"),
    WOMAN("női"),
    UNISEX("unisex"),
    CHILDREN("gyerek"),
    OTHER("ajjaj");

    public final String HUN_NAME;

    GenderEnum(String HUN_NAME) {
        this.HUN_NAME = HUN_NAME;
    }

    public static GenderEnum getEnumByLabel(String hunName) {
        for (GenderEnum currentEnum : values()) {
            if (currentEnum.HUN_NAME.equals(hunName)) {
                return currentEnum;
            }
        }
        return GenderEnum.OTHER;
    }
}
