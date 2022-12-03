package dvsn.gl;

public class Key {
    private String type;
    private int code;
    private String text;
    private String location;
    private int rawCode;

    public Key() {
    }

    public Key(String rawInput) {
        parseParams(rawInput);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRawCode() {
        return rawCode;
    }

    public void setRawCode(int rawCode) {
        this.rawCode = rawCode;
    }

    private Key parseParams(String rawInput) {

        return new Key(rawInput);
    }
}
