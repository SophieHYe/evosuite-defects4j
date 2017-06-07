/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 23:40:28 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.NameReferenceGraph;
import com.google.javascript.rhino.Node;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class JSModuleGraphEvoSuite_branch_Test extends JSModuleGraphEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Vector<JSModule> vector0 = new Vector<JSModule>();
      assertNotNull(vector0);
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      
      String string0 = "com.google.javascript.jscomp.DataFlowAnalysis";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSModule0.toString());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSModule0.getName());
      
      boolean boolean0 = vector0.add(jSModule0);
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[com.google.javascript.jscomp.DataFlowAnalysis]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSModule0.toString());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSModule0.getName());
      assertTrue(boolean0);
      
      MockFile mockFile0 = new MockFile(string0);
      assertNotNull(mockFile0);
      
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0);
      assertNotNull(jSSourceFile0);
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSSourceFile0.getName());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSSourceFile0.getOriginalPath());
      
      jSModule0.add(jSSourceFile0);
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSSourceFile0.getName());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSSourceFile0.getOriginalPath());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSModule0.toString());
      assertEquals("com.google.javascript.jscomp.DataFlowAnalysis", jSModule0.getName());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) vector0);
      assertNotNull(jSModuleGraph0);
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[com.google.javascript.jscomp.DataFlowAnalysis]", vector0.toString());
      assertEquals(1, vector0.size());
      
      jSModuleGraph0.coalesceDuplicateFiles();
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertEquals("[com.google.javascript.jscomp.DataFlowAnalysis]", vector0.toString());
      assertEquals(1, vector0.size());
  }

  @Test
  public void test01()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      assertNotNull(arrayList0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) arrayList0);
      assertNotNull(jSModuleGraph0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      
      String string0 = null;
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertNull(jSModule0.toString());
      assertNull(jSModule0.getName());
      
      Set<JSModule> set0 = jSModuleGraph0.getTransitiveDepsDeepestFirst(jSModule0);
      assertNotNull(set0);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNull(jSModule0.toString());
      assertNull(jSModule0.getName());
      assertEquals(true, set0.isEmpty());
      assertEquals(0, set0.size());
      
      Set<JSModule> set1 = jSModuleGraph0.getTransitiveDepsDeepestFirst(jSModule0);
      assertSame(set1, set0);
      assertNotNull(set1);
      assertEquals("[]", arrayList0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertNull(jSModule0.toString());
      assertNull(jSModule0.getName());
      assertEquals(0, set1.size());
      assertEquals(true, set1.isEmpty());
  }

  @Test
  public void test02()  throws Throwable  {
      Stack<JSModule> stack0 = new Stack<JSModule>();
      assertNotNull(stack0);
      assertEquals("[]", stack0.toString());
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.empty());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) stack0);
      assertNotNull(jSModuleGraph0);
      assertEquals("[]", stack0.toString());
      assertEquals(10, stack0.capacity());
      assertEquals(true, stack0.isEmpty());
      assertEquals(0, stack0.size());
      assertEquals(true, stack0.empty());
      
      Node node0 = null;
      NameReferenceGraph.Reference nameReferenceGraph_Reference0 = new NameReferenceGraph.Reference(node0, node0);
      assertNotNull(nameReferenceGraph_Reference0);
      
      JSModule jSModule0 = nameReferenceGraph_Reference0.getModule();
      assertNull(jSModule0);
      
      boolean boolean0 = stack0.add(jSModule0);
      assertEquals("[null]", stack0.toString());
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals(false, stack0.empty());
      assertEquals(1, stack0.size());
      assertTrue(boolean0);
      
      boolean boolean1 = stack0.add(jSModule0);
      assertTrue(boolean1 == boolean0);
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals("[null, null]", stack0.toString());
      assertEquals(2, stack0.size());
      assertEquals(false, stack0.empty());
      assertTrue(boolean1);
      
      JSModule jSModule1 = jSModuleGraph0.getDeepestCommonDependencyInclusive((Collection<JSModule>) stack0);
      assertNull(jSModule1);
      assertEquals(10, stack0.capacity());
      assertEquals(false, stack0.isEmpty());
      assertEquals("[null, null]", stack0.toString());
      assertEquals(2, stack0.size());
      assertEquals(false, stack0.empty());
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "<F";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals("<F", jSModule0.toString());
      assertEquals("<F", jSModule0.getName());
      
      JSModule[] jSModuleArray0 = new JSModule[4];
      jSModuleArray0[0] = jSModule0;
      assertNotNull(jSModuleArray0[0]);
      assertEquals("<F", jSModule0.toString());
      assertEquals("<F", jSModule0.getName());
      assertEquals("<F", jSModuleArray0[0].toString());
      assertEquals("<F", jSModuleArray0[0].getName());
      
      jSModuleArray0[1] = jSModule0;
      assertNotNull(jSModuleArray0[1]);
      assertEquals("<F", jSModuleArray0[1].toString());
      assertEquals("<F", jSModuleArray0[1].getName());
      assertEquals("<F", jSModule0.toString());
      assertEquals("<F", jSModule0.getName());
      
      jSModuleArray0[2] = jSModule0;
      assertNotNull(jSModuleArray0[2]);
      assertEquals("<F", jSModule0.toString());
      assertEquals("<F", jSModule0.getName());
      assertEquals("<F", jSModuleArray0[2].toString());
      assertEquals("<F", jSModuleArray0[2].getName());
      
      jSModuleArray0[3] = jSModuleArray0[1];
      assertNotNull(jSModuleArray0[3]);
      assertEquals("<F", jSModuleArray0[3].toString());
      assertEquals("<F", jSModuleArray0[3].getName());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      assertNotNull(jSModuleGraph0);
      
      JSModule jSModule1 = jSModuleGraph0.getDeepestCommonDependency(jSModuleArray0[0], jSModuleArray0[0]);
      assertNull(jSModule1);
  }

  @Test
  public void test04()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) arrayList0);
      assertNotNull(jSModuleGraph0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      String string0 = null;
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      
      Set<JSModule> set0 = jSModuleGraph0.getTransitiveDepsDeepestFirst(jSModule0);
      assertNotNull(set0);
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertEquals(0, set0.size());
      assertEquals(true, set0.isEmpty());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      boolean boolean0 = jSModuleGraph0.dependsOn(jSModule0, jSModule0);
      assertNull(jSModule0.getName());
      assertNull(jSModule0.toString());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      assertFalse(boolean0);
  }

  @Test
  public void test05()  throws Throwable  {
      Vector<JSModule> vector0 = new Vector<JSModule>();
      assertNotNull(vector0);
      assertEquals(0, vector0.size());
      assertEquals("[]", vector0.toString());
      assertEquals(10, vector0.capacity());
      assertEquals(true, vector0.isEmpty());
      
      String string0 = "";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      
      boolean boolean0 = vector0.add(jSModule0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      assertEquals("[]", vector0.toString());
      assertEquals(1, vector0.size());
      assertEquals(10, vector0.capacity());
      assertEquals(false, vector0.isEmpty());
      assertTrue(boolean0);
      
      JSModule jSModule1 = null;
      jSModule0.addDependency(jSModule1);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      
      JSModuleGraph jSModuleGraph0 = null;
      try {
        jSModuleGraph0 = new JSModuleGraph((List<JSModule>) vector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test06()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) arrayList0);
      assertNotNull(jSModuleGraph0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      assertEquals(0, arrayList0.size());
      
      JSModule[] jSModuleArray0 = new JSModule[3];
      String string0 = "";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals("", jSModule0.getName());
      assertEquals("", jSModule0.toString());
      
      JSModule jSModule1 = null;
      jSModule0.addDependency(jSModule1);
      assertEquals("", jSModule0.getName());
      assertEquals("", jSModule0.toString());
      
      // Undeclared exception!
      try {
        JSModule jSModule2 = jSModuleGraph0.getDeepestCommonDependencyInclusive(jSModuleArray0[1], jSModule0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test07()  throws Throwable  {
      JSModule[] jSModuleArray0 = new JSModule[7];
      String string0 = ",";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals(",", jSModule0.toString());
      assertEquals(",", jSModule0.getName());
      
      JSModuleGraph.ModuleDependenceException jSModuleGraph_ModuleDependenceException0 = new JSModuleGraph.ModuleDependenceException(string0, jSModuleArray0[0], jSModule0);
      assertNotNull(jSModuleGraph_ModuleDependenceException0);
      assertEquals(",", jSModule0.toString());
      assertEquals(",", jSModule0.getName());
      
      JSModule jSModule1 = jSModuleGraph_ModuleDependenceException0.getModule();
      assertNull(jSModule1);
      assertEquals(",", jSModule0.toString());
      assertEquals(",", jSModule0.getName());
  }

  @Test
  public void test08()  throws Throwable  {
      JSModule[] jSModuleArray0 = new JSModule[3];
      String string0 = "";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      
      JSModuleGraph.ModuleDependenceException jSModuleGraph_ModuleDependenceException0 = new JSModuleGraph.ModuleDependenceException(string0, jSModuleArray0[0], jSModule0);
      assertNotNull(jSModuleGraph_ModuleDependenceException0);
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
      
      JSModule jSModule1 = jSModuleGraph_ModuleDependenceException0.getDependentModule();
      assertSame(jSModule1, jSModule0);
      assertSame(jSModule0, jSModule1);
      assertNotNull(jSModule1);
      assertEquals("", jSModule1.toString());
      assertEquals("", jSModule1.getName());
      assertEquals("", jSModule0.toString());
      assertEquals("", jSModule0.getName());
  }

  @Test
  public void test09()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      assertNotNull(arrayList0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) arrayList0);
      assertNotNull(jSModuleGraph0);
      assertEquals(true, arrayList0.isEmpty());
      assertEquals(0, arrayList0.size());
      assertEquals("[]", arrayList0.toString());
      
      JSModule[] jSModuleArray0 = new JSModule[2];
      String string0 = "n";
      JSModule jSModule0 = new JSModule(string0);
      assertNotNull(jSModule0);
      assertEquals("n", jSModule0.toString());
      assertEquals("n", jSModule0.getName());
      
      jSModuleArray0[1] = jSModule0;
      assertNotNull(jSModuleArray0[1]);
      assertEquals("n", jSModuleArray0[1].toString());
      assertEquals("n", jSModuleArray0[1].getName());
      assertEquals("n", jSModule0.toString());
      assertEquals("n", jSModule0.getName());
      
      JSModule jSModule1 = new JSModule(string0);
      assertFalse(jSModule1.equals((Object)jSModule0));
      assertNotSame(jSModule1, jSModule0);
      assertNotNull(jSModule1);
      assertEquals("n", jSModule1.toString());
      assertEquals("n", jSModule1.getName());
      
      // Undeclared exception!
      try {
        JSModule jSModule2 = jSModuleGraph0.getDeepestCommonDependencyInclusive(jSModuleArray0[1], jSModule1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      assertNotNull(arrayList0);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) arrayList0);
      assertNotNull(jSModuleGraph0);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
      
      Iterable<JSModule> iterable0 = jSModuleGraph0.getAllModules();
      assertNotNull(iterable0);
      assertEquals(0, arrayList0.size());
      assertEquals(true, arrayList0.isEmpty());
      assertEquals("[]", arrayList0.toString());
  }

  @Test
  public void test11()  throws Throwable  {
      Stack<JSModule> stack0 = new Stack<JSModule>();
      assertNotNull(stack0);
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) stack0);
      assertNotNull(jSModuleGraph0);
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      
      int int0 = jSModuleGraph0.getModuleCount();
      assertEquals(true, stack0.empty());
      assertEquals(0, stack0.size());
      assertEquals("[]", stack0.toString());
      assertEquals(true, stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertEquals(0, int0);
  }

  @Test
  public void test12()  throws Throwable  {
      Vector<JSModule> vector0 = new Vector<JSModule>();
      assertNotNull(vector0);
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph((List<JSModule>) vector0);
      assertNotNull(jSModuleGraph0);
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(true, vector0.isEmpty());
      assertEquals(0, vector0.size());
      
      // Undeclared exception!
      try {
        JSModule jSModule0 = jSModuleGraph0.getRootModule();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
      }
  }
}