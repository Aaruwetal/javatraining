class Test 
{
int i;
Test()
{
i=i+1;
j=j+1;
}
void show()
{
System.out.println(i);
}
}
class DemoStatic
{
public static void main(String[] args)
{
Test t1.=new Test();
Test t2.=new Test();
Test t3.=new Test();
t1.show();
t2.show();
t3.show();
}
}

