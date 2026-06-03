---
tags: [BIP, 元数据, 数据字典, tlm.financein.FinanceInInvestors]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资人子表 (`tlm.financein.FinanceInInvestors`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financein_investors` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资人子表 |
| 物理表 | `tlm_financein_investors` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 33 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `investors_define_character` | `` |
| `investor` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobj_Ref` |
| `mainid` | `` |
| `protocol_currency` | `ucfbasedoc.bd_currencytenantref` |
| `investor_type` | `yonbip-fi-ctmtmsp.tmsp_fundbusinobject_typeRef` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`

## 字段列表（按类型分组）

> 共 33 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `personincharge` | `personincharge` | `personincharge` | 负责人 |
| `investorscphone` | `investorscphone` | `investorscphone` | 联系电话 |
| `investorscremard` | `investorscremard` | `investorscremard` | 备注 |
| `occupysx` | `occupysx` | `occupySX` | 是否占用授信 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `beiyong1` | `beiyong1` | `beiyong1` | 备用1 |
| `beiyong2` | `beiyong2` | `beiyong2` | 备用2 |
| `beiyong3` | `beiyong3` | `beiyong3` | 备用3 |
| `` | `code` | `code` | 编码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mainid` | `mainid` | `mainid` | 融入登记主表id |
| `investor_type` | `investor_type` | `investortype` | 投资人机构类型ID |
| `investor` | `investor` | `investorid` | 投资人id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `underwriter_amountxy` | `underwriter_amountxy` | `investorAmountXY` | 投资金额（协议币种） |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `investors_define_character` | `investors_define_character` | `financeInInvestorsCharacterDef` | 投资人子表特征 |
