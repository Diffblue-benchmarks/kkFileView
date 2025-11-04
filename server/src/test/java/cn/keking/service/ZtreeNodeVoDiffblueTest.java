package cn.keking.service;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class ZtreeNodeVoDiffblueTest {
  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link ZtreeNodeVo}
   *   <li>{@link ZtreeNodeVo#setChildren(List)}
   *   <li>{@link ZtreeNodeVo#setId(String)}
   *   <li>{@link ZtreeNodeVo#setName(String)}
   *   <li>{@link ZtreeNodeVo#setPid(String)}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange and Act
    ZtreeNodeVo actualZtreeNodeVo = new ZtreeNodeVo();
    actualZtreeNodeVo.setChildren(new ArrayList<>());
    actualZtreeNodeVo.setId("42");
    actualZtreeNodeVo.setName("Name");
    actualZtreeNodeVo.setPid("Pid");

    // Assert
    assertTrue(actualZtreeNodeVo.children.isEmpty());
  }
}
