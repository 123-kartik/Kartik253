#include<iostream>
using namespace std;
int main()
{
    int a[5],i=0,ab;
    float a_t;
    for(i=0;i<5;i++)
    {
        cin>>a[i];
    }
    ab=a[0];
    for(i=1;i<5;i++)
    {
        if(ab>a[i])
        {
            ab=a[i];
        }
    }
return 0;

}