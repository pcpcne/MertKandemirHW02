package org.robotdreams;

import java.util.ArrayList;

public interface Faculty {
    void addFieldOfStudy(String _fieldOfStudy);
    ArrayList<String> getFieldOfStudy();

    // publications will be added with exactly same logic
}
