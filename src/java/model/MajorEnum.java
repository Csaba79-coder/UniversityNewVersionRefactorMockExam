package model;

public enum MajorEnum {
    ENG("anglisztika"),
    GER("germanisztika"),
    JAP("japán"),
    CPH("klasszika filológia"),
    HUN("magyar"),
    SCA("skandinavisztika"),
    INF("informatikus könyvtáros"),
    HIS("történelem"),
    OTHER("opsz");

    public final String LABEL;

    MajorEnum(String label) {
        this.LABEL = label;
    }

    public static MajorEnum getEnumByLabel(String label) {
        for (MajorEnum currentEnum : values()) {
            if (currentEnum.LABEL.equals(label)) {
                return currentEnum;
            }
        }
        return MajorEnum.OTHER;
    }
}
