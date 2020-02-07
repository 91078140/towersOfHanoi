// Timothy Wilks
// towers of hanoi puzzle
public class TowersOfHanoi
{
    private int totalDisks;
    //sets puzzle up with amount of disks

    public TowersOfHanoi(int disks)
    {
        totalDisks = disks;
    }

    public void solve()
    {
        moveTower(totalDisks, 1, 3, 2);
    }
    // moves disks

    private void moveTower(int numDisks, int start, int end, int temp)
    {
        if(numDisks == 1)
        {
            moveOneDisk(start, end);
        }
        else
        {
            moveTower(numDisks-1, start, temp, end);
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, end, start);
        }
    }// end of moveTower
    //prints instructions
    private void moveOneDisk(int start, int end)
    {
        System.out.println("Move one disk from " + start + " to " + end);
    }// end of moveOneDisk
}// end of class
