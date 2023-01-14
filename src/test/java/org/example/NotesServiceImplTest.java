package org.example;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NotesServiceImplTest {
    Note tempNote1, tempNote2, tempNote3;
    NotesStorage tempNotesStorage;
    NotesServiceImpl tempNotesServiceImpl;
    @BeforeEach
    public void initEach(){
        tempNote1 = new NoteMockup();
        tempNote1.setNote(1);
        tempNote2 = new NoteMockup();
        tempNote2.setNote(2);
        tempNote3 = new NoteMockup();
        tempNote3.setNote(3);
        tempNotesStorage = new NotesStorageMockup();
        tempNotesServiceImpl = NotesServiceImpl.createWith(tempNotesStorage);
    }
    @AfterEach
    public void killEach(){
        tempNote1 = null;
        tempNote2 = null;
        tempNote3 = null;
        tempNotesStorage = null;
        tempNotesServiceImpl = null;
    }
    @Test
    public void testAverageOf1(){
        tempNotesServiceImpl.add(tempNote1);
        assertEquals(1.0, tempNotesServiceImpl.averageOf("test"));
    }
    @Test
    public void testAverageOf2(){
        tempNotesServiceImpl.add(tempNote1);
        tempNotesServiceImpl.add(tempNote2);
        assertEquals(1.5, tempNotesServiceImpl.averageOf("test"));
    }
    @Test
    public void testAverageOf3(){
        tempNotesServiceImpl.add(tempNote1);
        tempNotesServiceImpl.add(tempNote2);
        tempNotesServiceImpl.add(tempNote3);
        assertEquals(2.0, tempNotesServiceImpl.averageOf("test"));
    }
}
