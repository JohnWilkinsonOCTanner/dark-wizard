package com.octanner.interview.darkwizard;

import java.util.List;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WizardDaoImpl implements WizardDao {

  private final NamedParameterJdbcTemplate jdbcTemplate;

  public WizardDaoImpl(NamedParameterJdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override public List<WizardResultData> getDarkWizards() {
    throw new UnsupportedOperationException("Not implemented");
  }
}
