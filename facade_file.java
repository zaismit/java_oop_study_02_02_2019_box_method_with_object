public class facade_file
{
    public static void main(String[] args)
    {
        box blackbox;

            blackbox = new box(1,2,3);

            blackbox.show_volume();

        box redbox;

            redbox = new box(3, 5,5 );

            redbox.show_volume();

        box bluebox;

            bluebox = blackbox.increase(5); //*

            bluebox.show_volume();
    }
}
