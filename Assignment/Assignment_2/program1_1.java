class Logic
{
    void SumOfDigits(int num)
    {
        int iDigit = 0;
        int iSum = 0;

        while(num !=0)
        {
            iDigit = num %10;
            iSum = iSum + iDigit;
           
            num = num/10;
        }
        System.out.println( "The sum  is :"+iSum);
    }
}



class program1_1


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);

    }
}