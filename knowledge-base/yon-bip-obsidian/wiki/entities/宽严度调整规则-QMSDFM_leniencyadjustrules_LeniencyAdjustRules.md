---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.leniencyadjustrules.LeniencyAdjustRules"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 宽严度调整规则 (`QMSDFM.leniencyadjustrules.LeniencyAdjustRules`)

> QIC | 物理表：`qms_dfm_leniencyadjust_rules`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 宽严度调整规则 |
| 物理表 | `qms_dfm_leniencyadjust_rules` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:13.1390` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `note` | 备注 | `note` | String |
| 7 | `defineCharacteristics` | 自定义项特征组 | `define_cts` | ab5b58f7-0c83-4025-8503-69c6f8a68a38 |
| 8 | `dr` | 逻辑删除标记 | `dr` | Short |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 12 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `modifier` | 修改人名称 | `modifier` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `rulesList` | 规则明细 | `` | e8b123de-0751-4a38-b901-afb248ed927c |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rulesList` | 规则明细 | `QMSDFM.leniencyadjustrules.RuleDetail` | None | true |
| 2 | `defineCharacteristics` | 自定义项特征组 | `QMSDFM.leniencyadjustrules.LeniencyAdjustRulesDefineCharacter` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
