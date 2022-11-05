package org.acme.model;

public class JwtResponse {
    public JwtResponse() {

    }
    private String jwt;

    public JwtResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
