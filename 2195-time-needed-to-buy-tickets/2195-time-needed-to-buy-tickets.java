class Solution{
    public int timeRequiredToBuy(int[] tickets,int k){
        Deque<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            queue.offerLast(i);
        }  //tickets ko rehne do make a queue of persons and then just do queue operation as per question since every index is in queue therefore we can see how much tickets the index we want have that is the person hahahhahahah boooo
        int time=0;
        while(!queue.isEmpty()){
            int person=queue.pollFirst();
            tickets[person]--;
            time++;
            if(tickets[k]==0){
                break;
            }
            if(tickets[person]>0){
                queue.offerLast(person);
            }
        }
        return time;
    }
}
