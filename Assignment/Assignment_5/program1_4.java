class Logic
{
    void FindLargestDigit(int num)
    {
        int digit = 0;

        int largestDigit = 0;

        while(num > 0)
        {
            digit = num % 10;
            if(digit > largestDigit)
            {
                largestDigit = digit;
            num = num / 10;
            }
        
        }
        System.out.println("the largest digit is :"+largestDigit);
    }
}

class program1_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(83429);
    }
}