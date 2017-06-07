/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:33:30 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LocaleUtilsEvoSuite_branch_Test extends LocaleUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "no";
      List list0 = LocaleUtils.countriesByLanguage(string0);
      assertEquals(1, list0.size());
      assertEquals(false, list0.isEmpty());
      assertNotNull(list0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "NO";
      List list0 = LocaleUtils.languagesByCountry(string0);
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test02()  throws Throwable  {
      Locale locale0 = null;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertFalse(boolean0);
  }

  @Test
  public void test03()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      assertEquals(156, set0.size());
      assertEquals(false, set0.isEmpty());
      assertNotNull(set0);
      
      Set set1 = LocaleUtils.availableLocaleSet();
      assertSame(set1, set0);
      assertEquals(false, set1.isEmpty());
      assertEquals(156, set1.size());
      assertNotNull(set1);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "Yq8F\\EwAvkF'";
      Locale locale0 = Locale.forLanguageTag(string0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(locale0);
      
      String string1 = null;
      Locale locale1 = LocaleUtils.toLocale(string1);
      assertNull(locale1);
      
      List list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getLanguage());
      assertEquals("", locale0.toString());
      assertEquals("", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertNotNull(list0);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "|0hnj,";
      Locale locale0 = new Locale(string0, string0, string0);
      assertEquals("|0hnj,", locale0.getVariant());
      assertEquals("|0hnj,_|0HNJ,_|0hnj,", locale0.toString());
      assertEquals("|0hnj,", locale0.getLanguage());
      assertEquals("|0HNJ,", locale0.getCountry());
      assertNotNull(locale0);
      
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(3, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("|0hnj,", locale0.getVariant());
      assertEquals("|0hnj,_|0HNJ,_|0hnj,", locale0.toString());
      assertEquals("|0hnj,", locale0.getLanguage());
      assertEquals("|0HNJ,", locale0.getCountry());
      assertNotNull(list0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
      
      List list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = "wm_HL]=}";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: wm_HL]=}
         //
      }
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "wm_F]=}";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: wm_F]=}
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "wv_W\"7{KZ_y";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: wv_W\"7{KZ_y
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "wm_{LL=}";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: wm_{LL=}
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "wm_ dp;}";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: wm_ dp;}
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "hq>>\"H -";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: hq>>\"H -
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "sq['-L8e`nT";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: sq['-L8e`nT
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "yGkRVof3MIHUt";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: yGkRVof3MIHUt
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "{L";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: {L
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "U4N\"pP;eWU>@8ybom";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: U4N\"pP;eWU>@8ybom
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertNotNull(locale0);
      
      String string0 = locale0.toString();
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", string0);
      assertNotNull(string0);
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale1.toString());
      assertEquals("", locale1.getVariant());
      assertEquals("CN", locale1.getCountry());
      assertEquals("CHN", locale1.getISO3Country());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("zh", locale1.getLanguage());
      assertTrue(locale0.equals((Object)locale1));
      assertTrue(locale1.equals((Object)locale0));
      assertNotNull(locale1);
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "no";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertEquals("no", locale0.toString());
      assertEquals("no", locale0.getLanguage());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("nor", locale0.getISO3Language());
      assertNotNull(locale0);
  }

  @Test
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertTrue(boolean0);
  }

  @Test
  public void test21()  throws Throwable  {
      Locale locale0 = Locale.ENGLISH;
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertNotNull(locale0);
      
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals("en", locale0.toString());
      assertEquals("", locale0.getCountry());
      assertEquals("", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("en", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals(false, list0.isEmpty());
      assertEquals(1, list0.size());
      assertNotNull(list0);
  }

  @Test
  public void test22()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }
}