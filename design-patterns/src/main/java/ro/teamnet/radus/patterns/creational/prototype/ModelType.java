package ro.teamnet.radus.patterns.creational.prototype;

public enum ModelType {
    MOVIE("movie"),
    ALBUM("album"),
    SHOW("show");

    private String value;

    private ModelType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
