package com.devdream.diverjoy.consts;

public final class Consts {

    public static final String APP_NAME = "DiverJoy";

    public final class Database {
        public static final String NAME = "com_devdream_diverjoy";
        public static final int SCHEMA_VERSION = 3;
    }

    public final class Assets {
        private static final String ASSETS_DIR = "file:///android_asset/";

        public static final String IMAGES = ASSETS_DIR + "images/";
    }

    public final class LogTag {
        public static final String DEBUG = "MEW";
        public static final String INFO = APP_NAME + "MEW_INFO";
        public static final String ERROR = APP_NAME + "MEW_ERROR";
    }

    public final class Games {
        public static final String TABOO = "taboo";
        public static final String MIME = "mime";
        public static final String I_NEVER = "inever";
    }
}
