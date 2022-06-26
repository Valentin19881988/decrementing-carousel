package com.epam.rd.autotasks;

public class DecrementingCarousel {
    Boolean s = true, get = true, isRun = false;
    public static int[] array = new int[0];
    public static int count = 0;
    public DecrementingCarousel(int capacity) {
        this.array = new int[capacity];
        count = 0;

    }

    public boolean addElement(int element){
        if (get == false)
             return false;

        if (element <= 0)
            return false;

        if (count== array.length)
            return false;

        this.array[count] = element;
        count++;
        return true;

    }

    public CarouselRun run(){
        if (isRun == true)
            return null;
        CarouselRun run = new CarouselRun();
        //run.next();
        get = false;
        isRun = true;

        return run;
    }
}
