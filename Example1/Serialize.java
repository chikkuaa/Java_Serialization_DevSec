import java.io.*;
class Serialize {
    public static void main(String args[]){
        try{
            //Creating the Item Object
            Item s1=new Item(123,"book");
            FileOutputStream fout=new FileOutputStream("data.ser");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //Closing the stream
            out.close();
            System.out.println("Serialized data saved to the file 'data.ser'");
        }catch(Exception e){
            System.out.println(e);       
        }
    }    
}
