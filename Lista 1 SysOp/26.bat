@echo off
IF "%1"=="" (
echo Parametr nie zostal podany
) ELSE (
net share Path=%1 /GRANT: %2, FULL
)