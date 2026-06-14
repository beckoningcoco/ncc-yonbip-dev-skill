---
tags: [BIP, 元数据, 数据字典, EIA.OSMOPENING.OsmOpeningGrandFiEventVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 委外发料期初分项信息 (`EIA.OSMOPENING.OsmOpeningGrandFiEventVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b_x_account_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`c556ed43-38a4-4b65-a216-8c64c74478a8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 委外发料期初分项信息 |
| 物理表 | `ia_ledger_b_x_account_b` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 115 个 |
| 子表 | 0 个 |
| 关联引用 | 17 个 |

## 关联引用 (17个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `component_id` | `fiepub.epub_component_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `pur2prd_cost_element_id` | `fiepub.fiepub_accsubjectref` |
| `header_id` | `` |
| `detail_id` | `` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 115 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |
| `cost_element_id` | `cost_element_id` | `costElementId` | 成本要素 |
| `accbook_cost_source_memo` | `accbook_cost_source_memo` | `accbookCostSourceMemo` | 账簿本币成本来源描述 |
| `accbook_cost_form` | `accbook_cost_form` | `accbookCostForm` | 账簿本币成本组成 |
| `org_cost_source_memo` | `org_cost_source_memo` | `orgCostSourceMemo` | 组织本币成本来源描述 |
| `org_cost_form` | `org_cost_form` | `orgCostForm` | 组织本币成本组成 |
| `group_cost_source_memo` | `group_cost_source_memo` | `groupCostSourceMemo` | 集团本币成本来源描述 |
| `group_cost_form` | `group_cost_form` | `groupCostForm` | 集团本币成本组成 |
| `global_cost_source_memo` | `global_cost_source_memo` | `globalCostSourceMemo` | 全局本币成本来源描述 |
| `global_cost_form` | `global_cost_form` | `globalCostForm` | 全局本币成本组成 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `control_cost_form` | `control_cost_form` | `controlCostForm` | 管控范围本币成本组成 |
| `control_cost_source` | `control_cost_source` | `controlCostSource` | 管控范围本币成本来源 |
| `control_cost_source_memo` | `control_cost_source_memo` | `controlCostSourceMemo` | 管控范围本币成本来源描述 |
| `id` | `id` | `id` | id |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` |  会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `period_id` | `period_id` | `period` | 记账会计期间id |
| `component_id` | `component_id` | `componentId` | 组件 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 账簿本币 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织本币 |
| `group_currtype_id` | `group_currtype_id` | `groupCurrtypeId` | 集团本币 |
| `global_currtype_id` | `global_currtype_id` | `globalCurrtypeId` | 全局本币 |
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `control_currtype_id` | `control_currtype_id` | `controlCurrtypeId` | 管控范围本币 |
| `detail_id` | `detail_id` | `detail` | 委外发料期初综合信息 |
| `header_id` | `header_id` | `header` | 委外发料期初综合信息id |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `pur2prd_cost_element_id` | `pur2prd_cost_element_id` | `pur2prdCostElementId` | 采购转生产要素 |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 枚举字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_cost_source` | `accbook_cost_source` | `accbookCostSource` | 账簿本币成本来源 |
| `org_cost_source` | `org_cost_source` | `orgCostSource` | 组织本币成本来源 |
| `group_cost_source` | `group_cost_source` | `groupCostSource` | 集团本币成本来源 |
| `global_cost_source` | `global_cost_source` | `globalCostSource` | 全局本币成本来源 |
| `compute_method` | `compute_method` | `computeMethod` | 计算方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (74个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `num` | `num` | `num` | 数量 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币单价 |
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币金额 |
| `accbook_std_price` | `accbook_std_price` | `accbookStdPrice` | 账簿本币标准单价 |
| `accbook_std_amount` | `accbook_std_amount` | `accbookStdAmount` | 账簿本币标准金额 |
| `accbook_ipv_rate_dif` | `accbook_ipv_rate_dif` | `accbookIpvRateDiff` | 账簿本币结算汇差 |
| `accbook_ppd_dif` | `accbook_ppd_dif` | `accbookPpdDiff` | 账簿本币生产价格差异 |
| `accbook_busi_dif` | `accbook_busi_dif` | `accbookBusiDiff` | 账簿本币业务差异 |
| `accbook_this_cost_price` | `accbook_this_cost_price` | `accbookThisCostPrice` | 账簿本币本层成本单价 |
| `accbook_this_cost_amount` | `accbook_this_cost_amount` | `accbookThisCostAmount` | 账簿本币本层成本金额 |
| `accbook_this_std_price` | `accbook_this_std_price` | `accbookThisStdPrice` | 账簿本币本层标准单价 |
| `accbook_this_std_amount` | `accbook_this_std_amount` | `accbookThisStdAmount` | 账簿本币本层标准金额 |
| `accbook_this_ppd_dif` | `accbook_this_ppd_dif` | `accbookThisPpdDiff` | 账簿本币本层生产价格差异 |
| `accbook_this_busi_dif` | `accbook_this_busi_dif` | `accbookThisBusiDiff` | 账簿本币本层业务差异 |
| `accbook_ipv_dif` | `accbook_ipv_dif` | `accbookIpvDiff` | 账簿本币结算价差 |
| `accbook_reserv_dif1` | `accbook_reserv_dif1` | `accbookReservDiff1` | 账簿本币预留差异1 |
| `accbook_reserv_dif2` | `accbook_reserv_dif2` | `accbookReservDiff2` | 账簿本币预留差异2 |
| `org_price` | `org_price` | `orgPrice` | 组织本币单价 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币金额 |
| `org_std_price` | `org_std_price` | `orgStdPrice` | 组织本币标准单价 |
| `org_std_amount` | `org_std_amount` | `orgStdAmount` | 组织本币标准金额 |
| `org_ipv_dif` | `org_ipv_dif` | `orgIpvDiff` | 组织本币结算价差 |
| `org_ipv_rate_dif` | `org_ipv_rate_dif` | `orgIpvRateDiff` | 组织本币结算汇差 |
| `org_ppd_dif` | `org_ppd_dif` | `orgPpdDiff` | 组织本币生产价格差异 |
| `org_busi_dif` | `org_busi_dif` | `orgBusiDiff` | 组织本币业务差异 |
| `org_this_cost_price` | `org_this_cost_price` | `orgThisCostPrice` | 组织本币本层成本单价 |
| `org_this_cost_amount` | `org_this_cost_amount` | `orgThisCostAmount` | 组织本币本层成本金额 |
| `org_this_std_price` | `org_this_std_price` | `orgThisStdPrice` | 组织本币本层标准单价 |
| `org_this_std_amount` | `org_this_std_amount` | `orgThisStdAmount` | 组织本币本层标准金额 |
| `org_this_ppd_dif` | `org_this_ppd_dif` | `orgThisPpdDiff` | 组织本币本层生产价格差异 |
| `org_this_busi_dif` | `org_this_busi_dif` | `orgThisBusiDiff` | 组织本币本层业务差异 |
| `org_reserv_dif1` | `org_reserv_dif1` | `orgReservDiff1` | 组织本币预留差异1 |
| `org_reserv_dif2` | `org_reserv_dif2` | `orgReservDiff2` | 组织本币预留差异2 |
| `group_price` | `group_price` | `groupPrice` | 集团本币单价 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币金额 |
| `group_std_price` | `group_std_price` | `groupStdPrice` | 集团本币标准单价 |
| `group_std_amount` | `group_std_amount` | `groupStdAmount` | 集团本币标准金额 |
| `group_ipv_rate_dif` | `group_ipv_rate_dif` | `groupIpvRateDiff` | 集团本币结算汇差 |
| `group_ipv_dif` | `group_ipv_dif` | `groupIpvDiff` | 集团本币结算价差 |
| `group_ppd_dif` | `group_ppd_dif` | `groupPpdDiff` | 集团本币生产价格差异 |
| `group_busi_dif` | `group_busi_dif` | `groupBusiDiff` | 集团本币业务差异 |
| `group_this_cost_price` | `group_this_cost_price` | `groupThisCostPrice` | 集团本币本层成本单价 |
| `group_this_cost_amount` | `group_this_cost_amount` | `groupThisCostAmount` | 集团本币本层成本金额 |
| `group_this_std_price` | `group_this_std_price` | `groupThisStdPrice` | 集团本币本层标准单价 |
| `group_this_std_amount` | `group_this_std_amount` | `groupThisStdAmount` | 集团本币本层标准金额 |
| `group_this_ppd_dif` | `group_this_ppd_dif` | `groupThisPpdDiff` | 集团本币本层生产价格差异 |
| `group_this_busi_dif` | `group_this_busi_dif` | `groupThisBusiDiff` | 集团本币本层业务差异 |
| `group_reserv_dif1` | `group_reserv_dif1` | `groupReservDiff1` | 集团本币预留差异1 |
| `group_reserv_dif2` | `group_reserv_dif2` | `groupReservDiff2` | 集团本币预留差异2 |
| `global_price` | `global_price` | `globalPrice` | 全局本币单价 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币金额 |
| `global_std_price` | `global_std_price` | `globalStdPrice` | 全局本币标准单价 |
| `global_std_amount` | `global_std_amount` | `globalStdAmount` | 全局本币标准金额 |
| `global_ipv_rate_dif` | `global_ipv_rate_dif` | `globalIpvRateDiff` | 全局本币结算汇差 |
| `global_ipv_dif` | `global_ipv_dif` | `globalIpvDiff` | 全局本币结算价差 |
| `global_ppd_dif` | `global_ppd_dif` | `globalPpdDiff` | 全局本币生产价格差异 |
| `global_busi_dif` | `global_busi_dif` | `globalBusiDiff` | 全局本币业务差异 |
| `global_this_cost_price` | `global_this_cost_price` | `globalThisCostPrice` | 全局本币本层成本单价 |
| `global_this_cost_amount` | `global_this_cost_amount` | `globalThisCostAmount` | 全局本币本层成本金额 |
| `global_this_std_price` | `global_this_std_price` | `globalThisStdPrice` | 全局本币本层标准单价 |
| `global_this_std_amount` | `global_this_std_amount` | `globalThisStdAmount` | 全局本币本层标准金额 |
| `global_this_ppd_dif` | `global_this_ppd_dif` | `globalThisPpdDiff` | 全局本币本层生产价格差异 |
| `global_this_busi_dif` | `global_this_busi_dif` | `globalThisBusiDiff` | 全局本币本层业务差异 |
| `global_reserv_dif1` | `global_reserv_dif1` | `globalReservDiff1` | 全局本币预留差异1 |
| `global_reserv_dif2` | `global_reserv_dif2` | `globalReservDiff2` | 全局本币预留差异2 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币金额 |
| `control_busi_dif` | `control_busi_dif` | `controlBusiDiff` | 管控范围本币业务差异 |
| `control_ipv_dif` | `control_ipv_dif` | `controlIpvDiff` | 管控范围本币结算价差 |
| `control_ipv_rate_dif` | `control_ipv_rate_dif` | `controlIpvRateDiff` | 管控范围本币结算汇差 |
| `control_price` | `control_price` | `controlPrice` | 管控范围本币单价 |
| `control_reserv_dif1` | `control_reserv_dif1` | `controlReservDiff1` | 管控范围本币预留差异1 |
| `control_reserv_dif2` | `control_reserv_dif2` | `controlReservDiff2` | 管控范围本币预留差异2 |
| `control_std_amount` | `control_std_amount` | `controlStdAmount` | 管控范围本币标准金额 |
| `control_std_price` | `control_std_price` | `controlStdPrice` | 管控范围本币标准单价 |
