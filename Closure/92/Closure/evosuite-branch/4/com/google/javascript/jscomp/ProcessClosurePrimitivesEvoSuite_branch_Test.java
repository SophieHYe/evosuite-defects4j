/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:20:18 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.ProcessClosurePrimitives;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ProcessClosurePrimitivesEvoSuite_branch_Test extends ProcessClosurePrimitivesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = true;
      int int0 = 30;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(30, node0.getLineno());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(30, node0.getType());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(30, node0.getCharno());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(0, node0.getSideEffectFlags());
      
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      NodeTraversal nodeTraversal0 = null;
      // Undeclared exception!
      try {
        processClosurePrimitives0.visit(nodeTraversal0, node0, node0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/92/4/run_evosuite.pl_1515_1418339395/operator {0} cannot be applied to {1}");
      String string0 = "gog.now";
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      assertTrue(boolean0);
      
      boolean boolean1 = FileSystemHandling.appendLineToFile(evoSuiteFile0, string0);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(printStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean1);
      assertNotNull(processClosurePrimitives0);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertTrue(boolean1 == boolean0);
      
      String string1 = "operator {0} cannot be applied to {1}";
      assertNotSame(string1, string0);
      
      Charset charset0 = Charset.defaultCharset();
      assertNotNull(charset0);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile(string1, charset0);
      assertNotSame(string1, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.getName());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.toString());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.getOriginalPath());
      assertFalse(string1.equals((Object)string0));
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotSame(string1, string0);
      assertNotNull(node0);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getChildCount());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.getName());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.toString());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.getOriginalPath());
      assertFalse(string1.equals((Object)string0));
      
      processClosurePrimitives0.process(node0, node0);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals("UTF-8", charset0.displayName());
      assertEquals("UTF-8", charset0.toString());
      assertEquals("UTF-8", charset0.name());
      assertEquals(true, charset0.isRegistered());
      assertEquals(true, charset0.canEncode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(1, node0.getChildCount());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.getName());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.toString());
      assertEquals("operator {0} cannot be applied to {1}", jSSourceFile0.getOriginalPath());
      assertFalse(string1.equals((Object)string0));
      assertTrue(boolean1 == boolean0);
      assertFalse(string0.equals((Object)string1));
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = false;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      String string0 = "goJog.a=e";
      Node node0 = compiler0.parseSyntheticCode(string0, string0);
      assertNotNull(node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(1, node0.getLineno());
      assertEquals(0, node0.getCharno());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      CheckLevel checkLevel0 = CheckLevel.OFF;
      boolean boolean0 = false;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      
      int int0 = 30;
      Node node0 = new Node(int0, int0, int0);
      assertNotNull(node0);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(30, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(30, node0.getCharno());
      assertEquals(30, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(30, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isQuotedString());
      assertEquals(30, node0.getCharno());
      assertEquals(30, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.hasMoreThanOneChild());
  }

  @Test
  public void test4()  throws Throwable  {
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(printStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      
      CheckLevel checkLevel0 = CheckLevel.ERROR;
      boolean boolean0 = false;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      
      String string0 = "R/goog.base";
      JSSourceFile jSSourceFile0 = JSSourceFile.fromCode(string0, string0);
      assertNotNull(jSSourceFile0);
      assertEquals("R/goog.base", jSSourceFile0.getName());
      assertEquals("R/goog.base", jSSourceFile0.getOriginalPath());
      assertEquals("R/goog.base", jSSourceFile0.toString());
      
      Node node0 = compiler0.parse(jSSourceFile0);
      assertNotNull(node0);
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("R/goog.base", jSSourceFile0.getName());
      assertEquals("R/goog.base", jSSourceFile0.getOriginalPath());
      assertEquals("R/goog.base", jSSourceFile0.toString());
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
      
      processClosurePrimitives0.process(node0, node0);
      assertEquals(1, node0.getChildCount());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(132, node0.getType());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals("R/goog.base", jSSourceFile0.getName());
      assertEquals("R/goog.base", jSSourceFile0.getOriginalPath());
      assertEquals("R/goog.base", jSSourceFile0.toString());
      assertEquals(1, printStreamErrorManager0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(1, compiler0.getErrorCount());
      assertEquals(true, compiler0.hasErrors());
      assertEquals(false, compiler0.isIdeMode());
  }

  @Test
  public void test5()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/scratch/ac1gf/Closure/92/4/run_evosuite.pl_1515_1418339395/operator {0} cannot be applied to {1}");
      String string0 = "gog.now";
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, string0);
      assertTrue(boolean0);
      
      PrintStream printStream0 = null;
      PrintStreamErrorManager printStreamErrorManager0 = new PrintStreamErrorManager(printStream0);
      assertNotNull(printStreamErrorManager0);
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      Compiler compiler0 = new Compiler((ErrorManager) printStreamErrorManager0);
      assertNotNull(compiler0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      ProcessClosurePrimitives processClosurePrimitives0 = new ProcessClosurePrimitives(compiler0, checkLevel0, boolean0);
      assertNotNull(processClosurePrimitives0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      
      Set<String> set0 = processClosurePrimitives0.getExportedVariableNames();
      assertNotNull(set0);
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, printStreamErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, printStreamErrorManager0.getErrorCount());
      assertEquals(0, printStreamErrorManager0.getWarningCount());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
  }
}