import java.util.*;

public class HogwartsSpells {

    Map<Integer, SpellEvent> spellById = new HashMap<>();
    Map<String, List<SpellEvent>> spellsByType = new HashMap<>();



    public void addSpellEvent(int id, String eventType, String actionDescription){
        SpellEvent newSpell = new SpellEvent(id,eventType, actionDescription);
        spellById.put(id, newSpell);

        spellsByType.computeIfAbsent(eventType,k -> new ArrayList<>()).add(newSpell);
    }



    public void getSpellEventById(int id){
        System.out.println(spellById.get(id));
    }



    public void getSpellEventsByType(String eventType){
        if(spellsByType.containsKey(eventType)){
            System.out.println(spellsByType.get(eventType));
        }else{
            System.out.println("Нету такого ключа!");
        }
    }


    public void deleteSpellEvent(int id){
        spellById.remove(id);
    }


    public void printAllSpellEvents(){
        System.out.println(spellsByType);
    }


    @Override
    public String toString() {
        return "HogwartsSpells{" +
                "spellById=" + spellById +
                ", spellsByType=" + spellsByType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsSpells that = (HogwartsSpells) o;
        return Objects.equals(spellById, that.spellById) && Objects.equals(spellsByType, that.spellsByType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spellById, spellsByType);
    }
}
