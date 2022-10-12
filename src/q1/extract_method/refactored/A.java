package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      return null;
   }

   <T> void extractedMethod(List<T> list, String p) {
	   for (T item : list) {
		   if (((Item) item).contains(p))
			   System.out.println(item);
	   }
   }
}

abstract class Item {
	public abstract boolean contains(String p);
}

class Node extends Item {
   String name;

   public boolean contains(String p) {
      return name.contains(p);
   }
}

class Edge extends Item {
   String name;

   public boolean contains(String p) {
       return name.contains(p);
   }
}