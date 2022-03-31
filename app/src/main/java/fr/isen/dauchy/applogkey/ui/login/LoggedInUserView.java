package fr.isen.dauchy.applogkey.ui.login;

/**
 * Class exposing authenticated user details to the UI.
 */
class Logged3InUserView {
    private String displayName;
    //... other data fields that may be accessible to the UI

    Logged3InUserView(String displayName) {
        this.displayName = displayName;
    }

    String getDisplayName() {
        return displayName;
    }
}