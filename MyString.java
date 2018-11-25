public class MyString implements CharSequence, Comparable<CharSequence>{
  public char[] data;
  /**
    * initializes MyString
    * @param s is a CharSequence
    */
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  /**
    *returns the char at the given index
    * @param index is the desired index
    */
  public char charAt(int index){
    if (index < 0 || index > data.length - 1) throw new IndexOutOfBoundsException();
    return data[index];
  }
  /**
    * returns length of the MyString
    */
  public int length(){
    return data.length;
  }
  /** returns a subString of MyString
    * @param start is the index which the subString starts (inclusive)
    * @param end is the index which the ssubString ends (exclusive)
    */
  public String subSequence(int start, int end){
    if (start < 0 || end > data.length - 1 || end < start || end < 0) throw new IndexOutOfBoundsException();
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
