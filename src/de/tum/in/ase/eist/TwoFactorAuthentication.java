package de.tum.in.ase.eist;

import java.util.Map;

public class TwoFactorAuthentication implements Authentication {

    OAuthAuthentication oAuthAuthentication = new OAuthAuthentication();
    TokenBasedAuthentication tokenBasedAuthentication = new TokenBasedAuthentication();

    public boolean login(String loginName, Map<LoginRequestType, String> loginRequest) {
        boolean isCorrect = oAuthAuthentication.login(loginName, loginRequest);
        boolean secondCorrect = false;
        if (isCorrect) {
            secondCorrect = tokenBasedAuthentication.login(loginName);
        } else {
            secondCorrect = false;
        }
        return secondCorrect;
    }
}
