class ElectronicDevice
{
void on()
{
 System.out.println("on");
}
void off()
{
System.out.println("off");
}
}
class Radio extends ElectronicDevice
{
void fm()
{
System.out.println("fm is on");
}
}
class Tv extends ElectronicDevice
{
void on() 
{
System.out.println("tv is on");
}
void off()
{
System.out.println("tv is off");
}
void tuning()
{
System.out.println("tuning is on");
}

}
class Test
{
public static void main(String args[])
{ 
ElectronicDevice e=new Radio();
e.on();
e.off();
Radio r=(Radio)e;
r.fm();
e=new Tv();
e.on();
e.off();
Tv t=(Tv)e;
t.tuning();
}}


