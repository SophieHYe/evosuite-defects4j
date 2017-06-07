/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:33:51 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.InlineVariables;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class InlineVariablesEvoSuite_branch_Test extends InlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.global;
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNotNull(compiler0);
      
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.CONSTANTS_ONLY;
      boolean boolean0 = true;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, boolean0);
      assertEquals(true, logger0.getUseParentHandlers());
      assertEquals("global", logger0.getName());
      assertNull(logger0.getResourceBundleName());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertNotNull(inlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.LOCALS_ONLY;
      boolean boolean0 = false;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(inlineVariables0);
      
      NodeTraversal.Callback nodeTraversal_Callback0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, nodeTraversal_Callback0);
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(nodeTraversal0);
      
      Node node0 = nodeTraversal0.getEnclosingFunction();
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNull(node0);
      
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      InlineVariables.Mode inlineVariables_Mode0 = InlineVariables.Mode.ALL;
      boolean boolean0 = true;
      InlineVariables inlineVariables0 = new InlineVariables(compiler0, inlineVariables_Mode0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(inlineVariables0);
      
      NodeTraversal.Callback nodeTraversal_Callback0 = null;
      NodeTraversal nodeTraversal0 = new NodeTraversal((AbstractCompiler) compiler0, nodeTraversal_Callback0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      Node node0 = nodeTraversal0.getEnclosingFunction();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNull(node0);
      
      // Undeclared exception!
      try {
        inlineVariables0.process(node0, node0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // INTERNAL COMPILER ERROR.
         // Please report this problem.
         // null
         //
      }
  }
}