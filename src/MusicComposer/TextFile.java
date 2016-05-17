/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicComposer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;

/**
 * 
 * @author cssartori
 */
public class TextFile {
    
    
    public static final String NEW_LINE = "\n";
    private static final String EMPTY_STRING = "";
    public static final boolean SUCCESS = true;
    public static final boolean FAILURE = false;
    public static final String TEXT_FILE_EXTENSION = "txt";
    /*Armazena a referência ao arquivo atualmente escolhido*/
    private File chosenFile;

    public TextFile(File file) {
        chosenFile = file;
    }
    
    public void setFile(String path) {
        chosenFile=new File(path);
    }

    public boolean exists(){
        return chosenFile.exists();
    }

    public boolean createTextFile()
    {
        try{
            if(chosenFile.exists())
                chosenFile.delete();
            return chosenFile.createNewFile();
        }
        catch(IOException e){
            return false;
        }
    }
    
    public String getFileName(){
        if(chosenFile == null)
            return "";
        return chosenFile.getName();
    }

    public void CloseFile() {
        chosenFile = null;
    }
    
    public boolean isOpened(){
        if(chosenFile==null)
            return false;
        else
            return true;
    }

    public String ReadFile() throws IOException {

        String text = EMPTY_STRING, line;
        BufferedReader fileToRead;

        try {
            fileToRead = new BufferedReader(new FileReader(chosenFile));
            //System.out.println("READING....\n");
            while ((line = fileToRead.readLine()) != null) {
                text += line + NEW_LINE;
            }
            fileToRead.close();
        } catch (IOException e) {
            throw e;
        }

        return text;
    }

    public void WriteFile(String textoToWrite) throws IOException {

        BufferedWriter fileToWrite;

        try {
            fileToWrite = new BufferedWriter(new FileWriter(chosenFile));
            System.out.println(textoToWrite);
            String splittedByLines[] = textoToWrite.split(NEW_LINE);

            for(String temp : splittedByLines){
                fileToWrite.write(temp);
                fileToWrite.newLine();
            }

            fileToWrite.close();
        } catch (IOException e) {
            throw e;
        }

    }
    
    private boolean hasTextExtension(){
        int i = chosenFile.getName().lastIndexOf('.')+1;
        
        for(int j=0;i<chosenFile.getName().length()-1;i++,j++){
            if(chosenFile.getName().charAt(i)!= TEXT_FILE_EXTENSION.charAt(j))
                return false;
        }
        return true;
    }
    
    public void setTextExtension(){
        if(hasTextExtension()){
            return;
        }
        setFile(getFileName()+"."+TEXT_FILE_EXTENSION);
                
    }

}
