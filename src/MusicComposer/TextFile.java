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
 * Class that encapsulates the basic text file's methods. It represents a text file.
 * @author cssartori
 */
public class TextFile {
        
    public static final String TEXT_FILE_EXTENSION = "txt";
    
    /*Stores the reference to a File*/
    private File chosenFile;

    public TextFile() {
        chosenFile = null;
    }
    
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
            return Constants.EMPTY_STRING;
        return chosenFile.getName();
    }

    public void closeFile() {
        chosenFile = null;
    }
    
    public boolean isOpened(){
        if(chosenFile==null)
            return false;
        else
            return true;
    }

    public String readFile() throws IOException {

        String text = Constants.EMPTY_STRING; 
        String line;
        BufferedReader fileToRead;

        try {
            fileToRead = new BufferedReader(new FileReader(chosenFile));
            while ((line = fileToRead.readLine()) != null) {
                text += line + Constants.NEW_LINE;
            }
            fileToRead.close();
        } catch (IOException e) {
            throw e;
        }

        return text;
    }

    public void writeFile(String textoToWrite) throws IOException {

        BufferedWriter fileToWrite;

        try {
            fileToWrite = new BufferedWriter(new FileWriter(chosenFile));
            String splittedByLines[] = textoToWrite.split(Constants.NEW_LINE);

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
