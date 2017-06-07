/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:35:16 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.DeadAssignmentsElimination;
import com.google.javascript.jscomp.Normalize;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DeadAssignmentsEliminationEvoSuite_branch_Test extends DeadAssignmentsEliminationEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertNotNull(compiler0);
      
      DeadAssignmentsElimination deadAssignmentsElimination0 = new DeadAssignmentsElimination((AbstractCompiler) compiler0);
      assertNotNull(deadAssignmentsElimination0);
      
      String string0 = "";
      Node node0 = Node.newString(string0);
      assertNotNull(node0);
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      
      Node node1 = Normalize.parseAndNormalizeTestCode(compiler0, string0, string0);
      assertNotNull(node1);
      assertFalse(node1.equals((Object)node0));
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(true, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(132, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(1, node1.getLineno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.hasChildren());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertNotSame(node1, node0);
      
      deadAssignmentsElimination0.process(node0, node1);
      assertFalse(node0.equals((Object)node1));
      assertFalse(node1.equals((Object)node0));
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(-1, node0.getCharno());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(-1, node0.getLineno());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isQualifiedName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(40, node0.getType());
      assertEquals(false, node0.isUnscopedQualifiedName());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptEcmaScript5());
      assertEquals(true, node1.isSyntheticBlock());
      assertEquals(false, node1.wasEmptyNode());
      assertEquals(false, node1.isLocalResultCall());
      assertEquals(false, node1.isQualifiedName());
      assertEquals(132, node1.getType());
      assertEquals(false, node1.isQuotedString());
      assertEquals(1, node1.getLineno());
      assertEquals(false, node1.isOptionalArg());
      assertEquals(false, node1.isUnscopedQualifiedName());
      assertEquals(false, node1.isOnlyModifiesThisCall());
      assertEquals(false, node1.hasMoreThanOneChild());
      assertEquals(false, node1.hasOneChild());
      assertEquals(false, node1.hasChildren());
      assertEquals(0, node1.getCharno());
      assertEquals(0, node1.getSideEffectFlags());
      assertEquals(0, node1.getChildCount());
      assertEquals(false, node1.isVarArgs());
      assertEquals(false, node1.isNoSideEffectsCall());
      assertNotSame(node0, node1);
      assertNotSame(node1, node0);
  }
}