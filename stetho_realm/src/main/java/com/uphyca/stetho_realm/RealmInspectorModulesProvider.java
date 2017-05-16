package com.uphyca.stetho_realm;

import android.content.Context;

import com.facebook.stetho.InspectorModulesProvider;
import com.facebook.stetho.Stetho;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * Stetho へモジュールを組み込むための InspectorModulesProvider です。
 * <p/>
 * Stetho の初期化の際に、{@link #builder(Context)} で作成した RealmInspectorModulesProvider インスタンスを
 * {@link com.facebook.stetho.Stetho.InitializerBuilder#enableWebKitInspector(InspectorModulesProvider)}
 * に渡してください。
 * <p/>
 * <pre>
 *     Stetho.initialize(
 *         Stetho.newInitializerBuilder(this)
 *             .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
 *             .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
 *             .build());
 * </pre>
 * <p/>
 * {@link com.uphyca.stetho_realm.RealmInspectorModulesProvider.ProviderBuilder} の各種メソッドを呼ぶことで
 * メタデータテーブルを表示に含めるかや、データベースファイル名のパターンを指定することができます。
 */
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
