public class MyString implements Charsequence, Comparable<Charsequence>{
  public char[] data;
  public MyString(Charsequence s){
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index){
    return data[index];
  }
  public int length(){
    return data.length;
  }
  
  public String toString(){
    String output = "[";
    for (int i = 0; i < data.length; i++){
      if (i == data.length - 1) output += data[i];
      else{
        output += data[i] + " ";
      }
    }
    output += "]";
    return output;
  }
}
