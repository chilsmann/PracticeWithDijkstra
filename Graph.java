import java.util.*;

public class Graph{
   private Node[] nodes;
   private int lengthN;
  
 
   

    LinkedList<Edge> G[];
    int length;
    int weight;
    
   private Edge[] edges;
   private int lengthE;
   
   public Graph(Edge[] edges,int n){
   G = new LinkedList[n +1];
      this.length = n+1;
      for(int i = 1; i <G.length; i++)
         G[i] = new LinkedList<Edge>();
         
      this.edges = edges;
      
      
      
      this.lengthN = NumberNodes(edges);
      this.nodes = new Node[this.lengthN];
      
      for(int i = 0; i <this.lengthN; i++){
         this.nodes[i] = new Node();
      }
      
      this.lengthE = edges.length;
      
      for(int x = 0; x < this.lengthE; x++){
         this.nodes[edges[x].getV()].getEdges().add(edges[x]);
         this.nodes[edges[x].getW()].getEdges().add(edges[x]);
      }
   }
   
   private int NumberNodes(Edge[] edges){
      int numNodes = 0;
      
      for( Edge e: edges){
         if(e.getW() > numNodes)
            numNodes = e.getW();
         if(e.getV() > numNodes)
            numNodes = e.getV();
      }
      
      numNodes++;
      
      return numNodes;
   }

     public void DijkstraAlg(){
      this.nodes[0].setDistance(0);
      int nextNode = 0;
      
      for(int i = 0; i<this.nodes.length; i++){
         LinkedList<Edge> current = this.nodes[nextNode].getEdges();
         //System.out.print(current);
         for(int x = 0; x < current.size(); x++){
            int neighbor = current.get(x).getNeighbor(nextNode);
           // System.out.print(neighbor+1);
            if(!this.nodes[neighbor].visited()&& pointsTo(current.get(x).getV(), neighbor)){
               int temp = this.nodes[nextNode].getDistance() + current.get(x).getWeight();
             // System.out.println(current.get(x)+" "+temp);
            if(temp < nodes[neighbor].getDistance() && temp != 44)
               nodes[neighbor].setDistance(temp);
            }
            
         }
         //System.out.println();
         nodes[nextNode].setVisited(true);
         
         nextNode = getShortestDist();
      }
   }//end
   
   private boolean pointsTo(int cur, int val){
      boolean flag = false;
      cur++;
      val++;
      
    
      if(G[cur].get(0) != null)
         return true;
      
      
      return flag;
   }
   
   private int getShortestDist(){
      int stored = 0;
      int storedDist = Integer.MAX_VALUE;
      
      for(int i = 0; i < this.nodes.length; i++){
         int currentDist = this.nodes[i].getDistance();
         
         if(!this.nodes[i].visited() && currentDist< storedDist){
            storedDist = currentDist;
            stored = i;
            //System.out.print(storedDist);
         }
        
      }
      return stored;
   }
   
   public void print(){
      String res = "";
      
      for(int i =0; i< this.nodes.length; i++){
         res += ("\nPath "+(i+1)+") Vertex 1 -> " + (i+1)+ ", length "+ nodes[i].getDistance());
      }
      
      System.out.println(res);
   }

   
   
   public void addEdge(int u,int v, int w, int weight){
      G[u].add(new Edge(v,w,weight));
      this.weight = weight;
   }
   public int getWeight(){return this.weight;}
   
   public int length(){return this.length;}
   
   
   
   
   
   @Override
   public String toString(){
      String res= "";
      for(int i=0; i<G.length; i++)
         res += i+"->" +G[i]+"\n";
      return res;
      }


}//end graph