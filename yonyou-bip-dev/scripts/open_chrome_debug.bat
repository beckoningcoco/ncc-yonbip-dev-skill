@echo off
:: === Chrome 远程调试启动脚本 ===
:: 自动探测 Chrome 安装路径和用户目录，无需手动配置

:: 探测 Chrome 路径
set CHROME_PATH=
for %%p in (
    "C:\Program Files\Google\Chrome\Application\chrome.exe"
    "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe"
    "%LOCALAPPDATA%\Google\Chrome\Application\chrome.exe"
) do (
    if exist %%p set CHROME_PATH=%%p
)

if "%CHROME_PATH%"=="" (
    echo [ERROR] 未找到 Chrome，请检查安装路径
    pause
    exit /b 1
)

:: 用户数据目录（独立于日常浏览器）
set CHROME_DEBUG_DIR=%TEMP%\chrome-debug-profile

taskkill /F /IM chrome.exe >nul 2>&1
timeout /t 2 /nobreak >nul
rmdir /s /q "%CHROME_DEBUG_DIR%" >nul 2>&1

start "" %CHROME_PATH% --remote-debugging-port=9222 --remote-allow-origins=* --user-data-dir="%CHROME_DEBUG_DIR%" --no-first-run --no-default-browser-check

echo Chrome debug port 9222 ready. [路径: %CHROME_PATH%] [数据目录: %CHROME_DEBUG_DIR%]
pause
