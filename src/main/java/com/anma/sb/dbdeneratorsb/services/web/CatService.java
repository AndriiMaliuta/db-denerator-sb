package com.anma.sb.dbdeneratorsb.services.web;

import com.anma.sb.dbdeneratorsb.models.web.CatWeb;

import java.util.List;

public interface CatService {

    List<CatWeb> allCats();
    CatWeb catByBreed(String breed);
}
