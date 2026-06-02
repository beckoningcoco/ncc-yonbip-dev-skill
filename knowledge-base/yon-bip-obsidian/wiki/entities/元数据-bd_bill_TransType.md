---
tags: [BIP, 元数据, 数据字典, bd, bd.bill.TransType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 交易类型 (`bd.bill.TransType`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_transtype` | 应用: `BMMMM` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易类型 |
| 物理表 | `bd_transtype` |
| 应用 | `BMMMM` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-23 22:42:40:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0005_iuap-apdoc-basedoc_transtype/0010_iuap_common/DML/0270_iuap_metadata/20260115-itr/202512191732_metadata_bd-bill.zip`

## 术语标记

`ConfigData`, `isMain`, `report`, `use_translate_server`, `doc`, `DirectConnection`, `state_tag`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| ISocialMcType(类型) (`ISocialMcType`) | `bd.social.ISocialMcType` | 977 | 3 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（38 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 2 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 3 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 4 | `datatype` | atatype(日期) | `datatype` | String | `text` | false | true |
| 5 | `serviceCodeMobile` | serviceCodeMobile | `service_code_mobile` | String | `text` | false | true |
| 6 | `dr` | 逻辑删除 | `dr` | Integer | `int` | false | true |
| 7 | `enable` | enable | `enable` | Integer | `int` | false | true |
| 8 | `extend_attrs_json` | extend_attrs_json | `extend_attrs_json` | String | `text` | false | true |
| 9 | `is_nosupport_transtypadd` | 是否_nosupport_transtypadd | `is_nosupport_transtypadd` | Integer | `int` | false | true |
| 10 | `is_nosupport_transtypdel` | 是否_nosupport_transtypdel | `is_nosupport_transtypdel` | Integer | `int` | false | true |
| 11 | `is_nosupport_transtypmodify` | 是否_nosupport_transtypmodify | `is_nosupport_transtypmodify` | Integer | `int` | false | true |
| 12 | `is_nosupport_transtyprefmodify` | 是否_nosupport_transtyprefmodify | `is_nosupport_transtyprefmodify` | Integer | `int` | false | true |
| 13 | `isSupportPublishMenuMobile` | 是否SupportPublishMenuMobile | `is_support_publish_menu_mobile` | Integer | `int` | false | true |
| 14 | `is_publish` | 是否_publish | `is_publish` | Integer | `int` | false | true |
| 15 | `isPublishMobile` | 是否PublishMobile | `is_publish_mobile` | Integer | `int` | false | true |
| 16 | `is_support_publish_menu` | 是否_support_publish_menu | `is_support_publish_menu` | Integer | `int` | false | true |
| 17 | `log` | log | `log` | String | `text` | false | true |
| 18 | `printAfterApproval` | printAfterApproval | `print_after_approval` | Integer | `int` | false | true |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` | false | true |
| 20 | `sourceid` | sourceid | `sourceid` | String | `text` | false | true |
| 21 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 22 | `tenant` | tenant | `tenantid` | String | `text` | false | true |
| 23 | `billtype_id` | billtype_id | `billtype_id` | 4a227650-b866-4f4c-a6ca-2433297a1713 | `quote` | false | true |
| 24 | `code` | 编码 | `code` | String | `text` | false | true |
| 25 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 26 | `service_code` | service编码 | `service_code` | String | `text` | false | true |
| 27 | `is_support_workflow` | 是否_support_workflow | `is_support_workflow` | Integer | `int` | false | true |
| 28 | `default` | efault(日期) | `default` | String | `text` | false | true |
| 29 | `id` | 主键ID | `id` | String | `text` |  | true |
| 30 | `memo` | 备注 | `memo` | String | `multiLanguage` | false | true |
| 31 | `preset` | preset | `preset` | Integer | `int` | false | true |
| 32 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 33 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 34 | `microServiceCode` | microService编码 | `micro_service_code` | String | `text` | false | true |
| 35 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 36 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 37 | `shareType` | 分摊类型 | `share_type` | Integer | `int` | false | true |
| 38 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（4 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 4 | `billtype_id` | billtype_id | `bd.bill.BillTypeVO` | `billtype_id` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT social_mctype, social_srcid, social_tenantid, datatype, service_code_mobile, dr, enable, extend_attrs_json
FROM bd_transtype
```