---
tags: [BIP, 元数据, 数据字典, apct.reportledger.Apct]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 台账报表 (`apct.reportledger.Apct`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`apct_apct` | domain：`apct` | 应用：`APCT` | 业务对象ID：`275f47f5-1a33-419c-9999-a397593d6cdb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 台账报表 |
| 物理表 | `apct_apct` |
| 数据库 schema | `apct` |
| 所属应用 | `APCT` |
| 直连字段 | 9 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

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
| `customer_id` | `` |

## 字段列表（按类型分组）

> 共 9 个直连字段

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acct_entity_id` | `acct_entity_id` | `acctEntityId` | 会计主体 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `customer_id` | `customer_id` | `customer` | 客户 |
| `dept_id` | `dept_id` | `deptId` | 承办部门 |
| `org_id` | `org_id` | `orgId` | 承办组织 |
| `personnel_id` | `personnel_id` | `personnelId` | 承办人员 |
| `project_id` | `project_id` | `projectId` | 项目名称 |
| `sign_org_id` | `sign_org_id` | `signOrgId` | 签约组织(本方) |
| `supplier_id` | `supplier_id` | `supplierId` | 供应商 |
