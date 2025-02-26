public class NewPractic {
    public static void main(String[] args) {
        HogwartsSpells hogwartsSpells = new HogwartsSpells();
        hogwartsSpells.addSpellEvent(1,"летать","улетает с данного место в другое");
        hogwartsSpells.addSpellEvent(2,"невидемый","становиться не видимым");

        System.out.println(hogwartsSpells);

        hogwartsSpells.getSpellEventById(2);

        hogwartsSpells.getSpellEventsByType("летать");

        hogwartsSpells.deleteSpellEvent(2);

        hogwartsSpells.getSpellEventById(3);

        hogwartsSpells.printAllSpellEvents();

    }
}
