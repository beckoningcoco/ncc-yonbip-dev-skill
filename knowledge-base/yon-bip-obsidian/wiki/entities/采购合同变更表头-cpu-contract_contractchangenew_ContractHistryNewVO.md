---
tags: ["BIP", "元数据", "数据字典", "ycContractManagement", "cpu-contract.contractchangenew.ContractHistryNewVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购合同变更表头 (`cpu-contract.contractchangenew.ContractHistryNewVO`)

> ycContractManagement | 物理表：`cpu_ct_history`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购合同变更表头 |
| 物理表 | `cpu_ct_history` |
| domain/服务域 | `cpu-contract` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycContractManagement` |
| 构建时间 | `2026-06-04 23:43:13.8960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（313个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ContractVODefineCharacter` | 采购合同特征属性组 | `defineHeader` | 5a73a0e2-c22f-4999-89c8-1dab6a40c687 |
| 2 | `ERPProjectId` | Erp项目id | `erp_project_id` | String |
| 3 | `approveEndTime` | 审批通过时间 | `approve_end_time` | DateTime |
| 4 | `businessType` | 业务类型 | `business_type` | String |
| 5 | `changeSignatureEffect` | 变更是否签章生效1是0否 | `change_signature_effect` | Integer |
| 6 | `dr` | dr | `dr` | Integer |
| 7 | `econtractCreateDate` | 电子合同生成时间 | `econtract_create_date` | DateTime |
| 8 | `ectOldTemplateId` | 旧电子合同模板id | `ect_old_template_id` | String |
| 9 | `ectTemplateId` | 电子合同模板id | `ect_template_id` | String |
| 10 | `filedPersonId` | 归档人id | `filed_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 11 | `filedStatus` | 归档状态 | `filed_status` | String |
| 12 | `filedTime` | 归档时间 | `filed_time` | DateTime |
| 13 | `incomeExpenseCode` | 项目信息编码 | `income_expense_code` | String |
| 14 | `incomeExpenseName` | 项目信息名称 | `income_expense_name` | String |
| 15 | `isPushPaycontract` | 是否推付款合同 | `is_push_paycontract` | Boolean |
| 16 | `modifier` | 修改人 | `modifier` | String |
| 17 | `modifierId` | 修改人id | `modifier_Id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `paymentAgreementId` | 付款协议id | `payment_agreement_id` | Integer |
| 20 | `paymentAgreementName` | 付款协议名称 | `payment_agreement_name` | String |
| 21 | `pricedecisionId` | 定标单主表id | `pricedecision_id` | Long |
| 22 | `projectId` | 立项id | `project_id` | Long |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `purContentTypeId` | 采购内容 自定义项ID | `pur_content_type_id` | 92b613a5-0e7c-4f87-8a9b-7fccc9ba556a |
| 25 | `payment_process` | 付款流程 | `payment_process` | String |
| 26 | `projectName` | 项目名称 | `project_name` | String |
| 27 | `sendErpStatus` | 发送erp状态 | `send_erp_status` | String |
| 28 | `eContractFileName` | 电子合同文件名称 | `econtract_file_name` | String |
| 29 | `otherStampFileId` | 其他需签署附件 | `other_stamp_fileId` | String |
| 30 | `money` | 无税金额 | `money` | Decimal |
| 31 | `projectCode` | 项目编码 | `project_code` | String |
| 32 | `taxMoney` | 含税金额 | `tax_money` | Decimal |
| 33 | `modifiedtime` | 修改时间 | `modifiedtime` | DateTime |
| 34 | `purContactPersonId` | 甲方联系人id | `pur_contact_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 35 | `consultVersion` | 磋商版本 | `consultVersion` | Integer |
| 36 | `billcategory` | 合同类型 | `billcategory` | b23c8bcc-9978-44fb-a5d5-b54d687b59bb |
| 37 | `isMultiParty` | 是否多方合同 | `is_multi_party` | String |
| 38 | `creatorId` | 创建人ID | `creator_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 39 | `bpmsource` | bpm源 | `bpmsource` | String |
| 40 | `terminateCloseDate` | 关闭日期 | `terminate_close_date` | DateTime |
| 41 | `consultStatus` | 磋商状态 | `consultStatus` | String |
| 42 | `terminateAction` | 终止动作 | `terminate_action` | String |
| 43 | `serviceConfirMode` | 服务确认方式 | `service_confirmode` | String |
| 44 | `exchRateDate` | 汇率日期 | `exch_rate_date` | Date |
| 45 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 46 | `ctjlId` | 合同台账id | `ctjl_id` | a2b72a3c-8c65-4b56-8e8f-35821ac27556 |
| 47 | `consultType` | 磋商操作类型 | `consultType` | String |
| 48 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 49 | `bAllowConsult` | 是否与供应商磋商 | `bAllowConsult` | Boolean |
| 50 | `natCurrency` | 本币id | `nat_currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 51 | `paymentBasis` | 付款依据 | `paymentBasis` | Integer |
| 52 | `consultBillTemplateId` | 磋商单据模板主键 | `consult_bill_template_id` | Long |
| 53 | `exchRateType` | 汇率类型id | `exch_rate_type_id` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 54 | `ctjlCode` | 合同台账编码 | `ctjl_code` | String |
| 55 | `signOffline` | 是否线下签署 | `sign_offline` | Integer |
| 56 | `consultTemplateId` | 磋商模板组主键 | `consult_template_id` | Long |
| 57 | `terminateCloseReason` | 关闭原因 | `terminate_close_reason` | String |
| 58 | `terminateCloseUserId` | 关闭人id | `terminate_close_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 59 | `terminateCloseUserName` | 关闭人名称 | `terminate_close_user_name` | String |
| 60 | `exchRate` | 汇率 | `exch_rate` | Decimal |
| 61 | `pushPaycontractFailReason` | 付款合同推送失败原因 | `push_paycontract_fail_reason` | String |
| 62 | `pushPaycontractStatus` | 推付款合同状态 | `push_paycontract_status` | String |
| 63 | `reqDeptName` | 需求部门名称 | `req_dept_name` | String |
| 64 | `returncount` | 退回次数 | `returncount` | Short |
| 65 | `singleBudgetApplyId` | 单项预算申请单 | `single_budget_applyid` | c89a2b73-7637-4642-abc1-c49bf1a5c460 |
| 66 | `status` | 单据状态 | `status` | Short |
| 67 | `supEnterpriseName` | 供应商租户的名字 | `sup_enterprise_name` | String |
| 68 | `sysVersion` | 系统版本 | `sys_version` | Integer |
| 69 | `tenant` | 租户ID | `tenant_id` | String |
| 70 | `toProductStatus` | 合同生成商品流程状态 | `to_product_status` | Integer |
| 71 | `totalMainNum` | 总主数量 | `total_purchase_num` | Decimal |
| 72 | `totalPurchaseNum` | 总采购数量 | `total_main_num` | Decimal |
| 73 | `verifystate` | 审批状态 | `verifystate` | Short |
| 74 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 75 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 76 | `ytenantId` | 租户id | `ytenant_id` | String |
| 77 | `cancelType` | 取消类型 | `cancel_type` | Integer |
| 78 | `contractId` | 原合同id | `contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 79 | `ctTransTypeId` | 采购合同交易类型 | `ct_transtype_id` | String |
| 80 | `orgName` | 采购组织 | `org_name` | String |
| 81 | `code` | 合同编码 | `billno` | String |
| 82 | `id` | ID | `id` | Long |
| 83 | `billFiledType` | 归档状态 | `bill_filed_type` | String |
| 84 | `subject` | 合同名称 | `subject` | String |
| 85 | `supplierSupName` | 供应商 | `supplier_sup_name` | String |
| 86 | `billstatus` | 单据状态 | `billstatus` | String |
| 87 | `templateId` | 采购模板 | `template_id` | 9846efd9-caa6-4b42-a848-477a09a83b44 |
| 88 | `billTemplateId` | 单据模板主键 | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 89 | `settlementBasis` | 结算依据 | `settlement_basis` | String |
| 90 | `supMsgNotifierId` | 消息通知人id | `sup_msg_notifier_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 91 | `agentConfirmPersonId` | 代确认人id | `agent_confirm_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 92 | `agentConfirmPersonName` | 代确认人 | `agent_confirm_person_name` | String |
| 93 | `agentConfirmDate` | 代确认时间 | `agent_confirm_date` | DateTime |
| 94 | `firstPartyId` | 甲方id | `first_party_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 95 | `secondPartyId` | 乙方id | `second_party_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 96 | `eContractbCanModify` | 电子合同可编辑 | `econtract_can_modify` | Boolean |
| 97 | `paymentAgreementCode` | 付款协议code | `payment_agreement_code` | String |
| 98 | `deliveryMethod` | 邮寄方式 | `delivery_method` | String |
| 99 | `logisticsCompany` | 物流公司 | `logistics_company` | String |
| 100 | `logisticsCompanyCode` | 物流公司id | `logistics_company_code` | String |
| 101 | `logisticsCode` | 物流单号 | `logistics_code` | String |
| 102 | `description` | 说明 | `description` | String |
| 103 | `sendErpMsg` | erp失败原因 | `send_erp_msg` | String |
| 104 | `billtype` | 合同类型 | `billtype` | String |
| 105 | `fbillstatus` | 审批状态 | `fbillstatus` | String |
| 106 | `creator` | 创建人 | `creator` | String |
| 107 | `purPersonName` | 采购员 | `pur_person_name` | String |
| 108 | `ts` | ts | `ts` | DateTime |
| 109 | `deptName` | 采购部门 | `dept_name` | String |
| 110 | `erpProductVersion` | ERP产品及版本 | `erp_product_version` | String |
| 111 | `parentContractName` | 父合同 | `parent_contract_name` | String |
| 112 | `controlType` | 合同签订形式 | `control_type` | String |
| 113 | `isMaterialClass` | 物料分类合同 | `is_material_class` | Boolean |
| 114 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 115 | `execType` | 可超数量执行 | `exec_type` | String |
| 116 | `isAllowAdjustPrice` | 允许订单调价 | `is_allow_adjust_price` | String |
| 117 | `enterpriseName` | 租户名称 | `enterprise_name` | String |
| 118 | `nonStandardFileId` | 非制式合同 | `nonstandard_file_id` | String |
| 119 | `supplierId` | 供应商id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 120 | `epayType` | 超合同付款 | `epay_type` | Boolean |
| 121 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 122 | `signedFileId` | 已签署合同附件 | `signed_file_id` | String |
| 123 | `supEnterpriseId` | 供应商的租户id | `sup_enterprise_id` | Long |
| 124 | `createTime` | 创建日期 | `createtime` | DateTime |
| 125 | `supPersionId` | 供应商联系人id | `sup_persion_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 126 | `eContractFileId` | 电子合同附件 | `econtract_file_id` | String |
| 127 | `eContractWordFileId` | 电子合同word附件 | `econtract_word_file_id` | String |
| 128 | `subscribedate` | 签订日期 | `subscribedate` | Date |
| 129 | `supPersionName` | 供应商联系人 | `sup_persion_name` | String |
| 130 | `actualvalidate` | 生效日期 | `actualvalidate` | Date |
| 131 | `supPersonTel` | 供应商联系人座机 | `sup_person_tel` | String |
| 132 | `actualinvalidate` | 终止日期 | `actualinvalidate` | Date |
| 133 | `supPersonMobile` | 供应商联系人手机号 | `sup_person_mobile` | String |
| 134 | `signAddress` | 签订地点 | `sign_address` | String |
| 135 | `signFlow` | 签署流程 | `sign_flow` | Integer |
| 136 | `orgId` | 采购组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 137 | `outerCTBillCode` | 外部合同号 | `outer_ct_billcode` | String |
| 138 | `submitSignPerson` | 提交签署人 | `submit_sign_person` | String |
| 139 | `purPersonId` | 采购员id | `pur_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 140 | `submitSignTime` | 提交签署时间 | `submit_sign_time` | DateTime |
| 141 | `signFinishTime` | 签署完成时间 | `sign_finish_time` | DateTime |
| 142 | `sourceType` | 合同来源 | `source_type` | String |
| 143 | `refuseSignReason` | 拒签原因 | `refuse_sign_reason` | String |
| 144 | `vBuyOfferBillCode` | 询价单号 | `vbuyoffer_billcode` | String |
| 145 | `firstPartyName` | 甲方 | `first_party_name` | String |
| 146 | `processId` | 签章流程id | `process_id` | String |
| 147 | `contractPreviewUrl` | 合同签章查看地址 | `contract_preview_url` | String |
| 148 | `purUserId` | 采购员用户id | `pur_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 149 | `secondPartyName` | 乙方 | `second_party_name` | String |
| 150 | `purPersonTel` | 采购员座机电话 | `pur_person_tel` | String |
| 151 | `purPersonMobile` | 采购员手机号 | `pur_person_mobile` | String |
| 152 | `dealPsnName` | 处理人 | `deal_psn_name` | String |
| 153 | `insideRemark` | 内审备注 | `inside_remark` | String |
| 154 | `reason` | 拒绝理由 | `reason` | String |
| 155 | `erpCtCode` | ERP合同号 | `erp_ct_code` | String |
| 156 | `erpCtid` | ERP合同主键 | `erp_ct_id` | String |
| 157 | `internalFileId` | 内控附件 | `internal_file_id` | String |
| 158 | `totalnum` | 总数量 | `totalnum` | Decimal |
| 159 | `ectOldFilePath` | 旧电子合同 | `ect_old_file_path` | String |
| 160 | `externalFileId` | 对外附件 | `external_file_id` | String |
| 161 | `totalPayMny` | 累计付款总额 | `total_pay_mny` | Decimal |
| 162 | `ectFilePath` | 电子合同 | `ect_file_path` | String |
| 163 | `buyofferId` | 询价单id | `buyoffer_id` | Long |
| 164 | `supMsgNotifierName` | 消息通知人 | `sup_msg_notifier_name` | String |
| 165 | `deliveryAddress` | 收货地址 | `delivery_address` | String |
| 166 | `changingStatus` | 变更状态 | `changing_status` | String |
| 167 | `priceStructure` | 价格构成 | `price_structure` | String |
| 168 | `effectContract` | 合同生效是否需要供应商协同 | `effect_contract` | String |
| 169 | `ectOldTemplateName` | 旧电子合同模板 | `ect_old_template_name` | String |
| 170 | `ectTemplateName` | 电子合同模板 | `ect_template_name` | String |
| 171 | `ectOldBillCode` | 旧电子合同编码 | `ect_old_bill_code` | String |
| 172 | `deptId` | 采购部门 | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 173 | `ectBillCode` | 电子合同编码 | `ect_bill_code` | String |
| 174 | `supplyPayment` | 付款条件 | `supply_payment` | String |
| 175 | `supplyDelivery` | 交货说明 | `supply_delivery` | String |
| 176 | `signatureEffect` | 签章生效 | `signature_effect` | Integer |
| 177 | `quotaSupplyMny` | 供应商首次报价总金额 | `quota_supplymny` | Decimal |
| 178 | `signatureStatus` | 签章状态 | `signature_status` | String |
| 179 | `quotaSupplys` | 供应商报价家数 | `quota_supplys` | Integer |
| 180 | `ERPProjectName` | 合同属性 | `erp_project_name` | String |
| 181 | `furtureTemplate` | 确认是否启用期货报价模板  1表示使用期货报价模板  0表示用之前的报价 | `furture_template` | String |
| 182 | `receiveArea` | 区域 | `receive_area` | String |
| 183 | `advanceRatio` | 预付比例 | `advance_ratio` | Decimal |
| 184 | `totalFullMoney` | 全额预付总价 | `total_full_money` | Decimal |
| 185 | `totalPartialMoney` | 部分预付总价 | `total_partial_money` | Decimal |
| 186 | `receiveAddress` | 收货地址 | `receive_address` | String |
| 187 | `addressName` | 地址名称 | `address_name` | String |
| 188 | `executionStatus` | 执行状态 | `execution_status` | Integer |
| 189 | `reqUapProjectId` | 平台项目档案id | `req_uap_project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 190 | `projectDocId` | 项目id | `project_doc_id` | String |
| 191 | `offerType` | 价格类型 | `offer_type` | String |
| 192 | `receiver` | 收货人 | `receiver` | String |
| 193 | `currencyName` | 币种 | `currency_name` | String |
| 194 | `phone` | 收货人联系方式 | `phone` | String |
| 195 | `purContentType` | 采购内容 | `pur_content_type` | String |
| 196 | `parentContractId` | 父合同ID | `parent_contract_id` | 6c20fd57-9f69-497e-a1af-d0b30f9be5c3 |
| 197 | `parentContractno` | 找钢网父合同编码 | `parent_contractno` | String |
| 198 | `shelfPeriod` | 质保期 | `shelf_period` | String |
| 199 | `projectAddress` | 收货地址 | `project_address` | String |
| 200 | `CTHistoryHeaderDefine` | 采购合同变更特征属性组 | `defineHeader` | d2eb50ae-9f9d-4466-b68c-c38b0ee6b2b4 |
| 201 | `shelfRatio` | 质保金 | `shelf_ratio` | Decimal |
| 202 | `workPeriod` | 工期 | `work_period` | String |
| 203 | `taxlessFullMoney` | 无税总价全额预付 | `taxless_full_money` | Decimal |
| 204 | `taxlessPartialMoney` | 无税总价部分预付 | `taxless_partial_money` | Decimal |
| 205 | `invoiceAgreement` | 发票协议 | `invoice_agreement` | String |
| 206 | `transtypeName` | 交易类型 | `transtype_name` | String |
| 207 | `transtypeCode` | 合同类型code | `transtype_code` | String |
| 208 | `transtypeId` | 合同分类id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 209 | `transtypeSource` | transtypeSource | `transtype_source` | Boolean |
| 210 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 211 | `currencyCode` | 币种编码 | `currency_code` | String |
| 212 | `currencyId` | 币种id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 213 | `eContractCreateType` | 合同生成方式 | `econtract_create_type` | String |
| 214 | `settleName` | 结算类型 | `settle_name` | String |
| 215 | `settleTypeId` | 结算方式 | `settle_type_id` | 95f34e90-897c-4bf5-958c-b1c2deaa8aff |
| 216 | `settleType` | 结算方式 | `settle_type` | String |
| 217 | `termTemplateId` | termTemplateId | `term_template_id` | String |
| 218 | `eContractServiceType` | 合同服务类型 | `econtract_service_type` | String |
| 219 | `termManualAddEnable` | termManualAddEnable | `term_manual_add_enable` | Boolean |
| 220 | `payAgreementId` | 付款协议ID | `pay_agreement_id` | 3cce8052-512e-4e51-9b6e-57adff40948c |
| 221 | `payAgreement` | 付款协议 | `pay_agreement` | String |
| 222 | `accPayApplyMoney` | 累计预付付款申请金额 | `acc_pay_apply_money` | Decimal |
| 223 | `ectOldTemplateCode` | 旧电子合同模板编号 | `ect_old_template_code` | String |
| 224 | `ectTemplateCode` | 电子合同模板编号 | `ect_template_code` | String |
| 225 | `orgScope` | 适用于所有组织 | `org_scope` | Boolean |
| 226 | `changingCommitterName` | 合同变更人 | `changing_committer_name` | String |
| 227 | `signatureFailMessage` | 签章失败原因 | `signature_fail_message` | String |
| 228 | `changingCommittedDate` | 合同变更时间 | `changing_committed_date` | DateTime |
| 229 | `memo` | 备注 | `memo` | String |
| 230 | `changingCommittedReason` | 变更理由 | `changing_committed_reason` | String |
| 231 | `changingConfirmerName` | 变更确认人 | `changing_confirmer_name` | String |
| 232 | `changingConfirmedDate` | 变更确认时间 | `changing_confirmed_date` | DateTime |
| 233 | `changingRejectedReason` | 变更拒绝原因 | `changing_rejected_reason` | String |
| 234 | `changingAction` | 变更动作:终止合同、变更合同 | `changing_action` | String |
| 235 | `changingVersion` | 当前变更版本 | `version` | String |
| 236 | `changingInfo` | 变更信息 | `changing_info` | String |
| 237 | `cancelUserId` | 作废人id | `cancel_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 238 | `cancelUserName` | 作废人名称 | `cancel_user_name` | String |
| 239 | `cancelReason` | 作废理由 | `cancel_reason` | String |
| 240 | `cancelDate` | 作废日期 | `cancel_date` | DateTime |
| 241 | `terminateUserId` | 终止人id | `terminate_user_id` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 242 | `terminateUserName` | 终止人名称 | `terminate_user_name` | String |
| 243 | `terminateReason` | 终止理由 | `terminate_reason` | String |
| 244 | `terminateDate` | 终止日期 | `terminate_date` | DateTime |
| 245 | `dealPsnId` | 处理人id | `deal_psn_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 246 | `reqDeptId` | 需求部门id | `req_dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 247 | `payTypes` | 期货报价模板下的报价模式(1表示账期2表示金额预付3表示部分预付) | `pay_types` | String |
| 248 | `signStatus` | 电子签署状态 | `sign_status` | Short |
| 249 | `ectId` | 电子合同ID | `ectid` | String |
| 250 | `ectOldId` | 旧电子合同ID | `ect_old_id` | String |
| 251 | `ctSignId` | 签署流程ID | `ct_sign_id` | String |
| 252 | `ctTplId` | 合同模板 | `ct_tpl_id` | String |
| 253 | `ctTplName` | 合同模板 | `ct_tpl_name` | String |
| 254 | `ctTermsData` | 合同条款数据 | `ctTermsData` | String |
| 255 | `ctTplCode` | 合同模板编码 | `ct_tpl_code` | String |
| 256 | `ctTplVersion` | 合同模板版本 | `ct_tpl_version` | String |
| 257 | `stockStampFileId` | 采购商盖章合同附件 | `stock_stamp_file_id` | String |
| 258 | `saleStampFileId` | 供应商盖章合同附件 | `sale_stamp_file_id` | String |
| 259 | `saleFileId` | 供应商附件 | `sale_file_id` | String |
| 260 | `intendPaymentmny` | 累计预付金额 | `intend_paymentmny` | Decimal |
| 261 | `practicalPaymentmny` | 累计预付实付金额 | `practical_paymentmny` | Decimal |
| 262 | `actualValiSysDate` | 系统生效时间 | `actual_vali_sys_date` | DateTime |
| 263 | `actualValiUserId` | 生效人 | `actual_vali_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 264 | `auditDate` | 审批日期 | `audit_date` | Date |
| 265 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 266 | `auditor` | 审批人名称 | `auditor` | String |
| 267 | `auditorId` | 审批人id | `auditor_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 268 | `cancelBipUserId` | Bip作废人 | `cancel_bip_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 269 | `chgStateDate` | 履约状态变更日期 | `chgState_date` | DateTime |
| 270 | `chgStateFileId` | 履约状态变更附件 | `chgState_fileId` | String |
| 271 | `chgStateMemo` | 履约状态变更原因 | `chgState_Memo` | String |
| 272 | `chgStateReasonId` | 履约状态变更原因档案 | `chgState_reasonId` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 273 | `chgStateUserId` | 履约状态变更人id | `chgState_userId` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 274 | `chgStateUserName` | 履约状态变更用户 | `chgState_userName` | String |
| 275 | `clmCtChangeId` | clm合同变更id | `clm_ct_change_id` | f8963bff-d6c9-4b54-9674-e27a7c8658c4 |
| 276 | `collabStatus` | 协同状态 | `collab_status` | Short |
| 277 | `collaborativeProcesse` | 协同流程 | `collaborative_processe` | Short |
| 278 | `contractExpList` | 合同费用变更历史 | `` | e49a48a9-889e-4420-a3e8-00e138da7cb6 |
| 279 | `contractMaterialList` | 采购合同变更物料子表 | `` | 49d72350-dc01-4208-9c50-c07ddee61c26 |
| 280 | `contractPartyList` | 合同签署方 | `` | 044753ae-8222-49d9-8adf-32ee81f78da8 |
| 281 | `contractPayTermList` | 合同付款协议变更历史 | `` | 01325cb4-2549-42af-a8d8-93fc94995afa |
| 282 | `contractPrepayList` | 合同预付付款单变更历史 | `` | 1fd3ac2d-c272-4c80-ab5c-44ba73539eca |
| 283 | `contractScopeList` | 合同适应组织变更历史 | `` | da8ede8b-8749-4359-b298-397f12699180 |
| 284 | `contractStatus` | 合同单据状态 | `contract_status` | Short |
| 285 | `contractTermList` | 合同条款变更历史 | `` | 3e8dc517-dd8d-4a08-88c8-6a94d68cffa2 |
| 286 | `createDate` | 创建日期 | `create_date` | Date |
| 287 | `ctChangeStatus` | 合同变更状态 | `ct_change_status` | Short |
| 288 | `cumulativeMoney` | 累计下单无税金额 | `cumulative_money` | Decimal |
| 289 | `cumulativeTaxMoney` | 累计下单含税金额 | `cumulative_tax_money` | Decimal |
| 290 | `defines` | 合同变更单自定义项 | `` | 1a20ec0b-986f-4ee8-a43c-a015b5040f8f |
| 291 | `eContractVoidFileId` | 已作废签署合同附件 | `econtract_void_fileId` | String |
| 292 | `eContractVoidReason` | 文本作废原因 | `econtract_void_reason` | String |
| 293 | `eContractVoidSignStatus` | 作废签署状态 | `econtract_void_signStatus` | Integer |
| 294 | `erpCollabStatus` | ERP协同状态 | `erp_collab_status` | Short |
| 295 | `exchRateOps` | 汇率折算方式 | `exchRateOps` | ExchangeRateMethod |
| 296 | `legalType` | 合同法律类别 | `legal_type` | 402cfddf-275b-409e-b1d7-4289e0e0e983 |
| 297 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 298 | `moneyControlType` | 金额控制方式 | `money_control_type` | Short |
| 299 | `moneyRatio` | 金额超量比例 | `money_ratio` | Decimal |
| 300 | `natMoney` | 本币无税金额 | `nat_money` | Decimal |
| 301 | `natTaxMoney` | 本币含税金额 | `nat_tax_money` | Decimal |
| 302 | `paymentDimension` | 付款维度 | `payment_dimension` | Integer |
| 303 | `paymentExcessControl` | 付款超额控制 | `payment_excess_control` | Short |
| 304 | `printCount` | 打印次数 | `printCount` | Integer |
| 305 | `purBipUserId` | Bip采购员用户id | `pur_bip_user_id` | String |
| 306 | `sendChangeErpStatus` | 合同变更推送ERP状态 | `send_change_erp_status` | String |
| 307 | `signerName` | 当前签署人 | `signer_name` | String |
| 308 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 309 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 310 | `terminateBipUserId` | Bip终止人 | `terminate_bip_user_id` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 311 | `terminateCloseBipUserId` | Bip关闭人id | `terminate_close_bip_user_id` | String |
| 312 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 313 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（57个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 单据模板主键 | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `secondPartyId` | 乙方id | `aa.vendor.Vendor` | Service |  |
| 3 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 4 | `cancelUserId` | 作废人id | `cpu-privilege.user.MgrUser` | Service |  |
| 5 | `templateId` | 采购模板 | `tpl.templateorginst.TplTemplateInst` | Service |  |
| 6 | `dealPsnId` | 处理人id | `bd.staff.Staff` | Service |  |
| 7 | `supMsgNotifierId` | 消息通知人id | `aa.vendor.VendorContacts` | Service |  |
| 8 | `defines` | 合同变更单自定义项 | `cpu-contract.contractchangenew.ContractHistryNewVODefine` | None | true |
| 9 | `contractMaterialList` | 采购合同变更物料子表 | `cpu-contract.contractchangenew.ContractMaterialHistoryNewVO` | None | true |
| 10 | `natCurrency` | 本币id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 11 | `contractTermList` | 合同条款变更历史 | `cpu-contract.contractchangenew.ContractTermHistoryNewVO` | None | true |
| 12 | `chgStateReasonId` | 履约状态变更原因档案 | `aa.reason.Reason` | Service |  |
| 13 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 14 | `actualValiUserId` | 生效人 | `base.user.BipUser` | Service |  |
| 15 | `contractPartyList` | 合同签署方 | `cpu-contract.contractchangenew.ContractSignPartyHistory` | None | true |
| 16 | `purPersonId` | 采购员id | `bd.staff.Staff` | Service |  |
| 17 | `reqUapProjectId` | 平台项目档案id | `bd.project.ProjectVO` | Service |  |
| 18 | `contractScopeList` | 合同适应组织变更历史 | `cpu-contract.contractchangenew.ContractOrgScopeHistoryNewVO` | None | true |
| 19 | `terminateUserId` | 终止人id | `cpu-privilege.user.MgrUser` | Service |  |
| 20 | `deptId` | 采购部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
| 21 | `contractPrepayList` | 合同预付付款单变更历史 | `cpu-contract.contractchangenew.ContractPrepayHistoryNewVO` | None | true |
| 22 | `contractPayTermList` | 合同付款协议变更历史 | `cpu-contract.contractchangenew.ContractPayTermHistoryNewVO` | None | true |
| 23 | `CTHistoryHeaderDefine` | 采购合同变更特征属性组 | `cpu-contract.contractchangenew.CTHistoryHeaderDefine` | None |  |
| 24 | `billcategory` | 合同类型 | `DZHTFW.econtract.contractType` | Service |  |
| 25 | `supPersionId` | 供应商联系人id | `aa.vendor.VendorContacts` | Service |  |
| 26 | `auditorId` | 审批人id | `base.user.User` | Service |  |
| 27 | `clmCtChangeId` | clm合同变更id | `CLM.clmContract.clmContractChangeCenter` | Service |  |
| 28 | `cancelBipUserId` | Bip作废人 | `base.user.BipUser` | Service |  |
| 29 | `exchRateType` | 汇率类型id | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 30 | `terminateBipUserId` | Bip终止人 | `base.user.BipUser` | Service |  |
| 31 | `terminateCloseUserId` | 关闭人id | `cpu-privilege.user.MgrUser` | Service |  |
| 32 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 33 | `ContractVODefineCharacter` | 采购合同特征属性组 | `cpu-contract.contract.CTHeaderDefine` | None |  |
| 34 | `purContentTypeId` | 采购内容 自定义项ID | `bctask.basedoc.CustomerDocVO` | Service |  |
| 35 | `purUserId` | 采购员用户id | `cpu-privilege.user.MgrUser` | Service |  |
| 36 | `reqDeptId` | 需求部门id | `org.func.BaseOrg` | Service |  |
| 37 | `supplierId` | 供应商id | `aa.vendor.Vendor` | Service |  |
| 38 | `creatorId` | 创建人ID | `base.user.BipUser` | Service |  |
| 39 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 40 | `orgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 41 | `singleBudgetApplyId` | 单项预算申请单 | `znbzbx.memoapply.MemoApplyVO` | Service |  |
| 42 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 43 | `firstPartyId` | 甲方id | `aa.baseorg.OrgMV` | Service |  |
| 44 | `payAgreementId` | 付款协议ID | `bd.payments.PayAgreement` | Service |  |
| 45 | `transtypeId` | 合同分类id | `bd.bill.TransType` | Service |  |
| 46 | `filedPersonId` | 归档人id | `bd.staff.Staff` | Service |  |
| 47 | `purContactPersonId` | 甲方联系人id | `bd.staff.Staff` | Service |  |
| 48 | `legalType` | 合同法律类别 | `DZHTFW.econtract.contractLegalType` | Service |  |
| 49 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 50 | `ctjlId` | 合同台账id | `CLM.clmContract.contractLib` | Service |  |
| 51 | `parentContractId` | 父合同ID | `cpu-contract.contract.ContractVO` | None |  |
| 52 | `agentConfirmPersonId` | 代确认人id | `bd.staff.Staff` | Service |  |
| 53 | `contractExpList` | 合同费用变更历史 | `cpu-contract.contractchangenew.ContractExpHistoryNewVO` | None | true |
| 54 | `chgStateUserId` | 履约状态变更人id | `base.user.BipUser` | Service |  |
| 55 | `contractId` | 原合同id | `cpu-contract.contract.ContractVO` | None |  |
| 56 | `settleTypeId` | 结算方式 | `aa.settlemethod.SettleMethod` | Service |  |
| 57 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
