import java.io.*;

public class jj{
    public static void main(String[] args){
        //folder creation 

        File file=new File("D:\\java");
        System.out.println(file.exists());
        if(!file.exists()){
            file.mkdir();
            System.out.println("folder created successfully");
        }

        //sub folder creation

        File filef=new File("D:\\java\\sub_folder");
            filef.mkdirs();

        //file creation

        File filee=new File("D:\\java\\sub_folder\\file1.txt");
        if(!filee.exists())
        try{
            filee.createNewFile();
            System.out.println("file created successfully");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        //renaming the file
        File filuu=new File("D:\\java\\sub_folder\\file2.docx");
        if(filee.renameTo(filuu)){
            System.out.println("file renamed successfully");
        }

        //printing file name and checking restrictions
        System.out.println(filuu.getName());
        System.out.println(filuu.canRead());
        System.out.println(filuu.canWrite());
        System.out.println(filuu.canExecute());

        //listing files in your directory
        File fileall=new File("D:");
        String[] flist= fileall.list();
        for(int i=0;i<flist.length;i++)
            System.out.println(flist[i]);
        
        //writing in file
        try{
        FileWriter writer=new FileWriter(filee);
        writer.write("i have created my first file using java >_<.");
        writer.flush();
        writer.close();
        }
        catch(IOException e){
           e.printStackTrace();
        }
        try{
            FileReader reader=new FileReader(filee);
            int output=reader.read();
            while(output!=-1){
                System.out.println("nothing");
            }
            output=reader.read();
            reader.close();
            }
            catch(IOException e){
               e.printStackTrace();
            }
    }
} 