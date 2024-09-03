package Collection;
import java.util.*;
public class hashCode {
    static class HashMap<K, V>{// Generic
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
         private int n;// n - node
        private int N;//N - bucket
        private LinkedList<Node> buckets[]; //N = buckets.length

        public HashMap(){
            // this constructor create the blank LL
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i =0; i<4; i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){ // 0 to n-1
            int bi = key.hashCode();
            // 2345 or -12344
            return Math.abs(bi) % N;
        }
        private int searchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i =0; i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        public void put(K key, V value){
            int bi = hashFunction(key); // bi - bucket index
            int di = searchInLL(key,bi); //di =-1 di - data index
            if(di == -1){// key does'nt exist
                buckets[bi].add(new Node(key, value));
                n++;
            }
            else{// if key exist
              Node node = buckets[bi].get(di);
              node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0){
                //rehashing
            }
        }
    }
}
