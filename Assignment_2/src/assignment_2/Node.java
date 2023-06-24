package Assignment_2;

public class Node {
    /*  
    Dosyadan okunan her kelime ile kullanıcının girdiği değer, levenshtein algoritması kullanılarak distance değişkeninde tutulur.
    Dosyadan okunan her kelime word değişkeninde tutulur

    
    
    */
    public int distance;
    public String word;
    public Node right;
    public Node left;


    Node(int data,String word_c) {
        this.word = word_c;
        this.distance = data;
        this.right = null;
        this.left = null;
    }
    
}
