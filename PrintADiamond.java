//Given a letter print a diamond starting with 'A' with the supplied letter at the side

public class PrintADiamond{
    
    public static void main(String[] args){
    
        if(args.length == 0){
            System.out.println("ERROR: no arguments given - choose a char from 'A' to 'Z'. ");
            return;
        }
        else if((int)(args[0].charAt(0)) < 65 || (int)(args[0].charAt(0)) > 90){
            System.out.println("ERROR: choose a char from 'A' to 'Z'. ");
            return;
        }
        
        
        //char input = 'E';//test input
        char input = args[0].charAt(0);
        
        char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        
        //search the char position in alphabet array
        int position = 0;
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i] == input){
                position = i;
                break;
            }
        }
        
        
        /**output**/
        char output = ' ';
        int positionColumn = 0;
        int positionRow = 0;
        
        //row: start
        boolean reverseRow = true;
        for(int j=0; j<=position; j++){
            //row: for reversed alphabet
            if(reverseRow){
                positionRow = j;
                if(positionRow==position){
                    reverseRow = false;
                    j = 0;
                }
            }
            else{
                positionRow = position - j;
            }
            //column:
            boolean reverseColumn = true;
            for(int k=0; k<=position; k++){
                //column: for beginning reversed alphabet
                if(reverseColumn){
                    positionColumn = position - k;
                    //column: end of reversed alphabet
                    if(k==position){
                        reverseColumn = false;
                        k = 0;
                    }
                }
                else{
                    positionColumn = k;
                }
                //output
                if(positionColumn==positionRow){
                    output = alphabet[positionColumn];
                }
                else{
                    output = '.';
                }
                System.out.print(output);
            }
            //next line
            System.out.println();
        }
    }
}

//char character = 'A';
//int ascii = (int) character; //ascii = 65

//int number = 65;
//char character = (char) number; //character = 'A'
