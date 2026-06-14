---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.announcement.AuctionInvitationSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 邀请供应商 (`auction.announcement.AuctionInvitationSupplier`)

> ycSouringAuction | 物理表：`cpu_bid_invitation_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 邀请供应商 |
| 物理表 | `cpu_bid_invitation_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:53.6690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `announcementId` | 公告ID | `announcement_id` | 2c5fa673-819e-4dd0-93a3-c1af081ef94a |
| 6 | `supplierId` | 供应商档案id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `supplyCode` | 竞拍方编码 | `supply_code` | String |
| 8 | `supplierName` | 竞拍方名称 | `supplier_name` | String |
| 9 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 10 | `supplierClassName` | 供应商名称 | `supplier_class_name` | String |
| 11 | `sectionSupplierId` | 供应商ID | `section_supplier_id` | Long |
| 12 | `supplierClassId` | 竞拍方分类id | `supplier_class_id` | String |
| 13 | `supplierAddress` | 供应商注册地址 | `supplier_address` | String |
| 14 | `suggestReason` | 竞拍方推荐理由 | `suggest_reason` | String |
| 15 | `registerFund` | 注册资金 | `register_fund` | Decimal |
| 16 | `levelStatus` | 供应商等级 | `level_status` | String |
| 17 | `manageProduct` | 供应商主供产品 | `manage_product` | String |
| 18 | `invitaionStepType` | 邀请阶段类型 | `invitaion_step_type` | String |
| 19 | `disqualification` | 是否取消资格 | `disqualification` | Short |
| 20 | `supplierStatus` | 竞拍方状态 | `supplier_status` | String |
| 21 | `invitationStatus` | 邀请状态 | `invitation_status` | String |
| 22 | `payDeposit` | 是否须缴纳保证金 | `pay_deposit` | Integer |
| 23 | `sourceType` | 推荐供应商来源类型:抽取、指定 | `source_type` | String |
| 24 | `removeReason` | 移除供应商原因 | `remove_reason` | String |
| 25 | `drawCondition` | 抽取供应商的条件 | `draw_condition` | String |
| 26 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 27 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 28 | `dr` | 逻辑删除标记 | `dr` | Short |
| 29 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 30 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 31 | `linkPersonCell` | 联系人电话 | `link_person_cell` | String |
| 32 | `linkPersonId` | 联系人ID | `link_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 33 | `linkPersonName` | 联系人名称 | `link_person_name` | String |
| 34 | `linkPersonmail` | 联系人邮箱 | `link_person_email` | String |
| 35 | `tenantId` | tenant租户 | `tenant_id` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `linkPersonId` | 联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 4 | `announcementId` | 公告ID | `auction.announcement.AuctionAnnouncement` | None | true |
| 5 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
