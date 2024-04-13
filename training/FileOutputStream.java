import java.io.FileOutputStream;
class FileOutputStream{
public static void main(String args[]){
String s="hello";
try{
FileOutputStream fout=new FileOutputStream("C:\\testout.txt");
byte[] b=s.getBytes();
fout.write(b);
fout.flush();
fout.close();
System.out.println("success...");
}
catch(Exception e)
{
System.out.println(e);
}
}
}

