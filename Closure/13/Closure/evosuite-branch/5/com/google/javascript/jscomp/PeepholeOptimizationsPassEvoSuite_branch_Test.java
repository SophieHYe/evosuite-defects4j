/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 20:39:48 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.AbstractPeepholeOptimization;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.PeepholeCollectPropertyAssignments;
import com.google.javascript.jscomp.PeepholeOptimizationsPass;
import com.google.javascript.jscomp.PeepholeRemoveDeadCode;
import com.google.javascript.jscomp.PeepholeReplaceKnownMethods;
import com.google.javascript.rhino.Node;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class PeepholeOptimizationsPassEvoSuite_branch_Test extends PeepholeOptimizationsPassEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[9];
      boolean boolean0 = true;
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods(boolean0);
      assertNotNull(peepholeReplaceKnownMethods0);
      
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      assertNotNull(peepholeCollectPropertyAssignments0);
      
      abstractPeepholeOptimizationArray0[8] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[8]);
      
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(peepholeOptimizationsPass0);
      
      String string0 = "JSC_NOT_A_CONSTRUCTOR";
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      assertNotNull(peepholeRemoveDeadCode0);
      
      abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
      assertNotNull(abstractPeepholeOptimizationArray0[3]);
      
      abstractPeepholeOptimizationArray0[4] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      assertNotNull(abstractPeepholeOptimizationArray0[4]);
      
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[0]);
      
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[1]);
      
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[2]);
      
      abstractPeepholeOptimizationArray0[5] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      assertNotNull(abstractPeepholeOptimizationArray0[5]);
      
      abstractPeepholeOptimizationArray0[6] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      assertNotNull(abstractPeepholeOptimizationArray0[6]);
      
      abstractPeepholeOptimizationArray0[7] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[7]);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOr());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isExprResult());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetProp());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLabelName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isFunction());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isReturn());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isVoid());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDelProp());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isDo());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTrue());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertNotNull(node0);
      
      peepholeOptimizationsPass0.process(node0, node0);
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isVarArgs());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.hasOneChild());
      assertEquals(false, node0.isNew());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isGetProp());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isLabelName());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isWith());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isRegExp());
      assertEquals(false, node0.isThrow());
      assertEquals(0, node0.getChildCount());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isContinue());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isFunction());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isReturn());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isIn());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isVoid());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isNE());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isParamList());
      assertEquals(false, node0.isFalse());
      assertEquals(false, node0.isQuotedString());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isDo());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.hasChildren());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isTrue());
      assertEquals("[testcode]", node0.getSourceFileName());
  }

  @Test
  public void test1()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[9];
      boolean boolean0 = false;
      PeepholeReplaceKnownMethods peepholeReplaceKnownMethods0 = new PeepholeReplaceKnownMethods(boolean0);
      assertNotNull(peepholeReplaceKnownMethods0);
      
      PeepholeCollectPropertyAssignments peepholeCollectPropertyAssignments0 = new PeepholeCollectPropertyAssignments();
      assertNotNull(peepholeCollectPropertyAssignments0);
      
      abstractPeepholeOptimizationArray0[8] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[8]);
      
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(peepholeOptimizationsPass0);
      
      String string0 = "JSC_NOT_A_:ONSTRUCTOR";
      PeepholeRemoveDeadCode peepholeRemoveDeadCode0 = new PeepholeRemoveDeadCode();
      assertNotNull(peepholeRemoveDeadCode0);
      
      abstractPeepholeOptimizationArray0[3] = (AbstractPeepholeOptimization) peepholeRemoveDeadCode0;
      assertNotNull(abstractPeepholeOptimizationArray0[3]);
      
      abstractPeepholeOptimizationArray0[4] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      assertNotNull(abstractPeepholeOptimizationArray0[4]);
      
      abstractPeepholeOptimizationArray0[0] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[0]);
      
      abstractPeepholeOptimizationArray0[1] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[1]);
      
      abstractPeepholeOptimizationArray0[2] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[2]);
      
      abstractPeepholeOptimizationArray0[5] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      assertNotNull(abstractPeepholeOptimizationArray0[5]);
      
      abstractPeepholeOptimizationArray0[6] = (AbstractPeepholeOptimization) peepholeReplaceKnownMethods0;
      assertNotNull(abstractPeepholeOptimizationArray0[6]);
      
      abstractPeepholeOptimizationArray0[7] = (AbstractPeepholeOptimization) peepholeCollectPropertyAssignments0;
      assertNotNull(abstractPeepholeOptimizationArray0[7]);
      
      Node node0 = compiler0.parseTestCode(string0);
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isContinue());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNE());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isFalse());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isRegExp());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isTrue());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isParamList());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNew());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isVarArgs());
      assertNotNull(node0);
      
      peepholeOptimizationsPass0.process(node0, node0);
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isContinue());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNE());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isFalse());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isRegExp());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isTrue());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isParamList());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNew());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isVarArgs());
      
      peepholeOptimizationsPass0.process(node0, node0);
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(false, compiler0.hasErrors());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, node0.isAssign());
      assertEquals(false, node0.isVar());
      assertEquals(false, node0.isFunction());
      assertEquals(false, node0.isGetterDef());
      assertEquals(false, node0.isBreak());
      assertEquals(false, node0.isInstanceOf());
      assertEquals(false, node0.isThrow());
      assertEquals(false, node0.isExprResult());
      assertEquals(false, node0.isIf());
      assertEquals(false, node0.isThis());
      assertEquals(false, node0.isContinue());
      assertEquals(132, node0.getType());
      assertEquals(false, node0.isIn());
      assertEquals(false, node0.isTypeOf());
      assertEquals(false, node0.isNumber());
      assertEquals(false, node0.isDebugger());
      assertEquals(false, node0.isNE());
      assertEquals(true, node0.hasChildren());
      assertEquals(false, node0.isGetElem());
      assertEquals(false, node0.isCatch());
      assertEquals(false, node0.isArrayLit());
      assertEquals(false, node0.isFor());
      assertEquals(false, node0.isVoid());
      assertEquals(false, node0.isDelProp());
      assertEquals(false, node0.isCase());
      assertEquals(false, node0.wasEmptyNode());
      assertEquals(4096, node0.getSourcePosition());
      assertEquals(1, node0.getLineno());
      assertEquals(false, node0.isLocalResultCall());
      assertEquals(false, node0.isFromExterns());
      assertEquals(false, node0.isFalse());
      assertEquals(0, node0.getSideEffectFlags());
      assertEquals(false, node0.isComma());
      assertEquals(false, node0.isBlock());
      assertEquals(false, node0.isAnd());
      assertEquals(false, node0.isGetProp());
      assertEquals(false, node0.isDec());
      assertEquals(false, node0.hasMoreThanOneChild());
      assertEquals(false, node0.isRegExp());
      assertEquals("[testcode]", node0.getSourceFileName());
      assertEquals(false, node0.isDo());
      assertEquals(false, node0.isStringKey());
      assertEquals(false, node0.isName());
      assertEquals(false, node0.isOptionalArg());
      assertEquals(false, node0.isLabel());
      assertEquals(false, node0.isWith());
      assertEquals(true, node0.isScript());
      assertEquals(false, node0.isTrue());
      assertEquals(1, node0.getChildCount());
      assertEquals(false, node0.isParamList());
      assertEquals(0, node0.getCharno());
      assertEquals(false, node0.isNull());
      assertEquals(false, node0.isString());
      assertEquals(false, node0.isLabelName());
      assertEquals(false, node0.isDefaultCase());
      assertEquals(true, node0.hasOneChild());
      assertEquals(false, node0.isInc());
      assertEquals(false, node0.isReturn());
      assertEquals(false, node0.isEmpty());
      assertEquals(false, node0.isNew());
      assertEquals(true, node0.isSyntheticBlock());
      assertEquals(false, node0.isHook());
      assertEquals(false, node0.isSetterDef());
      assertEquals(false, node0.isQuotedString());
      assertEquals(0, node0.getLength());
      assertEquals(false, node0.isObjectLit());
      assertEquals(false, node0.isAdd());
      assertEquals(false, node0.isNot());
      assertEquals(false, node0.isWhile());
      assertEquals(false, node0.isOr());
      assertEquals(false, node0.isCall());
      assertEquals(false, node0.isSwitch());
      assertEquals(false, node0.isTry());
      assertEquals(false, node0.isNoSideEffectsCall());
      assertEquals(false, node0.isOnlyModifiesThisCall());
      assertEquals(false, node0.isAssignAdd());
      assertEquals(false, node0.isVarArgs());
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      AbstractPeepholeOptimization[] abstractPeepholeOptimizationArray0 = new AbstractPeepholeOptimization[9];
      PeepholeOptimizationsPass peepholeOptimizationsPass0 = new PeepholeOptimizationsPass(compiler0, abstractPeepholeOptimizationArray0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(peepholeOptimizationsPass0);
      
      Compiler compiler1 = (Compiler)peepholeOptimizationsPass0.getCompiler();
      assertSame(compiler0, compiler1);
      assertSame(compiler1, compiler0);
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0.0, compiler1.getProgress(), 0.01D);
      assertNotNull(compiler1);
  }
}