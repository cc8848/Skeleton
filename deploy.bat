@echo on
@echo =============================================================
@echo $                                                           $
@echo $                      Nepxion Skeleton                     $
@echo $                                                           $
@echo $                                                           $
@echo $                                                           $
@echo $  Nepxion Technologies All Right Reserved                  $
@echo $  Copyright(C) 2017                                        $
@echo $                                                           $
@echo =============================================================
@echo.
@echo off

@title Nepxion Skeleton
@color 0a

call mvn clean deploy -DskipTests -e -P release -pl skeleton-engine,skeleton-framework -am

pause