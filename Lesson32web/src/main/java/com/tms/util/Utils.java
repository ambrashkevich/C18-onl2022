package com.tms.util;

import com.tms.model.User;
import java.util.Optional;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {

    public static final String ADMIN_LOGIN = "admin";
    public static final String ADMIN_PASSWORD = "admin";

    public static boolean isUserLogIn(User user) {
        if (Optional.ofNullable(user).isPresent() && ADMIN_LOGIN.equals(user.getName())
                && ADMIN_PASSWORD.equals(user.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}