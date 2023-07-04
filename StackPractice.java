
public class StackPractice{
    public static void main(String[] args) {
        MoneyStacks one=new MoneyStacks(new Cash(null, 20));
        one.pushCash(new Cash(10) );
        one.pushCash(new Cash(30) );
        one.pushCash(new Cash(70) );
        System.out.println(one);

        one.popCash();
        System.out.println(one);
    }

    //My stacks of cash
    public static class MoneyStacks {
        Cash head=null;

        public MoneyStacks(Cash h){
            head=h;
        }

        public MoneyStacks(){
            head=null;
        }

        public String toString(){
            if (head==null) {
                return "None";
            }

            Cash curr=head;
            // Cash next=curr.next;
            String result="CASH STACK BOX[";
            while (curr!=null) {
                result+=" "+curr.getValue()+" ";
                curr=curr.getNext();
            }
            return result+"]";

        }
        public void pushCash(Cash c){
            if (head==null) {
                head=c;
            }
            else{
                c.setNext(head);
                head=c;
                
            }
        }

        public void popCash(){
            head=head.next;
        }

        public Cash peak(){
            return head;
        }

    }

    //value of dollar im adding 
    public static class Cash{
        private Cash next;
        private int value;


        public Cash(Cash n,int v){
            next=n;
            value=v;
        }

        public Cash(int v){
            next=null;
            value=v;
        }

        //Getters
        public Cash getNext(){
            return this.next;
        }
        public String getValue(){
            return "$"+value;
        }

        //Setters
        public void setNext(Cash c){
            this.next=c;
        }
    }

    
}