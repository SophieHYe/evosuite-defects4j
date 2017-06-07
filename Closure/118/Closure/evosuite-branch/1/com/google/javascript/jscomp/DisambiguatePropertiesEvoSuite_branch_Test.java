/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 19:30:13 GMT 2014
 */

package com.google.javascript.jscomp;

import static org.junit.Assert.*;
import org.junit.Test;
import com.google.javascript.jscomp.CheckEventfulObjectDisposal;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.ConcreteType;
import com.google.javascript.jscomp.DisambiguateProperties;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.LoggerErrorManager;
import com.google.javascript.jscomp.TightenTypes;
import com.google.javascript.rhino.jstype.JSType;
import java.util.Map;
import java.util.logging.Logger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DisambiguatePropertiesEvoSuite_branch_Test extends DisambiguatePropertiesEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.global;
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      assertNotNull(logger0);
      
      LoggerErrorManager loggerErrorManager0 = new LoggerErrorManager(logger0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      assertNotNull(loggerErrorManager0);
      
      Compiler compiler0 = new Compiler((ErrorManager) loggerErrorManager0);
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(true, logger0.getUseParentHandlers());
      assertNull(logger0.getResourceBundleName());
      assertEquals("global", logger0.getName());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(0, compiler0.getWarningCount());
      assertNotNull(compiler0);
      
      Map<String, CheckLevel> map0 = null;
      // Undeclared exception!
      try {
        DisambiguateProperties<JSType> disambiguateProperties0 = DisambiguateProperties.forJSTypeSystem(compiler0, map0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DisambiguateProperties.Warnings disambiguateProperties_Warnings0 = new DisambiguateProperties.Warnings();
      assertNotNull(disambiguateProperties_Warnings0);
  }

  @Test
  public void test2()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertNotNull(compiler0);
      
      LoggerErrorManager loggerErrorManager0 = (LoggerErrorManager)compiler0.getErrorManager();
      assertEquals(0, loggerErrorManager0.getErrorCount());
      assertEquals(0, loggerErrorManager0.getWarningCount());
      assertEquals(0.0, loggerErrorManager0.getTypedPercent(), 0.01D);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(loggerErrorManager0);
      
      TightenTypes tightenTypes0 = new TightenTypes(compiler0);
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertNotNull(tightenTypes0);
      
      CompilerOptions compilerOptions0 = new CompilerOptions();
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertNotNull(compilerOptions0);
      
      Map<String, CheckLevel> map0 = compilerOptions0.propertyInvalidationErrors;
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertNotNull(map0);
      
      DisambiguateProperties<ConcreteType> disambiguateProperties0 = DisambiguateProperties.forConcreteTypeSystem(compiler0, tightenTypes0, map0);
      assertEquals(true, map0.isEmpty());
      assertEquals(0, map0.size());
      assertEquals(false, compiler0.isIdeMode());
      assertEquals(0, compiler0.getErrorCount());
      assertEquals(false, compiler0.acceptConstKeyword());
      assertEquals(0.0, compiler0.getProgress(), 0.01D);
      assertEquals(false, compiler0.hasErrors());
      assertEquals(false, compiler0.isTypeCheckingEnabled());
      assertEquals(0, compiler0.getWarningCount());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compiler0.languageMode());
      assertEquals(false, compilerOptions0.getCheckDeterminism());
      assertEquals(false, compilerOptions0.getInstrumentMemoryAllocations());
      assertEquals(false, compilerOptions0.assumeClosuresOnlyCaptureReferences());
      assertNull(compilerOptions0.getLanguageOut());
      assertEquals(false, compilerOptions0.isRemoveUnusedClassProperties());
      assertEquals(false, compilerOptions0.getInferTypes());
      assertEquals(CompilerOptions.TweakProcessing.OFF, compilerOptions0.getTweakProcessing());
      assertEquals(false, compilerOptions0.isExternExportsEnabled());
      assertEquals(CompilerOptions.TracerMode.OFF, compilerOptions0.getTracerMode());
      assertEquals(false, compilerOptions0.shouldColorizeErrorOutput());
      assertEquals(CompilerOptions.LanguageMode.ECMASCRIPT3, compilerOptions0.getLanguageIn());
      assertEquals(CheckEventfulObjectDisposal.DisposalCheckingPolicy.OFF, compilerOptions0.getCheckEventfulObjectDisposalPolicy());
      assertEquals(false, compilerOptions0.isDisambiguatePrivateProperties());
      assertEquals(false, compilerOptions0.assumeStrictThis());
      assertFalse(compilerOptions0.rewriteFunctionExpressions);
      assertFalse(compilerOptions0.checkControlStructures);
      assertFalse(compilerOptions0.collapseAnonymousFunctions);
      assertFalse(compilerOptions0.gatherCssNames);
      assertFalse(compilerOptions0.aliasAllStrings);
      assertFalse(compilerOptions0.checkSymbols);
      assertFalse(compilerOptions0.computeFunctionSideEffects);
      assertFalse(compilerOptions0.removeUnusedVars);
      assertFalse(compilerOptions0.inlineConstantVars);
      assertFalse(compilerOptions0.crossModuleCodeMotion);
      assertFalse(compilerOptions0.flowSensitiveInlineVariables);
      assertFalse(compilerOptions0.reserveRawExports);
      assertFalse(compilerOptions0.checkSuspiciousCode);
      assertFalse(compilerOptions0.extractPrototypeMemberDeclarations);
      assertFalse(compilerOptions0.recordFunctionInformation);
      assertFalse(compilerOptions0.generateExports);
      assertFalse(compilerOptions0.closurePass);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
      assertFalse(compilerOptions0.aliasKeywords);
      assertFalse(compilerOptions0.inlineVariables);
      assertFalse(compilerOptions0.inlineLocalFunctions);
      assertFalse(compilerOptions0.removeDeadCode);
      assertFalse(compilerOptions0.prettyPrint);
      assertFalse(compilerOptions0.printInputDelimiter);
      assertFalse(compilerOptions0.labelRenaming);
      assertFalse(compilerOptions0.removeUnusedLocalVars);
      assertFalse(compilerOptions0.generatePseudoNames);
      assertFalse(compilerOptions0.removeUnusedPrototypeProperties);
      assertFalse(compilerOptions0.removeUnusedPrototypePropertiesInExterns);
      assertFalse(compilerOptions0.inlineFunctions);
      assertFalse(compilerOptions0.moveFunctionDeclarations);
      assertFalse(compilerOptions0.deadAssignmentElimination);
      assertFalse(compilerOptions0.ambiguateProperties);
      assertFalse(compilerOptions0.markAsCompiled);
      assertFalse(compilerOptions0.coalesceVariableNames);
      assertFalse(compilerOptions0.optimizeReturns);
      assertFalse(compilerOptions0.inlineGetters);
      assertFalse(compilerOptions0.preferLineBreakAtEndOfFile);
      assertFalse(compilerOptions0.markNoSideEffectCalls);
      assertFalse(compilerOptions0.convertToDottedProperties);
      assertFalse(compilerOptions0.devirtualizePrototypeMethods);
      assertFalse(compilerOptions0.foldConstants);
      assertFalse(compilerOptions0.instrumentForCoverage);
      assertFalse(compilerOptions0.checkTypes);
      assertFalse(compilerOptions0.smartNameRemoval);
      assertFalse(compilerOptions0.optimizeCalls);
      assertFalse(compilerOptions0.lineBreak);
      assertFalse(compilerOptions0.optimizeArgumentsArray);
      assertFalse(compilerOptions0.collapseVariableDeclarations);
      assertFalse(compilerOptions0.ideMode);
      assertFalse(compilerOptions0.optimizeParameters);
      assertFalse(compilerOptions0.collapseProperties);
      assertFalse(compilerOptions0.aliasExternals);
      assertFalse(compilerOptions0.exportTestFunctions);
      assertFalse(compilerOptions0.removeTryCatchFinally);
      assertFalse(compilerOptions0.jqueryPass);
      assertFalse(compilerOptions0.disambiguateProperties);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
      assertNotNull(disambiguateProperties0);
  }
}