package de.lmbrs.pwn.memory;

import java.util.HashMap;
import java.util.Map;

// From "The Working Memory Model"
// - Baddeley and Hitch

public class VisuoSpatialSketchpad {

  private final Map<String, VisualInformation> visualInformation = new HashMap<>();
  private final Map<String, SpatialInformation> spatialInformation = new HashMap<>();

  public VisuoSpatialSketchpad() {}

  public Map<String, VisualInformation> getVisualInformation() {
    return visualInformation;
  }

  public Map<String, SpatialInformation> getSpatialInformation() {
    return spatialInformation;
  }

}
