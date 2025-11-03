class Logic
{
    void printDivisibleby2and3(int n)
    {
        int iCnt = 0;
       
        if(n<=0)
        {
            n = -n;
        }

        for(iCnt = 1; iCnt <= n ; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println (iCnt);
               
            }
        }

    }
}

class program1_5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printDivisibleby2and3(30);
    }
}



