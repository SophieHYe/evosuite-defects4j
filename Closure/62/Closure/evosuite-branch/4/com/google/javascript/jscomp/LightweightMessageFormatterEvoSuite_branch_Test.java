/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:52:14 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ControlStructureCheck;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import com.google.javascript.jscomp.TypeCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LightweightMessageFormatterEvoSuite_branch_Test extends LightweightMessageFormatterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      String string0 = "hUzyh_>*BD";
      int int0 = (-304);
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertNotNull(simpleRegion0);
      assertEquals(-304, simpleRegion0.getEndingLineNumber());
      assertEquals("hUzyh_>*BD", simpleRegion0.getSourceExcerpt());
      assertEquals(-304, simpleRegion0.getBeginningLineNumber());
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("  -304| hUzyh_>*BD", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(-304, simpleRegion0.getEndingLineNumber());
      assertEquals("hUzyh_>*BD", simpleRegion0.getSourceExcerpt());
      assertEquals(-304, simpleRegion0.getBeginningLineNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = (-2);
      String string0 = "";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertNotNull(simpleRegion0);
      assertEquals(-2, simpleRegion0.getBeginningLineNumber());
      assertEquals(-2, simpleRegion0.getEndingLineNumber());
      assertEquals("", simpleRegion0.getSourceExcerpt());
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNull(string1);
      assertEquals(-2, simpleRegion0.getBeginningLineNumber());
      assertEquals(-2, simpleRegion0.getEndingLineNumber());
      assertEquals("", simpleRegion0.getSourceExcerpt());
  }

  @Test
  public void test2()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      Region region0 = null;
      String string0 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion(region0);
      assertNull(string0);
  }

  @Test
  public void test3()  throws Throwable  {
      String string0 = "4\n";
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = (-304);
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertNotNull(simpleRegion0);
      assertEquals(-304, simpleRegion0.getBeginningLineNumber());
      assertEquals("4\n", simpleRegion0.getSourceExcerpt());
      assertEquals(-304, simpleRegion0.getEndingLineNumber());
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("  -304| 4", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(-304, simpleRegion0.getBeginningLineNumber());
      assertEquals("4\n", simpleRegion0.getSourceExcerpt());
      assertEquals(-304, simpleRegion0.getEndingLineNumber());
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 137;
      String string0 = "";
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = ControlStructureCheck.USE_OF_WITH;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[15];
      JSError jSError0 = JSError.make(string0, int0, int0, checkLevel0, diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(137, jSError0.getCharno());
      
      String string1 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals(":137: WARNING - The use of the with structure should be avoided.\n", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(137, jSError0.getCharno());
  }

  @Test
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      DiagnosticType diagnosticType0 = Normalize.CATCH_BLOCK_VAR_ERROR;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(-1, jSError0.getCharno());
      
      String string0 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertNotNull(string0);
      assertEquals("WARNING - The use of scope variable null is not allowed within a catch block with a catch exception of the same name.\n", string0);
      assertEquals(-1, jSError0.getCharno());
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter((SourceExcerptProvider) compiler0);
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = "MvD}V)H.:McOweMk";
      int int0 = (-52);
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = TypeCheck.CONFLICTING_EXTENDED_TYPE;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make(string0, int0, int0, checkLevel0, diagnosticType0, stringArray0);
      assertNotNull(jSError0);
      assertEquals(-52, jSError0.getCharno());
      
      String string1 = lightweightMessageFormatter0.formatError(jSError0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("MvD}V)H.:McOweMk: ERROR - null cannot extend this type; a constructor can only extend objects and an interface can only extend interfaces\n", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertEquals(-52, jSError0.getCharno());
  }
}