package com.uphyca.stetho_realm;

import com.facebook.stetho.inspector.database.DatabaseFilesProvider;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RealmFilesProvider implements DatabaseFilesProvider {

    public RealmFilesProvider(File folder, Pattern databaseNamePattern) {
    }

    @Override
    public List<File> getDatabaseFiles() {

        return null;
    }
}
