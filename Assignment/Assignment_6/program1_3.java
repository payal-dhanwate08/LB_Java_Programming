class Logic
{
    void DisplayFactors(int num)
    {
        int iCnt = 0;
        if(num<=0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= (num/2) ; iCnt++)
        {
            if(num % iCnt == 0 && iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

class program1_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.DisplayFactors(12);
    }
}



