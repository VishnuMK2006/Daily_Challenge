class Solution {
    public ArrayList primearr(int l,int r){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=l;i<=r;i++){
           if(isprime(i))
                al.add(i);
        }
        return al;
    }
    public boolean isprime(int n){
        if(n<=1)
                return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int res[]={-1,-1};
        int min=100000;
        ArrayList<Integer> al=primearr(left,right);
        HashMap<Integer,int[]> hs=new HashMap<>();
        if(al.size()<=1)
            return res;
        for(int i=0;i<al.size()-1;i++){
            int key=al.get(i+1)-al.get(i);
            if(!hs.containsKey(key)){
                hs.put(key,new int[]{al.get(i),al.get(i+1)});
                if(min>key)
                    min=key;
            }
        }
        return hs.get(min);
    }
}