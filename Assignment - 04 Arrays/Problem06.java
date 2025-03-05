// https://exercism.org/tracks/java/exercises/bird-watcher
import java.util.*;
class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return new int[]{ 4, 5, 2, 5, 2, 7 };
  }

  public int getToday() {
    return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length - 1];
  }

  public void incrementTodaysCount() {
    int ind = birdsPerDay.length - 1;
    birdsPerDay[ind]+= 1;
  }
  public boolean hasDayWithoutBirds() {
    for (int i = 0; i < birdsPerDay.length; i++) {
      if (birdsPerDay[i] == 0)
        return true;
    }
    return false;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int sum = 0;
    for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++)
      sum += birdsPerDay[i];
    return sum;
  }

  public int getBusyDays() {
    int count = 0;
    for (int i = 0; i < birdsPerDay.length; i++) {
      if (birdsPerDay[i] >= 5)
        count++;
    }
    return count;
  }
}
class Problem06{
  public static void main(String[] args) {
    int bp[] = {2, 5, 0, 7, 4, 1};
    BirdWatcher bird = new BirdWatcher(bp);
    System.out.println(Arrays.toString(bird.getLastWeek()));
    System.out.println(bird.getToday());
    bird.incrementTodaysCount();
    System.out.println(bird.hasDayWithoutBirds());
    System.out.println(bird.getCountForFirstDays(2));
    System.out.println(bird.getBusyDays());
  }
}