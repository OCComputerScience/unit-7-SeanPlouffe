package Notes;

public class Main
{

    public static void main(String[] args)
    {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printArray(numbers);

        printArray(getIndexSumThing(numbers, 16));

    }

    private static int[] getIndexSumThing(int[] numbers, int target)
    {
        if(numbers.length == 0)
        {
            return new int[]{-1, -1};
        }

        int currTotal = 0;

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i; j < numbers.length; j++)
            {
                currTotal += numbers[j];

                if(currTotal == target)
                {
                    return new int[] {i+1, j+1};
                }
                else if(currTotal > target)
                {
                    currTotal = 0;
                    break;
                }

            }

            if(currTotal < target)
            {
                break;
            }

        }

        return new int[] {-1, -1};

    }

    private static void printArray(int[] array)
    {
        for(Object element : array)
        {
            System.out.println(element);
        }

    }

}
