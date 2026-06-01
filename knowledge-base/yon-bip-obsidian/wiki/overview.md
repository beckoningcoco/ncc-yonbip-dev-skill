# 用友BIP开发知识库 — 知识库总览

> 创建于 2026-05-27

---

## 关于这个知识库

这里收集了关于 **用友BIP开发知识库** 的所有知识和素材。

每个素材都经过 AI 消化和整理，形成了互相链接的 wiki 页面。你可以通过以下方式浏览：

- **实体页**：人物、组织、概念、工具的详细介绍
- **主题页**：围绕某个研究主题的综合分析
- **素材摘要**：每篇素材的核心观点提取
- **对比分析**：不同方案、工具、观点的横向比较
- **综合分析**：跨素材的深度洞察

---

## 知识地图

> 2026-06-01 消化 30 份 iuap BIP 红皮书，产出 **27 篇技术参考条目**。
> 来源：`E:\NCProject\wiki资料\20260601\`

### 🟢 核心开发模型

| 条目 | 来源 | 内容 |
|------|------|------|
| [[topics/bip-platform/mdd-backend]] | MDD 后端编程模型 (133p) | 脚手架、XML元数据、审批流SQL、RESTful API参数 |
| [[topics/bip-platform/yms-dev-process]] | YMS 开发过程 (101p) | 中间件组件、IRIS三种RPC、插件扩展、Docker/fatjar |
| [[topics/bip-platform/yonbuilder-app]] | YonBuilder 应用构建 (116p) | 数据建模、8种模板、MDF协议转换 |
| [[topics/bip-platform/function-component]] | 函数组件 (59p) | J2V8引擎、前后端函数示例、SPI扩展、YonQL |
| [[topics/bip-platform/mdf-frontend]] | MDF 前端编程模型 (1846p) | **目录导航** + 关键API速查（需按章深读补全） |

### 🔵 平台基础能力

| 条目 | 来源 | 内容 |
|------|------|------|
| [[topics/bip-platform/metadata-bizobject]] | 元数据及业务对象 (58p) | 元模型、属性标签表、业务对象增强、QuerySchema |
| [[topics/bip-platform/ui-template]] | UI 模板 (32p) | 三种接入、关键表、Dubbo Bean、高级设计器 |
| [[topics/bip-platform/permission-system]] | 权限管理 (117p) | 三员流程、ICustomOrgPermissionsHandler、SDK坐标 |
| [[topics/bip-platform/org-reference-list]] | 组织管理 (90p) | 20+参照编码完整对照表 |
| [[topics/bip-platform/message-service]] | 消息开发 (129p) | FAQ排查清单、plainMessage、模板预置 |
| [[topics/bip-platform/open-platform]] | 开放平台 (162p) | 熔断/限流/插件、API监控指标、日志 |
| [[topics/bip-platform/event-center]] | 事件中心 (60p) | RPC/REST/EOS三种发送、订阅参数、限流 |

### 🟡 业务集成

| 条目 | 来源 | 内容 |
|------|------|------|
| [[topics/bip-platform/business-flow]] | 业务流 (73p) | 完整Rule链体系、推单/拉单/回写、多版本 |
| [[topics/bip-platform/yts-distributed-tx]] | 分布式事务 (43p) | ISagaRule/ITccRule接口、MDD config JSON |
| [[topics/bip-platform/scheduler-task]] | 调度任务 (41p) | 参数类型表、DispatchTasktimePO、REST API |

### 🟠 组件与工具

| 条目 | 来源 | 内容 |
|------|------|------|
| [[topics/bip-platform/formula]] | 公式组件 (22p) | 公式引擎、自定义函数/变量扩展 |
| [[topics/bip-platform/rule-engine]] | 规则引擎 (26p) | Drools三层场景、Scope分配、表达式组件 |
| [[topics/bip-platform/componentized-dev]] | 组件化开发 (55p) | YonUI CLI、manifest配置、发布流程 |
| [[topics/bip-platform/factory-ext]] | 原厂扩展 (31p) | 四种场景、60字段限制、覆盖策略 |
| [[topics/bip-platform/archive-custom]] | 档案/交易类型/安装器/分级 (4合1) | 档案API、交易类型、GoTemplate、MCSetManageService |

### ⚪ 运维部署

| 条目 | 来源 | 内容 |
|------|------|------|
| [[topics/bip-platform/devops-cloud-debug]] | DevOps (28p) | VM Options、Hubble Agent、注册中心验证 |
| [[topics/bip-platform/container-cloud]] | 容器云 (57p) | DNS API、多云接入、云中立代理 |
| [[topics/bip-platform/hubble]] | 哈勃监控 (57p) | Prometheus/Fluentd/AlertManager、Agent配置 |
| [[topics/bip-platform/log-service]] | 日志服务 (36p) | BusinessLogVO、线程池配置 |
| [[topics/bip-platform/ypr-package]] | YPR 出盘 (39p) | 制盘流程、SP/QP/KB补丁、权限模型 |

### ⚪ 扩展专项

| 条目 | 来源 | 内容 |
|------|------|------|
| [[topics/bip-platform/enterprise-portrait]] | 企业画像 (41p) | 7大服务、三种接入、Corpinfo组件 |
| [[topics/bip-platform/digital-workbench]] | 数字化工作台 (201p) | JSSDK、菜单层级、计量、全局搜索 |

---

## 快速导航

| 类型 | 数量 | 查看 |
|------|------|------|
| 素材 | 0 | [[素材摘要]] |
| 实体 | 0 | [[实体页]] |
| **主题** | **27** | `wiki/topics/bip-platform/` |
| 对比 | 0 | [[对比分析]] |
| 综合 | 0 | [[综合分析]] |

---

## 待补全（TODO）

| 优先级 | 事项 | 说明 |
|--------|------|------|
| 🔴 | MDF 前端深读 | 1846页仅目录级，需按章补全(API→扩展→场景→组件) |
| 🟡 | 交叉引用 | 条目间需建立 `[[link]]` 关联 |
| 🟡 | 实战案例 | 短篇条目缺少真实代码示例和错误码表 |
| 🟢 | 版本标记 | 部分条目未标注 `applies_to` 版本和验证状态 |

---

## 最近更新

- **2026-06-01** — 消化 30 份 iuap BIP 红皮书，27 篇wiki入库
- **2026-06-01** — MDF 前端 API 参考章节深读补充（计划中）
