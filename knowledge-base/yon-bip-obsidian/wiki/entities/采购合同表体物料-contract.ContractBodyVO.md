---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contract.ContractBodyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同表体物料 (`cpu-contract.contract.ContractBodyVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycContractManagement 模块实体元数据字典。
> 物理表：`cpu_ct_material` | 所属应用：`ycContractManagement`
> 来源：元数据API `queryByUri` 返回的 `cpu-contract.contract.ContractBodyVO` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同表体物料 |
| 物理表 | `cpu_ct_material` |
| 数据库 schema | `cpu-contract` |
| 所属应用 | `ycContractManagement` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:16:13.6140` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `id` | `id` | Long | ID |

## 部署信息

- **部署时间**: 2026-05-23 00:06:16:000
- **安装来源**: `/app/data_scripts/cpu-cooperation-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_cpu_cooperation/0010_iuap_common/DML/0270_iuap_metadata/202601/202601301002_metadata_cpu-contract-contract_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3a9672a3-ad65-480b-aac0-a48abe65a9f5`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 行关闭信息 (`ILineClosing`) | `base.itf.ILineClosing` | 92 | 2 |
| 2 | 生单回写 (`IBackWrite`) | `base.itf.IBackWrite` | 254 | 7 |
| 3 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 4 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 5 | 项目结构属性 (`projectStructureProperties`) | `BGDM.wbs.projectStructureProperties` | 49 | 2 |

---

## 直接属性（共 189 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `groupTaskKey` | 分组任务标识 | `groupTaskKey` | String | `text` |  | ✓ |
| 2 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String | `text` |  | ✓ |
| 3 | `source` | 上游单据类型 | `source` | String | `text` |  | ✓ |
| 4 | `sourceMainPubts` | 来源单据主表时间戳 | `sourceMainPubts` | DateTime | `timestamp` |  | ✓ |
| 5 | `sourceautoid` | 上游单据子表主键 | `sourceautoid` | Long | `long` |  | ✓ |
| 6 | `sourceid` | 上游单据主表主键 | `sourceid` | Long | `long` |  | ✓ |
| 7 | `upcode` | 上游单据号 | `upcode` | String | `text` |  | ✓ |
| 8 | `costQuoteGroupId` | 成本项报价组主键 | `cost_quote_group_id` | 2b728cc3-82ca-4e8f-8b98-49f9f1df7acd | `quote` |  | ✓ |
| 9 | `pritemidErpProductVersion` | 需求来源类型 | `erp_product_version` | String | `text` |  | ✓ |
| 10 | `sourcebid` | 需求来源子表主键 | `sourcebid` | String | `text` |  | ✓ |
| 11 | `sourcehid` | 需求来源主表主键 | `sourcehid` | String | `text` |  | ✓ |
| 12 | `ContractBodyVODefineCharacter` | 合同物料明细行特征 | `defineCharacter` | fc837e06-6b78-4dcb-adfb-8e0e74e12f1f | `UserDefine` |  | ✓ |
| 13 | `ContractBodyVOFreeCharacteristics` | 合同物料自由项特征组 | `instance_id` | 92e74a9c-8ac2-49e1-b524-e8f0d8e62190 | `FreeCT` |  | ✓ |
| 14 | `qualitypriceId` | 优质优价方案主键 | `qualityprice_id` | c7cc8895-2b03-4c7d-a327-da6e09410f76 | `quote` |  | ✓ |
| 15 | `singleBudgetApplyId` | 单项预算申请单主键 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 | `quote` |  | ✓ |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | ✓ | ✓ |
| 17 | `processesId` | 工序主键 | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 | `quote` |  | ✓ |
| 18 | `lineCloseReason` | 行关闭原因 | `line_close_reason` | String | `text` |  | ✓ |
| 19 | `occupiedByProductSupply` | 下推商品供货清单状态 | `occupied_by_product_supply` | String | `text` |  | ✓ |
| 20 | `linecloser` | 行关闭人 | `linecloser` | String | `text` |  | ✓ |
| 21 | `linecloseTime` | 行关闭时间 | `lineclose_time` | DateTime | `timestamp` |  | ✓ |
| 22 | `descrMaterialMark` | 描述性物料标识:1是,0否 | `descr_material_mark` | Integer | `int` |  | ✓ |
| 23 | `lineStatus` | 行状态 | `line_status` | Short | `short` |  | ✓ |
| 24 | `costTemplateId` | 成本项报价模版ID | `cost_template_id` | 89305c8c-fd63-410b-a9d4-4a1dde15ef7a | `quote` |  | ✓ |
| 25 | `cumulativeMoney` | 累计下单无税金额 | `cumulative_money` | Decimal | `number` |  | ✓ |
| 26 | `cumulativeTaxMoney` | 累计下单含税金额 | `cumulative_tax_money` | Decimal | `number` |  | ✓ |
| 27 | `materialCode` | 物料编码 | `material_code` | String | `text` |  | ✓ |
| 28 | `reqDeptName` | 需求部门名称 | `req_dept_name` | String | `text` |  | ✓ |
| 29 | `executionStatus` | 行执行状态 | `execution_status` | Integer | `int` |  | ✓ |
| 30 | `materialName` | 物料名称 | `material_name` | String | `text` |  | ✓ |
| 31 | `isOnShelf` | 是否超市上架 | `is_on_shelf` | Boolean | `switch` |  | ✓ |
| 32 | `discountTaxType` | 扣税类别 | `discount_tax_type` | Integer | `int` |  | ✓ |
| 33 | `priceMark` | 价格标识 | `price_mark` | Integer | `int` |  | ✓ |
| 34 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 | `quote` |  | ✓ |
| 35 | `activity` | 项目活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 | `quote` |  | ✓ |
| 36 | `natTaxPrice` | 本币含税单价 | `nat_tax_price` | Decimal | `number` |  | ✓ |
| 37 | `firstSrcLineId` | 源头单据子表主键 | `first_src_line_id` | Long | `long` |  | ✓ |
| 38 | `erpApplyorderType` | ERP请购单类型 | `erp_applyorder_type` | String | `text` |  | ✓ |
| 39 | `reqUapProjectId` | 平台项目档案主键 | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 40 | `natPrice` | 本币无税单价 | `nat_price` | Decimal | `number` |  | ✓ |
| 41 | `firstSrc` | 源头单据类型 | `first_src` | String | `text` |  | ✓ |
| 42 | `internalFileId` | 内控附件 | `internal_file_id` | String | `attachment` |  | ✓ |
| 43 | `natTaxMoney` | 本币含税金额 | `nat_tax_money` | Decimal | `number` |  | ✓ |
| 44 | `firstSrcLineNo` | 源头单据子表行号 | `first_src_line_no` | String | `text` |  | ✓ |
| 45 | `applyorderBid` | 请购单子表主键 | `applyorder_bid` | String | `text` |  | ✓ |
| 46 | `natMoney` | 本币无税金额 | `nat_money` | Decimal | `number` |  | ✓ |
| 47 | `natTax` | 本币税额 | `nat_tax` | Decimal | `number` |  | ✓ |
| 48 | `firstSrcId` | 源头单据主表主键 | `first_src_id` | Long | `long` |  | ✓ |
| 49 | `applyorderHid` | 请购单主表主键 | `applyorder_hid` | String | `text` |  | ✓ |
| 50 | `tax` | 税额 | `tax` | Decimal | `number` |  | ✓ |
| 51 | `externalFileId` | 对外附件 | `external_file_id` | String | `attachment` |  | ✓ |
| 52 | `costCenterId` | 成本中心 | `cost_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |  | ✓ |
| 53 | `firstSrcCode` | 源头单据号 | `first_src_code` | String | `text` |  | ✓ |
| 54 | `requireId` | 采购需求主键 | `require_id` | Long | `long` |  | ✓ |
| 55 | `srcBillRowNum` | 来源单据行号 | `src_bill_rowno` | Integer | `int` |  | ✓ |
| 56 | `singleBudgetApplyBid` | 单项预算申请单明细 | `single_budget_applybid` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb | `quote` |  | ✓ |
| 57 | `expenseItemId` | 费用项目 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | ✓ |
| 58 | `firstBillRowno` | 源头单据行号 | `first_bill_rowno` | Long | `long` |  | ✓ |
| 59 | `formulaId` | 价格公式主键 | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |  | ✓ |
| 60 | `formulaName` | 价格公式 | `formula_name` | String | `text` |  | ✓ |
| 61 | `id` | ID | `id` | Long | `long` |  | ✓ |
| 62 | `quotaPercentage` | 配额百分比 | `quota_percentage` | Decimal | `number` |  | ✓ |
| 63 | `quotaProportion` | 配额比例 | `quota_proportion` | Decimal | `number` |  | ✓ |
| 64 | `reqDeptId` | 需求部门主键 | `req_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 65 | `materialId` | 物料主键 | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 66 | `materialClassId` | 物料分类主键 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 | `quote` |  | ✓ |
| 67 | `skuId` | SKU主键 | `sku_id` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 | `quote` |  | ✓ |
| 68 | `materialClassName` | 物料分类名称 | `material_class_name` | String | `text` |  | ✓ |
| 69 | `materialClassCode` | 物料分类编码 | `material_class_code` | String | `text` |  | ✓ |
| 70 | `model` | 型号 | `model` | String | `text` |  | ✓ |
| 71 | `spec` | 规格 | `spec` | String | `text` |  | ✓ |
| 72 | `materialDesc` | 物料描述 | `material_desc` | String | `text` |  | ✓ |
| 73 | `purchaseNum` | 采购数量 | `purchase_num` | Decimal | `number` |  | ✓ |
| 74 | `purchaseUnitName` | 采购单位名称 | `purchase_unit_name` | String | `text` |  | ✓ |
| 75 | `price` | 无税单价 | `price` | Decimal | `number` |  | ✓ |
| 76 | `taxrate` | 税率 | `taxrate` | Decimal | `number` |  | ✓ |
| 77 | `taxCategoryId` | 税目税种主键 | `tax_category_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 78 | `taxPrice` | 含税单价 | `tax_price` | Decimal | `number` |  | ✓ |
| 79 | `money` | 无税金额 | `money` | Decimal | `number` |  | ✓ |
| 80 | `taxMoney` | 含税金额 | `tax_money` | Decimal | `number` |  | ✓ |
| 81 | `productId` | 商品主键(废弃) | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 82 | `productName` | 商品sku详细属性信息 | `product_name` | String | `text` |  | ✓ |
| 83 | `reqOrgId` | 需求组织主键 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 84 | `reqOrgName` | 需求公司名称 | `req_org_name` | String | `text` |  | ✓ |
| 85 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 86 | `enterpriseId` | 所属租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 | `quote` |  | ✓ |
| 87 | `deliveryAddress` | 物料收货地址 | `delivery_address` | String | `text` |  | ✓ |
| 88 | `planArriveDate` | 计划到货日期 | `plan_arrive_date` | DateTime | `timestamp` |  | ✓ |
| 89 | `priceValidateDate` | 价格有效期 | `price_validate_date` | Date | `date` |  | ✓ |
| 90 | `refNo` | 目的是为了区分这个需求是哪一个分包商提的 | `ref_no` | String | `text` |  | ✓ |
| 91 | `pritemid` | 采购需求主键 | `pritemid` | Long | `long` |  | ✓ |
| 92 | `suppProductName` | 询价供应商 报价商品名称  (品牌/产地/材质) | `supp_product_name` | String | `text` |  | ✓ |
| 93 | `stockCycle` | 备货周期 | `stock_cycle` | String | `text` |  | ✓ |
| 94 | `supplyDelivery` | 交货方式说明 | `supply_delivery` | String | `text` |  | ✓ |
| 95 | `supplyOfferDes` | 报价说明 | `supply_offer_des` | String | `text` |  | ✓ |
| 96 | `supplyPayment` | 付款方式 | `supply_payment` | String | `text` |  | ✓ |
| 97 | `rowNum` | 行号 | `lineno` | Decimal | `number` |  | ✓ |
| 98 | `erpCtCode` | ERP合同编码 | `erp_ct_code` | String | `text` |  | ✓ |
| 99 | `ERPProjectName` | Erp项目名称 | `erp_project_name` | String | `text` |  | ✓ |
| 100 | `taxFullPrice` | 含税单价全额预付 | `tax_full_price` | Decimal | `number` |  | ✓ |
| 101 | `taxFullMoney` | 含税总价全额预付 | `tax_full_money` | Decimal | `number` |  | ✓ |
| 102 | `taxPartialPrice` | 含税单价部分预付 | `tax_partial_price` | Decimal | `number` |  | ✓ |
| 103 | `taxPartialMoney` | 含税总价部分预付 | `tax_partial_money` | Decimal | `number` |  | ✓ |
| 104 | `brand` | 品牌 | `brand` | String | `text` |  | ✓ |
| 105 | `benchmarkType` | 基准价参考 | `benchmark_type` | String | `text` |  | ✓ |
| 106 | `settlementType` | 结算基准日 | `settlement_type` | String | `text` |  | ✓ |
| 107 | `province_id` | 参考地区-省 | `province_id` | Long | `long` |  | ✓ |
| 108 | `city_id` | 参考地区-市 | `city_id` | Long | `long` |  | ✓ |
| 109 | `district_id` | 参考地区-区 | `district_id` | Long | `long` |  | ✓ |
| 110 | `addressName` | 参考地区显示 | `address_name` | String | `text` |  | ✓ |
| 111 | `taxlessFullPrice` | 无税单价全额预付 | `taxless_full_price` | Decimal | `number` |  | ✓ |
| 112 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal | `number` |  | ✓ |
| 113 | `taxlessPartialPrice` | 无税单价部分预付 | `taxless_partial_price` | Decimal | `number` |  | ✓ |
| 114 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal | `number` |  | ✓ |
| 115 | `receiveOrgId` | 收货组织主键 | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 116 | `receiveOrgName` | 收货组织名称 | `receive_org_name` | String | `text` |  | ✓ |
| 117 | `releasedBudgetMny` | 应释放单项预算占用无税金额 | `released_budget_mny` | Decimal | `number` |  | ✓ |
| 118 | `receivePersonId` | 收货人主键 | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 119 | `releasedBudgetTaxmny` | 应释放单项预算占用金额 | `released_budget_taxmny` | Decimal | `number` |  | ✓ |
| 120 | `receivePersonName` | 收货人姓名 | `receive_person_name` | String | `text` |  | ✓ |
| 121 | `receivePersonTel` | 收货人电话 | `receive_person_tel` | String | `text` |  | ✓ |
| 122 | `srcBillType` | 源头单据类型 | `src_billtype` | String | `text` |  | ✓ |
| 123 | `srcBillcode` | 源头单据编号 | `src_billcode` | String | `text` |  | ✓ |
| 124 | `firstBillType` | 源头单据类型 | `first_billtype` | String | `text` |  | ✓ |
| 125 | `firstBillcode` | 源头单据编号 | `first_billcode` | String | `text` |  | ✓ |
| 126 | `reqSrcBillCode` | 采购需求来源单号 | `req_src_billcode` | String | `text` |  | ✓ |
| 127 | `reqSrcRowNo` | 采购需求来源行号 | `req_src_rowno` | String | `text` |  | ✓ |
| 128 | `overExecRate` | 超量执行比例 | `over_exec_rate` | Decimal | `number` |  | ✓ |
| 129 | `enableExecNum` | 可执行数量 | `enable_exec_num` | Decimal | `number` |  | ✓ |
| 130 | `changingAction` | 变更动作 | `changing_action` | String | `text` |  | ✓ |
| 131 | `changingInfo` | 变更信息 | `changing_info` | String | `text` |  | ✓ |
| 132 | `reqPlanDeptName` | 需求计划部门名称 | `req_plan_deptname` | String | `text` |  | ✓ |
| 133 | `reqPlanDeptId` | 需求计划部门主键 | `req_plan_deptid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 134 | `reqPlanPsnId` | 需求计划员主键 | `req_plan_psnid` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 135 | `reqContact` | 需求人名称 | `b_req_contact` | String | `text` |  | ✓ |
| 136 | `reqContactId` | 需求人主键 | `b_req_contact_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 137 | `reqDate` | 需求时间 | `req_date` | DateTime | `timestamp` |  | ✓ |
| 138 | `reqErpRelatedInfo` | ERP相关信息 | `req_erp_related_info` | String | `text` |  | ✓ |
| 139 | `erpCtid` | ERP合同主键 | `erp_ct_id` | String | `text` |  | ✓ |
| 140 | `reqId` | 采购需求主键 | `reqid` | Long | `long` |  | ✓ |
| 141 | `priceValidateStartdate` | 价格有效期开始日期 | `price_validate_startdate` | Date | `date` |  | ✓ |
| 142 | `brandId` | 品牌主键 | `brand_id` | 75116b40-efe4-455e-b62d-d56ac4811eb1 | `quote` |  | ✓ |
| 143 | `brandCode` | 品牌编码 | `brand_code` | String | `text` |  | ✓ |
| 144 | `brandErpId` | 品牌ERP主键 | `brand_erp_id` | String | `text` |  | ✓ |
| 145 | `unitid` | 计价单位主键 | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 146 | `srcBillId` | 源头单据主键 | `src_bill_id` | Long | `long` |  | ✓ |
| 147 | `srcBillBid` | 源头单据子表主键 | `src_bill_bid` | Long | `long` |  | ✓ |
| 148 | `firstBillId` | 源头单据主键 | `first_bill_id` | Long | `long` |  | ✓ |
| 149 | `firstBillBid` | 源头单据子表主键 | `first_bill_bid` | Long | `long` |  | ✓ |
| 150 | `allowDecreasePriceRatio` | 允许调价比例() | `allow_decrease_price_ratio` | Decimal | `number` |  | ✓ |
| 151 | `allowIncreasePriceRatio` | 允许调价比例(+) | `allow_increase_price_ratio` | Decimal | `number` |  | ✓ |
| 152 | `takerOrgName` | 收票组织名称 | `taker_orgname` | String | `text` |  | ✓ |
| 153 | `takerOrgId` | 收票组织主键 | `taker_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 154 | `takerOrgCode` | 收票组织编码 | `taker_orgcode` | String | `text` |  | ✓ |
| 155 | `purchaseUnitId` | 采购单位主键 | `purchase_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 156 | `purchaseUnitCode` | 采购单位编码 | `purchase_unit_code` | String | `text` |  | ✓ |
| 157 | `purchaseExchRate` | 采购换算率 | `purchase_exch_rate` | Decimal | `number` |  | ✓ |
| 158 | `mainNum` | 主数量 | `main_num` | Decimal | `number` |  | ✓ |
| 159 | `mainMetrologyName` | 主计量单位名称 | `main_metrology_name` | String | `text` |  | ✓ |
| 160 | `mainMetrologyId` | 主计量单位主键 | `main_metrology_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 161 | `mainMetrologyCode` | 主计量单位编码 | `main_metrology_code` | String | `text` |  | ✓ |
| 162 | `unitCode` | 计价单位编码 | `unit_code` | String | `text` |  | ✓ |
| 163 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal | `number` |  | ✓ |
| 164 | `accomplishedQuantity` | 已下单主数量 | `accomplished_quantity` | Decimal | `number` |  | ✓ |
| 165 | `num` | 计价数量 | `num` | Decimal | `number` |  | ✓ |
| 166 | `unit` | 计价单位名称 | `unit` | String | `text` |  | ✓ |
| 167 | `gift` | 赠品 | `gift` | String | `text` |  | ✓ |
| 168 | `ERPProjectId` | Erp子表项目档案主键 | `erp_project_id` | String | `text` |  | ✓ |
| 169 | `erpCtbid` | ERP合同子表主键 | `erp_ct_bid` | String | `text` |  | ✓ |
| 170 | `skuUrl` | 商品图片 | `sku_url` | String | `text` |  | ✓ |
| 171 | `shelfLife` | 质保期 | `shelf_life` | Integer | `int` |  | ✓ |
| 172 | `ts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 173 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 174 | `contractId` | 合同主表主键 | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 175 | `dimensionPricingId` | 价格目录数据主键 | `dimension_pricing_id` | String | `text` |  | ✓ |
| 176 | `priceStrategy` | 取价策略主键 | `price_strategy` | 3dab7aea-9e18-4a82-8712-f029fd1ec393 | `quote` |  | ✓ |
| 177 | `payContractId` | 付款合同 | `pay_contract_id` | String | `text` |  | ✓ |
| 178 | `payContractBid` | 付款合同表体 | `pay_contract_bid` | String | `text` |  | ✓ |
| 179 | `cpuContractSkuext` | 合同物料SKU属性扩展表 | `` | b52cb406-fc77-4108-988a-6f9baddd9754 | `` |  |  |
| 180 | `defines` | 采购合同表体自定义项 | `` | ee8b39de-b7c7-411f-862d-68b1cd831c35 | `` |  |  |
| 181 | `materialExt` | 表体物料扩展表 | `` | 5fb7505b-20ec-49ad-a810-9fa82b323f5b | `` |  |  |
| 182 | `natWithholdingTax` | 本币代扣税额 | `nat_withholding_tax` | Decimal | `number` |  | ✓ |
| 183 | `oriWithholdingTax` | 代扣税额 | `ori_withholding_tax` | Decimal | `number` |  | ✓ |
| 184 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal | `number` |  | ✓ |
| 185 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal | `number` |  | ✓ |
| 186 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 187 | `purchaseExchRateDen` | 采购换算率分母 | `purchase_exch_rateden` | Decimal | `number` |  | ✓ |
| 188 | `purchaseExchRateNum` | 采购换算率分子 | `purchase_exch_ratenum` | Decimal | `number` |  | ✓ |
| 189 | `taxCodeId` | 税码 | `tax_code_id` | 3f7c3856-5b00-4506-b458-a64eed0d3bfb | `quote` |  | ✓ |

---

## 关联属性（共 39 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `expenseItemId` | 费用项目 | `bd.expenseitem.ExpenseItem` | `expense_item_id` |  →  |  |  | Service |  |
| 2 | `processesId` | 工序主键 | `ed.operation.Operation` | `processes_id` |  →  |  |  | Service |  |
| 3 | `reqDeptId` | 需求部门主键 | `org.func.BaseOrg` | `req_dept_id` |  →  |  |  | Service |  |
| 4 | `activity` | 项目活动 | `pgrm.projecttask.ProjectScheduleTask` | `activity` |  →  |  |  | Service |  |
| 5 | `reqPlanDeptId` | 需求计划部门主键 | `org.func.BaseOrg` | `req_plan_deptid` |  →  |  |  | Service |  |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | `wbs` |  →  |  |  | Service |  |
| 7 | `singleBudgetApplyId` | 单项预算申请单主键 | `znbzbx.memoapply.MemoApplyVO` | `single_budget_applyid` |  →  |  |  | Service |  |
| 8 | `defines` | 采购合同表体自定义项 | `cpu-contract.contract.ContractBodyVODefine` | `` | defines → id | 1 | true | None | ⚠️ |
| 9 | `priceStrategy` | 取价策略主键 | `aa.pricestrategy.PriceStrategy` | `price_strategy` |  →  |  |  | Service |  |
| 10 | `costCenterId` | 成本中心 | `bd.costcenter.CostCenter` | `cost_center_id` |  →  |  |  | Service |  |
| 11 | `reqOrgId` | 需求组织主键 | `org.func.BaseOrg` | `req_org_id` |  →  |  |  | Service |  |
| 12 | `skuId` | SKU主键 | `pc.product.ProductSKU` | `sku_id` |  →  |  |  | Service |  |
| 13 | `purchaseUnitId` | 采购单位主键 | `pc.unit.Unit` | `purchase_unit_id` |  →  |  |  | Service |  |
| 14 | `reqUapProjectId` | 平台项目档案主键 | `bd.project.ProjectVO` | `req_uap_project_id` |  →  |  |  | Service |  |
| 15 | `receiveOrgId` | 收货组织主键 | `org.func.BaseOrg` | `receive_org_id` |  →  |  |  | Service |  |
| 16 | `materialClassId` | 物料分类主键 | `pc.cls.ManagementClass` | `material_class_id` |  →  |  |  | Service |  |
| 17 | `productId` | 商品主键(废弃) | `pc.product.Product` | `product_id` |  →  |  |  | Service |  |
| 18 | `costQuoteGroupId` | 成本项报价组主键 | `aa.costquote.CpuCostPricing` | `cost_quote_group_id` |  →  |  |  | Service |  |
| 19 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | `ytenant_id` |  →  |  |  | Service |  |
| 20 | `singleBudgetApplyBid` | 单项预算申请单明细 | `znbzbx.memoapply.MemoApplyBVO` | `single_budget_applybid` |  →  |  |  | Service |  |
| 21 | `ContractBodyVOFreeCharacteristics` | 合同物料自由项特征组 | `cpu-contract.contract.CTCharacteristicsDefine` | `instance_id` |  →  |  |  | None |  |
| 22 | `takerOrgId` | 收票组织主键 | `org.func.BaseOrg` | `taker_orgid` |  →  |  |  | Service |  |
| 23 | `costTemplateId` | 成本项报价模版ID | `aa.costitem.CostItemTemplate` | `cost_template_id` |  →  |  |  | Service |  |
| 24 | `materialId` | 物料主键 | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 25 | `reqContactId` | 需求人主键 | `bd.staff.Staff` | `b_req_contact_id` |  →  |  |  | Service |  |
| 26 | `taxCodeId` | 税码 | `taxpubdoc.taxengine.TaxCode` | `tax_code_id` |  →  |  |  | Service |  |
| 27 | `reqPlanPsnId` | 需求计划员主键 | `bd.staff.Staff` | `req_plan_psnid` |  →  |  |  | Service |  |
| 28 | `mainMetrologyId` | 主计量单位主键 | `pc.unit.Unit` | `main_metrology_id` |  →  |  |  | Service |  |
| 29 | `ContractBodyVODefineCharacter` | 合同物料明细行特征 | `cpu-contract.contract.CTCharacterDefine` | `defineCharacter` |  →  |  |  | None |  |
| 30 | `receivePersonId` | 收货人主键 | `bd.staff.Staff` | `receive_person_id` |  →  |  |  | Service |  |
| 31 | `formulaId` | 价格公式主键 | `aa.priceformula.PriceFormula` | `formula_id` |  →  |  |  | Service |  |
| 32 | `materialExt` | 表体物料扩展表 | `cpu-contract.contract.ContractMaterialExt` | `` | materialExt → id | 1 | true | None |  |
| 33 | `brandId` | 品牌主键 | `pc.brand.Brand` | `brand_id` |  →  |  |  | Service |  |
| 34 | `contractId` | 合同主表主键 | `cpu-contract.contract.ContractVO` | `contract_id` | contractMaterialList → contractId | 1..n | true | None |  |
| 35 | `unitid` | 计价单位主键 | `pc.unit.Unit` | `unitid` |  →  |  |  | Service |  |
| 36 | `enterpriseId` | 所属租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |  →  |  |  | Service |  |
| 37 | `qualitypriceId` | 优质优价方案主键 | `aa.qualitypricescheme.QualitypriceScheme` | `qualityprice_id` |  →  |  |  | Service |  |
| 38 | `taxCategoryId` | 税目税种主键 | `archive.taxArchives.TaxRateArchive` | `tax_category_id` |  →  |  |  | Service |  |
| 39 | `cpuContractSkuext` | 合同物料SKU属性扩展表 | `cpu-contract.contract.CpuContractSkuext` | `` | cpuContractSkuext → billBid | 1 | true | None |  |

### Composition（子表）

- **defines**: `defines` → `cpu-contract.contract.ContractBodyVODefine` | 1 ⚠️ 已废弃
- **materialExt**: `materialExt` → `cpu-contract.contract.ContractMaterialExt` | 1
- **contractId**: `contractMaterialList` → `cpu-contract.contract.ContractVO` | 1..n
- **cpuContractSkuext**: `cpuContractSkuext` → `cpu-contract.contract.CpuContractSkuext` | 1

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `expenseItemId` (费用项目) | `bd.expenseitem.ExpenseItem` | `expense_item_id` |
| `processesId` (工序主键) | `ed.operation.Operation` | `processes_id` |
| `reqDeptId` (需求部门主键) | `org.func.BaseOrg` | `req_dept_id` |
| `activity` (项目活动) | `pgrm.projecttask.ProjectScheduleTask` | `activity` |
| `reqPlanDeptId` (需求计划部门主键) | `org.func.BaseOrg` | `req_plan_deptid` |
| `wbs` (WBS) | `BGDM.wbs.wbs_doc` | `wbs` |
| `singleBudgetApplyId` (单项预算申请单主键) | `znbzbx.memoapply.MemoApplyVO` | `single_budget_applyid` |
| `priceStrategy` (取价策略主键) | `aa.pricestrategy.PriceStrategy` | `price_strategy` |
| `costCenterId` (成本中心) | `bd.costcenter.CostCenter` | `cost_center_id` |
| `reqOrgId` (需求组织主键) | `org.func.BaseOrg` | `req_org_id` |
| `skuId` (SKU主键) | `pc.product.ProductSKU` | `sku_id` |
| `purchaseUnitId` (采购单位主键) | `pc.unit.Unit` | `purchase_unit_id` |
| `reqUapProjectId` (平台项目档案主键) | `bd.project.ProjectVO` | `req_uap_project_id` |
| `receiveOrgId` (收货组织主键) | `org.func.BaseOrg` | `receive_org_id` |
| `materialClassId` (物料分类主键) | `pc.cls.ManagementClass` | `material_class_id` |
| `productId` (商品主键(废弃)) | `pc.product.Product` | `product_id` |
| `costQuoteGroupId` (成本项报价组主键) | `aa.costquote.CpuCostPricing` | `cost_quote_group_id` |
| `ytenant` (租户id) | `yht.tenant.YhtTenant` | `ytenant_id` |
| `singleBudgetApplyBid` (单项预算申请单明细) | `znbzbx.memoapply.MemoApplyBVO` | `single_budget_applybid` |
| `takerOrgId` (收票组织主键) | `org.func.BaseOrg` | `taker_orgid` |
| `costTemplateId` (成本项报价模版ID) | `aa.costitem.CostItemTemplate` | `cost_template_id` |
| `materialId` (物料主键) | `pc.product.Product` | `material_id` |
| `reqContactId` (需求人主键) | `bd.staff.Staff` | `b_req_contact_id` |
| `taxCodeId` (税码) | `taxpubdoc.taxengine.TaxCode` | `tax_code_id` |
| `reqPlanPsnId` (需求计划员主键) | `bd.staff.Staff` | `req_plan_psnid` |
| `mainMetrologyId` (主计量单位主键) | `pc.unit.Unit` | `main_metrology_id` |
| `receivePersonId` (收货人主键) | `bd.staff.Staff` | `receive_person_id` |
| `formulaId` (价格公式主键) | `aa.priceformula.PriceFormula` | `formula_id` |
| `brandId` (品牌主键) | `pc.brand.Brand` | `brand_id` |
| `unitid` (计价单位主键) | `pc.unit.Unit` | `unitid` |
| `enterpriseId` (所属租户主键) | `cpu-privilege.enterprise.EnterprisePOJO` | `enterprise_id` |
| `qualitypriceId` (优质优价方案主键) | `aa.qualitypricescheme.QualitypriceScheme` | `qualityprice_id` |
| `taxCategoryId` (税目税种主键) | `archive.taxArchives.TaxRateArchive` | `tax_category_id` |
