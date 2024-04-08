import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.Collection<java.lang.String> strCollection3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strSet1.retainAll(strCollection3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strSet0.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strSet1.addFirst("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.removeAll((java.util.Collection<java.lang.String>) strList8);
        java.util.HashSet[] hashSetArray12 = new java.util.HashSet[0];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray13 = (java.util.HashSet<java.lang.String>[]) hashSetArray12;
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.String>[] strSetArray14 = strList8.toArray((java.util.HashSet<java.lang.String>[]) hashSetArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: arraycopy: element type mismatch: can not cast one of the elements of java.lang.Object[] to the type of the destination array, java.util.HashSet");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashSetArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSetArray13);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strSet1.removeLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.lang.Class<?> wildcardClass6 = strItor5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList8 = new java.util.ArrayList<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList8, strArray7);
        boolean boolean10 = strSet3.removeAll((java.util.Collection<java.lang.String>) strList8);
        java.lang.String str11 = strSet3.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "[]" + "'", str11.equals("[]"));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet7);
        java.lang.String[] strArray11 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.lang.String[] strArray16 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList17 = new java.util.ArrayList<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList17, strArray16);
        boolean boolean19 = strSet12.removeAll((java.util.Collection<java.lang.String>) strList17);
        java.util.HashSet[] hashSetArray21 = new java.util.HashSet[1];
        @SuppressWarnings("unchecked")
        java.util.HashSet<java.lang.String>[] strSetArray22 = (java.util.HashSet<java.lang.String>[]) hashSetArray21;
        strSetArray22[0] = strSet12;
        java.util.HashSet<java.lang.String>[] strSetArray25 = strSet8.toArray(strSetArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hashSetArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSetArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSetArray25);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = strSet6.addAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.NavigableSet<java.lang.String> strSet13 = strSet6.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray14 = strSet6.toArray();
        boolean boolean15 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.lang.String> strSet20 = strSet6.subSet("[]", true, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet7);
        java.lang.Object obj9 = strSet8.clone();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.lang.String> strSet11 = strSet1.subSet("hi!", "[]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str9 = strSet1.pollLast();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.util.NavigableSet<java.lang.String> strSet15 = strSet11.tailSet("", false);
        boolean boolean16 = strSet1.remove((java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        strSet1.clear();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        boolean boolean11 = strSet9.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = strSet10.higher("hi!");
        java.util.Iterator<java.lang.String> strItor14 = strSet10.iterator();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        boolean boolean17 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.NavigableSet<java.lang.String> strSet22 = strSet15.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray23 = strSet15.toArray();
        boolean boolean24 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean25 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet15);
        strSet15.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.lang.String str5 = strSet1.pollLast();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strSet1.getFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.lang.String str5 = strSet1.pollLast();
        java.lang.String str7 = strSet1.floor("hi!");
        // The following exception was thrown during execution in test generation
        try {
            strSet1.addFirst("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.reversed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strSet6.getLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        boolean boolean7 = strSet1.contains((java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str9 = strSet1.pollFirst();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.lang.String str9 = strSet0.lower("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean8 = strSet6.addAll((java.util.Collection<java.lang.String>) strSet7);
        java.util.NavigableSet<java.lang.String> strSet13 = strSet6.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray14 = strSet6.toArray();
        boolean boolean15 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.Spliterator<java.lang.String> strSpliterator16 = strSet1.spliterator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSpliterator16);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str9 = strSet1.pollLast();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.util.NavigableSet<java.lang.String> strSet17 = strSet10.subSet("hi!", false, "hi!", false);
        java.util.NavigableSet<java.lang.String> strSet20 = strSet10.tailSet("hi!", false);
        int int21 = strSet10.size();
        boolean boolean22 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = strSet1.getLast();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        strSet1.clear();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        boolean boolean11 = strSet9.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = strSet10.higher("hi!");
        java.util.Iterator<java.lang.String> strItor14 = strSet10.iterator();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        boolean boolean17 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.NavigableSet<java.lang.String> strSet22 = strSet15.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray23 = strSet15.toArray();
        boolean boolean24 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean25 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = strSet15.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray8 = strSet0.toArray();
        java.lang.String str9 = strSet0.pollFirst();
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.descendingSet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet2 = strSet0.headSet("[]");
        int int3 = strSet0.size();
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
        boolean boolean6 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet5);
        java.util.NavigableSet<java.lang.String> strSet9 = strSet5.tailSet("", false);
        java.lang.String str11 = strSet5.higher("");
        strSet5.clear();
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet5);
        boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = strSet0.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str10 = strSet1.lower("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        strSet1.clear();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        boolean boolean11 = strSet9.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = strSet10.higher("hi!");
        java.util.Iterator<java.lang.String> strItor14 = strSet10.iterator();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        boolean boolean17 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.NavigableSet<java.lang.String> strSet22 = strSet15.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray23 = strSet15.toArray();
        boolean boolean24 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean25 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet15);
        java.util.NavigableSet<java.lang.String> strSet26 = strSet1.reversed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = strSet1.removeFirst();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.reversed();
        java.lang.String str7 = strSet1.pollFirst();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        strSet1.clear();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet1);
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.lang.String str14 = strSet11.higher("hi!");
        java.lang.String str15 = strSet11.pollLast();
        java.lang.String str17 = strSet11.floor("hi!");
        boolean boolean18 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.util.Comparator<? super java.lang.String> wildcardComparator9 = strSet1.comparator();
        java.util.Iterator<java.lang.String> strItor10 = strSet1.descendingIterator();
        java.lang.String str11 = strSet1.pollFirst();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str3 = strSet1.pollFirst();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.util.NavigableSet<java.lang.String> strSet11 = strSet1.headSet("", true);
        java.util.SortedSet<java.lang.String> strSet14 = strSet1.subSet("hi!", "hi!");
        java.lang.String str15 = strSet1.pollLast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.String[] strArray1 = new java.lang.String[] { "[]" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        boolean boolean5 = strSet2.add("");
        // The following exception was thrown during execution in test generation
        try {
            strSet2.addLast("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str9 = strSet1.pollLast();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.util.NavigableSet<java.lang.String> strSet17 = strSet10.subSet("hi!", false, "hi!", false);
        java.util.NavigableSet<java.lang.String> strSet20 = strSet10.tailSet("hi!", false);
        int int21 = strSet10.size();
        boolean boolean22 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        java.util.NavigableSet<java.lang.String> strSet31 = strSet25.subSet("hi!", false, "hi!", true);
        java.lang.String str32 = strSet25.removeFirst();
        boolean boolean33 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet25);
        // The following exception was thrown during execution in test generation
        try {
            strSet25.addLast("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.reversed();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        boolean boolean9 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.NavigableSet<java.lang.String> strSet12 = strSet8.tailSet("", false);
        java.lang.String str14 = strSet8.higher("");
        java.lang.String str15 = strSet8.pollLast();
        java.lang.String str16 = strSet8.pollLast();
        int int17 = strSet8.size();
        boolean boolean18 = strSet1.remove((java.lang.Object) int17);
        java.util.NavigableSet<java.lang.String> strSet19 = strSet1.reversed();
        boolean boolean21 = strSet1.add("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray8 = strSet0.toArray();
        java.lang.String str9 = strSet0.pollFirst();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.util.NavigableSet<java.lang.String> strSet15 = strSet11.tailSet("", false);
        java.util.NavigableSet<java.lang.String> strSet16 = strSet11.descendingSet();
        java.lang.Object[] objArray17 = strSet11.toArray();
        boolean boolean18 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        strSet1.clear();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        boolean boolean11 = strSet9.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str13 = strSet10.higher("hi!");
        java.util.Iterator<java.lang.String> strItor14 = strSet10.iterator();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        boolean boolean17 = strSet15.addAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.NavigableSet<java.lang.String> strSet22 = strSet15.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray23 = strSet15.toArray();
        boolean boolean24 = strSet10.retainAll((java.util.Collection<java.lang.String>) strSet15);
        boolean boolean25 = strSet1.removeAll((java.util.Collection<java.lang.String>) strSet15);
        java.util.NavigableSet<java.lang.String> strSet26 = strSet1.reversed();
        java.util.Comparator<? super java.lang.String> wildcardComparator27 = strSet1.comparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardComparator27);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray8 = strSet0.toArray();
        java.lang.String str9 = strSet0.pollFirst();
        java.util.NavigableSet<java.lang.String> strSet12 = strSet0.headSet("", false);
        java.util.NavigableSet<java.lang.String> strSet13 = strSet12.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.tailSet("hi!", false);
        int int11 = strSet0.size();
        boolean boolean13 = strSet0.remove((java.lang.Object) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.tailSet("hi!", false);
        int int11 = strSet0.size();
        java.lang.String str13 = strSet0.higher("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.descendingSet();
        java.util.Comparator<? super java.lang.String> wildcardComparator7 = strSet1.comparator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(wildcardComparator7);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.reversed();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        boolean boolean9 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.NavigableSet<java.lang.String> strSet12 = strSet8.tailSet("", false);
        java.lang.String str14 = strSet8.higher("");
        java.lang.String str15 = strSet8.pollLast();
        java.lang.String str16 = strSet8.pollLast();
        int int17 = strSet8.size();
        boolean boolean18 = strSet1.remove((java.lang.Object) int17);
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet21 = strSet19.headSet("[]");
        int int22 = strSet19.size();
        java.util.TreeSet<java.lang.String> strSet23 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
        boolean boolean25 = strSet23.addAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.NavigableSet<java.lang.String> strSet28 = strSet24.tailSet("", false);
        java.lang.String str30 = strSet24.higher("");
        strSet24.clear();
        java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet24);
        boolean boolean33 = strSet19.containsAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean34 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet19);
        java.lang.String str35 = strSet19.pollLast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.util.NavigableSet<java.lang.String> strSet11 = strSet1.headSet("", true);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
        boolean boolean14 = strSet12.addAll((java.util.Collection<java.lang.String>) strSet13);
        java.lang.String str16 = strSet13.higher("hi!");
        java.util.Iterator<java.lang.String> strItor17 = strSet13.iterator();
        java.util.NavigableSet<java.lang.String> strSet18 = strSet13.reversed();
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
        boolean boolean21 = strSet19.addAll((java.util.Collection<java.lang.String>) strSet20);
        java.util.NavigableSet<java.lang.String> strSet24 = strSet20.tailSet("", false);
        java.lang.String str26 = strSet20.higher("");
        java.lang.String str27 = strSet20.pollLast();
        java.lang.String str28 = strSet20.pollLast();
        int int29 = strSet20.size();
        boolean boolean30 = strSet13.remove((java.lang.Object) int29);
        java.util.NavigableSet<java.lang.String> strSet31 = strSet13.reversed();
        boolean boolean32 = strSet1.equals((java.lang.Object) strSet31);
        java.util.Iterator<java.lang.String> strItor33 = strSet1.iterator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor33);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str9 = strSet1.pollLast();
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.util.NavigableSet<java.lang.String> strSet17 = strSet10.subSet("hi!", false, "hi!", false);
        java.util.NavigableSet<java.lang.String> strSet20 = strSet10.tailSet("hi!", false);
        int int21 = strSet10.size();
        boolean boolean22 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.String str24 = strSet10.lower("");
        strSet10.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet2 = strSet0.headSet("[]");
        int int3 = strSet0.size();
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
        boolean boolean6 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet5);
        java.util.NavigableSet<java.lang.String> strSet9 = strSet5.tailSet("", false);
        java.lang.String str11 = strSet5.higher("");
        strSet5.clear();
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet5);
        boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet5);
        boolean boolean16 = strSet5.contains((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        java.lang.String str8 = strSet1.pollLast();
        java.lang.String str9 = strSet1.pollLast();
        int int10 = strSet1.size();
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet1.spliterator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSpliterator11);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.reversed();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        boolean boolean9 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.NavigableSet<java.lang.String> strSet12 = strSet8.tailSet("", false);
        java.lang.String str14 = strSet8.higher("");
        java.lang.String str15 = strSet8.pollLast();
        java.lang.String str16 = strSet8.pollLast();
        int int17 = strSet8.size();
        boolean boolean18 = strSet1.remove((java.lang.Object) int17);
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet21 = strSet19.headSet("[]");
        int int22 = strSet19.size();
        java.util.TreeSet<java.lang.String> strSet23 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
        boolean boolean25 = strSet23.addAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.NavigableSet<java.lang.String> strSet28 = strSet24.tailSet("", false);
        java.lang.String str30 = strSet24.higher("");
        strSet24.clear();
        java.util.TreeSet<java.lang.String> strSet32 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet24);
        boolean boolean33 = strSet19.containsAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean34 = strSet1.retainAll((java.util.Collection<java.lang.String>) strSet19);
        strSet19.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.Iterator<java.lang.String> strItor5 = strSet1.iterator();
        java.util.NavigableSet<java.lang.String> strSet6 = strSet1.reversed();
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        boolean boolean9 = strSet7.addAll((java.util.Collection<java.lang.String>) strSet8);
        java.util.NavigableSet<java.lang.String> strSet12 = strSet8.tailSet("", false);
        java.lang.String str14 = strSet8.higher("");
        java.lang.String str15 = strSet8.pollLast();
        java.lang.String str16 = strSet8.pollLast();
        int int17 = strSet8.size();
        boolean boolean18 = strSet1.remove((java.lang.Object) int17);
        java.util.Spliterator<java.lang.String> strSpliterator19 = strSet1.spliterator();
        java.lang.Object[] objArray20 = strSet1.toArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSpliterator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray20);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet2 = strSet0.headSet("[]");
        int int3 = strSet0.size();
        java.util.TreeSet<java.lang.String> strSet4 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
        boolean boolean6 = strSet4.addAll((java.util.Collection<java.lang.String>) strSet5);
        java.util.NavigableSet<java.lang.String> strSet9 = strSet5.tailSet("", false);
        java.lang.String str11 = strSet5.higher("");
        strSet5.clear();
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet5);
        boolean boolean14 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet5);
        boolean boolean16 = strSet5.add("[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.tailSet("", false);
        java.lang.String str7 = strSet1.higher("");
        strSet1.clear();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet1);
        java.util.TreeSet<java.lang.String> strSet10 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>();
        boolean boolean12 = strSet10.addAll((java.util.Collection<java.lang.String>) strSet11);
        java.util.NavigableSet<java.lang.String> strSet15 = strSet11.tailSet("", false);
        java.lang.String str17 = strSet11.higher("");
        java.lang.String str18 = strSet11.pollLast();
        java.util.NavigableSet<java.lang.String> strSet21 = strSet11.headSet("", true);
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet24 = strSet22.headSet("[]");
        int int25 = strSet22.size();
        java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet27 = new java.util.TreeSet<java.lang.String>();
        boolean boolean28 = strSet26.addAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.NavigableSet<java.lang.String> strSet31 = strSet27.tailSet("", false);
        java.lang.String str33 = strSet27.higher("");
        strSet27.clear();
        java.util.TreeSet<java.lang.String> strSet35 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet27);
        boolean boolean36 = strSet22.containsAll((java.util.Collection<java.lang.String>) strSet27);
        java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet38 = new java.util.TreeSet<java.lang.String>();
        boolean boolean39 = strSet37.addAll((java.util.Collection<java.lang.String>) strSet38);
        java.util.NavigableSet<java.lang.String> strSet44 = strSet37.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray45 = strSet37.toArray();
        java.lang.String str46 = strSet37.pollFirst();
        java.util.NavigableSet<java.lang.String> strSet49 = strSet37.headSet("", false);
        java.util.NavigableSet<java.lang.String> strSet50 = strSet49.reversed();
        java.util.TreeSet<java.lang.String> strSet51 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet53 = strSet51.headSet("[]");
        int int54 = strSet51.size();
        java.util.TreeSet<java.lang.String> strSet55 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>();
        boolean boolean57 = strSet55.addAll((java.util.Collection<java.lang.String>) strSet56);
        java.util.NavigableSet<java.lang.String> strSet60 = strSet56.tailSet("", false);
        java.lang.String str62 = strSet56.higher("");
        strSet56.clear();
        java.util.TreeSet<java.lang.String> strSet64 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet56);
        boolean boolean65 = strSet51.containsAll((java.util.Collection<java.lang.String>) strSet56);
        boolean boolean67 = strSet56.contains((java.lang.Object) (short) 1);
        java.util.TreeSet<java.lang.String> strSet68 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet69 = new java.util.TreeSet<java.lang.String>();
        boolean boolean70 = strSet68.addAll((java.util.Collection<java.lang.String>) strSet69);
        java.util.NavigableSet<java.lang.String> strSet75 = strSet68.subSet("hi!", false, "hi!", false);
        java.util.NavigableSet<java.lang.String> strSet78 = strSet68.tailSet("hi!", false);
        int int79 = strSet68.size();
        boolean boolean81 = strSet68.remove((java.lang.Object) (byte) 100);
        java.util.NavigableSet[] navigableSetArray83 = new java.util.NavigableSet[5];
        @SuppressWarnings("unchecked")
        java.util.NavigableSet<java.lang.String>[] strSetArray84 = (java.util.NavigableSet<java.lang.String>[]) navigableSetArray83;
        strSetArray84[0] = strSet21;
        strSetArray84[1] = strSet22;
        strSetArray84[2] = strSet50;
        strSetArray84[3] = strSet56;
        strSetArray84[4] = strSet68;
        java.util.NavigableSet<java.lang.String>[] strSetArray95 = strSet1.toArray(strSetArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(navigableSetArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSetArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSetArray95);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strSet1.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.lang.String[] strArray10 = new java.lang.String[] { "", "" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        boolean boolean18 = strSet11.removeAll((java.util.Collection<java.lang.String>) strList16);
        boolean boolean19 = strSet0.equals((java.lang.Object) strList16);
        java.lang.Object obj20 = strSet0.clone();
        java.lang.Object obj21 = null;
        boolean boolean22 = strSet0.equals(obj21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.lang.String str4 = strSet1.higher("hi!");
        java.util.NavigableSet<java.lang.String> strSet5 = strSet1.descendingSet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet1 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
        java.util.NavigableSet<java.lang.String> strSet7 = strSet0.subSet("hi!", false, "hi!", false);
        java.lang.Object[] objArray8 = strSet0.toArray();
        java.lang.String str9 = strSet0.pollFirst();
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strSet10);
    }
}

