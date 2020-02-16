import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.print.DocFlavor;

class Hero{
    public String name;
    public String skill1;
    public String skill2;
    public String skill3;
    public String skill4;
}
public class TestGson {
    public static void main(String[] args) {
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name","曹操");
        hashMap.put("skill1","剑气");
        hashMap.put("skill2","三段跳");
        hashMap.put("skill3","加攻击并吸血");
        hashMap.put("skill4","加攻速");
        //通过 map 转成 JSON 结构的字符串
        //1.创建一个 gson 对象
        Gson gson = new GsonBuilder().create();
        //2.使用 toJson 方法把键值对结构转换成 JSON 字符串
        String str = gson.toJson(hashMap);
        System.out.println(str);
    }
}
