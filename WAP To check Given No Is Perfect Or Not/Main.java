class Main {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.println(" Perfect No!!");
        }
        else{
             System.out.println(" Not Perfect No!!");
        }
    }
}
