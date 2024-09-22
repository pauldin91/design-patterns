package clean.code.creational.singleton;

import java.io.*;

public class Saver {
    public <K extends Serializable> void  saveTo(String filename, K cs) throws Exception
    {
        try(FileOutputStream fout = new  FileOutputStream(filename);
            ObjectOutputStream out= new ObjectOutputStream(fout))
        {
                    out.writeObject(cs);

        }
    }
    public <K extends Serializable> K readFrom(String filename) throws Exception
    {
        try(FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream in= new ObjectInputStream(fin))
        {
            return (K)in.readObject();

        }
    }
}
