public class Lista6
{
    static boolean isEqual1(int m, int n)
    {
        return m == n;
    }

    static boolean isEqual2(Integer m, Integer n)
    {
        return m == n;
    }


    public static void main(String[]args)
    {
        /* W pierwszym przypadku porównujemy tożsamościowe typy proste, zatem wynikiem będzie true.
        *  W drugim przypadku porównujemy tożsamościowo 2 różne obiekty, zatem wynikiem będzie false.*/
        System.out.println(isEqual1(500,500)); //true
        System.out.println(isEqual2(500,500)); //false


        String s1 = "foo";
        String s2 = "foo";
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true
        String s3 = new String("foo");
        System.out.println(s1 == s3); //false
        System.out.println(s1.equals(s3)); //true




        int [] ints = {1,2,3};
         for(int i : ints)
         {
             System.out.println(i);
             i = 0;
         }

         for(int i : ints)
             System.out.println(i);

         int [] ints2 = ints;

        for (int i = 0; i < ints2.length; i++)
        {
            System.out.println(ints2[i]);
            ints2[i] = -1;
        }

        for(int i : ints)
            System.out.println(i);


    }
}
