---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.saleinvoicebill.EntityInvoiceBodyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 实体发票孙表 (`check.saleinvoicebill.EntityInvoiceBodyVO`)

> ycSaleCoor | 物理表：`entity_invoice_c`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 实体发票孙表 |
| 物理表 | `entity_invoice_c` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:29.6780` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `createDate` | 创建日期 | `create_date` | Date |
| 3 | `createTime` | 创建时间 | `create_time` | DateTime |
| 4 | `creator` | 创建人名称 | `creator` | String |
| 5 | `matchingStatus` |  匹配状态 | `matching_status` | Integer |
| 6 | `matchingGroupId` | 匹配分组id | `matching_group_id` | Long |
| 7 | `operator` | 操作人 | `operator` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 8 | `matchingType` | 匹配方式 | `matching_type` | Integer |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 15 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 16 | `id` | id | `id` | Long |
| 17 | `prodName` | 产品名称 | `prod_name` | String |
| 18 | `entityInvId` | 实物发票 | `entity_inv_id` | 13987eb8-c415-41a8-acde-d8392405436a |
| 19 | `spec` | 规格 | `spec` | String |
| 20 | `lineNum` | 实物发票号 | `line_num` | Long |
| 21 | `model` | 型号 | `model` | String |
| 22 | `prodId` | 实物发票产品id | `prod_id` | Long |
| 23 | `unit` | 单位 | `unit` | String |
| 24 | `qty` | 数量 | `qty` | Decimal |
| 25 | `prodCode` | 实物发票产品编码 | `prod_code` | String |
| 26 | `price` | 无税单价 | `price` | Decimal |
| 27 | `rate` | 税率 | `rate` | Decimal |
| 28 | `mny` | 无税金额 | `mny` | Decimal |
| 29 | `tax` | 税额 | `tax` | Decimal |
| 30 | `priceTaxTol` | 含税金额 | `price_tax_tol` | Decimal |
| 31 | `taxmny` | 含税金额 | `taxmny` | Decimal |
| 32 | `status` | 行状态 | `status` | Integer |
| 33 | `pubts` | 时间戳 | `ts` | DateTime |
| 34 | `dr` | 逻辑删除 | `dr` | Integer |
| 35 | `code` | 发票代码 | `code` | String |
| 36 | `number` | 发票号码 | `number` | String |
| 37 | `cloudInvoiceId` | 发票Id,来源于税务云 | `cloud_invoice_id` | Long |
| 38 | `taxCode` | 商品税收分类编码 | `tax_code` | String |
| 39 | `prePolicyLogo` | 优惠政策标识 | `pre_policy_logo` | String |
| 40 | `prePolicyDes` | 优惠政策说明 | `pre_policy_des` | String |
| 41 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 42 | `operatorName` | 操作人 | `operator_name` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `entityInvId` | 实物发票 | `check.saleinvoicebill.EntityInvoiceVO` | None | true |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `operator` | 操作人 | `bd.staff.Staff` | Service |  |
