public class BubbleSort
{
  public static void main(String[] args) {
    //array of numbers to be sorted
    int array[] = new int[]{10,35,67,420,19,1789};
    
    //print the array before sorting
    for(int i=0; i<array.length;i++){
      System.out.println(array[i] + " ");
    }
    
    bubblesort(array);
    
    System.out.println("After sorting");
    for(int i=0;i < array.length;i++)
    {
      System.out.print(array[i]+ " ");
    }
    
    
  }
  
 
  
  private static void bubblesort(int[]array){
    
    int x = array.length;
    int temp = 0;
    
    for(int i=0; i<y; i++){
      for(int z=1;z<(y-i);z++){
        
        if(array[z-1] > array[z]){
          temp = array[z-1];
          array[z-1] = array[z];
          array[z] = temp;
        }
      }
    }
    
  }