---
tags: [BIP, 元数据, 数据字典, FIEIA.FIEIA.SaleCostCarryAdjustCostElemVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 销售成本结转调整分项信息 (`FIEIA.FIEIA.SaleCostCarryAdjustCostElemVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_ledger_b_x_sgaccount_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`6e9d25f2-68a0-40c2-a824-8aac441a8b16`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售成本结转调整分项信息 |
| 物理表 | `ia_ledger_b_x_sgaccount_b` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 175 个 |
| 子表 | 0 个 |
| 关联引用 | 15 个 |

## 关联引用 (15个)

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
| `detail_id` | `` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 175 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` |  记账会计期间 |
| `cost_element_id` | `cost_element_id` | `costElementId` | 成本要素 |
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `id` | `id` | `id` | id |
| `accbook_cost_form` | `accbook_cost_form` | `accbookCostForm` | 账簿本币成本组成 |
| `accbook_cost_source_memo` | `accbook_cost_source_memo` | `accbookCostSourceMemo` | 账簿本币成本来源描述 |
| `control_cost_form` | `control_cost_form` | `controlCostForm` | 管控范围本币成本组成 |
| `control_cost_source_memo` | `control_cost_source_memo` | `controlCostSourceMemo` | 管控范围本币成本来源描述 |
| `global_cost_form` | `global_cost_form` | `globalCostForm` | 全局本币成本组成 |
| `global_cost_source_memo` | `global_cost_source_memo` | `globalCostSourceMemo` | 全局本币成本来源描述 |
| `group_cost_form` | `group_cost_form` | `groupCostForm` | 集团本币成本组成 |
| `group_cost_source_memo` | `group_cost_source_memo` | `groupCostSourceMemo` | 集团本币成本来源描述 |
| `org_cost_form` | `org_cost_form` | `orgCostForm` | 组织本币成本组成 |
| `org_cost_source_memo` | `org_cost_source_memo` | `orgCostSourceMemo` | 组织本币成本来源描述 |

### 引用字段 (15个)

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
| `detail_id` | `detail_id` | `detail` | 销售成本结转调整综合信息 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 枚举字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_cost_source` | `accbook_cost_source` | `accbookCostSource` | 账簿本币成本来源 |
| `org_cost_source` | `org_cost_source` | `orgCostSource` | 组织本币成本来源 |
| `group_cost_source` | `group_cost_source` | `groupCostSource` | 集团本币成本来源 |
| `global_cost_source` | `global_cost_source` | `globalCostSource` | 全局本币成本来源 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (138个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `num` | `num` | `num` | 数量 |
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币成本单价 |
| `accbook_amount` | `accbook_amount` | `accbookAmount` | 账簿本币成本金额 |
| `accbook_std_price` | `accbook_std_price` | `accbookStdPrice` | 账簿本币标准单价 |
| `accbook_std_amount` | `accbook_std_amount` | `accbookStdAmount` | 账簿本币标准金额 |
| `accbook_balance_amount` | `accbook_balance_amount` | `accbookBalanceAmount` | 账簿本币结余金额 |
| `org_price` | `org_price` | `orgPrice` | 组织本币成本单价 |
| `org_amount` | `org_amount` | `orgAmount` | 组织本币成本金额 |
| `org_std_price` | `org_std_price` | `orgStdPrice` | 组织本币标准单价 |
| `org_std_amount` | `org_std_amount` | `orgStdAmount` | 组织本币标准金额 |
| `org_balance_amount` | `org_balance_amount` | `orgBalanceAmount` | 组织本币结余金额 |
| `group_price` | `group_price` | `groupPrice` | 集团本币成本单价 |
| `group_amount` | `group_amount` | `groupAmount` | 集团本币成本金额 |
| `group_std_price` | `group_std_price` | `groupStdPrice` | 集团本币标准单价 |
| `group_std_amount` | `group_std_amount` | `groupStdAmount` | 集团本币标准金额 |
| `group_balance_amount` | `group_balance_amount` | `groupBalanceAmount` | 集团本币结余金额 |
| `global_price` | `global_price` | `globalPrice` | 全局本币成本单价 |
| `global_amount` | `global_amount` | `globalAmount` | 全局本币成本金额 |
| `global_std_price` | `global_std_price` | `globalStdPrice` | 全局本币标准单价 |
| `global_std_amount` | `global_std_amount` | `globalStdAmount` | 全局本币标准金额 |
| `global_balance_amount` | `global_balance_amount` | `globalBalanceAmount` | 全局本币结余金额 |
| `balance_num` | `balance_num` | `balanceNum` | 结余数量 |
| `control_amount` | `control_amount` | `controlAmount` | 管控范围本币成本金额 |
| `control_balance_amount` | `control_balance_amount` | `controlBalanceAmount` | 管控范围本币结余金额 |
| `control_price` | `control_price` | `controlPrice` | 管控范围本币成本单价 |
| `control_std_amount` | `control_std_amount` | `controlStdAmount` | 管控范围本币标准金额 |
| `control_std_price` | `control_std_price` | `controlStdPrice` | 管控范围本币标准单价 |
| `accbook_balance_busi_dif` | `accbook_balance_busi_dif` | `accbookBalanceBusiDif` | 账簿本币结余业务差异 |
| `accbook_balance_ipv_dif` | `accbook_balance_ipv_dif` | `accbookBalanceIpvDif` | 账簿本币结余结算差异 |
| `accbook_balance_ipv_rate_dif` | `accbook_balance_ipv_rate_dif` | `accbookBalanceIpvRateDif` | 账簿本币结余汇率差异 |
| `accbook_balance_ppd_dif` | `accbook_balance_ppd_dif` | `accbookBalancePpdDif` | 账簿本币结余生产差异 |
| `accbook_balance_std_amount` | `accbook_balance_std_amount` | `accbookBalanceStdAmount` | 账簿本币结余标准金额 |
| `accbook_balance_this_busi_dif` | `accbook_balance_this_busi_dif` | `accbookBalanceThisBusiDif` | 账簿本币结余本层业务差异 |
| `accbook_balance_this_cost_amount` | `accbook_balance_this_cost_amount` | `accbookBalanceThisCostAmount` | 账簿本币结余本层金额 |
| `accbook_balance_this_ppd_dif` | `accbook_balance_this_ppd_dif` | `accbookBalanceThisPpdDif` | 账簿本币结余本层生产差异 |
| `accbook_balance_this_std_amount` | `accbook_balance_this_std_amount` | `accbookBalanceThisStdAmount` | 账簿本币结余本层标准金额 |
| `accbook_busi_dif` | `accbook_busi_dif` | `accbookBusiDif` | 账簿本币业务差异 |
| `accbook_ipv_dif` | `accbook_ipv_dif` | `accbookIpvDif` | 账簿本币结算差异 |
| `accbook_ipv_rate_dif` | `accbook_ipv_rate_dif` | `accbookIpvRateDif` | 账簿本币汇率差异 |
| `accbook_ppd_dif` | `accbook_ppd_dif` | `accbookPpdDif` | 账簿本币生产价格差异 |
| `accbook_reserv_dif1` | `accbook_reserv_dif1` | `accbookReservDif1` | 账簿本币预留差异1 |
| `accbook_reserv_dif2` | `accbook_reserv_dif2` | `accbookReservDif2` | 账簿本币预留差异2 |
| `accbook_settled_amount` | `accbook_settled_amount` | `accbookSettledAmount` | 账簿本币结算后金额 |
| `accbook_settled_price` | `accbook_settled_price` | `accbookSettledPrice` | 账簿本币结算后单价 |
| `accbook_this_balance_amount` | `accbook_this_balance_amount` | `accbookThisBalanceAmount` | 账簿本币本层结余金额 |
| `accbook_this_busi_dif` | `accbook_this_busi_dif` | `accbookThisBusiDif` | 账簿本币本层业务差异 |
| `accbook_this_cost_amount` | `accbook_this_cost_amount` | `accbookThisCostAmount` | 账簿本币本层成本金额 |
| `accbook_this_cost_price` | `accbook_this_cost_price` | `accbookThisCostPrice` | 账簿本币本层成本单价 |
| `accbook_this_ppd_dif` | `accbook_this_ppd_dif` | `accbookThisPpdDif` | 账簿本币本层生产价格差异 |
| `accbook_this_std_amount` | `accbook_this_std_amount` | `accbookThisStdAmount` | 账簿本币本层标准金额 |
| `accbook_this_std_price` | `accbook_this_std_price` | `accbookThisStdPrice` | 账簿本币本层标准单价 |
| `control_busi_dif` | `control_busi_dif` | `controlBusiDif` | 管控范围本币业务差异 |
| `control_ipv_dif` | `control_ipv_dif` | `controlIpvDif` | 管控范围本币结算差异 |
| `control_ipv_rate_dif` | `control_ipv_rate_dif` | `controlIpvRateDif` | 管控范围本币汇率差异 |
| `control_ppd_dif` | `control_ppd_dif` | `controlPpdDif` | 管控范围本币生产价格差异 |
| `control_reserv_dif1` | `control_reserv_dif1` | `controlReservDif1` | 管控范围本币预留差异1 |
| `control_reserv_dif2` | `control_reserv_dif2` | `controlReservDif2` | 管控范围本币预留差异2 |
| `control_settled_amount` | `control_settled_amount` | `controlSettledAmount` | 管控范围本币结算后金额 |
| `control_settled_price` | `control_settled_price` | `controlSettledPrice` | 管控范围本币结算后单价 |
| `control_this_balance_amount` | `control_this_balance_amount` | `controlThisBalanceAmount` | 管控范围本币本层结余金额 |
| `control_this_busi_dif` | `control_this_busi_dif` | `controlThisBusiDif` | 管控范围本币本层业务差异 |
| `control_this_cost_amount` | `control_this_cost_amount` | `controlThisCostAmount` | 管控范围本币本层成本金额 |
| `control_this_cost_price` | `control_this_cost_price` | `controlThisCostPrice` | 管控范围本币本层成本单价 |
| `control_this_ppd_dif` | `control_this_ppd_dif` | `controlThisPpdDif` | 管控范围本币本层生产价格差异 |
| `control_this_std_amount` | `control_this_std_amount` | `controlThisStdAmount` | 管控范围本币本层标准金额 |
| `control_this_std_price` | `control_this_std_price` | `controlThisStdPrice` | 管控范围本币本层标准单价 |
| `global_balance_busi_dif` | `global_balance_busi_dif` | `globalBalanceBusiDif` | 全局本币结余业务差异 |
| `global_balance_ipv_dif` | `global_balance_ipv_dif` | `globalBalanceIpvDif` | 全局本币结余结算差异 |
| `global_balance_ipv_rate_dif` | `global_balance_ipv_rate_dif` | `globalBalanceIpvRateDif` | 全局本币结余汇率差异 |
| `global_balance_ppd_dif` | `global_balance_ppd_dif` | `globalBalancePpdDif` | 全局本币结余生产差异 |
| `global_balance_std_amount` | `global_balance_std_amount` | `globalBalanceStdAmount` | 全局本币结余标准金额 |
| `global_balance_this_busi_dif` | `global_balance_this_busi_dif` | `globalBalanceThisBusiDif` | 全局本币结余本层业务差异 |
| `global_balance_this_cost_amount` | `global_balance_this_cost_amount` | `globalBalanceThisCostAmount` | 全局本币结余本层金额 |
| `global_balance_this_ppd_dif` | `global_balance_this_ppd_dif` | `globalBalanceThisPpdDif` | 全局本币结余本层生产差异 |
| `global_balance_this_std_amount` | `global_balance_this_std_amount` | `globalBalanceThisStdAmount` | 全局本币结余本层标准金额 |
| `global_busi_dif` | `global_busi_dif` | `globalBusiDif` | 全局本币业务差异 |
| `global_ipv_dif` | `global_ipv_dif` | `globalIpvDif` | 全局本币结算差异 |
| `global_ipv_rate_dif` | `global_ipv_rate_dif` | `globalIpvRateDif` | 全局本币汇率差异 |
| `global_ppd_dif` | `global_ppd_dif` | `globalPpdDif` | 全局本币生产价格差异 |
| `global_reserv_dif1` | `global_reserv_dif1` | `globalReservDif1` | 全局本币预留差异1 |
| `global_reserv_dif2` | `global_reserv_dif2` | `globalReservDif2` | 全局本币预留差异2 |
| `global_settled_amount` | `global_settled_amount` | `globalSettledAmount` | 全局本币结算后金额 |
| `global_settled_price` | `global_settled_price` | `globalSettledPrice` | 全局本币结算后单价 |
| `global_this_balance_amount` | `global_this_balance_amount` | `globalThisBalanceAmount` | 全局本币本层结余金额 |
| `global_this_busi_dif` | `global_this_busi_dif` | `globalThisBusiDif` | 全局本币本层业务差异 |
| `global_this_cost_amount` | `global_this_cost_amount` | `globalThisCostAmount` | 全局本币本层成本金额 |
| `global_this_cost_price` | `global_this_cost_price` | `globalThisCostPrice` | 全局本币本层成本单价 |
| `global_this_ppd_dif` | `global_this_ppd_dif` | `globalThisPpdDif` | 全局本币本层生产价格差异 |
| `global_this_std_amount` | `global_this_std_amount` | `globalThisStdAmount` | 全局本币本层标准金额 |
| `global_this_std_price` | `global_this_std_price` | `globalThisStdPrice` | 全局本币本层标准单价 |
| `group_balance_busi_dif` | `group_balance_busi_dif` | `groupBalanceBusiDif` | 集团本币结余业务差异 |
| `group_balance_ipv_dif` | `group_balance_ipv_dif` | `groupBalanceIpvDif` | 集团本币结余结算差异 |
| `group_balance_ipv_rate_dif` | `group_balance_ipv_rate_dif` | `groupBalanceIpvRateDif` | 集团本币结余汇率差异 |
| `group_balance_ppd_dif` | `group_balance_ppd_dif` | `groupBalancePpdDif` | 集团本币结余生产差异 |
| `group_balance_std_amount` | `group_balance_std_amount` | `groupBalanceStdAmount` | 集团本币结余标准金额 |
| `group_balance_this_busi_dif` | `group_balance_this_busi_dif` | `groupBalanceThisBusiDif` | 集团本币结余本层业务差异 |
| `group_balance_this_cost_amount` | `group_balance_this_cost_amount` | `groupBalanceThisCostAmount` | 集团本币结余本层金额 |
| `group_balance_this_ppd_dif` | `group_balance_this_ppd_dif` | `groupBalanceThisPpdDif` | 集团本币结余本层生产差异 |
| `group_balance_this_std_amount` | `group_balance_this_std_amount` | `groupBalanceThisStdAmount` | 集团本币结余本层标准金额 |
| `group_busi_dif` | `group_busi_dif` | `groupBusiDif` | 集团本币业务差异 |
| `group_ipv_dif` | `group_ipv_dif` | `groupIpvDif` | 集团本币结算差异 |
| `group_ipv_rate_dif` | `group_ipv_rate_dif` | `groupIpvRateDif` | 集团本币汇率差异 |
| `group_ppd_dif` | `group_ppd_dif` | `groupPpdDif` | 集团本币生产价格差异 |
| `group_reserv_dif1` | `group_reserv_dif1` | `groupReservDif1` | 集团本币预留差异1 |
| `group_reserv_dif2` | `group_reserv_dif2` | `groupReservDif2` | 集团本币预留差异2 |
| `group_settled_amount` | `group_settled_amount` | `groupSettledAmount` | 集团本币结算后金额 |
| `group_settled_price` | `group_settled_price` | `groupSettledPrice` | 集团本币结算后单价 |
| `group_this_balance_amount` | `group_this_balance_amount` | `groupThisBalanceAmount` | 集团本币本层结余金额 |
| `group_this_busi_dif` | `group_this_busi_dif` | `groupThisBusiDif` | 集团本币本层业务差异 |
| `group_this_cost_amount` | `group_this_cost_amount` | `groupThisCostAmount` | 集团本币本层成本金额 |
| `group_this_cost_price` | `group_this_cost_price` | `groupThisCostPrice` | 集团本币本层成本单价 |
| `group_this_ppd_dif` | `group_this_ppd_dif` | `groupThisPpdDif` | 集团本币本层生产价格差异 |
| `group_this_std_amount` | `group_this_std_amount` | `groupThisStdAmount` | 集团本币本层标准金额 |
| `group_this_std_price` | `group_this_std_price` | `groupThisStdPrice` | 集团本币本层标准单价 |
| `org_balance_busi_dif` | `org_balance_busi_dif` | `orgBalanceBusiDif` | 组织本币结余业务差异 |
| `org_balance_ipv_dif` | `org_balance_ipv_dif` | `orgBalanceIpvDif` | 组织本币结余结算差异 |
| `org_balance_ipv_rate_dif` | `org_balance_ipv_rate_dif` | `orgBalanceIpvRateDif` | 组织本币结余汇率差异 |
| `org_balance_ppd_dif` | `org_balance_ppd_dif` | `orgBalancePpdDif` | 组织本币结余生产差异 |
| `org_balance_std_amount` | `org_balance_std_amount` | `orgBalanceStdAmount` | 组织本币结余标准金额 |
| `org_balance_this_busi_dif` | `org_balance_this_busi_dif` | `orgBalanceThisBusiDif` | 组织本币结余本层业务差异 |
| `org_balance_this_cost_amount` | `org_balance_this_cost_amount` | `orgBalanceThisCostAmount` | 组织本币结余本层金额 |
| `org_balance_this_ppd_dif` | `org_balance_this_ppd_dif` | `orgBalanceThisPpdDif` | 组织本币结余本层生产差异 |
| `org_balance_this_std_amount` | `org_balance_this_std_amount` | `orgBalanceThisStdAmount` | 组织本币结余本层标准金额 |
| `org_busi_dif` | `org_busi_dif` | `orgBusiDif` | 组织本币业务差异 |
| `org_ipv_dif` | `org_ipv_dif` | `orgIpvDif` | 组织本币结算差异 |
| `org_ipv_rate_dif` | `org_ipv_rate_dif` | `orgIpvRateDif` | 组织本币汇率差异 |
| `org_ppd_dif` | `org_ppd_dif` | `orgPpdDif` | 组织本币生产价格差异 |
| `org_reserv_dif1` | `org_reserv_dif1` | `orgReservDif1` | 组织本币预留差异1 |
| `org_reserv_dif2` | `org_reserv_dif2` | `orgReservDif2` | 组织本币预留差异2 |
| `org_settled_amount` | `org_settled_amount` | `orgSettledAmount` | 组织本币结算后金额 |
| `org_settled_price` | `org_settled_price` | `orgSettledPrice` | 组织本币结算后单价 |
| `org_this_balance_amount` | `org_this_balance_amount` | `orgThisBalanceAmount` | 组织本币本层结余金额 |
| `org_this_busi_dif` | `org_this_busi_dif` | `orgThisBusiDif` | 组织本币本层业务差异 |
| `org_this_cost_amount` | `org_this_cost_amount` | `orgThisCostAmount` | 组织本币本层成本金额 |
| `org_this_cost_price` | `org_this_cost_price` | `orgThisCostPrice` | 组织本币本层成本单价 |
| `org_this_ppd_dif` | `org_this_ppd_dif` | `orgThisPpdDif` | 组织本币本层生产价格差异 |
| `org_this_std_amount` | `org_this_std_amount` | `orgThisStdAmount` | 组织本币本层标准金额 |
| `org_this_std_price` | `org_this_std_price` | `orgThisStdPrice` | 组织本币本层标准单价 |
