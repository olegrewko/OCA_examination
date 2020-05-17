package comAV;

public enum Size {
    VERY_SMALL("XS"), SMALL("S"), AVERAGE("M"), BIG("L"), VERY_BIG("XL"),
    UNEFIND(" ");
    Size (String abbreviation){
        this.abbreviation = abbreviation;
    }
    private String abbreviation;

    public String getAbbreviation() {
        return abbreviation;
    }
}
