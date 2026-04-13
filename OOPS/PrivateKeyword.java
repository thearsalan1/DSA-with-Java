package OOPS;
class Students{
    String name;
    private int rno=1;
    double cgpa;
    void print(){
        System.out.println(rno);
    }
    int getRollNo(){
        return rno;
    }
    void setRno(int n){
        rno=n;
    }

}
public class PrivateKeyword {
    public static void main(String[] args) {
        Students st = new Students();
        st.cgpa=9;
        st.name="ARSALAN";
        System.out.println(st.getRollNo());
        st.setRno(4);
        System.out.println(st.getRollNo());
    }
} 