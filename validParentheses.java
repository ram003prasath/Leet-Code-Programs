import java.util.HashMap;

public class validParentheses {
    public boolean isValid(String s) {

        HashMap<Character,Character> map = new HashMap<>();

        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        char stack[] = new char[s.length()], current, lastopened;
        int top = -1;
        for(int i = 0; i<s.length(); i++){
            current = s.charAt(i);

            if(map.containsKey(current)){
                stack[++top] = current;
            }
            else{
                if(top == -1){
                    return false;
                }

                lastopened = stack[top--];

                if(current != map.get(lastopened)){
                    return false;
                }

            }

        }
        
        return top == -1;

    }
}