package OOPS;
class Pokemon{
    String type;
    int power;
    Pokemon(String type , int power){
        this.type=type;
        this.power=power;
    }
    Pokemon(){

    }
    void print() {
        System.out.print(
                this.type
        );
    }

}

class StrongPokemon extends Pokemon{
    String speed;
}

class LegendaryPokemon extends Pokemon{
    String ability;
}

class GodPokemon extends LegendaryPokemon{
    String tag;
}

public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon ();
        mewtwo.power=1000;
        mewtwo.type="I don't know";
        mewtwo.ability="Urna";
    }
}
