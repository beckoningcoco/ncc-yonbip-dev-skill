---
tags: [BIP, 元数据, 数据字典, 期间结存明细, EIA, FIEIA.FIEIA.PeriodBalanceStockVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期间结存明细 (`FIEIA.FIEIA.PeriodBalanceStockVO`)

> **平台版本：BIP 旗舰版 V5**
> YonBIP 财务（EIA）模块期间结存明细的完整元数据字典。
> 物理表：`ia_period_balance_stock` | 业务对象ID：`c8bd9870-a201-4086-bc9f-631a9a8b0e78`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期间结存明细 |
| 物理表 | `ia_period_balance_stock` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 元数据类型 | `Class` |
| 直连字段 | 314 个 |
| 关联引用 | 19 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodies` | `FIEIA.FIEIA.PeriodBalanceStockBodyVO` | composition |

## 关联引用 (19个)

| 字段名 | 引用类型 |
|--------|---------|
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `cost_domain_id` | `yonbip-fi-eia.RefTable_0e6f869743` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `` | `` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `control_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `inventory_obj_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `global_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `group_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `acc_year_id` | `finbd.bd_periodyear` |

## 字段列表（按类型分组）

> 共 314 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | id |
| `ia_sku_id` | `ia_sku_id` | String | 存货sku |
| `ia_features_id` | `ia_features_id` | String | 存货特征id |
| `material_class` | `material_class` | String | 物料分类 |
| `period_code` | `period_code` | String | 会计期间编码 |
| `batch_code` | `batch_code` | String | 批次号 |
| `acc_year_code` | `acc_year_code` | String | 会计年编码 |
| `busi_wbs_id` | `busi_wbs_id` | String | 业务wbsId |
| `mto_id` | `mto_id` | String | mto订单id |
| `mto_no` | `mto_no` | String | mto订单号 |
| `mto_row_id` | `mto_row_id` | String | mto订单行id |
| `mto_row_no` | `mto_row_no` | String | mto订单行号 |
| `project_id` | `project_id` | String | 项目id |
| `wbs_id` | `wbs_id` | String | 核算wbs |
| `wbs_id` | `wbs_id` | String | 核算wbs |

### 引用字段 (18个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accentity_id` | `accentity_id` | e33ec72a-3857-4167-89e2-a437168ed3bb | 会计主体 |
| `warehouse_id` | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | 仓库 |
| `material_id` | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | 物料id |
| `accbook_currtype_id` | `accbook_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 账簿本币币种 |
| `accpurpose_id` | `accpurpose_id` | 637f4637-0862-4167-a2bf-ef52818ca9d9 | 核算目的 |
| `control_currtype_id` | `control_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 管控本币币种 |
| `stock_org_id` | `stock_org_id` | e18e914b-4518-4e8c-ac21-783145fe7da1 | 库存组织 |
| `org_currtype_id` | `org_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 组织本币币种 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |
| `global_currtype_id` | `global_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 全局本币币种 |
| `period_id` | `period_id` | 0028813f-135a-485e-a5c3-c15a3d18168b | 会计期间id |
| `accbook_id` | `accbook_id` | 5df8e763-5595-4a87-9ff9-a7ac3bd1e81e | 核算账簿 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `inventory_obj_id` | `inventory_obj_id` | bb8b0e07-f212-4998-b774-8c155048f811 | 存货对象 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `group_currtype_id` | `group_currtype_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 集团本币币种 |
| `cost_domain_id` | `cost_domain_id` | 0119be07-4d2d-4cfe-89f4-18e7682aed24 | 成本域(租户) |
| `acc_year_id` | `acc_year_id` | c1fb756f-95cc-4faf-b1bf-7cea0aa99973 | 会计年ID |

### 日期时间 (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | pubts |
| `create_time` | `create_time` | DateTime | 创建时间 |
| `modify_time` | `modify_time` | DateTime | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `price_method` | `price_method` | ia_pricingmethod | 计价方式 |

### 整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `rollup_level` | `rollup_level` | Integer | 卷积层级 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `dr` | `dr` | Short | 逻辑删除 |

### 长整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `customer_id` | `customer_id` | Long | 客户id |
| `supplier_id` | `supplier_id` | Long | 供应商id |

### 数值字段 (272个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accbook_init_this_ppd_dif` | `accbook_init_this_ppd_dif` | Decimal | 账簿本币期初本层生产价格差异 |
| `accbook_init_ppv_dif` | `accbook_init_ppv_dif` | Decimal | 账簿本币期初暂估差异 |
| `global_balance_this_price` | `global_balance_this_price` | Decimal | 全局本币结余本层单价 |
| `accbook_init_amount` | `accbook_init_amount` | Decimal | 账簿本币期初金额 |
| `accbook_balance_this_amount` | `accbook_balance_this_amount` | Decimal | 账簿本币结余本层金额 |
| `group_out_stdamount` | `group_out_stdamount` | Decimal | 集团本币本期出库标准价 |
| `global_init_amount` | `global_init_amount` | Decimal | 全局本币期初金额 |
| `accbook_balance_this_ppv_dif` | `accbook_balance_this_ppv_dif` | Decimal | 账簿本币结余本层业务差异 |
| `global_init_ppv_dif` | `global_init_ppv_dif` | Decimal | 全局本币期初暂估差异 |
| `accbook_out_amount` | `accbook_out_amount` | Decimal | 账簿本币本期出库金额 |
| `global_balance_price` | `global_balance_price` | Decimal | 全局本币结存单价 |
| `control_init_ipv_rate` | `control_init_ipv_rate` | Decimal | 管控范围本币期初结算汇差 |
| `group_balance_ipv_rate` | `group_balance_ipv_rate` | Decimal | 集团本币结存结算汇差 |
| `group_out_ipv_rate` | `group_out_ipv_rate` | Decimal | 集团本币本期出库结算汇差 |
| `org_balance_this_ppd_dif` | `org_balance_this_ppd_dif` | Decimal | 组织本币结余本层生产价格差异 |
| `global_init_reserv_dif2` | `global_init_reserv_dif2` | Decimal | 全局本币期初预留差异2 |
| `group_init_this_ppd_dif` | `group_init_this_ppd_dif` | Decimal | 集团本币期初本层生产价格差异 |
| `global_init_reserv_dif1` | `global_init_reserv_dif1` | Decimal | 全局本币期初预留差异1 |
| `accbook_in_ipv_dif` | `accbook_in_ipv_dif` | Decimal | 账簿本币本期入库结算价差 |
| `control_out_ipv_dif` | `control_out_ipv_dif` | Decimal | 管控范围本币本期出库结算价差 |
| `org_in_ipv_dif` | `org_in_ipv_dif` | Decimal | 组织本币本期入库结算价差 |
| `accbook_balance_ipv_rate` | `accbook_balance_ipv_rate` | Decimal | 账簿本币结存结算汇差 |
| `org_out_price` | `org_out_price` | Decimal | 组织本币出库单价 |
| `group_out_this_stdamount` | `group_out_this_stdamount` | Decimal | 集团本币本期出库本层标准价 |
| `group_out_reserv_dif1` | `group_out_reserv_dif1` | Decimal | 集团本币本期出库预留差异1 |
| `group_out_reserv_dif2` | `group_out_reserv_dif2` | Decimal | 集团本币本期出库预留差异2 |
| `global_balance_this_ppv_dif` | `global_balance_this_ppv_dif` | Decimal | 全局本币结余本层业务差异 |
| `group_out_amount` | `group_out_amount` | Decimal | 集团本币本期出库金额 |
| `control_balance_ipv_rate` | `control_balance_ipv_rate` | Decimal | 管控范围本币结存结算汇差 |
| `accbook_in_ppd_dif` | `accbook_in_ppd_dif` | Decimal | 账簿本币本期入库生产价格差异 |
| `org_out_this_amount` | `org_out_this_amount` | Decimal | 组织本币本期出库本层金额 |
| `org_in_price` | `org_in_price` | Decimal | 组织本币入库单价 |
| `org_out_this_stdamount` | `org_out_this_stdamount` | Decimal | 组织本币本期出库本层标准价 |
| `group_in_stdamount` | `group_in_stdamount` | Decimal | 集团本币本期入库标准价 |
| `org_out_ppd_dif` | `org_out_ppd_dif` | Decimal | 组织本币本期出库生产价格差异 |
| `org_in_amount` | `org_in_amount` | Decimal | 组织本币本期入库金额 |
| `accbook_balance_this_stdamount` | `accbook_balance_this_stdamount` | Decimal | 账簿本币结余本层标准价 |
| `group_in_this_ppd_dif` | `group_in_this_ppd_dif` | Decimal | 集团本币本期入库本层生产价格差异 |
| `group_in_price` | `group_in_price` | Decimal | 集团本币入库单价 |
| `group_out_this_price` | `group_out_this_price` | Decimal | 集团本币出库本层单价 |
| `accbook_out_this_ppd_dif` | `accbook_out_this_ppd_dif` | Decimal | 账簿本币本期出库本层生产价格差异 |
| `global_init_ipv_dif` | `global_init_ipv_dif` | Decimal | 全局本币期初结算价差 |
| `global_balance_this_amount` | `global_balance_this_amount` | Decimal | 全局本币结余本层金额 |
| `org_init_stdamount` | `org_init_stdamount` | Decimal | 组织本币期初标准价 |
| `org_in_ppd_dif` | `org_in_ppd_dif` | Decimal | 组织本币本期入库生产价格差异 |
| `accbook_out_ppv_dif` | `accbook_out_ppv_dif` | Decimal | 账簿本币本期出库暂估差异 |
| `accbook_init_ipv_dif` | `accbook_init_ipv_dif` | Decimal | 账簿本币期初结算价差 |
| `org_init_ppd_dif` | `org_init_ppd_dif` | Decimal | 组织本币期初生产价格差异 |
| `global_in_this_ppd_dif` | `global_in_this_ppd_dif` | Decimal | 全局本币本期入库本层生产价格差异 |
| `accbook_balance_price` | `accbook_balance_price` | Decimal | 账簿本币结存单价 |
| `control_out_stdamount` | `control_out_stdamount` | Decimal | 管控范围本币本期出库标准价 |
| `accbook_in_this_ppv_dif` | `accbook_in_this_ppv_dif` | Decimal | 账簿本币本期入库本层业务差异 |
| `org_balance_this_stdamount` | `org_balance_this_stdamount` | Decimal | 组织本币结余本层标准价 |
| `org_balance_ppv_dif` | `org_balance_ppv_dif` | Decimal | 组织本币结存暂估差异 |
| `org_init_this_amount` | `org_init_this_amount` | Decimal | 组织本币期初本层金额 |
| `global_out_reserv_dif1` | `global_out_reserv_dif1` | Decimal | 全局本币本期出库预留差异1 |
| `global_out_reserv_dif2` | `global_out_reserv_dif2` | Decimal | 全局本币本期出库预留差异2 |
| `accbook_balance_this_price` | `accbook_balance_this_price` | Decimal | 账簿本币结余本层单价 |
| `org_in_reserv_dif2` | `org_in_reserv_dif2` | Decimal | 组织本币本期入库预留差异2 |
| `init_num` | `init_num` | Decimal | 期初数量 |
| `org_in_reserv_dif1` | `org_in_reserv_dif1` | Decimal | 组织本币本期入库预留差异1 |
| `global_in_this_amount` | `global_in_this_amount` | Decimal | 全局本币本期入库本层金额 |
| `control_out_reserv_dif2` | `control_out_reserv_dif2` | Decimal | 管控范围本币本期出库预留差异2 |
| `control_out_reserv_dif1` | `control_out_reserv_dif1` | Decimal | 管控范围本币本期出库预留差异1 |
| `control_init_amount` | `control_init_amount` | Decimal | 管控范围本币期初金额 |
| `accbook_init_price` | `accbook_init_price` | Decimal | 账簿本币期初单价 |
| `accbook_in_ppv_dif` | `accbook_in_ppv_dif` | Decimal | 账簿本币本期入库暂估差异 |
| `control_in_this_amount` | `control_in_this_amount` | Decimal | 管控范围本币本期入库本层金额 |
| `group_init_this_ppv_dif` | `group_init_this_ppv_dif` | Decimal | 集团本币期初本层业务差异 |
| `org_out_stdamount` | `org_out_stdamount` | Decimal | 组织本币本期出库标准价 |
| `group_out_ipv_dif` | `group_out_ipv_dif` | Decimal | 集团本币本期出库结算价差 |
| `org_balance_ipv_dif` | `org_balance_ipv_dif` | Decimal | 组织本币结存结算价差 |
| `accbook_in_amount` | `accbook_in_amount` | Decimal | 账簿本币本期入库金额 |
| `balance_num` | `balance_num` | Decimal | 结余数量 |
| `global_init_this_stdamount` | `global_init_this_stdamount` | Decimal | 全局本币期初本层标准价 |
| `org_init_amount` | `org_init_amount` | Decimal | 组织本币期初金额 |
| `global_in_ipv_rate` | `global_in_ipv_rate` | Decimal | 全局本币本期入库结算汇差 |
| `accbook_balance_stdamount` | `accbook_balance_stdamount` | Decimal | 账簿本币结存标准价 |
| `global_balance_reserv_dif2` | `global_balance_reserv_dif2` | Decimal | 全局本币结余预留差异2 |
| `global_balance_reserv_dif1` | `global_balance_reserv_dif1` | Decimal | 全局本币结余预留差异1 |
| `control_in_ipv_dif` | `control_in_ipv_dif` | Decimal | 管控范围本币本期入库结算价差 |
| `group_out_this_ppv_dif` | `group_out_this_ppv_dif` | Decimal | 集团本币本期出库本层业务差异 |
| `global_in_ppv_dif` | `global_in_ppv_dif` | Decimal | 全局本币本期入库暂估差异 |
| `global_balance_ppv_dif` | `global_balance_ppv_dif` | Decimal | 全局本币结存暂估差异 |
| `global_init_this_ppv_dif` | `global_init_this_ppv_dif` | Decimal | 全局本币期初本层业务差异 |
| `control_in_this_price` | `control_in_this_price` | Decimal | 管控范围本币入库本层单价 |
| `group_balance_amount` | `group_balance_amount` | Decimal | 集团本币结存金额 |
| `group_balance_this_amount` | `group_balance_this_amount` | Decimal | 集团本币结余本层金额 |
| `control_out_this_stdamount` | `control_out_this_stdamount` | Decimal | 管控范围本币本期出库本层标准价 |
| `org_balance_ipv_rate` | `org_balance_ipv_rate` | Decimal | 组织本币结存结算汇差 |
| `control_init_ipv_dif` | `control_init_ipv_dif` | Decimal | 管控范围本币期初结算价差 |
| `control_balance_price` | `control_balance_price` | Decimal | 管控本币结存单价 |
| `group_out_this_amount` | `group_out_this_amount` | Decimal | 集团本币本期出库本层金额 |
| `org_out_reserv_dif1` | `org_out_reserv_dif1` | Decimal | 组织本币本期出库预留差异1 |
| `global_init_this_amount` | `global_init_this_amount` | Decimal | 全局本币期初本层金额 |
| `org_init_ipv_rate` | `org_init_ipv_rate` | Decimal | 组织本币期初结算汇差 |
| `group_in_amount` | `group_in_amount` | Decimal | 集团本币本期入库金额 |
| `org_out_reserv_dif2` | `org_out_reserv_dif2` | Decimal | 组织本币本期出库预留差异2 |
| `control_in_reserv_dif1` | `control_in_reserv_dif1` | Decimal | 管控范围本币本期入库预留差异1 |
| `global_balance_stdamount` | `global_balance_stdamount` | Decimal | 全局本币结存标准价 |
| `control_in_reserv_dif2` | `control_in_reserv_dif2` | Decimal | 管控范围本币本期入库预留差异2 |
| `global_in_ipv_dif` | `global_in_ipv_dif` | Decimal | 全局本币本期入库结算价差 |
| `control_in_ipv_rate` | `control_in_ipv_rate` | Decimal | 管控范围本币本期入库结算汇差 |
| `org_balance_this_price` | `org_balance_this_price` | Decimal | 组织本币结余本层单价 |
| `group_in_ppv_dif` | `group_in_ppv_dif` | Decimal | 集团本币本期入库暂估差异 |
| `accbook_out_price` | `accbook_out_price` | Decimal | 账簿本币出库单价 |
| `global_in_this_stdamount` | `global_in_this_stdamount` | Decimal | 全局本币本期入库本层标准价 |
| `global_out_this_ppd_dif` | `global_out_this_ppd_dif` | Decimal | 全局本币本期出库本层生产价格差异 |
| `accbook_init_ipv_rate` | `accbook_init_ipv_rate` | Decimal | 账簿本币期初结算汇差 |
| `group_balance_price` | `group_balance_price` | Decimal | 集团本币结存单价 |
| `org_in_this_ppd_dif` | `org_in_this_ppd_dif` | Decimal | 组织本币本期入库本层生产价格差异 |
| `org_balance_this_ppv_dif` | `org_balance_this_ppv_dif` | Decimal | 组织本币结余本层业务差异 |
| `org_out_this_price` | `org_out_this_price` | Decimal | 组织本币出库本层单价 |
| `group_out_ppv_dif` | `group_out_ppv_dif` | Decimal | 集团本币本期出库暂估差异 |
| `global_in_this_ppv_dif` | `global_in_this_ppv_dif` | Decimal | 全局本币本期入库本层业务差异 |
| `global_in_stdamount` | `global_in_stdamount` | Decimal | 全局本币本期入库标准价 |
| `org_in_ppv_dif` | `org_in_ppv_dif` | Decimal | 组织本币本期入库暂估差异 |
| `global_init_stdamount` | `global_init_stdamount` | Decimal | 全局本币期初标准价 |
| `org_out_this_ppd_dif` | `org_out_this_ppd_dif` | Decimal | 组织本币本期出库本层生产价格差异 |
| `group_init_price` | `group_init_price` | Decimal | 集团本币期初单价 |
| `org_init_this_ppv_dif` | `org_init_this_ppv_dif` | Decimal | 组织本币期初本层业务差异 |
| `control_init_ppv_dif` | `control_init_ppv_dif` | Decimal | 管控范围本币期初暂估差异 |
| `group_balance_this_ppv_dif` | `group_balance_this_ppv_dif` | Decimal | 集团本币结余本层业务差异 |
| `accbook_in_this_amount` | `accbook_in_this_amount` | Decimal | 账簿本币本期入库本层金额 |
| `group_in_reserv_dif2` | `group_in_reserv_dif2` | Decimal | 集团本币本期入库预留差异2 |
| `group_in_reserv_dif1` | `group_in_reserv_dif1` | Decimal | 集团本币本期入库预留差异1 |
| `control_init_reserv_dif2` | `control_init_reserv_dif2` | Decimal | 管控范围本币期初预留差异2 |
| `control_init_reserv_dif1` | `control_init_reserv_dif1` | Decimal | 管控范围本币期初预留差异1 |
| `accbook_init_ppd_dif` | `accbook_init_ppd_dif` | Decimal | 账簿本币期初生产价格差异 |
| `control_out_this_amount` | `control_out_this_amount` | Decimal | 管控范围本币本期出库本层金额 |
| `group_init_ipv_rate` | `group_init_ipv_rate` | Decimal | 集团本币期初结算汇差 |
| `group_init_ipv_dif` | `group_init_ipv_dif` | Decimal | 集团本币期初结算价差 |
| `group_out_price` | `group_out_price` | Decimal | 集团本币出库单价 |
| `accbook_out_reserv_dif2` | `accbook_out_reserv_dif2` | Decimal | 账簿本币本期出库预留差异2 |
| `accbook_out_reserv_dif1` | `accbook_out_reserv_dif1` | Decimal | 账簿本币本期出库预留差异1 |
| `group_in_this_stdamount` | `group_in_this_stdamount` | Decimal | 集团本币本期入库本层标准价 |
| `accbook_balance_ppd_dif` | `accbook_balance_ppd_dif` | Decimal | 账簿本币结存生产价格差异 |
| `control_balance_ipv_dif` | `control_balance_ipv_dif` | Decimal | 管控范围本币结存结算价差 |
| `global_in_reserv_dif1` | `global_in_reserv_dif1` | Decimal | 全局本币本期入库预留差异1 |
| `global_in_reserv_dif2` | `global_in_reserv_dif2` | Decimal | 全局本币本期入库预留差异2 |
| `accbook_balance_ppv_dif` | `accbook_balance_ppv_dif` | Decimal | 账簿本币结存暂估差异 |
| `org_balance_stdamount` | `org_balance_stdamount` | Decimal | 组织本币结存标准价 |
| `group_balance_this_price` | `group_balance_this_price` | Decimal | 集团本币结余本层单价 |
| `accbook_in_stdamount` | `accbook_in_stdamount` | Decimal | 账簿本币本期入库标准价 |
| `control_balance_this_stdamount` | `control_balance_this_stdamount` | Decimal | 管控范围本币结余本层标准价 |
| `global_in_ppd_dif` | `global_in_ppd_dif` | Decimal | 全局本币本期入库生产价格差异 |
| `global_init_ipv_rate` | `global_init_ipv_rate` | Decimal | 全局本币期初结算汇差 |
| `global_out_this_stdamount` | `global_out_this_stdamount` | Decimal | 全局本币本期出库本层标准价 |
| `global_balance_ipv_dif` | `global_balance_ipv_dif` | Decimal | 全局本币结存结算价差 |
| `accbook_out_this_ppv_dif` | `accbook_out_this_ppv_dif` | Decimal | 账簿本币本期出库本层业务差异 |
| `accbook_balance_amount` | `accbook_balance_amount` | Decimal | 账簿本币结存金额 |
| `group_balance_ipv_dif` | `group_balance_ipv_dif` | Decimal | 集团本币结存结算价差 |
| `accbook_init_stdamount` | `accbook_init_stdamount` | Decimal | 账簿本币期初标准价 |
| `global_out_amount` | `global_out_amount` | Decimal | 全局本币本期出库金额 |
| `org_out_amount` | `org_out_amount` | Decimal | 组织本币本期出库金额 |
| `group_init_amount` | `group_init_amount` | Decimal | 集团本币期初金额 |
| `group_in_this_ppv_dif` | `group_in_this_ppv_dif` | Decimal | 集团本币本期入库本层业务差异 |
| `group_balance_reserv_dif1` | `group_balance_reserv_dif1` | Decimal | 集团本币结余预留差异1 |
| `group_balance_reserv_dif2` | `group_balance_reserv_dif2` | Decimal | 集团本币结余预留差异2 |
| `org_balance_ppd_dif` | `org_balance_ppd_dif` | Decimal | 组织本币结存生产价格差异 |
| `org_init_price` | `org_init_price` | Decimal | 组织本币期初单价 |
| `global_init_price` | `global_init_price` | Decimal | 全局本币期初单价 |
| `global_out_ppv_dif` | `global_out_ppv_dif` | Decimal | 全局本币本期出库暂估差异 |
| `group_init_ppv_dif` | `group_init_ppv_dif` | Decimal | 集团本币期初暂估差异 |
| `org_out_ppv_dif` | `org_out_ppv_dif` | Decimal | 组织本币本期出库暂估差异 |
| `group_init_this_price` | `group_init_this_price` | Decimal | 集团本币期初本层单价 |
| `group_balance_ppd_dif` | `group_balance_ppd_dif` | Decimal | 集团本币结存生产价格差异 |
| `group_init_stdamount` | `group_init_stdamount` | Decimal | 集团本币期初标准价 |
| `global_out_ipv_rate` | `global_out_ipv_rate` | Decimal | 全局本币本期出库结算汇差 |
| `out_num` | `out_num` | Decimal | 本期出库数量 |
| `control_out_ipv_rate` | `control_out_ipv_rate` | Decimal | 管控范围本币本期出库结算汇差 |
| `global_balance_ppd_dif` | `global_balance_ppd_dif` | Decimal | 全局本币结存生产价格差异 |
| `control_in_ppv_dif` | `control_in_ppv_dif` | Decimal | 管控范围本币本期入库暂估差异 |
| `group_init_reserv_dif2` | `group_init_reserv_dif2` | Decimal | 集团本币期初预留差异2 |
| `group_balance_stdamount` | `group_balance_stdamount` | Decimal | 集团本币结存标准价 |
| `group_init_reserv_dif1` | `group_init_reserv_dif1` | Decimal | 集团本币期初预留差异1 |
| `global_out_price` | `global_out_price` | Decimal | 全局本币出库单价 |
| `global_balance_amount` | `global_balance_amount` | Decimal | 全局本币结存金额 |
| `accbook_out_ipv_rate` | `accbook_out_ipv_rate` | Decimal | 账簿本币本期出库结算汇差 |
| `accbook_in_price` | `accbook_in_price` | Decimal | 账簿本币入库单价 |
| `control_in_this_stdamount` | `control_in_this_stdamount` | Decimal | 管控范围本币本期入库本层标准价 |
| `group_balance_this_stdamount` | `group_balance_this_stdamount` | Decimal | 集团本币结余本层标准价 |
| `accbook_init_this_ppv_dif` | `accbook_init_this_ppv_dif` | Decimal | 账簿本币期初本层业务差异 |
| `org_in_ipv_rate` | `org_in_ipv_rate` | Decimal | 组织本币本期入库结算汇差 |
| `global_out_this_price` | `global_out_this_price` | Decimal | 全局本币出库本层单价 |
| `accbook_in_reserv_dif2` | `accbook_in_reserv_dif2` | Decimal | 账簿本币本期入库预留差异2 |
| `group_in_this_amount` | `group_in_this_amount` | Decimal | 集团本币本期入库本层金额 |
| `accbook_in_reserv_dif1` | `accbook_in_reserv_dif1` | Decimal | 账簿本币本期入库预留差异1 |
| `org_balance_this_amount` | `org_balance_this_amount` | Decimal | 组织本币结余本层金额 |
| `accbook_init_reserv_dif2` | `accbook_init_reserv_dif2` | Decimal | 账簿本币期初预留差异2 |
| `group_in_ipv_dif` | `group_in_ipv_dif` | Decimal | 集团本币本期入库结算价差 |
| `accbook_balance_ipv_dif` | `accbook_balance_ipv_dif` | Decimal | 账簿本币结存结算价差 |
| `accbook_init_reserv_dif1` | `accbook_init_reserv_dif1` | Decimal | 账簿本币期初预留差异1 |
| `global_balance_ipv_rate` | `global_balance_ipv_rate` | Decimal | 全局本币结存结算汇差 |
| `control_balance_amount` | `control_balance_amount` | Decimal | 管控本币结存金额 |
| `group_balance_ppv_dif` | `group_balance_ppv_dif` | Decimal | 集团本币结存暂估差异 |
| `global_out_this_ppv_dif` | `global_out_this_ppv_dif` | Decimal | 全局本币本期出库本层业务差异 |
| `org_balance_price` | `org_balance_price` | Decimal | 组织本币结存单价 |
| `org_in_this_ppv_dif` | `org_in_this_ppv_dif` | Decimal | 组织本币本期入库本层业务差异 |
| `control_init_this_amount` | `control_init_this_amount` | Decimal | 管控范围本币期初本层金额 |
| `global_init_this_price` | `global_init_this_price` | Decimal | 全局本币期初本层单价 |
| `accbook_out_this_amount` | `accbook_out_this_amount` | Decimal | 账簿本币本期出库本层金额 |
| `group_init_ppd_dif` | `group_init_ppd_dif` | Decimal | 集团本币期初生产价格差异 |
| `group_init_this_stdamount` | `group_init_this_stdamount` | Decimal | 集团本币期初本层标准价 |
| `control_init_this_price` | `control_init_this_price` | Decimal | 管控范围本币期初本层单价 |
| `global_balance_this_ppd_dif` | `global_balance_this_ppd_dif` | Decimal | 全局本币结余本层生产价格差异 |
| `group_in_this_price` | `group_in_this_price` | Decimal | 集团本币入库本层单价 |
| `global_in_this_price` | `global_in_this_price` | Decimal | 全局本币入库本层单价 |
| `org_init_ppv_dif` | `org_init_ppv_dif` | Decimal | 组织本币期初暂估差异 |
| `accbook_out_stdamount` | `accbook_out_stdamount` | Decimal | 账簿本币本期出库标准价 |
| `org_out_ipv_dif` | `org_out_ipv_dif` | Decimal | 组织本币本期出库结算价差 |
| `control_init_price` | `control_init_price` | Decimal | 管控本币期初单价 |
| `accbook_out_ppd_dif` | `accbook_out_ppd_dif` | Decimal | 账簿本币本期出库生产价格差异 |
| `control_out_ppv_dif` | `control_out_ppv_dif` | Decimal | 管控范围本币本期出库暂估差异 |
| `global_out_ppd_dif` | `global_out_ppd_dif` | Decimal | 全局本币本期出库生产价格差异 |
| `group_init_this_amount` | `group_init_this_amount` | Decimal | 集团本币期初本层金额 |
| `accbook_balance_this_ppd_dif` | `accbook_balance_this_ppd_dif` | Decimal | 账簿本币结余本层生产价格差异 |
| `org_init_this_ppd_dif` | `org_init_this_ppd_dif` | Decimal | 组织本币期初本层生产价格差异 |
| `control_out_amount` | `control_out_amount` | Decimal | 管控范围本币本期出库金额 |
| `accbook_in_ipv_rate` | `accbook_in_ipv_rate` | Decimal | 账簿本币本期入库结算汇差 |
| `control_balance_this_price` | `control_balance_this_price` | Decimal | 管控范围本币结余本层单价 |
| `control_balance_stdamount` | `control_balance_stdamount` | Decimal | 管控范围本币结存标准价 |
| `control_balance_this_amount` | `control_balance_this_amount` | Decimal | 管控范围本币结余本层金额 |
| `org_init_this_stdamount` | `org_init_this_stdamount` | Decimal | 组织本币期初本层标准价 |
| `control_balance_ppv_dif` | `control_balance_ppv_dif` | Decimal | 管控范围本币结存暂估差异 |
| `global_in_amount` | `global_in_amount` | Decimal | 全局本币本期入库金额 |
| `control_out_this_price` | `control_out_this_price` | Decimal | 管控范围本币出库本层单价 |
| `control_in_stdamount` | `control_in_stdamount` | Decimal | 管控范围本币本期入库标准价 |
| `control_balance_reserv_dif2` | `control_balance_reserv_dif2` | Decimal | 管控范围本币结余预留差异2 |
| `control_balance_reserv_dif1` | `control_balance_reserv_dif1` | Decimal | 管控范围本币结余预留差异1 |
| `org_in_stdamount` | `org_in_stdamount` | Decimal | 组织本币本期入库标准价 |
| `global_balance_this_stdamount` | `global_balance_this_stdamount` | Decimal | 全局本币结余本层标准价 |
| `org_init_this_price` | `org_init_this_price` | Decimal | 组织本币期初本层单价 |
| `global_out_stdamount` | `global_out_stdamount` | Decimal | 全局本币本期出库标准价 |
| `control_out_price` | `control_out_price` | Decimal | 管控本币出库单价 |
| `accbook_in_this_ppd_dif` | `accbook_in_this_ppd_dif` | Decimal | 账簿本币本期入库本层生产价格差异 |
| `group_balance_this_ppd_dif` | `group_balance_this_ppd_dif` | Decimal | 集团本币结余本层生产价格差异 |
| `accbook_init_this_stdamount` | `accbook_init_this_stdamount` | Decimal | 账簿本币期初本层标准价 |
| `control_init_stdamount` | `control_init_stdamount` | Decimal | 管控范围本币期初标准价 |
| `accbook_out_this_stdamount` | `accbook_out_this_stdamount` | Decimal | 账簿本币本期出库本层标准价 |
| `org_in_this_amount` | `org_in_this_amount` | Decimal | 组织本币本期入库本层金额 |
| `global_out_ipv_dif` | `global_out_ipv_dif` | Decimal | 全局本币本期出库结算价差 |
| `accbook_in_this_price` | `accbook_in_this_price` | Decimal | 账簿本币入库本层单价 |
| `accbook_out_ipv_dif` | `accbook_out_ipv_dif` | Decimal | 账簿本币本期出库结算价差 |
| `accbook_out_this_price` | `accbook_out_this_price` | Decimal | 账簿本币出库本层单价 |
| `global_in_price` | `global_in_price` | Decimal | 全局本币入库单价 |
| `org_out_ipv_rate` | `org_out_ipv_rate` | Decimal | 组织本币本期出库结算汇差 |
| `group_out_ppd_dif` | `group_out_ppd_dif` | Decimal | 集团本币本期出库生产价格差异 |
| `org_balance_amount` | `org_balance_amount` | Decimal | 组织本币结存金额 |
| `org_out_this_ppv_dif` | `org_out_this_ppv_dif` | Decimal | 组织本币本期出库本层业务差异 |
| `in_num` | `in_num` | Decimal | 本期入库数量 |
| `group_out_this_ppd_dif` | `group_out_this_ppd_dif` | Decimal | 集团本币本期出库本层生产价格差异 |
| `org_in_this_price` | `org_in_this_price` | Decimal | 组织本币入库本层单价 |
| `group_in_ppd_dif` | `group_in_ppd_dif` | Decimal | 集团本币本期入库生产价格差异 |
| `org_in_this_stdamount` | `org_in_this_stdamount` | Decimal | 组织本币本期入库本层标准价 |
| `global_init_this_ppd_dif` | `global_init_this_ppd_dif` | Decimal | 全局本币期初本层生产价格差异 |
| `control_init_this_stdamount` | `control_init_this_stdamount` | Decimal | 管控范围本币期初本层标准价 |
| `control_in_price` | `control_in_price` | Decimal | 管控本币入库单价 |
| `accbook_init_this_amount` | `accbook_init_this_amount` | Decimal | 账簿本币期初本层金额 |
| `accbook_init_this_price` | `accbook_init_this_price` | Decimal | 账簿本币期初本层单价 |
| `org_init_ipv_dif` | `org_init_ipv_dif` | Decimal | 组织本币期初结算价差 |
| `global_init_ppd_dif` | `global_init_ppd_dif` | Decimal | 全局本币期初生产价格差异 |
| `accbook_balance_reserv_dif2` | `accbook_balance_reserv_dif2` | Decimal | 账簿本币结余预留差异2 |
| `accbook_balance_reserv_dif1` | `accbook_balance_reserv_dif1` | Decimal | 账簿本币结余预留差异1 |
| `accbook_in_this_stdamount` | `accbook_in_this_stdamount` | Decimal | 账簿本币本期入库本层标准价 |
| `group_in_ipv_rate` | `group_in_ipv_rate` | Decimal | 集团本币本期入库结算汇差 |
| `global_out_this_amount` | `global_out_this_amount` | Decimal | 全局本币本期出库本层金额 |
| `org_init_reserv_dif2` | `org_init_reserv_dif2` | Decimal | 组织本币期初预留差异2 |
| `org_init_reserv_dif1` | `org_init_reserv_dif1` | Decimal | 组织本币期初预留差异1 |
| `control_in_amount` | `control_in_amount` | Decimal | 管控范围本币本期入库金额 |
| `org_balance_reserv_dif1` | `org_balance_reserv_dif1` | Decimal | 组织本币结余预留差异1 |
| `org_balance_reserv_dif2` | `org_balance_reserv_dif2` | Decimal | 组织本币结余预留差异2 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 895cdfff-d682-4829-b9b3-60bf6604e1ac | 组件期间结存明细表 |
