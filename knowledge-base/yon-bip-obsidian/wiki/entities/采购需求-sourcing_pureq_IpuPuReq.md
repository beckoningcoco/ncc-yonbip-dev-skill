---
tags: ["BIP", "元数据", "数据字典", "ycReqManagement", "sourcing.pureq.IpuPuReq"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购需求 (`sourcing.pureq.IpuPuReq`)

> **平台版本：BIP 旗舰版 V5**

> ycReqManagement 模块 | 物理表：`ipu_pu_req`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购需求 |
| 物理表 | `ipu_pu_req` |
| domain/服务域 | `yonbip-cpu-sourcing` |
| 所属应用 | `ycReqManagement` |
| 构建时间 | `2026-06-04 20:17:02.5120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-05-23 00:08:49:000

## 依赖接口（9个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 生单回写字符型 | `base.itf.IBackWriteStr` | 85 |
| 2 | 项目结构属性 | `BGDM.wbs.projectStructureProperties` | 49 |
| 3 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 4 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 7 | 自动编号 | `voucher.base.IAutoCode` | 49 |
| 8 | 流程接口 | `base.itf.IBusinessFlow` | 77 |
| 9 | 审计信息 | `ucfbase.ucfbaseItf.IAuditInfo` | 192 |

---

## 直接属性（312个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `puorgDocId` | 采购组织 | `pu_org_doc_id` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 3 | `reqOrgId` | 需求组织 | `req_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `reqDeptId` | 需求部门 | `reqdept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 5 | `reqContactId` | 需求联系人 | `req_contact_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 6 | `materialClassId` | 物料分类 | `material_class_id` | b295ef54-c421-4865-aca3-f5a9207a8d50 |
| 7 | `productDocId` | 物料 | `product_doc_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 8 | `ipuPuReqFreeCharacteristics` | 采购需求自由项特征组 | `free_characters_id` | 072d4670-aecd-4953-9674-0f6969c5d7b3 |
| 9 | `ipuPuReqDefineCharacter` | 采购需求自定义项 | `define_character_id` | a92f76b1-e293-4254-8333-bbf31b943389 |
| 10 | `planDeptId` | 计划部门 | `plan_dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 11 | `planPsnId` | 计划员 | `plan_psn_id` | 78bff1de-ddf1-4814-90de-b0b5f1eac78a |
| 12 | `erpCpuPsnId` | 采购员 | `erp_cpu_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 13 | `receiveOrgId` | 收货组织 | `receive_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 14 | `receivePersonId` | 收货人 | `receive_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 15 | `reqUapProjectId` | 项目 | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 16 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 17 | `reqOrgCode` | (废弃)需求组织编码 | `req_org_code` | String |
| 18 | `reqOrgName` | (废弃)需求组织名称 | `req_org_name` | String |
| 19 | `erpReqDeptName` | 需求部门名称 | `erp_reqdept_name` | String |
| 20 | `erpReqDeptCode` | 需求部门编码 | `erp_reqdept_code` | String |
| 21 | `reqContact` | 需求联系人 | `req_contact` | String |
| 22 | `materialClassCode` | (废弃)物料分类编码 | `material_class_code` | String |
| 23 | `materialClassName` | (废弃)物料分类名称 | `material_class_name` | String |
| 24 | `planDeptName` | (废弃)计划部门名称 | `plan_dept_name` | String |
| 25 | `sourcingPlan` | 寻源方案 | `sourcing_plan` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 |
| 26 | `sourcingStrategy` | 寻源方案策略 | `sourcing_strategy` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 27 | `assignObj` | 受理人或者受理角色,列表查询用 | `assign_obj` | String |
| 28 | `invPurExchRateNum` | 采购换算率分子 | `invPurExchRateNum` | Decimal |
| 29 | `invPriceExchRateNum` | 计价换算率分子 | `invPriceExchRateNum` | Decimal |
| 30 | `invPurExchRateDen` | 采购换算率分母 | `invPurExchRateDen` | Decimal |
| 31 | `invPriceExchRateDen` | 计价换算率分母 | `invPriceExchRateDen` | Decimal |
| 32 | `accruedBusiNums_mu` | 累计执行主数量 | `accrued_busi_nums_mu` | Decimal |
| 33 | `accruedPureqCloseNums_mu` | 累计需求关闭主数量 | `accrued_pureq_close_nums_mu` | Decimal |
| 34 | `accruedEntrustNums_mu` | 累计采购委托主数量 | `accrued_entrust_nums_mu` | Decimal |
| 35 | `accruedBuyofferEntrustNums_mu` | 累计委托询价主数量 | `accrued_buyoffer_entrust_nums_mu` | Decimal |
| 36 | `accruedBuyofferNums_mu` | 累计直接询价主数量 | `accrued_buyoffer_nums_mu` | Decimal |
| 37 | `accruedBuyofferPublishNums_mu` | 累计询价总发布主数量 | `accrued_buyoffer_publish_nums_mu` | Decimal |
| 38 | `accruedPdNums_mu` | 累计询价总定标主数量 | `accrued_pd_nums_mu` | Decimal |
| 39 | `accruedBuyofferCloseNums_mu` | 累计询价终止主数量 | `accrued_buyoffer_close_nums_mu` | Decimal |
| 40 | `accruedProjectEntrustNums_mu` | 累计委托招投标立项主数量 | `accrued_project_entrust_nums_mu` | Decimal |
| 41 | `accruedProjectNums_mu` | 累计直接招投标立项主数量 | `accrued_project_nums_mu` | Decimal |
| 42 | `accruedBidPdNums_mu` | 累计招投标总定标主数量 | `accrued_bid_pd_nums_mu` | Decimal |
| 43 | `accruedBidProgrammeNums_mu` | 累计竞拍方案主数量 | `accrued_bid_programme_nums_mu` | Decimal |
| 44 | `accruedMallOrderNums_mu` | 累计超市订单主数量 | `accrued_mall_order_nums_mu` | Decimal |
| 45 | `accruedCtNums_mu` | 累计寻源合同主数量 | `accrued_ct_nums_mu` | Decimal |
| 46 | `preemptionDirectCtNums_mu` | 累计直接合同主数量 | `preemption_direct_ct_nums_mu` | Decimal |
| 47 | `preemptionDirectOrderNums_mu` | 累计合同订单总主数量 | `preemption_direct_order_nums_mu` | Decimal |
| 48 | `accruedDirectOrderNums_mu` | 累计直接订单主数量 | `accrued_direct_order_nums_mu` | Decimal |
| 49 | `accruedOrderNums_mu` | 累计寻源订单主数量 | `accrued_order_nums_mu` | Decimal |
| 50 | `orderedQuantity_mu` | 累计订单主数量 | `ordered_quantity_mu` | Decimal |
| 51 | `accruedQuotaOrderNums_mu` | 累计货源下单主数量 | `accrued_quota_order_nums_mu` | Decimal |
| 52 | `modifyTime` | 更新时间 | `modify_time` | DateTime |
| 53 | `accruedDirectCtNums_mu` | 累计直接合同主数量 | `accrued_direct_ct_nums_mu` | Decimal |
| 54 | `orderPlan` | 采购执行方案 | `order_plan` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 |
| 55 | `orderStrategy` | 采购执行方案策略 | `order_strategy` | da7e5585-8f8c-4510-b005-9e6bcaf6995d |
| 56 | `orderMethod` | 下单方式 | `order_method` | String |
| 57 | `sourcingProcess` | 寻源流程 | `sourcing_process` | String |
| 58 | `noTaxPrice` | 无税单价 | `noTaxPrice` | Decimal |
| 59 | `taxPrice` | 含税单价 | `taxPrice` | Decimal |
| 60 | `taxCategoryId` | 税目id | `taxCategoryId` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 61 | `priceSubId` | 价目子表id | `priceSubId` | eb9690f1-b4ed-4223-8ce3-06710f2c6242 |
| 62 | `quotaId` | 配额协议主表id | `quotaId` | 7c5859b8-7389-4dff-9fe8-4307e8557b30 |
| 63 | `quotaSubId` | 配额协议子表id | `quotaSubId` | 5e0b84a4-3569-4338-9773-f16632e21752 |
| 64 | `contractId` | 采购合同ID | `contractId` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 65 | `contractMaterialId` | 采购合同物料子表ID | `contractMaterialId` | 07141343-35c1-4687-b99c-405bfa7a3096 |
| 66 | `planPsnName` | (废弃)计划员名称 | `plan_psn_name` | String |
| 67 | `reqPurUser` | 采购员 | `req_pur_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 68 | `reqPurUserName` | 采购员名称 | `req_pur_user_name` | String |
| 69 | `reqPhone` | 采购员电话 | `req_phone` | String |
| 70 | `receiveOrgName` | (废弃)收货组织名称 | `receive_org_name` | String |
| 71 | `receivePersonName` | (废弃)收货人姓名 | `receive_person_name` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 72 | `receivePersonTel` | (废弃)收货人电话 | `receive_person_tel` | String |
| 73 | `receiveAddress` | 收货地 | `receive_address` | String |
| 74 | `reqProjectName` | 项目名称 | `req_project_name` | String |
| 75 | `transactionTypeName` | (废弃)交易类型名称 | `transaction_type_name` | String |
| 76 | `transactionTypeCode` | (废弃)交易类型编码 | `transaction_type_code` | String |
| 77 | `reqPurpose` | (废弃)用途 | `req_purpose` | String |
| 78 | `subject` | 采购需求标题(询价单标题) | `subject` | String |
| 79 | `puorgid` | 采购组织 | `puorgid` | String |
| 80 | `corpSubAccountid` | 外系统人员 | `corp_sub_accountid` | String |
| 81 | `puorgcode` | (废弃)采购组织编码 | `puorgcode` | String |
| 82 | `puorgname` | (废弃)外系统采购组织id名称  | `puorgname` | String |
| 83 | `corpSubAccountname` | 外系统人员名称(采购员名称)  | `corp_sub_accountname` | String |
| 84 | `currencyIdDiwork` | BIP币种 | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 85 | `currencyCodeDiwork` | (废弃)币种编码 | `currency_code_diwork` | String |
| 86 | `currencyTypeSignDiwork` | (废弃)币种符号 | `currency_type_sign_diwork` | String |
| 87 | `invPurExchRate` | 采购换算率 | `invPurExchRate` | Decimal |
| 88 | `productCode` | (废弃)产品编码 | `product_code` | String |
| 89 | `productId` | 产品编码 | `product_id` | String |
| 90 | `productName` | (废弃)产品名称 | `product_name` | String |
| 91 | `expenseItemId` | 费用项目主键 | `expense_item_id` | d78cdbfa-0424-4dc3-a995-5c8624e1a560 |
| 92 | `accruedBidProgrammeNums` | 累积竞拍方案量(计价数量) | `accrued_bid_programme_nums` | Decimal |
| 93 | `accruedQuotaOrderNums` | 累积订单量(货源下单) | `accrued_quota_order_nums` | Decimal |
| 94 | `erpApplyorderType` | erp请购单类型 | `erp_applyorder_type` | Integer |
| 95 | `processesId` | 工序id | `processes_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 96 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 97 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 98 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 99 | `sourceid` | 上游单据主表id | `sourcehid` | String |
| 100 | `appointContractId` | 指定合同id | `appoint_contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 101 | `source` | 上游单据类型 | `source` | String |
| 102 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 103 | `purchaseTypeCode` | 采购具体类型编码 | `purchasetype_code` | String |
| 104 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 105 | `upcode` | 上游单据号 | `sourcecode` | String |
| 106 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 107 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 108 | `profitCenterName` | 利润中心名称 | `profitcenter_name` | String |
| 109 | `purchaseTypeName` | 采购具体类型名称 | `purchasetype_name` | String |
| 110 | `sourceautoid` | 上游单据子表id | `sourcebid` | String |
| 111 | `pubts` | 时间戳 | `pubts` | DateTime |
| 112 | `dr` | 逻辑删除标记 | `dr` | Short |
| 113 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 114 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 115 | `code` | 编码 | `code` | String |
| 116 | `singleBudgetApplyid` | 单项预算申请单编号 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 |
| 117 | `isClosed` | 关闭/打开状态 | `isClosed` | String |
| 118 | `singleBudgetApplybid` | 单项预算申请单明细 | `single_budget_applybid` | 0dd17389-d0ee-4f01-b34b-9a17be57afcb |
| 119 | `currencyNameDiwork` | (废弃)BIP币种名称 | `currency_name_diwork` | String |
| 120 | `sourceTypeFormId` | 来源单据类型 | `source_type_form_id` | String |
| 121 | `operationTime` | 打开/关闭时间 | `operationTime` | DateTime |
| 122 | `operationReason` | 关闭/打开原因 | `operationReason` | String |
| 123 | `operationName` | 打开/关闭名称 | `operationName` | String |
| 124 | `productDesc` | 商品描述 | `product_desc` | String |
| 125 | `productSpec` | (废弃)商品规格 | `product_spec` | String |
| 126 | `productType` | (废弃)商品型号 | `product_type` | String |
| 127 | `purchaseNum` | 采购数量 | `purchaseNum` | Decimal |
| 128 | `purchaseUnitCode` | (废弃)采购单位编码 | `purchaseUnitCode` | String |
| 129 | `purchaseUnitName` | (废弃)采购单位名称 | `purchaseUnitName` | String |
| 130 | `mainNum` | 主数量 | `mainNum` | Decimal |
| 131 | `mainUnitCode` | (废弃)主单位编码 | `mainUnitCode` | String |
| 132 | `mainUnitName` | (废弃)主单位名称 | `mainUnitName` | String |
| 133 | `quantity` | 计价数量 | `quantity` | Decimal |
| 134 | `unit` | (废弃)单位 | `unit` | String |
| 135 | `invPriceExchRate` | 计价换算率 | `invPriceExchRate` | Decimal |
| 136 | `reqProjectCode` | (废弃)项目需求编码 | `req_project_code` | String |
| 137 | `reqProjectPersonName` | (废弃)项目负责人 | `reqProjectPersonName` | String |
| 138 | `reqOrgDocId` | 需求组织id | `req_org_doc_id` | String |
| 139 | `erpReqDeptId` | 需求部门id | `erp_reqdept_id` | String |
| 140 | `reqdate` | 需求日期 | `reqdate` | DateTime |
| 141 | `accruedBidPdNums` | 累积招投标定标量 | `accrued_bid_pd_nums` | Decimal |
| 142 | `phone` | 电话 | `phone` | String |
| 143 | `accruedBusiNums` | 累积执行量-实际量 | `accrued_busi_nums` | Decimal |
| 144 | `accruedBuyofferCloseNums` | 累积询价终止数量 | `accrued_buyoffer_close_nums` | Decimal |
| 145 | `accruedBuyofferEntrustNums` | 累积询价量(保存)-(是采购委托生成的询价单) | `accrued_buyoffer_entrust_nums` | Decimal |
| 146 | `accruedBuyofferNums` | 累积询价量(保存)-(不是采购委托生成的询价单) | `accrued_buyoffer_nums` | Decimal |
| 147 | `accruedBuyofferPublishNums` | 累积询价量(发布) | `accrued_buyoffer_publish_nums` | Decimal |
| 148 | `accruedCtNums` | 累积合同量 | `accrued_ct_nums` | Decimal |
| 149 | `accruedDirectCtNums` | 累积合同量(采购需求直接生成合同) | `accrued_direct_ct_nums` | Decimal |
| 150 | `accruedDirectOrderNums` | 累积订单量(协议直采、跟单采购订单) | `accrued_direct_order_nums` | Decimal |
| 151 | `accruedEntrustNums` | 累积采购委托量 | `accrued_entrust_nums` | Decimal |
| 152 | `accruedMallOrderNums` | 累积超市订单量 | `accrued_mall_order_nums` | Decimal |
| 153 | `accruedOrderNums` | 累积订单量(寻源订单量) | `accrued_order_nums` | Decimal |
| 154 | `accruedPdNums` | 累积定标量 | `accrued_pd_nums` | Decimal |
| 155 | `accruedProjectEntrustNums` | 累积招投标立项量-(是采购委托生成的立项单) | `accrued_project_entrust_nums` | Decimal |
| 156 | `headBillId` | 源头单据主表id | `head_bill_id` | String |
| 157 | `accruedProjectNums` | 累积招投标立项量-(不是采购委托生成的立项单) | `accrued_project_nums` | Decimal |
| 158 | `accruedPureqCloseNums` | 累积需求终止数量 | `accrued_pureq_close_nums` | Decimal |
| 159 | `headBillCode` | 源头单据号 | `head_bill_code` | String |
| 160 | `busiType` | 寻源类型:1.询比价、2.招投标、3.竞买、4.协议直采(协同订单)、5.跟单采购(协同订单)、6.清单采购(超市订单) | `busi_type` | String |
| 161 | `headBillBId` | 源头单据子表id | `head_bill_b_id` | String |
| 162 | `buyofferTime` | 询价时间(用于控制并发) | `buyoffer_time` | DateTime |
| 163 | `headBillRowno` | 源头单据行号 | `head_bill_rowno` | String |
| 164 | `headBillType` | 源头单据类型 | `head_bill_type` | String |
| 165 | `createPin` | 创建人 | `create_pin` | String |
| 166 | `ecBillcode` | 电商询价单号 | `ec_billcode` | String |
| 167 | `erpBillstatus` | (废弃)状态 | `erp_billstatus` | String |
| 168 | `gmtQuotationExpire` | 报价截止日期 | `gmt_quotation_expire` | DateTime |
| 169 | `costcenterId` | 成本中心id | `costcenter_id` | 872630ba-e8f4-4080-817d-8fc9a6958733 |
| 170 | `marpuclasscode` | NC请购单物料采购分类编码 | `marpuclasscode` | String |
| 171 | `marpuclassname` | NC请购单物料采购分类名称 | `marpuclassname` | String |
| 172 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 173 | `orderSplit` | 订单弹性分单条件标识 | `order_split` | String |
| 174 | `businessType` | 业务类型 | `business_type` | String |
| 175 | `orderSplitName` | 订单弹性分单条件标识名称 | `order_split_name` | String |
| 176 | `orgChangPersonName` | 需求组织变更操作人姓名 | `orgchang_personname` | String |
| 177 | `orgChangTime` | 采购组织变更时间 | `orgChang_time` | DateTime |
| 178 | `preemptionBusiNums` | 累积执行量-预占量 | `preemption_busi_nums` | Decimal |
| 179 | `preemptionDirectCtNums` | 累积合同量-预占量(采购需求直接生成合同) | `preemption_direct_ct_nums` | Decimal |
| 180 | `preemptionDirectOrderNums` | 累积订单量-预占量(协议直采、跟单采购订单) | `preemption_direct_order_nums` | Decimal |
| 181 | `processTime` | (废弃)处理时间 | `process_time` | DateTime |
| 182 | `processor` | 处理人 | `processor` | String |
| 183 | `purCategory` | 采购类别 | `pur_category` | String |
| 184 | `quotationid` | (废弃) | `quotationid` | Long |
| 185 | `refuseErpReason` | 退回ERP原因 | `refuse_erp_reason` | String |
| 186 | `requireType` | 需求类型 | `require_type` | String |
| 187 | `returnMsg` | 寻源过程中将需求退回到采购任务原因 | `return_msg` | String |
| 188 | `ts` | 时间戳 | `ts` | DateTime |
| 189 | `updatePin` | 修改人 | `update_pin` | String |
| 190 | `updateTime` | 更新时间 | `update_time` | DateTime |
| 191 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 192 | `planPrice` | 计划价格 | `plan_price` | Decimal |
| 193 | `brand` | (废弃)品牌 | `brand` | String |
| 194 | `suggestSupplierName` | (废弃)推荐供应商名称 | `suggest_supplier_name` | String |
| 195 | `suggestSupplierId` | 推荐供应商id(erp供应商id) | `suggest_supplier_id` | String |
| 196 | `sourcehid` | 来源单据id | `sourcehid` | String |
| 197 | `currencyid` | 外系统币种的标识 | `currencyid` | String |
| 198 | `sourcebid` | 来源行id | `sourcebid` | String |
| 199 | `planpsnOrgId` | 外系统计划员所属组织id  | `planpsn_org_id` | String |
| 200 | `wareHouseId` | 仓库id | `wareHouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 201 | `wareHouseName` | (废弃)仓库名称 | `wareHouseName` | String |
| 202 | `modifiedtime` | 更新时间 | `modifiedtime` | DateTime |
| 203 | `wareHouseCode` | 仓库编码 | `wareHouseCode` | String |
| 204 | `mainUnitId` | 主单位 | `mainUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 205 | `unitid` | 计价单位 | `unitid` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 206 | `fileId` | 附件ID | `file_id` | String |
| 207 | `corpSubAccount` | 企业子账号(erp采购员编码 | `corp_sub_account` | String |
| 208 | `sourcecode` | 来源单据号 | `sourcecode` | String |
| 209 | `ecProcessStatus` | 电商处理状态 | `ec_process_status` | String |
| 210 | `erpVender` | erp产品供应商 | `erp_vender` | String |
| 211 | `erpProductVersion` | erp产品及版本 | `erp_product_version` | String |
| 212 | `unitcode` | (废弃)单位编码 | `unitcode` | String |
| 213 | `sourcerowno` | 来源单据行号 | `sourcerowno` | String |
| 214 | `planpsnCode` | 外系统计划员编码  | `planpsn_code` | String |
| 215 | `planpsnMobile` | 外系统计划员手机  | `planpsn_mobile` | String |
| 216 | `planpsnDeptCode` | 外系统计划员所属部门code  | `planpsn_dept_code` | String |
| 217 | `planpsnDeptName` | 外系统计划员所属部门名称  | `planpsn_dept_name` | String |
| 218 | `planpsnReceiveAddress` | 外系统带入的收货地址  | `planpsn_receive_address` | String |
| 219 | `planpsnOrgCode` | 外系统计划员所属组织code  | `planpsn_org_code` | String |
| 220 | `planpsnOrgName` | 外系统计划员所属组织名称  | `planpsn_org_name` | String |
| 221 | `corpAccountname` | 外系统组织or集团名称 | `corp_accountname` | String |
| 222 | `groupcode` | 外系统集团code  | `groupcode` | String |
| 223 | `groupname` | 外系统集团名称  | `groupname` | String |
| 224 | `assignPsn` | 分配人 | `assign_psn` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 225 | `refuseAssignPsn` | 退回分配人-退回分配的云采人员id | `refuse_assign_psn` | String |
| 226 | `assignDept` | 分配角色 | `assign_dept` | 6c660d78-70a8-438e-9925-f1c342df3a12 |
| 227 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 228 | `createTime` | 创建时间 | `create_time` | DateTime |
| 229 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 230 | `erpBillmaker` | ERP制单人 | `erp_billmaker` | String |
| 231 | `memo` | 备注 | `memo` | String |
| 232 | `erpRelatedInfo` | erp相关信息 | `erp_related_info` | String |
| 233 | `refNo` | (废弃)供应商协议号 | `ref_no` | String |
| 234 | `erpBillCodeNo` | erp单据号+行号(导入时校验是否重复用) | `erp_bill_code_no` | String |
| 235 | `returningErp` | 是否正在退回ERP | `returning_erp` | Integer |
| 236 | `assignnerPsnDocName` | 分配发起者的person name | `assignner_psn_doc_name` | String |
| 237 | `refuseAssignReason` | 退回分配人-退回分配的云采人员id | `refuse_assign_reason` | String |
| 238 | `outTenderPsn` | (废弃)转外部招标人 | `out_tender_psn` | String |
| 239 | `assignDate` | 分配时间 | `assign_date` | DateTime |
| 240 | `orderedQuantity` | 已下单数量 | `ordered_quantity` | Decimal |
| 241 | `orderSourceStatus` | 生成采购订单方式 | `order_source_status` | String |
| 242 | `currencyCode` | 币种编码 | `currency_code` | String |
| 243 | `currencyName` | (废弃)币种名称 | `currency_name` | String |
| 244 | `ERPProjectId` | erp项目id | `erp_project_id` | String |
| 245 | `ERPProjectName` | erp项目名称(和reqProjectName相同) | `erp_project_name` | String |
| 246 | `assignnerPsnDocId` | 分配发起者的person Id | `assignner_psn_doc_id` | String |
| 247 | `buyofferPublishUserId` | 生成下游单据操作人(云采用户id) | `buyoffer_publish_user_id` | Long |
| 248 | `contractBillType` | 生成的合同类型 | `contract_bill_type` | String |
| 249 | `corpAccount` | (废弃)企业账号(erp组织编码) | `corp_account` | String |
| 250 | `corpAccountid` | 外系统组织or集团id | `corp_accountid` | String |
| 251 | `contact` | (废弃)联系人 | `contact` | String |
| 252 | `corpSubAccountUserId` | 需求提交人的用户id-云采用户id | `corp_sub_account_user_id` | Long |
| 253 | `emergencyFlag` | 紧急度标识 | `emergency_flag` | Integer |
| 254 | `entrustId` | 采购需求委托单id | `entrust_id` | Long |
| 255 | `entrustPsnId` | 采购委托受理人id | `entrust_psn_id` | String |
| 256 | `entryTime` | 项目进场时间 | `entry_time` | DateTime |
| 257 | `erpBillmakerUserId` | ERP制单人对应的云采用户Id | `erp_billmaker_user_id` | Long |
| 258 | `errorMsg` | 记录异步生成订单日志 | `error_msg` | String |
| 259 | `groupid` | 外系统集团  | `groupid` | String |
| 260 | `isSplit` | (废弃)是否拆单 | `is_split` | String |
| 261 | `marpuclassid` | NC请购单物料采购分类ID | `marpuclassid` | String |
| 262 | `orderTime` | (废弃)订单时间 | `order_time` | DateTime |
| 263 | `orgChangPersonId` | 需求组织变更操作人ID | `orgchang_personid` | String |
| 264 | `planpsnDeptId` | 外系统计划员所属部门id  | `planpsn_dept_id` | String |
| 265 | `projectId` | 项目id | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 266 | `purchaseUnitId` | 采购单位 | `purchaseUnitId` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 267 | `reqProjectId` | 项目 | `req_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 268 | `suggestSpplierDocId` | 推荐供应商 | `suggest_spplier_doc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 269 | `sysVersion` | 系统版本 | `sys_version` | Long |
| 270 | `accruedPuDirectOrderNums` | 累计需求下单计价数量 | `accrued_pu_direct_order_nums` | Decimal |
| 271 | `accruedPuDirectOrderNums_mu` | 累计需求直接下单主数量 | `accrued_pu_direct_order_nums_mu` | Decimal |
| 272 | `brand_rca` | (废弃)品牌 | `brand` | String |
| 273 | `contact_rca` | (废弃)联系人 | `contact` | String |
| 274 | `corpAccount_rca` | (废弃)企业账号 | `corp_account` | String |
| 275 | `cpuIpuReqSkuext` | 采购需求sku扩展 | `` | 5f4eb70b-e0cd-415d-b97e-1c12b0acb571 |
| 276 | `currencyCodeDiwork_rca` | (废弃)币种编码 | `currency_code_diwork` | String |
| 277 | `currencyCode_rca` | 币种编码 | `currency_code` | String |
| 278 | `currencyNameDiwork_rca` | (废弃)BIP币种名称 | `currency_name_diwork` | String |
| 279 | `currencyName_rca` | (废弃)币种名称 | `currency_name` | String |
| 280 | `currencyTypeSignDiwork_rca` | (废弃)币种符号 | `currency_type_sign_diwork` | String |
| 281 | `defines` | 采购需求自由自定义项 | `` | b7d2ebf2-b857-4adc-aaf2-ff8ce62943a5 |
| 282 | `mainUnitCode_rca` | (废弃)主单位编码 | `mainUnitCode` | String |
| 283 | `mainUnitName_rca` | (废弃)主单位名称 | `mainUnitName` | String |
| 284 | `materialClassCode_rca` | (废弃)物料分类编码 | `material_class_code` | String |
| 285 | `materialClassName_rca` | (废弃)物料分类名称 | `material_class_name` | String |
| 286 | `materialList` | 材料表(采购需求子表) | `` | ad269cff-d965-4c42-9949-96596e5b6b56 |
| 287 | `orderTime_rca` | (废弃)订单时间 | `order_time` | DateTime |
| 288 | `outTenderPsn_rca` | (废弃)转外部招标人 | `out_tender_psn` | String |
| 289 | `planDeptName_rca` | (废弃)计划部门名称 | `plan_dept_name` | String |
| 290 | `planPsnName_rca` | (废弃)计划员名称 | `plan_psn_name` | String |
| 291 | `planpsnCode_rca` | 外系统计划员编码  | `planpsn_code` | String |
| 292 | `processTime_rca` | (废弃)处理时间 | `process_time` | DateTime |
| 293 | `productCode_rca` | (废弃)产品编码 | `product_code` | String |
| 294 | `productName_rca` | (废弃)产品名称 | `product_name` | String |
| 295 | `productSpec_rca` | (废弃)商品规格 | `product_spec` | String |
| 296 | `productType_rca` | (废弃)商品型号 | `product_type` | String |
| 297 | `purchaseUnitCode_rca` | (废弃)采购单位编码 | `purchaseUnitCode` | String |
| 298 | `purchaseUnitName_rca` | (废弃)采购单位名称 | `purchaseUnitName` | String |
| 299 | `receiveOrgName_rca` | (废弃)收货组织名称 | `receive_org_name` | String |
| 300 | `receivePersonName_rca` | (废弃)收货人姓名 | `receive_person_name` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 301 | `refNo_rca` | (废弃)供应商协议号 | `ref_no` | String |
| 302 | `reqOrgCode_rca` | (废弃)需求组织编码 | `req_org_code` | String |
| 303 | `reqOrgName_rca` | (废弃)需求组织名称 | `req_org_name` | String |
| 304 | `reqProjectCode_rca` | (废弃)项目需求编码 | `req_project_code` | String |
| 305 | `reqProjectName_rca` | (废弃)项目名称 | `req_project_name` | String |
| 306 | `suggestSupplierName_rca` | (废弃)推荐供应商名称 | `suggest_supplier_name` | String |
| 307 | `transactionTypeCode_rca` | (废弃)交易类型编码 | `transaction_type_code` | String |
| 308 | `transactionTypeName_rca` | (废弃)交易类型名称 | `transaction_type_name` | String |
| 309 | `unit_rca` | (废弃)单位 | `unit` | String |
| 310 | `unitcode_rca` | (废弃)单位编码 | `unitcode` | String |
| 311 | `wareHouseCode_rca` | (废弃)仓库编码 | `wareHouseCode` | String |
| 312 | `wareHouseName_rca` | (废弃)仓库名称 | `wareHouseName` | String |

---

## 关联属性（53个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expenseItemId` | 费用项目主键 | `bd.expenseitem.ExpenseItem` | Service |  |
| 2 | `modifier` | 修改人 | `base.user.BipUser` | Service |  |
| 3 | `materialList` | 材料表(采购需求子表) | `sourcing.pureq.CpuReqMaterialVO` | None | true |
| 4 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 5 | `defines` | 采购需求自由自定义项 | `sourcing.pureq.IpuReqVODefine` | None | true |
| 6 | `costcenterId` | 成本中心id | `bd.costcenter.CostCenter` | Service |  |
| 7 | `priceSubId` | 价目子表id | `aa.pricecenter.BiPriceEntity` | Service |  |
| 8 | `quotaSubId` | 配额协议子表id | `cpubase.quota.QuotaAgreeAllotVO` | Service |  |
| 9 | `contractMaterialId` | 采购合同物料子表ID | `cpu-contract.contract.ContractBodyVO` | Service |  |
| 10 | `mainUnitId` | 主单位 | `pc.unit.Unit` | Service |  |
| 11 | `purchaseUnitId` | 采购单位 | `pc.unit.Unit` | Service |  |
| 12 | `reqUapProjectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 13 | `quotaId` | 配额协议主表id | `cpubase.quota.QuotaAgreeVO` | Service |  |
| 14 | `orderPlan` | 采购执行方案 | `sourcing.businessRuleSolution.BusinessRuleSolution` | Service |  |
| 15 | `receivePersonId` | 收货人 | `bd.staff.Staff` | Service |  |
| 16 | `puorgDocId` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 17 | `projectId` | 项目id | `bd.project.ProjectVO` | Service |  |
| 18 | `productDocId` | 物料 | `pc.product.Product` | Service |  |
| 19 | `taxCategoryId` | 税目id | `archive.taxArchives.TaxRateArchive` | Service |  |
| 20 | `processesId` | 工序id | `ed.operation.Operation` | Service |  |
| 21 | `reqDeptId` | 需求部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 22 | `planDeptId` | 计划部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 23 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 24 | `singleBudgetApplybid` | 单项预算申请单明细 | `znbzbx.memoapply.MemoApplyBVO` | Service |  |
| 25 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 26 | `sourcingStrategy` | 寻源方案策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | Service |  |
| 27 | `reqProjectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 28 | `assignDept` | 分配角色 | `sys.auth.Role` | Service |  |
| 29 | `erpCpuPsnId` | 采购员 | `bd.staff.Staff` | Service |  |
| 30 | `assignPsn` | 分配人 | `bd.staff.Staff` | Service |  |
| 31 | `currencyIdDiwork` | BIP币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 32 | `ipuPuReqFreeCharacteristics` | 采购需求自由项特征组 | `sourcing.pureq.IpuReqFreeCharacters` | None |  |
| 33 | `suggestSpplierDocId` | 推荐供应商 | `aa.vendor.Vendor` | Service |  |
| 34 | `receivePersonName_rca` | (废弃)收货人姓名 | `bd.staff.Staff` | Service |  |
| 35 | `wareHouseId` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 36 | `reqPurUser` | 采购员 | `bd.staff.Staff` | Service |  |
| 37 | `reqOrgId` | 需求组织 | `org.func.BaseOrg` | Service |  |
| 38 | `creator` | 创建人 | `base.user.BipUser` | Service |  |
| 39 | `planPsnId` | 计划员 | `bd.staff.StaffNew` | Service |  |
| 40 | `receiveOrgId` | 收货组织 | `org.func.BaseOrg` | Service |  |
| 41 | `materialClassId` | 物料分类 | `pc.cls.ManagementClass` | Service |  |
| 42 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 43 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 44 | `receivePersonName` | (废弃)收货人姓名 | `bd.staff.Staff` | Service |  |
| 45 | `sourcingPlan` | 寻源方案 | `sourcing.businessRuleSolution.BusinessRuleSolution` | Service |  |
| 46 | `reqContactId` | 需求联系人 | `bd.staff.StaffNew` | Service |  |
| 47 | `singleBudgetApplyid` | 单项预算申请单编号 | `znbzbx.memoapply.MemoApplyVO` | Service |  |
| 48 | `cpuIpuReqSkuext` | 采购需求sku扩展 | `sourcing.pureq.CpuIpuReqSkuext` | None | true |
| 49 | `contractId` | 采购合同ID | `cpu-contract.contract.ContractVO` | Service |  |
| 50 | `ipuPuReqDefineCharacter` | 采购需求自定义项 | `sourcing.pureq.IpuReqDefineCharacter` | None |  |
| 51 | `unitid` | 计价单位 | `pc.unit.Unit` | Service |  |
| 52 | `appointContractId` | 指定合同id | `cpu-contract.contract.ContractVO` | Service |  |
| 53 | `orderStrategy` | 采购执行方案策略 | `sourcing.businessRuleSolution.BusinessRuleControlStrategy` | Service |  |
