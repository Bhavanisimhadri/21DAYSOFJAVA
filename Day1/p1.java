

class p1{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=5;
        int j=0;
        for(int i=0;i<=arr.length-1;i++){
             if(arr[i]==target){
                j=arr[i];
                break;
             }   
        }
        if(j!=0){
            System.out.println(j);
        }
        else{
            System.out.println("Not found");  
    }
    }
}