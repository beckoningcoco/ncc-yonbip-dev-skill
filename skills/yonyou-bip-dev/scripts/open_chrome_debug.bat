@echo off
:: Chrome 调试端口启动脚本
:: 请修改下面两行路径为你的 Chrome 安装路径和调试数据目录
:: 也可以参考仓库根目录 path_config.json 中的 "Chrome调试用户目录"

set CHROME_PATH=C:\Program Files\Google\Chrome\Application\chrome.exe
set CHROME_DEBUG_DIR=C:\Users\99558\chrome_debug

taskkill /F /IM chrome.exe >nul 2>&1
timeout /t 2 /nobreak >nul
rmdir /s /q "%CHROME_DEBUG_DIR%" >nul 2>&1
start "" "%CHROME_PATH%" --remote-debugging-port=9222 --remote-allow-origins=* --user-data-dir=%CHROME_DEBUG_DIR% --no-first-run --no-default-browser-check
echo Chrome debug port 9222 ready.
pause
