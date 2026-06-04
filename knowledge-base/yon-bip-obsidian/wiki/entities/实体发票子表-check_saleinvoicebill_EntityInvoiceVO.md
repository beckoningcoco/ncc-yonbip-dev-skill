---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.saleinvoicebill.EntityInvoiceVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 实体发票子表 (`check.saleinvoicebill.EntityInvoiceVO`)

> ycSaleCoor | 物理表：`entity_invoice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实体发票子表 |
| 物理表 | `entity_invoice` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:09.8710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `entity_invoice_id` | Long | id |

---

## 直接属性（71个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 逻辑删除标识 | `dr` | Integer |
| 7 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `invoiceTypeId` | 发票类型主键 | `invoice_type_id` | 3a762abb-858d-4fc4-a60e-4850edf0ab1b |
| 9 | `modifier` | 修改人名称 | `modifier` | String |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 14 | `id` | id | `entity_invoice_id` | Long |
| 15 | `number` | 发票号码 | `number` | String |
| 16 | `invoiceId` | 销售发票主表 | `invoice_id` | 392eae4a-d538-4186-806f-37236c893dba |
| 17 | `code` | 发票代码 | `code` | String |
| 18 | `openInvDate` | 开票日期 | `open_inv_date` | String |
| 19 | `qtySubTol` | 数量 | `qty_sub_tol` | Decimal |
| 20 | `imageId` | 发票图片 | `image_id` | String |
| 21 | `doubtStatus` | 可疑票状态 | `doubt_status` | Integer |
| 22 | `purName` | 发票抬头 | `pur_name` | String |
| 23 | `mnyTol` | 无税金额 | `mny_tol` | Decimal |
| 24 | `mnySubTol` | 无税金额 | `mny_sub_tol` | Decimal |
| 25 | `taxTol` | 税额 | `tax_tol` | Decimal |
| 26 | `taxSubTol` | 税额 | `tax_sub_tol` | Decimal |
| 27 | `taxMnyTol` | 含税金额 | `tax_mny_tol` | Decimal |
| 28 | `priceTaxSubTol` | 含税金额 | `price_tax_sub_tol` | Decimal |
| 29 | `checkCode` | 发票校验码 | `check_code` | String |
| 30 | `entityfile` | 发票图片 | `entityfile` | String |
| 31 | `pubts` | 时间戳 | `ts` | DateTime |
| 32 | `status` | 发票状态 | `status` | Integer |
| 33 | `billType` | 发票类型 | `bill_type` | String |
| 34 | `cloudInvoiceId` | 发票Id | `cloud_invoice_id` | Long |
| 35 | `memo` | 备注 | `memo` | String |
| 36 | `secretText` | 发票密文 | `secret_text` | String |
| 37 | `type` | 发票类型 | `type` | String |
| 38 | `taxMethod` | 征税方式 | `tax_method` | String |
| 39 | `medium` | 发票介质 | `medium` | String |
| 40 | `voidSign` | 作废标志 | `void_sign` | String |
| 41 | `purAddrPhone` | 购方地址电话 | `pur_addr_phone` | String |
| 42 | `purTaxIdentiNum` | 购方纳税人识别号 | `pur_tax_identi_num` | String |
| 43 | `purBankAccout` | 购方银行账号 | `pur_bank_accout` | String |
| 44 | `deviceNum` | 税控设备编号 | `device_num` | String |
| 45 | `openInvType` | 开票类型 | `open_inv_type` | String |
| 46 | `openInvPerson` | 开票人 | `open_inv_person` | String |
| 47 | `payee` | 收款人 | `payee` | String |
| 48 | `selAddrPhone` | 销方地址电话 | `sel_addr_phone` | String |
| 49 | `selName` | 销方名称 | `sel_name` | String |
| 50 | `selTaxIdentiNum` | 销方纳税人识别号 | `sel_tax_identi_num` | String |
| 51 | `selBankAccout` | 销方银行账号 | `sel_bank_accout` | String |
| 52 | `originCode` | 原发票代码 | `origin_code` | String |
| 53 | `originNum` | 原发票号码 | `origin_num` | String |
| 54 | `qrCode` | 二维码 | `qr_code` | String |
| 55 | `purMark` | 收购标识 | `pur_mark` | String |
| 56 | `expenseStatus` | 报销状态 | `expense_status` | String |
| 57 | `consumeType` | 消费类型 | `consume_type` | String |
| 58 | `prePolicyLogo` | 优惠政策标识 | `pre_policy_logo` | Integer |
| 59 | `prePolicyDes` | 优惠政策说明 | `pre_policy_des` | String |
| 60 | `deduction` | 扣除额 | `deduction` | Decimal |
| 61 | `planInvDetailId` | 机打发票明细ID | `plan_inv_detail_id` | Long |
| 62 | `planInvMasId` | 机打发票主表ID | `plan_inv_mas_id` | Long |
| 63 | `imageUrl` | 存储图片路径 | `image_url` | String |
| 64 | `customerName` | 采购企业 | `customer_name` | String |
| 65 | `customerTenantId` | customerTenantId | `customer_tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 66 | `tenantId` | tenantId | `tenant_id` | String |
| 67 | `fileId` | 附件id | `file_id` | String |
| 68 | `matchStatus` | 匹配状态 | `match_status` | Integer |
| 69 | `fileName` | 文件名 | `file_name` | String |
| 70 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 71 | `entityInvoiceBody` | 实体发票孙表 | `` | affe7892-0d20-4796-8682-57991f07f659 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `entityInvoiceBody` | 实体发票孙表 | `check.saleinvoicebill.EntityInvoiceBodyVO` | None | true |
| 2 | `customerTenantId` | customerTenantId | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 4 | `invoiceTypeId` | 发票类型主键 | `bd.invoice.InvoiceTypeVO` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `invoiceId` | 销售发票主表 | `check.saleinvoicebill.SaleInvoiceVO` | None | true |
| 8 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
