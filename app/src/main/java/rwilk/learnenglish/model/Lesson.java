package rwilk.learnenglish.model;

import java.io.Serializable;

public class Lesson implements Serializable {

    private long idLesson;
    private long idCourse;
    private String englishLessonName;
    private String polishLessonName;
    private String lessonImageId;

    public long getIdLesson() {
        return idLesson;
    }

    public void setIdLesson(long idLesson) {
        this.idLesson = idLesson;
    }

    public long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(long idCourse) {
        this.idCourse = idCourse;
    }

    public String getEnglishLessonName() {
        return englishLessonName;
    }

    public void setEnglishLessonName(String englishLessonName) {
        this.englishLessonName = englishLessonName;
    }

    public String getPolishLessonName() {
        return polishLessonName;
    }

    public void setPolishLessonName(String polishLessonName) {
        this.polishLessonName = polishLessonName;
    }

    public String getLessonImageId() {
        return lessonImageId;
    }

    public void setLessonImageId(String lessonImageId) {
        this.lessonImageId = lessonImageId;
    }
}
