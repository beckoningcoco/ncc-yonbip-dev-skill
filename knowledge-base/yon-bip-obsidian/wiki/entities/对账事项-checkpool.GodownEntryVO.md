---
tags: ["BIP", "元数据", "数据字典", "ycPurchaseSynergy", "check.checkpool.GodownEntryVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 对账事项 (`check.checkpool.GodownEntryVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycPurchaseSynergy 模块实体元数据字典。
> 物理表：`cpu_godownentry` | 所属应用：`ycPurchaseSynergy`
> 来源：元数据API `queryByUri` 返回的 `check.checkpool.GodownEntryVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 对账事项 |
| 物理表 | `cpu_godownentry` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycPurchaseSynergy` |
| 业务对象ID | `9fb641a8-be3b-45ff-bd91-7460562a1016` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 15:29:54.3700` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |
| 编码 | `erp_godown_no` | `erp_godown_no` | String | 来源单号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-01-23 23:41:47:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202512/202512161407_metadata_check-checkpool_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `e95b9d71-8b0e-4dfe-8421-f3c96ee2379a`

## 业务场景

- `FieldAuth`
- `workflow`
- `UITemplate`
- `DataAuth`
- `transtype`
- `report`
- `ruleengine`
- `userdefine`
- `api`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `dataAuth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 4 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 跨租户采购商租户接口 (`IBuyerTenant`) | `cpu.itf.IBuyerTenant` | 10 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 跨租户供应商租户接口 (`IVendorTenant`) | `cpu.itf.IVendorTenant` | 14 | 1 |

---

## 直接属性（共 129 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `GodownEntryVODefineCharacter` | 表头自定义项特征属性 | `godown_entry_define_character` | 3f2a0f94-7cc8-4568-be00-8e376a0681fe | `UserDefine` |  | ✓ |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String | `text` |  | ✓ |
| 3 | `checkUserName` | 对账人 | `check_user_name` | String | `text` |  | ✓ |
| 4 | `currencyCode` | 币种code | `currency_code` | String | `text` |  | ✓ |
| 5 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 6 | `currencyName` | 币种名称 | `currency_name` | String | `text` |  | ✓ |
| 7 | `currencySymbol` | 币种符号 | `currency_symbol` | String | `text` |  | ✓ |
| 8 | `dr` | 删除标识 | `dr` | Integer | `int` |  | ✓ |
| 9 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 10 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 11 | `erpTransName` | ERP交易类型名称 | `erp_trans_name` | String | `text` |  | ✓ |
| 12 | `negativeRows` | 是否负数行 | `negative_rows` | Boolean | `switch` |  | ✓ |
| 13 | `totalTaxMny` | 总含税金额 | `total_tax_mny` | Decimal | `number` |  | ✓ |
| 14 | `isAllowSupplier` | 是否允许供应商发起对账 | `is_allow_supplier` | String | `text` |  | ✓ |
| 15 | `invoiceAddress` | 收票地址 | `invoice_address` | String | `text` |  | ✓ |
| 16 | `isSupplyContract` | 是否供应商协同 | `is_supply_contract` | Boolean | `switch` |  | ✓ |
| 17 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 18 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String | `text` |  | ✓ |
| 19 | `erpTransCode` | ERP交易类型编码 | `erp_trans_code` | String | `text` |  | ✓ |
| 20 | `paymentProcess` | 付款流程 | `payment_process` | String | `text` |  | ✓ |
| 21 | `invoiceReceiverName` | 收票人 | `invoice_receiver_name` | String | `text` |  | ✓ |
| 22 | `transName` | 交易类型名称 | `trans_name` | String | `text` |  | ✓ |
| 23 | `invoiceReceiverMobile` | 收票人联系方式 | `invoice_receiver_phone` | String | `text` |  | ✓ |
| 24 | `invoiceReceiverId` | 收票人主键 | `invoice_receiver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 25 | `businessType` | 业务类型 | `business_type` | String | `text` |  | ✓ |
| 26 | `sourceid` | 上游单据主表主键 | `sourceid` | String | `text` |  | ✓ |
| 27 | `makeruleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 28 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 29 | `erpGodownId` | ERP单据主表id | `erp_godown_id` | String | `text` |  | ✓ |
| 30 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean | `switch` |  | ✓ |
| 31 | `godownStatus` | 上游单据状态 | `godown_status` | String | `text` |  | ✓ |
| 32 | `balanceStatus` | 对账状态 | `balance_status` | String | `text` |  | ✓ |
| 33 | `createTime` | 对账池数据创建时间 | `create_time` | DateTime | `timestamp` |  | ✓ |
| 34 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 35 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 36 | `purEnterpriseName` | 采购商租户名称 | `pur_enterprise_name` | String | `text` |  | ✓ |
| 37 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 38 | `supEnterpriseName` | 供应商租户名称 | `sup_enterprise_name` | String | `text` |  | ✓ |
| 39 | `erpSupplyId` | erp供应商ID | `erp_supply_id` | String | `text` |  | ✓ |
| 40 | `purorgId` | 采购组织主键 | `purorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 41 | `purorgCode` | 采购组织编码 | `purorg_code` | String | `text` |  | ✓ |
| 42 | `purorgName` | 采购组织名称 | `purorg_name` | String | `text` |  | ✓ |
| 43 | `purdeptId` | 采购部门主键 | `purdept_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 44 | `purdeptCode` | 采购部门编码 | `purdept_code` | String | `text` |  | ✓ |
| 45 | `purdeptName` | 采购部门名称 | `purdept_name` | String | `text` |  | ✓ |
| 46 | `purchaserId` | 采购员主键 | `purchaser_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 47 | `purchaserCode` | 采购员编码 | `purchaser_code` | String | `text` |  | ✓ |
| 48 | `purchaserName` | 采购员名称 | `purchaser_name` | String | `text` |  | ✓ |
| 49 | `supplyId` | 供应商主键 | `supply_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 50 | `supplyCode` | 供应商编码 | `supply_code` | String | `text` |  | ✓ |
| 51 | `supplyName` | 供应商名称 | `supply_name` | String | `text` |  | ✓ |
| 52 | `invoiceVendorId` | 开票供应商Id | `invoice_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 53 | `invoiceVendorCode` | 开票供应商编码 | `invoice_vendor_code` | String | `text` |  | ✓ |
| 54 | `invoiceVendorName` | 开票供应商名称 | `invoice_vendor_name` | String | `text` |  | ✓ |
| 55 | `ctrantypeid` | 入库类型id | `ctrantypeid` | String | `text` |  | ✓ |
| 56 | `vtrantypecode` | 入库类型编码 | `vtrantypecode` | String | `text` |  | ✓ |
| 57 | `ctrantypename` | 入库类型名称 | `ctrantypename` | String | `text` |  | ✓ |
| 58 | `erpStockorgId` | erp库存组织主键 | `erp_stockorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 59 | `erpWarehouse` | erp仓库 | `erp_warehouse` | String | `text` |  | ✓ |
| 60 | `erpWhsmanager` | erp库管员 | `erp_whsmanager` | String | `text` |  | ✓ |
| 61 | `erpPurchaserId` | erp采购员主键 | `erp_purchaser_id` | String | `text` |  | ✓ |
| 62 | `erpPurchaseorgId` | erp采购组织主键 | `erp_purchaseorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 63 | `erpPurchasedeptId` | erp采购部门主键 | `erp_purchasedept_id` | String | `text` |  | ✓ |
| 64 | `erpSourcebillType` | 入库单来源类型 | `erp_sourcebill_type` | String | `text` |  | ✓ |
| 65 | `erpFirstbillId` | 入库单源头 单据表头主键 | `erp_firstbill_id` | String | `text` |  | ✓ |
| 66 | `erpSourcebillId` | 入库单源头 单据表头主键 | `erp_sourcebill_id` | String | `text` |  | ✓ |
| 67 | `erpGroup` | erp组 | `erp_group` | String | `text` |  | ✓ |
| 68 | `totalNum` | 总数量 | `ntotal_num` | Decimal | `number` |  | ✓ |
| 69 | `erpFanaceorgOid` | 结算财务组织o | `erp_fanaceorg_oid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 70 | `erpFanaceorgVid` | 结算财务组织版本id | `erp_fanaceorg_vid` | String | `text` |  | ✓ |
| 71 | `erpCompanyId` | 公司主键 | `erp_company_id` | String | `text` |  | ✓ |
| 72 | `erpCompanyVid` | 公司V | `erp_company_vid` | String | `text` |  | ✓ |
| 73 | `erpStockorgVid` | 库存组织v | `erp_stockorg_vid` | String | `text` |  | ✓ |
| 74 | `erpRececountryId` | 收货国 | `erp_rececountryid` | String | `text` |  | ✓ |
| 75 | `erpSendCountryId` | 发货国 | `erp_sendCountryid` | String | `text` |  | ✓ |
| 76 | `freplenishflag` | 是否采购入库 | `freplenishflag` | String | `text` |  | ✓ |
| 77 | `erpPurchaseorgVid` | 采购组织V主键 | `erp_purchaseorg_vid` | String | `text` |  | ✓ |
| 78 | `erpPurchasedeptVid` | 采购部门V主键 | `erp_purchasedept_vid` | String | `text` |  | ✓ |
| 79 | `stockorgId` | 库存组织主键 | `stockorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 80 | `stockorgCode` | 库存组织编码 | `stockorg_code` | String | `text` |  | ✓ |
| 81 | `stockorgName` | 库存组织名称 | `stockorg_name` | String | `text` |  | ✓ |
| 82 | `hfanorgId` | 结算财务组织主键 | `hfanorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 83 | `hfanorgCode` | 结算财务组织编码 | `hfanorg_code` | String | `text` |  | ✓ |
| 84 | `hfanorgName` | 结算财务组织名称 | `hfanorg_name` | String | `text` |  | ✓ |
| 85 | `compCode` | 公司编码 | `comp_code` | String | `text` |  | ✓ |
| 86 | `compName` | 公司名称 | `comp_name` | String | `text` |  | ✓ |
| 87 | `hstoCode` | 仓库编码 | `hsto_code` | String | `text` |  | ✓ |
| 88 | `whpsnId` | 库管员主键 | `whpsn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 89 | `whpsnCode` | 库管员编码 | `whpsn_code` | String | `text` |  | ✓ |
| 90 | `bmakeuserId` | 制单用户主键 | `bmakeuser_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 91 | `bmakeuserCode` | 制单用户编码 | `bmakeuser_code` | String | `text` |  | ✓ |
| 92 | `bmakeuserName` | 制单用户名称 | `bmakeuser_name` | String | `text` |  | ✓ |
| 93 | `signpsnId` | 签字人主键 | `signpsn_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 94 | `signpsnCode` | 签字人编码 | `signpsn_code` | String | `text` |  | ✓ |
| 95 | `signpsnName` | 签字人名称 | `signpsn_name` | String | `text` |  | ✓ |
| 96 | `returnReason` | 返回结果 | `return_reason` | String | `text` |  | ✓ |
| 97 | `checkStatus` | 核对状态 | `check_status` | String | `text` |  | ✓ |
| 98 | `checkUserId` | 对账人Id | `check_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 99 | `checkDate` | 对账时间 | `check_date` | DateTime | `timestamp` |  | ✓ |
| 100 | `checkStaupdUserId` | 无需对账、开启对账操作人Id | `check_staupd_userid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 101 | `checkStaupdUserName` | 无需对账、开启对账操作人 | `check_staupd_username` | String | `text` |  | ✓ |
| 102 | `checkStaupdDate` | 无需对账、开启对账操作人时间 | `check_staupd_date` | DateTime | `timestamp` |  | ✓ |
| 103 | `checkStaupdBefore` | 无需对账、开启对账操作前状态 | `check_staupd_before` | String | `text` |  | ✓ |
| 104 | `businessProcess` | ERP业务流程 | `business_process` | String | `text` |  | ✓ |
| 105 | `poolType` | 来源单据类型 | `pool_type` | String | `text` |  | ✓ |
| 106 | `upcode` | 来源单号 | `erp_godown_no` | String | `text` |  | ✓ |
| 107 | `bizFlowId` | 来源业务流程id | `bizflow_id` | String | `text` |  | ✓ |
| 108 | `bizFlowName` | 来源业务流程名称 | `bizflow_name` | String | `text` |  | ✓ |
| 109 | `sourceDate` | 来源单据日期 | `godown_date` | DateTime | `timestamp` |  | ✓ |
| 110 | `hstoName` | 仓库名称 | `hsto_name` | String | `text` |  | ✓ |
| 111 | `whpsnName` | 库管员 | `whpsn_name` | String | `text` |  | ✓ |
| 112 | `billmarker` | 来源单据制单人 | `billmarker` | String | `text` |  | ✓ |
| 113 | `signaturer` | 来源单据审核人 | `signaturer` | String | `text` |  | ✓ |
| 114 | `dmakedate` | 来源单据制单日期 | `dmakedate` | DateTime | `timestamp` |  | ✓ |
| 115 | `signDate` | 来源单据审核日期 | `sign_date` | DateTime | `timestamp` |  | ✓ |
| 116 | `memo` | 表头备注 | `hmemo` | String | `text` |  | ✓ |
| 117 | `sourceTransType` | 来源交易类型 | `source_trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 118 | `sourceTransName` | 来源交易类型名称 | `source_trans_name` | String | `text` |  | ✓ |
| 119 | `def1` | 自定义项1 | `def1` | String | `text` |  | ✓ |
| 120 | `def2` | 自定义项2 | `def2` | String | `text` |  | ✓ |
| 121 | `def3` | 自定义项3 | `def3` | String | `text` |  | ✓ |
| 122 | `def4` | 自定义项4 | `def4` | String | `text` |  | ✓ |
| 123 | `def5` | 自定义项5 | `def5` | String | `text` |  | ✓ |
| 124 | `hstoId` | 仓库id | `hsto_id` | Long | `long` |  | ✓ |
| 125 | `isDeliveryBrand` | 是否允许反馈发货品牌 | `is_delivery_brand` | Boolean | `switch` |  | ✓ |
| 126 | `defines` | 对账事项主表自定义项 | `` | d579edfa-0b68-4734-b66a-c4e06d3cfb5e | `` |  |  |
| 127 | `details` | 对账事项表体 | `` | ab07448d-8aa8-4c93-9981-1d80f2638c0e | `` |  |  |
| 128 | `integrationType` | 集成类型 | `integration_type` | String | `text` |  | ✓ |
| 129 | `sourceSignDate` | 来源单据签收日期 | `source_sign_date` | Date | `date` |  | ✓ |

---

## 关联属性（共 25 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `purdeptId` | 采购部门主键 | `org.func.BaseOrg` | `purdept_id` |  →  |  |  | Service |  |
| 2 | `checkUserId` | 对账人Id | `bd.staff.Staff` | `check_user_id` |  →  |  |  | Service |  |
| 3 | `whpsnId` | 库管员主键 | `bd.staff.Staff` | `whpsn_id` |  →  |  |  | Service |  |
| 4 | `bmakeuserId` | 制单用户主键 | `cpu-privilege.user.MgrUser` | `bmakeuser_id` |  →  |  |  | Service |  |
| 5 | `GodownEntryVODefineCharacter` | 表头自定义项特征属性 | `check.checkpool.UserDefineCharacteristics` | `godown_entry_define_character` |  →  |  |  | None |  |
| 6 | `erpStockorgId` | erp库存组织主键 | `org.func.BaseOrg` | `erp_stockorg_id` |  →  |  |  | Service |  |
| 7 | `defines` | 对账事项主表自定义项 | `check.checkpool.GodownEntryVODefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 8 | `stockorgId` | 库存组织主键 | `org.func.BaseOrg` | `stockorg_id` |  →  |  |  | Service |  |
| 9 | `details` | 对账事项表体 | `check.checkpool.GodownEntryDetailVO` | `` | details → godownentryId | 1..n | true | None |  |
| 10 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 11 | `hfanorgId` | 结算财务组织主键 | `org.func.BaseOrg` | `hfanorg_id` |  →  |  |  | Service |  |
| 12 | `invoiceVendorId` | 开票供应商Id | `aa.vendor.Vendor` | `invoice_vendor_id` |  →  |  |  | Service |  |
| 13 | `purorgId` | 采购组织主键 | `org.func.BaseOrg` | `purorg_id` |  →  |  |  | Service |  |
| 14 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 15 | `invoiceReceiverId` | 收票人主键 | `bd.staff.Staff` | `invoice_receiver_id` |  →  |  |  | Service |  |
| 16 | `sourceTransType` | 来源交易类型 | `bd.bill.TransType` | `source_trans_type` |  →  |  |  | Service |  |
| 17 | `purEnterpriseId` | 采购商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | `pur_enterprise_id` |  →  |  |  | Service |  |
| 18 | `erpFanaceorgOid` | 结算财务组织o | `org.func.BaseOrg` | `erp_fanaceorg_oid` |  →  |  |  | Service |  |
| 19 | `purchaserId` | 采购员主键 | `bd.staff.Staff` | `purchaser_id` |  →  |  |  | Service |  |
| 20 | `checkStaupdUserId` | 无需对账、开启对账操作人Id | `bd.staff.Staff` | `check_staupd_userid` |  →  |  |  | Service |  |
| 21 | `transType` | 交易类型 | `bd.bill.TransType` | `trans_type` |  →  |  |  | Service |  |
| 22 | `supplyId` | 供应商主键 | `aa.vendor.Vendor` | `supply_id` |  →  |  |  | Service |  |
| 23 | `signpsnId` | 签字人主键 | `cpu-privilege.user.MgrUser` | `signpsn_id` |  →  |  |  | Service |  |
| 24 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | `sup_enterprise_id` |  →  |  |  | Service |  |
| 25 | `erpPurchaseorgId` | erp采购组织主键 | `org.func.BaseOrg` | `erp_purchaseorg_id` |  →  |  |  | Service |  |

### Composition（子表）

- **defines**: `defines` → `check.checkpool.GodownEntryVODefine` | 1 ⚠️ 已废弃
- **details**: `details` → `check.checkpool.GodownEntryDetailVO` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `purdeptId` (采购部门主键) | `org.func.BaseOrg` | `purdept_id` |
| `checkUserId` (对账人Id) | `bd.staff.Staff` | `check_user_id` |
| `whpsnId` (库管员主键) | `bd.staff.Staff` | `whpsn_id` |
| `bmakeuserId` (制单用户主键) | `cpu-privilege.user.MgrUser` | `bmakeuser_id` |
| `erpStockorgId` (erp库存组织主键) | `org.func.BaseOrg` | `erp_stockorg_id` |
| `stockorgId` (库存组织主键) | `org.func.BaseOrg` | `stockorg_id` |
| `currencyId` (币种id) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `hfanorgId` (结算财务组织主键) | `org.func.BaseOrg` | `hfanorg_id` |
| `invoiceVendorId` (开票供应商Id) | `aa.vendor.Vendor` | `invoice_vendor_id` |
| `purorgId` (采购组织主键) | `org.func.BaseOrg` | `purorg_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `invoiceReceiverId` (收票人主键) | `bd.staff.Staff` | `invoice_receiver_id` |
| `sourceTransType` (来源交易类型) | `bd.bill.TransType` | `source_trans_type` |
| `purEnterpriseId` (采购商租户id) | `cpu-privilege.enterprise.EnterprisePOJO` | `pur_enterprise_id` |
| `erpFanaceorgOid` (结算财务组织o) | `org.func.BaseOrg` | `erp_fanaceorg_oid` |
| `purchaserId` (采购员主键) | `bd.staff.Staff` | `purchaser_id` |
| `checkStaupdUserId` (无需对账、开启对账操作人Id) | `bd.staff.Staff` | `check_staupd_userid` |
| `transType` (交易类型) | `bd.bill.TransType` | `trans_type` |
| `supplyId` (供应商主键) | `aa.vendor.Vendor` | `supply_id` |
| `signpsnId` (签字人主键) | `cpu-privilege.user.MgrUser` | `signpsn_id` |
| `supEnterpriseId` (供应商租户id) | `cpu-privilege.enterprise.EnterprisePOJO` | `sup_enterprise_id` |
| `erpPurchaseorgId` (erp采购组织主键) | `org.func.BaseOrg` | `erp_purchaseorg_id` |
