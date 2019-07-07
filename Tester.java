//Cameron Hilsmann - HW8

import java.util.*;

public class Tester{
   public static void main(String [] args){
   
      Edge[] edges = {
         new Edge(0,1,9),
         new Edge(0,5,14),
         new Edge(0,6,15),
         new Edge(1,2,24),
         new Edge(5,2,18),
         new Edge(5,4,30),
         new Edge(5,6,5),
         new Edge(6,4,20),
         new Edge(6,7,44),
         new Edge(4,3,11),
         new Edge(4,7,16),
         new Edge(3,2,6),
         new Edge(3,7,6),
         new Edge(2,4,2),
         new Edge(2,7,19)
      };
      Graph g = new Graph(edges, 8);
      
      g.addEdge(1,1,2,9);
      g.addEdge(1,1,6,14);
      g.addEdge(1,1,7,15);
      g.addEdge(2,2,3,24);
      g.addEdge(6,6,3,18);
      g.addEdge(6,6,5,30);
      g.addEdge(6,6,7,5);
      g.addEdge(7,7,5,20);
      g.addEdge(7,7,8,44);
      g.addEdge(5,5,4,11);
      g.addEdge(5,5,8,16);
      g.addEdge(4,4,3,6);
      g.addEdge(4,4,8,6);
      g.addEdge(3,3,5,2);
      g.addEdge(3,3,8,19);

      System.out.println("-----Adjacency List Representation-----");
      System.out.print(g);
      System.out.println("-----End of Adjacency List Representation-----");

      //calculateDijkstra(g);
      
      g.DijkstraAlg();
      g.print();
      
   }//end main
   


}//end class Tester