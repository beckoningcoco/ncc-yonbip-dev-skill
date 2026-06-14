---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.mallofficeorder.OrderDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 商城订单明细 (`mall.mallofficeorder.OrderDetail`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`order_detail` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.mallofficeorder.OrderDetail` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商城订单明细 |
| 物理表 | `order_detail` |
| domain/服务域 | `yonbip-cpu-mall` |
| schema | `cpu_mall` |
| 所属应用 | `ycYuncaiMall` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:08:11.1300` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `DETAIL_ID` | `DETAIL_ID` | Long | 商品行id |

## 部署信息

- **部署时间**: 2026-05-23 00:59:43:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202601191140_metadata_mall-mallofficeorder_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `3bbfab4a-a4dc-45ce-a721-18bb57d1c45e`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 3 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 后端自动行号接口 (`ILineNo`) | `base.itf.ILineNo` | 1 | 1 |
| 2 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 直接属性（共 128 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `id` | 商品行id | `DETAIL_ID` | Long | `long` |  | ✓ |
| 2 | `supCategoryId` | 供货目类id | `sup_category_id` | Long | `long` |  | ✓ |
| 3 | `productId` | 商品id | `ware_wareid` | Long | `long` |  | ✓ |
| 4 | `productMainPicture` | 商品主图片 | `ware_main_picture` | String | `text` |  | ✓ |
| 5 | `productName` | 商品名称 | `WARE_NAME` | String | `text` |  | ✓ |
| 6 | `productTitle` | 商品标题 | `ware_title` | String | `text` |  | ✓ |
| 7 | `skuId` | 商品SKUid | `WARE_ID` | Long | `long` |  | ✓ |
| 8 | `skuCode` | 商品SKU编码 | `sku_code` | String | `text` |  | ✓ |
| 9 | `categoryId` | 超市商品分类id | `categoryId` | c58dfa3a-81e5-4d0e-b4ba-794bced793a1 | `quote` |  | ✓ |
| 10 | `innercode` | 超市商品分类innercode | `innercode` | String | `text` |  | ✓ |
| 11 | `isPackage` | 是否包邮 | `is_package` | Boolean | `switch` |  | ✓ |
| 12 | `orderId` | 订单id | `ORDER_ID` | a5e54491-d54a-45d6-9800-4557b5d7b306 | `quote` |  | ✓ |
| 13 | `amount` | 不含税金额(运营) | `amount` | Decimal | `number` |  | ✓ |
| 14 | `applyPurchaseDeptId` | 需求部门id | `apply_purchase_deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 15 | `applyPurchaserId` | 需求人id | `apply_purchaser_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 16 | `arrivedMainQty` | 到货主数量 | `arrived_main_qty` | Decimal | `number` |  | ✓ |
| 17 | `arrivedPurQty` | 到货采购数量 | `arrived_pur_qty` | Decimal | `number` |  | ✓ |
| 18 | `detailTaxAmount` | 订单行总金额(运营) | `detail_tax_amount` | Decimal | `number` |  | ✓ |
| 19 | `materialMainNum` | 主数量 | `material_main_num` | Decimal | `number` |  | ✓ |
| 20 | `materialMainUnitId` | 主单位id | `material_main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 21 | `materialPriceUnitId` | 计价单位id | `material_price_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 22 | `materialPurUnitId` | 采购单位id | `material_pur_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b | `quote` |  | ✓ |
| 23 | `originAmount` | 不含税金额(允销) | `origin_amount` | Decimal | `number` |  | ✓ |
| 24 | `originDetailTaxAmount` | 订单行总金额(允销) | `origin_detail_tax_amount` | Decimal | `number` |  | ✓ |
| 25 | `originTaxAmount` | 含税总金额(允销) | `origin_tax_amount` | Decimal | `number` |  | ✓ |
| 26 | `priceExchRate` | 计价换算率 | `price_exch_rate` | Decimal | `number` |  | ✓ |
| 27 | `purExchRate` | 采购换算率 | `pur_exch_rate` | Decimal | `number` |  | ✓ |
| 28 | `receivedMainQty` | 签收主数量 | `received_main_qty` | Decimal | `number` |  | ✓ |
| 29 | `receivedPurQty` | 签收采购数量 | `received_pur_qty` | Decimal | `number` |  | ✓ |
| 30 | `taxAmount` | 含税总金额(运营) | `tax_amount` | Decimal | `number` |  | ✓ |
| 31 | `taxCategoryId` | 税率ID | `tax_category_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 | `quote` |  | ✓ |
| 32 | `purExchRateNum` | 采购换算率分子 | `pur_exch_ratenum` | Decimal | `number` |  | ✓ |
| 33 | `purExchRateDen` | 采购换算率分母 | `pur_exch_rateden` | Decimal | `number` |  | ✓ |
| 34 | `priceExchRateNum` | 计价换算率分子 | `price_exch_ratenum` | Decimal | `number` |  | ✓ |
| 35 | `priceExchRateDen` | 计价换算率分母 | `price_exch_rateden` | Decimal | `number` |  | ✓ |
| 36 | `materialUnit` | 物料单位 | `material_unit` | String | `text` |  | ✓ |
| 37 | `materialDesc` | 物料描述 | `material_desc` | String | `text` |  | ✓ |
| 38 | `supplierId` | 供应商企业id | `SUPPLIER_ID` | Long | `long` |  | ✓ |
| 39 | `originPrice` | 允销无税单价 | `origin_price` | Decimal | `number` |  | ✓ |
| 40 | `originTaxPrice` | 允销含税单价 | `origin_tax_price` | Decimal | `number` |  | ✓ |
| 41 | `origTaxRate` | 协同税率 | `orig_tax_rate` | Decimal | `number` |  | ✓ |
| 42 | `dr` | dr | `DR` | Integer | `int` |  | ✓ |
| 43 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 44 | `vdef1` | 自定义项1 | `vdef1` | String | `text` |  | ✓ |
| 45 | `vdef2` | 自定义项2 | `vdef2` | String | `text` |  | ✓ |
| 46 | `vdef3` | 自定义项3 | `vdef3` | String | `text` |  | ✓ |
| 47 | `vdef4` | 自定义项4 | `vdef4` | String | `text` |  | ✓ |
| 48 | `vdef5` | 自定义项5 | `vdef5` | String | `text` |  | ✓ |
| 49 | `vdef6` | 自定义项6 | `vdef6` | String | `text` |  | ✓ |
| 50 | `vdef7` | 自定义项7 | `vdef7` | String | `text` |  | ✓ |
| 51 | `vdef8` | 自定义项8 | `vdef8` | String | `text` |  | ✓ |
| 52 | `vdef9` | 自定义项9 | `vdef9` | String | `text` |  | ✓ |
| 53 | `vdef10` | 自定义项10 | `vdef10` | String | `text` |  | ✓ |
| 54 | `wareInfo` | 冗余商品信息 | `wareinfo` | String | `text` |  | ✓ |
| 55 | `materialInfo` | 物料冗余信息 | `material_info` | String | `text` |  | ✓ |
| 56 | `consigneeInfo` | 收货人信息 | `consignee_info` | String | `text` |  | ✓ |
| 57 | `consigneeOrgInfo` | 收货人所在组织信息 | `consignee_orginfo` | String | `text` |  | ✓ |
| 58 | `consigneeDeptInfo` | 收货人所在部门信息 | `consignee_deptinfo` | String | `text` |  | ✓ |
| 59 | `purposeInfo` | 冗余采购用途信息 | `purposeinfo` | String | `text` |  | ✓ |
| 60 | `sourceInfo` | 来源单据冗余信息 | `source_info` | String | `text` |  | ✓ |
| 61 | `price` | 单价 | `PRICE` | Decimal | `number` |  | ✓ |
| 62 | `taxPrice` | 含税单价 | `TAX_PRICE` | Decimal | `number` |  | ✓ |
| 63 | `openPrice` | 商品公开价 | `OPEN_PRICE` | Decimal | `number` |  | ✓ |
| 64 | `openTaxprice` | 商品公开含税价 | `OPEN_TAXPRICE` | Decimal | `number` |  | ✓ |
| 65 | `origPrice` | 历史制单价格 | `ORIG_PRICE` | Decimal | `number` |  | ✓ |
| 66 | `origTaxprice` | 历史制单含税价格 | `ORIG_TAXPRICE` | Decimal | `number` |  | ✓ |
| 67 | `taxRate` | 税率 | `tax_rate` | Decimal | `number` |  | ✓ |
| 68 | `quantity` | 数量 | `QUANTITY` | Decimal | `number` |  | ✓ |
| 69 | `productUnit` | 单位 | `product_unit` | String | `text` |  | ✓ |
| 70 | `purchaseQuantityOrigin` | 采购需求原始数量 | `purchase_quantity_origin` | Decimal | `number` |  | ✓ |
| 71 | `purposeId` | 采购用途id | `PURPOSE_ID` | 0f42735e-ae1a-4fe8-8573-311f67617aa9 | `quote` |  | ✓ |
| 72 | `materialId` | 关联物料id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 73 | `purchaseQuantity` | 物料下单 | `purchase_quantity` | Decimal | `number` |  | ✓ |
| 74 | `expenseCenterId` | 成本中心id | `expense_center_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 | `quote` |  | ✓ |
| 75 | `costProjectId` | 费用项目id | `cost_project_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 | `quote` |  | ✓ |
| 76 | `budgetSubjectId` | 预算科目id | `budget_subject_id` | 6d5a071b-5529-4c8b-ade1-1cdb66556e2f | `quote` |  | ✓ |
| 77 | `planDeliverDate` | 期望交期 | `plan_deliver_date` | DateTime | `timestamp` |  | ✓ |
| 78 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 79 | `arrivedQty` | 到货数量 | `ARRIVED_QTY` | Decimal | `number` |  | ✓ |
| 80 | `receivedQty` | 签收数量 | `RECEIVED_QTY` | Decimal | `number` |  | ✓ |
| 81 | `receivedTime` | 签收时间 | `RECEIVED_TIME` | DateTime | `timestamp` |  | ✓ |
| 82 | `purchaseOrgId` | 允销组织id | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 83 | `consigneeId` | 收货人ID | `consignee_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 84 | `consigneeMobile` | 收货人联系方式 | `consignee_mobile` | String | `text` |  | ✓ |
| 85 | `consigneeEmail` | 收货人邮箱 | `consignee_email` | String | `text` |  | ✓ |
| 86 | `consigneeZip` | 收货人邮编 | `consignee_zip` | String | `text` |  | ✓ |
| 87 | `consigneeOrgId` | 收货人所在组织ID | `consignee_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 88 | `consigneeDeptId` | 收货人所在部门ID | `consignee_deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 89 | `deliverAddressId` | 收货地址ID | `deliver_address_id` | d6443dd6-42b2-4513-8eca-cd72ac2029ea | `quote` |  | ✓ |
| 90 | `deliverAddress` | 收货地址 | `deliver_address` | String | `text` |  | ✓ |
| 91 | `warehouseId` | 仓库档案ID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | ✓ |
| 92 | `channelId` | 电商渠道id | `channel_id` | Integer | `int` |  | ✓ |
| 93 | `carriagePrice` | 分摊运费 | `carriage_price` | Decimal | `number` |  | ✓ |
| 94 | `carriageUnit` | 分摊单价 | `carriage_unit` | Decimal | `number` |  | ✓ |
| 95 | `taxAmountWithoutCarriage` | 除运费的含税金额 | `tax_amount_without_carriage` | Decimal | `number` |  | ✓ |
| 96 | `carriageAmount` | 分摊费用合计 | `carriage_amount` | Decimal | `number` |  | ✓ |
| 97 | `priceId` | 价格协议ID | `price_id` | 54f73169-773d-40df-9fbc-c092f4201577 | `quote` |  | ✓ |
| 98 | `showOperateOrg` | 是否显示供应商 | `show_operate_org` | Boolean | `switch` |  | ✓ |
| 99 | `cartId` | 商品行购物车id | `cart_id` | String | `text` |  | ✓ |
| 100 | `parentCartId` | 赠品行记录的原父行的id | `parentCart_id` | String | `text` |  | ✓ |
| 101 | `giftsFlag` | 赠品标识 | `gifts_flag` | String | `text` |  | ✓ |
| 102 | `mallType` | 区分公共超市和专有超市 | `MALL_TYPE` | String | `text` |  | ✓ |
| 103 | `status` | 行状态 | `STATUS` | String | `text` |  | ✓ |
| 104 | `quotaType` | 报价方式 | `quota_type` | String | `text` |  | ✓ |
| 105 | `invcStatus` | 开票状态 | `INVC_STATUS` | String | `text` |  | ✓ |
| 106 | `checkStatus` | 对账状态 | `check_status` | String | `text` |  | ✓ |
| 107 | `taxType` | 扣税类别 | `tax_type` | String | `text` |  | ✓ |
| 108 | `priceMark` | 价格标识 | `price_mark` | String | `text` |  | ✓ |
| 109 | `formulaId` | 价格公式id | `formula_id` | 97790819-6d1f-4b4b-8d1c-f6d78b6531e4 | `quote` |  | ✓ |
| 110 | `formula` | 价格公式计算式 | `formula` | String | `text` |  | ✓ |
| 111 | `requestTime` | 工业品超市期望出货日期 | `REQUEST_TIME` | String | `text` |  | ✓ |
| 112 | `leadTime` | 工业品超市交期 | `LEAD_TIME` | String | `text` |  | ✓ |
| 113 | `shipTime` | 工业品超市预计到货日期 | `SHIP_TIME` | String | `text` |  | ✓ |
| 114 | `rs` | 订单子表红字标志位 | `rs` | Boolean | `switch` |  | ✓ |
| 115 | `returnProductBodyId` | 退货订单子表主键 | `return_product_b_id` | Long | `long` |  | ✓ |
| 116 | `sourceType` | 来源方式 | `source_type` | String | `text` |  | ✓ |
| 117 | `sourceId` | 来源单据主键 | `source_id` | Long | `long` |  | ✓ |
| 118 | `contractId` | 合同id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 | `quote` |  | ✓ |
| 119 | `contractBillno` | 合同号 | `contract_billno` | String | `text` |  | ✓ |
| 120 | `contractMaterialId` | 合同详情id | `contract_material_id` | 07141343-35c1-4687-b99c-405bfa7a3096 | `quote` |  | ✓ |
| 121 | `outerId` | 外系统明细id | `outer_id` | String | `text` |  | ✓ |
| 122 | `outerCode` | 外系统明细code | `outer_code` | String | `text` |  | ✓ |
| 123 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 124 | `enterpriseId` | 采购商企业ID | `enterprise_id` | Long | `long` |  | ✓ |
| 125 | `ctId` | 订单明细自定义项特征 | `ct_id` | 8d68dbaf-d407-4cb8-a9d3-40dfe5bcefdc | `UserDefine` |  | ✓ |
| 126 | `dctId` | 关联物料自由项特征组 | `dct_id` | 1ab2042e-43c3-434d-8f51-074af664f427 | `FreeCT` |  | ✓ |
| 127 | `lineno` | 行号 | `lineno` | Decimal | `number` |  | ✓ |
| 128 | `orderoption` | 订单选配 | `` | f1ecfd07-60bb-44d7-8058-f2d8f518e522 | `` |  |  |

---

## 关联属性（共 26 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ctId` | 订单明细自定义项特征 | `mall.mallofficeorder.OrderDetailCt` | `ct_id` |  →  |  |  | None |  |
| 2 | `budgetSubjectId` | 预算科目id | `bgdm.budgetsubject.BudgetSubjectItem` | `budget_subject_id` |  →  |  |  | Service |  |
| 3 | `orderoption` | 订单选配 | `mall.mallofficeorder.OrderOptionSelection` | `` | orderoption → orderDetailId | 0..n | true | None |  |
| 4 | `orderId` | 订单id | `mall.mallofficeorder.MallOrder` | `ORDER_ID` | orderdetail → orderId | 1..n | true | None |  |
| 5 | `purposeId` | 采购用途id | `mall.purchasePurpose.Purpose` | `PURPOSE_ID` |  →  |  |  | None |  |
| 6 | `applyPurchaserId` | 需求人id | `bd.staff.Staff` | `apply_purchaser_id` |  →  |  |  | Service |  |
| 7 | `consigneeOrgId` | 收货人所在组织ID | `org.func.BaseOrg` | `consignee_orgid` |  →  |  |  | Service |  |
| 8 | `materialPriceUnitId` | 计价单位id | `pc.unit.Unit` | `material_price_unit_id` |  →  |  |  | Service |  |
| 9 | `applyPurchaseDeptId` | 需求部门id | `bd.adminOrg.AdminOrgVO` | `apply_purchase_deptid` |  →  |  |  | Service |  |
| 10 | `costProjectId` | 费用项目id | `bd.expenseitem.ExpenseItem` | `cost_project_id` |  →  |  |  | Service |  |
| 11 | `materialMainUnitId` | 主单位id | `pc.unit.Unit` | `material_main_unit_id` |  →  |  |  | Service |  |
| 12 | `contractMaterialId` | 合同详情id | `cpu-contract.contract.ContractBodyVO` | `contract_material_id` |  →  |  |  | Service |  |
| 13 | `consigneeId` | 收货人ID | `bd.staff.Staff` | `consignee_id` |  →  |  |  | Service |  |
| 14 | `consigneeDeptId` | 收货人所在部门ID | `bd.adminOrg.AdminOrgVO` | `consignee_deptid` |  →  |  |  | Service |  |
| 15 | `purchaseOrgId` | 允销组织id | `org.func.BaseOrg` | `purchase_org_id` |  →  |  |  | Service |  |
| 16 | `materialId` | 关联物料id | `pc.product.Product` | `material_id` |  →  |  |  | Service |  |
| 17 | `formulaId` | 价格公式id | `aa.priceformula.PriceFormula` | `formula_id` |  →  |  |  | Service |  |
| 18 | `deliverAddressId` | 收货地址ID | `mall.deliveraddress.MetaDeliverAddress` | `deliver_address_id` |  →  |  |  | None |  |
| 19 | `warehouseId` | 仓库档案ID | `aa.warehouse.Warehouse` | `warehouse_id` |  →  |  |  | Service |  |
| 20 | `expenseCenterId` | 成本中心id | `bd.costcenter.CostCenter` | `expense_center_id` |  →  |  |  | Service |  |
| 21 | `contractId` | 合同id | `cpu-contract.contract.ContractVO` | `contract_id` |  →  |  |  | Service |  |
| 22 | `materialPurUnitId` | 采购单位id | `pc.unit.Unit` | `material_pur_unit_id` |  →  |  |  | Service |  |
| 23 | `priceId` | 价格协议ID | `mall.operatingprice.CpuOperatingPrice` | `price_id` |  →  |  |  | None |  |
| 24 | `categoryId` | 超市商品分类id | `ycYuncaiMall.marketProductClass.marketProductClass` | `categoryId` |  →  |  |  | Service |  |
| 25 | `dctId` | 关联物料自由项特征组 | `mall.mallofficeorder.OrderDetailDct` | `dct_id` |  →  |  |  | None |  |
| 26 | `taxCategoryId` | 税率ID | `archive.taxArchives.TaxRateArchive` | `tax_category_id` |  →  |  |  | Service |  |

### Composition（子表）

- **orderoption**: `orderoption` → `mall.mallofficeorder.OrderOptionSelection` | 0..n
- **orderId**: `orderdetail` → `mall.mallofficeorder.MallOrder` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `budgetSubjectId` (预算科目id) | `bgdm.budgetsubject.BudgetSubjectItem` | `budget_subject_id` |
| `applyPurchaserId` (需求人id) | `bd.staff.Staff` | `apply_purchaser_id` |
| `consigneeOrgId` (收货人所在组织ID) | `org.func.BaseOrg` | `consignee_orgid` |
| `materialPriceUnitId` (计价单位id) | `pc.unit.Unit` | `material_price_unit_id` |
| `applyPurchaseDeptId` (需求部门id) | `bd.adminOrg.AdminOrgVO` | `apply_purchase_deptid` |
| `costProjectId` (费用项目id) | `bd.expenseitem.ExpenseItem` | `cost_project_id` |
| `materialMainUnitId` (主单位id) | `pc.unit.Unit` | `material_main_unit_id` |
| `contractMaterialId` (合同详情id) | `cpu-contract.contract.ContractBodyVO` | `contract_material_id` |
| `consigneeId` (收货人ID) | `bd.staff.Staff` | `consignee_id` |
| `consigneeDeptId` (收货人所在部门ID) | `bd.adminOrg.AdminOrgVO` | `consignee_deptid` |
| `purchaseOrgId` (允销组织id) | `org.func.BaseOrg` | `purchase_org_id` |
| `materialId` (关联物料id) | `pc.product.Product` | `material_id` |
| `formulaId` (价格公式id) | `aa.priceformula.PriceFormula` | `formula_id` |
| `warehouseId` (仓库档案ID) | `aa.warehouse.Warehouse` | `warehouse_id` |
| `expenseCenterId` (成本中心id) | `bd.costcenter.CostCenter` | `expense_center_id` |
| `contractId` (合同id) | `cpu-contract.contract.ContractVO` | `contract_id` |
| `materialPurUnitId` (采购单位id) | `pc.unit.Unit` | `material_pur_unit_id` |
| `categoryId` (超市商品分类id) | `ycYuncaiMall.marketProductClass.marketProductClass` | `categoryId` |
| `taxCategoryId` (税率ID) | `archive.taxArchives.TaxRateArchive` | `tax_category_id` |
