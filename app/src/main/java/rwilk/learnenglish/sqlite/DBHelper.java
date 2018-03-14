package rwilk.learnenglish.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    private static final String TAG = "DBHelper";

    //Database name
    private static final String DATABASE = "learn_english";

    //Table names
    private static final String TABLE_WORDS = "words";
    private static final String TABLE_LESSONS = "lessons";
    private static final String TABLE_COURSES = "courses";

    //Table words column names
    private static final String ID_WORD = "idWord";
    //private static final String ID_LESSON = "idLesson";
    private static final String POLISH_WORD = "polishWord";
    private static final String ENGLISH_WORD = "englishWord";
    private static final String PART_OF_SPEECH = "partOfSpeech";
    private static final String SENTENCE_ENGLISH = "sentenceEN";
    private static final String SENTENCE_POLISH = "sentencePL";
    private static final String PROGRESS = "progress";
    private static final String SAVED = "saved";
    private static final String INFO = "info";

    //Table lessons column names
    private static final String ID_LESSON = "idLesson";
    //private static final String ID_COURSE = "idCourse";
    private static final String ENGLISH_LESSON_NAME = "englishLessonName";
    private static final String POLISH_LESSON_NAME = "polishLessonName";
    private static final String LESSON_IMAGE_ID = "lessonImageId";

    //Table courses column names
    private static final String ID_COURSE = "idCourse";
    private static final String ENGLISH_COURSE_NAME = "englishCourseName";
    private static final String POLISH_COURSE_NAME = "polishCourseName";
    private static final String COURSE_IMAGE_ID = "courseImageId";

    private static final String CREATE_TABLE_COURSES = "CREATE TABLE IF NOT EXISTS "
            + TABLE_COURSES + "("
            + ID_COURSE + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ENGLISH_COURSE_NAME + " TEXT NOT NULL, "
            + POLISH_COURSE_NAME + " TEXT NOT NULL, "
            + COURSE_IMAGE_ID + " TEXT"
            + ");";

    private static final String CREATE_TABLE_LESSONS = "CREATE TABLE IF NOT EXISTS "
            + TABLE_LESSONS + "("
            + ID_LESSON + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ID_COURSE + " INTEGER NOT NULL, "
            + ENGLISH_LESSON_NAME + " TEXT NOT NULL, "
            + POLISH_LESSON_NAME + " TEXT NOT NULL, "
            + LESSON_IMAGE_ID + " TEXT"
            + ");";

    private static final String CREATE_TABLE_WORDS = "CREATE TABLE IF NOT EXISTS "
            + TABLE_WORDS + "("
            + ID_WORD + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + ID_LESSON + " INTEGER NOT NULL, "
            + POLISH_WORD + " TEXT NOT NULL, "
            + ENGLISH_WORD + " TEXT NOT NULL, "
            + PART_OF_SPEECH + " TEXT, "
            + SENTENCE_ENGLISH + " TEXT, "
            + SENTENCE_POLISH + " TEXT, "
            + PROGRESS + " INTEGER DEFAULT 0, "
            + SAVED + " INTEGER DEFAULT 0, "
            + INFO + " TEXT"
            + ");";

    private static int databaseVersion = 1;

    public DBHelper(Context context){
        super(context, DATABASE, null, databaseVersion);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(TAG, "onCreate");
        db.execSQL(CREATE_TABLE_COURSES);
        db.execSQL(CREATE_TABLE_LESSONS);
        db.execSQL(CREATE_TABLE_WORDS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Log.d(TAG, "onUpgrade");
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }


}
