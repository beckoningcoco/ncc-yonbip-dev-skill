---
tags: ["BIP", "元数据", "数据字典", "PO", "po.replenishdemand.ReplenishDemandVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 补货需求主表 (`po.replenishdemand.ReplenishDemandVO`)

> PO | 物理表：`po_replenish_demand`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 补货需求主表 |
| 物理表 | `po_replenish_demand` |
| 数据库 schema | `productionorder` |
| 所属应用 | `PO` |
| 构建时间 | `2026-06-05 09:33:08.2160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据编号 |

---

## 直接属性（47个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `defineCharacter` | 自定义项特征属性组 | `demand_define_ct` | 3d7d841b-6753-468e-ab09-4f06d564a7a0 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 工厂 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 4 | `warehouseId` | 仓库Id | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `transTypeId` | 交易类型 | `trans_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 7 | `vouchdate` | 单据日期 | `vouchdate` | Date |
| 8 | `code` | 单据编号 | `code` | String |
| 9 | `barCode` | 单据条码 | `bar_code` | String |
| 10 | `status` | 单据状态 | `status` | Short |
| 11 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 12 | `verifystate` | 审批状态 | `verifystate` | Short |
| 13 | `outOrgId` | 调出组织id | `out_org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 14 | `printCount` | 打印次数 | `printCount` | Integer |
| 15 | `outWarehouseId` | 调出仓库id | `out_warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 16 | `returncount` | 退回次数 | `returncount` | Short |
| 17 | `auditDate` | 审核日期 | `audit_date` | Date |
| 18 | `closeDate` | 关闭日期 | `close_Date` | Date |
| 19 | `remark` | 备注 | `remark` | String |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `creator` | 创建人 | `creator` | String |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `modifierId` | 最后修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 26 | `modifier` | 最后修改人 | `modifier` | String |
| 27 | `modifyTime` | 最后修改时间 | `modify_time` | DateTime |
| 28 | `modifyDate` | 最后修改日期 | `modify_date` | Date |
| 29 | `auditorId` | 审核人id | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `auditor` | 审核人 | `auditor` | String |
| 31 | `auditTime` | 审核时间 | `audit_time` | DateTime |
| 32 | `closerId` | 关闭人id | `closerId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 33 | `closer` | 关闭人 | `closer` | String |
| 34 | `closeTime` | 关闭时间 | `close_time` | DateTime |
| 35 | `bizFlow` | 流程ID | `bizFlowId` | 58dd3dad-7eb7-47ea-a5b1-1f89d1709528 |
| 36 | `isFlowCoreBill` | 是否核心单据 | `isFlowCoreBill` | Boolean |
| 37 | `supplier` | 供应商 | `supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 38 | `tplid` | 模板id | `tplid` | Long |
| 39 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 40 | `closeReasonId` | 关闭原因 | `close_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 41 | `customer` | 客户 | `customer` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 42 | `replenishDemandDetail` | 补货需求子表 | `` | d47fea49-98ab-4502-a728-a23e7d28011f |
| 43 | `replenishDemandUserdefItem` | 补货需求头自定义项 | `` | 3b93565b-cad0-4e51-87fb-b726c7f2c260 |
| 44 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 45 | `submitter` | 提交人 | `submitter` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 46 | `withdrawTime` | 撤回提交时间 | `withdraw_time` | DateTime |
| 47 | `withdrawpp` | 撤回提交的人 | `withdrawpp` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |

---

## 关联属性（20个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `submitter` | 提交人 | `base.user.BipUser` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 4 | `modifierId` | 最后修改人id | `base.user.User` | Service |  |
| 5 | `bizFlow` | 流程ID | `bf.bizflow.BusinessFlow` | Service |  |
| 6 | `outOrgId` | 调出组织id | `aa.baseorg.OrgMV` | Service |  |
| 7 | `orgId` | 工厂 | `aa.baseorg.OrgMV` | Service |  |
| 8 | `outWarehouseId` | 调出仓库id | `aa.warehouse.Warehouse` | Service |  |
| 9 | `auditorId` | 审核人id | `base.user.User` | Service |  |
| 10 | `withdrawpp` | 撤回提交的人 | `base.user.BipUser` | Service |  |
| 11 | `replenishDemandDetail` | 补货需求子表 | `po.replenishdemand.ReplenishDemandDetailVO` | None | true |
| 12 | `warehouseId` | 仓库Id | `aa.warehouse.Warehouse` | Service |  |
| 13 | `replenishDemandUserdefItem` | 补货需求头自定义项 | `po.replenishdemand.ReplenishDemandUserdefItem` | None | true |
| 14 | `closerId` | 关闭人id | `base.user.User` | Service |  |
| 15 | `supplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 16 | `transTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 17 | `defineCharacter` | 自定义项特征属性组 | `po.replenishdemand.DemandDefineCharacter` | None |  |
| 18 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 19 | `closeReasonId` | 关闭原因 | `aa.reason.Reason` | Service |  |
| 20 | `customer` | 客户 | `aa.merchant.Merchant` | Service |  |
