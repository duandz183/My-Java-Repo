package Ex4_6;
class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}