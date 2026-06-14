---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.salecheckbill.SaleCheckBillVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售周期对账单主表 (`check.salecheckbill.SaleCheckBillVO`)

> ycSaleCoor | 物理表：`sale_checkbill`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售周期对账单主表 |
| 物理表 | `sale_checkbill` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:44.6540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `checkbill_id` | String | id |
| 编码 | `billcode` | String | 对账单号 |

---

## 直接属性（112个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SaleCheckBillVODefineCharacter` | 表头自定义项特征属性 | `sale_check_bill_define_character` | dbe4d0ba-0305-4443-abcf-84e55f4b7f52 |
| 2 | `createTime` | 创建时间 | `create_time` | DateTime |
| 3 | `creator` | 创建人名称 | `creator` | String |
| 4 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 5 | `currencyName` | 币种名称 | `currency_name` | String |
| 6 | `dr` | 删除标识 | `dr` | Integer |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `purEnterpriseName` | 采购商 | `pur_enterprise_name` | String |
| 10 | `tplid` | tplid | `tplid` | Long |
| 11 | `isNotInvoiced` | 按实收数量对账,1-未开销售发票 | `is_not_invoiced` | String |
| 12 | `supplyPersonId` | 供方联系人id | `supply_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 13 | `puCheckPersonId` | 买方对账发起人 | `pu_check_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 14 | `pubillcode` | 采购对账单号 | `pu_billcode` | String |
| 15 | `apportionAmount` | 待分摊索赔扣款金额 | `apportion_amount` | Decimal |
| 16 | `claimTotalAmount` | 索赔扣款金额 | `claim_total_amount` | Decimal |
| 17 | `needApportionAmount` | 需分摊索赔扣款金额 | `need_apportion_amount` | Decimal |
| 18 | `checkCreatorId` | 创建人 | `check_creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `checkPresonId` | 对账发起人 | `check_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 20 | `isInvoiceContract` | 是否发票协同 | `is_invoice_contract` | Integer |
| 21 | `claimInvoicedAmount` | 索赔扣款已开票金额 | `claim_invoiced_amount` | Decimal |
| 22 | `invoiceAddress` | 收票地址 | `invoice_address` | String |
| 23 | `transtypeName` | 交易类型 | `transtype_name` | String |
| 24 | `paymentProcess` | 付款流程 | `payment_process` | String |
| 25 | `invoiceReceiverName` | 收票人 | `invoice_receiver_name` | String |
| 26 | `code` | 对账单号 | `billcode` | String |
| 27 | `checkSource` | 对账发起方 | `check_source` | String |
| 28 | `printCount` | 打印次数 | `printCount` | Integer |
| 29 | `transtypeId` | 交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 30 | `invoiceReceiverMobile` | 收票人联系方式 | `invoice_receiver_phone` | String |
| 31 | `invoiceReceiverId` | 收票人主键 | `invoice_receiver_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 32 | `businessType` | 业务类型 | `business_type` | String |
| 33 | `title` | 对账标题 | `title` | String |
| 34 | `status` | 对账状态(0:保存,1:发布,2:确认,3:可开票,4:已开票) | `status` | String |
| 35 | `dealType` | 交易类型 | `deal_type` | String |
| 36 | `takerOrgid` | 收票组织 | `taker_orgid` | 14302233-1394-4a70-94e1-bed51636f312 |
| 37 | `pkSupplier` | 对账供应商 | `pk_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 38 | `customerTenantId` | 采购商商租户id{cpu_auth.cpu_enterprise} | `customer_tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 39 | `begindate` | 对账开始日期 | `begindate` | Date |
| 40 | `invoicevendorName` | 开票供应商名称 | `invoicevendor_name` | String |
| 41 | `enddate` | 对账截止日期 | `enddate` | Date |
| 42 | `biztype` | 对账业务类型 | `biztype` | String |
| 43 | `memo` | 备注 | `memo` | String |
| 44 | `supplierFile` | 供应商附件 | `supplier_file` | String |
| 45 | `puFile` | 采购商附件 | `pu_file` | String |
| 46 | `ownerName` | 创建用户名称 | `owner_name` | String |
| 47 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 48 | `pubts` | 时间戳 | `ts` | DateTime |
| 49 | `puNum` | 计价数量 | `pu_num` | Decimal |
| 50 | `puPurNum` | 应对采购数量 | `pu_pur_num` | Decimal |
| 51 | `puMainNum` | 应对主数量 | `pu_main_num` | Decimal |
| 52 | `leaveNum` | 遗留数量 | `leave_num` | Decimal |
| 53 | `leavePurNum` | 遗留采购数量 | `leave_pur_num` | Decimal |
| 54 | `leaveMainNum` | 遗留主数量 | `leave_main_num` | Decimal |
| 55 | `actualNum` | 实对数量 | `actual_num` | Decimal |
| 56 | `actualPurNum` | 实对采购数量 | `actual_pur_num` | Decimal |
| 57 | `actualMainNum` | 实对主数量 | `actual_main_num` | Decimal |
| 58 | `puTaxmny` | 应对含税金额 | `pu_taxmny` | Decimal |
| 59 | `ajustNum` | 调整数量 | `ajust_num` | Decimal |
| 60 | `puMny` | 应对无税金额 | `pu_mny` | Decimal |
| 61 | `ajustTaxmny` | 调整含税金额 | `ajust_taxmny` | Decimal |
| 62 | `ajustMny` | 调整无税金额 | `ajust_mny` | Decimal |
| 63 | `customerCode` | 客户编码 | `customer_code` | String |
| 64 | `leaveTaxmny` | 遗留含税金额 | `leave_taxmny` | Decimal |
| 65 | `customerName` | 客户名称 | `customer_name` | String |
| 66 | `leaveMny` | 遗留无税金额 | `leave_mny` | Decimal |
| 67 | `id` | id | `checkbill_id` | String |
| 68 | `actualTaxmny` | 实对含税金额 | `actual_taxmny` | Decimal |
| 69 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 70 | `actualMny` | 实对无税金额 | `actual_mny` | Decimal |
| 71 | `orgCode` | orgCode | `org_code` | String |
| 72 | `orgName` | 组织名称 | `org_name` | String |
| 73 | `billdate` | 单据日期 | `billdate` | Date |
| 74 | `ajustTax` | 调整税额 | `ajust_tax` | Decimal |
| 75 | `relateId` | 对账单主表id | `relate_id` | String |
| 76 | `accInvoiceNum` | 已开票数量 | `acc_invoice_num` | Decimal |
| 77 | `accInvoiceMny` | 已开票无税金额 | `acc_invoice_mny` | Decimal |
| 78 | `ownerId` | 创建用户id{pub_tenant_user} | `owner_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 79 | `accInvoiceTaxmny` | 已开票含税金额 | `acc_invoice_taxmny` | Decimal |
| 80 | `ownerCode` | 创建用户编码 | `owner_code` | String |
| 81 | `accApplyNum` | 已开销售发票未发布计价数量 | `acc_apply_num` | Decimal |
| 82 | `puTax` | 采购税额 | `pu_tax` | Decimal |
| 83 | `accApplyMny` | 累计申请无税金额 | `acc_apply_mny` | Decimal |
| 84 | `saleTaxmny` | 销售含税金额 | `sale_taxmny` | Decimal |
| 85 | `accApplyTaxmny` | 累计申请含税金额 | `acc_apply_taxmny` | Decimal |
| 86 | `saleTax` | 销售税额 | `sale_tax` | Decimal |
| 87 | `saleMny` | 销售无税金额 | `sale_mny` | Decimal |
| 88 | `saleNum` | 销售数量 | `sale_num` | Decimal |
| 89 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 90 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 91 | `publishtime` | 发布时间 | `publishtime` | DateTime |
| 92 | `supplierName` | 对账供应商 | `supplier_name` | String |
| 93 | `pkInvoicevendor` | 开票供应商pk{cpu_basedoc.cpu_supplydoc} | `pk_invoicevendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 94 | `invoicevendorCode` | 开票供应商编码 | `invoicevendor_code` | String |
| 95 | `takerOrgcode` | 收票组织code | `taker_orgcode` | String |
| 96 | `takerOrgname` | 收票组织name | `taker_orgname` | String |
| 97 | `answertime` | 回复时间 | `answertime` | DateTime |
| 98 | `isVirtual` | 是否虚拟对账单 | `is_virtual` | String |
| 99 | `tenantName` | 销售企业名称 | `tenant_name` | String |
| 100 | `currencyId` | 币种ID | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 101 | `currencyCode` | 币种编码 | `currency_code` | String |
| 102 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 103 | `billStatus` | 审批状态 | `bill_status` | String |
| 104 | `pkCustomer` | 客户ID | `pk_customer` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 105 | `createDate` | 创建日期 | `create_date` | Date |
| 106 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 107 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 108 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 109 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 110 | `claimDedutionList` | 销售对账索赔扣款表 | `` | 9afcd0a8-961f-46aa-85f7-8bc213bf0c25 |
| 111 | `defines` | 销售对账单自由自定义项 | `` | b4cb1c45-b1f1-45c3-9fa4-196c0ab09a1a |
| 112 | `materiaList` | 销售对账单孙表 | `` | 1cdce718-295f-4537-b613-82370f3b81de |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `customerTenantId` | 采购商商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `puCheckPersonId` | 买方对账发起人 | `bd.staff.Staff` | Service |  |
| 3 | `checkCreatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `checkPresonId` | 对账发起人 | `bd.staff.Staff` | Service |  |
| 8 | `invoiceReceiverId` | 收票人主键 | `bd.staff.Staff` | Service |  |
| 9 | `takerOrgid` | 收票组织 | `org.func.BaseOrg` | Service |  |
| 10 | `ownerId` | 创建用户id{pub_tenant_user} | `base.user.User` | Service |  |
| 11 | `pkCustomer` | 客户ID | `bd.staff.Staff` | Service |  |
| 12 | `defines` | 销售对账单自由自定义项 | `check.salecheckbill.SaleCheckbillVOFreeDefine` | None | true |
| 13 | `claimDedutionList` | 销售对账索赔扣款表 | `check.salecheckbill.SaleCheckbillClaimDeduction` | None | true |
| 14 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | Service |  |
| 15 | `pkSupplier` | 对账供应商 | `aa.vendor.Vendor` | Service |  |
| 16 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 17 | `materiaList` | 销售对账单孙表 | `check.salecheckbill.SaleCheckBillMaterialVO` | None | true |
| 18 | `SaleCheckBillVODefineCharacter` | 表头自定义项特征属性 | `check.salecheckbill.UserDefineCharacteristics` | None |  |
| 19 | `pkInvoicevendor` | 开票供应商pk{cpu_basedoc.cpu_supplydoc} | `aa.vendor.Vendor` | Service |  |
| 20 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 21 | `currencyId` | 币种ID | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 22 | `transtypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 23 | `supplyPersonId` | 供方联系人id | `aa.vendor.VendorContacts` | Service |  |
