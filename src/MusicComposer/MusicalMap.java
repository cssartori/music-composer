package MusicComposer;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that holds the mapping from each keyboard character to a given JFugue note.
 * @author cssartori
 */
public class MusicalMap {
    /*The map size is 256 because a char can represent at most this number of values*/
    private static final int MAP_SIZE = 256;
    /*Maximum and minimum indexes of the map*/
    public static final int MAP_MAX_INDEX = MAP_SIZE-1;
    public static final int MAP_MIN_INDEX = 0;
    /*The map itself*/
    private static final List<String> map = new ArrayList<>();

    public static void initializeMap() {
        /*Initializes the map with all notes being the 'pause note', by default the white space*/
        for (int i = 0; i < MAP_SIZE; i++) {
            map.add(MusicalNotes.PAUSE_NOTE);
        }
    }

    public static List<String> getMap() {
        return map;
    }

    public static void addNotesToMap() {
        /*
         * From the mapping array in MusicalNotes, build the mapping from keyboard keys to JFugue notes.
         * Each note (A, B, C, D, ...) can have one, or more, keys that map to it. All those keys are
         * added to the mapping of that note. The mapping index is the ASCII decimal value of the keyboard
         * char (0-255) and the value stored there is the note.
         *
         * map.set(index(ASCII), Note)
         */
        
        /*Mapping for A notes*/
        for (char mappedChar : MusicalNotes.getANotes()) {
            map.set(mappedChar, MusicalNotes.A_NOTE);
        }
        /*Mapping for B notes*/
        for (char mappedChar : MusicalNotes.getBNotes()) {
            map.set(mappedChar, MusicalNotes.B_NOTE);
        }
        /*Mapping for Bb notes*/
        for (char mappedChar : MusicalNotes.getBbNotes()) {
            map.set(mappedChar, MusicalNotes.Bb_NOTE);
        }
        /*Mapping for C# notes*/
        for (char mappedChar : MusicalNotes.getCSharpNotes()) {
            map.set(mappedChar, MusicalNotes.CSharp_NOTE);
        }
        /*Mapping for C notes*/
        for (char mappedChar : MusicalNotes.getCNotes()) {
            map.set(mappedChar, MusicalNotes.C_NOTE);
        }
        /*Mapping for D notes*/
        for (char mappedChar : MusicalNotes.getDNotes()) {
            map.set(mappedChar, MusicalNotes.D_NOTE);
        }
        /*Mapping for E notes*/
        for (char mappedChar : MusicalNotes.getENotes()) {
            map.set(mappedChar, MusicalNotes.E_NOTE);
        }
        /*Mapping for Eb notes*/
        for (char mappedChar : MusicalNotes.getEbNotes()) {
            map.set(mappedChar, MusicalNotes.Eb_NOTE);
        }
        /*Mapping for F# notes*/
        for (char mappedChar : MusicalNotes.getFSharpNotes()) {
            map.set(mappedChar, MusicalNotes.FSharp_NOTE);
        }
        /*Mapping for F notes*/
        for (char mappedChar : MusicalNotes.getFNotes()) {
            map.set(mappedChar, MusicalNotes.F_NOTE);
        }
        /*Mapping for G# notes*/
        for (char mappedChar : MusicalNotes.getGSharpNotes()) {
            map.set(mappedChar, MusicalNotes.GSharp_NOTE);
        }
        /*Mapping for G notes*/
        for (char mappedChar : MusicalNotes.getGNotes()) {
            map.set(mappedChar, MusicalNotes.G_NOTE);
        }
        /*Mapping for OC notes*/
        for (char mappedChar : MusicalNotes.getOctaves()) {
            map.set(mappedChar, Character.toString(mappedChar));
        }
        /*Mapping for duration notes*/
        for (char mappedChar : MusicalNotes.getDuractions()) {
            map.set(mappedChar, Character.toString(mappedChar));
        }
    }
}
