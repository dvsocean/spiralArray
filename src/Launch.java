import java.util.Arrays;

public class Launch {

  static int[][] arrayOne = new int[50][];
  //static int[] arrayTwo = new int[50];


  public static void main(String[] args) {
    for (int i = 0; i < arrayOne.length - 1; i++) {
      arrayOne[i] = new int[50];
      for (int j = 0; j < 50; j++) {
        arrayOne[i][j] = j;
      }
    }

    System.out.println("array is : "+ Arrays.deepToString(arrayOne));
    spiralArray(arrayOne);
  }

  public enum Direction {
    UP,
    RIGHT,
    DOWN,
    LEFT
  }

  public static void spiralArray(int [][] arr){
    int rowMiddle =arr.length/2;  //25
    int colMiddle = arr[0].length/2; //25
    int x = rowMiddle;
    int y = colMiddle;
    int sprint = 1;
    Direction direction = Direction.UP;

    boolean shouldIncrementSprint = false;
    while (x>0 && y>0 && x<50 && y<50) {
      for (int i = 0; i < sprint; i++) {
        System.out.println(x + ":" + y);

        switch(direction) {
          case UP:
            y--;
            break;
          case RIGHT:
            x++;
            break;
          case DOWN:
            y++;
            break;
          case LEFT:
            x--;
            break;
        }
      }
      switch (direction) {
        case UP:
          direction = Direction.RIGHT;
          break;
        case RIGHT:
          direction = Direction.DOWN;
          break;
        case DOWN:
          direction = Direction.LEFT;
          break;
        case LEFT:
          direction = Direction.UP;
          break;
      }
      if (shouldIncrementSprint) {
        sprint++;
      }
      shouldIncrementSprint = !shouldIncrementSprint;
    }
  }


}
