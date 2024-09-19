public class maxPointobtain {
    public int maxScore(int[] card, int k) {
        int s=0;
        for(int i=0;i<k;i++)
            s+=card[i];
            if(k==card.length) return s;
            int res=s;
        int l=k,r=card.length-1;
        while(l>0)
        {
            s-=card[--l];
            s+=card[r--];
            res=Math.max(res,s);
        }
        return res;
    }
}
