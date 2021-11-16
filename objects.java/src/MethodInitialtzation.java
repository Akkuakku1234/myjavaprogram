class MethodInitialization{
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
class TestStudent1{
    public static void main(String args[]){
        MethodInitialization m1=new MethodInitialization();
        MethodInitialization m2=new MethodInitialization();
        m1.insertRecord(111,"Karan");
        m2.insertRecord(222,"Aryan");
        m1.displayInformation();
        m2.displayInformation();
    }
}
