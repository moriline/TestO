package moriline.testo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Stream;

import moriline.testo.TArray;
import moriline.testo.TCollection;
import moriline.testo.TMap;

public class CollectionTest {

	public static void collectionTest() {
		new TCollection<Object>(new ArrayList<Object>()).notNull().isEmpty();
		List<String>value = new ArrayList<String>();
		value.add("a");
		new TCollection<String>(value).notNull().notEmpty().eqSize(1);
		new TCollection<String>(new HashSet<String>()).notNull().isEmpty();
		
		Collection<String>collection = new TCollection<String>(Arrays.asList("a","b")).contains(Arrays.asList("a","b")).eq(Arrays.asList("a","b")).get();
	}
	
	public static void mapTest() {
		new TMap<Long, Long>(new HashMap<Long, Long>()).notNull().isEmpty();
		ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("a", "b");
		new TMap<String, String>(map).notNull().notEmpty().eqSize(1);
		
		Map<Long, String>testMap = new HashMap<Long, String>();
		testMap.put(1L, "a");testMap.put(2L, "b");
		Map<Long, String>res = new TMap<Long, String>(testMap).notNull().eqSize(2).get();
	}
	
	public static void arrayTest() {
		new TArray<String>(new String[]{"a","b"}).notNull().notEmpty().eqSize(2);
		new TArray<String>(new String[]{}).notNull().isEmpty().eqSize(0);
		Integer[] arr = new TArray<Integer>(new Integer[]{}).notNull().isEmpty().eqSize(0).get();
		String[] strArray = new String[4];
		String[] strArray2 = new String[4];
		for(int i=0;i<4;i++){
			String strTemp = new String(i+" name");
			strArray[i] = strTemp;
			strArray2[i] = strTemp;
		}
		new TArray<String>(strArray).notNull().notEmpty().eq(strArray2);
		new TArray<String>("a","b","c").eq("a","b","c").eqSize(3);
		Integer[] arr2 = new TArray<Integer>(1,2,3).eq(1,2,3).eqSize(3).get();
		
		new TArray<Long>(1L,2L,3L).notNull().notEmpty().eq(1L,2L,3L).eqSize(3);
		new TArray<String>("a","b","c").eq(Arrays.asList("a","b","c")).eqSize(3);
	}

	public static void main(String[] args) {
		collectionTest();
		mapTest();
		arrayTest();
	}
}
