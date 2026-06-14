---
tags: [BIP5, 开发框架, MDF, YNF, MDD, YPD, 旗舰版]
created: 2026-06-14
platform_version: "BIP 5.0.2507"
sources: [raw/articles/2026-06-14-bip5-08.md]
confidence: EXTRACTED
---

# BIP 5.0 开发框架

> YonBIP 5.0 提供四大开发框架，以二方包或脚手架方式提供给领域开发和客开。

## 四大框架概览

| 框架 | 全称 | 定位 | 技术栈 |
|------|------|------|--------|
| **MDF** | Model-Driven Frontend | 前端应用架构 | ViewModel + Web(MetaUI) + Mobile(Antd) |
| **YNF** | Yonyou New-gen Frontend | 新一代统一前端 | React + MobX + ArcUI/TinperNext |
| **MDD** | Model-Driven Development | 后端开发框架 | Maven + YMS + Rule 扩展 |
| **YPD** | YonBIP Platform Development | 新一代平台开发 | Maven + YMS + Plugin 扩展 |

## MDF 框架

基于元数据的模型驱动前端框架。一套代码支持 Web + Mobile。

**核心模块**：
- `mdf-cube`：Cube Core SDK（含 ViewModel）
- `mdf-baseui`：基于 tinper-next 组件库的 Web 交互层
- `mdf-baseui-mobile`：基于 antd-mobile 的移动端交互层
- `mdf-metaui-web/mobile`：MetaUI 组件包
- `mdf-middlewares-auth/log4js`：BFF 服务（Node.js KOA 中间件）
- `mdf-plugin-meta`：BFF 服务，UI 元数据和前端 JS 代码生成

**扩展机制**（在 `src/` 下扩展）：`business/` 脚本、`components/` 组件、`reducers/`、`routes/`、`styles/`、`actions/`、`web|mobile.jsx`

## YNF 框架

新一代统一前端框架，基于 React + MobX。相对于 MDF 的升级版：
- 响应式编程风格（MobX 数据方案）
- 分层设计，框架只实现必要功能
- 降低开发门槛（API 大幅减少）
- 渲染模式从"模板式生成"升级为"组合式生成"
- 组件库：TinperNext（Web）+ ArcUI（Mobile）
- 统一部署：TNS（Tinper Next Server）
- 统一设计：YonDesign

## MDD 框架（专业开发后端）

Maven 脚手架开发，核心能力：
- 脚手架搭建 → 修改 `application.properties` → YMS 配置数据源/Redis → 本地启动
- 依赖：`pom.xml` 增加 `parent yonbip-2nd-parent` + `iuap-ap-mdd-starter`
- 对接 12 个支撑服务：元数据、UI模板、权限、公式、工作流、业务流、打印、导入导出、编码规则、任务调度、事件中心、业务日志
- **扩展方式**：在标准 Action 的 **Rule 规则链** 中增加新 Rule

## YPD 框架（新一代）

新一代专业开发框架，和 MDD 能力相同但架构更新：
- 同样 Maven 脚手架 + YMS 配置 + 12 支撑服务
- 依赖：`parent yonbip-2nd-parent` + `iuap-ap-ypd-starter`
- **扩展方式**：在标准 Action 的 **前置/后置扩展点 Plugin** 中进行扩展

## MDD vs YPD 对比

| | MDD | YPD |
|------|-----|-----|
| 时代 | 上一代 | 新一代 |
| 扩展方式 | Rule 规则链 | Plugin 前后置扩展点 |
| 技术本质 | 规则驱动 | 插件驱动 |

## 相关页面

- [[低代码开发]]
- [[专业开发]]
- [[MDD后端开发]]
- [[实体扩展]]
- [[规则扩展]]
