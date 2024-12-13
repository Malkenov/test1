public class Cat extends Pet {

    Cat(){
        super(4);
    }
    public void catchMouse() {
        System.out.println("Поймала мышку!");
    }

    @Override
    public void giveVoice(){
        System.out.println("Мяу!");
    }
}

