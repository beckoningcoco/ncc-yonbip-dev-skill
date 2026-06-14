---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckBadItem"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 不良项目 (`QMSDFM.dfmCheck.QmsDfmCheckBadItem`)

> QIC | 物理表：`qms_dfm_check_bad_items`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 不良项目 |
| 物理表 | `qms_dfm_check_bad_items` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:46:42.3030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 不良项目id |

---

## 直接属性（19个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 不良项目id | `id` | Long |
| 3 | `pkDfmCheckInfo` | 检验信息id | `pk_dfm_check_info` | 0fa66411-6b81-45b0-b20d-e1d77fa8aa57 |
| 4 | `pkCheckInfoRowId` | 检验信息行id | `pk_check_info_rowId` | String |
| 5 | `baditem_name` | 不良项目名称 | `baditem_name` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `upstream_id` | 上游id | `upstream_id` | String |
| 9 | `badNumber` | 不良个数 | `bad_number` | Integer |
| 10 | `pk_baditem` | 不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 11 | `createDate` | 创建日期 | `create_date` | Date |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pk_baditem` | 不良项目 | `QMSDFM.badItems.badItems` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `pkDfmCheckInfo` | 检验信息id | `QMSDFM.dfmCheck.QmsDfmCheckInfo` | None | true |
