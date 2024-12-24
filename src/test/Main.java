package test;
// ВЫВОД МАССИВА В ОБРАТНОМ ПОРЯДКЕ
public class Main
{
    public static void main (String[] args)
    {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for(int i =array.length -1 ; i >=0 ; i--)
        {
            System.out.println(array [i]);
        }
    }
}