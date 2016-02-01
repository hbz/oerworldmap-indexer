package controllers;

/**
 * Created by pvb on 2/1/16.
 */
import services.DiffReader;
import services.Writable

import java.net.URL;

public class DiffToElasticsearch{

    private static DiffReader mDiffReader;
    private static Writable mEsIndexer;

    public static void index(final URL aDiffUrl){
        // 1. Get Set of entity (Resource) IDs from mDiffReader
        // 2. Re-build last/current version of each entity
        // 3. handle each last to mIndexer
    }

}