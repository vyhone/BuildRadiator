package com.paulhammant.buildradiator.radiator.model;

public class SecretDoesntMatch extends BuildRadiatorException {
    public SecretDoesntMatch() {
        super("secret doesnt match");
    }
}
