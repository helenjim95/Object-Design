package de.tum.in.ase.eist;

import java.util.Map;

public abstract class Group {

    private final Authentication authentication;

    public Group() {
        this.authentication = new Authentication();
    }

    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return authentication.login(loginName, request);
    }
}
