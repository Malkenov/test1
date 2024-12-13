public class Dog extends Pet {

    Dog() {
        super(4);
    }

    public void bringStick() {
        System.out.println("Принести палку!");
    }

    @Override
    public void giveVoice() {
        System.out.println("Гав!");
    }
}
