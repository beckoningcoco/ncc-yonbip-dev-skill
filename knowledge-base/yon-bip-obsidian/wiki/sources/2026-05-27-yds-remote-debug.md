---
tags: [YDS, 远程调试, JVM Debug, VSCode, launch.json]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yds-remote-debug.md]
---

# YDS配置远程调试

> 在 YDS 环境中使用 VS Code 进行远程 JVM Debug 调试。

## 步骤

1. **微服务启用调试端口**：在 YDS 中为微服务配置调试端口
2. **安装 VS Code 插件**：Extension Pack for Java
3. **配置 launch.json**：`Ctrl+Shift+P` → `Debug: Open launch.json`，添加 Remote JVM Debug 配置：

```json
{
    "name": "Remote JVM Debug",
    "type": "java",
    "request": "attach",
    "hostName": "调试ip",
    "port": 端口,
    "protocol": "dt_socket"
}
```

4. **启动调试**：选中 Remote JVM Debug，点击三角形运行
5. 在 Java 代码中打断点即可远程调试

## 关键概念

- [[YDS 开发工具]]
- [[VS Code 远程调试]]
- [[JVM Debug]]
