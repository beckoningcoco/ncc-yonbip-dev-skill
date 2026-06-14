---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "cpu-order.delplan.DelplanVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 交货计划单表头 (`cpu-order.delplan.DelplanVO`)

> ycSaleCoor | 物理表：`cpu_delplan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交货计划单表头 |
| 物理表 | `cpu_delplan` |
| domain/服务域 | `cpu-order` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:34.0010` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 交货计划单编号 |

---

## 直接属性（57个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `delplanDefineCharacter` | 自定义项特征属性组 | `define_header` | 86dbe1dc-2aa6-4428-bf7f-11deede338f5 |
| 2 | `buyerContactId` | 买方联系人主键 | `buyer_contact_id` | String |
| 3 | `currencyCode` | 币种编号 | `currency_code` | String |
| 4 | `currencyName` | 币种名称 | `currency_name` | String |
| 5 | `currencySymbol` | 币种符号 | `currency_symbol` | String |
| 6 | `pubts` | 时间戳 | `ts` | DateTime |
| 7 | `initiateType` | 发起方 | `initiate_type` | String |
| 8 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 9 | `code` | 交货计划单编号 | `code` | String |
| 10 | `cooperationProcessArrival` | 到货协同流程 | `cooperation_process_arrival_enum` | String |
| 11 | `dr` | 删除标志 | `dr` | Integer |
| 12 | `id` | ID | `id` | Long |
| 13 | `supContactId` | 供方联系人主键 | `sup_contact_id` | String |
| 14 | `ts` | 时间戳 | `ts` | DateTime |
| 15 | `billNo` | 交货计划单编号 | `bill_no` | String |
| 16 | `billDate` | 交货计划单日期 | `bill_date` | Date |
| 17 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 18 | `purOrgName` | 采购组织名称 | `pur_org_name` | String |
| 19 | `purDeptName` | 采购部门名称 | `pur_dept_name` | String |
| 20 | `purchaseName` | 采购员名称 | `purchase_name` | String |
| 21 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 23 | `urgency` | 紧急程度:1.普通;2.紧急;3.加急 | `urgency` | Integer |
| 24 | `memo` | 备注 | `memo` | String |
| 25 | `vreason` | 拒绝/变更理由 | `vreason` | String |
| 26 | `billstatus` | 整单状态 | `billstatus` | String |
| 27 | `transtypeId` | 交易类型主键 | `transtype_id` | String |
| 28 | `transtypeCode` | 交易类型编码 | `transtype_code` | String |
| 29 | `transtypeName` | 交易类型名称 | `transtype_name` | String |
| 30 | `purOrgId` | 采购组织主键 | `pur_org_id` | String |
| 31 | `purOrgCode` | 采购组织编码 | `pur_org_code` | String |
| 32 | `purDeptId` | 采购部门主键 | `pur_dept_id` | String |
| 33 | `purDeptCode` | 采购部门编码 | `pur_dept_code` | String |
| 34 | `purchaseId` | 采购员主键 | `purchase_id` | String |
| 35 | `supplierId` | 供应商主键 | `supplier_id` | Long |
| 36 | `supplierCode` | 供应商编码 | `supplier_code` | String |
| 37 | `purEnterpriseId` | 采购商企业ID | `pur_enterprise_id` | Long |
| 38 | `purEnterpriseName` | 采购商企业名称 | `pur_enterprise_name` | String |
| 39 | `enterpriseId` | 销售商企业ID | `enterprise_id` | Long |
| 40 | `enterpriseName` | 销售商企业名称 | `enterprise_name` | String |
| 41 | `createDate` | 创建时间 | `create_date` | DateTime |
| 42 | `changeDate` | 修改时间 | `change_date` | DateTime |
| 43 | `buyerContactCode` | 买方联系人编码 | `buyer_contact_code` | String |
| 44 | `buyerContactName` | 买方联系人名称 | `buyer_contact_name` | String |
| 45 | `supContactCode` | 供方联系人编码 | `sup_contact_code` | String |
| 46 | `supContactName` | 供方联系人名称 | `sup_contact_name` | String |
| 47 | `supContactPhone` | 供方联系人电话 | `sup_contact_phone` | String |
| 48 | `tplid` | tplid | `tplid` | Long |
| 49 | `isYcReceive` | 到货单是否在云采签收 | `isYcReceive` | String |
| 50 | `purchaseCode` | 采购员编码 | `purchase_code` | String |
| 51 | `sourceType` | 交货计划来源 | `source_type` | String |
| 52 | `currencyId` | 币种Id | `currency_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 53 | `businessType` | 业务类型:0.普通订单;1.VMI订单 | `business_type` | Integer |
| 54 | `rate` | 汇率 | `rate` | Decimal |
| 55 | `rateType` | 汇率类型 | `rate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 56 | `defines` | 表头自定义项 | `` | 0ee60a48-4e14-44d3-80aa-a58ea5039a85 |
| 57 | `delplanDetailList` | 交货计划单表体 | `` | 652d5ae6-453d-4235-96de-56737e55c9c2 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `rateType` | 汇率类型 | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `delplanDetailList` | 交货计划单表体 | `cpu-order.delplan.DelplanDetailVO` | None | true |
| 4 | `delplanDefineCharacter` | 自定义项特征属性组 | `cpu-order.delplan.DelplanHeaderDefine` | None |  |
| 5 | `currencyId` | 币种Id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 6 | `defines` | 表头自定义项 | `cpu-order.delplan.DelplanVODefine` | None | true |
