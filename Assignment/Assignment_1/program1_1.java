class Logic
{
    void CalculateSum(int n)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1 ; iCnt <=n ; iCnt++)
        {
            iSum = iSum + iCnt;
            
        }
        System.out.println("Sumation of first "+n+" number is :"+iSum);

    }
}



class program1_1


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CalculateSum(10);

    }
}