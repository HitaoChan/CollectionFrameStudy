package study.generic;

import java.util.*;

class GeneriticClass<T> implements GeneriticItf<T> {

    /*在返回值前定义了泛型参数的方法，就是泛型方法。*/
    public <K, E extends Exception> K genericMethod(K param) throws E {
        java.util.List<K> list = new ArrayList<K>();
        K k = null;
        return null;
    }

    /**
     * 适合大数据List集合去除已有元素
     * @param source
     * @param dest
     * @param <K> 参数
     */
    public static <K> void removeBigDataList(List<K> source, List<K> dest) {
        Set<K> destinationSet =new HashSet<>(dest);

        Iterator iterator = source.iterator();
        while (iterator.hasNext()){
            K t = (K) iterator.next();
            if(destinationSet.contains(t)){
                iterator.remove();
            }
        }
    }

}
