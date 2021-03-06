/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 21:24:00 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.FlowSensitiveInlineVariables;
import com.google.javascript.jscomp.NodeTraversal;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class FlowSensitiveInlineVariablesEvoSuite_branch_Test extends FlowSensitiveInlineVariablesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.enterScope(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test1()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      Node node0 = null;
      flowSensitiveInlineVariables0.visit(nodeTraversal0, node0, node0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test2()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables(abstractCompiler0);
      assertNotNull(flowSensitiveInlineVariables0);
      
      NodeTraversal nodeTraversal0 = new NodeTraversal(abstractCompiler0, (NodeTraversal.Callback) flowSensitiveInlineVariables0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
      assertNotNull(nodeTraversal0);
      
      flowSensitiveInlineVariables0.exitScope(nodeTraversal0);
      assertEquals("", nodeTraversal0.getSourceName());
      assertEquals(0, nodeTraversal0.getLineNumber());
  }

  @Test
  public void test3()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      FlowSensitiveInlineVariables flowSensitiveInlineVariables0 = new FlowSensitiveInlineVariables((AbstractCompiler) compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(flowSensitiveInlineVariables0);
      
      Node node0 = null;
      // Undeclared exception!
      try {
        flowSensitiveInlineVariables0.process(node0, node0);
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
