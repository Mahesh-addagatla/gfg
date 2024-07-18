/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution {
    // Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int w, Item arr[], int n) {
        // Your code here
        Arrays.sort(arr,(a,b)->(b.value*a.weight)-(a.value*b.weight));
        double ans=0;
        for(int i=0;i<n;i++){
            if(w>=arr[i].weight){
                ans+=arr[i].value;
                w-=arr[i].weight;
            }
            else{
                ans+=arr[i].value*((double)w/(double)arr[i].weight);
                break;
            }
        }
        return ans;
    }
}
