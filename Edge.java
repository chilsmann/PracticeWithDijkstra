public class Edge{
   private int v, w, weight;
   
   public Edge(int v, int w, int weight)
   {
      this.v = v;
      this.w=w;
      this.weight = weight;
   }
   
   public int getV(){
      return this.v;
   }
   
   public int getW(){ return this.w;}
   
   public int getWeight() {return this.weight;}
   
   public int getNeighbor(int i){
      if(this.v == i)
         return this.w;
      else
         return this.v;
   }
   
   @Override
   public String toString(){
      return /*"("+v+",*/ "("+w+")";
   }
}//end edge