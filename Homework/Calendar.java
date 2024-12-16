import java.util.ArrayList;
import java.util.List;


class Calendar implements NoteBook {
    List<String> notes = new ArrayList<>();

    @Override
    public void addNote(String note) {
        notes.add(note);
        System.out.println("Заметка успешно добавлена!");
    }

    @Override
    public void deleteNote(int index){
        notes.remove(index);
        System.out.println("Заметка успешно удалена!");
    }
}
