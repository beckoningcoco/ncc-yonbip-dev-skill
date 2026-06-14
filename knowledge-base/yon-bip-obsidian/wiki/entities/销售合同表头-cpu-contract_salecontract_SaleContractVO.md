---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontract.SaleContractVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表头 (`cpu-contract.salecontract.SaleContractVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表头 |
| 物理表 | `cpu_sale_ct` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:28.2500` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（190个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `saleCtDefineCharacter` | 自定义项特征属性组 | `define_header` | cab5d50f-9962-4037-919e-eefe3b799df8 |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `accountName` | 银行账号名称 | `account_name` | String |
| 4 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime |
| 5 | `agentConfirmPersonId` | 代确认人Id | `agent_confirm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 6 | `agentConfirmPersonName` | 代确认人名字 | `agent_confirm_person_name` | String |
| 7 | `bankAccountLink` | 银行联行号 | `bank_account_link` | String |
| 8 | `bankAccountwf` | 供应商银行账号-瓮福个性化 | `bank_accountwf` | String |
| 9 | `bankName` | 银行网点 | `bank_name` | String |
| 10 | `billFiledType` | 合同归档状态 | `bill_filed_type` | String |
| 11 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 12 | `changeSignatureEffect` | 变更是否签章生效1是0否 | `change_signature_effect` | Boolean |
| 13 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 14 | `dr` | 逻辑删除标记 | `dr` | Integer |
| 15 | `ectOldBillCode` | 旧电子合同编号 | `ect_old_bill_code` | String |
| 16 | `ectOldFilePath` | 旧电子合同文件路径 | `ect_old_file_path` | String |
| 17 | `ectOldId` | 旧电子合同id | `ect_old_id` | String |
| 18 | `otherStampFileId` | 其他需签署附件 | `other_stamp_fileId` | String |
| 19 | `collaborativeProcesse` | 协同流程 | `collaborative_processe` | Short |
| 20 | `contractStatus` | 合同单据状态 | `contract_status` | Short |
| 21 | `collabStatus` | 协同状态 | `collab_status` | Short |
| 22 | `erpCollabStatus` | ERP协同状态 | `erp_collab_status` | Short |
| 23 | `ctChangeStatus` | 合同变更状态 | `ct_change_status` | Short |
| 24 | `moneyControlType` | 金额控制方式 | `money_control_type` | Short |
| 25 | `moneyRatio` | 金额超量比例 | `money_ratio` | Decimal |
| 26 | `pubts` | 时间戳 | `ts` | DateTime |
| 27 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 28 | `signFlow` | 签署流程 | `sign_flow` | Integer |
| 29 | `submitSignPerson` | 提交签署人 | `submit_sign_person` | String |
| 30 | `contractPreviewUrl` | 签章查看地址 | `contract_preview_url` | String |
| 31 | `submitSignTime` | 提交签署时间 | `submit_sign_time` | DateTime |
| 32 | `signFinishTime` | 签署完成时间 | `sign_finish_time` | DateTime |
| 33 | `ctTplVersion` | 合同模板版本 | `ct_tpl_version` | String |
| 34 | `eContractCreateType` | 变更合同生成方式 | `econtract_create_type` | String |
| 35 | `ctTplName` | 合同模板名称 | `ct_tpl_name` | String |
| 36 | `signedFileId` | 已签合同附件 | `signed_file_id` | String |
| 37 | `eContractServiceType` | 合同服务类型 | `econtract_service_type` | String |
| 38 | `processId` | 签章流程id | `process_id` | String |
| 39 | `ctjlCode` | 合同台账编码 | `ctjl_code` | String |
| 40 | `ctjlId` | 合同台账id | `ctjl_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 |
| 41 | `ctTplId` | 合同模板id | `ct_tpl_id` | String |
| 42 | `refuseSignReason` | 拒签原因 | `refuse_sign_reason` | String |
| 43 | `ctSignId` | 签署流程ID | `ct_sign_id` | String |
| 44 | `templateId` | 主模板主键 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 45 | `transtypeName` | 交易类型 | `transtype_name` | String |
| 46 | `priceStructure` | 价格构成 | `price_structure` | String |
| 47 | `nonStandardFileId` | 非制式合同 | `nonstandard_file_id` | String |
| 48 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 49 | `signStatus` | 电子签署状态 | `sign_status` | Short |
| 50 | `transtypeId` | 合同类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 51 | `purContactPersonId` | 甲方联系人id | `pur_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 52 | `ctTplCode` | 合同模板编码 | `ct_tpl_code` | String |
| 53 | `eContractFileId` | 电子合同附件 | `econtract_file_id` | String |
| 54 | `transtypeCode` | 交易类型编码 | `transtype_code` | String |
| 55 | `businessType` | 业务类型 | `business_type` | String |
| 56 | `ectOldTemplateCode` | 旧电子合同模板编号 | `ect_old_template_code` | String |
| 57 | `ectOldTemplateName` | 旧电子合同模板名称 | `ect_old_template_name` | String |
| 58 | `ectTemplateId` | 电子合同模板id | `ect_template_id` | String |
| 59 | `erpCtid` | erp合同主表id(pk) | `erp_ct_id` | String |
| 60 | `id` | ID | `id` | Long |
| 61 | `incomeExpenseCode` |  | `income_expense_code` | String |
| 62 | `incomeExpenseName` |  | `income_expense_name` | String |
| 63 | `intendPaymentmny` | 累计合同预付付款金额 | `intend_paymentmny` | Decimal |
| 64 | `isBpmApprove` | 是否BPM | `is_bpm_approve` | String |
| 65 | `modifier` | 修改人 | `modifier` | String |
| 66 | `paymentAgreementCode` | 付款协议编码 | `payment_agreement_code` | String |
| 67 | `paymentAgreementId` | 付款协议id | `payment_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 68 | `paymentAgreementName` | 付款协议名称 | `payment_agreement_name` | String |
| 69 | `practicalPaymentmny` | 累计合同预付实付金额 | `practical_paymentmny` | Decimal |
| 70 | `projectId` | 立项id | `project_id` | Long |
| 71 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 72 | `saleFileId` | 供应方附件 | `sale_file_id` | String |
| 73 | `saleStampFileId` | 供应方盖章附件 | `sale_stamp_file_id` | String |
| 74 | `settleName` | 结算方式 | `settle_name` | String |
| 75 | `settleTypeId` | 结算方式 自定义项ID | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 76 | `sourceType` | 合同来源 | `source_type` | String |
| 77 | `stockFileId` | 采购附件 | `stock_file_id` | String |
| 78 | `stockStampFileId` | 采购盖章附件 | `stock_stamp_file_id` | String |
| 79 | `supMsgNotifierId` | 供应商消息通知人id | `sup_msg_notifier_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 80 | `supMsgNotifierName` | 供应商消息通知人姓名 | `sup_msg_notifier_name` | String |
| 81 | `supMsgNotifierPhone` | 供应商消息通知人电话 | `sup_msg_notifier_phone` | String |
| 82 | `supUserName` | 用户名 | `sup_user_name` | String |
| 83 | `supplierSupName` | 供应商档案中供应商名称 | `supplier_sup_name` | String |
| 84 | `toProductStatus` | 合同生成商品流程状态 | `to_product_status` | Integer |
| 85 | `ts` | 时间戳 | `ts` | DateTime |
| 86 | `ytenantId` | 租户 | `ytenant_id` | String |
| 87 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 88 | `pricedecisionId` | 定标单主表id | `pricedecision_id` | Long |
| 89 | `subject` | 合同标题 | `subject` | String |
| 90 | `billno` | 合同编码 | `billno` | String |
| 91 | `billtype` | 合同类型 | `billtype` | String |
| 92 | `billstatus` | 单据状态 | `billstatus` | String |
| 93 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 94 | `creator` | 创建人 | `creator` | String |
| 95 | `createTime` | 创建时间 | `createtime` | DateTime |
| 96 | `erpProductVersion` | ERP产品及版本 | `erp_product_version` | String |
| 97 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 98 | `money` | 无税金额 | `money` | Decimal |
| 99 | `taxMoney` | 含税金额 | `tax_money` | Decimal |
| 100 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 101 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 102 | `purEnterpriseId` | 采购商的租户id | `pur_enterprise_id` | Long |
| 103 | `purEnterpriseName` | 采购商租户的名字 | `pur_enterprise_name` | String |
| 104 | `purPersionId` | 采购商联系人id | `pur_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 105 | `purPersionName` | 采购商联系人 | `pur_persion_name` | String |
| 106 | `purUserId` | 采购商用户id | `pur_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 107 | `purPersonTel` | 采购商联系人座机 | `pur_person_tel` | String |
| 108 | `purPersonMobile` | 采购商联系人手机号 | `pur_person_mobile` | String |
| 109 | `orgId` | 采购组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 110 | `orgName` | 采购组织名称 | `org_name` | String |
| 111 | `supPersonId` | 供应商id | `sup_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 112 | `supPersonName` | 供应商姓名 | `sup_person_name` | String |
| 113 | `supUserId` | 供应商用户id | `sup_user_id` | Long |
| 114 | `supPersonTel` | 供应商座机电话 | `sup_person_tel` | String |
| 115 | `supPersonMobile` | 供应商手机号 | `sup_person_mobile` | String |
| 116 | `memo` | 备注 | `memo` | String |
| 117 | `deliveryAddress` | 收货地址 | `delivery_address` | String |
| 118 | `firstPartyId` | 甲方id | `first_party_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 119 | `secondPartyId` | 乙方id | `second_party_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 120 | `subscribedate` | 合同签订日期 | `subscribedate` | DateTime |
| 121 | `actualvalidate` | 合同生效日期 | `actualvalidate` | DateTime |
| 122 | `actualinvalidate` | 合同终止日期 | `actualinvalidate` | DateTime |
| 123 | `firstPartyName` | 甲方名称 | `first_party_name` | String |
| 124 | `totalnum` | 总数量 | `totalnum` | Decimal |
| 125 | `secondPartyName` | 乙方名称 | `second_party_name` | String |
| 126 | `totalPayMny` | 累计付款总额 | `total_pay_mny` | Decimal |
| 127 | `reason` | 拒绝/变更理由 | `reason` | String |
| 128 | `isMaterialClass` | 是否物料分类合同 0:否 1:是 | `is_material_class` | String |
| 129 | `erpCtCode` | erp合同编号 | `erp_ct_code` | String |
| 130 | `projectCode` | 找钢网项目编码 | `project_code` | String |
| 131 | `projectName` | 找钢网项目名称 | `project_name` | String |
| 132 | `projectDocId` | 找钢网项目id | `project_doc_id` | String |
| 133 | `receiveArea` | 找钢网区域 | `receive_area` | String |
| 134 | `receiver` | 找钢网收货人 | `receiver` | String |
| 135 | `phone` | 找钢网联系方式 | `phone` | String |
| 136 | `offerType` | 找钢网采购内容 | `offer_type` | String |
| 137 | `receiveAddress` | 找钢网收货地址 | `receive_address` | String |
| 138 | `payTypes` | 找钢网结算方式 | `pay_types` | String |
| 139 | `advanceRatio` | 找钢网预付比例 | `advance_ratio` | Decimal |
| 140 | `totalFullMoney` | 找钢网全额预付金额 | `total_full_money` | Decimal |
| 141 | `totalPartialMoney` | 找钢网部分预付金额 | `total_partial_money` | Decimal |
| 142 | `projectAddress` | 找钢网项目详细地址 | `project_address` | String |
| 143 | `furtureTemplate` | 找钢网模板 | `furture_template` | String |
| 144 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal |
| 145 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal |
| 146 | `signAddress` | 签订地点 | `sign_address` | String |
| 147 | `controlType` | 合同签订形式 | `control_type` | String |
| 148 | `execType` | 执行方式 | `exec_type` | String |
| 149 | `payAgreement` | 付款协议 | `pay_agreement` | String |
| 150 | `invoiceAgreement` | 发票协议 | `invoice_agreement` | String |
| 151 | `shelfPeriod` | 质保期 | `shelf_period` | String |
| 152 | `workPeriod` | 工期 | `work_period` | String |
| 153 | `outerCTBillCode` | 外部合同号 | `outer_ct_billcode` | String |
| 154 | `shelfRatio` | 质保金或比例 | `shelf_ratio` | Decimal |
| 155 | `ectBillCode` | 电子合同编号 | `ect_bill_code` | String |
| 156 | `ectTemplateCode` | 电子合同模板编号 | `ect_template_code` | String |
| 157 | `ectTemplateName` | 电子合同模板名称 | `ect_template_name` | String |
| 158 | `ectFilePath` | 电子合同文件路径 | `ect_file_path` | String |
| 159 | `orgScope` | 合同组织范围 | `org_scope` | Boolean |
| 160 | `changingCommitterName` | 变更人 | `changing_committer_name` | String |
| 161 | `changingCommittedDate` | 变更提交时间 | `changing_committed_date` | DateTime |
| 162 | `changingCommittedReason` | 变更理由 | `changing_committed_reason` | String |
| 163 | `changingConfirmerName` | 变更确认人 | `changing_confirmer_name` | String |
| 164 | `changingConfirmedDate` | 变更确认时间 | `changing_confirmed_date` | DateTime |
| 165 | `changingRejectedReason` | 变更拒绝理由 | `changing_rejected_reason` | String |
| 166 | `changingStatus` | 变更状态 | `changing_status` | String |
| 167 | `changingAction` | 变更动作:终止合同、变更合同 | `changing_action` | String |
| 168 | `changingVersion` | 当前变更版本 | `changing_version` | String |
| 169 | `changingInfo` | 变更信息 | `changing_info` | String |
| 170 | `signatureEffect` | 签章是否生效 | `signature_effect` | Integer |
| 171 | `signatureStatus` | 签章状态 | `signature_status` | String |
| 172 | `signatureFailMessage` | 签章失败原因 | `signature_fail_message` | String |
| 173 | `epayType` | 超合同付款 | `epay_type` | Boolean |
| 174 | `currencyName` | 币种名称 | `currency_name` | String |
| 175 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 176 | `currencyCode` | 币种编码 | `currency_code` | String |
| 177 | `ectId` | 电子合同id | `ectid` | String |
| 178 | `settleType` | 结算方式 | `settle_type` | String |
| 179 | `deliveryMethod` | 发票寄送方式 | `delivery_method` | String |
| 180 | `logisticsCompany` | 物流公司 | `logistics_company` | String |
| 181 | `logisticsCompanyCode` | 物流公司代码 | `logistics_company_code` | String |
| 182 | `logisticsCode` | 物流单号 | `logistics_code` | String |
| 183 | `description` | 随货送票说明 | `description` | String |
| 184 | `tplid` | tplid | `tplid` | Long |
| 185 | `defines` | 销售合同自定义项1 | `` | d79657a9-6022-41c0-a912-51b9d04df1b9 |
| 186 | `saleContractExpList` | 销售合同表体费用 | `` | 085561dd-fbed-4908-b088-fdecc5bf0a3a |
| 187 | `saleContractMaterialList` | 销售合同表体物料 | `` | 3a2dfdf7-8771-4f26-b37c-d3e4f06e5c6b |
| 188 | `saleContractPayTermList` | 销售合同表体付款协议 | `` | 062aeb7b-8ecb-4f37-9463-63322a0931b8 |
| 189 | `saleContractScopeList` | 销售合同适应组织 | `` | 14044445-650c-407b-bc40-1b0a90e5c1c0 |
| 190 | `saleContractTermList` | 销售合同表体条款 | `` | 88f91696-034e-4860-a3f3-8b40e04472eb |

---

## 关联属性（26个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `purUserId` | 采购商用户id | `bd.staff.Staff` | Service |  |
| 3 | `secondPartyId` | 乙方id | `aa.vendor.Vendor` | Service |  |
| 4 | `templateId` | 主模板主键 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 5 | `saleContractPayTermList` | 销售合同表体付款协议 | `cpu-contract.salecontract.SaleContractPayTermVO` | None | true |
| 6 | `supMsgNotifierId` | 供应商消息通知人id | `aa.vendor.VendorContacts` | Service |  |
| 7 | `orgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 8 | `defines` | 销售合同自定义项1 | `cpu-contract.salecontract.SaleContractVODefine` | None | true |
| 9 | `firstPartyId` | 甲方id | `aa.baseorg.OrgMV` | Service |  |
| 10 | `saleContractExpList` | 销售合同表体费用 | `cpu-contract.salecontract.SaleContractExpVO` | None | true |
| 11 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 12 | `transtypeId` | 合同类型id | `bd.bill.TransType` | Service |  |
| 13 | `saleContractTermList` | 销售合同表体条款 | `cpu-contract.salecontract.SaleContractTermVO` | None | true |
| 14 | `purContactPersonId` | 甲方联系人id | `bd.staff.Staff` | Service |  |
| 15 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 16 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 17 | `saleContractScopeList` | 销售合同适应组织 | `cpu-contract.salecontract.SaleContractOrgScopeVO` | None | true |
| 18 | `ctjlId` | 合同台账id | `CLM.clmContract.contractLib` | Service |  |
| 19 | `purPersionId` | 采购商联系人id | `bd.staff.Staff` | Service |  |
| 20 | `saleContractMaterialList` | 销售合同表体物料 | `cpu-contract.salecontract.SaleContractBodyVO` | None | true |
| 21 | `agentConfirmPersonId` | 代确认人Id | `bd.staff.Staff` | Service |  |
| 22 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 23 | `saleCtDefineCharacter` | 自定义项特征属性组 | `cpu-contract.salecontract.SaleCtHeaderDefine` | None |  |
| 24 | `settleTypeId` | 结算方式 自定义项ID | `aa.settlemethod.SettleMethod` | Service |  |
| 25 | `supPersonId` | 供应商id | `bd.staff.Staff` | Service |  |
| 26 | `paymentAgreementId` | 付款协议id | `bd.payments.PayAgreement` | Service |  |
