import java.util.*;
class Item{
    int value, weight;
    Double ratio;
    public Item(int value, int weight)
    {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value/weight;
    }
}

public class FractionalKnapsack{
    public static double fractionalKnapsack(int capacity, int[] value, int[] weight){

        List<Item> items = new ArrayList<>();
        for(int i = 0; i<value.length; i++){
            items.add(new Item(value[i], weight[i]));
        }

        items.sort((a,b) -> b.ratio.compareTo(a.ratio));

        double maxValue = 0.0;

        for(Item item : items){

            if(capacity>=item.weight)
            {
                capacity -= item.weight;
                maxValue += item.value;
            }
            else{
                maxValue += item.ratio * capacity;
            }
        }
        return maxValue;
    }

    public static void main(String[] args){

        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];

        System.out.println("Enter value: ");
        for(int i = 0; i<n; i++){
            value[i] = sc.nextInt();
        }

        System.out.println("Enter weight: ");
        for(int i = 0; i<n; i++){
            weight[i] = sc.nextInt();
        }

        System.out.println("Enter capacity: ");
        int capacity = sc.nextInt();

        double maxValue = fractionalKnapsack(capacity, value, weight);
        System.out.println("Maxvalue is : "+ maxValue);
    }
}