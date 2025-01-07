class Main {
    public static void main(String[] args) {
        int n,count=0;
        n=3;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            
        }
        if(count==2){
            System.out.println("Prime No");
        }
        else{
         System.out.println(" Not Prime No");
        }
        
    }
}
