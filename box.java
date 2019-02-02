public class box extends facade_file
{
    int height;
    int width;
    int length;

    box(int length, int height, int width)
    {
        this.length = length;
        this.height = height;
        this.width  = width;
    }

    box increase(int times) //*
    {
        box bluebox = new box(width * times,
                              height * times,
                              length * times);
        return bluebox;
    }

    int volume()
    {
        return width * height * length;
    }

    void show_volume()
    {
        System.out.println(volume());
    }
}
