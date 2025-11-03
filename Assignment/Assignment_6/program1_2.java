class Logic
{
    void CountEvenOddRange(int n)
    {
        int iCnt = 0;
        int evenCount = 0;
        int oddCount = 0;

        for(iCnt = 1; iCnt <= n; iCnt++)
        {
           if(iCnt % 2 == 0)
           {
              evenCount++;
           }
           else
           {
              oddCount++;
           }

        }
        System.out.println("count of even number :" +evenCount);
        System.out.println("count of odd number :"+oddCount);
    }
}

class program1_2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CountEvenOddRange(50);
    }
}