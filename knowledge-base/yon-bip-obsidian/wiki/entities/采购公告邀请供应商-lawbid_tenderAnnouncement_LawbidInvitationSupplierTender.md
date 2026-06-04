---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.tenderAnnouncement.LawbidInvitationSupplierTender"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购公告邀请供应商 (`lawbid.tenderAnnouncement.LawbidInvitationSupplierTender`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_invitation_supplier_tender`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购公告邀请供应商 |
| 物理表 | `cpu_bid_invitation_supplier_tender` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:15.7720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:58:02:000

## 依赖接口（5个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 招标公告邀请供应商接口 | `tenderAnnouncement.itf.ITenderInvitationSupplier` | 4 |

---

## 直接属性（34个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `ytenant` | 新租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 5 | `announcementId` | 公告ID | `announcement_id` | e764c131-bca2-44d7-a8af-fe17cb0837f8 |
| 6 | `supplierId` | 供应商档案id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 8 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 9 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 10 | `sectionSupplierId` | 供应商ID | `section_supplier_id` | Long |
| 11 | `supplierClassId` | 供应商分类id | `supplier_class_id` | String |
| 12 | `supplierAddress` | 供应商注册地址 | `supplier_address` | String |
| 13 | `suggestReason` | 供应商推荐理由 | `suggest_reason` | String |
| 14 | `registerFund` | 注册资金 | `register_fund` | Decimal |
| 15 | `levelStatus` | 供应商等级 | `level_status` | String |
| 16 | `manageProduct` | 供应商主供产品 | `manage_product` | String |
| 17 | `invitaionStepType` | 邀请阶段类型 | `invitaion_step_type` | String |
| 18 | `disqualification` | 是否取消资格 | `disqualification` | Short |
| 19 | `payDeposit` | 是否须缴纳保证金 | `pay_deposit` | Integer |
| 20 | `invitationStatus` | 邀请状态 | `invitation_status` | String |
| 21 | `sourceType` | 推荐供应商来源类型:抽取、指定 | `source_type` | String |
| 22 | `removeReason` | 移除供应商原因 | `remove_reason` | String |
| 23 | `drawCondition` | 抽取供应商的条件 | `draw_condition` | String |
| 24 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 25 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 26 | `dr` | 逻辑删除标记 | `dr` | Short |
| 27 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 28 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 29 | `linkPersonCell` | 联系人电话 | `link_person_cell` | String |
| 30 | `linkPersonId` | 联系人ID | `link_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 31 | `linkPersonName` | 联系人名称 | `link_person_name` | String |
| 32 | `linkPersonmail` | 联系人邮箱 | `link_person_email` | String |
| 33 | `supplierClassName` | 供应商分类 | `supplier_class_name` | String |
| 34 | `supplierStatus` | 供应商状态 | `supplier_status` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 新租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `linkPersonId` | 联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 4 | `announcementId` | 公告ID | `lawbid.tenderAnnouncement.LawbidAnnouncementTender` | None | true |
| 5 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `enterpriseId` | 租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
