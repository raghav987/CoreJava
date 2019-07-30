#include <stdio.h>

int main(void) {
	int t;
	scanf("%d",&t);
	while(t--)
	{
	    int n,i,count=0;
	    long long int arr[100];
	    scanf("%d",&n);
	    for(i=0;i<n;i++)
	    {
	        scanf("%lld ",&arr[i]);

	    }
	    int x;
	    scanf("%d",&x);
	    for(i=0;i<n;i++)
	    {
	        if(arr[i]<arr[x-1])
	            count++;
	    }

	    printf("%d\n",count+1);

	}
	return 0;
}
