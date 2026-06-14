---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.saleorder.SaleOrderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售订单 (`cpu-order.saleorder.SaleOrderVO`)

> ycSaleCoor | 物理表：`cpu_sale_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售订单 |
| 物理表 | `cpu_sale_order` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:39.9840` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（201个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `saleOrderDefineCharacter` | 自定义项特征属性组 | `defineHeader` | b99f2a53-6924-45cd-8de7-f63d6e3c3cfe |
| 2 | `dr` | 删除标志 | `dr` | Integer |
| 3 | `invoiceBizTypeCode` | 发票方式 | `invoice_biz_type_code` | Integer |
| 4 | `invoiceBizTypeName` | 发票方式名称 | `invoice_biz_type_name` | String |
| 5 | `modifier` | 修改人 | `modifier` | String |
| 6 | `supEnterpriseName` | 供应商企业名称 | `sup_enterprise_name` | String |
| 7 | `ts` | 时间戳 | `ts` | DateTime |
| 8 | `purEnterpriseName` | 采购商的租户name | `pur_enterprise_name` | String |
| 9 | `orgName` | 采购组织 | `org_name` | String |
| 10 | `deptName` | 采购部门名称 | `dept_name` | String |
| 11 | `orderOtherId` | ERP订单号 | `order_other_id` | String |
| 12 | `ytenant` | 租户编码 | `ytenant_id` | String |
| 13 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 14 | `orderno` | 销售订单号 | `orderno` | String |
| 15 | `enterpriseName` | 供应商企业名称 | `enterprise_name` | String |
| 16 | `supplyPersionName` | 供应商联系人 | `supply_persion_name` | String |
| 17 | `supplyPhone` | 供应商联系电话 | `supply_phone` | String |
| 18 | `gmtCreate` | 创建时间 | `gmt_create` | DateTime |
| 19 | `pubts` | 时间戳 | `ts` | DateTime |
| 20 | `performanceMethod` | 履约方式 | `performance_method` | String |
| 21 | `processType` | 订单流程 | `process_type` | Integer |
| 22 | `targetBillId` | 目标单据id | `target_bill_Id` | String |
| 23 | `targettype` | 目标单据 | `target_type` | Integer |
| 24 | `payStatus` | 付款状态 | `pay_status` | Integer |
| 25 | `mallOrderId` | 超市订单id | `mall_order_id` | a5e54491-d54a-45d6-9800-4557b5d7b306 |
| 26 | `cooperationProcessArrival` | 到货协同流程 | `cooperation_process_arrival_enum` | String |
| 27 | `transTypeId` | 交易类型ID | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 28 | `transTypeName` | 交易类型名称 | `transtype_name` | String |
| 29 | `invoiceAddress` | 收票地址 | `invoice_address` | String |
| 30 | `invoiceReceiverName` | 收票人 | `invoice_receiver_name` | String |
| 31 | `invoiceReceiverMobile` | 收票人联系方式 | `invoice_receiver_phone` | String |
| 32 | `invoiceReceiverId` | 收票人主键 | `invoice_receiver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 33 | `supplySealFile` | 供应商盖章附件 | `supply_seal_file` | String |
| 34 | `personId` | 采购人员id | `person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 35 | `modifyNumber` | 变更生效版本 | `modifyNumber` | Integer |
| 36 | `paymentMethod` | 支付方式 | `payment_method` | String |
| 37 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 38 | `purchaseEmail` | 采购员邮箱 | `purchase_email` | String |
| 39 | `printCount` | 打印次数 | `printCount` | Integer |
| 40 | `isConRate` | 是否允许确认税率 | `is_con_rate` | String |
| 41 | `otherFileId` | 其他附件 | `other_file_id` | String |
| 42 | `purchaseName` | 采购员姓名 | `purchase_name` | String |
| 43 | `area` | 区域 | `area` | String |
| 44 | `purchasePhone` | 采购员联系电话 | `purchase_phone` | String |
| 45 | `sourceType` | 订单来源 | `source_type` | String |
| 46 | `totalMoney` | 总金额 | `total_money` | Decimal |
| 47 | `dealType` | 交易类型 | `deal_type` | String |
| 48 | `priceType` | 价格类型 | `price_type` | String |
| 49 | `notaxMoney` | 无税金额 | `notax_money` | Decimal |
| 50 | `signatureEffect` | 签章是否生效 | `signature_effect` | Boolean |
| 51 | `settlementMethod` | 结算方式 (含预付比例) | `settlement_method` | String |
| 52 | `vBuyOfferBillCode` | 询报价单单据号 | `vbuyoffer_billcode` | String |
| 53 | `projectDocName` | 项目名称 | `project_doc_name` | String |
| 54 | `ectTemplateName` | 电子订单模板名称 | `ect_template_name` | String |
| 55 | `ectId` | 电子订单id | `ectid` | String |
| 56 | `currencyName` | 币种 | `currency_name` | String |
| 57 | `transactionTypeName` | 交易类型名称 | `transaction_type_name` | String |
| 58 | `memo` | 发货备注 | `memo` | String |
| 59 | `transportName` | 运输方式名称 | `transport_name` | String |
| 60 | `transportType` | 运输方式 | `transport_type` | String |
| 61 | `changeTransportType` | 变更运输方式 | `change_transport_type` | String |
| 62 | `changeTransportName` | 变更运输方式名称 | `change_transport_name` | String |
| 63 | `businessType` | 业务类型:0.普通订单;1.VMI订单 | `business_type` | Integer |
| 64 | `enterpriseId` | 供应商租户id | `enterpriseid` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 65 | `invoice_state` | 开票类型 | `invoice_state` | Integer |
| 66 | `id` | ID | `id` | Long |
| 67 | `purOrderCode` | 采购订单号 | `pur_order_code` | String |
| 68 | `gmtModified` | 修改时间 | `gmt_modified` | DateTime |
| 69 | `discount` |  | `discount` | Decimal |
| 70 | `carriage` |  | `carriage` | Decimal |
| 71 | `purOrderId` | 采购订单id | `pur_order_id` | Long |
| 72 | `toPost` | 收货人邮编 | `to_post` | String |
| 73 | `stockFileId` | 采购附件 | `stock_file_id` | String |
| 74 | `toArea` | 收货人地址 | `to_area` | String |
| 75 | `refReaStatus` | 拒绝理由状态枚举 | `ref_rea_status` | String |
| 76 | `vreason` | 供应商拒绝/变更理由 | `vreason` | String |
| 77 | `sellerMemberId` | 卖家ID | `seller_member_id` | String |
| 78 | `orderStatus` | 订单状态 | `order_status` | String |
| 79 | `corpAccount` | 企业账号(ERP组织编码) | `corp_account` | String |
| 80 | `corpSubAccount` | 企业子账号(ERP采购员编码) | `corp_sub_account` | String |
| 81 | `changeStatus` | 变更子状态 | `change_status` | String |
| 82 | `corpAccountid` | 外系统组织or集团ID | `corp_accountid` | String |
| 83 | `changeMemo` | 变更备注 | `change_memo` | String |
| 84 | `saleFileId` | 供应方附件id | `sale_file_id` | String |
| 85 | `corpSubAccountid` | 外系统人员ID | `corp_sub_accountid` | String |
| 86 | `orderTime` | 订单日期 | `order_time` | Date |
| 87 | `closeUser` | 关闭用户姓名 | `close_user` | String |
| 88 | `supplierid` | 供应商id | `supplierid` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 89 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 90 | `erpProductVersion` | ERP产品及版本 | `erp_product_version` | String |
| 91 | `erpVender` | ERP产品供应商 | `erp_vender` | String |
| 92 | `processor` | 处理人 | `processor` | String |
| 93 | `processTime` | 处理时间 | `process_time` | DateTime |
| 94 | `billstatus` | 单据状态 | `billstatus` | Integer |
| 95 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 96 | `creator` | 创建人 | `creator` | String |
| 97 | `buyofferid` | 询价单id | `buyofferid` | Long |
| 98 | `pricedecisionid` | 定价单id | `pricedecisionid` | Long |
| 99 | `subject` | 订单标题 | `subject` | String |
| 100 | `supplierName` | 供应商 | `supplier_name` | String |
| 101 | `purchaseId` | 采购用户id | `purchaseid` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 102 | `currencyId` | 币种Id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 103 | `currencyCode` | 币种编号 | `currency_code` | String |
| 104 | `currencySymbol` |  | `currency_symbol` | String |
| 105 | `confirmTotalMoney` | 确认总金额(供应方) | `confirm_total_money` | Decimal |
| 106 | `supplyPersionId` | 供应商联系人id | `supply_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 107 | `orderSource` | 订单来源标识 云采 1688 | `order_source` | String |
| 108 | `orderSourceId` | 订单来源id  云采 1688 | `order_source_id` | String |
| 109 | `tplid` | tplid | `tplid` | Long |
| 110 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 111 | `ticketOrgId` | 收票组织ID | `ticket_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 112 | `invSupEnterpriseId` | 开票供应商租户id | `inv_sup_enterprise_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 113 | `rate` | 汇率 | `rate` | Decimal |
| 114 | `rateType` | 汇率类型 | `rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 115 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 116 | `sendErpMsg` | 发送到ERP成功或者失败消息记录 | `send_erp_msg` | String |
| 117 | `sendErpCode` | 云采订单发送NC订单状态 | `send_erp_code` | String |
| 118 | `deliver_address` | 收货地址信息 | `deliver_address` | String |
| 119 | `consignee_info` | 收货人信息 | `consignee_info` | String |
| 120 | `invoice_info` | 发票信息 | `invoice_info` | String |
| 121 | `purchaser_info` | 采购人信息 | `purchaser_info` | String |
| 122 | `isArrivePlan` | 是否到货计划:0-否;1-是 | `is_arrive_plan` | Boolean |
| 123 | `customerCode` | 客户编码 | `customer_code` | String |
| 124 | `customerName` | 客户名 | `customer_name` | String |
| 125 | `orgId` | 采购组织ID | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 126 | `errType` |  | `err_type` | String |
| 127 | `errMsg` |  | `err_msg` | String |
| 128 | `orderStatusPre` | 订单变更前状态 | `order_status_pre` | String |
| 129 | `projectDocId` | 项目档案id | `project_doc_id` | String |
| 130 | `projectDocCode` | 项目编码 | `project_doc_code` | String |
| 131 | `projectDocIdStr` | 平台项目档案id | `project_doc_idstr` | String |
| 132 | `prepaidRatio` | 预付比例 | `prepaid_ratio` | String |
| 133 | `purContentType` | 采购内容 | `pur_content_type` | String |
| 134 | `purContentId` | 采购内容(body)档案Id | `pur_content_id` | Long |
| 135 | `purContentTypeId` | 采购内容(head)档案Id | `pur_content_type_id` | Long |
| 136 | `purContentName` | 采购内容名称 | `pur_content_name` | String |
| 137 | `furtureTemplate` | 是否启用期货报价模板 | `furture_template` | String |
| 138 | `isContract` | 是否需要协同 | `is_contract` | String |
| 139 | `isConQuantity` | 是否允许确认数量 | `is_con_quantity` | String |
| 140 | `isConPrice` | 是否允许确认单价 | `is_con_price` | String |
| 141 | `changeRejectReason` | 变更拒绝理由 | `change_reject_reason` | String |
| 142 | `changeActive` | 变更动作 | `change_active` | String |
| 143 | `confirmUser` | 确认人 | `confirm_user` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 144 | `confirmUserName` | 确认人名 | `confirm_user_name` | String |
| 145 | `confirmDate` | 确认时间 | `confirm_date` | DateTime |
| 146 | `changeUser` | 变更人 | `change_user` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 147 | `changeUserName` | 变更人名 | `change_user_name` | String |
| 148 | `changeDate` | 变更时间 | `change_date` | DateTime |
| 149 | `isEffective` | 变更是否生效过 | `is_effective` | String |
| 150 | `invalidatePer` | 作废人 | `invalidate_per` | String |
| 151 | `invalidateTime` | 作废时间 | `invalidate_time` | DateTime |
| 152 | `invalidateMemo` | 作废备注 | `invalidate_memo` | String |
| 153 | `agentConfirmUser` | 代确认人Id | `agent_confirm_user` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 154 | `agentConfirmUserName` | 代确认人姓名 | `agent_confirm_user_name` | String |
| 155 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime |
| 156 | `industryTag` | 行业标签 | `industry_tag` | Integer |
| 157 | `urgency` | 紧急程度:1.普通;2.紧急;3.加急 | `urgency` | Integer |
| 158 | `transactionTypeId` | 交易类型 | `transaction_type_id` | String |
| 159 | `transactionTypeCode` | 交易类型编码 | `transaction_type_code` | String |
| 160 | `buyerConfirId` | 买方确认人id | `buyer_confir_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 161 | `buyerConfirName` | 买方确认人 | `buyer_confir_name` | String |
| 162 | `buyerConfirTime` | 买方确认时间 | `buyer_confir_time` | DateTime |
| 163 | `buyerConfirOpinion` | 买方确认意见 | `buyer_confir_opinion` | String |
| 164 | `buyerConfirMobile` | 买方确认电话 | `buyer_confir_mobile` | String |
| 165 | `entryIntoForceTime` | 生效时间 | `entry_into_force_time` | DateTime |
| 166 | `busitype` |  | `busitype` | String |
| 167 | `arriveClose` | 到货关闭 | `arrive_close` | Boolean |
| 168 | `paymentClose` | 付款关闭 | `payment_close` | Integer |
| 169 | `godownClose` | 入库关闭 | `godown_close` | Integer |
| 170 | `invoiceClose` | 开票关闭 | `invoice_close` | Integer |
| 171 | `finalClose` | 最终关闭 | `final_close` | Integer |
| 172 | `finishTime` | 订单完成时间 | `finish_time` | DateTime |
| 173 | `supOperatorId` | 供应商操作人id | `sup_operator_id` | Long |
| 174 | `supOperatorName` | 供应商操作人名称 | `sup_operator_name` | String |
| 175 | `supOperationDate` | 操作时间 | `sup_operation_date` | DateTime |
| 176 | `supOperationContent` | 操作内容 | `sup_operation_content` | String |
| 177 | `supMsgNotifierId` | 供应商消息通知人id | `sup_msg_notifier_id` | Long |
| 178 | `supMsgNotifierName` | 供应商消息通知人 | `sup_msg_notifier_name` | String |
| 179 | `supMsgNotifierPhone` | 供应商消息通知人联系电话 | `sup_msg_notifier_phone` | String |
| 180 | `ectBillCode` | 电子订单编号 | `ect_bill_code` | String |
| 181 | `ectTemplateId` | 电子订单模板id | `ect_template_id` | String |
| 182 | `ectTemplateCode` | 电子订单模板编号 | `ect_template_code` | String |
| 183 | `ectFilePath` | 电子订单文件路径 | `ect_file_path` | String |
| 184 | `ectOldId` | 旧电子订单id | `ect_old_id` | String |
| 185 | `ectOldBillCode` | 旧电子订单编号 | `ect_old_bill_code` | String |
| 186 | `ectOldTemplateId` | 旧电子订单模板id | `ect_old_template_id` | String |
| 187 | `ectOldTemplateCode` | 旧电子订单模板编号 | `ect_old_template_code` | String |
| 188 | `ectOldTemplateName` | 旧电子订单模板名称 | `ect_old_template_name` | String |
| 189 | `ectOldFilePath` | 旧电子订单文件路径 | `ect_old_file_path` | String |
| 190 | `signatureStatus` | 签章状态:待签章、签章中、签章拒签、签章通过(签章失败时,状态变为待签章) | `signature_status` | String |
| 191 | `signatureFailMessage` | 签章失败理由 | `signature_fail_message` | String |
| 192 | `signatureRefuseMessage` | 电子签章拒签原因 | `signature_refuse_message` | String |
| 193 | `deptId` | 采购部门ID | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 194 | `changeDeptId` | 变更采购部门ID | `change_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 195 | `changeDeptName` | 变更采购部门名称 | `change_dept_name` | String |
| 196 | `corpDeptAccount` | 外系统企业账号(ERP部门编码) | `corp_dept_account` | String |
| 197 | `corpDeptAccountid` | 外系统部门ID | `corp_dept_accountid` | String |
| 198 | `closeUserId` | 关闭用户主键 | `close_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 199 | `defines` | 销售订单表头自定义项 | `` | 85af4f0b-3b50-42c1-a964-15b6b8e90bfb |
| 200 | `detailEntityList` | 销售订单表体 | `` | 5fb7781a-74b1-4980-8261-0a9878c38f7b |
| 201 | `saleOrderPayTermList` | 销售订单付款协议 | `` | aeddca26-5275-4d1b-9de2-681a69c618f4 |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `mallOrderId` | 超市订单id | `mall.mallofficeorder.MallOrder` | Service |  |
| 2 | `changeDeptId` | 变更采购部门ID | `org.func.BaseOrg` | Service |  |
| 3 | `purchaseId` | 采购用户id | `cpu-privilege.user.MgrUser` | Service |  |
| 4 | `orgId` | 采购组织ID | `org.func.BaseOrg` | Service |  |
| 5 | `invSupEnterpriseId` | 开票供应商租户id | `aa.vendor.Vendor` | Service |  |
| 6 | `defines` | 销售订单表头自定义项 | `cpu-order.saleorder.SaleOrderVODefine` | None | true |
| 7 | `rateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 8 | `ticketOrgId` | 收票组织ID | `org.func.BaseOrg` | Service |  |
| 9 | `transTypeId` | 交易类型ID | `bd.bill.TransType` | Service |  |
| 10 | `currencyId` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 11 | `supplierid` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 12 | `detailEntityList` | 销售订单表体 | `cpu-order.saleorder.SaleOrderDetailVO` | None | true |
| 13 | `deptId` | 采购部门ID | `org.func.BaseOrg` | Service |  |
| 14 | `saleOrderPayTermList` | 销售订单付款协议 | `cpu-order.saleorder.SaleOrderPayTermVO` | None | true |
| 15 | `saleOrderDefineCharacter` | 自定义项特征属性组 | `cpu-order.saleorder.SaleOrderHeaderDefine` | None |  |
| 16 | `invoiceReceiverId` | 收票人主键 | `bd.staff.Staff` | Service |  |
| 17 | `agentConfirmUser` | 代确认人Id | `cpu-privilege.user.MgrUser` | Service |  |
| 18 | `confirmUser` | 确认人 | `cpu-privilege.user.MgrUser` | Service |  |
| 19 | `purEnterpriseId` | 采购商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 20 | `buyerConfirId` | 买方确认人id | `cpu-privilege.user.MgrUser` | Service |  |
| 21 | `changeUser` | 变更人 | `cpu-privilege.user.MgrUser` | Service |  |
| 22 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 23 | `personId` | 采购人员id | `bd.staff.Staff` | Service |  |
| 24 | `closeUserId` | 关闭用户主键 | `cpu-privilege.user.MgrUser` | Service |  |
| 25 | `enterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 26 | `supplyPersionId` | 供应商联系人id | `bd.staff.Staff` | Service |  |
