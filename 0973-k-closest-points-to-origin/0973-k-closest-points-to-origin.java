class Solution {

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;

        public Point(int x,int y,int distSq){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq-p2.distSq;
        }
    }
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Point> pq = new PriorityQueue<>();    

        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];

            int distSq=x*x+y*y;
            pq.add(new Point(x,y,distSq));
        }    

        int[][] result=new int[k][2];

        for(int i=0;i<k;i++){
            Point p=pq.poll();

            result[i][0]=p.x;
            result[i][1]=p.y;
        }
        return result;
    }
}