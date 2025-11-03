class Logic
{
    void PrintEvenNumber(int num)
    {
        int iCnt= 0;
        for(iCnt=1; iCnt<=num; iCnt++)
        {
            if(iCnt%2==0)
            {
                System.out.println(iCnt+" \n");
            }
        }
        
    }
}

class program1_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.PrintEvenNumber(20);
    }
}