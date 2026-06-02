---
tags: [BIP, 元数据, 数据字典, bd, bd.receivables.ReceiveAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 收款协议 (`bd.receivables.ReceiveAgreement`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_receiveagreement` | 应用: `DPMSETL` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款协议 |
| 物理表 | `bd_receiveagreement` |
| 应用 | `DPMSETL` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 部署信息

- 部署时间: 2026-05-22 22:42:59:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-basedoc_basedoc/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202603251024_metadata_bd-receivables.zip`

## 术语标记

`DirectConnection`, `doc`, `MasterData`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| IAuto编码 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（31 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `receivableDates` | receivableDates | `` | b37834b0-e14a-4e04-a408-adb2e1556244 | `` |  |  |
| 2 | `id` | 主键ID | `id` | Long | `long` |  |  |
| 3 | `orgId` | 组织ID | `manageorg` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  |  |
| 4 | `code` | 编码 | `cCode` | String | `text` |  | true |
| 5 | `name` | 名称 | `cName` | String | `multiLanguage` |  |  |
| 6 | `objid` | objid | `objid` | String | `text` |  |  |
| 7 | `enableStartDate` | enableStartDate(日期) | `enablestartdate` | Date | `date` |  |  |
| 8 | `enableEndDate` | enableEndDate(日期) | `enableenddate` | Date | `date` |  |  |
| 9 | `instalment` | nstalment(ID) | `instalment` | Boolean | `switch` |  |  |
| 10 | `oadayConfirmType` | oadayConfirmType(类型) | `oadayConfirmType` | Integer | `int` |  |  |
| 11 | `expiredayConfirmType` | expiredayConfirmType(类型) | `expiredayConfirmType` | Integer | `int` |  |  |
| 12 | `comment` | omment | `cComment` | String | `text` |  |  |
| 13 | `preReceiveType` | preReceiveType(类型) | `prereceivetype` | Integer | `int` |  |  |
| 14 | `orgGroupId` | orgGroupId | `org_group_id` | 44210b7f-0ffa-4cf9-be11-8fdfa006a2ae | `quote` |  |  |
| 15 | `interestRate` | nterestRate(ID) | `interestrate` | Decimal | `number` |  |  |
| 16 | `order` | order | `iorder` | Integer | `int` |  |  |
| 17 | `servicecount` | servicecount | `servicecount` | Decimal | `number` |  |  |
| 18 | `enable` | enable | `enable` | Integer | `int` |  |  |
| 19 | `sysid` | sysid | `sysid` | String | `text` |  |  |
| 20 | `defineCharacter` | efineCharacter(日期) | `defineCharacter` | 9bceaf74-4dec-43da-86a1-13fa9dec7a6d | `UserDefine` |  |  |
| 21 | `log` | log | `log` | String | `text` |  |  |
| 22 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  |  |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  |  |
| 24 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 25 | `tenant` | tenant | `tenantid` | String | `text` |  |  |
| 26 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 27 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 28 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 29 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 30 | `defines` | efines(日期) | `` | abea197f-a3ab-4519-b585-7c993501132c | `` |  |  |
| 31 | `execStatus` | execStatus(状态) | `exec_status` | String | `text` |  | true |

## 关联属性（8 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `orgGroupId` | orgGroupId | `bd.puborggroup.PubOrgGroup` | `org_group_id` | 外键 |  |  | None |  |
| 4 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 5 | `defineCharacter` | efineCharacter(日期) | `bd.receivables.ReceiveAgreementDefineCharacter` | `defineCharacter` | 外键 |  |  | None |  |
| 6 | `orgId` | 组织ID | `org.func.BaseOrg` | `manageorg` | 外键 |  |  | Service |  |
| 7 | `defines` | efines(日期) | `bd.receivables.ReceiveAgreementDefine` | `` | defines → id | 1 | Y | None |  |
| 8 | `receivableDates` | receivableDates | `bd.receivables.ReceivableDate` | `` | receivableDates → receiveAgreement | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT id, manageorg, cCode, cName, objid, enablestartdate, enableenddate, instalment
FROM bd_receiveagreement
```