package org.oppia.android.util.platformparameter

import javax.inject.Qualifier

/**
 * This file contains all the constants that are associated with individual Platform Parameters.
 * These constants are:
 *  - Qualifier Annotation
 *  - Platform Parameter Name
 *  - Platform Parameter Default Value
 */

/**
 * Qualifier for the platform parameter that controls the visibility of splash screen welcome
 * message toast in the [SplashTestActivity].
 */
@Qualifier
annotation class SplashScreenWelcomeMsg

/**
 * Name of the platform parameter that controls the visibility of splash screen welcome message
 * toast in the [SplashTestActivity].
 */
const val SPLASH_SCREEN_WELCOME_MSG = "splash_screen_welcome_msg"

/**
 * Default value of the platform parameter that controls the visibility of splash screen welcome
 * message toast in the [SplashTestActivity].
 */
const val SPLASH_SCREEN_WELCOME_MSG_DEFAULT_VALUE = false

/**
 * Server value of the platform parameter that controls the visibility of splash screen welcome
 * message toast in the [SplashTestActivity].
 */
const val SPLASH_SCREEN_WELCOME_MSG_SERVER_VALUE = true

/**
 * Qualifier for the platform parameter that defines the time period in hours, after which the
 * [PlatformParameterSyncUpWorker] will run again.
 */
@Qualifier
annotation class SyncUpWorkerTimePeriodHours

/**
 * Name of the platform parameter that defines the time period in hours, after which the
 * [PlatformParameterSyncUpWorker] will run again.
 */
const val SYNC_UP_WORKER_TIME_PERIOD_IN_HOURS = "sync_up_worker_time_period"

/**
 * Default value of the platform parameter that defines the time period in hours, after which the
 * [PlatformParameterSyncUpWorker] will run again.
 */
const val SYNC_UP_WORKER_TIME_PERIOD_IN_HOURS_DEFAULT_VALUE = 12

/** Qualifier for the feature flag corresponding to enabling the language selection UI. */
@Qualifier
annotation class EnableLanguageSelectionUi

// TODO(#52): Enable this feature by default once it's completed.
/** Default value for the feature flag corresponding to [EnableLanguageSelectionUi]. */
const val ENABLE_LANGUAGE_SELECTION_UI_DEFAULT_VALUE = false

/**
 * Qualifier for the platform parameter that controls the visibility of [ProfileAndDeviceIdActivity]
 * and working of learner study related analytics logging.
 */
@Qualifier
annotation class LearnerStudyAnalytics

/**
 * Name of the platform parameter that controls the visibility of [ProfileAndDeviceIdActivity]
 * and working of learner study related analytics logging.
 */
const val LEARNER_STUDY_ANALYTICS = "learner_study_analytics"

/**
 * Default value of the platform parameter that controls the visibility of [ProfileAndDeviceIdActivity]
 * and working of learner study related analytics logging.
 */
const val LEARNER_STUDY_ANALYTICS_DEFAULT_VALUE = false

/**
 * Qualifier for the platform parameter that controls whether to cache LaTeX rendering using Glide.
 */
@Qualifier
annotation class CacheLatexRendering

/** Name of the platform that controls whether to cache LaTeX rendering using Glide. */
const val CACHE_LATEX_RENDERING = "cache_latex_rendering"

/** Default value for whether to cache LaTeX rendering using Glide. */
const val CACHE_LATEX_RENDERING_DEFAULT_VALUE = true

/** Qualifier for the platform parameter that controls whether to record performance metrics. */
@Qualifier
annotation class PerformanceMetricsCollection

/** Name of the platform parameter that controls whether to record performance metrics. */
const val PERFORMANCE_METRICS_COLLECTION = "performance_metrics_collection"

/** Default value for whether to record performance metrics. */
const val PERFORMANCE_METRICS_COLLECTION_DEFAULT_VALUE = false

/**
 * Qualifier for the platform parameter that controls the time interval in minutes of uploading
 * previously recorded performance metrics to the remote service.
 */
@Qualifier
annotation class PerformanceMetricsCollectionUploadTimeIntervalInMinutes

/**
 * Name of the platform parameter that controls the time interval in minutes of uploading previously
 * recorded performance metrics to the remote service.
 */
const val PERFORMANCE_METRICS_COLLECTION_UPLOAD_TIME_INTERVAL_IN_MINUTES =
  "performance_metrics_collection_upload_time_interval_in_minutes"

/**
 * Default value of the time interval in minutes of uploading previously recorded performance
 * metrics to the remote service.
 */
const val PERFORMANCE_METRICS_COLLECTION_UPLOAD_TIME_INTERVAL_IN_MINUTES_DEFAULT_VAL = 15

/**
 * Qualifier for the platform parameter that controls the time interval in minutes of recording
 * performance metrics that are to be recorded more frequently.
 */
@Qualifier
annotation class PerformanceMetricsCollectionFrequentRecordTimeIntervalInMinutes

/**
 * Name of the platform parameter that controls the time interval in minutes of recording
 * performance metrics that are to be recorded more frequently.
 */
const val PERFORMANCE_METRICS_COLLECTION_FREQUENT_RECORD_TIME_INTERVAL_IN_MINUTES =
  "performance_metrics_collection_frequent_record_time_interval_in_minutes"

/**
 * Default value of the time interval in minutes of recording performance metrics that are to be
 * recorded more frequently.
 */
const val PERFORMANCE_METRICS_COLLECTION_FREQUENT_RECORD_TIME_INTERVAL_IN_MINUTES_DEFAULT_VAL = 15

/**
 * Qualifier for the platform parameter that controls the time interval in minutes of recording
 * performance metrics.
 */
@Qualifier
annotation class PerformanceMetricsCollectionRegularRecordTimeIntervalInMinutes

/**
 * Name of the platform parameter that controls the time interval in minutes of recording
 * performance metrics.
 */
const val PERFORMANCE_METRICS_COLLECTION_REGULAR_RECORD_TIME_INTERVAL_IN_MINUTES =
  "performance_metrics_collection_regular_record_time_interval_in_minutes"

/** Default value of the time interval in minutes of recording performance metrics. */
const val PERFORMANCE_METRICS_COLLECTION_REGULAR_RECORD_TIME_INTERVAL_IN_MINUTES_DEFAULT_VAL = 1440
