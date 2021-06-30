import java.io.*;
class Deserialize {
    public static void main(String args[]){
        try{
            //Creating stream to read the object
            ObjectInputStream oin=new ObjectInputStream(new FileInputStream("data.ser"));
            Item s=(Item) oin.readObject();
            //Printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //Closing the stream
            oin.close();
        
        }catch(Exception e){System.out.println(e);}
    }
    
}
