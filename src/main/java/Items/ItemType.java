package Items;

public enum ItemType {

    MUSICSCORE("Music Score"),
    ACCESSORY("Instrument Accessory");

    private final String type;

    ItemType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
