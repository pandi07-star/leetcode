class Solution{
    public int maxProduct(int n){
        int max=0,max1=0,last=0;
        while(n>0){
            last=n%10;
            if(last>max){
                max1=max;
                max=last;
            }else if(last>max1){
                max1=last;
            }
            n=n/10;
        }
        return max*max1;
    }
}