package com.tms.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Command {
    PROFILE_COMMAND("profile"),
    SHOPPING_CART_POST_COMMAND("cart-post"),
    CART_COMMAND("cart"),
    HOME_COMMAND("home"),
    PRODUCT_COMMAND("product"),
    CATEGORY_COMMAND("category"),
    LOGOUT_COMMAND("logout");


    private static final Map<String, Command> commandMapping = new HashMap<>();

    static {
        for (Command type : values()) {
            commandMapping.put(type.getCommand(), type);
        }
    }

    public static Command fromString(String type) {
        return Optional.ofNullable(commandMapping.get(type))
                       .orElseThrow(() -> new IllegalStateException("Unknown command type"));
    }

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}