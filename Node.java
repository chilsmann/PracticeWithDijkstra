import java.util.*;

public class Node{
   private boolean visited;
   
   private int distance = Integer.MAX_VALUE;
   
   private LinkedList<Edge> edges = new LinkedList<Edge>();
   
   public int getDistance(){
      return distance;}
      
   public void setDistance(int distance){
      this.distance = distance;
   }
   
   public boolean visited(){ return this.visited;}
   
   public void setVisited(boolean visited) {this.visited = visited;}
   
   public LinkedList<Edge> getEdges(){
      return edges;
   }
   
   public void setEdges(LinkedList<Edge> edges){
      this.edges = edges;
   }
}//end node