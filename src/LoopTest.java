public class LoopTest
{
    public static void main(String[] args)
    {
        int[ ] values = {6, 2, 1, 7, 12, 5};

        // triple each element in the array
        for (int val = 0; val < values.length; val ++)
        {
            values[val] = values[val] * 3;
        }

        // TEST!!!  Print out array to see if they changed
        System.out.println("Array after the loop: ");
        for (int val : values)
        {
            System.out.print(val + " ");
        }
    }
}
