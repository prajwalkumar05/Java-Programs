class BubbleSort{

    public static void main(String argss[]){
        
        int[] numbers = {100,35,24,46};

        int len=numbers.length;
        System.out.print(len);

        Boolean swap;

        do{
            swap=false;
            for(int i=0;i<len-1;i++){
                if(numbers[i] > numbers[i+1]){
                    int third;
                    third = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1]=third;
                    swap=true;
                }
            }
        }while(swap);


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

}











