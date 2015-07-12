package org.sonar.vary.plugin.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.sonar.api.measures.Metric;
import org.sonar.api.measures.Metrics;

/**
 * {@inheritDoc}
 */
public class VaryMetrics implements Metrics {

  public static final Metric<Serializable> EXTERNAL = new Metric.Builder("VARY-EXTERNAL", "External Vary rules violations", Metric.ValueType.INT)
      .setDirection(Metric.DIRECTION_WORST)
      .setQualitative(true)
      .setDomain("Vary")
      .create();
  public static final Metric<Serializable> SQUID = new Metric.Builder("VARY-SQUID", "Vary checks", Metric.ValueType.INT)
      .setDirection(Metric.DIRECTION_WORST)
      .setQualitative(true)
      .setDomain("Vary")
      .create();
  public static final Metric<Serializable> DEPENDENCIES = new Metric.Builder("VARY-DEPENDENCIES", "Cyclic dependency violations", Metric.ValueType.INT)
  	 .setDirection(Metric.DIRECTION_WORST)
  	 .setQualitative(true)
  	 .setDomain("Vary")
  	 .create();

public List<Metric> getMetrics() {
    List<Metric> list = new ArrayList<Metric>();
    list.add(EXTERNAL);
    list.add(SQUID);
    return list;
  }
}
