package modell;

public enum Quality {

    PREMIUM(1),
    HIGH_QUALITY(2),
    ORDINARY(3),
    ADEQUATE(4),
    CRAPPY(5);

    Integer QUALITY_MARK;

    Quality() {
    }

    Quality(Integer QUALITY_MARK) {
        this.QUALITY_MARK = QUALITY_MARK;
    }
}
