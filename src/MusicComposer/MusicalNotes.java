/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

import java.util.*;

/**
 *
 * @author Hyago
 */
public class MusicalNotes {

    /*
     *                      NOTAS:
     * Constantes com a representação de cada nota básica
     */
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


    /*
     * Constantes para uso no arquivo texto de mapeamento
     */
    public static final String MAPPING_FILE_NAME = "mapping.txt";
    private static final String OCTAVE = "OC";
    private static final String DURACTION = "DU";
    private static final String NEW_LINE = "\n";
    private static final String DEFAULT_MAPPING = "OC 0 1 2 3 4 5 6 7 8 9\n"
            + "DU W H Q I S X O w h q i s x o\n"
            + "C C c V v \\ :\n"
            + "C# Y y ? $ % < >\n"
            + "D D d J j ( )\n"
            + "Eb U u L l -\n"
            + "E E e R r _ ^\n"
            + "F F f Z z = [ ]\n"
            + "F# K k ! ~ + { }\n"
            + "G G g t T & '\n"
            + "G# N M n m /\n"
            + "A A a @ # \"\n"
            + "Bb P p , ;\n"
            + "B B b . * |\n";


    /*
     *              Vetores de mapeamento de cada NOTA
     */

    /*Vetores das oitavas e durações*/
    private static List<Character> OCTAVES = new ArrayList<>();
    private static List<Character> DURATIONS = new ArrayList<>();

    /*Vetores de cada uma das 12 notas*/
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

    public static boolean setMappingFromFile() {

        TextFile mappingFile = new TextFile(null);
        mappingFile.setFile(MAPPING_FILE_NAME);

        String mappingFileOutput;

        try {
            mappingFileOutput = mappingFile.ReadFile();
        } catch (Exception e) {
            return false;
        }

        String allNotesList[] = mappingFileOutput.split(NEW_LINE);

        for (int i = 0; i < allNotesList.length; i++) {
            String oneNoteMap[] = allNotesList[i].split(PAUSE_NOTE);
            switch (oneNoteMap[0]) {
                case OCTAVE:
                    for (int j = 1; j < oneNoteMap.length; j++) {
                        OCTAVES.add(oneNoteMap[j].charAt(0));
                    }
                    break;
                case DURACTION:
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
                case NEW_LINE:
                    continue;

                default:
                    return false;
            }
        }

        return true;
    }

    public static boolean createMapFile() {
        String basicMapping = DEFAULT_MAPPING;
        TextFile mapFile = new TextFile(null);
        mapFile.setFile(MAPPING_FILE_NAME);

        if (mapFile.createTextFile()) {
            try {
                mapFile.WriteFile(basicMapping);
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }

        return true;
    }
}
