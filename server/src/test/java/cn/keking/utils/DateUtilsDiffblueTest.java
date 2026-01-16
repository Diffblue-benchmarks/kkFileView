package cn.keking.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneOffset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DateUtilsDiffblueTest {
  /**
   * Test {@link DateUtils#getCurrentSecond(Clock)} with {@code Clock}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DateUtils#getCurrentSecond(Clock)}
   */
  @Test
  @DisplayName("Test getCurrentSecond(Clock) with 'Clock'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long DateUtils.getCurrentSecond(Clock)"})
  void testGetCurrentSecondWithClock_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0L,
        DateUtils.getCurrentSecond(
            Clock.fixed(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(),
                ZoneOffset.UTC)));
  }

  /**
   * Test {@link DateUtils#calculateCurrentTimeDifference(long, Clock)} with {@code datetime},
   * {@code clock}.
   *
   * <ul>
   *   <li>Then return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link DateUtils#calculateCurrentTimeDifference(long, Clock)}
   */
  @Test
  @DisplayName(
      "Test calculateCurrentTimeDifference(long, Clock) with 'datetime', 'clock'; then return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long DateUtils.calculateCurrentTimeDifference(long, Clock)"})
  void testCalculateCurrentTimeDifferenceWithDatetimeClock_thenReturnMinusTen() {
    // Arrange, Act and Assert
    assertEquals(
        -10L,
        DateUtils.calculateCurrentTimeDifference(
            10L,
            Clock.fixed(
                LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant(),
                ZoneOffset.UTC)));
  }
}
