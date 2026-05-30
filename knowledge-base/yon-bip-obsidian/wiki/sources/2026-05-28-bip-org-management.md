---
title: 组织管理
source: https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/ZZGL11
date: 2024-01-21
ingested: 2026-05-28
tags: [组织管理, 业务单元, 部门, 委托关系, 职能共享, 组织参照, MDD]
images: 40
image_paths: []
---

# 组织管理

> BIP 组织管理完整指南：核心模型、技术架构、功能介绍与开发示例（八大开发主题，46K 字）。

## 八大开发主题

1. 业务单元核心业务使用及开发
2. 部门核心业务使用及开发
3. 委托关系业务使用及开发
4. 职能共享业务使用及开发
5. 组织参照开发使用
6. 组织业务函数开发使用
7. 组织数据同步开发使用
8. 组织开放接口开发使用

## 技术架构

组织服务是平台核心服务，使用 **MDD 框架**开发，划分为五大业务模块：

| 模块 | 职责 |
|------|------|
| 组织核心模型管理 | 业务单元创建、职能维护、部门维护、职能扩展，支撑多职能/矩阵式建模 |
| 委托关系 | 组织间横向关系 |
| 业务期初 | 组织期初设置与查询 |
| 职能共享 | 部门人员共享场景 |
| 组织相关权限 | 主组织权限、数据权限 |

对外能力：MDF 前端、REST/RPC 接口、OpenAPI、YonLinker（NC/NCC/U8 数据同步）。

## 组织参照速查

### 常用公共参照

| 参照编码 | 名称 | 职能过滤 |
|----------|------|----------|
| `org_unit_tree_ref` | 业务单元树参照 | Y |
| `org_unit_list_ref` | 业务单元列表参照 | N |
| `org_center_admin_tree_ref` | 人力资源组织树参照 | N |
| `admin_dept_tree_ref` | 人力部门树参照 | N |
| `org_fun_filter_tree_ref` | 业务单元参照(支持职能过滤) | Y |
| `org_fun_filter_list_ref` | 业务单元列表参照(支持职能过滤) | Y |
| `org_assets_tree_ref` | 资产组织参照 | Y |
| `org_taxpayer_tree_ref` | 纳税主体参照 | Y |

### 已废弃参照及替代

| 原参照 | 替代参照 |
|--------|----------|
| `bd_adminorgtreeref` | `org_center_admin_tree_ref` |
| `bd_baseorgref` | `org_unit_tree_ref` |
| `org_admin_tree_ref` | `orgcenter_admin_tree_ref` |
| `bd_admindepttreeref` | `admin_dept_tree_ref` |

## 核心模型

- **组织单元**（业务单元）：职能组织的公共信息，包含组织基本信息及负责人、纳税人识别号等
- **部门**：管理人员的组织，可在组织单元下建立，可同时为组织单元
- **具体职能组织**：采购组织、销售组织、库存组织、会计主体、研发组织、资产组织等
- **委托关系**：业务组织、被委托业务组织、开票组织、是否默认
- **多组织启用**：公有云特性，支持单组织→多组织切换

## 开发对接

- **前端 UI 模板**：相关参照已在 MDF 前端注册，按需引入
- **后端接口**：通过 REST/RPC 调用组织服务
- **OpenAPI**：通过开放平台暴露组织核心维护能力
- **事件订阅**：通过事件中心订阅组织变更事件
- **数据同步**：YonLinker 支持 NC/NCC/U8 等 ERP 组织架构同步

## 与其他文档关联

- [[2026-05-28-bip-main-org-config]] — 主组织配置方案（YonBuilder + MDD）
- [[专业开发]] — 组织权限、对象建模
