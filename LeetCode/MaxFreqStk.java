/*
Design a stack-like data structure to push elements to the stack and pop the most frequent element from the stack.
Implement the FreqStack class:
FreqStack() constructs an empty frequency stack.
void push(int val) pushes an integer val onto the top of the stack.
int pop() removes and returns the most frequent element in the stack.
If there is a tie for the most frequent element, the element closest to the stack's top is removed and returned.
*/

class FreqStack {
    private Map<Integer,Integer> freq;
    private Map<Integer,Stack<Integer>> freqStk;
    private int maxFreq;

    public FreqStack() {
        freq = new HashMap<>();
        freqStk = new HashMap<>();
        maxFreq = 0;
    }

    public void push(int val) {
        int f = freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        maxFreq = Math.max(maxFreq,f);
        if(!freqStk.containsKey(f))
            freqStk.put(f,new Stack<>());
        freqStk.get(f).add(val);
    }

    public int pop() {
        int ans = freqStk.get(maxFreq).pop();
        freq.put(ans,maxFreq-1);
        if(freqStk.get(maxFreq).size()==0)
            maxFreq--;
        return ans;
    }
}