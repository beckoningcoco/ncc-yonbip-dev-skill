---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "cpu-contract.salecontractnew.SaleContractChangeVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售合同表头 (`cpu-contract.salecontractnew.SaleContractChangeVO`)

> ycBusinessCenter | 物理表：`cpu_sale_ct_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售合同表头 |
| 物理表 | `cpu_sale_ct_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:29.6360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（198个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `transtypeId` | 交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 3 | `transtypeName` | 交易类型 | `transtype_name` | String |
| 4 | `contractId` | 合同主表id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 5 | `transtypeCode` | 交易类型 | `transtype_code` | String |
| 6 | `pricedecisionId` | 定标单主表id | `pricedecision_id` | Long |
| 7 | `billno` | 合同编码 | `billno` | String |
| 8 | `subject` | 合同名称 | `subject` | String |
| 9 | `ctjlCode` | 合同台账编码 | `ctjl_code` | String |
| 10 | `saleCtHistoryDefineCharacter` | 销售历史表特征 | `define_header` | e7d72479-e30f-46f1-8b6a-4db71a8e40ea |
| 11 | `enterpriseName` | 供应商 | `enterprise_name` | String |
| 12 | `ctjlId` | 合同台账id | `ctjl_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 |
| 13 | `billtype` | 合同类型 | `billtype` | String |
| 14 | `toProductStatus` | 合同生成商品流程状态 | `to_product_status` | Integer |
| 15 | `billstatus` | 单据状态 | `billstatus` | String |
| 16 | `purPersionName` | 采购员 | `pur_persion_name` | String |
| 17 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 18 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 19 | `otherStampFileId` | 其他需签署附件 | `other_stamp_fileId` | String |
| 20 | `pubts` | 时间戳 | `ts` | DateTime |
| 21 | `billTemplateId` | 采购模板id | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 22 | `purPersonMobile` | 采购员电话 | `pur_person_mobile` | String |
| 23 | `creator` | 创建人 | `creator` | String |
| 24 | `templateId` | 采购模板id | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 25 | `offerType` | 价格类型 | `offer_type` | String |
| 26 | `purEnterpriseName` | 采购企业 | `pur_enterprise_name` | String |
| 27 | `erpProductVersion` | ERP产品及版本 | `erp_product_version` | String |
| 28 | `orgName` | 采购组织 | `org_name` | String |
| 29 | `businessType` | 业务类型 | `business_type` | String |
| 30 | `consultVersion` | 磋商版本 | `consultVersion` | Integer |
| 31 | `incomeExpenseCode` |  | `income_expense_code` | String |
| 32 | `saleContractId` | 合同主表id | `sale_contract_id` | fc6e46f3-a338-4c53-b55a-2c3336f30dd0 |
| 33 | `bankAccountwf` | 供应商银行账号-瓮福个性化 | `bank_accountwf` | String |
| 34 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 35 | `sourceType` | 合同来源 | `source_type` | String |
| 36 | `paymentAgreementName` | 付款协议名称 | `payment_agreement_name` | String |
| 37 | `supUserName` | 用户名 | `sup_user_name` | String |
| 38 | `incomeExpenseName` |  | `income_expense_name` | String |
| 39 | `bankAccountLink` | 银行联行号 | `bank_account_link` | String |
| 40 | `agentConfirmPersonId` | 代确认人Id | `agent_confirm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 41 | `isBpmApprove` | 是否BPM | `is_bpm_approve` | String |
| 42 | `settleTypeId` | 结算方式 自定义项ID | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 43 | `ts` | 时间戳 | `ts` | DateTime |
| 44 | `modifier` | 修改人 | `modifier` | String |
| 45 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime |
| 46 | `supMsgNotifierId` | 乙方联系人id | `sup_msg_notifier_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 47 | `dr` | dr | `dr` | Integer |
| 48 | `changeSignatureEffect` | 变更是否签章生效1是0否 | `change_signature_effect` | Boolean |
| 49 | `supMsgNotifierName` | 乙方联系人姓名 | `sup_msg_notifier_name` | String |
| 50 | `supMsgNotifierPhone` | 乙方联系人电话 | `sup_msg_notifier_phone` | String |
| 51 | `ytenantId` | 租户 | `ytenant_id` | String |
| 52 | `saleCtDefineCharacter` | 自定义项特征属性组 | `define_header` | cab5d50f-9962-4037-919e-eefe3b799df8 |
| 53 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 54 | `projectId` | 立项id | `project_id` | Long |
| 55 | `paymentAgreementId` | 付款协议id | `payment_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 56 | `paymentAgreementCode` | 付款协议编码 | `payment_agreement_code` | String |
| 57 | `accountName` | 银行账号名称 | `account_name` | String |
| 58 | `bankName` | 银行网点 | `bank_name` | String |
| 59 | `billFiledType` | 合同归档状态 | `bill_filed_type` | String |
| 60 | `purContactPersonId` | 甲方联系人id | `pur_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 61 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 62 | `erpCtid` | erp合同主表id(pk) | `erp_ct_id` | String |
| 63 | `agentConfirmPersonName` | 代确认人名字 | `agent_confirm_person_name` | String |
| 64 | `supplierSupName` | 供应商档案中供应商名称 | `supplier_sup_name` | String |
| 65 | `ectTemplateId` | 电子合同模板id | `ect_template_id` | String |
| 66 | `consultStatus` | 磋商状态 | `consultStatus` | String |
| 67 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 68 | `subscribedate` | 合同签订日期 | `subscribedate` | DateTime |
| 69 | `consultType` | 磋商操作类型 | `consultType` | String |
| 70 | `actualvalidate` | 合同生效日期 | `actualvalidate` | DateTime |
| 71 | `actualinvalidate` | 合同终止日期 | `actualinvalidate` | DateTime |
| 72 | `enterpriseId` | 租户id | `enterprise_id` | Long |
| 73 | `signAddress` | 签订地点 | `sign_address` | String |
| 74 | `outerCTBillCode` | 外部合同号 | `outer_ct_billcode` | String |
| 75 | `purEnterpriseId` | 采购商的租户id | `pur_enterprise_id` | Long |
| 76 | `isMaterialClass` | 是否物料分类合同 | `is_material_class` | String |
| 77 | `controlType` | 合同签订形式 | `control_type` | String |
| 78 | `purPersionId` | 采购商联系人id | `pur_persion_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 79 | `settleName` | 结算方式 | `settle_name` | String |
| 80 | `execType` | 是否可超数量执行 | `exec_type` | String |
| 81 | `createTime` | 创建时间 | `createtime` | DateTime |
| 82 | `epayType` | 是否超合同付款 | `epay_type` | Boolean |
| 83 | `purUserId` | 采购商用户id | `pur_user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 84 | `firstPartyId` | 甲方id | `first_party_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 85 | `secondPartyId` | 乙方id | `second_party_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 86 | `purPersonTel` | 采购商联系人座机 | `pur_person_tel` | String |
| 87 | `orgScope` | 适用于所有组织 | `org_scope` | Boolean |
| 88 | `firstPartyName` | 甲方 | `first_party_name` | String |
| 89 | `secondPartyName` | 乙方 | `second_party_name` | String |
| 90 | `ectOldBillCode` | 旧电子合同编号 | `ect_old_bill_code` | String |
| 91 | `ectBillCode` | 电子合同编号 | `ect_bill_code` | String |
| 92 | `ectOldTemplateCode` | 旧电子合同模板编号 | `ect_old_template_code` | String |
| 93 | `orgId` | 采购组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 94 | `priceStructure` | 价格构成 | `price_structure` | String |
| 95 | `ectTemplateCode` | 电子合同模板编号 | `ect_template_code` | String |
| 96 | `bAllowConsult` | 是否与供应商磋商 | `bAllowConsult` | Boolean |
| 97 | `ectOldTemplateName` | 旧电子合同模板 | `ect_old_template_name` | String |
| 98 | `ectTemplateName` | 电子合同模板 | `ect_template_name` | String |
| 99 | `ectOldFilePath` | 旧电子合同 | `ect_old_file_path` | String |
| 100 | `supPersonId` | 供应商id | `sup_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 101 | `ectFilePath` | 电子合同 | `ect_file_path` | String |
| 102 | `supPersonName` | 供应商姓名 | `sup_person_name` | String |
| 103 | `memo` | 备注 | `memo` | String |
| 104 | `supUserId` | 供应商用户id | `sup_user_id` | Long |
| 105 | `reason` | 拒绝理由 | `reason` | String |
| 106 | `supPersonTel` | 供应商座机电话 | `sup_person_tel` | String |
| 107 | `supPersonMobile` | 供应商手机号 | `sup_person_mobile` | String |
| 108 | `deliveryAddress` | 收货地址 | `delivery_address` | String |
| 109 | `totalnum` | 总数量 | `totalnum` | Decimal |
| 110 | `money` | 无税金额合计 | `money` | Decimal |
| 111 | `taxMoney` | 价税合计 | `tax_money` | Decimal |
| 112 | `totalPayMny` | 累计付款总额 | `total_pay_mny` | Decimal |
| 113 | `intendPaymentmny` | 累计预付金额 | `intend_paymentmny` | Decimal |
| 114 | `practicalPaymentmny` | 累计预付实付金额 | `practical_paymentmny` | Decimal |
| 115 | `erpCtCode` | erp合同编号 | `erp_ct_code` | String |
| 116 | `projectCode` | 项目编码 | `project_code` | String |
| 117 | `projectName` | 项目名称 | `project_name` | String |
| 118 | `projectDocId` | 找钢网项目id | `project_doc_id` | String |
| 119 | `receiveArea` | 区域 | `receive_area` | String |
| 120 | `receiver` | 收货人 | `receiver` | String |
| 121 | `phone` | 收货人联系方式 | `phone` | String |
| 122 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 123 | `payTypes` | 结算方式 | `pay_types` | String |
| 124 | `advanceRatio` | 找钢网预付比例 | `advance_ratio` | Decimal |
| 125 | `totalFullMoney` | 找钢网全额预付金额 | `total_full_money` | Decimal |
| 126 | `totalPartialMoney` | 找钢网部分预付金额 | `total_partial_money` | Decimal |
| 127 | `projectAddress` | 项目详细地址 | `project_address` | String |
| 128 | `furtureTemplate` | 找钢网模板 | `furture_template` | String |
| 129 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal |
| 130 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal |
| 131 | `currencyName` | 币种 | `currency_name` | String |
| 132 | `settleType` | 结算方式 | `settle_type` | String |
| 133 | `shelfPeriod` | 质保期 | `shelf_period` | String |
| 134 | `shelfRatio` | 质保金 | `shelf_ratio` | Decimal |
| 135 | `workPeriod` | 工期 | `work_period` | String |
| 136 | `payAgreement` | 付款协议 | `pay_agreement` | String |
| 137 | `invoiceAgreement` | 发票协议 | `invoice_agreement` | String |
| 138 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 139 | `currencyCode` | 币种编码 | `currency_code` | String |
| 140 | `changingCommitterName` | 合同变更人 | `changing_committer_name` | String |
| 141 | `changingCommittedDate` | 合同变更时间 | `changing_committed_date` | DateTime |
| 142 | `changingCommittedReason` | 变更理由 | `changing_committed_reason` | String |
| 143 | `changingConfirmerName` | 变更确认人 | `changing_confirmer_name` | String |
| 144 | `changingConfirmedDate` | 变更确认时间 | `changing_confirmed_date` | DateTime |
| 145 | `changingRejectedReason` | 变更拒绝理由 | `changing_rejected_reason` | String |
| 146 | `changingStatus` | 变更状态 | `changing_status` | String |
| 147 | `changingAction` | 变更动作:终止合同、变更合同 | `changing_action` | String |
| 148 | `changingVersion` | 当前变更版本 | `version` | String |
| 149 | `changingInfo` | 变更信息 | `changing_info` | String |
| 150 | `signatureStatus` | 签章状态 | `signature_status` | String |
| 151 | `signatureEffect` | 签章是否生效 | `signature_effect` | Integer |
| 152 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 153 | `signatureFailMessage` | 签章失败原因 | `signature_fail_message` | String |
| 154 | `deliveryMethod` | 邮寄方式 | `delivery_method` | String |
| 155 | `logisticsCompany` | 物流公司 | `logistics_company` | String |
| 156 | `logisticsCompanyCode` | 物流公司id | `logistics_company_code` | String |
| 157 | `logisticsCode` | 物流单号 | `logistics_code` | String |
| 158 | `description` | 说明 | `description` | String |
| 159 | `stockFileId` | 采购商附件 | `stock_file_id` | String |
| 160 | `saleFileId` | 供应商附件 | `sale_file_id` | String |
| 161 | `stockStampFileId` | 采购商盖章合同附件 | `stock_stamp_file_id` | String |
| 162 | `ectOldId` | 旧ectId | `ect_old_id` | String |
| 163 | `ectId` | 电子合同主键 | `ectid` | String |
| 164 | `tplid` | tplid | `tplid` | Long |
| 165 | `saleStampFileId` | 供应商盖章合同附件 | `sale_stamp_file_id` | String |
| 166 | `signFlow` | 签署流程 | `sign_flow` | Integer |
| 167 | `signStatus` | 签署状态 | `sign_status` | Short |
| 168 | `submitSignPerson` | 提交签署人 | `submit_sign_person` | String |
| 169 | `submitSignTime` | 提交签署时间 | `submit_sign_time` | DateTime |
| 170 | `signFinishTime` | 签署完成时间 | `sign_finish_time` | DateTime |
| 171 | `refuseSignReason` | 拒签原因 | `refuse_sign_reason` | String |
| 172 | `processId` | 签章流程id | `process_id` | String |
| 173 | `contractPreviewUrl` | 合同签章查看地址 | `contract_preview_url` | String |
| 174 | `eContractCreateType` | 合同生成方式 | `econtract_create_type` | String |
| 175 | `ctTplId` | 合同模板 | `ct_tpl_id` | String |
| 176 | `ctTplName` | 合同模板 | `ct_tpl_name` | String |
| 177 | `ctTplCode` | 合同模板编码 | `ct_tpl_code` | String |
| 178 | `ctTplVersion` | 合同模板版本 | `ct_tpl_version` | String |
| 179 | `ctSignId` | 签署流程ID | `ct_sign_id` | String |
| 180 | `eContractFileId` | 电子合同附件 | `econtract_file_id` | String |
| 181 | `eContractWordFileId` | 电子合同word附件 | `econtract_word_file_id` | String |
| 182 | `nonStandardFileId` | 非制式合同附件 | `nonstandard_file_id` | String |
| 183 | `eContractServiceType` | 合同服务类型 | `econtract_service_type` | String |
| 184 | `signedFileId` | 已签署合同附件 | `signed_file_id` | String |
| 185 | `collabStatus` | 协同状态 | `collab_status` | Short |
| 186 | `collaborativeProcesse` | 协同流程 | `collaborative_processe` | Short |
| 187 | `contractChangeId` | 合同变更主表id | `contract_change_id` | 49f97b1c-2c1f-4fc9-855d-6a465985bdf3 |
| 188 | `contractStatus` | 合同单据状态 | `contract_status` | Short |
| 189 | `ctChangeStatus` | 合同变更状态 | `ct_change_status` | Short |
| 190 | `defines` | 销售合同自定义项 | `` | 36f5a5ec-eabf-40b2-9354-fab8d64a1b10 |
| 191 | `erpCollabStatus` | ERP协同状态 | `erp_collab_status` | Short |
| 192 | `moneyControlType` | 金额控制方式 | `money_control_type` | Short |
| 193 | `moneyRatio` | 金额超量比例 | `money_ratio` | Decimal |
| 194 | `saleContractExpList` | 销售合同表体费用 | `` | 996c04fc-a28c-4033-ae28-84a79bb5e729 |
| 195 | `saleContractMaterialList` | 销售合同表体物料 | `` | edb84b55-def5-4fac-9da7-ff12ee3a14ee |
| 196 | `saleContractPayTermList` | 销售合同表体付款协议 | `` | 10e53a16-3643-4b55-a679-4c6890ef0883 |
| 197 | `saleContractScopeList` | 销售合同适应组织 | `` | b0e5b7c6-d0f6-48a0-abab-b2cc2a58999c |
| 198 | `saleContractTermList` | 销售合同表体条款 | `` | 1f8d432d-5e24-471b-a74f-0e5d6f4a3c6d |

---

## 关联属性（29个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 采购模板id | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `contractChangeId` | 合同变更主表id | `cpu-contract.contractchangenew.ContractHistryNewVO` | None |  |
| 3 | `purUserId` | 采购商用户id | `bd.staff.Staff` | Service |  |
| 4 | `secondPartyId` | 乙方id | `aa.vendor.Vendor` | Service |  |
| 5 | `templateId` | 采购模板id | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 6 | `saleContractPayTermList` | 销售合同表体付款协议 | `cpu-contract.salecontractnew.SaleContractPayTermChangeVO` | None | true |
| 7 | `supMsgNotifierId` | 乙方联系人id | `aa.vendor.VendorContacts` | Service |  |
| 8 | `saleContractId` | 合同主表id | `cpu-contract.salecontract.SaleContractVO` | None |  |
| 9 | `orgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 10 | `defines` | 销售合同自定义项 | `cpu-contract.salecontractnew.SaleContractHistoryVODefine` | None | true |
| 11 | `firstPartyId` | 甲方id | `aa.baseorg.OrgMV` | Service |  |
| 12 | `saleContractExpList` | 销售合同表体费用 | `cpu-contract.salecontractnew.SaleContractExpChangeVO` | None | true |
| 13 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 14 | `transtypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 15 | `saleContractTermList` | 销售合同表体条款 | `cpu-contract.salecontractnew.SaleContractTermChangeVO` | None | true |
| 16 | `purContactPersonId` | 甲方联系人id | `bd.staff.Staff` | Service |  |
| 17 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 18 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 19 | `saleContractScopeList` | 销售合同适应组织 | `cpu-contract.salecontractnew.SaleContractOrgScopeChangeVO` | None | true |
| 20 | `saleCtHistoryDefineCharacter` | 销售历史表特征 | `cpu-contract.salecontractnew.SaleCtHistoryHeaderDefine` | None |  |
| 21 | `ctjlId` | 合同台账id | `CLM.clmContract.contractLib` | Service |  |
| 22 | `purPersionId` | 采购商联系人id | `bd.staff.Staff` | Service |  |
| 23 | `saleContractMaterialList` | 销售合同表体物料 | `cpu-contract.salecontractnew.SaleContractBodyChangeVO` | None | true |
| 24 | `agentConfirmPersonId` | 代确认人Id | `bd.staff.Staff` | Service |  |
| 25 | `contractId` | 合同主表id | `cpu-contract.contract.ContractVO` | None |  |
| 26 | `saleCtDefineCharacter` | 自定义项特征属性组 | `cpu-contract.salecontract.SaleCtHeaderDefine` | None |  |
| 27 | `settleTypeId` | 结算方式 自定义项ID | `aa.settlemethod.SettleMethod` | Service |  |
| 28 | `supPersonId` | 供应商id | `bd.staff.Staff` | Service |  |
| 29 | `paymentAgreementId` | 付款协议id | `bd.payments.PayAgreement` | Service |  |
