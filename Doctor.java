package c;

public class Doctor implements Student,Teacher {
	String name;
    String gender;
    String age;
    int Fare;
    double Salary;

    public Doctor(String name, String gender, String age, int Fare, int Salary) {

    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

     public int getFare(){
        return Fare;
    }
    public void setXue(int Fare) {
        this.Fare = Fare;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String toString() {
        return "����: " + name + " �Ա�: " + gender + " ����: " + age + " ÿѧ��ѧ�� " + Fare+ " ÿ��нˮ: " + Salary;
    }

    public int payFare(int a) {
        return a;
    }

    public int chackFare(int b) {
        return b;
    }

    public double getSalary(double c) {
        return c;
    }

    public double chackSalary(double d) {
        return d;
    }


}
