---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.conditionsetting.ConditionSetting"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 控制条件设置 (`sfc.conditionsetting.ConditionSetting`)

> IMPSFC | 物理表：`imp_sfc_condition_setting`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 控制条件设置 |
| 物理表 | `imp_sfc_condition_setting` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:20:55.6060` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `diyCondition` | 自定义关闭条件 | `diy_condition` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `productAuth` | 物料权限 | `product_id` | Long |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 14 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 15 | `id` | id | `id` | Long |
| 16 | `bizObject` | 业务单据 | `biz_obj` | String |
| 17 | `controlOccasion` | 控制时机 | `control_occasion` | Integer |
| 18 | `orgId` | 组织id | `org_id` | String |
| 19 | `manageClass` | 物料分类ID | `manage_class` | Long |
| 20 | `materialId` | 制造物料 | `material_id` | Long |
| 21 | `productId` | 物料ID | `product_id` | Long |
| 22 | `operationId` | 标准工序ID | `operation_id` | Long |
| 23 | `controlCondition` | 控制条件 | `control_condition` | Integer |
| 24 | `sysCondition` | 条件描述 | `sys_condition` | Integer |
| 25 | `percent` | 比例 | `percent` | Decimal |
| 26 | `remark` | 备注 | `remark` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
