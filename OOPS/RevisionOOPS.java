package OOPS;
class Pokemon{
    int no;
    int speed;
    int attack;
    int defence;
    String type;
    String name;
    Pokemon(int no,int speed,int attack,int defence,String type,String name){
        this.no=no;
        this.speed=speed;
        this.attack=attack;
        this.defence=defence;
        this.type=type;
        this.name=name;
    }
        void print() {
            System.out.print(
                    "Name: " + this.name +
                            ", No: " + this.no +
                            ", Speed: " + this.speed +
                            ", Defence: " + this.defence +
                            ", Attack: " + this.attack
            );
        }

}
public class RevisionOOPS {


    public static void main(String[] args) {
        Pokemon Pikachu = new Pokemon(1,100,70,60,"Electric","Pikachu");
    }
}
