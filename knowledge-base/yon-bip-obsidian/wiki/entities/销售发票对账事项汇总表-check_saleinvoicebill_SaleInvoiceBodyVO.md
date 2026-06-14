---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.saleinvoicebill.SaleInvoiceBodyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售发票对账事项汇总表 (`check.saleinvoicebill.SaleInvoiceBodyVO`)

> ycSaleCoor | 物理表：`sale_invoice_b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售发票对账事项汇总表 |
| 物理表 | `sale_invoice_b` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:31:11.2250` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `invoice_bid` | String | 销售发票明细主键 |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 销售发票明细主键 | `invoice_bid` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 6 | `dr` | 删除标记 | `dr` | Integer |
| 7 | `modifier` | 修改人名称 | `modifier` | String |
| 8 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 9 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `invoiceId` | 发票{yuncai_check.sale_invoice} | `invoice_id` | 392eae4a-d538-4186-806f-37236c893dba |
| 12 | `buyerTenant` | 跨租户-采购商租户 | `buyer_tenant_id` | String |
| 13 | `vendorTenant` | 跨租户-供应商租户 | `vendor_tenant_id` | String |
| 14 | `enterpriseId` | 云采id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 15 | `relateId` | 关联采购发票id{yuncai_check.pu_invoice} | `relate_id` | String |
| 16 | `relateBid` | 关联采购发票表体id{yuncai_check.pu_invoice_b} | `relate_bid` | String |
| 17 | `applyBid` | 发票申请表体id | `apply_bid` | String |
| 18 | `applyId` | 发票申请id | `apply_id` | String |
| 19 | `applyBillcode` | 发票申请单据号 | `apply_billcode` | String |
| 20 | `checkbillId` | 对账单id{yuncai_check.sale_checkbill} | `checkbill_id` | String |
| 21 | `checkbillBid` | 对账单表体id{yuncai_check.sale_checkbill_b} | `checkbill_bid` | String |
| 22 | `checkbillBillcode` | 对账单单据号 | `checkbill_billcode` | String |
| 23 | `num` | 计价数量小计 | `num` | Decimal |
| 24 | `mny` | 无税金额小计 | `mny` | Decimal |
| 25 | `taxmny` | 含税金额小计 | `taxmny` | Decimal |
| 26 | `tax` | 税额小计 | `tax` | Decimal |
| 27 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `tenant_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 28 | `pubts` | 时间戳 | `ts` | DateTime |
| 29 | `orgCode` | orgCode | `org_code` | String |
| 30 | `orgName` | 组织名称 | `org_name` | String |
| 31 | `pkOrg` | 采购组织id{org_orgs} | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 32 | `ajustTaxmny` | 调整含税金额 | `ajust_taxmny` | Decimal |
| 33 | `ajustTax` | 调整税额 | `ajust_tax` | Decimal |
| 34 | `ajustMny` | 调整无税金额 | `ajust_mny` | Decimal |
| 35 | `sourceBillCode` | 对账来源单单号 | `source_bill_code` | String |
| 36 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 37 | `materiaList` | 销售发票物料明细 | `` | 353b5f96-9c0a-4438-a805-c62188ef41a3 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `pkOrg` | 采购组织id{org_orgs} | `org.func.BaseOrg` | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `tenantId` | 供应商租户id{cpu_auth.cpu_enterprise} | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `materiaList` | 销售发票物料明细 | `check.saleinvoicebill.SaleInvoiceMaterialVO` | None | true |
| 7 | `invoiceId` | 发票{yuncai_check.sale_invoice} | `check.saleinvoicebill.SaleInvoiceVO` | None | true |
| 8 | `enterpriseId` | 云采id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
