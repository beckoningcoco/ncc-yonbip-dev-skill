---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.FifoOutAdjustInfoVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 先进先出出库调整信息 (`FIEIA.FIEIA.FifoOutAdjustInfoVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_fifo_out_adjust_info` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`95ee7300-7f14-4743-b99e-a614b81eeafb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 先进先出出库调整信息 |
| 物理表 | `ia_fifo_out_adjust_info` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 45 个 |
| 子表 | 0 个 |
| 关联引用 | 18 个 |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `adjust_period_id` | `finbd.bd_period` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `inventory_obj_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `in_period_id` | `finbd.bd_period` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |
| `out_period_id` | `finbd.bd_period` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 45 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `in_period_code` | `in_period_code` | `inPeriodCode` | 入库会计期间编码 |
| `out_ledger_body_id` | `out_ledger_body_id` | `outLedgerBodyId` | 出库子表 |
| `in_ledger_body_id` | `in_ledger_body_id` | `inLedgerBodyId` | 入库子表 |
| `adjust_ledger_body_id` | `adjust_ledger_body_id` | `adjustLedgerBodyId` | 调整单明细id |
| `out_period_code` | `out_period_code` | `outPeriodCode` | 出库会计期间编码 |
| `adjust_ledger_id` | `adjust_ledger_id` | `adjustLedgerId` | 调整单主表id |
| `adjust_sort_no` | `adjust_sort_no` | `adjustSortNo` | 调整单序号 |
| `adjust_period_code` | `adjust_period_code` | `adjustPeriodCode` | 调整单会计期间编码 |
| `out_sort_no` | `out_sort_no` | `outSortNo` | 出库序号 |
| `in_sort_no` | `in_sort_no` | `inSortNo` | 入库序号 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控本币币种 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币币种 |
| `in_period_id` | `in_period_id` | `inPeriod` | 入库会计期间 |
| `out_period_id` | `out_period_id` | `outPeriod` | 出库会计期间 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `cost_domain_id` | `cost_domain_id` | `costDomainId` | 成本域(租户) |
| `adjust_period_id` | `adjust_period_id` | `adjustPeriod` | 调整单会计期间 |
| `accbook_id` | `accbook_id` | `accbook` | 核算账簿 |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币币种 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币币种 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `period_id` | `period_id` | `period` | 记账会计期间id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_last_in` | `bln_last_in` | `blnLastIn` | 入库最后一笔 |
| `bln_appoint` | `bln_appoint` | `blnAppoint` | 出库指定成本 |
| `bln_last_out` | `bln_last_out` | `blnLastOut` | 出库最后一笔 |
| `bln_pair` | `bln_pair` | `blnPair` | 出库成对 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rollup_level` | `rollup_level` | `rollupLevel` | 卷积层级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_adjust_amount` | `org_adjust_amount` | `orgAdjustAmount` | 组织本币调整金额 |
| `accbook_adjust_amount` | `accbook_adjust_amount` | `accbookAdjustAmount` | 账簿本币调整金额 |
| `control_adjust_amount` | `control_adjust_amount` | `controlAdjustAmount` | 管控本币调整金额 |
| `global_adjust_amount` | `global_adjust_amount` | `globalAdjustAmount` | 全局本币调整金额 |
| `group_adjust_amount` | `group_adjust_amount` | `groupAdjustAmount` | 集团本币调整金额 |
