package org.labordigital.cryptomator_bitwarden;

import org.cryptomator.integrations.keychain.KeychainAccessException;
import org.cryptomator.integrations.keychain.KeychainAccessProvider;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

public class BitwardenAccess implements KeychainAccessProvider {
    @Override
    public @Nls(capitalization = Nls.Capitalization.Title) String displayName() {
        return "Bitwarden LABOR Test";
    }

    @Override
    public void storePassphrase(String s, @Nullable String s1, CharSequence charSequence) throws KeychainAccessException {

    }

    @Override
    public char[] loadPassphrase(String s) throws KeychainAccessException {
        return new char[0];
    }

    @Override
    public void deletePassphrase(String s) throws KeychainAccessException {

    }

    @Override
    public void changePassphrase(String s, @Nullable String s1, CharSequence charSequence) throws KeychainAccessException {

    }

    @Override
    public boolean isSupported() {
        return true;
    }

    @Override
    public boolean isLocked() {
        return false;
    }
}
