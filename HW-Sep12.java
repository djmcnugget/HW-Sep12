public class HW-Sep12 {

// Depth-First Search (DFS)

boolean[] visited = new boolean[n];

public static void dfs(int u, ArrayList<ArrayList<Integer>> adj) { //adj -> adjacency list represents the GRAPH:
                                                                   //it's an arraylist that holds arraylists of nodes
   visited[u] = true;                                              //for each node that the specific node is connected to
   System.out.println("visiting node " + u);
   
   for(int v : adj.get(u)) {
      if(!visited[v]) {
         dfs(v);
         }
      }
   }
   
// 1.3 Counting Who Hears

public static int numHeard(int u, ArrayList<ArrayList<Integer>> adj) {
   
   int heard = 0;
   dfs(u, adj);
   
   for(boolean x : visited) {
      if(x) {
         heard++;
         }
   }
   System.out.println(heard + " people heard about the rumour");
   return heard;
}

// Q3: One School or Two?

public static boolean connected(int u, ArrayList<ArrayList<Integer>> adj) {  
   
   dfs(u, adj);
   
   for(boolean a : visited) {
      if(!a) {
         System.out.println("DISCONNECTED");
         return false;
         }
      }
      System.out.println("CONNECTED");
      return true;
   }
   
   
// Q4: Directed Rumours

 /*To make this a one-way rumour graph, we would need to remove line 15 since it is the reason
 why the graph goes both ways; when we add b to a, we also put a into b, making it a two-way connection. However,
 by removing that line, adding b to a will not automatically put a into b so that if the rumour hit b first, a
 would not recieve the rumour. Student one will still be able to reach all the other ones except 6 and 7 if the rumour started
 there first, however, if the rumour started at any other number, student 1 would not be able to recieve the rumour.*/
 
 
         


