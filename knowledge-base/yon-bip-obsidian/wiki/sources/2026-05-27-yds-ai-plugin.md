---
tags: [YDS, AI插件, YonBoss, JDK21, 开发工具]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-yds-ai-plugin.md]
---

# YDS安装用友的AI插件

> 在 YDS 开发工具中安装和配置用友 AI 插件（YonBoss），包括下载 JDK21 版 YDS、安装插件、配置环境、授权 API 等。

## 安装步骤

1. **下载 JDK21 版 YDS**：AI 插件最低要求 JDK17，建议 2026年3月以后版本
2. **安装插件**：YonBoss AI 插件 + 辅助插件
3. **基础配置**：在 YDS 工具设置中配置连接信息
4. **环境配置**：配置 YDS 当前开发环境
5. **导入 JSON 并授权 API**：在 API 发布节点导入 JSON，自动导入 6 个 API；在 API 调用节点授权这 6 个 API
6. **启动使用**：启动 YDS 服务 → 点击侧边栏机器人图标 → 登录

## 关键概念

- [[YDS 开发工具]]
- [[YonBoss AI]]
- [[API 授权]]
