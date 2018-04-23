package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		t.addRoot(4);
		Position<Integer> child1 = t.addChild(t.root(), 9);
		t.addChild(child1, 7);
		t.addChild(child1, 10);
		Position<Integer> child2 = t.addChild(t.root(), 20);
		Position<Integer> child3 = t.addChild(child2, 15);
		Position<Integer> child4 = t.addChild(child2, 21);
		t.addChild(child3, 12);
		Position<Integer> child5 = t.addChild(child3, 17);
		t.addChild(child5, 19);
		Position<Integer> child6 = t.addChild(child4, 40);
		t.addChild(child6, 30);
		t.addChild(child6, 45);
		
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		t.addRoot(4);
		Position<Integer> child1 = t.addLeft(t.root(), 9);
		Position<Integer> child2 = t.addRight(t.root(), 20);
		t.addLeft(child1, 7);
		t.addRight(child1, 10);
		
		LinkedBinaryTree<Integer> t2 = new LinkedBinaryTree<>(); 
		LinkedBinaryTree<Integer> t3 = new LinkedBinaryTree<>(); 
		
		t2.addRoot(15);
		t2.addLeft(t2.root(), 12);
		Position<Integer> child3 = t.addRight(t2.root(), 17);
		t2.addLeft(child3, 19);
		
		t3.addRoot(21);
		Position<Integer> child4 = t3.addRight(t3.root(), 40);
		t3.addLeft(child4, 30);
		t3.addRight(child4, 45);
		
		t.Attach(child2, t2, t3);
		
		return t; 
	}


}
