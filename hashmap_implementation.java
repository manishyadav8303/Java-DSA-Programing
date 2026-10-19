
import java.util.LinkedList;
import java.util.Objects;

public class hashmap_implementation {

    static class HashMap<K, V> {

        public class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int N;
        private int n;
        private LinkedList<Node>[] bucket;

        @SuppressWarnings("unchecked")
        public HashMap() {
            N = 4;
            n = 0;
            bucket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            return Math.floorMod(Objects.hashCode(key), N);
        }

        private int searchLL(K key, int bi) {
            LinkedList<Node> ll = bucket[bi];

            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (Objects.equals(node.key, key)) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node>[] oldBucket = bucket;

            N = N * 2;
            bucket = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }

            n = 0;

            for (int i = 0; i < oldBucket.length; i++) {
                for (Node node : oldBucket[i]) {
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di != -1) {
                bucket[bi].get(di).value = value;
            } else {
                bucket[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di == -1) {
                return null;
            }

            return bucket[bi].get(di).value;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchLL(key, bi);

            if (di == -1) {
                return null;
            }

            n--;
            return bucket[bi].remove(di).value;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 140);
        map.put("USA", 30);
        map.put("India", 145);

        System.out.println(map.get("India"));         // 145
        System.out.println(map.containsKey("USA"));   // true
        System.out.println(map.containsKey("Japan")); // false
        System.out.println(map.size());               // 2

        map.remove("USA");

        System.out.println(map.size());               // 1
    }
}
