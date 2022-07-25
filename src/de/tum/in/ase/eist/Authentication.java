package de.tum.in.ase.eist;

import java.util.Map;

public interface Authentication {
    boolean login(String loginName, Map<LoginRequestType, String> loginRequest);
}