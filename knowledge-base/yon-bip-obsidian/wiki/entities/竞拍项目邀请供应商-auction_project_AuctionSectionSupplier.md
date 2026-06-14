---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionSectionSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍项目邀请供应商 (`auction.project.AuctionSectionSupplier`)

> ycSouringAuction | 物理表：`cpu_project_section_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍项目邀请供应商 |
| 物理表 | `cpu_project_section_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:08.8300` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `id` | id | `id` | Long |
| 4 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 5 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 6 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 7 | `bidSectionId` | 标段包 | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 8 | `supplierId` | 供应商档案id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 9 | `supplyCode` | 竞拍方编码 | `supply_code` | String |
| 10 | `supplierName` | 竞拍方名称 | `supplier_name` | String |
| 11 | `payDeposit` | 是否须缴纳保证金 | `pay_deposit` | Integer |
| 12 | `supplierClassId` | 供应商分类id | `supplier_class_id` | String |
| 13 | `supplierStatus` | 竞拍方状态 | `supplier_status` | String |
| 14 | `invitationStatus` | 邀请状态 | `invitation_status` | String |
| 15 | `suggestReason` | 推荐理由 | `suggest_reason` | String |
| 16 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 17 | `levelStatus` | 供应商等级 | `level_status` | String |
| 18 | `manageProduct` | 供应商主供产品 | `manage_product` | String |
| 19 | `invitaionStepType` | 邀请阶段类型 | `invitaion_step_type` | String |
| 20 | `disqualification` | 是否取消资格 | `disqualification` | Short |
| 21 | `sourceType` | 推荐供应商来源类型:抽取、指定 | `source_type` | String |
| 22 | `removeReason` | 移除供应商原因 | `remove_reason` | String |
| 23 | `drawCondition` | 抽取供应商的条件 | `draw_condition` | String |
| 24 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 25 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 26 | `linkPersonCell` | 联系人电话 | `link_person_cell` | String |
| 27 | `linkPersonId` | 联系人ID | `link_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 28 | `linkPersonName` | 联系人名称 | `link_person_name` | String |
| 29 | `linkPersonmail` | 联系人邮箱 | `link_person_email` | String |
| 30 | `registerFund` | 注册资金 | `register_fund` | Decimal |
| 31 | `supplierAddress` | 供应商注册地址 | `supplier_address` | String |
| 32 | `supplierClassName` | 供应商名称 | `supplier_class_name` | String |
| 33 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | ytenantId | `yht.tenant.YhtTenant` | Service |  |
| 3 | `linkPersonId` | 联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 4 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 5 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `bidProjectId` | 招标方案主表ID | `auction.project.AuctionProject` | None |  |
| 7 | `bidSectionId` | 标段包 | `auction.project.AuctionSection` | None | true |
