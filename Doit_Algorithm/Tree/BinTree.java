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

    private int comp(K key1, K key2){
        return (comparator == null) ? ((Comparable<K>)key1).compareTo(key2) : comparator.compare(key1, key2);
        /* key 1 > key2 면 양수, 반대면 음수, key1 == key2 면 0
         1. ((Comparable<K>)key1).compareTo(key2)-> Bintree()로 이진검색트리를 생성한 경우, comparator의 값은 널, 비교자는 설정되어있지 않다.
         2. comparator.compare(key1, key2) -> null이 아닐 경우, comparator에 비교자가 설정되어 있다.
        */
    }



}

