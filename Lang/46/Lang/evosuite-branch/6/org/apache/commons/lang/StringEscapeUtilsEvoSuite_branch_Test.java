/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 18:22:48 GMT 2014
 */

package org.apache.commons.lang;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Locale;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.exception.NestableRuntimeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class StringEscapeUtilsEvoSuite_branch_Test extends StringEscapeUtilsEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      String string0 = "\"A%,/a?ciS/\"V3-";
      String string1 = StringEscapeUtils.unescapeCsv(string0);
      assertEquals("\"A%,/a?ciS/\"V3-", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "1arkMq\"D?}Kt0EFL\\";
      String string1 = StringEscapeUtils.escapeCsv(string0);
      assertEquals("\"1arkMq\"\"D?}Kt0EFL\\\"", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      assertNotNull(byteArrayOutputStream0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) byteArrayOutputStream0);
      assertNotNull(mockPrintWriter0);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
      
      StringEscapeUtils.unescapeCsv((Writer) mockPrintWriter0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(0, byteArrayOutputStream0.size());
      assertEquals("", byteArrayOutputStream0.toString());
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = ".Y";
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0);
      assertNotNull(mockFileWriter0);
      
      String string1 = null;
      StringEscapeUtils.unescapeCsv((Writer) mockFileWriter0, string1);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNull(string1);
      
      String string2 = StringEscapeUtils.unescapeCsv(string1);
      assertNull(string2);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = ".Y";
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0);
      assertNotNull(mockFileWriter0);
      
      String string1 = null;
      StringEscapeUtils.escapeCsv((Writer) mockFileWriter0, string1);
  }

  @Test
  public void test05()  throws Throwable  {
      String string0 = ".Y";
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0);
      assertNotNull(mockFileWriter0);
      
      StringEscapeUtils.escapeCsv((Writer) mockFileWriter0, string0);
  }

  @Test
  public void test06()  throws Throwable  {
      String string0 = "z";
      String string1 = StringEscapeUtils.escapeCsv(string0);
      assertEquals("z", string1);
      assertNotNull(string1);
      assertSame(string1, string0);
      assertSame(string0, string1);
  }

  @Test
  public void test07()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeSql(string0);
      assertNull(string1);
  }

  @Test
  public void test08()  throws Throwable  {
      String string0 = "1arkMq\"D?}Kt0EFL\\";
      String string1 = StringEscapeUtils.unescapeCsv(string0);
      assertEquals("1arkMq\"D?}Kt0EFL\\", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.escapeSql(string1);
      assertEquals("1arkMq\"D?}Kt0EFL\\", string2);
      assertNotNull(string2);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string2.equals((Object)string0));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeXml(string0);
      assertNull(string1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "g/VR3Wz`-=Wm@r\\f";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("g/VR3Wz`-=Wm@r\f", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.unescapeXml(string1);
      assertEquals("g/VR3Wz`-=Wm@r\f", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string2, string0);
      assertSame(string2, string1);
      assertSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
  }

  @Test
  public void test11()  throws Throwable  {
      String string0 = "\\&\\X=2nc9e?Q";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("&X=2nc9e?Q", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      MockFileWriter mockFileWriter0 = new MockFileWriter(string1);
      assertNotNull(mockFileWriter0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = null;
      StringEscapeUtils.unescapeXml((Writer) mockFileWriter0, string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test12()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "\\u00";
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeXml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      String string0 = "";
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      assertNotNull(pipedOutputStream0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      
      boolean boolean0 = false;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) pipedOutputStream0, boolean0);
      assertNotNull(mockPrintWriter0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
      
      StringEscapeUtils.unescapeXml((Writer) mockPrintWriter0, string0);
      assertEquals(false, pipedInputStream0.markSupported());
      assertEquals(0, pipedInputStream0.available());
  }

  @Test
  public void test14()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeXml(string0);
      assertNull(string1);
  }

  @Test
  public void test15()  throws Throwable  {
      String string0 = "\\&\\X=2nc9e?Q";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("&X=2nc9e?Q", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.escapeXml(string1);
      assertEquals("&amp;X=2nc9e?Q", string2);
      assertNotNull(string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
  }

  @Test
  public void test16()  throws Throwable  {
      String string0 = "V=)+l&_>(";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertNotNull(mockPrintWriter0);
      
      String string1 = null;
      StringEscapeUtils.escapeXml((Writer) mockPrintWriter0, string1);
  }

  @Test
  public void test17()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "%nU";
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeXml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      String string0 = "V=)+l&_>(";
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((File) mockFile0);
      assertNotNull(mockPrintWriter0);
      
      StringEscapeUtils.escapeXml((Writer) mockPrintWriter0, string0);
  }

  @Test
  public void test19()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      String string0 = null;
      StringEscapeUtils.unescapeHtml((Writer) stringWriter0, string0);
      assertEquals("", stringWriter0.toString());
  }

  @Test
  public void test20()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "s/\"\"FSkrv-1o7jPt'J";
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeHtml(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.unescapeHtml(string0);
      assertNull(string1);
  }

  @Test
  public void test22()  throws Throwable  {
      String string0 = "\\b{WZjkC";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("\b{WZjkC", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = StringEscapeUtils.unescapeHtml(string1);
      assertEquals("\b{WZjkC", string2);
      assertNotNull(string2);
      assertTrue(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
  }

  @Test
  public void test23()  throws Throwable  {
      String string0 = null;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      assertNotNull(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      
      CharsetEncoder charsetEncoder0 = charset0.newEncoder();
      assertNotNull(charsetEncoder0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      
      OutputStreamWriter outputStreamWriter0 = new OutputStreamWriter((OutputStream) pipedOutputStream0, charsetEncoder0);
      assertNotNull(outputStreamWriter0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      StringEscapeUtils.escapeHtml((Writer) outputStreamWriter0, string0);
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.canEncode());
      assertEquals(true, charset0.isRegistered());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.displayName());
      assertEquals(1.1F, charsetEncoder0.averageBytesPerChar(), 0.01F);
      assertEquals(3.0F, charsetEncoder0.maxBytesPerChar(), 0.01F);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
  }

  @Test
  public void test24()  throws Throwable  {
      String string0 = null;
      PrintWriter printWriter0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeHtml((Writer) printWriter0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null.
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      String string0 = "g/VR3Wz`-=Wm@r\\f";
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertEquals("g/VR3Wz`-=Wm@r\\f", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test26()  throws Throwable  {
      String string0 = "1arkMq\"D?}Kt0EFL\\";
      String string1 = StringEscapeUtils.unescapeCsv(string0);
      assertEquals("1arkMq\"D?}Kt0EFL\\", string1);
      assertNotNull(string1);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.unescapeJava(string1);
      assertEquals("1arkMq\"D?}Kt0EFL\\", string2);
      assertNotNull(string2);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = "{8#Sh|dH.\\r>f-{x*_v";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("{8#Sh|dH.\r>f-{x*_v", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test28()  throws Throwable  {
      String string0 = "y+\"P4x\\n:{";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("y+\"P4x\n:{", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test29()  throws Throwable  {
      String string0 = "1arkMq\"D?}Kt0EFL\\";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("1arkMq\\\"D?}Kt0EFL\\\\", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.unescapeJava(string1);
      assertEquals("1arkMq\"D?}Kt0EFL\\", string2);
      assertNotNull(string2);
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
  }

  @Test
  public void test30()  throws Throwable  {
      String string0 = "o\\'O/b";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("o'O/b", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test31()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = null;
      String string0 = " 1\\k%w5M\\uHLajc5n.5";
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertFalse(boolean0);
      
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0, boolean0);
      assertNotNull(mockFileWriter0);
      
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeJava((Writer) mockFileWriter0, string0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to parse unicode value: HLaj
         //
      }
  }

  @Test
  public void test32()  throws Throwable  {
      String string0 = ".Y";
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0);
      assertNotNull(mockFileWriter0);
      
      String string1 = null;
      StringEscapeUtils.unescapeJavaScript((Writer) mockFileWriter0, string1);
  }

  @Test
  public void test33()  throws Throwable  {
      String string0 = "{8#Sh|dH.\\r>f-{x*_v";
      Writer writer0 = null;
      // Undeclared exception!
      try {
        StringEscapeUtils.unescapeJavaScript(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test
  public void test34()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeHtml(string0);
      assertNull(string1);
      
      String string2 = StringEscapeUtils.unescapeJava(string1);
      assertNull(string2);
  }

  @Test
  public void test35()  throws Throwable  {
      String string0 = "\"A%,/a?ciS/\"V3-";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("\\\"A%,/a?ciS/\\\"V3-", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "mhrUE8G+Q1sW',_";
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertEquals("mhrUE8G+Q1sW',_", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test37()  throws Throwable  {
      String string0 = "6oX{N'mU@";
      MockFileWriter mockFileWriter0 = new MockFileWriter(string0);
      assertNotNull(mockFileWriter0);
      
      StringEscapeUtils.escapeJavaScript((Writer) mockFileWriter0, string0);
  }

  @Test
  public void test38()  throws Throwable  {
      String string0 = "0\\t{WZ]j\"C";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("0\t{WZ]j\"C", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = StringEscapeUtils.escapeJavaScript(string1);
      assertEquals("0\\t{WZ]j\\\"C", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
  }

  @Test
  public void test39()  throws Throwable  {
      String string0 = "\\b{WZjkC";
      String string1 = StringEscapeUtils.unescapeJavaScript(string0);
      assertEquals("\b{WZjkC", string1);
      assertNotNull(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = StringEscapeUtils.escapeJavaScript(string1);
      assertEquals("\\b{WZjkC", string2);
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertTrue(string0.equals((Object)string2));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertNotSame(string2, string0);
      assertNotSame(string2, string1);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string1, string2);
      assertNotSame(string1, string0);
  }

  @Test
  public void test40()  throws Throwable  {
      String string0 = null;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      assertNotNull(pipedInputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
      assertNotNull(pipedOutputStream0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      boolean boolean0 = false;
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) pipedOutputStream0, boolean0);
      assertNotNull(mockPrintWriter0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
      
      StringEscapeUtils.escapeJavaScript((Writer) mockPrintWriter0, string0);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(false, pipedInputStream0.markSupported());
  }

  @Test
  public void test41()  throws Throwable  {
      Writer writer0 = null;
      String string0 = "(]";
      // Undeclared exception!
      try {
        StringEscapeUtils.escapeJava(writer0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The Writer must not be null
         //
      }
  }

  @Test
  public void test42()  throws Throwable  {
      String string0 = null;
      String string1 = StringEscapeUtils.escapeJava(string0);
      assertNull(string1);
  }

  @Test
  public void test43()  throws Throwable  {
      String string0 = "";
      String string1 = StringEscapeUtils.unescapeCsv(string0);
      assertEquals("", string1);
      assertNotNull(string1);
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      String string2 = StringEscapeUtils.escapeJava(string1);
      assertEquals("", string2);
      assertNotNull(string2);
      assertTrue(string0.equals((Object)string2));
      assertTrue(string0.equals((Object)string1));
      assertTrue(string1.equals((Object)string0));
      assertTrue(string1.equals((Object)string2));
      assertTrue(string2.equals((Object)string1));
      assertTrue(string2.equals((Object)string0));
      assertNotSame(string0, string2);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
  }

  @Test
  public void test44()  throws Throwable  {
      StringEscapeUtils stringEscapeUtils0 = new StringEscapeUtils();
      assertNotNull(stringEscapeUtils0);
  }

  @Test
  public void test45()  throws Throwable  {
      int int0 = 0;
      StringWriter stringWriter0 = new StringWriter(int0);
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      Locale locale0 = Locale.CANADA_FRENCH;
      assertNotNull(locale0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      
      Locale locale1 = Locale.TRADITIONAL_CHINESE;
      assertNotNull(locale1);
      assertFalse(locale1.equals((Object)locale0));
      assertNotSame(locale1, locale0);
      assertEquals("zh", locale1.getLanguage());
      assertEquals("zh_TW", locale1.toString());
      assertEquals("", locale1.getVariant());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("TWN", locale1.getISO3Country());
      assertEquals("TW", locale1.getCountry());
      
      String string0 = locale0.getDisplayCountry(locale1);
      assertEquals("\u52A0\u62FF\u5927", string0);
      assertNotNull(string0);
      assertFalse(locale0.equals((Object)locale1));
      assertFalse(locale1.equals((Object)locale0));
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("zh", locale1.getLanguage());
      assertEquals("zh_TW", locale1.toString());
      assertEquals("", locale1.getVariant());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("TWN", locale1.getISO3Country());
      assertEquals("TW", locale1.getCountry());
      
      StringEscapeUtils.escapeJavaScript((Writer) stringWriter0, string0);
      assertFalse(locale0.equals((Object)locale1));
      assertFalse(locale1.equals((Object)locale0));
      assertNotSame(locale0, locale1);
      assertNotSame(locale1, locale0);
      assertEquals("CA", locale0.getCountry());
      assertEquals("fr_CA", locale0.toString());
      assertEquals("CAN", locale0.getISO3Country());
      assertEquals("", locale0.getVariant());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("\\u52A0\\u62FF\\u5927", stringWriter0.toString());
      assertEquals("zh", locale1.getLanguage());
      assertEquals("zh_TW", locale1.toString());
      assertEquals("", locale1.getVariant());
      assertEquals("zho", locale1.getISO3Language());
      assertEquals("TWN", locale1.getISO3Country());
      assertEquals("TW", locale1.getCountry());
  }

  @Test
  public void test46()  throws Throwable  {
      String string0 = "g/VR3Wz`-=Wm@r\\f";
      String string1 = StringEscapeUtils.unescapeJava(string0);
      assertEquals("g/VR3Wz`-=Wm@r\f", string1);
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      
      String string2 = StringEscapeUtils.escapeJavaScript(string1);
      assertEquals("g\\/VR3Wz`-=Wm@r\\f", string2);
      assertNotNull(string2);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string0.equals((Object)string1));
      assertFalse(string0.equals((Object)string2));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string0));
      assertNotSame(string1, string0);
      assertNotSame(string1, string2);
      assertNotSame(string0, string1);
      assertNotSame(string0, string2);
      assertNotSame(string2, string1);
      assertNotSame(string2, string0);
  }
}