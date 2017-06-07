/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:06:40 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractCompiler;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.EmptyMessageBundle;
import com.google.javascript.jscomp.GoogleJsMessageIdGenerator;
import com.google.javascript.jscomp.JsMessage;
import com.google.javascript.jscomp.JsMessageVisitor;
import com.google.javascript.jscomp.ReplaceMessagesForChrome;
import com.google.javascript.rhino.Node;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class JsMessageVisitorEvoSuite_branch_Test extends JsMessageVisitorEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      Node node0 = null;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      int int0 = 941;
      AbstractCompiler abstractCompiler0 = null;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      try {
        replaceMessagesForChrome0.checkNode(node0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected node type 941; found: null
         //
      }
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "MSG_255844093053015";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertFalse(string1.equals((Object)string0));
      assertFalse(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("msg_255844093053015", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test02()  throws Throwable  {
      String string0 = "M$:fx\":n<Yy7";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("m$:fx\":n<yy7", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test03()  throws Throwable  {
      String string0 = "00";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("00", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test04()  throws Throwable  {
      String string0 = "";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertTrue(string1.equals((Object)string0));
      assertTrue(string0.equals((Object)string1));
      assertNotNull(string1);
      assertEquals("", string1);
      assertNotSame(string1, string0);
      assertNotSame(string0, string1);
  }

  @Test
  public void test05()  throws Throwable  {
      PrintStream printStream0 = null;
      Compiler compiler0 = new Compiler(printStream0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.RELAX;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(compiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(replaceMessagesForChrome0);
      
      String string0 = "MSG_com.";
      boolean boolean1 = replaceMessagesForChrome0.isMessageName(string0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test06()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      boolean boolean0 = true;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(compiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(replaceMessagesForChrome0);
      
      boolean boolean1 = false;
      String string0 = "MSG_com._HELP";
      boolean boolean2 = replaceMessagesForChrome0.isMessageName(string0, boolean1);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1 == boolean2);
      assertFalse(boolean0 == boolean1);
      assertFalse(boolean0 == boolean2);
      assertFalse(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(boolean2);
  }

  @Test
  public void test07()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      String string0 = null;
      GoogleJsMessageIdGenerator googleJsMessageIdGenerator0 = new GoogleJsMessageIdGenerator(string0);
      assertNotNull(googleJsMessageIdGenerator0);
      
      boolean boolean0 = false;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(compiler0, googleJsMessageIdGenerator0, boolean0, jsMessage_Style0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(replaceMessagesForChrome0);
      
      String string1 = "MSG_vEO!\\\"TST9,)<q@F`O";
      boolean boolean1 = replaceMessagesForChrome0.isMessageName(string1, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean0 == boolean1);
      assertTrue(boolean1);
  }

  @Test
  public void test08()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      boolean boolean0 = true;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.LEGACY;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(compiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(replaceMessagesForChrome0);
      
      String string0 = "MSG_com._HELP";
      boolean boolean1 = replaceMessagesForChrome0.isMessageName(string0, boolean0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertTrue(boolean0 == boolean1);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test
  public void test09()  throws Throwable  {
      String string0 = "JSC_BAD_RENAME_PROPERTY_FUNCTION_NAME_ARG";
      boolean boolean0 = false;
      AbstractCompiler abstractCompiler0 = null;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      boolean boolean1 = replaceMessagesForChrome0.isMessageName(string0, boolean0);
      assertTrue(boolean1 == boolean0);
      assertTrue(boolean0 == boolean1);
      assertFalse(boolean1);
  }

  @Test
  public void test10()  throws Throwable  {
      String string0 = "M$:f";
      Node node0 = null;
      JsMessageVisitor.MalformedException jsMessageVisitor_MalformedException0 = new JsMessageVisitor.MalformedException(string0, node0);
      assertNotNull(jsMessageVisitor_MalformedException0);
      
      Node node1 = jsMessageVisitor_MalformedException0.getNode();
      assertNull(node1);
  }

  @Test
  public void test11()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      String string0 = "TCx{\"-x/qO1McXh";
      GoogleJsMessageIdGenerator googleJsMessageIdGenerator0 = new GoogleJsMessageIdGenerator(string0);
      assertNotNull(googleJsMessageIdGenerator0);
      
      boolean boolean0 = true;
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, googleJsMessageIdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      double double0 = 2.147483647414679E9;
      int int0 = 1458;
      Node node0 = Node.newNumber(double0, int0, int0);
      assertEquals(1458, node0.getCharno());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isTrue());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.mayMutateArguments());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isCast());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isCase());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(0, node0.getChangeTime());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isAdd());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isQuotedString());
      assertEquals(true, node0.isNumber());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isSyntheticBlock());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isNull());
      assertNull(node0.getSourceFileName());
      assertEquals(false, node0.isOnlyModifiesArgumentsCall());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isScript());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isCall());
      assertEquals(1458, node0.getLineno());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isFunction());
      assertEquals(true, node0.mayMutateGlobalStateOrThrow());
      assertEquals(5973426, node0.getSourcePosition());
      assertEquals(false, node0.isComma());
      assertEquals(39, node0.getType());
      assertNotNull(node0);
      
      try {
        replaceMessagesForChrome0.checkNode(node0, int0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected node type 1458; found: 39
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      String string0 = "g7rw;um)3nCT9VMzSQ";
      String string1 = JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(string0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("g7rw;um)3nct9vmzsq", string1);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      
      boolean boolean0 = JsMessageVisitor.isLowerCamelCaseWithNumericSuffixes(string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(boolean0);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
  }

  @Test
  public void test13()  throws Throwable  {
      AbstractCompiler abstractCompiler0 = null;
      EmptyMessageBundle emptyMessageBundle0 = new EmptyMessageBundle();
      assertNotNull(emptyMessageBundle0);
      
      JsMessage.IdGenerator jsMessage_IdGenerator0 = emptyMessageBundle0.idGenerator();
      assertNull(jsMessage_IdGenerator0);
      
      String string0 = "g7rw;um)3nCT9VMzSQ";
      JsMessage.Style jsMessage_Style0 = JsMessage.Style.CLOSURE;
      boolean boolean0 = false;
      Node node0 = null;
      ReplaceMessagesForChrome replaceMessagesForChrome0 = new ReplaceMessagesForChrome(abstractCompiler0, jsMessage_IdGenerator0, boolean0, jsMessage_Style0);
      assertNotNull(replaceMessagesForChrome0);
      
      JsMessage jsMessage0 = emptyMessageBundle0.getMessage(string0);
      assertNull(jsMessage0);
      
      replaceMessagesForChrome0.processMessageFallback(node0, jsMessage0, jsMessage0);
  }
}