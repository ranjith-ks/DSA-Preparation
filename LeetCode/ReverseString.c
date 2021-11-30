/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
*/

void reverseString(char* s, int sSize){
    int i;
    char *res[sSize];
    for(i=0;i<sSize;i++)
    {
        res[i] = s[sSize-1-i];
    }
    for(i=0;i<sSize;i++)
        s[i] = res[i];
}