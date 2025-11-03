class Logic
{
    void PrintDigits(int num)
    {
        int iDigit = 0;
        while(num !=0)
        {
            iDigit = num % 10;
            System.out.println(iDigit+" \n");
            num = num/10;


        }
        

    }
}

class program1_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintDigits(9879);
    }
}