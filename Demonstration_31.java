class Demonstration_31{
public static void main(String atgs[]){
Circle c1 = new Circle();
Circle c2 = new Circle();
Box B= new Box();
c1.x = 0.0;
c1.y = 0.0;
c1.r = 5.0;
c2.x = 0.0;
c2.y = 0.0;
c2.r = 6.0;
B.h=5;
B.l=4;
B.w=6;
System.out.println(c1.area());
System.out.println(c1.circumference());
System.out.println(c2.area());
System.out.println(c2.circumference());
System.out.println(B.volume());
}
}