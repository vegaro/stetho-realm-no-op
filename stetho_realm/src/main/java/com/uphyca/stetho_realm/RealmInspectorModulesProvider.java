package com.uphyca.stetho_realm;

import android.content.Context;

import com.facebook.stetho.InspectorModulesProvider;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

import java.io.File;
import java.util.Map;
import java.util.regex.Pattern;

@SuppressWarnings("unused")
public class RealmInspectorModulesProvider implements InspectorModulesProvider {

    private static final Pattern DEFAULT_DATABASE_NAME_PATTERN = Pattern.compile(".+\\.realm");

    private static final long DEFAULT_LIMIT = 250L;
    private static final boolean DEFAULT_ASCENDING_ORDER = true;

    private static final int ENCRYPTION_KEY_LENGTH = 64;

    private RealmInspectorModulesProvider(String packageName,
                                          InspectorModulesProvider baseProvider,
                                          File folder,
                                          boolean withMetaTables,
                                          Pattern databaseNamePattern,
                                          long limit,
                                          boolean ascendingOrder,
                                          byte[] defaultEncryptionKey,
                                          Map<String, byte[]> encryptionKeys) {
    }

    @Override
    public Iterable<ChromeDevtoolsDomain> get() {
        return null;
    }

    public static ProviderBuilder builder(Context context) {
        return null;
    }

    public static class ProviderBuilder {
        public ProviderBuilder(Context context) {
        }

        public ProviderBuilder baseProvider(InspectorModulesProvider provider) {
            return this;
        }

        public ProviderBuilder withMetaTables() {
            return this;
        }

        public ProviderBuilder withLimit(long limit) {
            return this;
        }

        public ProviderBuilder withFolder(File folder) {
            return this;
        }

        public ProviderBuilder withDescendingOrder() {
            return this;
        }

        public ProviderBuilder databaseNamePattern(Pattern databaseNamePattern) {
            return this;
        }

        public ProviderBuilder withDefaultEncryptionKey(byte[] key) {

            return this;
        }

        public ProviderBuilder withEncryptionKey(String filename, byte[] key) {
            return this;
        }

        public RealmInspectorModulesProvider build() {
            return null;
        }
    }
}
