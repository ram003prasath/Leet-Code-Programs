public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int mul, sum, p1, p2, result[] = new int[num1.length() + num2.length()];
        for(int i=num1.length()-1; i>=0; i--){
            for(int j=num2.length()-1; j>=0; j--){
                mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                p1 = i + j;
                p2 = i + j + 1;
                sum = mul + result[p2];
                result[p2] = sum % 10;
                result[p1] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num:result){
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }
        return sb.toString();
    }
}
