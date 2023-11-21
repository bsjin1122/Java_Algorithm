package Doit_Algorithm.Tree;
import java.util.Comparator;

//이진 검색 트리
public class BinTree<K, V> {

    // 노드
    static class Node<K, V>{
        private K key; // 키 값
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;

        //생성자
        Node(K key, V data, Node<K,V> left, Node<K, V> right){
            this.key = key;
            this.data = data;
            this.left = left;
            this.right = right;
        }

        K getKey(){
            return key;
        }
        V getValue(){
            return data;
        }
        void print(){
            System.out.println(data);
        }

    }
    private Node<K,V> root; // 루트:루트에 대한 참조를 보존/유지하는 필드
    private Comparator<? super K> comparator = null; //비교자: 키 값의 대소관계 비교

    // 생성자
    public BinTree(){
        root = null;
        // root를 null로 한 노드가 하나도 없는(비어있는) 이진 검색 트리를 생성하는 생성자
    }

    // 생성자
    public BinTree(Comparator<? super K> c){ //인수로 비교자를 전달받는 생성자이다.
        this(); // 생성자 BinTree()를 호출한다. root가 널인(비어있는) 이진검색트리를 생성한다.
        comparator = c;
    }

    private int comp(K key1, K key2) {
        return (comparator == null) ? ((Comparable<K>) key1).compareTo(key2) : comparator.compare(key1, key2);
        /* key 1 > key2 면 양수, 반대면 음수, key1 == key2 면 0
         1. ((Comparable<K>)key1).compareTo(key2)-> Bintree()로 이진검색트리를 생성한 경우, comparator의 값은 널, 비교자는 설정되어있지 않다.
         2. comparator.compare(key1, key2) -> null이 아닐 경우, comparator에 비교자가 설정되어 있다.
        */
    }
    // 이진 검색트리에서 원하는 값을 찾으려면, 이런 방법으로 루트부터 시작해 현재 선택한 노드의 키 값과 목표하는 값을 비교하면서 왼쪽, 오른쪽으로 검색을 진행하면 된다.

    public V search(K key){
        Node<K, V> p = root;
        while(true){
            if(p == null)
                return null;
            int cond = comp(key, p.getKey());
            if(cond == 0) // 같으면
                return p.getValue(); // 검색 성공
            else if(cond < 0)
                p = p.left; // 왼쪽 서브 트리에서 검색
            else  // key쪽이 크면
                p = p.right; // 오른쪽 서브 트리에서 검색
        }
    }

    // add 주의점: 노드를 삽입한 다음에 트리의 형태가 이진 검색 트리의 조건을 유지해야한다는 점이다.
    // 노드를 삽입할 때에는 알맞은 위치에 삽입해야 한다.
    private void addNode(Node<K, V>node, K key, V data){
        int cond = comp(key, node.getKey());
        if(cond == 0)
            return; // 검색트리에 이미 있음-> 종료
        else if(cond < 0){
            if(node.left == null)
                node.left = new Node<K, V>(key, data, null, null);
            else
                addNode(node.left, key, data); //왼쪽 서브트리에 주목
        }else {
            if(node.right == null)
                node.right = new Node<K, V>(key, data, null, null);
            else
                addNode(node.right, key, data);  //오른쪽 서브트리에 주목
        }
    }
    public void add(K key, V data){
        if(root == null)
            root = new Node<K, V>(key, data, null, null); // root가 null인 경우
        else
            addNode(root, key, data);
    }
}

