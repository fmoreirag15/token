package org.acme.service.impl;

import io.smallrye.jwt.build.Jwt;
import org.acme.service.IJwtService;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
@ApplicationScoped
public class JwtService implements IJwtService {

    Set<String> roles =new HashSet<>(Arrays.asList("admin", "read","write"));
    @Override
    public String jwt() {
        return Jwt.issuer("byte-company")
                .subject("byte-company-token")
                .groups(roles)
                .expiresAt(System.currentTimeMillis()+8000).sign();
    }
}
