package com.uphyca.stetho_realm;

import android.database.sqlite.SQLiteException;

import com.facebook.stetho.inspector.helper.ChromePeerManager;
import com.facebook.stetho.inspector.helper.PeerRegistrationListener;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Nullable;

import io.realm.RealmConfiguration;
import io.realm.exceptions.RealmError;
import io.realm.internal.SharedRealm;
import io.realm.internal.Table;

public class RealmPeerManager extends ChromePeerManager {
    public RealmPeerManager(String packageName,
                            RealmFilesProvider filesProvider,
                            byte[] defaultEncryptionKey,
                            Map<String, byte[]> encryptionKeys) {
    }

    public List<String> getDatabaseTableNames(String databaseId, boolean withMetaTables) {
        return null;
    }

    private void bootstrapNewPeer(JsonRpcPeer peer) {
    }

    /**
     * Attempt to smartly eliminate uninteresting shadow databases such as -journal and -uid.  Note
     * that this only removes the database if it is true that it shadows another database lacking
     * the uninteresting suffix.
     *
     * @param databaseFiles Raw list of database files.
     * @return Tidied list with shadow databases removed.
     */
    // @VisibleForTesting
    static List<File> tidyDatabaseList(List<File> databaseFiles) {
        return null;
    }

    public <T> T executeSQL(String databaseId, String query, RealmPeerManager.ExecuteResultHandler<T> executeResultHandler) {
            return null;
    }

    private SharedRealm openSharedRealm(String databaseId) {
        return null;
    }

    private SharedRealm openSharedRealm(String databaseId,
                                                               @Nullable SharedRealm.Durability durability) {
        return null;
    }

    private Class<?> getRealmErrorClass() {
        return null;
    }

    private byte[] getEncryptionKey(String databaseId) {
        return null;
    }

    public interface ExecuteResultHandler<T> {
    }
}
