package de.tum.in.ase.eist;

public class TutorsGroup extends Group {

    @Override
    public Group() {
        this.authentication = new TwoFactorAuthentication();
    }

}
