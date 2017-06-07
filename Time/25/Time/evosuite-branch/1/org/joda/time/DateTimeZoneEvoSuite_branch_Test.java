/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 15:47:19 GMT 2014
 */

package org.joda.time;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Locale;
import java.util.Set;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.evosuite.runtime.mock.java.lang.MockArithmeticException;
import org.evosuite.runtime.mock.java.lang.MockIllegalArgumentException;
import org.joda.time.Chronology;
import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.ReadableInstant;
import org.joda.time.YearMonthDay;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.StrictChronology;
import org.joda.time.tz.CachedDateTimeZone;
import org.joda.time.tz.DefaultNameProvider;
import org.joda.time.tz.FixedDateTimeZone;
import org.joda.time.tz.NameProvider;
import org.joda.time.tz.Provider;
import org.joda.time.tz.UTCProvider;
import org.joda.time.tz.ZoneInfoProvider;
import org.junit.runner.RunWith;
import sun.util.calendar.ZoneInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class DateTimeZoneEvoSuite_branch_Test extends DateTimeZoneEvoSuite_branch_Test_scaffolding {

  @Test
  public void test00()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      StrictChronology strictChronology0 = StrictChronology.getInstance((Chronology) buddhistChronology0);
      assertNotNull(strictChronology0);
      
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)strictChronology0.getZone();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
      
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      String string0 = "IllegalArgumentException: ";
      DateTimeZone dateTimeZone0 = uTCProvider0.getZone(string0);
      assertNull(dateTimeZone0);
      
      long long0 = (-25L);
      DateMidnight dateMidnight0 = new DateMidnight(long0, (Chronology) buddhistChronology0);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      DateTime dateTime0 = dateMidnight0.toDateTime((DateTimeZone) cachedDateTimeZone0);
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(dateTime0);
      
      Instant instant0 = dateTime0.toInstant();
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals((-3600000L), instant0.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(instant0);
      
      MutableDateTime mutableDateTime0 = instant0.toMutableDateTime(dateTimeZone0);
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals((-3600000L), instant0.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertNotNull(mutableDateTime0);
      
      int int0 = cachedDateTimeZone0.getOffset((ReadableInstant) mutableDateTime0);
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals((-3600000L), instant0.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertEquals(3600000, int0);
      
      long long1 = cachedDateTimeZone0.getMillisKeepLocal(dateTimeZone0, (long) int0);
      assertEquals((-3600000L), dateTime0.getMillis());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals((-3600000L), instant0.getMillis());
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals((-3600000L), mutableDateTime0.getMillis());
      assertEquals(0, mutableDateTime0.getRoundingMode());
      assertFalse(long0 == long1);
      assertFalse(long1 == long0);
      assertEquals(3600000L, long1);
  }

  @Test
  public void test01()  throws Throwable  {
      String string0 = "UTC";
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      int int0 = (-330);
      LocalDateTime localDateTime0 = null;
      boolean boolean0 = fixedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertFalse(boolean0);
      
      long long0 = 9223372036854775807L;
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertEquals("-00:00:00.330", fixedDateTimeZone1.getID());
      assertEquals("-00:00:00.330", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertNotNull(fixedDateTimeZone1);
      assertFalse(fixedDateTimeZone1.equals((Object)fixedDateTimeZone0));
      assertNotSame(fixedDateTimeZone1, fixedDateTimeZone0);
      
      // Undeclared exception!
      try {
        long long1 = fixedDateTimeZone1.convertLocalToUTC(long0, boolean0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Subtracting time zone offset caused overflow
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = 1784L;
      boolean boolean0 = true;
      long long1 = cachedDateTimeZone0.convertLocalToUTC(long0, boolean0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertFalse(long1 == long0);
      assertFalse(long0 == long1);
      assertEquals((-3598216L), long1);
  }

  @Test
  public void test03()  throws Throwable  {
      long long0 = (-9223372036854775808L);
      YearMonthDay yearMonthDay0 = null;
      try {
        yearMonthDay0 = new YearMonthDay(long0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // Adding time zone offset caused overflow
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      BuddhistChronology buddhistChronology0 = BuddhistChronology.getInstance();
      assertNotNull(buddhistChronology0);
      
      long long0 = (-25L);
      DateMidnight dateMidnight0 = new DateMidnight(long0, (Chronology) buddhistChronology0);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertNotNull(dateMidnight0);
      
      int int0 = 236548293;
      DateMidnight dateMidnight1 = dateMidnight0.withWeekyear(int0);
      assertEquals((-3600000L), dateMidnight0.getMillis());
      assertEquals(7464663825292800000L, dateMidnight1.getMillis());
      assertNotNull(dateMidnight1);
      assertFalse(dateMidnight0.equals((Object)dateMidnight1));
      assertFalse(dateMidnight1.equals((Object)dateMidnight0));
      assertNotSame(dateMidnight0, dateMidnight1);
      assertNotSame(dateMidnight1, dateMidnight0);
  }

  @Test
  public void test05()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = (-12219292800000L);
      String string0 = "Asia/Dhaka";
      CachedDateTimeZone cachedDateTimeZone1 = (CachedDateTimeZone)DateTimeZone.forID(string0);
      assertEquals("Asia/Dhaka", cachedDateTimeZone1.toString());
      assertEquals("Asia/Dhaka", cachedDateTimeZone1.getID());
      assertEquals(false, cachedDateTimeZone1.isFixed());
      assertNotNull(cachedDateTimeZone1);
      assertFalse(cachedDateTimeZone1.equals((Object)cachedDateTimeZone0));
      assertNotSame(cachedDateTimeZone1, cachedDateTimeZone0);
      
      long long1 = cachedDateTimeZone0.getMillisKeepLocal((DateTimeZone) cachedDateTimeZone1, long0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Asia/Dhaka", cachedDateTimeZone1.toString());
      assertEquals("Asia/Dhaka", cachedDateTimeZone1.getID());
      assertEquals(false, cachedDateTimeZone1.isFixed());
      assertFalse(long0 == long1);
      assertFalse(cachedDateTimeZone0.equals((Object)cachedDateTimeZone1));
      assertFalse(long1 == long0);
      assertFalse(cachedDateTimeZone1.equals((Object)cachedDateTimeZone0));
      assertEquals((-12219314575000L), long1);
      assertNotSame(cachedDateTimeZone0, cachedDateTimeZone1);
      assertNotSame(cachedDateTimeZone1, cachedDateTimeZone0);
  }

  @Test
  public void test06()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
      
      LocalDateTime localDateTime0 = new LocalDateTime();
      assertEquals(4, localDateTime0.size());
      assertNotNull(localDateTime0);
      
      boolean boolean0 = cachedDateTimeZone0.isLocalDateTimeGap(localDateTime0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(4, localDateTime0.size());
      assertFalse(boolean0);
  }

  @Test
  public void test07()  throws Throwable  {
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(int0, int0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      boolean boolean0 = fixedDateTimeZone0.isStandardOffset((long) int0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertTrue(boolean0);
  }

  @Test
  public void test08()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
      
      int int0 = (-330);
      boolean boolean0 = cachedDateTimeZone0.isStandardOffset((long) int0);
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertFalse(boolean0);
  }

  @Test
  public void test09()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
      
      ReadableInstant readableInstant0 = null;
      int int0 = cachedDateTimeZone0.getOffset(readableInstant0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(0, int0);
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = 31;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(int0, int0);
      assertEquals("+31:31", fixedDateTimeZone0.getID());
      assertEquals("+31:31", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      Locale locale0 = Locale.US;
      assertEquals("en_US", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertNotNull(locale0);
      
      String string0 = fixedDateTimeZone0.getName((long) int0, locale0);
      assertEquals("en_US", locale0.toString());
      assertEquals("", locale0.getVariant());
      assertEquals("USA", locale0.getISO3Country());
      assertEquals("eng", locale0.getISO3Language());
      assertEquals("US", locale0.getCountry());
      assertEquals("en", locale0.getLanguage());
      assertEquals("+31:31", fixedDateTimeZone0.getID());
      assertEquals("+31:31", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(string0);
      assertEquals("+31:31", string0);
  }

  @Test
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertNotNull(locale0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      long long0 = (-9223372036854775790L);
      String string0 = fixedDateTimeZone0.getName(long0, locale0);
      assertEquals("", locale0.getCountry());
      assertEquals("fr", locale0.toString());
      assertEquals("fr", locale0.getLanguage());
      assertEquals("", locale0.getVariant());
      assertEquals("", locale0.getISO3Country());
      assertEquals("fra", locale0.getISO3Language());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(string0);
      assertEquals("Temps universel coordonn\u00E9", string0);
  }

  @Test
  public void test12()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(cachedDateTimeZone0);
      
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      long long0 = 1784L;
      String string0 = cachedDateTimeZone0.getShortName(long0, locale0);
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("CN", locale0.getCountry());
      assertEquals("", locale0.getVariant());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(string0);
      assertEquals("BST", string0);
  }

  @Test
  public void test13()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(cachedDateTimeZone0);
      
      long long0 = (-12219292800000L);
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertNotNull(locale0);
      
      String string0 = cachedDateTimeZone0.getShortName(long0, locale0);
      assertEquals("", locale0.getVariant());
      assertEquals("CN", locale0.getCountry());
      assertEquals("CHN", locale0.getISO3Country());
      assertEquals("zho", locale0.getISO3Language());
      assertEquals("zh_CN", locale0.toString());
      assertEquals("zh", locale0.getLanguage());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertNotNull(string0);
      assertEquals("-00:01:15", string0);
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 0;
      String string0 = "^'T";
      SimpleTimeZone simpleTimeZone0 = new SimpleTimeZone(int0, string0);
      assertEquals("^'T", simpleTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("java.util.SimpleTimeZone[id=^'T,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertNotNull(simpleTimeZone0);
      
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("^'T", simpleTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("java.util.SimpleTimeZone[id=^'T,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertNotNull(fixedDateTimeZone0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals("^'T", simpleTimeZone0.getID());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals("java.util.SimpleTimeZone[id=^'T,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
  }

  @Test
  public void test15()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = new DefaultNameProvider();
      assertNotNull(defaultNameProvider0);
      
      DateTimeZone.setNameProvider((NameProvider) defaultNameProvider0);
  }

  @Test
  public void test16()  throws Throwable  {
      NameProvider nameProvider0 = null;
      DateTimeZone.setNameProvider(nameProvider0);
  }

  @Test
  public void test17()  throws Throwable  {
      Provider provider0 = null;
      DateTimeZone.setProvider(provider0);
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 0;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
  }

  @Test
  public void test19()  throws Throwable  {
      int int0 = 1;
      int int1 = (-18);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHoursMinutes(int1, int0);
      assertEquals("-18:01", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-18:01", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      ZoneInfo zoneInfo0 = (ZoneInfo)fixedDateTimeZone0.toTimeZone();
      assertEquals("-18:01", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-18:01", fixedDateTimeZone0.toString());
      assertEquals("GMT-18:01", zoneInfo0.getID());
      assertNotNull(zoneInfo0);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
      assertEquals("-18:01", fixedDateTimeZone1.getID());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("-18:01", fixedDateTimeZone1.toString());
      assertEquals("-18:01", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-18:01", fixedDateTimeZone0.toString());
      assertEquals("GMT-18:01", zoneInfo0.getID());
      assertNotNull(fixedDateTimeZone1);
      assertFalse(int0 == int1);
      assertFalse(int1 == int0);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
  }

  @Test
  public void test20()  throws Throwable  {
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
      
      ZoneInfo zoneInfo0 = (ZoneInfo)cachedDateTimeZone0.toTimeZone();
      assertEquals("Europe/London", zoneInfo0.getID());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(zoneInfo0);
      
      UTCProvider uTCProvider0 = new UTCProvider();
      assertNotNull(uTCProvider0);
      
      DateTimeZone.setProvider((Provider) uTCProvider0);
      // Undeclared exception!
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forTimeZone((TimeZone) zoneInfo0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone id 'Europe/London' is not recognised
         //
      }
  }

  @Test
  public void test21()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      SimpleTimeZone simpleTimeZone0 = (SimpleTimeZone)fixedDateTimeZone0.toTimeZone();
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertNotNull(simpleTimeZone0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forTimeZone((TimeZone) simpleTimeZone0);
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", simpleTimeZone0.getID());
      assertEquals("java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]", simpleTimeZone0.toString());
      assertEquals(false, simpleTimeZone0.useDaylightTime());
      assertEquals(0, simpleTimeZone0.getDSTSavings());
      assertEquals(0, simpleTimeZone0.getRawOffset());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("UTC", fixedDateTimeZone1.toString());
      assertEquals("UTC", fixedDateTimeZone1.getID());
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
  }

  @Test
  public void test22()  throws Throwable  {
      TimeZone timeZone0 = null;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forTimeZone(timeZone0);
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertNotNull(cachedDateTimeZone0);
  }

  @Test
  public void test23()  throws Throwable  {
      int int0 = (-1878);
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: -1878
         //
      }
  }

  @Test
  public void test24()  throws Throwable  {
      int int0 = 162;
      int int1 = 0;
      try {
        DateTimeZone dateTimeZone0 = DateTimeZone.forOffsetHoursMinutes(int1, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Minutes out of range: 162
         //
      }
  }

  @Test
  public void test25()  throws Throwable  {
      int int0 = (-1878);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertEquals("-00:00:01.878", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.878", fixedDateTimeZone0.getID());
      assertNotNull(fixedDateTimeZone0);
      
      String string0 = fixedDateTimeZone0.toString();
      assertEquals("-00:00:01.878", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.878", fixedDateTimeZone0.getID());
      assertNotNull(string0);
      assertEquals("-00:00:01.878", string0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertEquals("-00:00:01.878", fixedDateTimeZone1.toString());
      assertEquals("-00:00:01.878", fixedDateTimeZone1.getID());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("-00:00:01.878", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("-00:00:01.878", fixedDateTimeZone0.getID());
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
  }

  @Test
  public void test26()  throws Throwable  {
      int int0 = 1;
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertEquals("+00:00:00.001", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.001", fixedDateTimeZone0.toString());
      assertNotNull(fixedDateTimeZone0);
      
      String string0 = fixedDateTimeZone0.toString();
      assertEquals("+00:00:00.001", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.001", fixedDateTimeZone0.toString());
      assertNotNull(string0);
      assertEquals("+00:00:00.001", string0);
      
      FixedDateTimeZone fixedDateTimeZone1 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertEquals("+00:00:00.001", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertEquals("+00:00:00.001", fixedDateTimeZone0.toString());
      assertEquals("+00:00:00.001", fixedDateTimeZone1.toString());
      assertEquals(true, fixedDateTimeZone1.isFixed());
      assertEquals("+00:00:00.001", fixedDateTimeZone1.getID());
      assertNotNull(fixedDateTimeZone1);
      assertSame(fixedDateTimeZone0, fixedDateTimeZone1);
      assertSame(fixedDateTimeZone1, fixedDateTimeZone0);
  }

  @Test
  public void test27()  throws Throwable  {
      String string0 = null;
      CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.forID(string0);
      assertEquals("Europe/London", cachedDateTimeZone0.getID());
      assertEquals(false, cachedDateTimeZone0.isFixed());
      assertEquals("Europe/London", cachedDateTimeZone0.toString());
      assertNotNull(cachedDateTimeZone0);
  }

  @Test
  public void test28()  throws Throwable  {
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.UTC;
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      DateTimeZone.setDefault((DateTimeZone) fixedDateTimeZone0);
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
  }

  @Test
  public void test29()  throws Throwable  {
      DateTimeZone dateTimeZone0 = null;
      // Undeclared exception!
      try {
        DateTimeZone.setDefault(dateTimeZone0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The datetime zone must not be null
         //
      }
  }

  @Test
  public void test30() {}
//   @Test
//   public void test30()  throws Throwable  {
//       CachedDateTimeZone cachedDateTimeZone0 = (CachedDateTimeZone)DateTimeZone.getDefault();
//       assertEquals(false, cachedDateTimeZone0.isFixed());
//       assertEquals("Europe/London", cachedDateTimeZone0.getID());
//       assertEquals("Europe/London", cachedDateTimeZone0.toString());
//       assertNotNull(cachedDateTimeZone0);
//       
//       long long0 = (-9223372036854775808L);
//       String string0 = cachedDateTimeZone0.getName(long0);
//       assertEquals(false, cachedDateTimeZone0.isFixed());
//       assertEquals("Europe/London", cachedDateTimeZone0.getID());
//       assertEquals("Europe/London", cachedDateTimeZone0.toString());
//       assertNotNull(string0);
//       assertEquals("-00:01:15", string0);
//   }

  @Test
  public void test31() {}
//   @Test
//   public void test31()  throws Throwable  {
//       Set<String> set0 = DateTimeZone.getAvailableIDs();
//       assertEquals(567, set0.size());
//       assertEquals(false, set0.isEmpty());
//       assertNotNull(set0);
//   }

  @Test
  public void test32()  throws Throwable  {
      int int0 = (-429);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetHours(int0);
      assertEquals("-429:00", fixedDateTimeZone0.getID());
      assertEquals("-429:00", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
  }

  @Test
  public void test33() {}
//   @Test
//   public void test33()  throws Throwable  {
//       ZoneInfoProvider zoneInfoProvider0 = (ZoneInfoProvider)DateTimeZone.getProvider();
//       assertNotNull(zoneInfoProvider0);
//   }

  @Test
  public void test34()  throws Throwable  {
      DefaultNameProvider defaultNameProvider0 = (DefaultNameProvider)DateTimeZone.getNameProvider();
      assertNotNull(defaultNameProvider0);
  }

  @Test
  public void test35()  throws Throwable  {
      int int0 = (-1878);
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forOffsetMillis(int0);
      assertEquals("-00:00:01.878", fixedDateTimeZone0.toString());
      assertEquals("-00:00:01.878", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      String string0 = fixedDateTimeZone0.getShortName((long) int0);
      assertEquals("-00:00:01.878", fixedDateTimeZone0.toString());
      assertEquals("-00:00:01.878", fixedDateTimeZone0.getID());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(string0);
      assertEquals("-00:00:01.878", string0);
  }

  @Test
  public void test36()  throws Throwable  {
      String string0 = "UTC";
      FixedDateTimeZone fixedDateTimeZone0 = (FixedDateTimeZone)DateTimeZone.forID(string0);
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(fixedDateTimeZone0);
      
      Object object0 = fixedDateTimeZone0.writeReplace();
      assertEquals("UTC", fixedDateTimeZone0.getID());
      assertEquals("UTC", fixedDateTimeZone0.toString());
      assertEquals(true, fixedDateTimeZone0.isFixed());
      assertNotNull(object0);
  }
}