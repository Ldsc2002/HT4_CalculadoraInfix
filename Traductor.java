public class Traductor {
    private int OrdenOperacion(String c){
        switch (c){
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
                return 2;
        }
        return -1;
    }
        
    public StackList<String> traducir(IStack<String> data) {
        StackList<String> res = new StackList<>();
        StackList<String> stack = new StackList<>();
        
        while (!data.isEmpty()) {
            String x = data.pop();
            if(OrdenOperacion(x) > 0){
                while(!stack.isEmpty() && OrdenOperacion(stack.peek()) >= OrdenOperacion(x)){
                    res.push(stack.pop());
                }
                
                stack.push(x);
            
            } else if(x.equals(")")){
                String y = stack.pop();
                
                while(!y.equals("(")){
                    res.push(y);
                    y = stack.pop();
                }
                
            } else if(x.equals("(")){
                stack.push(x);
    
            } else{
                res.push(x);
            }
        }
    
        for (int i = 0; i < stack.count() ; i++) {
            res.push(stack.pop());
        }

        StackList<String> resInverso = new StackList<>();

        while(!res.isEmpty()) { //Crea un stack inverso
            resInverso.push(res.pop());
        }

        return resInverso;
    }    
}
    


