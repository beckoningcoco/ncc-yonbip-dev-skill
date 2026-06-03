---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationBillBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提跌价准备子表 (`EIA.EIA.DepreciationBillBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciationbill_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9b23ae50-f691-42a5-853b-c53019d58caf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提跌价准备子表 |
| 物理表 | `ia_depreciationbill_b` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 134 个 |
| 子表 | 1 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `DepreciationBillBodyItemVOList` | `EIA.EIA.DepreciationBillBodyItemVO` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `accbook_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `org_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `project` | `ucfbasedoc.bd_projectNewRef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `global_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `header_id` | `` |
| `` | `` |
| `ia_inventoryobj_id` | `` |
| `mainunit` | `productcenter.pc_unitref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `depreciation_vo_id` | `` |
| `group_currency_id` | `ucfbasedoc.bd_currencytenantref` |
| `wbs_id` | `yonbip-pm-commonbd.wbs_doc_ref` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `control_currency_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (5个, 19字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 134 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mto_id` | `mto_id` | `mtoId` | MTO订单ID |
| `mto_no` | `mto_no` | `mtoNo` | MTO订单号 |
| `mto_row_id` | `mto_row_id` | `mtoRowId` | MTO订单行ID |
| `batch_code` | `batch_code` | `batchCode` | 批次号 |
| `bizflow_name` | `bizflow_name` | `bizflowName` | 流程名称 |
| `cost_class_code` | `cost_class_code` | `costClassCode` | 成本分类编码 |
| `description` | `description` | `description` | 备注 |
| `ia_sku_id` | `ia_sku_id` | `iaSkuId` | 料SKU |
| `manage_class_code` | `manage_class_code` | `manageClassCode` | 物料分类编码 |
| `source_code` | `source_code` | `sourceCode` | 上游单据号 |
| `id` | `id` | `id` | 主键 |
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |

### 引用字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project` | `project` | `project` | 项目 |
| `wbs_id` | `wbs_id` | `wbsId` | 核算WBSwbs_id |
| `depreciation_vo_id` | `depreciation_vo_id` | `DepreciationBillVOId` | 跌价单主表 |
| `accbook_currency_id` | `accbook_currency_id` | `accbookCurrencyId` | 账簿币 |
| `control_currency_id` | `control_currency_id` | `controlCurrencyId` | 管控范围币 |
| `global_currency_id` | `global_currency_id` | `globalCurrencyId` | 全局币 |
| `group_currency_id` | `group_currency_id` | `groupCurrencyId` | 集团币 |
| `header_id` | `header_id` | `headerId` | 跌价单主表ID |
| `ia_inventoryobj_id` | `ia_inventoryobj_id` | `iaInventoryobj` | 存货对象 |
| `mainunit` | `mainunit` | `mainunit` | 物料单位 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `org_currency_id` | `org_currency_id` | `orgCurrencyId` | 组织币 |
| `stock_org_id` | `stock_org_id` | `stockOrgId` | 库存组织 |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 仓库 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_date` | `product_date` | `productDate` | 生产时间 |
| `validity_date` | `validity_date` | `validityDate` | 失效时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `src_accrued_amount` | `src_accrued_amount` | `srcAccruedAmount` | 应计提金额来源 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_class_id` | `cost_class_id` | `costClassId` | 成本分类 |
| `row_id` | `row_id` | `row` | 行ID |

### 数值字段 (84个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_has_back_amount` | `org_has_back_amount` | `orgHasBackAmount` | 组织币累计已转回成本 |
| `accbook_has_back_amount` | `accbook_has_back_amount` | `accbookHasBackAmount` | 本币累计已转回成本 |
| `group_has_back_amount` | `group_has_back_amount` | `groupHasBackAmount` | 集团币累计已转回成本 |
| `global_has_back_amount` | `global_has_back_amount` | `globalHasBackAmount` | 全局币累计已转回成本 |
| `org_has_off_amount` | `org_has_off_amount` | `orgHasOffAmount` | 组织币累计已转销成本 |
| `accbook_has_off_amount` | `accbook_has_off_amount` | `accbookHasOffAmount` | 本币累计已转销成本 |
| `group_has_off_amount` | `group_has_off_amount` | `groupHasOffAmount` | 集团币累计已转销成本 |
| `global_has_off_amount` | `global_has_off_amount` | `globalHasOffAmount` | 全局币累计已转销成本 |
| `mto_row_no` | `mto_row_no` | `mtoRowNo` | MTO订单行号 |
| `pre_balance_num` | `pre_balance_num` | `preBalanceNum` | 上次结存数量 |
| `org_pre_balance_price` | `org_pre_balance_price` | `orgPreBalancePrice` | 组织币上次计提余额单价 |
| `accbook_pre_balance_price` | `accbook_pre_balance_price` | `accbookPreBalancePrice` | 本币上次计提余额单价 |
| `group_pre_balance_price` | `group_pre_balance_price` | `groupPreBalancePrice` | 集团币上次计提余额单价 |
| `global_pre_balance_price` | `global_pre_balance_price` | `globalPreBalancePrice` | 全局币上次计提余额单价 |
| `org_pre_balance_amount` | `org_pre_balance_amount` | `orgPreBalanceAmount` | 组织币上次计提余额 |
| `accbook_pre_balance_amount` | `accbook_pre_balance_amount` | `accbookPreBalanceAmount` | 本币上次计提余额 |
| `group_pre_balance_amount` | `group_pre_balance_amount` | `groupPreBalanceAmount` | 集团币上次计提余额 |
| `global_pre_balance_amount` | `global_pre_balance_amount` | `globalPreBalanceAmount` | 全局币上次计提余额 |
| `org_back_amount` | `org_back_amount` | `orgBackAmount` | 组织币转回成本 |
| `accbook_back_amount` | `accbook_back_amount` | `accbookBackAmount` | 本币转回成本 |
| `group_back_amount` | `group_back_amount` | `groupBackAmount` | 集团币转回成本 |
| `global_back_amount` | `global_back_amount` | `globalBackAmount` | 全局币转回成本 |
| `org_off_amount` | `org_off_amount` | `orgOffAmount` | 组织币转销成本 |
| `accbook_off_amount` | `accbook_off_amount` | `accbookOffAmount` | 本币转销成本 |
| `group_off_amount` | `group_off_amount` | `groupOffAmount` | 集团币转销成本 |
| `global_off_amount` | `global_off_amount` | `globalOffAmount` | 全局币转销成本 |
| `org_total_back_amount` | `org_total_back_amount` | `orgTotalBackAmount` | 组织币累计转回成本 |
| `accbook_total_back_amount` | `accbook_total_back_amount` | `accbookTotalBackAmount` | 本币累计转回成本 |
| `group_total_back_amount` | `group_total_back_amount` | `groupTotalBackAmount` | 集团币累计转回成本 |
| `global_total_back_amount` | `global_total_back_amount` | `globalTotalBackAmount` | 全局币累计转回成本 |
| `org_total_off_amount` | `org_total_off_amount` | `orgTotalOffAmount` | 组织币累计转销成本 |
| `accbook_total_off_amount` | `accbook_total_off_amount` | `accbookTotalOffAmount` | 本币累计转销成本 |
| `group_total_off_amount` | `group_total_off_amount` | `groupTotalOffAmount` | 集团币累计转销成本 |
| `global_total_off_amount` | `global_total_off_amount` | `globalTotalOffAmount` | 全局币累计转销成本 |
| `org_depr_balance` | `org_depr_balance` | `orgDeprBalance` | 组织币余额 |
| `accbook_depr_balance` | `accbook_depr_balance` | `accbookDeprBalance` | 本币余额 |
| `group_depr_balance` | `group_depr_balance` | `groupDeprBalance` | 集团币余额 |
| `global_depr_balance` | `global_depr_balance` | `globalDeprBalance` | 全局币余额 |
| `accbook_realizable` | `accbook_realizable` | `accbookRealizable` | 本币可变现净值 |
| `accrued_amount` | `accrued_amount` | `accruedAmount` | 应计提金额 |
| `balance_amount` | `balance_amount` | `balanceAmount` | 结余金额 |
| `balance_num` | `balance_num` | `balanceNum` | 结余总数量 |
| `balance_price` | `balance_price` | `balancePrice` | 结余单价 |
| `control_accrued_amount` | `control_accrued_amount` | `controlAccruedAmount` | 管控范围币应计提金额 |
| `control_balance_amount` | `control_balance_amount` | `controlBalanceAmount` | 管控范围币结余金额 |
| `control_balance_price` | `control_balance_price` | `controlBalancePrice` | 管控范围币结余单价 |
| `control_curr_accrued_amount` | `control_curr_accrued_amount` | `controlCurrAccruedAmount` | 管控范围币本次计提金额 |
| `control_has_accrued_amount` | `control_has_accrued_amount` | `controlHasAccruedAmount` | 管控范围币已经计提金额 |
| `control_total_accrued_amount` | `control_total_accrued_amount` | `controlTotalAccruedAmount` | 管控范围币累计计提金额 |
| `curr_accrued_amount` | `curr_accrued_amount` | `currAccruedAmount` | 本次计提金额 |
| `global_accrued_amount` | `global_accrued_amount` | `globalAccruedAmount` | 全局币应计提金额 |
| `global_balance_amount` | `global_balance_amount` | `globalBalanceAmount` | 全局币结余金额 |
| `global_balance_price` | `global_balance_price` | `globalBalancePrice` | 全局币结余单价 |
| `global_curr_accrued_amount` | `global_curr_accrued_amount` | `globalCurrAccruedAmount` | 全局币本次计提金额 |
| `global_has_accrued_amount` | `global_has_accrued_amount` | `globalHasAccruedAmount` | 全局币已经计提金额 |
| `global_realizable` | `global_realizable` | `globalRealizable` | 全局币可变现净值 |
| `global_total_accrued_amount` | `global_total_accrued_amount` | `globalTotalAccruedAmount` | 全局币累计计提金额 |
| `group_accrued_amount` | `group_accrued_amount` | `groupAccruedAmount` | 集团币应计提金额 |
| `group_balance_amount` | `group_balance_amount` | `groupBalanceAmount` | 集团币结余金额 |
| `group_balance_price` | `group_balance_price` | `groupBalancePrice` | 集团币结余单价 |
| `group_curr_accrued_amount` | `group_curr_accrued_amount` | `groupCurrAccruedAmount` | 集团币本次计提金额 |
| `group_has_accrued_amount` | `group_has_accrued_amount` | `groupHasAccruedAmount` | 集团币已经计提金额 |
| `group_realizable` | `group_realizable` | `groupRealizable` | 集团币可变现净值 |
| `group_total_accrued_amount` | `group_total_accrued_amount` | `groupTotalAccruedAmount` | 集团币累计计提金额 |
| `has_accrued_amount` | `has_accrued_amount` | `hasAccruedAmount` | 已经计提金额 |
| `market_price` | `market_price` | `marketPrice` | 最新市价 |
| `org_accrued_amount` | `org_accrued_amount` | `orgAccruedAmount` | 组织币应计提金额 |
| `org_balance_amount` | `org_balance_amount` | `orgBalanceAmount` | 组织币结余金额 |
| `org_balance_price` | `org_balance_price` | `orgBalancePrice` | 组织币结余单价 |
| `org_curr_accrued_amount` | `org_curr_accrued_amount` | `orgCurrAccruedAmount` | 组织币本次计提金额 |
| `org_has_accrued_amount` | `org_has_accrued_amount` | `orgHasAccruedAmount` | 组织币已经计提金额 |
| `org_realizable` | `org_realizable` | `orgRealizable` | 组织币可变现净值 |
| `org_total_accrued_amount` | `org_total_accrued_amount` | `orgTotalAccruedAmount` | 组织币累计计提金额 |
| `sectionnum1` | `sectionnum1` | `sectionnum1` | 计提1数量 |
| `sectionnum2` | `sectionnum2` | `sectionnum2` | 计提2数量 |
| `sectionnum3` | `sectionnum3` | `sectionnum3` | 计提3数量 |
| `sectionnum4` | `sectionnum4` | `sectionnum4` | 计提4数量 |
| `sectionnum5` | `sectionnum5` | `sectionnum5` | 计提5数量 |
| `sectionrate1` | `sectionrate1` | `sectionrate1` | 计提1比例 |
| `sectionrate2` | `sectionrate2` | `sectionrate2` | 计提2比例 |
| `sectionrate3` | `sectionrate3` | `sectionrate3` | 计提3比例 |
| `sectionrate4` | `sectionrate4` | `sectionrate4` | 计提4比例 |
| `sectionrate5` | `sectionrate5` | `sectionrate5` | 计提5比例 |
| `total_accrued_amount` | `total_accrued_amount` | `totalAccruedAmount` | 累计计提金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 计提跌价准备明细信息自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `DepreciationBillBodyItemVOList` | 计提跌价准备孙表 |
