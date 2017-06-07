/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:06:49 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CodeGenerator;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class CodeGeneratorEvoSuite_branch_Test extends CodeGeneratorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "\t\n\f\r \u0085\u2029\u3000";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\\u0009\\u000a\\u000c\\u000d \\u0085\\u2029\\u3000", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test01()  throws Throwable  {
      char char0 = 'h';
      Charset charset0 = Charset.defaultCharset();
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertNotNull(charset0);
      
      String string0 = "\t\n\f\r \u0085\u2029\u3000";
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertNotNull(charsetEncoder0);
      
      String string1 = CodeGenerator.strEscape(string0, char0, string0, string0, string0, charsetEncoder0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("h\\t\\n\f\\r \u0085\u2029\u3000h", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      String string2 = CodeGenerator.regexpEscape(string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertEquals(true, charset0.canEncode());
      assertEquals("UTF-8", charset0.name());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals(true, charset0.isRegistered());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals("/h\\t\\n\\u000c\\r \\u0085\\u2029\\u3000h/", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "L8b/rHGY<->|`";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/L8b/rHGY<->|`/", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "Ld8'bDHAGY<!-->";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"Ld8'bDHAGY<\\!--\\>\"", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "]]>&";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("\"]]\\>&\"", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      
      String string2 = CodeGenerator.regexpEscape(string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertEquals("/\"]]\\>&\"/", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = "3";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(3.0, double0, 0.01D);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "";
      double double0 = CodeGenerator.getSimpleNumber(string0);
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = ">~!Q$z\\u`M";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "pd8b`r]GYs[]>l`";
      String string1 = CodeGenerator.identifierEscape(string0);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertEquals("pd8b`r]GYs[]>l`", string1);
      assertNotNull(string1);
      
      String string2 = CodeGenerator.regexpEscape(string1);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotSame(string1, string2);
      assertEquals("/pd8b`r]GYs[]>l`/", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string2));
      
      double double0 = CodeGenerator.getSimpleNumber(string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertSame(string0, string1);
      assertSame(string1, string0);
      assertNotSame(string1, string2);
      assertEquals(Double.NaN, double0, 0.01D);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string2));
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "0";
      boolean boolean0 = CodeGenerator.isSimpleNumber(string0);
      assertFalse(boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = ".mgk</script-lq";
      String string1 = CodeGenerator.escapeToDoubleQuotedJsString(string0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals("\".mgk<\\/script-lq\"", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = ">~!Q$z\\u`M";
      String string1 = CodeGenerator.regexpEscape(string0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals("/>~!Q$z\\u007f\\u`M/", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
  }
}