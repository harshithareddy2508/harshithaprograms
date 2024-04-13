@FunctionalInterface
interface Drawable
{
 void draw();
}
public class lambdaexpression{
public static void main(String[] args){
int length=10;
Drawable d=new Drawable(){
public void draw(){
System.out.println("harshitha"+" "+length);
}
};
Drawable d1=()->{
System.out.println("gain"+" "+length);
};
d.draw();
d1.draw();
}}




