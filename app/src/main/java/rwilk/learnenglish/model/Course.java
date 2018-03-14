package rwilk.learnenglish.model;

import java.io.Serializable;

public class Course implements Serializable {

    private long idCourse;
    private String englishCourseName;
    private String polishCourseName;
    private String courseImageId;

    public long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(long idCourse) {
        this.idCourse = idCourse;
    }

    public String getEnglishCourseName() {
        return englishCourseName;
    }

    public void setEnglishCourseName(String englishCourseName) {
        this.englishCourseName = englishCourseName;
    }

    public String getPolishCourseName() {
        return polishCourseName;
    }

    public void setPolishCourseName(String polishCourseName) {
        this.polishCourseName = polishCourseName;
    }

    public String getCourseImageId() {
        return courseImageId;
    }

    public void setCourseImageId(String courseImageId) {
        this.courseImageId = courseImageId;
    }
}
