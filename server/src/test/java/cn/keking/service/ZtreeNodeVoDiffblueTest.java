package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import cn.keking.utils.FtpUtilsFactory;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ZtreeNodeVoDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link ZtreeNodeVo}
   *   <li>{@link ZtreeNodeVo#setChildren(List)}
   *   <li>{@link ZtreeNodeVo#setId(String)}
   *   <li>{@link ZtreeNodeVo#setName(String)}
   *   <li>{@link ZtreeNodeVo#setPid(String)}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ZtreeNodeVo.<init>()",
    "void ZtreeNodeVo.setChildren(List)",
    "void ZtreeNodeVo.setId(String)",
    "void ZtreeNodeVo.setName(String)",
    "void ZtreeNodeVo.setPid(String)"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ZtreeNodeVo actualZtreeNodeVo = new ZtreeNodeVo();
    actualZtreeNodeVo.setChildren(new ArrayList<>());
    actualZtreeNodeVo.setId(FtpUtilsFactory.createValidFtpUrl());
    actualZtreeNodeVo.setName(FtpUtilsFactory.createValidFtpUrl());
    actualZtreeNodeVo.setPid(FtpUtilsFactory.createValidFtpUrl());

    // Assert
    assertTrue(actualZtreeNodeVo.children.isEmpty());
  }
}
