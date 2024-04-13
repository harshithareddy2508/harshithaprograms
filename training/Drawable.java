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
System.out.println("harshitha"+length);
}
};
d.draw();
}}




