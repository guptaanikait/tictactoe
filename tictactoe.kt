package tictactoe
import java.lang.Double.parseDouble
import kotlin.math.abs
import java.lang.StringBuilder
fun helper(input:MutableList<Char>,flag1:Int){
    var (a,b)=readln().split(" ")
    var numeric1=true
    try {
        val num = parseDouble(a)
    } catch (e: NumberFormatException) {
        numeric1 = false
    }
    var numeric2=true
    try {
        val num = parseDouble(b)
    } catch (e: NumberFormatException) {
        numeric2 = false
    }
    if(numeric1==false || numeric2==false){
        println("You should enter numbers!")
        helper(input,flag1)
    }
    if(numeric1==true && numeric2==true && ((a.toInt()!=3 && a.toInt()!=1 && a.toInt()!=2) || (b.toInt()!=3 && b.toInt()!=1 && b.toInt()!=2))){
        println("Coordinates should be from 1 to 3!")
        helper(input,flag1)
    }
    else{
    //if(numeric1==true && numeric2==true && ((a.toInt()==3 || a.toInt()==1 || a.toInt()==2) && (b.toInt()==3 || b.toInt()==1 || b.toInt()!=2))){
    var value=((a.toInt()-1)*3)+(b.toInt()-1)
    if(input[value]=='X' || input[value]=='O'){
        println("This cell is occupied! Choose another one!")
        helper(input,flag1)
    }
    else{
        if(flag1==0){
        input[value]='X'
            
        }
        else{
          input[value]='O'  
          
        }
        //var new=input.replace(input[value],'X')
        //var new=input.substring(0,value)+'X'+input.substring(value+1)
        println("---------")
    print("| ")
    print("${input[0]} ")
    print("${input[1]} ")
    print("${input[2]} ")
    println("|")
    print("| ")
    print("${input[3]} ")
    print("${input[4]} ")
    print("${input[5]} ")
    println("|")
    print("| ")
    print("${input[6]} ")
    print("${input[7]} ")
    print("${input[8]} ")
    println("|")
    println("---------")
        //return new
        //return

        //input=new
    }
    //}
    }
}
fun main() {
    // write your code here
    //println("X O X")
    //println("O X O")
    //println("X X O")
    var input=mutableListOf<Char>(' ',' ',' ',' ',' ',' ',' ',' ',' ')
    println("---------")
    print("| ")
    print("${input[0]} ")
    print("${input[1]} ")
    print("${input[2]} ")
    println("|")
    print("| ")
    print("${input[3]} ")
    print("${input[4]} ")
    print("${input[5]} ")
    println("|")
    print("| ")
    print("${input[6]} ")
    print("${input[7]} ")
    print("${input[8]} ")
    println("|")
    println("---------")
    var flag=0
    var flag1=0
    while(flag==0){
    helper(input,flag1)
    
    
    var numx=0
    var numo=0
    var numb=0
    for(i in 0..8){
        
            if(input[i]=='X'){
                numx+=1
            }
            else if(input[i]=='O'){
                numo+=1
            }
            else{
                numb+=1
            }
    }
    //println(numx)
    //println(numo)
    //println(numb)
    var flagx=0
    var flago=0
    if((input[0]=='X' && input[1]=='X' && input[2]=='X') || (input[3]=='X' && input[4]=='X' && input[5]=='X') || (input[6]=='X' && input[7]=='X' && input[8]=='X') ||
            (input[0]=='X' && input[3]=='X' && input[6]=='X') || (input[1]=='X' && input[4]=='X' && input[7]=='X') || (input[2]=='X' && input[5]=='X' && input[8]=='X') ||
            (input[6]=='X' && input[7]=='X' && input[8]=='X') || (input[0]=='X' && input[4]=='X' && input[8]=='X') || (input[2]=='X' && input[4]=='X' && input[6]=='X')){
                flagx=1
            }
    if((input[0]=='O' && input[1]=='O' && input[2]=='O') || (input[3]=='O' && input[4]=='O' && input[5]=='O') || (input[6]=='O' && input[7]=='O' && input[8]=='O') ||
            (input[0]=='O' && input[3]=='O' && input[6]=='O') || (input[1]=='O' && input[4]=='O' && input[7]=='O') || (input[2]=='O' && input[5]=='O' && input[8]=='O') ||
            (input[6]=='O' && input[7]=='O' && input[8]=='O') || (input[0]=='O' && input[4]=='O' && input[8]=='O') || (input[2]=='O' && input[4]=='O' && input[6]=='O')){
                flago=1
            }
    if((flagx==1 && flago==1) || (abs(numx-numo)>1)){
        println("Impossible")
        flag=1
    }
    else if(flagx==1){
        println("X wins")
        flag=1
    }
    else if(flago==1){
        println("O wins")
        flag=1
    }
    else if(flagx==0 && flago==0 && numb==0){
        println("Draw")
        flag=1
    }
    else if(flagx==0 && flago==0 && numb>0){
        //println("Game not finished")
        if(flag1==0){
            flag1=1
        }
        else{
            flag1=0
        }
        flag=0
    }
  }
    
}
