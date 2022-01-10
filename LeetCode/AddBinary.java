/*
Given two binary strings a and b, return their sum as a binary string.
*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i,j,c,x,y,oneC,len1=a.length(),len2=b.length();
        i = len1-1;j=len2-1;c=0;
        while(i>-1 && j>-1)
        {
            x = a.charAt(i)-'0';
            y = b.charAt(j)-'0';
            oneC = x+y+c;
            if(oneC==1 || oneC==3)
                res.append("1");
            else
                res.append("0");
            if(oneC>1)
                c = 1;
            else
                c = 0;
            i--;j--;
        }
        while(i>-1)
        {
            x = a.charAt(i)-'0';
            oneC = x+c;
            if(oneC==1)
                res.append("1");
            else
                res.append("0");
            if(oneC==2)
                c = 1;
            else
                c = 0;
            i--;
        }
        while(j>-1)
        {
            x = b.charAt(j)-'0';
            oneC = x+c;
            if(oneC==1)
                res.append("1");
            else
                res.append("0");
            if(oneC==2)
                c = 1;
            else
                c = 0;
            j--;
        }
        if(c==1)
            res.append("1");
        res = res.reverse();
        return res.toString();
    }
}