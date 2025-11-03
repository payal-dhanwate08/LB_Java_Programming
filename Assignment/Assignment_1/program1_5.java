class Logic
{
    void CountDigits(int num)
    {
        int iDigit = 0;
        int iCount = 0;

        while(num !=0)
        {
            iDigit = num %10;
            iCount++;
           
            num = num/10;
        }
        System.out.println( "The count is :"+iCount);
    }
}



class program1_5


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountDigits(7865);

    }
}