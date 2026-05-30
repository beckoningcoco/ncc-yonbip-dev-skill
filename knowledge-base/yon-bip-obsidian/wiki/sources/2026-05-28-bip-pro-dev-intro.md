---
tags: [专业开发, 应用构建, YonBuilder, 产品概述, 术语]
created: 2026-05-28
updated: 2026-05-28
sources: []
---

# 专业开发介绍

> YonBIP 社区文档中心 — 专业开发产品概述、技术架构、开发流程和学习指南。

## 适用场景

所有部署方案均适用客户化定制开发和ISV生态开发：公有云、私有云、专属云、本地部署。

## 关键术语

| 术语 | 定义 |
|------|------|
| 应用构建-基础版 | 无代码声明式开发 + 在线函数式低代码开发 |
| 应用构建-专业版 | 包含基础版全部能力，支持多租户实施、本地代码扩展和独立部署 |
| 应用构建升级版 | 支持零代码+低代码+专业开发三种模式，支持平滑升级 |
| 应用引擎 | 提供脚手架下载、本地调试、CI/CD等开发全生命周期支撑 |
| 技术平台 | 面向开发者的 DevOps + 云服务全生命周期管理 |
| YPD框架 | Yonbip Platform Development Framework，强类型实体+插件扩展的后端框架 |
| YDS工具 | YonBuilder Developer Studio，一站式开发IDE |
| 元数据 | 描述数据的数据 |
| UI元数据 | 描述前端UI数据的信息 |

## 技术栈

- **前端**：Node.js、React
- **后端**：Java、SpringBoot
- **中间件**：MySQL/Oracle/达梦/Oscar/PostgreSQL + YonMatrix + Redis + Kafka + Nginx + ES + MinIO/SFTP
- **底座**：K8s、Docker、DevOps

## 项目结构

```
yonbuilder-pro-be
├── yonbuilder-pro-api          // API接口
├── yonbuilder-pro-app          // 控制器
├── yonbuilder-pro-bootstrap    // 启动类所在模块
├── yonbuilder-pro-infrastructure // 基础模块
└── yonbuilder-pro-service      // 服务层
```

## 脚手架

通过 Freemarker 模板引擎 + Git 远端模板仓库生成脚手架代码。后端分 YPD 框架和 MDD 框架两种，前端分 MDF 和 YNF 两种。

## 开发流程

### 客户化开发
需求分析 → 功能设计 → 开发 → 测试 → 上线验收

### ISV产品开发（额外要求）
- 须取得产品开发认证证书
- 使用3个沙箱：开发沙箱 → 测试沙箱 → 管理沙箱（制品+发布零租户）

## 相关页面

- [[旗舰版开发基础]]
- [[页面脚本]]
- [[BIP后端开发模板]]
- [[环境搭建]]

