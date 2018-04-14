package JinRiTouTiao;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by nightchen on 2018/3/27.
 */
public class Problem4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> nums1 = new TreeSet<>();
        TreeSet<Integer> nums2 = new TreeSet<>();
        long total1 = 0;
        long total2 = 0;
        for (int i = 0;i < n;i++){
            int x = sc.nextInt();
            total1 += x;
            nums1.add(x);
        }
        for (int i = 0;i < m;i++){
            int y = sc.nextInt();
            total2 += y;
            nums2.add(y);
        }
        int c = 0;
        if (total1/nums1.size() > total2/nums2.size()){
            c = count(nums1,total1,total2,nums1.size(),nums2.size());
        }else {
            c = count(nums2,total2,total1,nums2.size(),nums1.size());
        }
        System.out.println(c);
    }

    public static int count(TreeSet<Integer> big,long totalbig,long totalamall,int bign,int smallm){
        int count = 0;
        while (totalbig/bign > totalamall/smallm & big.size() >1){
              double bigavg = totalbig/bign;
              double smallavg = totalamall/smallm;
              System.out.println(bigavg+" **** "+smallavg);
              int smallavgi = (int)smallavg+1;
              Integer min = big.ceiling(smallavgi);
              if (min != null & min <= bigavg){
                  count ++;
                  big.remove(min);
                  totalbig = totalbig - min;
                  totalamall = totalamall + min;
                  bign--;
                  smallm++;
                  System.out.println(big);
            }else {
                  break;
              }
        }
        return count;
    }

}
