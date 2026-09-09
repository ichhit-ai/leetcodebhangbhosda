class Solution {
    public int countStudents(int[] students,int[] sandwiches) {
        Deque<Integer> student=new ArrayDeque<>();
        Deque<Integer> sandwich=new ArrayDeque<>();
        for(int i=0;i<students.length;i++){
            student.offerLast(students[i]);
            sandwich.offerLast(sandwiches[i]);
        }
        int rotations=0;
        while(!student.isEmpty()){
            if(student.peekFirst()==sandwich.peekFirst()){
                student.pollFirst();
                sandwich.pollFirst();
                rotations=0;
            }else{
                student.offerLast(student.pollFirst());
                rotations++;
                if(rotations==student.size()){
                    break;
                }
            }
        }
        return student.size();
    }
}
