---
tags: [BIP, 元数据, 数据字典, bd, bd.businessstep.BusinessStep]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 业务活动 (`bd.businessstep.BusinessStep`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_business_step` | 应用: `BMMMM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务活动 |
| 物理表 | `bd_business_step` |
| 应用 | `BMMMM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `step_code` | |

## 部署信息

- 部署时间: 2026-01-23 22:42:39:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0005_iuap-apdoc-basedoc_transtype/0010_iuap_common/DML/0270_iuap_metadata/20260115-itr/202512122144_metadata_bd-businessstep.zip`

## 术语标记

`ConfigData`, `isMain`, `doc`, `isBusinessObject`

## 依赖接口（6 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| LogicDelete (`LogicDelete`) | `iuap.busiObj.LogicDelete` | 211 | 1 |
| IYTenant (`IYTenant`) | `iuap.busiObj.IYTenant` | 214 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| IAuditInfo (`IAuditInfo`) | `iuap.busiObj.IAuditInfo` | 679 | 4 |
| IAuditInfo (`IAuditInfo`) | `ucfbase.ucfbaseItf.IAuditInfo` | 192 | 4 |

---

## 全部属性（26 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `step_code` | String | `text` |  | true |
| 3 | `name` | 名称 | `step_name` | String | `multiLanguage` |  | true |
| 4 | `stepStatus` | stepStatus(状态) | `step_status` | String | `text` |  | true |
| 5 | `isBusinessTake` | 是否BusinessTake | `is_business_take` | Integer | `int` |  | true |
| 6 | `isPrint` | 是否Print | `is_print` | Integer | `int` |  | true |
| 7 | `isEdit` | 是否Edit | `is_edit` | Integer | `int` |  | true |
| 8 | `isBatchApproval` | 是否BatchApproval | `is_batch_approval` | Integer | `int` |  | true |
| 9 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |
| 11 | `billTypeId` | 单据类型ID | `bill_type_id` | String | `text` |  | true |
| 12 | `applicationCode` | application编码 | `applicationCode` | String | `text` |  | true |
| 13 | `billType` | 单据类型 | `bill_type` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` |  | true |
| 14 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 15 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 16 | `extendAttr` | extendAttr | `extend_attr` | String | `text` |  | true |
| 17 | `iorder` | order(ID) | `iorder` | String | `text` |  | true |
| 18 | `microServiceCode` | microService编码 | `micro_service_code` | String | `text` |  | true |
| 19 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 20 | `phase` | phase | `phase` | 3f2e9232-2847-4633-80b9-aca6a9a01d5d | `quote` |  | true |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 22 | `sourceId` | sourceId | `sourceid` | String | `text` |  | true |
| 23 | `stepLevel` | stepLevel | `step_level` | Integer | `int` |  | true |
| 24 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 25 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 26 | `ytenantId` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（6 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `phase` | phase | `bd.businessstep.BusinessPhase` | `phase` | 外键 |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 4 | `billType` | 单据类型 | `bd.bill.BillTypeVO` | `bill_type` | 外键 |  |  | None |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 6 | `ytenantId` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, step_code, step_name, step_status, is_business_take, is_print, is_edit, is_batch_approval
FROM bd_business_step
```