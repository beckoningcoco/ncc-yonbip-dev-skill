---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.IndDemandAndBOMMapping"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 独立需求与bom映射关系表 (`mr.planworkbench.IndDemandAndBOMMapping`)

> MR | 物理表：`mr_requirement_bom_mapping`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 独立需求与bom映射关系表 |
| 物理表 | `mr_requirement_bom_mapping` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:10:58.8790` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（11个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bomId` | BOM表体ID | `bom_id` | Long |
| 2 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 3 | `docNo` | 单据号 | `doc_no` | String |
| 4 | `docTypeCode` | 单据类型编码 | `doc_type_code` | DocTypeEnum |
| 5 | `id` | ID | `id` | Long |
| 6 | `orgId` | 计划组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `rootDocId` | 单据ID | `doc_id` | Long |
| 9 | `substituteFlag` | BOM替代标识 | `substitute_flag` | String |
| 10 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `orgId` | 计划组织 | `org.func.BaseOrg` | Service |  |
| 3 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
