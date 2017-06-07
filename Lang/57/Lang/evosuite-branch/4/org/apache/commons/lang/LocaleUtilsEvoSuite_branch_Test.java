/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:02:37 GMT 2014
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
      String string0 = "ar";
      List list0 = LocaleUtils.countriesByLanguage(string0);
      assertNotNull(list0);
      assertEquals(false, list0.isEmpty());
      assertEquals(17, list0.size());
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "ar";
      List list0 = LocaleUtils.languagesByCountry(string0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "ar";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("ar", locale0.getLanguage());
      assertEquals("ara", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ar", locale0.toString());
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
      assertEquals("", locale0.getVariant());
      assertEquals("ar", locale0.getLanguage());
      assertEquals("ara", locale0.getISO3Language());
      assertEquals("", locale0.getISO3Country());
      assertEquals("", locale0.getCountry());
      assertEquals("ar", locale0.toString());
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = null;
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNull(locale0);
      
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertFalse(boolean0);
  }

  @Test
  public void test04()  throws Throwable  {
      Set set0 = LocaleUtils.availableLocaleSet();
      assertNotNull(set0);
      assertEquals(156, set0.size());
      assertEquals(false, set0.isEmpty());
      
      Set set1 = LocaleUtils.availableLocaleSet();
      assertNotNull(set1);
      assertEquals(false, set1.isEmpty());
      assertEquals(156, set1.size());
      assertSame(set1, set0);
  }

  @Test
  public void test05()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      
      Locale locale1 = Locale.KOREAN;
      assertFalse(locale1.equals((Object)locale0));
      assertNotNull(locale1);
      assertEquals("ko", locale1.getLanguage());
      assertEquals("ko", locale1.toString());
      assertEquals("kor", locale1.getISO3Language());
      assertEquals("", locale1.getVariant());
      assertEquals("", locale1.getISO3Country());
      assertEquals("", locale1.getCountry());
      assertNotSame(locale1, locale0);
      
      List list0 = LocaleUtils.localeLookupList(locale1, locale0);
      assertFalse(locale1.equals((Object)locale0));
      assertFalse(locale0.equals((Object)locale1));
      assertNotNull(list0);
      assertEquals("ko", locale1.getLanguage());
      assertEquals("ko", locale1.toString());
      assertEquals("kor", locale1.getISO3Language());
      assertEquals("", locale1.getVariant());
      assertEquals("", locale1.getISO3Country());
      assertEquals("", locale1.getCountry());
      assertEquals(false, list0.isEmpty());
      assertEquals(2, list0.size());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertNotSame(locale1, locale0);
      assertNotSame(locale0, locale1);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "el_ZS_2n*";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("ZS", locale0.getCountry());
      assertEquals("2n*", locale0.getVariant());
      assertEquals("el", locale0.getLanguage());
      assertEquals("el_ZS_2n*", locale0.toString());
      assertEquals("ell", locale0.getISO3Language());
      
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertNotNull(list0);
      assertEquals(3, list0.size());
      assertEquals(false, list0.isEmpty());
      assertEquals("ZS", locale0.getCountry());
      assertEquals("2n*", locale0.getVariant());
      assertEquals("el", locale0.getLanguage());
      assertEquals("el_ZS_2n*", locale0.toString());
      assertEquals("ell", locale0.getISO3Language());
  }

  @Test
  public void test07()  throws Throwable  {
      Locale locale0 = null;
      List list0 = LocaleUtils.localeLookupList(locale0);
      assertNotNull(list0);
      assertEquals(true, list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "es_ZO^:2n(:h*";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: es_ZO^:2n(:h*
         //
      }
  }

  @Test
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      
      String string0 = locale0.toString();
      assertEquals("zh_TW", string0);
      assertNotNull(string0);
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      
      Locale locale1 = LocaleUtils.toLocale(string0);
      assertTrue(locale1.equals((Object)locale0));
      assertTrue(locale0.equals((Object)locale1));
      assertNotNull(locale1);
      assertEquals("zh_TW", locale1.toString());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("TWN", locale1.getISO3Country());
      assertEquals("zh", locale1.getLanguage());
      assertEquals("", locale1.getVariant());
      assertEquals("TW", locale1.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("TW", locale0.getCountry());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("TWN", locale0.getISO3Country());
      assertEquals("zh_TW", locale0.toString());
      assertNotSame(locale1, locale0);
      assertNotSame(locale0, locale1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "el_Zt0zO9qS2mnCh*H";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: el_Zt0zO9qS2mnCh*H
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "eb_Z:nS:2nPCh*H";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: eb_Z:nS:2nPCh*H
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "el_uuOS2nC6*";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: el_uuOS2nC6*
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "al_:1S(:2nCh*H";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: al_:1S(:2nCh*H
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = "s}9OMTnx(-";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: s}9OMTnx(-
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "y%qd-A8ts0&'<mY/";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: y%qd-A8ts0&'<mY/
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "}R(3ru\"fX]G";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: }R(3ru\"fX]G
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      String string0 = "el_ZS_2n*";
      Locale locale0 = LocaleUtils.toLocale(string0);
      assertNotNull(locale0);
      assertEquals("el_ZS_2n*", locale0.toString());
      assertEquals("ell", locale0.getISO3Language());
      assertEquals("el", locale0.getLanguage());
      assertEquals("ZS", locale0.getCountry());
      assertEquals("2n*", locale0.getVariant());
      
      String string1 = locale0.getVariant();
      assertEquals("2n*", string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("el_ZS_2n*", locale0.toString());
      assertEquals("ell", locale0.getISO3Language());
      assertEquals("el", locale0.getLanguage());
      assertEquals("ZS", locale0.getCountry());
      assertEquals("2n*", locale0.getVariant());
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      // Undeclared exception!
      try {
        Locale locale1 = LocaleUtils.toLocale(string1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 2n*
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      assertNotNull(locale0);
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      
      String string0 = locale0.toLanguageTag();
      assertEquals("ja-JP", string0);
      assertNotNull(string0);
      assertEquals("ja_JP", locale0.toString());
      assertEquals("ja", locale0.getLanguage());
      assertEquals("JPN", locale0.getISO3Country());
      assertEquals("jpn", locale0.getISO3Language());
      assertEquals("", locale0.getVariant());
      assertEquals("JP", locale0.getCountry());
      
      // Undeclared exception!
      try {
        Locale locale1 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ja-JP
         //
      }
  }

  @Test
  public void test19()  throws Throwable  {
      String string0 = "&C-D~iyhB";
      // Undeclared exception!
      try {
        Locale locale0 = LocaleUtils.toLocale(string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: &C-D~iyhB
         //
      }
  }

  @Test
  public void test20()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      assertNotNull(localeUtils0);
  }
}