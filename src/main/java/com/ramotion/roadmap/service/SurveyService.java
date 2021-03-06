package com.ramotion.roadmap.service;

import com.ramotion.roadmap.dto.SurveyDto;
import com.ramotion.roadmap.model.SurveyEntity;

public interface SurveyService {

    SurveyEntity createSurvey(SurveyDto dto, String username);

    void deleteSurvey(long surveyId, String username);

    SurveyEntity enableSurvey(long id, String username);

    SurveyEntity disableSurvey(long id, String username);

    SurveyEntity closeSurvey(long id, String username);

    SurveyEntity renameSurvey(long id, String name, String username);
}
