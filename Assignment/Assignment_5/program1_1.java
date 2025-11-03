class Logic
{
    void SumEvenNumbers(int n)
    {
        int sum = 0;
        int iCnt = 0;
        for(iCnt = 1; iCnt<=n; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                sum = sum + iCnt;
            }
        }
        System.out.println("sum is :"+sum);

    }
}

class program1_1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.SumEvenNumbers(10);
    }
}