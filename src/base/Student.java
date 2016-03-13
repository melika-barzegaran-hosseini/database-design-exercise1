package base;

public class Student
{
    private int sid;
    private String name;
    private String major;
    private boolean gender;

    public Student(int sid, String name, String major, boolean gender)
    {
        this.sid = sid;
        this.name = name;
        this.major = major;
        this.gender = gender;
    }

    public int getSid()
    {
        return sid;
    }

    public void setSid(int sid)
    {
        this.sid = sid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMajor()
    {
        return major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public boolean getGender()
    {
        return gender;
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "sid=" + sid + ", " +
                "name='" + name + "', " +
                "major='" + major + "', " +
                "gender=" + gender +
                "}";
    }
}