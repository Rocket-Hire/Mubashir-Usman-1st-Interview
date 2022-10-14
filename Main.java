// Task # 1
// You have to write a function which takes an array of integers "seq" and an integer "target". There exist two elements of the array whose sum is equal to the target. You can assume that there exists only one solution. You have to return the indices of those elements
// [1,9,2,19]  Target = 3, Answer = 0,2
//  
// [2,4]  Target = 6, Answer =0,1
class Main {
  public static void main(String[] args) {
    int[] input = {1,9,2,19};
    int target = 3;

    int indexOne=0;
    int indexTwo=0;
    for(int i=0;i<input.length;i++){
      int secVal = target - input[i];
        if(secVal==input[i+1]){
            indexOne=i;
            indexTwo=i+1;
            break;
          }
    }

    System.out.println("Answer = "+indexOne+","+indexTwo);
  }
}