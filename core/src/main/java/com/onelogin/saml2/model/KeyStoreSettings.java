package com.onelogin.saml2.model;

import java.security.KeyStore;

/**
 * KeyStore class of Java Toolkit.
 *
 * A class that stores KeyStore details for Certificates and Private Key
 */
public class KeyStoreSettings {
    /**
     * KeyStore which stores certificates and key
     */
    private final KeyStore keyStore;

    /**
     * Alias for SP key entry
     */
    private final String spAlias;

    /**
     * Alias for SP encryption key entry
     */
    private final String spEncAlias;

    /**
     * Password for KeyEntry in KeyStore
     */
    private final String spKeyPass;

    /**
     * Constructor
     *
     * @param keyStore
     *            stores certificates and key
     *
     * @param spAlias
     *            Alias for SP key entry
     *
     * @param spKeyPass
     *            password to access Private KeyEntry in KeyStore
     */
    public KeyStoreSettings(KeyStore keyStore, String spAlias, String spKeyPass) {
        this.keyStore = keyStore;
        this.spAlias = spAlias;
        this.spKeyPass = spKeyPass;
        this.spEncAlias = null;
    }

    /**
     * Constructor
     *
     * @param keyStore
     *            stores certificates and key
     *
     * @param spAlias
     *            Alias for SP key entry
     *
     * @param spKeyPass
     *            password to access Private KeyEntry in KeyStore
     *
     * @param spEncAlias
     *            Alias for SP encryption key entry
     *
     */
    public KeyStoreSettings(KeyStore keyStore, String spAlias, String spKeyPass, String spEncAlias) {
        this.keyStore = keyStore;
        this.spAlias = spAlias;
        this.spKeyPass = spKeyPass;
        this.spEncAlias=spEncAlias;
    }

    /**
     * @return the keyStore
     */
    public final KeyStore getKeyStore() {
        return keyStore;
    }

    /**
     * @return the spAlias
     */
    public final String getSpAlias() {
        return spAlias;
    }

    /**
     * @return the spEncAlias
     */
    public final String getSpEncAlias() {
        return spEncAlias==null?spAlias:spEncAlias;
    }


    /**
     * @return the spKeyPass
     */
    public final String getSpKeyPass() {
        return spKeyPass;
    }

}
