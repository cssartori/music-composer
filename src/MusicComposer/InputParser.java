package MusicComposer;

import java.util.*;

/**
 * Class that holds the parser of begginer's inputs. It transforms a free formated text into a 
 * valid music so that JFugue can play it. In order to do that, it makes use of the mapping-key file.
 * @author cssartori
 */
public class InputParser {
    
    /*Parses a string and returns a JFugue playable music based on the MusicalMap used*/
    public static String parse(String NotesToParse) {
        List<String> MapOfNotes = (MusicalMap.getMap());

        String ParsedNotes = MusicalNotes.PAUSE_NOTE;

        for (int i = 0; i < NotesToParse.length(); i++) {

            if (isCharOutOfMap(NotesToParse.charAt(i))) {
                ParsedNotes = ParsedNotes.concat(MusicalNotes.PAUSE_NOTE);
            } else {
                if (isOctaveChar(NotesToParse.charAt(i))
                        || isDurationChar(NotesToParse.charAt(i))) {
                    ParsedNotes += MapOfNotes.get(NotesToParse.charAt(i));
                    if (!(isLastChar(i, NotesToParse))
                            && (isOctaveChar(NotesToParse.charAt(i + 1)))) {
                        ParsedNotes = ParsedNotes.concat(MusicalNotes.PAUSE_NOTE);
                    }
                } else if (isPauseNote(NotesToParse.charAt(i))) {
                    ParsedNotes = ParsedNotes.concat(MusicalNotes.PAUSE_NOTE);
                } else {
                    ParsedNotes = ParsedNotes.concat(MusicalNotes.PAUSE_NOTE);
                    ParsedNotes = ParsedNotes.concat(MapOfNotes.get(NotesToParse.charAt(i)));
                }
            }
        }

        return ParsedNotes;
    }

    private static boolean isCharOutOfMap(char checkChar) {
        if ((checkChar < MusicalMap.MAP_MIN_INDEX) || (checkChar > MusicalMap.MAP_MAX_INDEX)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isLastChar(int cIndex, String checkString) {
        if (cIndex + 1 == checkString.length()) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isDurationChar(char checkChar) {
        if ((Character.isAlphabetic(checkChar))
                && (MusicalNotes.getDuractions().contains(checkChar))) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isOctaveChar(char checkChar) {
        if (Character.isDigit(checkChar)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPauseNote(char checkChar) {
        String temp = Character.toString(checkChar);

        if (temp.equals(MusicalNotes.PAUSE_NOTE)) {
            return true;
        } else {
            return false;
        }
    }
}
