class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> map;

    Node head;
    Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.next = tail;
        tail.prev = head;
    }

    // Add node after head (Most Recently Used)
    private void addNode(Node node) {

        Node temp = head.next;

        node.next = temp;
        node.prev = head;

        head.next = node;
        temp.prev = node;
    }

    // Remove node
    private void deleteNode(Node node) {

        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    // ---------------- GET ----------------

    public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        Node ansNode = map.get(key);

        int ans = ansNode.value;

        map.remove(key);

        deleteNode(ansNode);

        addNode(ansNode);

        map.put(key, ansNode);

        return ans;
    }

    // ---------------- PUT ----------------

    public void put(int key, int value) {

        if (map.containsKey(key)) {

            Node oldNode = map.get(key);

            deleteNode(oldNode);

            map.remove(key);
        }

        if (map.size() == capacity) {

            Node lru = tail.prev;

            map.remove(lru.key);

            deleteNode(lru);
        }

        Node newNode = new Node(key, value);

        addNode(newNode);

        map.put(key, newNode);
    }
}