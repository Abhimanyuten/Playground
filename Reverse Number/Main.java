#include <iostream>
using namespace std;
int main() 
{
	int a,s;
  cin>>a;
  s=0;
  while(a>0)
  {
    s=(s*10)+(a%10);
    a=a/10;
  }
  cout<<s;
	return 0;
}