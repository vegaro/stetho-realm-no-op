/*
 * Copyright (c) 2015-present, uPhyca, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */

package com.uphyca.stetho_realm;

import android.database.sqlite.SQLiteException;

import com.facebook.stetho.common.Util;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcPeer;
import com.facebook.stetho.inspector.jsonrpc.JsonRpcResult;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsDomain;
import com.facebook.stetho.inspector.protocol.ChromeDevtoolsMethod;
import com.facebook.stetho.json.ObjectMapper;
import com.facebook.stetho.json.annotation.JsonProperty;

import org.json.JSONObject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import io.realm.internal.LinkView;
import io.realm.internal.Row;
import io.realm.internal.Table;

@SuppressWarnings("WeakerAccess")
public class Database implements ChromeDevtoolsDomain {

    private enum StethoRealmFieldType {
        INTEGER(0),
        BOOLEAN(1),
        STRING(2),
        BINARY(4),
        UNSUPPORTED_TABLE(5),
        UNSUPPORTED_MIXED(6),
        OLD_DATE(7),
        DATE(8),
        FLOAT(9),
        DOUBLE(10),
        OBJECT(12),
        LIST(13),
        // BACKLINK(14); Not exposed until needed

        // Stetho Realmが勝手に定義した特別な値
        UNKNOWN(-1);

        private final int nativeValue;

        StethoRealmFieldType(int nativeValue) {
            this.nativeValue = nativeValue;
        }

        @SuppressWarnings("unused")
        public int getValue() {
            return nativeValue;
        }
    }

    /**
     * 指定されたパラメータで {@link Database}インスタンスを構築します。
     *
     * @param packageName          アプリケーションのパッケージネーム(application ID)。
     * @param filesProvider        {@link RealmFilesProvider} インスタンス。
     * @param withMetaTables       テーブル一覧にmeta テーブルを含めるかどうか。
     * @param limit                返却するデータの最大行数
     * @param ascendingOrder       {@code true}ならデータを id列の昇順に、{@code false}なら降順に返します。
     * @param defaultEncryptionKey データベースの復号に使用するキー。
     *                             {@code null} の場合は暗号化されていないものとして扱います。
     *                             また、 {@code encryptionKeys} で個別のキーが指定されている
     *                             データベースについては {@code encryptionKeys}の指定が優先されます。
     * @param encryptionKeys       データベース個別のキーを指定するマップ。
     */
    Database(String packageName,
             RealmFilesProvider filesProvider,
             boolean withMetaTables,
             long limit,
             boolean ascendingOrder,
             byte[] defaultEncryptionKey,
             Map<String, byte[]> encryptionKeys) {
    }

    @ChromeDevtoolsMethod
    @SuppressWarnings("unused")
    public void enable(JsonRpcPeer peer, JSONObject params) {
    }

    @ChromeDevtoolsMethod
    @SuppressWarnings("unused")
    public void disable(JsonRpcPeer peer, JSONObject params) {
    }

    @ChromeDevtoolsMethod
    @SuppressWarnings("unused")
    public JsonRpcResult getDatabaseTableNames(JsonRpcPeer peer, JSONObject params) {
        return null;
    }

    @ChromeDevtoolsMethod
    @SuppressWarnings("unused")
    public JsonRpcResult executeSQL(JsonRpcPeer peer, JSONObject params) {         ExecuteSQLResponse response = new ExecuteSQLResponse();
        return null;
    }

    private List<Object> flattenRows(Table table, long limit, boolean addRowIndex) {
        return null;
    }

    private static class GetDatabaseTableNamesRequest {

    }

    private static class GetDatabaseTableNamesResponse implements JsonRpcResult {
    }

    private static class ExecuteSQLRequest {
    }

    private static class ExecuteSQLResponse implements JsonRpcResult {
    }

    public static class AddDatabaseEvent {
    }

    public static class DatabaseObject {
    }

    public static class Error {
    }

    private String formatDate(Date date) {
        return null;
    }

    private String formatList(LinkView linkList) {
        return null;
    }

    static class RowFetcher {
        static RowFetcher getInstance() {
            return null;
        }

        RowFetcher() {
        }

        Row getRow(Table targetTable, long index) {
            return null;
        }
    }

    static class RowWrapper {
        static RowWrapper wrap(Row row) {
            return null;
        }

        RowWrapper(Row row) {
        }

        long getIndex() {
            return 0;
        }

        StethoRealmFieldType getColumnType(long columnIndex) {
            return null;
        }

        boolean isNull(long columnIndex) {
            return false;
        }

        boolean isNullLink(long columnIndex) {
            return false;
        }

        long getLong(long columnIndex) {
            return 0;
        }

        boolean getBoolean(long columnIndex) {
            return false;
        }

        float getFloat(long columnIndex) {
            return 0;
        }

        double getDouble(long columnIndex) {
            return 0;
        }

        Date getDate(long columnIndex) {
            return null;
        }

        String getString(long columnIndex) {
            return null;
        }

        byte[] getBinaryByteArray(long columnIndex) {
            return null;
        }

        long getLink(long columnIndex) {
            return 0;
        }

        LinkView getLinkList(long columnIndex) {
            return null;
        }
    }
}
