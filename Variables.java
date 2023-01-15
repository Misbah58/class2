package Class2;

public class Variables {
    public static void main(String[] args) {
         /*
        below line is reserving a box in the computer memory .
        we are calling it box1 if we need the information that
         we are storing inside this box we can simply say to the computer give us the content of box1.
         int=> what type of date we want to store
         box1=> is the name of the box
         = sign will take whatever we write after it and will store it inside the box1.
         10=> is what we are string inside

           */
        int box1=10;
        // if we are printing something from a box we don't need ""
        System.out.println(box1);// bring the content of box and print then on the console.
        /* to store whole numbers ( numbers without decimals points) we have 4 types of boxes.
        for example numbers like 10 20 3000 100000 330000
        1) byte 2) short 3) int 4) long

         */
        byte box2=127; // range for byte is from -128 to 127 if we need store larger numbers we should try short
        byte box3=-128;
        short box4=32767;
        short box5=-3256;
        int biggerBox=123456484; // most common type of box
        long maxBox=151313514654641l;
        /*
        reserve a box which can hold number 10000 call it my box and print its values on the console

         */
        short myBox= 10000;
        System.out.println(myBox);





    }}



