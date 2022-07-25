package de.tum.in.ase.eist;

public class AdministratorGroup extends Group {
    @Override
    public Group() {
        this.authentication = new BiometricAuthentication();
    }
}
