import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        BST root = new BST(40);
        root.leftChild=new BST(20);
        root.rightChild=new BST(60);
        root.leftChild.leftChild=new BST(10);
        root.leftChild.rightChild=new BST(30);
        root.rightChild.leftChild=new BST(50);
        root.rightChild.rightChild=new BST(70);

        Set<Integer> set=new HashSet<>();
        if(!checkForPair(root,130,set))
            System.out.println("nodes are not found");
        set.clear();
        if(!checkForPair(root,180,set))
            System.out.println("nodes are not found");


    }


    public static class BST{
        int value;
        BST leftChild;
        BST rightChild;
        BST(int value){
            this.value=value;
        }
    }

    public static boolean checkForPair(BST root, int sum, Set<Integer> hashSet){
        if(root==null)
            return false;
        if(checkForPair(root.leftChild,sum,hashSet))
            return true;

        if(hashSet.contains(sum-root.value)){
            System.out.println("Pair is ("+(sum-root.value)+" "+root.value+")");
            return true;
        }
        else hashSet.add(root.value);
        return checkForPair(root.rightChild,sum,hashSet);
    }
}