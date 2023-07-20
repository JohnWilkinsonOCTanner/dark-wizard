package com.octanner.interview.darkwizard;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WizardDaoImpl implements WizardDao {

  private final JdbcTemplate jdbcTemplate;

  public WizardDaoImpl(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override public List<WizardResultData> getDarkWizards() {
    throw new UnsupportedOperationException("Not implemented");
  }
}
