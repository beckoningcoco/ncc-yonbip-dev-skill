---
tags: ["BIP", "元数据", "数据字典", "ycYuncaiMall", "mall.mallofficeorder.MallOrder"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购商城订单 (`mall.mallofficeorder.MallOrder`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。

> YonBIP ycYuncaiMall 模块实体元数据字典。
> 物理表：`mall_order` | 所属应用：`ycYuncaiMall`
> 来源：元数据API `queryByUri` 返回的 `mall.mallofficeorder.MallOrder` 实体完整定义。

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购商城订单 |
| 物理表 | `mall_order` |
| 数据库 schema | `yonbip-cpu-mall` |
| 所属应用 | `ycYuncaiMall` |
| 业务对象ID | `7633ebba-0022-42c6-bf5c-e535d6bec695` |
| 元数据类型 | `Class` |
| 元数据层级 | `2` |
| 是否业务对象 | `true` |
| 构建时间 | `2026-06-04 14:00:40.5660` |

## 主键与编码

| 角色 | 字段名 | 数据库列 | 类型 | 说明 |
|------|--------|---------|------|------|
| 主键 | `ORDER_ID` | `ORDER_ID` | Long | ID |
| 编码 | `ORDER_CODE` | `ORDER_CODE` | String | 订单号（必填，isCode）|

## 部署信息

- **部署时间**: 2026-05-23 00:59:46:000
- **安装来源**: `/app/data_scripts/cpu-mall-bootstrap/scripts/db/patch/mongodb/V5_R0_2507/0001_yonbip-cpu-mall/0010_iuap_common/DML/0270_iuap_metadata/202601231626_metadata_mall-mallofficeorder_delta.zip`
- **安装人**: mongoTools
- **安装排名**: `053f37b8-d44d-427c-b042-a057c17a9f87`

## 业务场景

- `FieldAuth`
- `dataMultilanguage`
- `print`
- `workflow`
- `UITemplate`
- `DataAuth`
- `transtype`
- `report`
- `billcode`
- `userdefine`
- `api`
- `bpm`

## 术语标记

`BusinessData`, `isAssigned`, `isExtend`, `data_auth`, `isMain`, `doc`

## 约束

- **migration_id** (MetaClassPrimary): ID — 唯一字段: `['id']`

## 依赖接口（共 5 个）

| # | 接口名 | URI | 版本 | 属性数 |
|---|--------|-----|------|--------|
| 1 | 逻辑删除相关 (`LogicDelete`) | `ucfbase.ucfbaseItf.LogicDelete` | 74 | 1 |
| 2 | 审批信息 (`IApprovalInfo`) | `ucfbase.ucfbaseItf.IApprovalInfo` | 85 | 2 |
| 3 | 统一租户接口 (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| 4 | 自动编号 (`IAutoCode`) | `voucher.base.IAutoCode` | 49 | 1 |
| 5 | 审批流信息 (`IApprovalFlow`) | `ucfbase.ucfbaseItf.IApprovalFlow` | 177 | 3 |

---

## 直接属性（共 143 个）

| # | 字段名 | 显示名 | 数据库列 | 类型 | 业务类型 | 必填 | 可空 |
|---|--------|--------|---------|------|---------|------|------|
| 1 | `consigneeId` | 收货人ID | `CONSIGNEE_ID` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 2 | `id` | ID | `ORDER_ID` | Long | `long` |  | ✓ |
| 3 | `invoiceState` | 开票类型 | `INVOICE_STATE` | Integer | `int` |  | ✓ |
| 4 | `supplierdocId` | 供应商档案ID | `supplierdoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e | `quote` |  | ✓ |
| 5 | `refReaStatus` | 供应商拒绝状态 | `ref_rea_status` | String | `text` |  | ✓ |
| 6 | `code` | 订单号 | `ORDER_CODE` | String | `text` |  | ✓ |
| 7 | `invoiceType` | 发票类型 | `invoice_type` | Integer | `int` |  | ✓ |
| 8 | `rejectReason` | 供应商拒绝理由 | `reject_reason` | String | `text` |  | ✓ |
| 9 | `consigneeMobile` | 联系方式 | `consignee_mobile` | String | `text` |  | ✓ |
| 10 | `assignPurOrgId` | 采购组织ID | `assign_purorg_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 11 | `invoiceCompanyName` | 发票抬头 | `invoice_company_name` | String | `text` |  | ✓ |
| 12 | `purchaserId` | 采购员id | `PURCHASER_ID` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 13 | `purchaserEmail` | 采购员邮箱 | `purchaser_email` | String | `text` |  | ✓ |
| 14 | `commiter` | 提交人 | `commiter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 15 | `annualBB` | 年度预算余额 | `annual_bb` | Decimal | `number` |  | ✓ |
| 16 | `commitFailReason` | 提交失败原因 | `commit_fail_reason` | String | `text` |  | ✓ |
| 17 | `costMaterialId` | 费用物料id | `cost_material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 | `quote` |  | ✓ |
| 18 | `monthlyBB` | 月度预算余额 | `monthly_bb` | Decimal | `number` |  | ✓ |
| 19 | `shippingTime` | 待发货时间 | `shipping_time` | DateTime | `timestamp` |  | ✓ |
| 20 | `purchaserPhone` | 采购员电话 | `purchaser_phone` | String | `text` |  | ✓ |
| 21 | `purchaserMobile` | 采购员手机号 | `purchaser_mobile` | String | `text` |  | ✓ |
| 22 | `invoiceDetailAddress` | 收票地址 | `invoice_detail_address` | String | `text` |  | ✓ |
| 23 | `supplierId` | 供应商企业id | `SUPPLIER_ID` | Long | `long` |  | ✓ |
| 24 | `bankAccountInfo` | 银行信息 | `bank_account_info` | String | `text` |  | ✓ |
| 25 | `rejectCloseReason` | 供应商拒绝关闭理由 | `reject_close_reason` | String | `text` |  | ✓ |
| 26 | `allowsaleAmountPrice` | 允销无税总价 | `allowsale_amount_price` | Decimal | `number` |  | ✓ |
| 27 | `creatationTime` | 创建时间 | `CREATATION_TIME` | DateTime | `timestamp` |  | ✓ |
| 28 | `dr` | dr | `dr` | Integer | `int` |  | ✓ |
| 29 | `tenant` | 租户id | `ytenant_id` | String | `text` |  | ✓ |
| 30 | `vdef1` | 自定义项1 | `vdef1` | String | `text` |  | ✓ |
| 31 | `vdef2` | 自定义项2 | `vdef2` | String | `text` |  | ✓ |
| 32 | `vdef3` | 自定义项3 | `vdef3` | String | `text` |  | ✓ |
| 33 | `vdef4` | 自定义项4 | `vdef4` | String | `text` |  | ✓ |
| 34 | `vdef5` | 自定义项5 | `vdef5` | String | `text` |  | ✓ |
| 35 | `vdef6` | 自定义项6 | `vdef6` | String | `text` |  | ✓ |
| 36 | `vdef7` | 自定义项7 | `vdef7` | String | `text` |  | ✓ |
| 37 | `vdef8` | 自定义项8 | `vdef8` | String | `text` |  | ✓ |
| 38 | `vdef9` | 自定义项9 | `vdef9` | String | `text` |  | ✓ |
| 39 | `vdef10` | 自定义项10 | `vdef10` | String | `text` |  | ✓ |
| 40 | `supplierInfo` | 供应商冗余信息 | `supplierinfo` | String | `text` |  | ✓ |
| 41 | `purchaserInfo` | 冗余采购员信息 | `PURCHASER_INFO` | String | `text` |  | ✓ |
| 42 | `consigneeInfo` | 冗余收货人信息 | `CONSIGNEE_INFO` | String | `text` |  | ✓ |
| 43 | `consigneeDeptinfo` | 收货人部门冗余信息 | `consignee_deptinfo` | String | `text` |  | ✓ |
| 44 | `consigneeOrgInfo` | 收货人组织冗余信息 | `consignee_orginfo` | String | `text` |  | ✓ |
| 45 | `invoiceInfo` | 发票信息 | `INVOICE_INFO` | String | `text` |  | ✓ |
| 46 | `integralRule` | 积分抵扣规则 | `integral_rule` | String | `text` |  | ✓ |
| 47 | `timeRec` | 状态流转时间节点json记录 | `time_rec` | String | `text` |  | ✓ |
| 48 | `bpmSource` | MDD升级标志 | `bpm_source` | String | `text` |  | ✓ |
| 49 | `ytenant` | 租户id | `ytenant_id` | String | `text` | ✓ | ✓ |
| 50 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean | `switch` |  | ✓ |
| 51 | `verifystate` | 审批状态 | `verifystate` | Short | `short` |  | ✓ |
| 52 | `returncount` | 退回次数 | `returncount` | Short | `short` |  | ✓ |
| 53 | `vouchdate` | 单据日期 | `vouchdate` | Date | `date` | ✓ |  |
| 54 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | ✓ |
| 55 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 56 | `supplierDefaultContact` | 供应商联系人 | `supplier_default_contact` | String | `text` |  | ✓ |
| 57 | `refCancelReaStatus` | 供应商拒绝取消状态 | `ref_cancel_rea_status` | String | `text` |  | ✓ |
| 58 | `consigneeZip` | 邮编 | `consignee_zip` | String | `text` |  | ✓ |
| 59 | `invoiceTaxNo` | 纳税人识别号 | `invoice_taxno` | String | `text` |  | ✓ |
| 60 | `supplierDefaultTelephone` | 联系方式 | `supplier_default_telephone` | String | `text` |  | ✓ |
| 61 | `rejectCancelReason` | 供应商拒绝取消理由 | `reject_cancel_reason` | String | `text` |  | ✓ |
| 62 | `consigneeEmail` | 邮箱 | `consignee_email` | String | `text` |  | ✓ |
| 63 | `assignPurDeptId` | 采购部门ID | `assign_purdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 64 | `invoicePersonId` | 收票人ID | `invoice_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 65 | `supplierPaymentBankName` | 开户行 | `supplier_payment_bank_name` | String | `text` |  | ✓ |
| 66 | `endTime` | 确认收货时间 | `END_TIME` | DateTime | `timestamp` |  | ✓ |
| 67 | `deliverAddressId` | 收货地址id | `deliver_address_id` | d6443dd6-42b2-4513-8eca-cd72ac2029ea | `quote` |  | ✓ |
| 68 | `supplierPaymentBankAccount` | 银行账号 | `supplier_payment_bank_account` | String | `text` |  | ✓ |
| 69 | `operatingOrderType` | 订单运营类型 | `operating_order_type` | String | `text` |  | ✓ |
| 70 | `deliverAddress` | 收货地址 | `DELIVER_ADDRESS` | String | `text` |  | ✓ |
| 71 | `assignPurchaserId` | 采购员ID | `assign_purchaser_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 72 | `invoiceMobile` | 联系电话 | `invoice_mobile` | String | `text` |  | ✓ |
| 73 | `channelType` | 是否电商 | `channel_type` | String | `text` |  | ✓ |
| 74 | `operatingOrgId` | 运营组织ID | `operating_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 75 | `consigneeOrgId` | 收货组织ID | `consignee_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 76 | `invoiceRegistAddress` | 注册地址 | `invoice_regist_address` | String | `text` |  | ✓ |
| 77 | `showOperateOrg` | 是否显示供应商 | `show_operate_org` | Boolean | `switch` |  | ✓ |
| 78 | `applyPurchaseOrgId` | 需求组织ID | `apply_purchase_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 79 | `invoiceRegistTelephone` | 注册电话 | `invoice_regist_telephon` | String | `text` |  | ✓ |
| 80 | `integralRuleId` | 积分抵扣规则id | `integral_rule_id` | String | `text` |  | ✓ |
| 81 | `consigneeDeptId` | 收货部门ID | `consignee_deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 82 | `invoiceRegistBank` | 开户银行 | `invoice_regist_bank` | String | `text` |  | ✓ |
| 83 | `ruleIntegral` | 积分抵扣规则-多少积分 | `rule_integral` | Integer | `int` |  | ✓ |
| 84 | `applyPurchaseDeptId` | 需求部门ID | `apply_purchase_deptid` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | ✓ |
| 85 | `invoiceRegistBankAccount` | 银行账号 | `invoice_regist_bank_account` | String | `text` |  | ✓ |
| 86 | `ruleYuan` | 积分抵扣规则-抵扣多少金额 | `rule_yuan` | Decimal | `number` |  | ✓ |
| 87 | `warehouseId` | 仓库档案ID | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 | `quote` |  | ✓ |
| 88 | `integral` | 抵扣积分 | `integral` | Integer | `int` |  | ✓ |
| 89 | `applyPurchaserId` | 申请人ID | `apply_purchaser_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | ✓ |
| 90 | `deductionAmount` | 抵扣金额 | `deduction_amount` | Decimal | `number` |  | ✓ |
| 91 | `invcStatus` | 开票状态 | `INVC_STATUS` | String | `text` |  | ✓ |
| 92 | `financialOrgId` | 财务组织ID | `financial_orgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 93 | `payWay` | 付款方式 | `PAY_WAY` | String | `text` |  | ✓ |
| 94 | `payInfo` | 付款流水号(线下) | `pay_info` | String | `text` |  | ✓ |
| 95 | `transtypeId` | 交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 | `quote` |  | ✓ |
| 96 | `paySN` | 支付流水号 | `pay_sn` | String | `text` |  | ✓ |
| 97 | `payerId` | 支付人id | `payer_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 98 | `creator` | 下单人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 99 | `isPayAgreement` | 是否按协议付款 | `is_pay_agreement` | Boolean | `switch` |  | ✓ |
| 100 | `assignPurchaserContact` | 联系方式 | `assign_purchaser_contact` | String | `text` |  | ✓ |
| 101 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | `quote` |  | ✓ |
| 102 | `projectId` | 项目ID | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 | `quote` |  | ✓ |
| 103 | `orderStatus` | 订单状态 | `STATUS` | String | `text` |  | ✓ |
| 104 | `memo` | 备注 | `memo` | String | `text` |  | ✓ |
| 105 | `taxAllowsaleAmountPrice` | 允销含税总价 | `tax_allowsale_amount_price` | Decimal | `number` |  | ✓ |
| 106 | `amount` | 无税金额 | `AMOUNT` | Decimal | `number` |  | ✓ |
| 107 | `taxAmount` | 含税金额 | `TAX_AMOUNT` | Decimal | `number` |  | ✓ |
| 108 | `taxAmountWithoutCarriage` | 不含运费合计 | `tax_amount_without_carriage` | Decimal | `number` |  | ✓ |
| 109 | `carriage` | 运费 | `carriage` | Decimal | `number` |  | ✓ |
| 110 | `truthCollectCarriage` | 是否按实际情况收取运费 | `truth_collect_carriage` | String | `text` |  | ✓ |
| 111 | `remaindReturnCarriage` | 剩余可退运费 | `remaind_return_carriage` | Decimal | `number` |  | ✓ |
| 112 | `remainingPackageMsg` | 还差XX件/元包邮 | `remaining_package_msg` | String | `text` |  | ✓ |
| 113 | `stockOrgId` | 库存组织id | `stock_org_id` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | ✓ |
| 114 | `arrvTime` | 到货日期 | `ARRV_TIME` | DateTime | `timestamp` |  | ✓ |
| 115 | `shippedTime` | 供应商发货时间 | `SHIPPED_TIME` | DateTime | `timestamp` |  | ✓ |
| 116 | `isNeedReconciliation` | 是否需要对账 | `isNeedReconciliation` | Boolean | `switch` |  | ✓ |
| 117 | `checkStatus` | 对账状态 | `check_status` | String | `text` |  | ✓ |
| 118 | `changeStatus` | 变更状态 | `change_status` | Integer | `int` |  | ✓ |
| 119 | `settleWay` | 结算方式 | `settle_way` | String | `text` |  | ✓ |
| 120 | `quotaType` | 报价方式 | `quota_type` | String | `text` |  | ✓ |
| 121 | `mallType` | 区分公共超市和专有超市 | `MALL_TYPE` | String | `text` |  | ✓ |
| 122 | `enableLineAddress` | 是否开启行地址 | `enable_line_address` | Boolean | `switch` |  | ✓ |
| 123 | `isEmergency` | 是否紧急采购 | `IS_EMERGENCY` | Boolean | `switch` |  | ✓ |
| 124 | `isOuterCustomer` | 是否外部客户 | `isOuterCustomer` | Boolean | `switch` |  | ✓ |
| 125 | `pushERP` | 是否推送erp | `PUSH_ERP` | String | `text` |  | ✓ |
| 126 | `outerId` | erp订单id | `OUTER_ID` | String | `text` |  | ✓ |
| 127 | `outerCode` | erp订单号 | `OUTER_CODE` | String | `text` |  | ✓ |
| 128 | `ownerId` | 制单人id | `OWNER_ID` | a2f7c666-0173-4f52-bf36-ed780414b2f3 | `quote` |  | ✓ |
| 129 | `createTime` | 制单时间 | `createtime` | DateTime | `timestamp` |  | ✓ |
| 130 | `committedTime` | 提交时间 | `COMMITTED_TIME` | DateTime | `timestamp` |  | ✓ |
| 131 | `auditTime` | 审批时间 | `APPROVED_TIME` | DateTime | `timestamp` |  | ✓ |
| 132 | `auditor` | 审批人 | `APPROVER_CODE` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | ✓ |
| 133 | `approveType` | 审批类型 | `APPROVE_TYPE` | String | `text` |  | ✓ |
| 134 | `closedBy` | 关闭人 | `closed_by` | String | `text` |  | ✓ |
| 135 | `pushERPFailReason` | 推ERP失败原因 | `push_erp_fail_reason` | String | `text` |  | ✓ |
| 136 | `status` | mdd单据状态 | `mdd_status` | Short | `short` |  | ✓ |
| 137 | `orderType` | 订单类型 | `ORDER_TYPE` | String | `text` |  | ✓ |
| 138 | `orderSource` | 订单来源 | `order_source` | String | `text` |  | ✓ |
| 139 | `pubts` | 时间戳 | `ts` | DateTime | `timestamp` |  | ✓ |
| 140 | `enterpriseId` | 采购商企业ID | `enterprise_id` | Long | `long` |  | ✓ |
| 141 | `ctId` | 订单自定义项特征 | `ct_id` | 358d5b24-9136-4e2b-9ac4-4f143bbde49c | `UserDefine` |  | ✓ |
| 142 | `orderdetail` | 商城订单明细 | `` | a6cf30ba-d19e-40fb-83d2-615ee56f6f85 | `` |  |  |
| 143 | `processType` | 订单流程 | `process_type` | Integer | `int` |  | ✓ |

---

## 关联属性（共 29 个）

> Composition = 生命周期由此实体管理; Service = 仅外键引用; None = 内联

| # | 字段名 | 显示名 | 目标实体 | 数据库列 | 关系 | 多重性 | 组合 | 隔离级 | 已废弃 |
|---|--------|--------|---------|---------|------|--------|------|--------|--------|
| 1 | `ctId` | 订单自定义项特征 | `mall.mallofficeorder.MallOrderCt` | `ct_id` |  →  |  |  | None |  |
| 2 | `assignPurOrgId` | 采购组织ID | `org.func.BaseOrg` | `assign_purorg_id` |  →  |  |  | Service |  |
| 3 | `operatingOrgId` | 运营组织ID | `org.func.BaseOrg` | `operating_org_id` |  →  |  |  | Service |  |
| 4 | `financialOrgId` | 财务组织ID | `org.func.BaseOrg` | `financial_orgid` |  →  |  |  | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` |  →  |  |  | Service |  |
| 6 | `payerId` | 支付人id | `cpu-privilege.user.MgrUser` | `payer_id` |  →  |  |  | Service |  |
| 7 | `applyPurchaserId` | 申请人ID | `bd.staff.Staff` | `apply_purchaser_id` |  →  |  |  | Service |  |
| 8 | `consigneeOrgId` | 收货组织ID | `org.func.BaseOrg` | `consignee_orgid` |  →  |  |  | Service |  |
| 9 | `ownerId` | 制单人id | `cpu-privilege.user.MgrUser` | `OWNER_ID` |  →  |  |  | Service |  |
| 10 | `assignPurDeptId` | 采购部门ID | `bd.adminOrg.AdminOrgVO` | `assign_purdept_id` |  →  |  |  | Service |  |
| 11 | `applyPurchaseDeptId` | 需求部门ID | `bd.adminOrg.AdminOrgVO` | `apply_purchase_deptid` |  →  |  |  | Service |  |
| 12 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |  →  |  |  | Service |  |
| 13 | `transtypeId` | 交易类型id | `bd.bill.TransType` | `transtype_id` |  →  |  |  | Service |  |
| 14 | `consigneeId` | 收货人ID | `bd.staff.Staff` | `CONSIGNEE_ID` |  →  |  |  | Service |  |
| 15 | `creator` | 下单人 | `base.user.BipUser` | `creator` |  →  |  |  | Service |  |
| 16 | `consigneeDeptId` | 收货部门ID | `bd.adminOrg.AdminOrgVO` | `consignee_deptid` |  →  |  |  | Service |  |
| 17 | `auditor` | 审批人 | `base.user.BipUser` | `APPROVER_CODE` |  →  |  |  | Service |  |
| 18 | `costMaterialId` | 费用物料id | `pc.product.Product` | `cost_material_id` |  →  |  |  | Service |  |
| 19 | `supplierdocId` | 供应商档案ID | `aa.vendor.Vendor` | `supplierdoc_id` |  →  |  |  | Service |  |
| 20 | `applyPurchaseOrgId` | 需求组织ID | `org.func.BaseOrg` | `apply_purchase_orgid` |  →  |  |  | Service |  |
| 21 | `invoicePersonId` | 收票人ID | `bd.staff.Staff` | `invoice_person_id` |  →  |  |  | Service |  |
| 22 | `purchaserId` | 采购员id | `bd.staff.Staff` | `PURCHASER_ID` |  →  |  |  | Service |  |
| 23 | `deliverAddressId` | 收货地址id | `mall.deliveraddress.MetaDeliverAddress` | `deliver_address_id` |  →  |  |  | None |  |
| 24 | `warehouseId` | 仓库档案ID | `aa.warehouse.Warehouse` | `warehouse_id` |  →  |  |  | Service |  |
| 25 | `stockOrgId` | 库存组织id | `org.func.BaseOrg` | `stock_org_id` |  →  |  |  | Service |  |
| 26 | `assignPurchaserId` | 采购员ID | `bd.staff.Staff` | `assign_purchaser_id` |  →  |  |  | Service |  |
| 27 | `commiter` | 提交人 | `base.user.BipUser` | `commiter` |  →  |  |  | Service |  |
| 28 | `projectId` | 项目ID | `bd.project.ProjectVO` | `project_id` |  →  |  |  | Service |  |
| 29 | `orderdetail` | 商城订单明细 | `mall.mallofficeorder.OrderDetail` | `` | orderdetail → orderId | 1..n | true | None |  |

### Composition（子表）

- **orderdetail**: `orderdetail` → `mall.mallofficeorder.OrderDetail` | 1..n

### Service（外键引用）

| 字段 | 目标实体 | 数据库列 |
|------|---------|---------|
| `assignPurOrgId` (采购组织ID) | `org.func.BaseOrg` | `assign_purorg_id` |
| `operatingOrgId` (运营组织ID) | `org.func.BaseOrg` | `operating_org_id` |
| `financialOrgId` (财务组织ID) | `org.func.BaseOrg` | `financial_orgid` |
| `modifier` (修改人) | `base.user.BipUser` | `modifier` |
| `payerId` (支付人id) | `cpu-privilege.user.MgrUser` | `payer_id` |
| `applyPurchaserId` (申请人ID) | `bd.staff.Staff` | `apply_purchaser_id` |
| `consigneeOrgId` (收货组织ID) | `org.func.BaseOrg` | `consignee_orgid` |
| `ownerId` (制单人id) | `cpu-privilege.user.MgrUser` | `OWNER_ID` |
| `assignPurDeptId` (采购部门ID) | `bd.adminOrg.AdminOrgVO` | `assign_purdept_id` |
| `applyPurchaseDeptId` (需求部门ID) | `bd.adminOrg.AdminOrgVO` | `apply_purchase_deptid` |
| `currencyId` (币种id) | `bd.currencytenant.CurrencyTenantVO` | `currency_id` |
| `transtypeId` (交易类型id) | `bd.bill.TransType` | `transtype_id` |
| `consigneeId` (收货人ID) | `bd.staff.Staff` | `CONSIGNEE_ID` |
| `creator` (下单人) | `base.user.BipUser` | `creator` |
| `consigneeDeptId` (收货部门ID) | `bd.adminOrg.AdminOrgVO` | `consignee_deptid` |
| `auditor` (审批人) | `base.user.BipUser` | `APPROVER_CODE` |
| `costMaterialId` (费用物料id) | `pc.product.Product` | `cost_material_id` |
| `supplierdocId` (供应商档案ID) | `aa.vendor.Vendor` | `supplierdoc_id` |
| `applyPurchaseOrgId` (需求组织ID) | `org.func.BaseOrg` | `apply_purchase_orgid` |
| `invoicePersonId` (收票人ID) | `bd.staff.Staff` | `invoice_person_id` |
| `purchaserId` (采购员id) | `bd.staff.Staff` | `PURCHASER_ID` |
| `warehouseId` (仓库档案ID) | `aa.warehouse.Warehouse` | `warehouse_id` |
| `stockOrgId` (库存组织id) | `org.func.BaseOrg` | `stock_org_id` |
| `assignPurchaserId` (采购员ID) | `bd.staff.Staff` | `assign_purchaser_id` |
| `commiter` (提交人) | `base.user.BipUser` | `commiter` |
| `projectId` (项目ID) | `bd.project.ProjectVO` | `project_id` |
