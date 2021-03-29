

public class Main
{


  public static void main(String[] args)
  {
    
    System.out.println("Starting Picture Lab...");

    ConsoleInput cin = new ConsoleInput();

    while (true)
    {
      System.out.println("Select 1: color chooser, 2: int array, 3: pic explorer, 4: pic tester, 0: quit");
      cin.read();
      if (!cin.validInt() || cin.getInt() == 0) {
        System.out.println("bye");
        break;
      }

      switch (cin.getInt()) {
        case 1:  // entry point to ColorChooser
          ColorChooser.main(args);
          break;

        case 2:  // entry point to IntArrayTester
          IntArrayWorkerTester.main(args);
          break;

        case 3:  // entry point to PictureExplorer
          PictureExplorer.main(args);
          break;

        case 4:  // entry point to PictureTester
          PictureTester.main(args);
          break;

          
        default:
          System.out.println("enter a valid command...");
      }
    }
    
  }

}