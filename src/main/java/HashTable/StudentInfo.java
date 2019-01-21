package HashTable;

public class StudentInfo {
    private  int age;
public StudentInfo(int age){
    super();
    this.age=age;
//    this.count=count;
}

    public StudentInfo() {
        super();
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;
    public StudentInfo(int age,int count){
        super();
        this.age=age;
        this.count=count;
    }
    public int hashCode(){
        return  age;
    }
}
