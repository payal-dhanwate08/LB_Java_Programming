class Logic
{
    void CountFactors(int num)
    {
        int iCnt = 0;
        int count = 0;
        if(num<=0)
        {
            num = -num;
        }

        for(iCnt = 1; iCnt <= (num/2) ; iCnt++)
        {
            if(num % iCnt == 0)
            {
                count++;
            }
        }
        System.out.println("total number of factors is :"+count);
    }
}

class program1_4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountFactors(20);
    }
}



