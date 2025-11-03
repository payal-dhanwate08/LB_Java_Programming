class Logic
{
    void PrintEvenOddNumber(int num)
    {
        int iDigit = 0;
        int EvenSum = 0;
        int OddSum = 0;
        int sum =0;
        while(num !=0)
        {
            iDigit = num % 10;
            if(iDigit % 2==0)
            {
                EvenSum = EvenSum + iDigit;
                
        

            }
            else
            {
                OddSum = OddSum + iDigit;
            }
            num = num / 10;
        }

         System.out.println("Sum of even number : "+EvenSum);
         System.out.println("Sum of odd number : "+OddSum);
        
    }
}

class program1_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintEvenOddNumber(123456);
    }
}