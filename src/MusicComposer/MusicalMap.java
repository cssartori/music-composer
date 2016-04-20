
package MusicComposer;

import java.util.ArrayList;
import java.util.List;


public class MusicalMap {

    private static final int MAP_SIZE = 256;
    public static final int MAP_MAX_INDEX = MAP_SIZE-1;
    public static final int MAP_MIN_INDEX = 0;
    private static final List<String> Map = new ArrayList<>();

    public static void initializeMap() {
        /*Inicializa o vetor mapa de notas com a nota básica de Pausa (por default: Espaço em Branco)*/
        for (int i = 0; i < MAP_SIZE; i++) {
            Map.add(MusicalNotes.PAUSE_NOTE);
        }
    }

    public static List<String> getMap() {
        return Map;
    }

    public static void AddNotesToMap() {
        /*
         *A partir do vetor de mapeamento de cada nota, obtem os caracteres que
         * representam cada uma e insere no vetor mapa de notas na posição de índice
         * igual ao valor ASCII deste caractere em questão
         *
         * Map.set(Indice(ASCII), Nota)
         */

        for (char mappedChar : MusicalNotes.getANotes()) {
            Map.set(mappedChar, MusicalNotes.A_NOTE);
        }

        for (char mappedChar : MusicalNotes.getBNotes()) {
            Map.set(mappedChar, MusicalNotes.B_NOTE);
        }

        for (char mappedChar : MusicalNotes.getBbNotes()) {
            Map.set(mappedChar, MusicalNotes.Bb_NOTE);
        }

        for (char mappedChar : MusicalNotes.getCSharpNotes()) {
            Map.set(mappedChar, MusicalNotes.CSharp_NOTE);
        }

        for (char mappedChar : MusicalNotes.getCNotes()) {
            Map.set(mappedChar, MusicalNotes.C_NOTE);
        }

        for (char mappedChar : MusicalNotes.getDNotes()) {
            Map.set(mappedChar, MusicalNotes.D_NOTE);
        }

        for (char mappedChar : MusicalNotes.getENotes()) {
            Map.set(mappedChar, MusicalNotes.E_NOTE);
        }

        for (char mappedChar : MusicalNotes.getEbNotes()) {
            Map.set(mappedChar, MusicalNotes.Eb_NOTE);
        }

        for (char mappedChar : MusicalNotes.getFSharpNotes()) {
            Map.set(mappedChar, MusicalNotes.FSharp_NOTE);
        }

        for (char mappedChar : MusicalNotes.getFNotes()) {
            Map.set(mappedChar, MusicalNotes.F_NOTE);
        }

        for (char mappedChar : MusicalNotes.getGSharpNotes()) {
            Map.set(mappedChar, MusicalNotes.GSharp_NOTE);
        }

        for (char mappedChar : MusicalNotes.getGNotes()) {
            Map.set(mappedChar, MusicalNotes.G_NOTE);
        }

        for (char mappedChar : MusicalNotes.getOctaves()) {
            Map.set(mappedChar, Character.toString(mappedChar));
        }

        for (char mappedChar : MusicalNotes.getDuractions()) {
            Map.set(mappedChar, Character.toString(mappedChar));
        }
    }
}
