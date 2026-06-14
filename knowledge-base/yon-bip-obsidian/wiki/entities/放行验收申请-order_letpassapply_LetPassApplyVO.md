---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "order.letpassapply.LetPassApplyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 放行验收申请 (`order.letpassapply.LetPassApplyVO`)

> ycSaleCoor | 物理表：`cpu_letpass_apply`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 放行验收申请 |
| 物理表 | `cpu_letpass_apply` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:30:54.1960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（45个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | String |
| 2 | `code` | 单据编号 | `code` | String |
| 3 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 4 | `transTypeId` | 交易类型id | `transtype_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `transTypeName` | 交易类型 | `transtype_name` | String |
| 6 | `status` | 单据状态 | `status` | String |
| 7 | `businessType` | 业务类型 | `business_type` | Integer |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 10 | `purEnterpriseId` | 采购商租户id | `pur_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `purEnterpriseName` | 采购商租户 | `pur_enterprise_name` | String |
| 12 | `purchaseId` | 采购员id | `purchaseid` | a2f7c666-0173-4f52-bf36-ed780414b2f3 |
| 13 | `purchaseName` | 采购员 | `purchase_name` | String |
| 14 | `supEnterpriseName` | 供应商 | `sup_enterprise_name` | String |
| 15 | `purchaseContact` | 采购员联系方式 | `purchase_contact` | String |
| 16 | `purchaseOrgId` | 采购组织id | `purchase_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 17 | `purchaseOrgName` | 采购组织 | `purchase_org_name` | String |
| 18 | `deptId` | 采购部门id | `dept_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `deptName` | 采购部门 | `dept_name` | String |
| 20 | `supplierId` | 供应商档案id | `supplierid` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 21 | `supplierName` | 供应商档案 | `supplier_name` | String |
| 22 | `supplyPersonId` | 供方联系人id | `supply_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 23 | `supplyPersonName` | 供方联系人 | `supply_person_name` | String |
| 24 | `supplyContact` | 供方联系方式 | `supply_contact` | String |
| 25 | `supFile` | 供应商附件 | `sup_file` | String |
| 26 | `checkAcceptFile` | 验收附件 | `check_accept_file` | String |
| 27 | `billSourceType` | 来源单据类型 | `bill_source_type` | String |
| 28 | `checkAcceptResult` | 验收结论 | `check_accept_result` | String |
| 29 | `checkAcceptPersonId` | 验收人id | `check_accept_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 30 | `checkAcceptPerson` | 验收人 | `check_accept_person` | String |
| 31 | `memo` | 表头备注 | `memo` | String |
| 32 | `creatorId` | 创建人id | `creator_id` | String |
| 33 | `creator` | 创建人 | `creator` | String |
| 34 | `creatorTime` | 创建时间 | `creator_time` | DateTime |
| 35 | `modifierId` | 修改人id | `modifier_id` | String |
| 36 | `modifier` | 修改人 | `modifier` | String |
| 37 | `headerDefineCharacter` | 主表自定义项特征组 | `header_define_character` | f54803e3-d1c2-4eb4-be76-5bb37ff6a94e |
| 38 | `dr` | 删除标识 | `dr` | Integer |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |
| 40 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 41 | `defines` | 放行验收申请主表自定义项 | `` | da55b1d1-e78e-413c-8c4c-438c1b5f2d04 |
| 42 | `details` | 放行验收申请明细 | `` | 2bff5798-f0a5-464f-a7e4-4ae6db802445 |
| 43 | `isFlowCoreBill` | 是否流程核心单据 | `isFlowCoreBill` | Boolean |
| 44 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 45 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `purchaseId` | 采购员id | `cpu-privilege.user.MgrUser` | Service |  |
| 4 | `deptId` | 采购部门id | `org.func.BaseOrg` | Service |  |
| 5 | `headerDefineCharacter` | 主表自定义项特征组 | `order.letpassapply.LetPassApplyDefineCharacter` | None |  |
| 6 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 7 | `purchaseOrgId` | 采购组织id | `org.func.BaseOrg` | Service |  |
| 8 | `purEnterpriseId` | 采购商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `defines` | 放行验收申请主表自定义项 | `order.letpassapply.LetPassApplyVODefine` | None | true |
| 10 | `transTypeId` | 交易类型id | `bd.bill.TransType` | Service |  |
| 11 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `details` | 放行验收申请明细 | `order.letpassapply.LetPassApplyDetailVO` | None | true |
| 13 | `checkAcceptPersonId` | 验收人id | `bd.staff.Staff` | Service |  |
| 14 | `supplyPersonId` | 供方联系人id | `aa.vendor.VendorContacts` | Service |  |
