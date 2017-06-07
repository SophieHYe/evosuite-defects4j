/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:11:10 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CheckPropertyOrder;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DiagnosticType;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.LightweightMessageFormatter;
import com.google.javascript.jscomp.PureFunctionIdentifier;
import com.google.javascript.jscomp.Region;
import com.google.javascript.jscomp.SimpleRegion;
import com.google.javascript.jscomp.SourceExcerptProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class LightweightMessageFormatterEvoSuite_branch_Test extends LightweightMessageFormatterEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      int int0 = (-12);
      String string0 = "K#\n";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertEquals("K#\n", simpleRegion0.getSourceExcerpt());
      assertEquals(-12, simpleRegion0.getEndingLineNumber());
      assertEquals(-12, simpleRegion0.getBeginningLineNumber());
      assertNotNull(simpleRegion0);
      
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertEquals("K#\n", simpleRegion0.getSourceExcerpt());
      assertEquals(-12, simpleRegion0.getEndingLineNumber());
      assertEquals(-12, simpleRegion0.getBeginningLineNumber());
      assertEquals("  -12| K#", string1);
      assertNotNull(string1);
  }

  @Test
  public void test1()  throws Throwable  {
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = (-5);
      String string0 = "^/oc`5=_wg";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertEquals(-5, simpleRegion0.getEndingLineNumber());
      assertEquals("^/oc`5=_wg", simpleRegion0.getSourceExcerpt());
      assertEquals(-5, simpleRegion0.getBeginningLineNumber());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(-5, simpleRegion0.getEndingLineNumber());
      assertEquals("^/oc`5=_wg", simpleRegion0.getSourceExcerpt());
      assertEquals(-5, simpleRegion0.getBeginningLineNumber());
      assertEquals("  -5| ^/oc`5=_wg", string1);
      assertNotNull(string1);
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
      LightweightMessageFormatter.LineNumberingFormatter lightweightMessageFormatter_LineNumberingFormatter0 = new LightweightMessageFormatter.LineNumberingFormatter();
      assertNotNull(lightweightMessageFormatter_LineNumberingFormatter0);
      
      int int0 = (-16);
      String string0 = "";
      SimpleRegion simpleRegion0 = new SimpleRegion(int0, int0, string0);
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(-16, simpleRegion0.getEndingLineNumber());
      assertEquals(-16, simpleRegion0.getBeginningLineNumber());
      assertNotNull(simpleRegion0);
      
      String string1 = lightweightMessageFormatter_LineNumberingFormatter0.formatRegion((Region) simpleRegion0);
      assertEquals("", simpleRegion0.getSourceExcerpt());
      assertEquals(-16, simpleRegion0.getEndingLineNumber());
      assertEquals(-16, simpleRegion0.getBeginningLineNumber());
      assertNull(string1);
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 4315;
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      String string0 = "*c^d\"Z8";
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      DiagnosticType diagnosticType0 = CheckPropertyOrder.UNEQUAL_PROPERTIES;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[66];
      JSError jSError0 = JSError.make(string0, int0, int0, checkLevel0, diagnosticType0, stringArray0);
      assertEquals(4315, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatError(jSError0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(4315, jSError0.getCharno());
      assertEquals("*c^d\"Z8:4315: ERROR - different control paths produce different (ordered) property lists: null vs. null\n", string1);
      assertNotNull(string1);
  }

  @Test
  public void test5()  throws Throwable  {
      LightweightMessageFormatter lightweightMessageFormatter0 = LightweightMessageFormatter.withoutSource();
      assertNotNull(lightweightMessageFormatter0);
      
      DiagnosticType diagnosticType0 = PureFunctionIdentifier.INVALID_MODIFIES_ANNOTATION;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[4];
      JSError jSError0 = JSError.make(diagnosticType0, stringArray0);
      assertEquals(-1, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string0 = lightweightMessageFormatter0.formatError(jSError0);
      assertEquals(-1, jSError0.getCharno());
      assertEquals("ERROR - @modifies may only appear in externs files.\n", string0);
      assertNotNull(string0);
  }

  @Test
  public void test6()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      int int0 = (-16);
      String string0 = "";
      LightweightMessageFormatter lightweightMessageFormatter0 = new LightweightMessageFormatter((SourceExcerptProvider) compiler0);
      assertNotNull(lightweightMessageFormatter0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      DiagnosticType diagnosticType0 = Compiler.DUPLICATE_EXTERN_INPUT;
      assertNotNull(diagnosticType0);
      
      String[] stringArray0 = new String[1];
      JSError jSError0 = JSError.make(string0, int0, int0, checkLevel0, diagnosticType0, stringArray0);
      assertEquals(-16, jSError0.getCharno());
      assertNotNull(jSError0);
      
      String string1 = lightweightMessageFormatter0.formatWarning(jSError0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(-16, jSError0.getCharno());
      assertEquals(": WARNING - Duplicate extern input: null\n", string1);
      assertNotNull(string1);
  }
}