package com.octanner.interview.darkwizard;


import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@JdbcTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class WizardDaoTest {

  @Autowired NamedParameterJdbcTemplate jdbcTemplate;

  @InjectMocks WizardDaoImpl wizardDao;

  @Test
  @DisplayName("Count of wizards that use unforgivable curses")
  public void testWizardResultCount() {
    assertThat(wizardDao.getDarkWizards().size()).isEqualTo(5);
  }

  @Test
  @DisplayName("testing the order of results")
  public void testTomIsFirst() {
    var expected = List.of(
        new WizardResultData("Tom Riddle", 16),
        new WizardResultData("Bellatrix Lestrange", 8),
        new WizardResultData("Severus Snape", 3),
        new WizardResultData("Harry Potter", 2),
        new WizardResultData("Draco Malfoy", 1)
    );
    assertThat(wizardDao.getDarkWizards()).containsExactlyElementsOf(expected);
  }
}