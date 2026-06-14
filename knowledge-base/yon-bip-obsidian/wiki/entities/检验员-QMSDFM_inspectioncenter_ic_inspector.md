---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectioncenter.ic_inspector"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验员 (`QMSDFM.inspectioncenter.ic_inspector`)

> QIC | 物理表：`qms_dfm_ic_inspector`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验员 |
| 物理表 | `qms_dfm_ic_inspector` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:07.6410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（10个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `tenant` | 租户ID | `tenant_id` | String |
| 3 | `id` | ID | `id` | String |
| 4 | `inspectioncenter` | 检测室id | `pk_inspectioncenter` | 3e356da1-f619-432f-8cac-5aef30828e76 |
| 5 | `rownum` | 行号 | `row_num` | Integer |
| 6 | `inspector` | 检验员id | `pk_inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 7 | `dept` | 部门ID | `pk_dept` | c3b96360-c57f-455b-9728-2ca499d9922a |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `definect_b` | 自定义项特征组 | `definect_b` | 0aba3c21-b2a3-4078-a03f-349ea27a2f71 |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `definect_b` | 自定义项特征组 | `QMSDFM.inspectioncenter.IcInspectorDefineCharacter` | None |  |
| 3 | `dept` | 部门ID | `org.func.AdminOrg` | Service |  |
| 4 | `inspectioncenter` | 检测室id | `QMSDFM.inspectioncenter.inspectioncenter` | None | true |
| 5 | `inspector` | 检验员id | `bd.staff.Staff` | Service |  |
