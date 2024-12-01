import java.util.Arrays;

public class PriorityQueueImp {

 private int[] items = new int[5];
 private int count;

 public void add(int item) {

  if (count == items.length || items.length == 1) {
   throw new IllegalStateException("Queue is Full");
  }

  int i;

  for (i = count - 1; i >= 0; i--) {

   if (items[i] > item) {
    items[i + 1] = items[i];

   } else {
    break;
   }

  }
  items[i + 1] = item;
  count++;
 }

 public int remove() {
  if (isEmpty()) {
   throw new IllegalStateException("The Queue is Empty");

  }
  return items[--count];

 }

 public boolean isEmpty() {
  return count == 0;
 }

 @Override
 public String toString() {
  return Arrays.toString(items);
 }

 public static void main(String[] args) {

  PriorityQueueSort q = new PriorityQueueSort();

  q.add(1);
  q.add(3);
  q.add(2);
  q.add(5);
  q.add(4);

  System.out.println(q.toString());

  while (!q.isEmpty()) {
   System.out.println(q.remove());
  }

 }

}
