class ByReference{
    int id;
    String name;
}
class TestStudent{
    public static void main(String args[]){

        ByReference R1=new ByReference();
        ByReference R2=new ByReference();
        //Initializing objects
        R1.id=101;
        R1.name="Sonoo";
        R2.id=102;
        R2.name="Amit";
        System.out.println(R1.id+" "+R1.name);
        System.out.println(R2.id+" "+R2.name);
    }
}