package by.tms.shop.model;

public enum RequestParams {
    LOGIN("username"),
    PASSWORD("password"),
    COMMAND("command");

    private final String value;

    RequestParams(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
