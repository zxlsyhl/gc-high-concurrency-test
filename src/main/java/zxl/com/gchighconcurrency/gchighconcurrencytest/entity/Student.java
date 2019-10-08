package zxl.com.gchighconcurrency.gchighconcurrencytest.entity;

public class Student {
    private int stuId;
    private String stuName;
    private int age;
    private String className;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student() {
    }

    public Student(int stuId, String stuName, int age, String className) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.age = age;
        this.className = className;
    }
}
