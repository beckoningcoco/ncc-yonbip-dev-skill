---
title: 开发框架（MDF/YNF/MDD/YPD）
source: E:/NCProject/wiki资料/用友YonBIP 5.0.2507用户手册-云平台-开发框架.pdf
date: 2025-08
ingested: 2026-05-28
tags: [开发框架, MDF, YNF, MDD, YPD, 前端框架, 后端框架]
images: 0
image_paths: []
---

## 开发框架（MDF/YNF/MDD/YPD）

YonBIP V5.0.2507 四大开发框架的用户手册（10 页），以二方包或脚手架方式提供给领域开发和客开。

### 总览

开发框架面向开发人员，不具备产品页面，以二方包/脚手架方式提供给领域开发或客开，使开发者可在框架基本能力上专注业务开发，减少重复工作。

### MDF 框架

MDF（ModelDrivenFramework）是**前端**基于元数据的模型驱动开发框架，支持通过模式化配置自动生成并渲染页面。

- **核心模块**：mdf-cube（CubeCoreSDK 含 ViewModel）、mdf-baseui（基于 tinper-next）、mdf-baseui-mobile（基于 antd-mobile）、mdf-metaui-web/mobile（MetaUI 组件包）、mdf-middlewares-auth（BFF 权限 KOA 中间件）、mdf-middlewares-log4js（BFF 日志 KOA 中间件）、mdf-plugin-meta（BFF UI 元数据/前端 JS 代码生成）
- **关键概念**：元数据（Metadata）、ViewModel（编程模型）、UI 模板、Node 层（基于 NodeJS 的 BFF 中间层）、BFF（BackendForFrontend 用户体验适配层）
- **扩展机制**：扩展脚本（src/business）、扩展组件（src/client/web|mobile/components）、扩展 reducers、扩展路由、扩展样式、扩展 Action
- Web 和 Mobile 共用一套开发框架和扩展脚本

### YNF 框架

YNF（Yonyou New-generation Front-end framework）是用友**新一代统一前端框架**。

- **核心特点**：引入 MobX 响应式数据方案（降低业务复杂度）、分层设计（框架只实现必要核心功能+默认扩展）、降低开发门槛（框架 API 大幅减少）、提供程序主动权（领域开发受框架制约少）、界面灵活多变（模板式→组合式渲染）
- **技术栈**：MobX（状态管理）、TinperNext（Web 基础组件库 React）、ArcUI（移动基础组件库 React）、TNS（TinperNextServer 统一前端部署）、YonDesign（统一设计语言系统）
- **扩展机制**：创建扩展脚本工程、Action 扩展方案、Reaction 扩展方案、Store 扩展方案、页面公共扩展方案、样式扩展方案

### MDD 框架

MDD（ModelDrivenDevelopment）是**后端**模型驱动开发框架。

- **核心目标**：实现模型和技术框架的分离，让开发者专注业务，框架封装技术细节
- **脚手架能力**：配合页面建模默认支持增删改查，对接标准的支撑服务（元数据、UI 模板、权限、公式、工作流、业务流、打印、导入、导出、编码规则、任务调度、事件中心、业务日志）
- **对接支撑服务**：元数据、UI 模板、数据权限、功能权限、公式、工作流、业务流、导入、导出
- **扩展开发**：在标准 action 的 rule 规则链中增加新的 rule 进行业务扩展
- **依赖**：pom 增加 parent `yonbip-2nd-parent`，依赖 `iuap-ap-mdd-starter`

### YPD 框架

YPD（Yonyou Platform Development）是新一代的**后端平台开发框架**，与 MDD 目标一致但面向更深度定制。

- **脚手架能力**：与 MDD 相同（增删改查+标准支撑服务对接）
- **对接支撑服务**：与 MDD 相同（元数据、UI 模板、数据权限、功能权限、公式、工作流、业务流、导入、导出、编码规则、任务调度、事件中心、业务日志）
- **扩展开发**：在标准 action 的前置或后置扩展点 plugin 中进行业务扩展
- **依赖**：pom 增加 parent `yonbip-2nd-parent`，依赖 `iuap-ap-ypd-starter`

### 框架选择指南

| 框架 | 定位 | 适用场景 |
|------|------|----------|
| MDF | 前端模型驱动 | 元数据驱动的页面自动渲染，标准单据/档案页面 |
| YNF | 前端新一代 | 需要高度自定义交互、响应式状态管理的复杂前端 |
| MDD | 后端模型驱动 | 标准增删改查+平台支撑服务，规则链扩展 |
| YPD | 后端专业开发 | 深度定制、前置/后置插件扩展、微服务架构 |

## 关联

- [[2026-05-28-bip-ctp-platform]] — CTP 技术平台底座
- [[2026-05-28-bip-ynf-app-dev]] — 新应用开发（YNF）
- [[2026-05-28-bip-ynf-frontend]] — 前端开发（YNF）
- [[2026-05-28-bip-ypdzykf11]] — YPD 专业开发
- [[2026-05-28-bip-mdf-frontend]] — 前端开发（MDF）
- [[2026-05-28-bip-pro-dev-intro]] — 专业开发介绍
- [[BIP后端开发模板]] — 主题页
