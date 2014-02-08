public class Main {

    public static void main(String[] args)
    {
      boolean Figures[][] = new boolean[2][12];
      for (int i=0; i<3; i++)
      {
        for (int j=0; j<13; j++)
        {
          Figures[i][j] = true;
        }
      }
      int Desk[][] = new int[8][8];
      for (int i=0; i<9; i++)
      {
        for (int j=0; j<9; j++)
        {
          Desk[i][j] = 0;
        }
      }

    }

}
