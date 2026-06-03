---
tags: [BIP, 元数据, 数据字典, tmsp.fundbusinobjarchives.FundBusinObjArchives]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资金业务伙伴 (`tmsp.fundbusinobjarchives.FundBusinObjArchives`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tmsp_fundbusinobj_archives` | domain：`yonbip-fi-ctmtmsp` | 应用：`TMSP` | 业务对象ID：`86d0f3de-b64f-43e9-9f07-52b7afcf541f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资金业务伙伴 |
| 物理表 | `tmsp_fundbusinobj_archives` |
| 数据库 schema | `yonbip-fi-ctmtmsp` |
| 所属应用 | `TMSP` |
| 直连字段 | 44 个 |
| 关联引用 | 15 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `corporateTradingAccoInfoList` | `tmsp.fundbusinobjarchives.CorporateTradingAccoInfo` | composition |
| `fundBusinObjArchivesItem` | `tmsp.fundbusinobjarchives.FundBusinObjArchivesItem` | composition |

## 关联引用 (15个)

| 字段名 | 引用类型 |
|--------|---------|
| `parent_id` | `` |
| `country_region` | `ucfbasedoc.bd_countryref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accentity_manage` | `ucf-org-center.bd_fundsorg` |
| `biz_partner` | `productcenter.base_businesspartnerref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity` | `ucf-org-center.org_pure_tree_ref_mv` |
| `openaccountbank_id` | `ucfbasedoc.bd_bankdotref` |
| `character_define` | `` |
| `` | `` |
| `bank_id` | `ucfbasedoc.bd_bankcard` |
| `fundbusinobjtype_id` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `settlement_center` | `ucf-org-center.bd_settlementorg` |

## 继承接口 (6个, 16字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **档案状态** (`iuap.busiObj.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **树型结构** (`iuap.busiObj.ITree`)
  - `ifend` → `ifend`
  - `level` → `level`
  - `name` → `name`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`

## 字段列表（按类型分组）

> 共 44 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `contact_number` | `contact_number` | String | 联系电话 |
| `email` | `email` | String | 邮箱 |
| `ext` | `ext` | String | ext |
| `id_number` | `id_number` | String | 证件号 |
| `name` | `name` | String | 节点标题 |
| `unified_social_credit_code` | `unified_social_credit_code` | String | 统一社会信用代码 |
| `code` | `code` | String | 编码 |
| `id` | `id` | String | 主键 |
| `path` | `path` | String | 路径 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accentity` | `accentity` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 | 资金组织 |
| `accentity_manage` | `accentity_manage` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | 管理组织 |
| `bank_id` | `bank_id` | b7ee7189-ed97-48d5-91e4-808228664429 | 银行类别id |
| `biz_partner` | `biz_partner` | c1627369-6457-4828-883d-756b79bd0f46 | 业务伙伴 |
| `country_region` | `country_region` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | 国家地区 |
| `fundbusinobjtype_id` | `fundbusinobjtype_id` | a1d6f36f-1ea8-46c7-a409-d38a0f14c292 | 资金业务伙伴类型 |
| `openaccountbank_id` | `openaccountbank_id` | 47a69dfe-37ef-4ad1-aa19-1d61797a7821 | 银行网点 |
| `parent_id` | `parent_id` | e969728a-efe8-49db-86b0-5f8e18c2f098 | 上级分类 |
| `settlement_center` | `settlement_center` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | 结算中心 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `vouchdate` | `vouchdate` | String | 单据日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `create_time` | `create_time` | DateTime | 创建时间 |
| `disablets` | `disablets` | DateTime | 停用时间 |
| `enablets` | `enablets` | DateTime | 启用时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enabled` | `enabled` | Boolean | 启停用状态 |
| `isprivated` | `isprivated` | Boolean | 是否对私 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enable` | `enable` | sys_intboolean | 档案状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `billtype` | `billtype` | Integer | 单据类型 |
| `level` | `level` | Integer | 层级 |
| `sort_num` | `sort_num` | Integer | 排序号 |

### 短整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `event_type` | `event_type` | Short | 事项类型 |
| `isEnd` | `isEnd` | Short | 是否末级 |
| `srcitem` | `srcitem` | Short | 事项来源 |
| `dr` | `dr` | Short | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `character_define` | `character_define` | 6105be7c-3688-47ed-950c-36900e7fba7f | 自定义特征 |

### multiLanguage (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `contact` | `contact` | String | 联系人 |
| `fundbusinobjtype_name` | `fundbusinobjtype_name` | String | 资金业务伙伴名称 |
| `remark` | `remark` | String | 备注 |
| `uses` | `uses` | String | 用途 |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 830d7acb-de31-40cd-9b6e-e0537f387767 | 企业交易账户信息 |
| `` | `` | c5eba128-e930-4602-897a-30d3a049390e | 伙伴银行信息 |
