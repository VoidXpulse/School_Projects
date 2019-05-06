public class Eight_Fourteen {
    //Justin Ecarma
    //5/6/2019
    //Lab 8.14
    //
    public static void main(String[] args) {
        int [] value = {1, 325, 34,5,4,3,34,63,63,6,3,6,3,63,6,3,6,47,575,6,36,2,87,68,6585,34,6,};
        int i, temp, j;
        for (i =0; i< value.length -1 ; i++)
        {
            for (j = i+1; i < value.length - 1; j++)
            {
                if (value[i] > value[j] )
                {
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }
        for(int y:value) {
            System.out.println(y);
        }
    }
}
