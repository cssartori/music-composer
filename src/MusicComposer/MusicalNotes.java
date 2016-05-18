/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

import java.util.*;

/**
 * Class that holds the notes and the mapping-key file.
 * @author cssartori
 */
public class MusicalNotes {

    /* NOTES: Constants with the representation of each basic JFugue Note*/
    public static final String C_NOTE = "C";
    public static final String CSharp_NOTE = "C#";
    public static final String D_NOTE = "D";
    public static final String Eb_NOTE = "Eb";
    public static final String E_NOTE = "E";
    public static final String F_NOTE = "F";
    public static final String FSharp_NOTE = "F#";
    public static final String G_NOTE = "G";
    public static final String GSharp_NOTE = "G#";
    public static final String A_NOTE = "A";
    public static final String Bb_NOTE = "Bb";
    public static final String B_NOTE = "B";
    public static final String PAUSE_NOTE = " ";

    /*Constants for usage in the mapping-key file*/
    public static final String MAPPING_FILE_NAME = "mapping.txt";
    private static final String OCTAVE = "OC";
    private static final String DURATION = "DU";
    
    private static final String DEFAULT_MAPPING = 
            OCTAVE + " 0 1 2 3 4 5 6 7 8 9\n"
            + DURATION + " W H Q I S X O w h q i s x o\n"
            + C_NOTE + " C c V v \\ :\n"
            + CSharp_NOTE + " Y y ? $ % < >\n"
            + D_NOTE + " D d J j ( )\n"
            + Eb_NOTE + " U u L l -\n"
            + E_NOTE + " E e R r _ ^\n"
            + F_NOTE + " F f Z z = [ ]\n"
            + FSharp_NOTE + " K k ! ~ + { }\n"
            + G_NOTE + " G g t T & '\n"
            + GSharp_NOTE + " N M n m /\n"
            + A_NOTE + " A a @ # \"\n"
            + Bb_NOTE + " P p , ;\n"
            + B_NOTE + " B b . * |\n";


    
    /*Below are the arrays with the mapping of each note read from the mapping-key file*/    
    /*Arrays for the octaves and durations*/
    private static List<Character> OCTAVES = new ArrayList<>();
    private static List<Character> DURATIONS = new ArrayList<>();

    /*Arrays for each of the twelve notes available*/
    private static List<Character> CNotes = new ArrayList<>();
    private static List<Character> CSharpNotes = new ArrayList<>();
    private static List<Character> DNotes = new ArrayList<>();
    private static List<Character> EbNotes = new ArrayList<>();
    private static List<Character> ENotes = new ArrayList<>();
    private static List<Character> FNotes = new ArrayList<>();
    private static List<Character> FSharpNotes = new ArrayList<>();
    private static List<Character> GNotes = new ArrayList<>();
    private static List<Character> GSharpNotes = new ArrayList<>();
    private static List<Character> ANotes = new ArrayList<>();
    private static List<Character> BbNotes = new ArrayList<>();
    private static List<Character> BNotes = new ArrayList<>();

    public static List<Character> getCNotes() {
        return CNotes;
    }

    public static List<Character> getCSharpNotes() {
        return CSharpNotes;
    }

    public static List<Character> getDNotes() {
        return DNotes;
    }

    public static List<Character> getEbNotes() {
        return EbNotes;
    }

    public static List<Character> getENotes() {
        return ENotes;
    }

    public static List<Character> getFNotes() {
        return FNotes;
    }

    public static List<Character> getFSharpNotes() {
        return FSharpNotes;
    }

    public static List<Character> getGNotes() {
        return GNotes;
    }

    public static List<Character> getGSharpNotes() {
        return GSharpNotes;
    }

    public static List<Character> getANotes() {
        return ANotes;
    }

    public static List<Character> getBbNotes() {
        return BbNotes;
    }

    public static List<Character> getBNotes() {
        return BNotes;
    }

    public static List<Character> getOctaves() {
        return OCTAVES;
    }

    public static List<Character> getDuractions() {
        return DURATIONS;
    }

    /*Reads the mapping-key file and fills the arrays with the mapping for each note*/
    public static boolean setMappingFromFile() {

        TextFile mappingFile = new TextFile(null);
        mappingFile.setFile(MAPPING_FILE_NAME);

        String mappingFileOutput;

        try {
            mappingFileOutput = mappingFile.readFile();
        } catch (Exception e) {
            return false;
        }

        String allNotesList[] = mappingFileOutput.split(Constants.NEW_LINE);

        for (int i = 0; i < allNotesList.length; i++) {
            String oneNoteMap[] = allNotesList[i].split(PAUSE_NOTE);
            switch (oneNoteMap[0]) {
                case OCTAVE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        OCTAVES.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case DURATION:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        DURATIONS.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case C_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        CNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case CSharp_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        CSharpNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case D_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        DNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case Eb_NOTE:

                    for (int j = 1; j < oneNoteMap.length; j++) {
                        EbNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case E_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        ENotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case F_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        FNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case FSharp_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        FSharpNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case G_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        GNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case GSharp_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        GSharpNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case A_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        ANotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case Bb_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        BbNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case B_NOTE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        BNotes.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case PAUSE_NOTE:
                case Constants.NEW_LINE:
                    continue;

                default:
                    return false;
            }
        }

        return true;
    }
    
    /*Creates the default mapping-key file*/
    public static boolean createMapFile() {
        String basicMapping = DEFAULT_MAPPING;
        TextFile mapFile = new TextFile();
        mapFile.setFile(MAPPING_FILE_NAME);

        if (mapFile.createTextFile()) {
            try {
                mapFile.writeFile(basicMapping);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }
}
