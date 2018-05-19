package comfajarazay.httpsgithub.mynotesapp.db;

import android.provider.BaseColumns;

/**
 * Created by FAJAR SEPTIAN on 2018-05-15.
 *
 * @Author Fajar Septian
 * @Email fajarajay10@gmail.com
 * @Github https://github.com/fajarazay
 */

public class DatabaseContract {
    static String TABLE_NOTE = "note";
    static final class NoteColumns implements BaseColumns {
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";
    }
}
