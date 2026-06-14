---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.announcement.LawbidInvitationSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 采购公告邀请供应商 (`lawbid.announcement.LawbidInvitationSupplier`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_invitation_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 采购公告邀请供应商 |
| 物理表 | `cpu_bid_invitation_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:56:25.5130` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-10-24 23:57:48:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 5 | 邀请供应商接口 | `announcement.itf.IInvitationSupplier` | 403 |
| 6 | lawbidTenant租户相关 | `lawbid.itf.ITenant` | 2 |

---

## 直接属性（35个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `invitationStatus` | 邀请状态 | `invitation_status` | String |
| 2 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 3 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 4 | `tenantId` | tenant租户 | `tenant_id` | String |
| 5 | `supplierStatus` | 供应商状态 | `supplier_status` | String |
| 6 | `announcementId` | 公告ID | `announcement_id` | c8caefa3-7f5b-4560-bb77-c2962503e2df |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `disqualification` | 是否取消资格 | `disqualification` | Short |
| 9 | `dr` | 逻辑删除标记 | `dr` | Short |
| 10 | `drawCondition` | 抽取供应商的条件 | `draw_condition` | String |
| 11 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 12 | `id` | ID | `id` | Long |
| 13 | `invitaionStepType` | 邀请阶段类型 | `invitaion_step_type` | String |
| 14 | `levelStatus` | 供应商等级 | `level_status` | String |
| 15 | `manageProduct` | 供应商主供产品 | `manage_product` | String |
| 16 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `registerFund` | 注册资金 | `register_fund` | Decimal |
| 19 | `removeReason` | 移除供应商原因 | `remove_reason` | String |
| 20 | `sectionSupplierId` | 供应商ID | `section_supplier_id` | Long |
| 21 | `sourceType` | 推荐供应商来源类型 | `source_type` | String |
| 22 | `suggestReason` | 供应商推荐理由 | `suggest_reason` | String |
| 23 | `payDeposit` | 是否须缴纳保证金 | `pay_deposit` | Integer |
| 24 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `supplierAddress` | 供应商注册地址 | `supplier_address` | String |
| 26 | `supplierClassId` | 供应商分类id | `supplier_class_id` | String |
| 27 | `supplierClassName` | 供应商分类 | `supplier_class_name` | String |
| 28 | `supplierId` | 供应商档案id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 29 | `supplierName` | 供应商名称 | `supplier_name` | String |
| 30 | `supplyCode` | 供应商编码 | `supply_code` | String |
| 31 | `ytenant` | 租户ID | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 32 | `linkPersonCell` | 联系人电话 | `link_person_cell` | String |
| 33 | `linkPersonId` | 联系人ID | `link_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 34 | `linkPersonName` | 联系人名称 | `link_person_name` | String |
| 35 | `linkPersonmail` | 联系人邮箱 | `link_person_email` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 2 | `ytenant` | 租户ID | `yht.tenant.YhtTenant` | Service |  |
| 3 | `linkPersonId` | 联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 4 | `announcementId` | 公告ID | `lawbid.announcement.LawbidAnnouncement` | None | true |
| 5 | `supEnterpriseId` | 供应商租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
