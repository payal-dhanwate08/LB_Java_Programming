class Logic
{
    void CheckPalindrome(int num)
    {
        int OriginalNum = num;
        int iReverseNum = 0;
        int iDigit = 0;

        while(num !=0)
        {
            iDigit = num %10;
            iReverseNum =  iReverseNum * 10 + iDigit;
            num = num/10;
        }


        if(OriginalNum == iReverseNum )
        {
            System.out.println( OriginalNum+"  is a Palindrome number ");
        }
        else
        {
             System.out.println( OriginalNum+"  is not a Palindrome number ");

        }
    }
}



class program1_2


{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);

    }
}