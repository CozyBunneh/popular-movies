package com.example.android.popularmovies.data.db.movies;

import net.simonvt.schematic.annotation.DataType;
import net.simonvt.schematic.annotation.NotNull;
import net.simonvt.schematic.annotation.PrimaryKey;

import static net.simonvt.schematic.annotation.DataType.Type.INTEGER;
import static net.simonvt.schematic.annotation.DataType.Type.REAL;
import static net.simonvt.schematic.annotation.DataType.Type.TEXT;

/**
 * @author Julia Mattjus
 */
public interface MovieDetailedInfosColumns {
    @DataType(INTEGER) @PrimaryKey String _ID = "_id";

    @DataType(INTEGER) @NotNull String ADULT = "adult";

    @DataType(TEXT) @NotNull String BACKDROP_PATH = "backdrop_path";

    @DataType(INTEGER) @NotNull String BELONGS_TO_COLLECTION = "belongs_to_collection";

    @DataType(INTEGER) @NotNull String BUDGET = "budget";

    @DataType(INTEGER) @NotNull String GENRES = "genres"; // JSON Array of genres IDs

    @DataType(TEXT) @NotNull String HOMEPAGE = "homepage";

    @DataType(TEXT) @NotNull String IMDB_ID = "imdb_id";

    @DataType(TEXT) @NotNull String ORIGINAL_LANGUAGE = "original_language";

    @DataType(TEXT) @NotNull String ORIGINAL_TITLE = "original_title";

    @DataType(TEXT) @NotNull String OVERVIEW = "overview";

    @DataType(REAL) @NotNull String POPULARITY = "popularity";

    @DataType(TEXT) @NotNull String POSTER_PATH = "poster_path";

    @DataType(INTEGER) @NotNull String PRODUCTION_COMPANIES = "production_companies"; // JSON Array of production companies IDs

    @DataType(INTEGER) @NotNull String PRODUCTION_COUNTRIES = "production_countries"; // JSON Array of production countries IDs

    @DataType(TEXT) @NotNull String RELEASE_DATE = "release_date";

    @DataType(INTEGER) @NotNull String REVENUE = "revenue";

    @DataType(INTEGER) @NotNull String RUNTIME = "runtime";

    @DataType(INTEGER) @NotNull String SPOKEN_LANGUAGES = "spoken_languages"; // JSON Array of spoken languages IDs

    @DataType(TEXT) @NotNull String STATUS = "status";

    @DataType(TEXT) @NotNull String TAGLINE = "tagline";

    @DataType(TEXT) @NotNull String TITLE = "title";

    @DataType(INTEGER) @NotNull String VIDEO = "video";

    @DataType(REAL) @NotNull String VOTE_AVERAGE = "vote_average";

    @DataType(INTEGER) @NotNull String VOTE_COUNT = "vote_count";

    @DataType(TEXT) @NotNull String VIDEOS = "videos"; // JSON Array of videos IDs

    @DataType(TEXT) @NotNull String REVIEWS = "reviews"; // JSON Array of reviews IDs
}