package src;

import java.util.Iterator;

public class CharIterator implements Iterator<String> {
    public FileContent charIterator;
    private String fromFile = "This is example string"; //To test -remove after write class FileContent

    CharIterator(){
        fromFile = fromFile.toLowerCase();
        String[] splitString = fromFile.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < splitString.length; i++) {
            sb.append(splitString[i]);
        }
        fromFile = sb.toString();
    }

    @Override
    public boolean hasNext() {
        if(fromFile.equals("") || fromFile.equals(" ")){
            return false;
        }
        return true;
    }
    @Override
    public String next() {
        String[] splitString = fromFile.split("");
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i < splitString.length; i++) {
            sb.append(splitString[i]);
        }
        fromFile = sb.toString();
        return splitString[0];
    }
    
}