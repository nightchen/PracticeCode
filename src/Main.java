import java.util.Map;

public class Main {
    public static void main(String[] args)throws Exception {

        System.out.println((int) 'a');
        System.out.println(Integer.bitCount(10));
        Map<String,String> env = System.getenv();
        for(String name : env.keySet()){
            System.out.println(name + "----->"+ env.get(name));
        }
        System.out.println("*********************");
        System.out.println(System.getenv("JAVA_HOME"));
        System.out.println(System.currentTimeMillis());
        //System.out.println(System.nanoTime());
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器数量："+rt.availableProcessors());
        System.out.println("空闲内存："+rt.freeMemory());
        System.out.println("总内存："+rt.totalMemory());
        System.out.println("可用最大内存："+rt.maxMemory());
        rt.exec("notepad.exe");
    }
}
