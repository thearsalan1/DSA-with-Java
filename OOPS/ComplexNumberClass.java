package OOPS;

class ComplexNumber{
    int real;
    int img;
    ComplexNumber(int real, int img){
        this.real=real;
        this.img=img;
    }
    void print(){
        System.out.println(real+" "+(img>0?"+":"-")+" "+Math.abs(img)+" "+"i");
    }

    void add(ComplexNumber z2){
        real += z2.real;
        img +=z2.img;
    }
}

public class ComplexNumberClass {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(3,-1);
        cn.print();
        ComplexNumber z2 = new ComplexNumber(2,8);
        cn.add(z2);
        cn.print();
    }

}
