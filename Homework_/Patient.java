public class Patient {
    private String name;
    private int age;
    private String status;


    public Patient(String name,int age,String status){
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus(String status){
        return status;
    }

    public void setStatus(){
        this.status = status;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                '}';
    }
}
