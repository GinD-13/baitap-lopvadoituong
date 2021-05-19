//khia báo ArrayList 
//import thư viện java.util.ArrayList
import java.util.ArrayList;
//sử dụng iterator
import java.util.Iterator;
//sử dụng listiterator
import java.util.ListIterator;
public class TeenClass {    
    public static void main(String[] args){
        //khai báo 1 arrayList có tên là arrlistString
        //có kiểu là String
        ArrayList<String> arrListString = new ArrayList<>();
        //khai báo một arrayList có tên là arrListName
        //có kiểu là String và có 10 phần tử
        ArrayList<String> arrListName = new ArrayList<>(10);
        //
        ArrayList<Integer> arrListInterger = new ArrayList<>();
        //
        ArrayList<Float> arrListFloat = new ArrayList<>();
        //
        ArrayList<Character> arrListChar = new ArrayList<>();
        //------------------
        //sử dụng vòng lặp for
        //thêm các phần tử sử dụng phương thức add
        arrListString.add("Java");
        arrListString.add("PHP");
        arrListString.add("C++");
        //duyệt theo kích thước của arrListString
        //sử dụng vòng lặp for thông 
        //phương thức arrListString.size() sẽ trả  số phần tử của arrayListString
        //và sau đó lấy phần tử tại vị trí thứ i thông qua hàm get()
        //sau đó hiểm thị giá trị phần tử đó ra
        System.out.println("Cac phan tu co trong arrayList la: ");
        for(int i = 0; i<arrListString.size();i++){
            System.out.println(arrListString.get(i) + "\t");
        }
        //----------------------
        //sử dụng vòng for cải tiến
        //thêm các phần tử sử dụng phuowg thức adđ
        arrListInterger.add(0);
        arrListInterger.add(7);
        arrListInterger.add(1);
        arrListInterger.add(9);
        //duyệt theo kích thước của arrListInterger
        //sử dụng vòng lặp for duyệt theo đối tượng
        //trong đó kiểu dữ liệu của biến number
        //phải trùng với kiểu dữ liệu của arrayListInterger
        System.out.println("Cac phan tu co trong arrayListInterger la: ");
        for(int number:arrListInterger){
            System.out.println(number + "\t");
        }
        //--------------------------
        //thêm các phần tử dử dụng phương thức add
        //chữ f cho biết các số thêm và là số thực
        //nếu ko có chữ này thì trình biên dịch sẽ hiểu đay là số double
        //và sẽ báo lỗi dữ liệu
        arrListFloat.add(0.7f);
        arrListFloat.add(7.26f);
        arrListFloat.add(1.02f);
        arrListFloat.add(9.3f);
        //khai báo một iterater có kiểu float
        Iterator<Float> iterator = arrListFloat.iterator();
        System.out.println("Cac phan tu co trong arrListFloat la: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next() + "\t");        
        }
        //
        //thêm các phần tử sử dụng phương thức add
        arrListChar.add('a');
        arrListChar.add('e');
        arrListChar.add('b');
        arrListChar.add('c');
        //khai báo một ListIterator có kiểu Character
        ListIterator<Character> listIterator = arrListChar.listIterator();
        //hiển thị các phần tử có trong arrListChar
        //bằng cách sử dụng listIterator
        System.out.println("Cac phan tu co trong arrListChar la:");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + "\t");
        }
    }
}
