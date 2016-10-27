package com.devdream.diverjoy.utils;

public interface Consts {

    String APP_NAME = "DiverJoy";

    interface Database {
        String NAME = "com_devdream_diverjoy";
        int SCHEMA_VERSION = 4;
    }

    interface Assets {
        String ASSETS_DIR = "file:///android_asset/";

        String IMAGES = ASSETS_DIR + "images/";
    }

    interface LogTag {
        String DEBUG = "MEW";
        String INFO = APP_NAME + "MEW_INFO";
        String ERROR = APP_NAME + "MEW_ERROR";
    }

    interface Games {
        String TABOO_ID = "taboo";
        String MIME_ID = "mime";
        String I_NEVER_ID = "inever";
    }

    interface Extras {
        String CHOOSE_GAME_ID = "game_choose_id";
    }
}
