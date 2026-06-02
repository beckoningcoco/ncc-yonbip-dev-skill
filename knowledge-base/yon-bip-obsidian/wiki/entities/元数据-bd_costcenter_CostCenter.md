---
tags: [BIP, 元数据, 数据字典, bd, bd.costcenter.CostCenter]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 成本中心基本档案 (`bd.costcenter.CostCenter`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_costcenter` | 应用: `DPMACCT` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成本中心基本档案 |
| 物理表 | `bd_costcenter` |
| 应用 | `DPMACCT` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:43:02:000
- 安装来源: `/app/finbd/finbd-web/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-finbd/0010_iuap_common/DML/0270_iuap_metadata/20260422/202604221702_metadata_bd-costcenter.zip`

## 术语标记

`data_auth`, `MasterData`, `isMultiCodeRule`, `ConfigData`, `doc`, `tree_tag`, `isUseCondition`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IAuditInfo (`IAuditInfo`) | `base.itf.IAuditInfo` | 340 | 8 |
| ITenant (`ITenant`) | `base.itf.ITenant` | 73 | 1 |
| LogicDelete (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| ITree (`ITree`) | `ucfbase.ucfbaseItf.ITree` | 339 | 6 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |

---

## 全部属性（47 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `extend26` | extend26 | `extend26fieldName` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quoteList` | false |  |
| 2 | `id` | 主键ID | `id` | Long | `long` | false | true |
| 3 | `code` | 编码 | `code` | String | `text` | false | true |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 5 | `creatorId` | 创建人ID | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 6 | `factorScope` | actorScope(金额) | `factor_scope` | c823e22a-3b1f-4c41-9cf5-11f2b56f6fd2 | `quote` | false | true |
| 7 | `log` | log | `log` | String | `text` | false | true |
| 8 | `logDetail` | logDetail | `log_detail` | String | `text` | false | true |
| 9 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 10 | `logError` | logError | `log_error` | String | `text` | false | true |
| 11 | `logDr` | logDr | `log_dr` | Short | `short` | false | true |
| 12 | `modifierId` | 修改人ID | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b | `quote` |  | true |
| 13 | `objid` | objid | `obj_id` | String | `text` | false | true |
| 14 | `taskId` | taskId | `task_id` | String | `text` | false | true |
| 15 | `tenant` | tenant | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd | `quote` | true | true |
| 16 | `ccClass` | cClass | `cc_class` | 424d7156-98a0-4980-a73e-4e72fbb3feec | `quote` | false | true |
| 17 | `manager` | manager | `manager` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a | `quote` | false | true |
| 18 | `isDefault` | 是否Default | `is_default` | Boolean | `switch` | false | true |
| 19 | `enableDate` | enableDate(日期) | `enabledate` | DateTime | `timestamp` | false | true |
| 20 | `expireDate` | expireDate(日期) | `expiredate` | DateTime | `timestamp` | false | true |
| 21 | `effect` | effect | `effect` | Boolean | `switch` | false | true |
| 22 | `description` | 描述 | `description` | String | `text` | false | true |
| 23 | `accentity` | accentity | `accentity` | dabb8185-bfd2-4ed3-a721-f5bc5d948246 | `quote` | false | true |
| 24 | `orgUnit` | orgUnit | `org_unit` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` | false | true |
| 25 | `profitCenter` | profitCenter | `profit_center` | e33ec72a-3857-4167-89e2-a437168ed3bb | `quote` | false | true |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 27 | `creator` | 创建人 | `creator` | String | `text` |  | true |
| 28 | `createTime` | 创建时间 | `create_time` | DateTime | `timestamp` |  | true |
| 29 | `createDate` | 创建日期 | `create_date` | Date | `date` |  | true |
| 30 | `modifier` | 修改人 | `modifier` | String | `text` |  | true |
| 31 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `timestamp` |  | true |
| 32 | `modifyDate` | 修改日期 | `modify_date` | Date | `date` |  | true |
| 33 | `character` | haracter | `cost_center_character` | 955f46ea-39e1-47b7-a4e0-b05266f6500a | `UserDefine` | false | true |
| 34 | `CostCenter_extend26List` | CostCenter_extend26List | `` | b58ab032-6cf8-45dd-8ddd-3e1d7f9e09de | `` |  |  |
| 35 | `accentities` | accentities | `` | 22951db7-925a-4f96-afab-4f8140862e22 | `` |  |  |
| 36 | `dis` | is(日期) | `` | 5266320e-e40b-4ae5-ae40-9e3b6cb91693 | `` |  |  |
| 37 | `factorScopes` | actorScopes(金额) | `` | f9ca3e30-b5d2-4b45-8261-798e217cc250 | `` |  |  |
| 38 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 39 | `level` | level | `level` | Integer | `int` |  | true |
| 40 | `parent` | parent | `parent_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` | false | true |
| 41 | `path` | path | `path` | String | `text` |  | true |
| 42 | `relatedAdminOrg` | relatedAdminOrg | `related_admin_org` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` | false | true |
| 43 | `relations` | relations | `` | f1293f17-104c-453c-bda3-afe90213ce8f | `` |  |  |
| 44 | `shareAccentity` | shareAccentity | `share_accentity` | Boolean | `switch` | false | true |
| 45 | `sort` | 排序号 | `sort_num` | Integer | `int` |  | true |
| 46 | `virtually` | virtually | `virtually` | 66a2f2ab-802c-4583-9d85-4a015d35f10c | `quote` | false | true |
| 47 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（20 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `bd.costcenter.CostCenter` | `parent_id` | 外键 |  |  | None |  |
| 2 | `ccClass` | cClass | `bd.costcenter.CostCenterClass` | `cc_class` | 外键 |  |  | None |  |
| 3 | `manager` | manager | `bd.staff.StaffNew` | `manager` | 外键 |  |  | Service |  |
| 4 | `factorScopes` | actorScopes(金额) | `bd.costcenter.FactorScope` | `` | factorScopes → header | 0..n | Y | None |  |
| 5 | `virtually` | virtually | `bd.costcenter.virtually` | `virtually` | virtually → virtually | 0..n | Y | None |  |
| 6 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 7 | `orgUnit` | orgUnit | `org.func.BaseOrg` | `org_unit` | 外键 |  |  | Service |  |
| 8 | `creatorId` | 创建人ID | `base.user.User` | `creatorId` | 外键 |  |  | Service |  |
| 9 | `modifierId` | 修改人ID | `base.user.User` | `modifierId` | 外键 |  |  | Service |  |
| 10 | `extend26` | extend26 | `base.user.BipUser` | `extend26fieldName` | 外键 |  |  | Service | false |
| 11 | `factorScope` | actorScope(金额) | `bd.costcenter.CostCenterFactorScope` | `factor_scope` | 外键 |  |  | None |  |
| 12 | `profitCenter` | profitCenter | `bd.virtualaccbody.VirtualAccbody` | `profit_center` | 外键 |  |  | None |  |
| 13 | `accentity` | accentity | `bd.virtualaccbody.VirtualAccbody_view` | `accentity` | 外键 |  |  | None |  |
| 14 | `dis` | is(日期) | `bd.costcenter.CostCenterDis` | `` | dis → header | 0..n | Y | None |  |
| 15 | `character` | haracter | `bd.costcenter.costCenterCharacter` | `cost_center_character` | 外键 |  |  | None |  |
| 16 | `relatedAdminOrg` | relatedAdminOrg | `bd.adminOrg.AdminOrgVO` | `related_admin_org` | 外键 |  |  | Service |  |
| 17 | `CostCenter_extend26List` | CostCenter_extend26List | `bd.costcenter.CostCenter_extend26` | `` | CostCenter_extend26List → fkid | 0..n | Y | None |  |
| 18 | `accentities` | accentities | `bd.costcenter.CostCenterAccentity` | `` | accentities → header | 0..n | Y | None |  |
| 19 | `relations` | relations | `bd.costcenter.ContrastRelation` | `` | relations → header | 0..n | Y | None |  |
| 20 | `tenant` | tenant | `base.tenant.Tenant` | `tenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT extend26fieldName, id, code, name, creatorId, factor_scope, log, log_detail
FROM bd_costcenter
```