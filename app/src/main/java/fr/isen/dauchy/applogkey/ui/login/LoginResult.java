package fr.isen.dauchy.applogkey.ui.login;

import androidx.annotation.Nullable;

/**
 * Authentication result : success (user details) or error message.
 */
class Login3Result {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;

    Login3Result(@Nullable Integer error) {
        this.error = error;
    }

    Login3Result(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    LoggedInUserView getSuccess() {
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}