package OOPS;

class Fraction{
    int num;
    int den;
    Fraction(int num, int den){
        this.num=num;
        this.den=den;
        simplify();
    }

    void add(Fraction x){
        num = this.num * x.den + x.num * this.den;
        den = this.den * x.den;
        simplify();
        System.out.println(num+"/"+den);

    }

    void multiply(Fraction x){
        num= this.num * x.num;
        den = this.den * x.den;
        simplify();
        System.out.println(num+"/"+den);
    }

    void divide(Fraction x){
        num = this.num * x.den;
        den = this.den * x.num;
        simplify();
        System.out.println(num+"/"+den);
        simplify();
    }

    void print(){
        System.out.println(num+"/"+den);
        simplify();
    }

    void simplify(){
        int gcd = hcf(this.num,this.den);
        this.num = this.num/gcd;
        this.den = this.den/gcd;
    }

    int hcf(int a, int b){
        if(a==0) return b;
        return hcf(b%a,a);
    }
}

public class FractionClass {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,7);
        f1.print();
        Fraction f2 = new Fraction(3,7);
        f2.add(f2);
        f1.multiply(f2);
        f1.divide(f1);
    }
}
