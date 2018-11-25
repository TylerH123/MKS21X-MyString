public class MyString implements CharSequence, Comparable<CharSequence>{
  public char[] data;
  public MyString(CharSequence s){
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index){
    if (index < 0 || index > data.length - 1) throw new IndexOutOfBoundsException();
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public String subSequence(int start, int end){
    String out = "";
    for (int i = start; i < start; i++){
      out += this.charAt(i);
    }
    return out;
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
  public int compareTo(CharSequence seq){
    int len1 = data.length;
    int len2 = seq.length();
    //for (int i = 0; i < )
    return 0;
  }
}
