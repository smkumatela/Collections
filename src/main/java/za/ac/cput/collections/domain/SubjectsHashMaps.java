package za.ac.cput.collections.domain;

/**
 * Created by Songezo on 2016-03-10.
 */
public class SubjectsHashMaps {

    private String subjectName;
    private String subjectCode;

    public SubjectsHashMaps() {
    }

    public SubjectsHashMaps(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "SubjectsHashMaps{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                '}';
    }
}
