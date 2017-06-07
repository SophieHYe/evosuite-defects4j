/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 16:45:55 GMT 2014
 */

package org.jfree.chart.plot;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Stroke;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.xy.WindItemRenderer;
import org.jfree.chart.renderer.xy.XYStepRenderer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class ValueMarkerEvoSuite_branch_Test extends ValueMarkerEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double double0 = (-44.064117);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertNotNull(valueMarker0);
      assertEquals((-44.064117), valueMarker0.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertNull(valueMarker0.getLabel());
      
      double double1 = 0.0;
      ValueMarker valueMarker1 = new ValueMarker(double1);
      assertNotSame(valueMarker1, valueMarker0);
      assertNotNull(valueMarker1);
      assertFalse(valueMarker1.equals((Object)valueMarker0));
      assertFalse(double1 == double0);
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.0, valueMarker1.getValue(), 0.01D);
      
      boolean boolean0 = valueMarker0.equals((Object) valueMarker1);
      assertNotSame(valueMarker0, valueMarker1);
      assertNotSame(valueMarker1, valueMarker0);
      assertFalse(boolean0);
      assertFalse(valueMarker0.equals((Object)valueMarker1));
      assertFalse(valueMarker1.equals((Object)valueMarker0));
      assertFalse(double1 == double0);
      assertFalse(double0 == double1);
      assertEquals((-44.064117), valueMarker0.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.0, valueMarker1.getValue(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      double double0 = (-41.188745057642);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertNotNull(valueMarker0);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      
      double double1 = valueMarker0.getValue();
      assertEquals((-41.188745057642), double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      
      ValueMarker valueMarker1 = new ValueMarker(double1);
      assertNotSame(valueMarker0, valueMarker1);
      assertNotSame(valueMarker1, valueMarker0);
      assertNotNull(valueMarker1);
      assertTrue(double1 == double0);
      assertTrue(valueMarker0.equals((Object)valueMarker1));
      assertTrue(valueMarker1.equals((Object)valueMarker0));
      assertTrue(double0 == double1);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertEquals((-41.188745057642), valueMarker1.getValue(), 0.01D);
      
      boolean boolean0 = valueMarker1.equals((Object) valueMarker0);
      assertNotSame(valueMarker0, valueMarker1);
      assertNotSame(valueMarker1, valueMarker0);
      assertTrue(boolean0);
      assertTrue(double1 == double0);
      assertTrue(valueMarker0.equals((Object)valueMarker1));
      assertTrue(valueMarker1.equals((Object)valueMarker0));
      assertTrue(double0 == double1);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker1.getLabel());
      assertEquals(0.8F, valueMarker1.getAlpha(), 0.01F);
      assertEquals((-41.188745057642), valueMarker1.getValue(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-44.064117);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertNotNull(valueMarker0);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-44.064117), valueMarker0.getValue(), 0.01D);
      
      WindItemRenderer windItemRenderer0 = new WindItemRenderer();
      assertNotNull(windItemRenderer0);
      assertEquals(false, windItemRenderer0.getBaseItemLabelsVisible());
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesStroke());
      assertEquals(2.0, windItemRenderer0.getItemLabelAnchorOffset(), 0.01D);
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesOutlinePaint());
      assertEquals(true, windItemRenderer0.getBaseSeriesVisible());
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesFillPaint());
      assertEquals(1, windItemRenderer0.getPassCount());
      assertEquals(3, windItemRenderer0.getDefaultEntityRadius());
      assertEquals(true, windItemRenderer0.getBaseCreateEntities());
      assertEquals(true, windItemRenderer0.getBaseSeriesVisibleInLegend());
      assertEquals(true, windItemRenderer0.getAutoPopulateSeriesShape());
      assertEquals(true, windItemRenderer0.getAutoPopulateSeriesPaint());
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesOutlineStroke());
      
      boolean boolean0 = valueMarker0.equals((Object) windItemRenderer0);
      assertFalse(boolean0);
      assertEquals(false, windItemRenderer0.getBaseItemLabelsVisible());
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesStroke());
      assertEquals(2.0, windItemRenderer0.getItemLabelAnchorOffset(), 0.01D);
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesOutlinePaint());
      assertEquals(true, windItemRenderer0.getBaseSeriesVisible());
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesFillPaint());
      assertEquals(1, windItemRenderer0.getPassCount());
      assertEquals(3, windItemRenderer0.getDefaultEntityRadius());
      assertEquals(true, windItemRenderer0.getBaseCreateEntities());
      assertEquals(true, windItemRenderer0.getBaseSeriesVisibleInLegend());
      assertEquals(true, windItemRenderer0.getAutoPopulateSeriesShape());
      assertEquals(true, windItemRenderer0.getAutoPopulateSeriesPaint());
      assertEquals(false, windItemRenderer0.getAutoPopulateSeriesOutlineStroke());
      assertNull(valueMarker0.getLabel());
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      assertEquals((-44.064117), valueMarker0.getValue(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 18;
      Color color0 = new Color(int0, int0, int0);
      assertNotNull(color0);
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getAlpha());
      assertEquals("java.awt.Color[r=18,g=18,b=18]", color0.toString());
      assertEquals(18, color0.getRed());
      assertEquals(-15592942, color0.getRGB());
      assertEquals(18, color0.getGreen());
      assertEquals(18, color0.getBlue());
      
      XYStepRenderer xYStepRenderer0 = new XYStepRenderer();
      assertNotNull(xYStepRenderer0);
      assertEquals(false, xYStepRenderer0.getBaseItemLabelsVisible());
      assertEquals(true, xYStepRenderer0.getBaseSeriesVisibleInLegend());
      assertEquals(true, xYStepRenderer0.getAutoPopulateSeriesPaint());
      assertEquals(3, xYStepRenderer0.getDefaultEntityRadius());
      assertEquals(false, xYStepRenderer0.getUseFillPaint());
      assertEquals(2.0, xYStepRenderer0.getItemLabelAnchorOffset(), 0.01D);
      assertEquals(true, xYStepRenderer0.getBaseSeriesVisible());
      assertEquals(false, xYStepRenderer0.getUseOutlinePaint());
      assertEquals(false, xYStepRenderer0.getDrawSeriesLineAsPath());
      assertEquals(2, xYStepRenderer0.getPassCount());
      assertEquals(true, xYStepRenderer0.getDrawOutlines());
      assertEquals(true, xYStepRenderer0.getAutoPopulateSeriesShape());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesOutlineStroke());
      assertEquals(false, xYStepRenderer0.getBaseShapesVisible());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesOutlinePaint());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesStroke());
      assertEquals(true, xYStepRenderer0.getBaseLinesVisible());
      assertEquals(true, xYStepRenderer0.getBaseShapesFilled());
      assertEquals(true, xYStepRenderer0.getBaseCreateEntities());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesFillPaint());
      
      BasicStroke basicStroke0 = (BasicStroke)xYStepRenderer0.getBaseStroke();
      assertNotNull(basicStroke0);
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(false, xYStepRenderer0.getBaseItemLabelsVisible());
      assertEquals(true, xYStepRenderer0.getBaseSeriesVisibleInLegend());
      assertEquals(true, xYStepRenderer0.getAutoPopulateSeriesPaint());
      assertEquals(3, xYStepRenderer0.getDefaultEntityRadius());
      assertEquals(false, xYStepRenderer0.getUseFillPaint());
      assertEquals(2.0, xYStepRenderer0.getItemLabelAnchorOffset(), 0.01D);
      assertEquals(true, xYStepRenderer0.getBaseSeriesVisible());
      assertEquals(false, xYStepRenderer0.getUseOutlinePaint());
      assertEquals(false, xYStepRenderer0.getDrawSeriesLineAsPath());
      assertEquals(2, xYStepRenderer0.getPassCount());
      assertEquals(true, xYStepRenderer0.getDrawOutlines());
      assertEquals(true, xYStepRenderer0.getAutoPopulateSeriesShape());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesOutlineStroke());
      assertEquals(false, xYStepRenderer0.getBaseShapesVisible());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesOutlinePaint());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesStroke());
      assertEquals(true, xYStepRenderer0.getBaseLinesVisible());
      assertEquals(true, xYStepRenderer0.getBaseShapesFilled());
      assertEquals(true, xYStepRenderer0.getBaseCreateEntities());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesFillPaint());
      
      ValueMarker valueMarker0 = new ValueMarker((double) int0, (Paint) color0, (Stroke) basicStroke0);
      assertNotNull(valueMarker0);
      assertEquals(1.0F, valueMarker0.getAlpha(), 0.01F);
      assertEquals(18.0, valueMarker0.getValue(), 0.01D);
      assertNull(valueMarker0.getLabel());
      assertEquals(0.0F, basicStroke0.getDashPhase(), 0.01F);
      assertEquals(0, basicStroke0.getLineJoin());
      assertEquals(2, basicStroke0.getEndCap());
      assertEquals(1.0F, basicStroke0.getLineWidth(), 0.01F);
      assertEquals(10.0F, basicStroke0.getMiterLimit(), 0.01F);
      assertEquals(1, color0.getTransparency());
      assertEquals(255, color0.getAlpha());
      assertEquals("java.awt.Color[r=18,g=18,b=18]", color0.toString());
      assertEquals(18, color0.getRed());
      assertEquals(-15592942, color0.getRGB());
      assertEquals(18, color0.getGreen());
      assertEquals(18, color0.getBlue());
      assertEquals(false, xYStepRenderer0.getBaseItemLabelsVisible());
      assertEquals(true, xYStepRenderer0.getBaseSeriesVisibleInLegend());
      assertEquals(true, xYStepRenderer0.getAutoPopulateSeriesPaint());
      assertEquals(3, xYStepRenderer0.getDefaultEntityRadius());
      assertEquals(false, xYStepRenderer0.getUseFillPaint());
      assertEquals(2.0, xYStepRenderer0.getItemLabelAnchorOffset(), 0.01D);
      assertEquals(true, xYStepRenderer0.getBaseSeriesVisible());
      assertEquals(false, xYStepRenderer0.getUseOutlinePaint());
      assertEquals(false, xYStepRenderer0.getDrawSeriesLineAsPath());
      assertEquals(2, xYStepRenderer0.getPassCount());
      assertEquals(true, xYStepRenderer0.getDrawOutlines());
      assertEquals(true, xYStepRenderer0.getAutoPopulateSeriesShape());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesOutlineStroke());
      assertEquals(false, xYStepRenderer0.getBaseShapesVisible());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesOutlinePaint());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesStroke());
      assertEquals(true, xYStepRenderer0.getBaseLinesVisible());
      assertEquals(true, xYStepRenderer0.getBaseShapesFilled());
      assertEquals(true, xYStepRenderer0.getBaseCreateEntities());
      assertEquals(false, xYStepRenderer0.getAutoPopulateSeriesFillPaint());
  }

  @Test
  public void test4()  throws Throwable  {
      double double0 = (-41.188745057642);
      ValueMarker valueMarker0 = new ValueMarker(double0);
      assertNotNull(valueMarker0);
      assertNull(valueMarker0.getLabel());
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      
      double double1 = valueMarker0.getValue();
      assertEquals((-41.188745057642), double1, 0.01D);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertNull(valueMarker0.getLabel());
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
      
      valueMarker0.setValue(double1);
      assertTrue(double1 == double0);
      assertTrue(double0 == double1);
      assertNull(valueMarker0.getLabel());
      assertEquals((-41.188745057642), valueMarker0.getValue(), 0.01D);
      assertEquals(0.8F, valueMarker0.getAlpha(), 0.01F);
  }
}