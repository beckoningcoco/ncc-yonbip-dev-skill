---
tags: [BIP, 元数据, 数据字典, apct.reportconjunctivequery.Apct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 联查报表 (`apct.reportconjunctivequery.Apct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct` | domain：`apct` | 应用：`APCT` | 业务对象ID：`1d7c8c01-f91e-41b4-b87a-7b4aee6d8254`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 联查报表 |
| 物理表 | `apct_apct` |
| domain/服务域 | `apct` |
| schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 8 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `supplier_id` | `` |
| `personnel_id` | `` |
| `dept_id` | `` |
| `acct_entity_id` | `` |
| `sign_org_id` | `` |
| `project_id` | `` |
| `bustype` | `` |
| `org_id` | `` |

## 字段列表（按类型分组）

> 共 8 个直连字段

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `acct_entity_id` | `acct_entity_id` | `acctEntityId` | 会计主体 |
| `org_id` | `org_id` | `orgId` | 承办组织 |
| `dept_id` | `dept_id` | `deptId` | 承办部门 |
| `personnel_id` | `personnel_id` | `personnelId` | 承办人员 |
| `project_id` | `project_id` | `projectId` | 项目名称 |
| `sign_org_id` | `sign_org_id` | `signOrgId` | 签约组织(本方) |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
