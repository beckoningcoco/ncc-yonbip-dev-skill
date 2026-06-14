---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.project.AuctionSectionSupplier"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞卖项目邀请供应商 (`saleauction.project.AuctionSectionSupplier`)

> ycAuction | 物理表：`cpu_project_section_supplier`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞卖项目邀请供应商 |
| 物理表 | `cpu_project_section_supplier` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:45:33.3520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（33个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `pubts` | 最后修改时间 | `pubts` | DateTime |
| 3 | `enterpriseId` | 租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `bidProjectId` | 招标方案主表ID | `bid_project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 5 | `bidSectionId` | 标段包 | `bid_section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 6 | `supplierId` | 供应商档案id | `supplier_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 7 | `supplyCode` | 废旧拍卖方编码 | `supply_code` | String |
| 8 | `supplierName` | 废旧拍卖方名称 | `supplier_name` | String |
| 9 | `supplierClassId` | 供应商分类id | `supplier_class_id` | String |
| 10 | `supplierStatus` | 废旧拍卖方状态 | `supplier_status` | String |
| 11 | `invitationStatus` | 邀请状态 | `invitation_status` | String |
| 12 | `suggestReason` | 推荐理由 | `suggest_reason` | String |
| 13 | `supEnterpriseId` | 供应商租户id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 14 | `levelStatus` | 供应商等级 | `level_status` | String |
| 15 | `manageProduct` | 供应商主供产品 | `manage_product` | String |
| 16 | `invitaionStepType` | 邀请阶段类型 | `invitaion_step_type` | String |
| 17 | `disqualification` | 是否取消资格 | `disqualification` | Short |
| 18 | `sourceType` | 推荐供应商来源类型：抽取、指定 | `source_type` | String |
| 19 | `removeReason` | 移除供应商原因 | `remove_reason` | String |
| 20 | `drawCondition` | 抽取供应商的条件 | `draw_condition` | String |
| 21 | `ytenant` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 22 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 23 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 24 | `dr` | 逻辑删除标记 | `dr` | Short |
| 25 | `linkPersonCell` | 联系人电话 | `link_person_cell` | String |
| 26 | `linkPersonId` | 联系人ID | `link_person_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 27 | `linkPersonName` | 联系人名称 | `link_person_name` | String |
| 28 | `linkPersonmail` | 联系人邮箱 | `link_person_email` | String |
| 29 | `payDeposit` | 是否须缴纳保证金 | `pay_deposit` | Integer |
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
| 6 | `bidProjectId` | 招标方案主表ID | `saleauction.project.AuctionProject` | None |  |
| 7 | `bidSectionId` | 标段包 | `saleauction.project.AuctionSection` | None | true |
