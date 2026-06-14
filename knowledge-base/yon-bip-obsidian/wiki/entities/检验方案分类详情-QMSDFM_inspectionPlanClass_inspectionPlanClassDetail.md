---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlanClass.inspectionPlanClassDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案分类详情 (`QMSDFM.inspectionPlanClass.inspectionPlanClassDetail`)

> QIC | 物理表：`qms_dfm_inspection_plan_class_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案分类详情 |
| 物理表 | `qms_dfm_inspection_plan_class_detail` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:48:12.1670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `creator` | 创建人名称 | `creator` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `modifier` | 修改人名称 | `modifier` | String |
| 4 | `id` | ID | `id` | Long |
| 5 | `inspectionPlanClassId` | ID | `inspection_plan_class_id` | fb967f62-dd79-432d-88d0-aa4789da86d4 |
| 6 | `code` | 编码 | `code` | String |
| 7 | `note` | 备注 | `note` | String |
| 8 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 9 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `name` | 名称 | `name` | String |
| 14 | `pubts` | 时间戳 | `pubts` | DateTime |
| 15 | `tenant` | 租户ID | `tenant_id` | String |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionPlanClassId` | ID | `QMSDFM.inspectionPlanClass.inspectionplanclass` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人id | `base.user.User` | Service |  |
