package com.cricket.api.service;

import com.cricket.api.entities.match;

import java.util.List;
import java.util.Map;

public interface matchService {
    // get all matches
    List<match> getAllMatches();

    //get live matches

    List<match> getLiveMatches();

    // get CWC2024 matches

    List<List<String>> getPointTable();
}
