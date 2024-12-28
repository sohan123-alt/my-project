//Ans.qs.no4
public class StudentProfile {
    String name;
    int id;
    int phonenumber;
    float cgpa;
    StudentProfile(String name,int id,int phonenumber,float cgpa)
    {
        this.name=name;
        this.id=id;
        this.phonenumber=phonenumber;
        this.cgpa=cgpa;
    }
    void  setName(String name,int id,int phonenumber,float cgpa)
    {
        this.name = name;
        this.id=id;
        this.phonenumber=phonenumber;
        this.cgpa=cgpa;
    }
    void getName(String name,int id,int phonenumber,float cgpa)
    {
        this.name = name;
        this.id=id;
        this.phonenumber= phonenumber;
        this.cgpa=cgpa;
    }
    void Studentprofile_info()
    {
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Phone Number:"+phonenumber);
        System.out.println("CGPA:"+cgpa);
    }

    public static void main(String[] args) {
        StudentProfile S=new StudentProfile("SOHAN",250,6166,3.50f);
        S.Studentprofile_info();
    }



}
