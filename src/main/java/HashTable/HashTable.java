package HashTable;

public class HashTable {
    private StudentInfo[] data=new StudentInfo[100];
    public void put(StudentInfo studentInfo){
        int index=studentInfo.hashCode();
        data[index]=studentInfo;
    }
    public StudentInfo get(StudentInfo studentInfo){
        return data[studentInfo.hashCode()];
    }
}
