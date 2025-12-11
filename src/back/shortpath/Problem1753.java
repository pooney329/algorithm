package back.shortpath;

import java.io.*;
import java.util.*;

public class Problem1753 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(br.readLine());

        //1.nodeArrayList를 V의 개수 만큼 초기화 진행
        ArrayList<ArrayList<Main.Node>> nodeArrayList = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            nodeArrayList.add(new ArrayList<>());
        }

        //1-1.nodeArrayList 에 인접 노드를 넣어준다
        for (int i = 1; i <= E; i++) {
            String[] nodeInfo = br.readLine().split(" ");
            int u = Integer.parseInt(nodeInfo[0]);
            int v = Integer.parseInt(nodeInfo[1]);
            int w = Integer.parseInt(nodeInfo[2]);
            nodeArrayList.get(u).add(new Main.Node(v, w));
        }

        //2.visited 와 최단거리 배열을 만든다
        boolean[] visited = new boolean[V + 1];
        int[] distance = new int[V + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[startNode] = 0;


        //2.우선 순위 큐에 초기시작 노드를 넣아준다.
        PriorityQueue<Main.Node> priorityQueue = new PriorityQueue<>(Comparator.comparing(i -> i.getDistance()));
        priorityQueue.offer(new Main.Node(startNode, 0));


        //3.우선 순위 큐에 넣어서 가장 짧은 가중치에 해당하는 노드를 가져온다
        while (!priorityQueue.isEmpty()) {
            Main.Node currentNode = priorityQueue.poll();

            if (visited[currentNode.getNumber()]) continue;
            visited[currentNode.getNumber()] = true;

            //3-1 현재 노드에 인접한 노드들을 가지고온다.
            ArrayList<Main.Node> nextNodeList = nodeArrayList.get(currentNode.getNumber());

            //3-2 인접노드들의 최소거리를 갱신한다.
            for (Main.Node next : nextNodeList) {
                //3-3 현재 최단거리보다 더 작은 경우 갱신한다
                if (next.getDistance() + distance[currentNode.getNumber()] < distance[next.getNumber()]) {
                    distance[next.getNumber()] = next.getDistance() + distance[currentNode.getNumber()];
                    priorityQueue.offer(new Main.Node(next.getNumber(), distance[next.getNumber()]));
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            sb.append(distance[i] == Integer.MAX_VALUE ? "INF\n" : distance[i] + "\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();

    }

    public static class Node {
        private int number;
        private int distance;

        public Node(int number, int distance) {
            this.number = number;
            this.distance = distance;
        }

        public int getNumber() {
            return number;
        }

        public int getDistance() {
            return distance;
        }
    }


}
