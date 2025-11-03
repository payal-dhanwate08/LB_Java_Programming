class Logic
{
    void CheckPerfect(int n)
    {
        int sum = 0;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= n / 2; iCnt++)
        {
            if(n%iCnt == 0)
            {
                sum = sum + iCnt;
            }
        }
        if( n == sum)
        {
            System.out.println(n+"  is perfect number");
        }
        else
        {
             System.out.println(n+"  is not perfect number");

        }  

    }
}

class program1_3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPerfect(12);
    }
}