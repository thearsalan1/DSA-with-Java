package OOPS;

public class UserDefinedDataType {
    public static class Students{
        String name;
        Integer rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Students st = new Students();
        st.name="Arsalan";
        st.cgpa=10;
        st.rno=46;
        System.out.println(st.cgpa);
    }
}
