package modell;

public enum Gender {

    MAN("férfi"),
    WOMAN("női"),
    UNISEX("unisex"),
    CHILDREN("gyerek");

    String HUN_NAME;

    Gender() {
    }

    Gender(String HUN_NAME) {
        this.HUN_NAME = HUN_NAME;
    }
}
