package PersistanceLayer;

import android.util.Log;
import android.widget.TextView;

import com.example.kushal.Handy.DataInterface;
import com.example.kushal.Handy.Note;

import java.util.ArrayList;

/**
 * Created by rishabhbhandari on 2016-02-18.
 */
public class TextNotePL implements DataInterface
{

    static ArrayList<Note> noteList= new ArrayList<Note>();
    public Note myNote;

    public TextNotePL()
    {

    }

    public ArrayList<Note> getNoteList() {
        return noteList;
    }

    public void setNoteList(Note noteObj){

        noteList.add(noteObj);

}


    public void addData(String noteName, String labelName, String note)
    {
        myNote= new Note(noteName,labelName,note);
        noteList.add(myNote) ;
    }

}