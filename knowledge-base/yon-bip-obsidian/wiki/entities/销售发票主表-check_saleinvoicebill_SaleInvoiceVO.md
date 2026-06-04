---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.saleinvoicebill.SaleInvoiceVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售发票主表 (`check.saleinvoicebill.SaleInvoiceVO`)

> ycSaleCoor | 物理表：`sale_invoice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票主表 |
| 物理表 | `sale_invoice` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:46.2740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `invoice_id` | String | id |
| 编码 | `billcode` | String | 单据编号 |

---

## 直接属性（128个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SaleInvoiceDefineCharacter` | 销售发票表头自定义项 | `sale_invoice_definecharacter` | ad45fcc1-8ee2-4742-8b8f-6cc169309ba5 |
| 2 | `bdInvoiceTypeId` | 发票类型id | `bdInvoiceTypeId` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b |
| 3 | `id` | id | `invoice_id` | String |
| 4 | `code` | 单据编号 | `billcode` | String |
| 5 | `createDate` | 创建日期 | `create_date` | Date |
| 6 | `createTime` | 创建时间 | `create_time` | DateTime |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `currencyName` | 币种名称 | `currency_name` | String |
| 10 | `dr` | 删除标记 | `dr` | Integer |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `isRejected` | 供应链采购发票是否驳回,1-驳回 | `is_rejected` | String |
| 14 | `supplyPersonId` | 供方联系人id | `supply_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 15 | `accumulatedAdjustTaxmny` | 累计调整含税金额 | `accumulated_adjust_taxmny` | Decimal |
| 16 | `matchingStatus` | 匹配状态 | `matching_status` | Integer |
| 17 | `realMny` | 实际无税金额 | `real_mny` | Decimal |
| 18 | `purInvCode` | 采购发票单号 | `pur_inv_code` | String |
| 19 | `taxRateId` | 税目 | `tax_rate_id` | 709cd092-3dd4-49ca-9eb9-7b8888551810 |
| 20 | `transactionId` | 交易类型id | `transaction_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 21 | `realTax` | 实际税额 | `real_tax` | Decimal |
| 22 | `mnyDifference` | 无税金额差异 | `mny_difference` | Decimal |
| 23 | `claimInvoiceTaxMny` | 扣款含税金额 | `claim_invoice_taxmny` | Decimal |
| 24 | `realTaxMny` | 实际含税金额 | `real_taxmny` | Decimal |
| 25 | `invoiceAddress` | 收票地址 | `invoice_address` | String |
| 26 | `claimInvoiceTax` | 扣款税额 | `claim_invoice_tax` | Decimal |
| 27 | `erpSourceBillType` | ERP来源单据类型 | `erp_source_bill_type` | String |
| 28 | `paymentProcess` | 付款流程 | `payment_process` | String |
| 29 | `invoiceReceiverName` | 收票人 | `invoice_receiver_name` | String |
| 30 | `taxmnyDifference` | 含税金额差异 | `taxmny_difference` | Decimal |
| 31 | `invoiceReceiverMobile` | 收票人联系方式 | `invoice_receiver_phone` | String |
| 32 | `invoiceReceiverId` | 收票人主键 | `invoice_receiver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 33 | `taxDifference` | 税额差异 | `tax_difference` | Decimal |
| 34 | `claimInvoiceMny` | 扣款无税金额 | `claim_invoice_mny` | Decimal |
| 35 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 36 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 37 | `pkInvoicevendorName` | 开票供应商名称 | `pk_invoicevendor_name` | String |
| 38 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 39 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 40 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 41 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 42 | `invCode` | 发票号码 | `inv_code` | String |
| 43 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 44 | `invId` | 发票代码 | `inv_id` | String |
| 45 | `pkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `pk_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 46 | `billdate` | 单据日期 | `billdate` | Date |
| 47 | `title` | 发票标题 | `title` | String |
| 48 | `status` | 发票状态(0:保存,1:发布,2:发送ERP) | `status` | String |
| 49 | `mny` | 无税金额 | `mny` | Decimal |
| 50 | `signStatus` | 实物发票签收状态 | `sign_status` | String |
| 51 | `taxmny` | 含税金额 | `taxmny` | Decimal |
| 52 | `sourceType` | 来源业务类型 1对账单 2发货单 3订单 | `source_type` | Integer |
| 53 | `tplid` | tplid | `tplid` | Long |
| 54 | `tax` | 税额 | `tax` | Decimal |
| 55 | `businessProcessId` | 业务流程id | `business_process_id` | String |
| 56 | `taxrate` | 税率 | `taxrate` | Decimal |
| 57 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 58 | `businessProcessName` | 业务流程名称 | `business_process_name` | String |
| 59 | `type` | 发票类型(0:普通发票,1:增值税普通发票,2:增值税专用发票) | `type` | String |
| 60 | `tenantName` | 销售企业名称 | `tenant_name` | String |
| 61 | `pkInvoicevendor` | 开票供应商 | `pk_invoicevendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 62 | `ownerId` | 创建用户id{pub_tenant_user} | `owner_id` | String |
| 63 | `customerName` | 采购企业名称 | `customer_name` | String |
| 64 | `invcapplyId` | 发票申请id | `invcapply_id` | Long |
| 65 | `invcapplyBillcode` | 发票申请单据号 | `invcapply_billcode` | String |
| 66 | `puHfanorgName` | 财务结算组织名称 | `pu_hfanorg_name` | String |
| 67 | `outerId` | 关联销售发票id | `outer_id` | String |
| 68 | `orgName` | 采购组织名称 | `org_name` | String |
| 69 | `invDeliveryMethod` | 发票寄送方式 | `inv_delivery_method` | String |
| 70 | `pubts` | 时间戳 | `ts` | DateTime |
| 71 | `expectDate` | 期望开票日期 | `expect_date` | Date |
| 72 | `orgCode` | orgCode | `org_code` | String |
| 73 | `logisticsCompany` | 物流公司 | `logistics_company` | String |
| 74 | `logisticsCode` | 物流单号 | `logistics_code` | String |
| 75 | `description` | 说明 | `description` | String |
| 76 | `supplierCode` | supplierCode | `supplier_code` | String |
| 77 | `contactPerson` | 联系人 | `contact_person` | String |
| 78 | `ownerCode` | 创建人编码 | `owner_code` | String |
| 79 | `contactPhone` | 联系电话 | `contact_phone` | String |
| 80 | `ownerName` | 创建人名称 | `owner_name` | String |
| 81 | `contactAddress` | 联系地址 | `contact_address` | String |
| 82 | `answertime` | 回复时间 | `answertime` | DateTime |
| 83 | `memo` | 备注 | `memo` | String |
| 84 | `rejectReason` | 驳回原因 | `reject_reason` | String |
| 85 | `errorMsg` | 错误信息 | `error_msg` | String |
| 86 | `invoiceImg` | 发票图片 | `invoice_img` | String |
| 87 | `num` | 数量 | `num` | Decimal |
| 88 | `customerTenantId` | 采购商租户id{cpu_auth.cpu_enterprise} | `customer_tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 89 | `invoiceFile` | 附件 | `invoice_file` | String |
| 90 | `calAjustMny` | 对账调整无税金额 | `cal_ajust_mny` | Decimal |
| 91 | `calAjustTaxmny` | 对账调整含税金额 | `cal_ajust_taxmny` | Decimal |
| 92 | `calAjustTax` | 对账调整税额 | `cal_ajust_tax` | Decimal |
| 93 | `ecUrl` | ecUrl | `ec_url` | String |
| 94 | `ecode` | ecode | `ecode` | String |
| 95 | `pdfid` | pdfid | `pdfid` | String |
| 96 | `financeStatus` | 财务状态 | `finance_status` | Integer |
| 97 | `currencyId` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 98 | `currencyCode` | 币种编码 | `currency_code` | String |
| 99 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 100 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 101 | `exchangeRateType` | 汇率类型 | `exchange_rate_type` | String |
| 102 | `transactionTypeName` | 交易类型 | `transaction_type_name` | String |
| 103 | `transactionTypeCode` | 交易类型code | `transaction_type_code` | String |
| 104 | `biztype` | 对账业务类型 | `biztype` | String |
| 105 | `signDate` | 签收日期 | `sign_date` | DateTime |
| 106 | `signPersonId` | 签收人id{bd_staff} | `sign_person_id` | String |
| 107 | `signPersonName` | 签收人名称 | `sign_person_name` | String |
| 108 | `logisticsCompanyCode` | 物流公司代码 | `logistics_company_code` | String |
| 109 | `invDate` | 开票日期 | `inv_date` | String |
| 110 | `entityInvQtyTol` | 实物发票数量合计 | `entity_inv_qty_tol` | Decimal |
| 111 | `entityInvTaxTol` | 实物发票税额合计 | `entity_inv_tax_tol` | Decimal |
| 112 | `entityInvMnyTol` | 实物发票无税金额合计 | `entity_inv_mny_tol` | Decimal |
| 113 | `entityInvPricetaxTol` | 实物发票价税合计 | `entity_inv_pricetax_tol` | Decimal |
| 114 | `matchCompleteStatus` | 匹配完成状态 | `match_complete_status` | Integer |
| 115 | `sendPaybill` | 是否传应付 | `send_paybill` | String |
| 116 | `puHfanorgId` | 财务结算组织id{cpu_auth.cpu_enterprise} | `pu_hfanorg_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 117 | `puHfanorgCode` | 财务结算组织编码 | `pu_hfanorg_code` | String |
| 118 | `expectPayDate` | 期望付款日期 | `expect_pay_date` | Date |
| 119 | `isInvoiceProxy` | 采购商代开票标识 1 是  | `is_invoice_proxy` | String |
| 120 | `ncSignStatus` | NC挂账状态1已挂账0未挂账-瓮福 | `nc_sign_status` | Integer |
| 121 | `ncSignDate` | NC挂账更新时间-瓮福 | `nc_sign_date` | Date |
| 122 | `ytenant` | ytenant | `ytenant_id` | String |
| 123 | `businessProcess` | ERP业务流程 | `business_process` | String |
| 124 | `hstoName` | 仓库名称 | `hsto_name` | String |
| 125 | `claimDeductionList` | 销售发票索赔扣款表 | `` | 609f291f-62bd-4d18-9888-c484d492b6bd |
| 126 | `createtime` | 单据日期 | `createtime` | DateTime |
| 127 | `entityInvoiceList` | 实体发票子表 | `` | 13987eb8-c415-41a8-acde-d8392405436a |
| 128 | `saleInvoiceBody` | 销售发票对账事项汇总表 | `` | f89c4c21-e7a1-4393-a157-7dfa13acd1a9 |

---

## 关联属性（19个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `customerTenantId` | 采购商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `SaleInvoiceDefineCharacter` | 销售发票表头自定义项 | `check.saleinvoicebill.UserDefineInvoiceCharacteristics` | None |  |
| 3 | `bdInvoiceTypeId` | 发票类型id | `bd.invoice.InvoiceTypeVO` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `invoiceReceiverId` | 收票人主键 | `bd.staff.Staff` | Service |  |
| 7 | `transactionId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 8 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | Service |  |
| 9 | `pkSupplier` | 供应商档案id{cpu_basedoc.cpu_supplydoc} | `aa.vendor.Vendor` | Service |  |
| 10 | `puHfanorgId` | 财务结算组织id{cpu_auth.cpu_enterprise} | `org.func.BaseOrg` | Service |  |
| 11 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `entityInvoiceList` | 实体发票子表 | `check.saleinvoicebill.EntityInvoiceVO` | None | true |
| 13 | `pkInvoicevendor` | 开票供应商 | `aa.vendor.Vendor` | Service |  |
| 14 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 15 | `currencyId` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 16 | `taxRateId` | 税目 | `archive.taxArchives.TaxRateArchive` | Service |  |
| 17 | `supplyPersonId` | 供方联系人id | `aa.vendor.VendorContacts` | Service |  |
| 18 | `claimDeductionList` | 销售发票索赔扣款表 | `check.saleinvoicebill.SaleInvoiceClaimDeduction` | None | true |
| 19 | `saleInvoiceBody` | 销售发票对账事项汇总表 | `check.saleinvoicebill.SaleInvoiceBodyVO` | None | true |
