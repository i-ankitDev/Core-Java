

public class Missing_elements_in_an_array
{

    public static void main(String[] args)
    {
        int [] arr= {1,2,9,19};

        int i=0;
        int j=1;

        do {

            if(arr[i]==j)
            {
                j++;
                i++;
            }
            while (j<arr[i])
            {
                System.out.println(j);
                j++;
            }

        } while (i<arr.length-1);
    }

}
