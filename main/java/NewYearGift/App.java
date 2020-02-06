package NewYearGift;

public class App
{
	public static void main( String[] args )
    {
        Student stu = new Student();
        Chocolates c = new Chocolates();
        c.weight = 40;
        OtherSweets o = new OtherSweets();
        o.weight = 600;
          stu.name = "A";
          System.out.println(stu.name);
        System.out.println("total weight");
        int sum = c.weight + o.weight;
        System.out.println(c.weight + o.weight + "grm");
        System.out.println("\n");


        Student student2 = new Student();
        Chocolates a = new Chocolates();
        OtherSweets ob = new OtherSweets();
        a.weight = 50;
        ob.weight = 900;
        student2.name = "B";
        System.out.println(student2.name);
        System.out.println("total weight");
        System.out.println(a.weight + ob.weight + "grm");
        System.out.println("\n");


        Student student3 = new Student();
        student3.name = "C";
        Chocolates q = new Chocolates();
        OtherSweets z = new OtherSweets();
        Chocolates g = new Chocolates();
        q.weight = 90;
        g.weight = 60;
        z.weight = 500;
        System.out.println(student3.name);
        System.out.println("total weight");
        System.out.println(q.weight + g.weight + z.weight + "grm");


    }
}
