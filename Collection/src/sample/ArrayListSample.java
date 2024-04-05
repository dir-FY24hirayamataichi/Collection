package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        List<String> places = new ArrayList<String>();
        
        //　要素の追加
        places.add("アイスランド");
        places.add("スペイン");
        places.add("ナポリ");
        places.add("リスボン");
        places.add("ヨセミテ国立公園");
        
        // 要素の取得
        String firstItem = places.get(0);
        System.out.println("１番目の要素（置換前） ： " + firstItem);
        
        // 要素の変更
        places.set(0, "スウェーデン");    // 最初の要素を置換
        System.out.println("1番目の要素（置換後） : " + places.get(0));
        
        // 要素の削除
        System.out.println("2番目の要素（削除前） : " + places.get(1));
        places.remove(1);   // 2番目の要素を削除
        System.out.println("2番目の要素（削除後） : " + places.get(1));
        
        // 拡張 or ループによる取得
        System.out.println("拡張forループによる取得 : ");
        for(int i=0; i < places.size(); i++) {
            System.out.println(places.get(i));
        }
        
        // forEach とラムダ式による取得
        System.out.println("forEachとラムダ時期による取得 : ");
        places.forEach(place -> System.out.println(place));
        
        // サイズの取得
        int size = places.size();   // リストのサイズ取得
        System.out.println("リストのサイズ（クリア前） : " + size);
        places.clear();
        System.out.println("リストのサイズ（クリア後） : " + places.size());
        
    }

}
