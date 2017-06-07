/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 17:16:14 GMT 2014
 */

package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.CharArrayWriter;
import java.io.PipedWriter;
import java.io.Writer;
import java.net.URI;
import java.nio.charset.Charset;
import org.apache.commons.lang3.text.translate.AggregateTranslator;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.apache.commons.lang3.text.translate.NumericEntityUnescaper;
import org.apache.commons.lang3.text.translate.OctalUnescaper;
import org.apache.commons.lang3.text.translate.UnicodeEscaper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CharSequenceTranslatorEvoSuite_branch_Test extends CharSequenceTranslatorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      int int0 = 1903;
      NumericEntityEscaper numericEntityEscaper0 = NumericEntityEscaper.above(int0);
      assertNotNull(numericEntityEscaper0);
      
      charSequenceTranslatorArray0[0] = (CharSequenceTranslator) numericEntityEscaper0;
      assertNotNull(charSequenceTranslatorArray0[0]);
      
      int int1 = 0;
      NumericEntityEscaper numericEntityEscaper1 = NumericEntityEscaper.above(int1);
      assertNotNull(numericEntityEscaper1);
      assertFalse(int1 == int0);
      assertFalse(numericEntityEscaper1.equals((Object)numericEntityEscaper0));
      assertNotSame(numericEntityEscaper1, numericEntityEscaper0);
      
      charSequenceTranslatorArray0[1] = (CharSequenceTranslator) numericEntityEscaper1;
      assertNotNull(charSequenceTranslatorArray0[1]);
      
      AggregateTranslator aggregateTranslator0 = new AggregateTranslator(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
      
      String string0 = CharSequenceTranslator.hex(int0);
      assertEquals("76F", string0);
      assertNotNull(string0);
      assertFalse(int0 == int1);
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter(int0);
      assertEquals(0, charArrayWriter0.size());
      assertEquals("", charArrayWriter0.toString());
      assertNotNull(charArrayWriter0);
      assertFalse(int0 == int1);
      
      aggregateTranslator0.translate((CharSequence) string0, (Writer) charArrayWriter0);
      assertEquals("&#55;&#54;&#70;", charArrayWriter0.toString());
      assertEquals(15, charArrayWriter0.size());
      assertFalse(int0 == int1);
  }

  @Test
  public void test1()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      assertNotNull(octalUnescaper0);
      
      CharSequence charSequence0 = null;
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      octalUnescaper0.translate(charSequence0, (Writer) pipedWriter0);
  }

  @Test
  public void test2()  throws Throwable  {
      UnicodeEscaper unicodeEscaper0 = new UnicodeEscaper();
      assertNotNull(unicodeEscaper0);
      
      String string0 = "&#";
      URI uRI0 = URI.create(string0);
      assertNull(uRI0.getHost());
      assertNull(uRI0.getRawAuthority());
      assertEquals(false, uRI0.isOpaque());
      assertEquals(-1, uRI0.getPort());
      assertNull(uRI0.getRawUserInfo());
      assertNull(uRI0.getScheme());
      assertEquals("", uRI0.getRawFragment());
      assertEquals(false, uRI0.isAbsolute());
      assertEquals("&#", uRI0.toString());
      assertNull(uRI0.getRawQuery());
      assertEquals("&", uRI0.getRawPath());
      assertNotNull(uRI0);
      
      String string1 = uRI0.getRawUserInfo();
      assertNull(uRI0.getHost());
      assertNull(uRI0.getRawAuthority());
      assertEquals(false, uRI0.isOpaque());
      assertEquals(-1, uRI0.getPort());
      assertNull(uRI0.getRawUserInfo());
      assertNull(uRI0.getScheme());
      assertEquals("", uRI0.getRawFragment());
      assertEquals(false, uRI0.isAbsolute());
      assertEquals("&#", uRI0.toString());
      assertNull(uRI0.getRawQuery());
      assertEquals("&", uRI0.getRawPath());
      assertNull(string1);
      
      Writer writer0 = null;
      // Undeclared exception!
      try {
        unicodeEscaper0.translate((CharSequence) string1, writer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      CharSequence charSequence0 = null;
      NumericEntityUnescaper.OPTION[] numericEntityUnescaper_OPTIONArray0 = new NumericEntityUnescaper.OPTION[7];
      NumericEntityUnescaper.OPTION numericEntityUnescaper_OPTION0 = NumericEntityUnescaper.OPTION.semiColonOptional;
      numericEntityUnescaper_OPTIONArray0[0] = numericEntityUnescaper_OPTION0;
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[0].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[0].name());
      
      numericEntityUnescaper_OPTIONArray0[1] = numericEntityUnescaper_OPTIONArray0[0];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[1].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].name());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[1].toString());
      
      numericEntityUnescaper_OPTIONArray0[2] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[2].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[2].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[3] = numericEntityUnescaper_OPTIONArray0[2];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].name());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[3].toString());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[3].ordinal());
      
      numericEntityUnescaper_OPTIONArray0[4] = numericEntityUnescaper_OPTIONArray0[3];
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[4].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[4].toString());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[4].name());
      
      numericEntityUnescaper_OPTIONArray0[5] = numericEntityUnescaper_OPTION0;
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[5].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[5].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[5].toString());
      
      numericEntityUnescaper_OPTIONArray0[6] = numericEntityUnescaper_OPTIONArray0[5];
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[6].name());
      assertEquals(1, numericEntityUnescaper_OPTIONArray0[6].ordinal());
      assertEquals("semiColonOptional", numericEntityUnescaper_OPTIONArray0[6].toString());
      
      NumericEntityUnescaper numericEntityUnescaper0 = new NumericEntityUnescaper(numericEntityUnescaper_OPTIONArray0);
      assertNotNull(numericEntityUnescaper0);
      
      String string0 = numericEntityUnescaper0.translate(charSequence0);
      assertNull(string0);
  }

  @Test
  public void test4()  throws Throwable  {
      OctalUnescaper octalUnescaper0 = new OctalUnescaper();
      assertNotNull(octalUnescaper0);
      
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertNotNull(charset0);
      
      String string0 = charset0.displayName();
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", string0);
      assertNotNull(string0);
      
      String string1 = octalUnescaper0.translate((CharSequence) string0);
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test5()  throws Throwable  {
      CharSequenceTranslator[] charSequenceTranslatorArray0 = new CharSequenceTranslator[9];
      int int0 = 1903;
      UnicodeEscaper unicodeEscaper0 = UnicodeEscaper.below(int0);
      assertNotNull(unicodeEscaper0);
      
      AggregateTranslator aggregateTranslator0 = (AggregateTranslator)unicodeEscaper0.with(charSequenceTranslatorArray0);
      assertNotNull(aggregateTranslator0);
  }
}