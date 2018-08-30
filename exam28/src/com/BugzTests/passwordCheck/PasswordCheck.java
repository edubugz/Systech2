package com.BugzTests.passwordCheck;

public class PasswordCheck {

    public boolean isValid(String pass)
    {
        int digCount = 0;
        if(pass.length()>=10 )
        {
            for(int i=0;i<pass.length();i++)
            {
                if( !Character.isDigit(pass.charAt(i)) || !Character.isLetter(pass.charAt(i)) )

                {
                    return false;

                }

                else
                    {

                       if (Character.isDigit(pass.charAt(i)))
                       {
                           digCount++;

                       }

                    }

            }

            if (digCount >=2)
            {
                return true;
            }

        }


        return false;


    }
}
