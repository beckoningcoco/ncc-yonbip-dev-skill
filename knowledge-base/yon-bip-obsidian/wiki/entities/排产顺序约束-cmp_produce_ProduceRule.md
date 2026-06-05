---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.produce.ProduceRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 排产顺序约束 (`cmp.produce.ProduceRule`)

> DCRP | 物理表：`cmp_produce_producerule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 排产顺序约束 |
| 物理表 | `cmp_produce_producerule` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:57:55.6780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（22个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `code` | 编码 | `code` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `disablets` | 停用时间 | `disablets` | DateTime |
| 7 | `enable` | 启用 | `enable` | sys_intboolean |
| 8 | `enablets` | 启用时间 | `enablets` | DateTime |
| 9 | `entityTypeUri` | 实体URI | `entity_type_uri` | String |
| 10 | `groupRuleList` | 分组规则定义 | `` | 03984cfe-7ca1-43cf-b12f-9e34be17d95f |
| 11 | `id` | ID | `id` | Long |
| 12 | `isSystem` | 是否系统预制 | `is_system` | Short |
| 13 | `memo` | 备注 | `memo` | String |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `name` | 名称 | `name` | String |
| 19 | `orgId` | 工厂 | `org_id` | dcff4710-92a6-4b3a-85c0-553ad21aabc3 |
| 20 | `priorityRuleList` | 优先级规则定义 | `` | cf210963-6dfd-4fa7-a576-55c9fb86d46e |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `priorityRuleList` | 优先级规则定义 | `cmp.produce.PriorityRule` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `orgId` | 工厂 | `org.func.FactoryOrg` | Service |  |
| 6 | `groupRuleList` | 分组规则定义 | `cmp.produce.GroupRule` | None | true |
