---
tags: ["BIP", "元数据", "数据字典", "ycSouringInquiry", "sourcing.pricedecision.PriceDecision"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 定标单主表 (`sourcing.pricedecision.PriceDecision`)

> ycSouringInquiry | 物理表：`cpu_pricedecision`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定标单主表 |
| 物理表 | `cpu_pricedecision` |
| 数据库 schema | `yonbip-cpu-sourcing` |
| 所属应用 | `ycSouringInquiry` |
| 构建时间 | `2026-06-04 23:07:54.7560` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 定标单id |
| 编码 | `vbuyoffer_billcode` | String | 询价单号 |

---

## 直接属性（160个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `currency_name` | Bip币种名称 | `currency_name_diwork` | String |
| 2 | `orderUcName` | 下订单人员名称 | `order_ucname` | String |
| 3 | `orderUserUcId` | 下订单人员ID | `order_userucid` | 54800425-15da-4742-ae89-059d05e77c9b |
| 4 | `id` | 定标单id | `id` | Long |
| 5 | `buyofferid` | 询价单id | `buyofferid` | 5232ab96-f504-4bac-95bc-c1cba8d49f63 |
| 6 | `vbuyofferBillcode` | 询价单号 | `vbuyoffer_billcode` | String |
| 7 | `subject` | 寻源标题 | `subject` | String |
| 8 | `transactionTypeId` | 定标交易类型id | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 9 | `buyofferClassCode` | 询价单交易类型编码 | `buyoffer_class_code` | String |
| 10 | `buyofferClassName` | 询价单交易类型名称 | `buyoffer_class_name` | String |
| 11 | `noTaxAmount` | 定标无税总金额 | `no_tax_amount` | Decimal |
| 12 | `totalAmount` | 中标含税总金额 | `total_amount` | Decimal |
| 13 | `isNewFlow` | 是否为新审批 | `is_new_flow` | Integer |
| 14 | `submitterId` | 提交人id | `submitterId` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 15 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 16 | `sourceid` | 来源单据ID | `sourceid` | f6b61fde-72f1-44e0-8f43-608e448b2981 |
| 17 | `rewriteReqnumByPd` | 定标影响需求执行量 | `rewrite_reqnum_by_pd` | Short |
| 18 | `unDecidedStrat` | 未定标物料的处理策略 | `undecided_strat` | String |
| 19 | `sourcingSolution` | 寻源方案id | `sourcing_solution` | 5feddfc7-e8bb-4914-9718-937e7ea60df0 |
| 20 | `orderTime` | 下单时间 | `order_time` | DateTime |
| 21 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 22 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 23 | `pdPsnId` | 定标人 | `pd_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 24 | `creator` | 创建人名称 | `creator` | String |
| 25 | `transactionTypeName` | 定标交易类型名称 | `transaction_type_name` | String |
| 26 | `puorgDocName` | 采购组织 | `puorg_doc_name` | String |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `transactionTypeCode` | 定标交易类型编码 | `transaction_type_code` | String |
| 29 | `erpResult` | ERP处理结果 | `erp_result` | String |
| 30 | `fbillstatus` | 定标单状态 | `fbillstatus` | String |
| 31 | `priceStatus` | 定标状态 | `status` | String |
| 32 | `priceTemplateName` | 价格模板名称 | `price_template_name` | String |
| 33 | `priceTemplateId` | 价格模板id | `price_template_id` | Long |
| 34 | `buyofferType` | 履行方式(1:框架协议、2:普通合同、3.直接下单、4.价格调整) | `buyoffer_type` | String |
| 35 | `purcontentType` | 采购内容 | `purcontent_type` | String |
| 36 | `budgetMny` | 预算总额 | `budget_mny` | Decimal |
| 37 | `decideReson` | 推荐理由 | `decide_reson` | String |
| 38 | `tranTypePk` | 交易类型编码 | `trans_type_pk` | String |
| 39 | `useSuggestion` | 使用单位意见 | `use_suggestion` | String |
| 40 | `verifystate` | 审批状态 | `verifystate` | Short |
| 41 | `buyoffertime` | 询价时间 | `buyoffertime` | DateTime |
| 42 | `checkPriceMemo` | 核价备注 | `check_price_memo` | String |
| 43 | `archiveState` | 归档状态(0-未归档,1-已归档) | `archive_status` | String |
| 44 | `auditDate` | 审批日期 | `audit_date` | Date |
| 45 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 46 | `auditor` | 审批人名称 | `auditor` | String |
| 47 | `auditorId` | 审批人id | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 48 | `bidNoticeStatus` | 发布中标通知状态( 0 表示没有发布  1 已经发布) | `bid_notice_status` | Integer |
| 49 | `bidType` | 1:寻源时此字段没用; 2:招投标用:招标类型(物资,物流,服务) | `bid_type` | Integer |
| 50 | `bpmFlId` | 外部bpm系统表单关联id | `bpm_fl_id` | String |
| 51 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 52 | `buyofferRound` | 询价次数 | `buyoffer_round` | Integer |
| 53 | `code` | 编码 | `vbuyoffer_billcode` | String |
| 54 | `contact` | 联系人 | `contact` | String |
| 55 | `corpAccount` | 企业账号名:询价单带过来(采购需求字段) | `corp_account` | String |
| 56 | `corpAccountId` | 企业账号id:询价单带过来(采购需求字段) | `corp_account_id` | String |
| 57 | `corpSubAccount` | 企业子账号名:询价单带过来(采购需求字段) | `corp_sub_account` | String |
| 58 | `corpSubAccountid` | 企业子账号id:询价单带过来(采购需求字段) | `corp_sub_accountid` | String |
| 59 | `createDate` | 创建日期 | `create_date` | Date |
| 60 | `createTime` | 创建时间 | `create_time` | DateTime |
| 61 | `PriceDecisionDefineCharacter` | 定标单主表自定义项 | `define_character_id` | 6bd2c924-a507-4381-b966-7933e7ca1785 |
| 62 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 63 | `ctControlType` | 采购合同控制类型 | `ct_control_type` | String |
| 64 | `difctctx` | 按供应商履行不同的协议 | `difctctx` | Boolean |
| 65 | `ctInvoiceAgreement` | 采购合同发票协议 | `ct_invoice_agreement` | String |
| 66 | `ctIsMaterialClass` | 采购合同是否分类合同 | `ct_ismaterial_class` | String |
| 67 | `ctPayAgreement` | 付款协议描述 | `ct_pay_agreement` | String |
| 68 | `ctPayagreeCode` | 合同付款协议编码 | `ct_payagree_code` | String |
| 69 | `ctPayagreeId` | 合同付款协议id | `ct_payagree_id` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 70 | `ctPayagreeName` | 合同付款协议名称 | `ct_payagree_name` | String |
| 71 | `settleName` | 结算方式名称 | `settle_name` | String |
| 72 | `settleType` | 采购合同结算方式编码 | `settle_type` | String |
| 73 | `shelfPeriod` | 质保期 | `shelf_period` | String |
| 74 | `workPeriod` | 采购合同工期 | `work_period` | String |
| 75 | `ctPurcontentType` | 采购内容(旧) | `ct_purcontent_type` | String |
| 76 | `ctTermManualAddEnable` | 条款模板条款是否可手工增加 | `ct_term_manual_add_enable` | Integer |
| 77 | `ctTermTemplateId` | 条款模板id | `ct_term_template_id` | String |
| 78 | `ctTranstypeId` | 采购合同交易类型 | `ct_transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 79 | `currency_id` | 多币种融合币种 | `currency_id_diwork` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 80 | `currency_type_sign` | 币种符号 | `currency_type_sign_diwork` | String |
| 81 | `decideSummary` | 寻比价情况概述 | `decide_summary` | String |
| 82 | `decideTime` | 定标时间 | `decide_time` | DateTime |
| 83 | `deprecateReason` | 废标原因 | `deprecate_reason` | String |
| 84 | `deprecateTime` | 废标时间 | `deprecate_time` | DateTime |
| 85 | `deprecaterId` | 废标人 | `deprecater_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 86 | `description` | 描述 | `description` | String |
| 87 | `diffQuotaUnit` | 是否指定特殊报价单位 | `diff_quota_unit` | Integer |
| 88 | `dr` | 删除标识 | `dr` | String |
| 89 | `edit_status` | 标记定标单修改状态,0:正常态1:审批撤回2:审批撤回后修改 | `edit_status` | String |
| 90 | `enterpriseId` | 采购商租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 91 | `erpBillstatus` | erp单据状态:询价单带过来(采购需求字段) | `erp_billstatus` | String |
| 92 | `erpProductVersion` | erp版本:询价单带过来(采购需求字段) | `erp_product_version` | String |
| 93 | `erpVender` | erp提供商:询价单带过来(采购需求字段) | `erp_vender` | String |
| 94 | `erpptSts` | 记录是否已经推价表 | `erpPt_sts` | String |
| 95 | `errorMsg` | 记录异步生成订单日志 | `error_msg` | String |
| 96 | `fileId` | 附件 | `file_id` | String |
| 97 | `furtureTemplate` | 大宗物资招标类型 | `furture_template` | String |
| 98 | `invoiceType` | 税票信息 | `invoice_type` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b |
| 99 | `isSuperviseApprove` | 是否需要合规部审批1:是,0:否 | `is_supervise_approve` | String |
| 100 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 101 | `itemDetail` | 项目明细(富文本形式) | `item_detail` | String |
| 102 | `itemName` | 项目名称 | `item_name` | String |
| 103 | `lastBuyofferRound` | 最后一次询价 | `last_buyoffer_round` | Integer |
| 104 | `memo` | 定标说明 | `memo` | String |
| 105 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 106 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 107 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 108 | `offerType` | 期货报价模板下的报价方式 1实价 2 浮动金额 3 浮动比例 | `offer_type` | String |
| 109 | `onofflineType` | 报价来源 | `onoffline_type` | String |
| 110 | `openbidTime` | 开标时间 | `openbid_time` | DateTime |
| 111 | `orderPsnId` | 下单人员ID | `order_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 112 | `orderPsnName` | 下单人员 | `order_psn_name` | String |
| 113 | `orderPsnRoleType` | 下单类型 | `order_psn_role_type` | String |
| 114 | `orderRoleId` | 下单角色 | `order_role_id` | 6c660d78-70a8-438e-9925-f1c342df3a12 |
| 115 | `orderRoleName` | 下单角色名称 | `order_role_name` | String |
| 116 | `payTypes` | 期货报价模板下的报价模式(1表示账期2表示金额预付3表示部分预付) | `pay_types` | String |
| 117 | `paymentDesc` | 账期描述 | `payment_desc` | String |
| 118 | `performType` | 选中的履行类型 | `perform_type` | String |
| 119 | `phone` | 联系人电话 | `phone` | String |
| 120 | `priceModel` | 报价模式(1:现金,2:现金+承兑报价,3:现金+账期报价) | `price_model` | String |
| 121 | `processor` | 处理人 | `processor` | String |
| 122 | `projectId` | 立项单id(对于寻源没用) | `project_id` | Long |
| 123 | `publicEndTime` | 中标公示截止时间 | `public_end_time` | DateTime |
| 124 | `publishNotice` | 发布中标公示 | `publish_notice` | Integer |
| 125 | `pubts` | pubts | `pubts` | DateTime |
| 126 | `puorgDocId` | 采购组织ID | `puorg_doc_id` | 8006983d-d605-473b-b0c4-0e9469aaacff |
| 127 | `purchaseId` | 采购员ID | `purchase_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 128 | `purchaseNames` | 采购员 | `purchase_name` | String |
| 129 | `qtexpiredate` | 询价截止时间 | `qtexpiredate` | DateTime |
| 130 | `quotaNumDefaultValue` | 合同签订形式为单价合同, 定标数量全部默认值 | `ct_quota_num_defaultvalue` | String |
| 131 | `quotationType` | 报价类型(1表示总价报价2表示明细报价) | `quotation_type` | String |
| 132 | `rate_type` | 汇率类型 | `rate_type_diwork` | String |
| 133 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 134 | `reqProjectPersonName` | 项目负责人 | `reqProjectPersonName` | String |
| 135 | `returncount` | 退回次数 | `returncount` | Short |
| 136 | `sendorderstatus` | 生成采购订单状态1:生单中,2:生单失败,3:生单完成 | `sendorderstatus` | String |
| 137 | `status` | 云审状态 | `workflow_status` | Integer |
| 138 | `supplierbidType` | 费率招标标识 | `supplierbid_type` | String |
| 139 | `symbol` | 币种符号 | `symbol` | String |
| 140 | `tenant` | 租户ID | `tenant_id` | String |
| 141 | `compareExchrateType` | 比价汇率类型 | `compare_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 142 | `ts` | ts时间戳 | `ts` | DateTime |
| 143 | `compareExchrateDate` | 比价汇率日期 | `compare_exchrate_date` | Date |
| 144 | `uapProjectdocId` | 平台项目档案 | `uap_projectdoc_Id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 145 | `useDepartment` | 使用部门 | `use_department` | 14302233-1394-4a70-94e1-bed51636f312 |
| 146 | `convertTotalAmount` | 折算询价币中标含税总金额 | `convert_total_amount` | Decimal |
| 147 | `vbillcode` | 定价单编号 | `vbillcode` | String |
| 148 | `convertNotaxTotalAmount` | 折算询价币中标无税总金额 | `convert_notax_total_amount` | Decimal |
| 149 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 150 | `warehouseid` | 仓库id | `wareHouseId` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 151 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 152 | `acceptanceDesc` | 承兑描述 | `acceptance_desc` | String |
| 153 | `addressName` | 地址名称(文字) | `address_name` | String |
| 154 | `advanceRatio` | 选择报价模式下的部分预付,预付比例字段必填 | `advance_ratio` | Decimal |
| 155 | `bodyPrint` | 定标单报价汇总打印 | `` | ca0ea394-b3ac-4da5-aa58-714922606b20 |
| 156 | `bodys` | 定标单物料子表 | `` | 5ad37a5c-0251-495d-8791-6c08a9d69254 |
| 157 | `createtime` | 创建时间 | `createtime` | DateTime |
| 158 | `define` | 定标单主表自由自定义项 | `` | 6ef8681f-91cf-4770-a8b1-37b0e480dc04 |
| 159 | `exes` | 定标单履行方式子表 | `` | 26d9222f-a0fc-45fd-87e6-244bc3256cd6 |
| 160 | `progress` | 定标单处理进度 | `` | 3a66443b-e975-4ac5-884a-987238954cd9 |

---

## 关联属性（32个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `compareExchrateType` | 比价汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 2 | `PriceDecisionDefineCharacter` | 定标单主表自定义项 | `sourcing.pricedecision.PriceDecisionDefineCharacter` | None |  |
| 3 | `purchaseId` | 采购员ID | `bd.staff.Staff` | Service |  |
| 4 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 6 | `ctPayagreeId` | 合同付款协议id | `bd.payments.PayAgreement` | Service |  |
| 7 | `pdPsnId` | 定标人 | `bd.staff.Staff` | Service |  |
| 8 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 9 | `bodys` | 定标单物料子表 | `sourcing.pricedecision.PriceDecisionDetail` | None | true |
| 10 | `uapProjectdocId` | 平台项目档案 | `bd.project.ProjectVO` | Service |  |
| 11 | `deprecaterId` | 废标人 | `base.user.User` | Service |  |
| 12 | `orderUserUcId` | 下订单人员ID | `base.user.User` | Service |  |
| 13 | `sourcingSolution` | 寻源方案id | `sourcing.businessRuleSolution.BusinessRuleSolution` | Service |  |
| 14 | `exes` | 定标单履行方式子表 | `sourcing.pricedecision.PriceDecisionContractExt` | None | true |
| 15 | `warehouseid` | 仓库id | `aa.warehouse.Warehouse` | Service |  |
| 16 | `submitterId` | 提交人id | `cpu-privilege.user.MgrUser` | Service |  |
| 17 | `define` | 定标单主表自由自定义项 | `sourcing.pricedecision.PriceDecisionDefine` | None | true |
| 18 | `invoiceType` | 税票信息 | `bd.invoice.InvoiceTypeVO` | Service |  |
| 19 | `orderPsnId` | 下单人员ID | `bd.staff.Staff` | Service |  |
| 20 | `sourceid` | 来源单据ID | `sourcing.pricecomparison.CpuPreBuyoffer` | None |  |
| 21 | `transactionTypeId` | 定标交易类型id | `bd.bill.TransType` | Service |  |
| 22 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 23 | `orderRoleId` | 下单角色 | `sys.auth.Role` | Service |  |
| 24 | `buyofferid` | 询价单id | `sourcing.ibuyoffer.BuyOfferVO` | None |  |
| 25 | `useDepartment` | 使用部门 | `org.func.BaseOrg` | Service |  |
| 26 | `bodyPrint` | 定标单报价汇总打印 | `sourcing.pricedecision.PriceDecisionPrint` | None | true |
| 27 | `puorgDocId` | 采购组织ID | `bd.adminOrg.PurchaseOrgVO` | Service |  |
| 28 | `auditorId` | 审批人id | `base.user.User` | Service |  |
| 29 | `ctTranstypeId` | 采购合同交易类型 | `bd.bill.TransType` | Service |  |
| 30 | `progress` | 定标单处理进度 | `sourcing.pricedecision.PriceDecisionProgress` | None | true |
| 31 | `enterpriseId` | 采购商租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 32 | `currency_id` | 多币种融合币种 | `bd.currencytenant.CurrencyTenantVO` | Service |  |
