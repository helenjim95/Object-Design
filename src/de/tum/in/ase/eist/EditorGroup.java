package de.tum.in.ase.eist;

public class EditorGroup extends Group {

    @Override
    public Group() {
        this.authentication = new OAuthAuthentication();
    }

}
