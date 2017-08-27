package com.mercateo.spring.security.jwt.token.claim;

import com.mercateo.immutables.DataClass;
import org.immutables.value.Value;
import org.immutables.vavr.encodings.VavrEncodingEnabled;

import com.auth0.jwt.interfaces.DecodedJWT;

import io.vavr.collection.Map;

@Value.Immutable
@DataClass
public interface JWTClaims {
    DecodedJWT token();

    Map<String, JWTClaim> claims();

    @Value.Default
    default int verifiedCount() {
        return 0;
    }

    static ImmutableJWTClaims.Builder builder() {
        return ImmutableJWTClaims.builder();
    }
}