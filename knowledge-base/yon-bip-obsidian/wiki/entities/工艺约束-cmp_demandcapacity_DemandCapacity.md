---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.demandcapacity.DemandCapacity"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工艺约束 (`cmp.demandcapacity.DemandCapacity`)

> DCRP | 物理表：`cmp_demand_capacity`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工艺约束 |
| 物理表 | `cmp_demand_capacity` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:29.6270` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（46个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `versionNum` | 版本 | `version_num` | String |
| 7 | `priority` | 优先级 | `priority` | Short |
| 8 | `constraintRuleVerId` | 排产版本 | `constraint_rule_ver_id` | 1c76a52f-4c51-4554-9bec-dc552617ce6c |
| 9 | `demandObjectType` | 需求对象类型 | `demand_object_type` | String |
| 10 | `srcRouteId` | 工艺约束来源ID | `src_route_id` | Long |
| 11 | `srcRouteType` | 工艺约束来源类型 | `src_route_type` | String |
| 12 | `productId` | 物料ID | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 13 | `quantity` | 数量 | `quantity` | Decimal |
| 14 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 15 | `mainQuantity` | 主数量 | `main_quantity` | Decimal |
| 16 | `mainUnit` | 主单位 | `main_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 17 | `freeCharacteristics` | 自由项 | `free_characteristics` | c9cba702-7939-4b70-ae6a-a1b13ddbefc6 |
| 18 | `defineCharacter` | 工艺约束自定义项特征 | `define_character` | 064d64dd-449b-44d0-b2da-6f5b0e2407ef |
| 19 | `effectiveDate` | 生效时间 | `effective_date` | DateTime |
| 20 | `expiryDate` | 失效时间 | `expiry_date` | DateTime |
| 21 | `memo` | 备注 | `memo` | String |
| 22 | `calculateId` | 产能运算ID | `calculate_id` | 12a493ee-e7d1-4aac-b52d-8dd0dc02121b |
| 23 | `demandCapacitySource` | 工艺约束来源 | `demand_capacity_source` | String |
| 24 | `routingType` | 路线类别 | `routing_type` | Integer |
| 25 | `substituteFlag` | 替代标识 | `substitute_flag` | String |
| 26 | `bomRelated` | 生效BOM版本 | `bom_related` | String |
| 27 | `dataClassType` | 数据类类型 | `data_class_type` | String |
| 28 | `dataClassItem` | 数据类项 | `data_class_item` | String |
| 29 | `bussinessKey` | 业务主键 | `bussiness_key` | String |
| 30 | `dataType` | 数据类型 | `data_type` | Integer |
| 31 | `constraintDim` | 约束维度 | `constraint_dim` | Integer |
| 32 | `dr` | 逻辑删除标记 | `dr` | Short |
| 33 | `createTime` | 创建时间 | `create_time` | DateTime |
| 34 | `createDate` | 创建日期 | `create_date` | Date |
| 35 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 36 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 37 | `creator` | 创建人名称 | `creator` | String |
| 38 | `modifier` | 修改人名称 | `modifier` | String |
| 39 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 40 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 41 | `enable` | 启用 | `enable` | sys_intboolean |
| 42 | `enablets` | 启用时间 | `enablets` | DateTime |
| 43 | `disablets` | 停用时间 | `disablets` | DateTime |
| 44 | `pubts` | 时间戳 | `pubts` | DateTime |
| 45 | `demandCapacityDim` | 工艺约束维度 | `` | 27dabf16-ac03-42d6-9745-8925d294beb6 |
| 46 | `demandCapacityList` | 工艺约束行 | `` | bd70e207-3153-4d6f-8a3f-11dae94555da |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mainUnit` | 主单位 | `pc.unit.Unit` | Service |  |
| 2 | `productId` | 物料ID | `pc.product.Product` | Service |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `constraintRuleVerId` | 排产版本 | `cmp.constraintRuleVersion.ConstraintRuleVersion` | None |  |
| 5 | `calculateId` | 产能运算ID | `cmp.capacitycalculate.CapacityCalculate` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `demandCapacityDim` | 工艺约束维度 | `cmp.demandcapacity.DemandCapacityDim` | None | true |
| 9 | `orgId` | 组织 | `aa.baseorg.OrgMV` | Service |  |
| 10 | `demandCapacityList` | 工艺约束行 | `cmp.demandcapacity.DemandCapacityList` | None | true |
| 11 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 12 | `freeCharacteristics` | 自由项 | `cmp.demandcapacity.DemandCapacityFreeCT` | None |  |
| 13 | `defineCharacter` | 工艺约束自定义项特征 | `cmp.demandcapacity.DemandCapacityDefineCT` | None |  |
