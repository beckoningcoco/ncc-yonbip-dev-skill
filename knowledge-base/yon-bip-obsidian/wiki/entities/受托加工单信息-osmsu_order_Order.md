---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "osmsu.order.Order"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 受托加工单信息 (`osmsu.order.Order`)

> ycSaleCoor | 物理表：`osmsu_order`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 受托加工单信息 |
| 物理表 | `osmsu_order` |
| 数据库 schema | `yonbip-cpu-synergy` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:52.7120` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（88个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `code` | 受托加工单号 | `code` | String |
| 3 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 4 | `businessType` | 业务类型 | `business_type` | String |
| 5 | `orderSource` | 订单来源 | `order_source` | String |
| 6 | `orderTitle` | 订单标题 | `order_title` | String |
| 7 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 8 | `source` | 上游单据类型 | `source` | String |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 11 | `tcName` | 币种名称 | `tc_name` | String |
| 12 | `outSysCode` | ERP委外订单号 | `out_sys_code` | String |
| 13 | `tcFCExchRateName` | 汇率类型名称 | `tcfc_exchrate_type_name` | String |
| 14 | `orgName` | 采购组织名称 | `org_name` | String |
| 15 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 16 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 18 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 19 | `ctId` | 自定义项特征组id | `ct_id` | f419e7b6-91e4-434d-9448-dd68b2167daf |
| 20 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 21 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `osmBusiType` | 业务类型 | `osm_busi_type` | String |
| 23 | `transTypeName` | 交易类型名称 | `trans_type_name` | String |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `auditDate` | 审批日期 | `audit_date` | Date |
| 26 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 27 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 28 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 29 | `subcontractVendorName` | 委外商名称 | `subcontract_vendor_name` | String |
| 30 | `auditor` | 审批人名称 | `auditor` | String |
| 31 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 32 | `createTime` | 创建时间 | `create_time` | DateTime |
| 33 | `upcode` | 上游单据号 | `upcode` | String |
| 34 | `orgId` | 采购组织id | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 35 | `buyerTenantName` | 采购企业 | `buyer_tenant_name` | String |
| 36 | `departmentId` | 部门id | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 37 | `operatorId` | 业务员id | `operator_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 38 | `operatorName` | 业务员 | `operator_name` | String |
| 39 | `operatorUserId` | 业务员userId | `operator_user_id` | String |
| 40 | `subcontractVendorId` | 委外商id | `subcontract_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 41 | `invoiceVendorId` | 开票委外商id | `invoice_vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 42 | `tcOrgId` | 收票组织id | `tc_org_id` | 5d4c5590-da40-4b50-80a1-8d04da2f79e0 |
| 43 | `subcontractVendorContactId` | 委外商联系人 | `subcontract_vendor_contact_id` | String |
| 44 | `tcId` | 币种id | `tc_id` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e |
| 45 | `tcFCExchRateType` | 汇率类型id | `tcfc_exchrate_type` | 1eb63781-e244-464d-b9ba-a7a4e1685295 |
| 46 | `isTaxPrice` | 价格标识 | `is_taxprice` | Boolean |
| 47 | `totalMoneyTC` | 含税总金额 | `totalmoney_tc` | Decimal |
| 48 | `netMoneyTC` | 无税总金额 | `netmoney_tc` | Decimal |
| 49 | `taxTC` | 税额 | `tax_tc` | Decimal |
| 50 | `status` | 单据状态 | `status` | Short |
| 51 | `updateStatus` | 变更状态 | `update_status` | String |
| 52 | `remark` | 备注 | `remark` | String |
| 53 | `isConfirmQuantity` | 允许委外商确认数量 | `is_confirm_quantity` | Boolean |
| 54 | `isConfirmPrice` | 允许委外商确认价格 | `is_confirm_price` | Boolean |
| 55 | `outerCode` | 外部加工单号 | `outer_code` | String |
| 56 | `sellerConfirmDate` | 卖方确认日期 | `seller_confirm_date` | DateTime |
| 57 | `sellerConfirmTime` | 卖方确认时间 | `seller_confirm_time` | DateTime |
| 58 | `sellerConfirmer` | 卖方确认人 | `seller_confirmer` | String |
| 59 | `rejectReason` | 卖方拒绝理由 | `reject_reason` | String |
| 60 | `sellerConfirmerPhone` | 卖方确认人联系方式 | `seller_confirmer_phone` | String |
| 61 | `sellerMemo` | 卖方备注 | `seller_memo` | String |
| 62 | `buyerConfirmDate` | 买方确认日期 | `buyer_confirm_date` | DateTime |
| 63 | `buyerConfirmTime` | 买方确认时间 | `buyer_confirm_time` | DateTime |
| 64 | `buyerConfirmer` | 买方确认人 | `buyer_confirmer` | String |
| 65 | `buyerConfirmerPhone` | 买方确认人联系方式 | `buyer_confirmer_phone` | String |
| 66 | `buyerMemo` | 买方备注 | `buyer_memo` | String |
| 67 | `publishPerson` | 发布人 | `publish_person` | String |
| 68 | `publishTime` | 发布时间 | `publish_time` | DateTime |
| 69 | `publishDate` | 发布日期 | `publish_date` | DateTime |
| 70 | `buyerConfirmerName` | 代确认人姓名 | `buyer_confirmer_name` | String |
| 71 | `buyerConfirmerTime` | 代确认时间 | `buyer_confirmer_time` | DateTime |
| 72 | `vendorAttachmentId` | 委外商附件 | `vendor_attachment_id` | String |
| 73 | `buyerAttachmentId` | 采购商附件 | `buyer_attachment_id` | String |
| 74 | `sourceOrderId` | 来源委外订单id | `source_order_id` | Long |
| 75 | `requireConsult` | 订单是否需要委外 | `require_consult` | Boolean |
| 76 | `consultStatus` | 订单协同状态 | `consult_status` | String |
| 77 | `requireConfirm` | 需要委外商确认 | `require_confirm` | Boolean |
| 78 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 79 | `buyerTenant` | 采购商租户id | `buyer_tenant_id` | String |
| 80 | `tenant` | 租户id | `tenant_id` | String |
| 81 | `pubts` | 时间戳 | `pubts` | DateTime |
| 82 | `modifier` | 修改人 | `modifier` | String |
| 83 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 84 | `creator` | 创建人 | `creator` | String |
| 85 | `orderAttrextItem` | 表头自由自定义项 | `` | f4873039-2020-4b42-8a26-64a358312bd3 |
| 86 | `orderProduct` | 受托加工单产品 | `` | 1570856b-127c-4512-9d6e-a3bfb55162ef |
| 87 | `orderUserdefItem` | 表头固定自定义项 | `` | 45dad874-4f9e-4279-8065-0879e62fc4bf |
| 88 | `synergyOpportunity` | 协同时机 | `synergy_opportunity` | Short |

---

## 关联属性（17个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `tcOrgId` | 收票组织id | `org.func.FinanceOrg` | Service |  |
| 2 | `ctId` | 自定义项特征组id | `osmsu.order.OrderCt` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `departmentId` | 部门id | `aa.baseorg.DeptMV` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `orgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 8 | `tcFCExchRateType` | 汇率类型id | `bd.exchangeRate.ExchangeRateTypeVO` | Service |  |
| 9 | `subcontractVendorId` | 委外商id | `aa.vendor.Vendor` | Service |  |
| 10 | `orderAttrextItem` | 表头自由自定义项 | `osmsu.order.OrderAttrextItem` | None | true |
| 11 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 12 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 13 | `orderProduct` | 受托加工单产品 | `osmsu.order.OrderProduct` | None | true |
| 14 | `tcId` | 币种id | `bd.currencytenant.CurrencyTenantVO` | Service |  |
| 15 | `operatorId` | 业务员id | `bd.staff.Staff` | Service |  |
| 16 | `invoiceVendorId` | 开票委外商id | `aa.vendor.Vendor` | Service |  |
| 17 | `orderUserdefItem` | 表头固定自定义项 | `osmsu.order.OrderUserdefItem` | None | true |
