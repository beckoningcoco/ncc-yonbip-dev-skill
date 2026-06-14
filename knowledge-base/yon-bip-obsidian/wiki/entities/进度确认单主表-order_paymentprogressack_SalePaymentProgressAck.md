---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.paymentprogressack.SalePaymentProgressAck"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 进度确认单主表 (`order.paymentprogressack.SalePaymentProgressAck`)

> ycSaleCoor | 物理表：`cpu_sale_paymentprogressack`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 进度确认单主表 |
| 物理表 | `cpu_sale_paymentprogressack` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:55.5930` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（56个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `transType` | 交易类型id | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 3 | `transName` | 交易类型 | `trans_name` | String |
| 4 | `purEnterpriseId` | 采购商id | `pur_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 5 | `dr` |  | `dr` | Integer |
| 6 | `code` | 编码 | `code` | String |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 9 | `purEnterpriseName` | 采购商 | `pur_enterprise_name` | String |
| 10 | `reqOrgId` | 需求组织id | `req_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 11 | `reqOrgName` | 需求组织 | `req_org_name` | String |
| 12 | `purOrg` | 采购组织id | `pur_org` | 528ae807-a9d3-4f2a-9ee7-1db3e5eddc01 |
| 13 | `purOrgName` | 采购组织 | `pur_org_name` | String |
| 14 | `ticketOrgId` | 收票组织id | `ticket_org_id` | 4ec9e266-1eae-4f78-b5e3-26c220a15d70 |
| 15 | `ticketOrgName` | 收票组织 | `ticket_org_name` | String |
| 16 | `confirmTime` | 确认时间 | `confirm_time` | DateTime |
| 17 | `confirmDate` | 确认日期 | `confirm_date` | Date |
| 18 | `purCode` | 买方确认单号 | `pur_code` | String |
| 19 | `ackDepartment` | 确认部门id | `ack_department` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 20 | `ackDepartmentName` | 确认部门 | `ack_department_name` | String |
| 21 | `ackOperator` | 确认人id | `ack_operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 22 | `ackOperatorName` | 确认人 | `ack_operator_name` | String |
| 23 | `purOrderId` | 采购订单id | `pur_order_id` | Long |
| 24 | `purOrderCode` | 采购订单编号 | `pur_order_code` | String |
| 25 | `saleOrderId` | 销售订单id | `sale_order_id` | Long |
| 26 | `saleOrderCode` | 销售订单编号 | `sale_order_code` | String |
| 27 | `purOrderDate` | 采购订单日期 | `pur_order_date` | Date |
| 28 | `startDate` | 付款时点id | `startDate` | a4a03d83-ea92-422d-9f64-b5f18f26a4a9 |
| 29 | `startDateName` | 付款时点 | `startDate_name` | String |
| 30 | `vendorLinkman` | 供方联系人id | `vendor_linkman` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 31 | `vendorLinkmanName` | 供方联系人 | `vendor_linkman_name` | String |
| 32 | `vendorLinkmanPhone` | 供方联系方式 | `vendor_linkman_phone` | String |
| 33 | `invoiceVendor` | 开票供应商id | `invoice_vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 34 | `invoiceVendorName` | 开票供应商 | `invoice_vendor_name` | String |
| 35 | `currencyId` | 币种id | `iCurrencyID` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 36 | `currencyName` | 币种 | `currency_name` | String |
| 37 | `exchRateType` | 汇率类型 | `iExchRateType` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 38 | `exchangeRate` | 汇率 | `exchange_rate` | Decimal |
| 39 | `department` | 采购部门id | `department` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 40 | `departmentName` | 采购部门 | `department_name` | String |
| 41 | `operatorPhone` | 采购员联系方式 | `operator_phone` | String |
| 42 | `operator` | 采购员id | `iOperatorId` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 43 | `operatorName` | 采购员 | `operator_name` | String |
| 44 | `memo` | 备注 | `memo` | String |
| 45 | `purPaymentSchedulesId` | 采购订单付款计划行id | `pur_payment_schedules_id` | dc8eacac-306c-4460-bc12-ad63290275fd |
| 46 | `salePayTermId` | 销售订单付款计划行id | `sale_pay_term_id` | Long |
| 47 | `defineCharacter` | 表头自定义项特征 | `define_character` | bbbc242f-c1a9-47bd-948c-f620c92c9d87 |
| 48 | `createTime` | 创建时间 | `create_time` | DateTime |
| 49 | `createDate` | 创建日期 | `create_date` | Date |
| 50 | `creatorId` | 创建人id | `creator_id` | 54800425-15da-4742-ae89-059d05e77c9b |
| 51 | `creator` | 创建人 | `creator` | String |
| 52 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 53 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 54 | `cooperObject` | 进度确认单协同主表 | `` | eb80f608-1b16-4995-ab4c-a43c5bbf7b22 |
| 55 | `details` | 进度确认单子表 | `` | 85450cc7-522a-4107-8d78-6c8e3f3ff09b |
| 56 | `vendor` | 供应商 | `vendor` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ackOperator` | 确认人id | `bd.staff.Staff` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `invoiceVendor` | 开票供应商id | `aa.vendor.Vendor` | Service |  |
| 4 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 5 | `operator` | 采购员id | `bd.staff.Staff` | Service |  |
| 6 | `purEnterpriseId` | 采购商id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `vendorLinkman` | 供方联系人id | `bd.staff.Staff` | Service |  |
| 8 | `purOrg` | 采购组织id | `aa.baseorg.PurchaseOrgMV` | Service |  |
| 9 | `ackDepartment` | 确认部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 10 | `transType` | 交易类型id | `bd.bill.TransType` | Service |  |
| 11 | `exchRateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 12 | `purPaymentSchedulesId` | 采购订单付款计划行id | `pu.purchaseorder.PaymentSchedules` | Service |  |
| 13 | `vendor` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 14 | `ticketOrgId` | 收票组织id | `aa.baseorg.FinanceOrgMV` | Service |  |
| 15 | `details` | 进度确认单子表 | `order.paymentprogressack.SalePaymentProgressAcks` | None | true |
| 16 | `currencyId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 17 | `department` | 采购部门id | `bd.adminOrg.AdminOrgVO` | Service |  |
| 18 | `reqOrgId` | 需求组织id | `aa.baseorg.OrgMV` | Service |  |
| 19 | `defineCharacter` | 表头自定义项特征 | `order.paymentprogressack.PaymentProgressAckDefineCharacter` | None |  |
| 20 | `startDate` | 付款时点id | `bd.payments.PayStartBase` | Service |  |
| 21 | `cooperObject` | 进度确认单协同主表 | `order.paymentprogressack.PaymentProgressAckCooperate` | None | true |
