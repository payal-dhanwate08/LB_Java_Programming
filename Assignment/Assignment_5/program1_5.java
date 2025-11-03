class Logic
{
    void FindSmallestDigit(int num)
    {
        int digit = 0;

        int smallestDigit = 8;

        while(num > 0)
        {
            digit = num % 10;
            if(digit < smallestDigit)
            {
                smallestDigit = digit;
            num = num / 10;
            }
       
        }
        System.out.println("the smallest digit is :"+smallestDigit);
    }
}

class program1_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(45872);
    }
}