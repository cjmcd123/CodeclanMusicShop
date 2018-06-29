package Instruments;

public enum InstrumentType {

    STRING("String"),
    WOODWIND("Woodwind"),
    PERCUSSION("Percussion"),
    BRASS("Brass"),
    KEYBOARD("Keyboard");

    private final String type;

    InstrumentType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

}
