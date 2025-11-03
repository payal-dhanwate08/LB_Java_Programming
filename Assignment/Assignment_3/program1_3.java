class Logic
{
    void PrintOddNumber(int num)
    {
        int iCnt= 0;
        for(iCnt=1; iCnt<=num; iCnt++)
        {
            if(iCnt%2!=0)
            {
                System.out.println(iCnt+" \n");
            }
        }
        
    }
}

class program1_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintOddNumber(20);
    }
}