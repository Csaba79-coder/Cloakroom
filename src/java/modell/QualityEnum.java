package modell;

public enum QualityEnum {

    PREMIUM(1),
    HIGH_QUALITY(2),
    ORDINARY(3),
    ADEQUATE(4),
    CRAPPY(5),
    OTHER(-1);

    public final Integer QUALITY_MARK;


    QualityEnum(Integer QUALITY_MARK) {
        this.QUALITY_MARK = QUALITY_MARK;
    }

    public static QualityEnum getQualityMark(Integer quality) {
        for (QualityEnum currentEnum :  values()) {
            if (currentEnum.QUALITY_MARK.equals(quality)) {
                return currentEnum;
            }
        }
        return QualityEnum.OTHER;
    }
}
