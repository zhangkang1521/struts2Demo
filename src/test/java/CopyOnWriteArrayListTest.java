import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * https://my.oschina.net/jielucky/blog/167198
 * struts2 的valueStack使用了copyOnWriteArrayList
 * Created by zhangkang on 2017/1/20.
 */
public class CopyOnWriteArrayListTest {

    @Test
    public void test1() {
        List<String> list = new CopyOnWriteArrayList<String>();
//        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            System.out.println(it.next());
            i++;
            if(i == 1) {
                list.remove(0);
            }
        }

    }

    /**
     * 读线程
     */
    private static class ReadTask implements Runnable {
        List<String> list;

        public ReadTask(List<String> list) {
            this.list = list;
        }

        public void run() {
            // 遍历器遍历时，对list进行add操作会引发并发修改异常
            // copyOnWriteArrayList 的迭代器使用了快照
            Iterator<String> it = list.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
            //System.out.println(Thread.currentThread());
        }
    }
    /**
     * 写线程
     */
    private static class WriteTask implements Runnable {
        List<String> list;
        int index;

        public WriteTask(List<String> list, int index) {
            this.list = list;
            this.index = index;
        }

        public void run() {
//            list.remove(index);
            list.add(index, "write_" + index);
           // System.out.println(Thread.currentThread());
        }
    }

    public void run() {
        final int NUM = 5;
//        List<String> list = new ArrayList<String>();
        List<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < NUM; i++) {
            list.add("main_" + i);
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < NUM; i++) {
            executorService.execute(new ReadTask(list));
            executorService.execute(new WriteTask(list, i));
        }
        executorService.shutdown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        new CopyOnWriteArrayListTest().run();
    }
}
