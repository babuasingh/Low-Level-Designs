package Splitwise_Design.enums;

public enum SplitType {
    EQUAL("EQUAL"),
    EXACT("EXACT"),
    PERCENTAGE("PERCENTAGE");

    private String splitType;

    SplitType(String splitType) {
        this.splitType = splitType;
    }

    public String getSplitType() {
        return splitType;
    }
}
