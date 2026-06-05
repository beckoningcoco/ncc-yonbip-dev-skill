---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.mrp.UserDefSDDoc"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 用户自定义供需表 (`mr.mrp.UserDefSDDoc`)

> MR | 物理表：`mr_mrp_userdef_sd_doc`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 用户自定义供需表 |
| 物理表 | `mr_mrp_userdef_sd_doc` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:49.5800` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 单据号 |

---

## 直接属性（59个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 2 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 3 | `id` | ID | `id` | Long |
| 4 | `docOrg` | 供需组织 | `doc_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 5 | `sysId` | 系统ID | `sys_id` | String |
| 6 | `sysType` | 系统类型 | `sys_type` | String |
| 7 | `sysTag` | 系统标签 | `sys_tag` | String |
| 8 | `sdType` | 供需类型 | `sd_type` | mr_sd_type_enum |
| 9 | `docTypeCode` | 单据类型编码 | `doc_type_code` | String |
| 10 | `docTypeId` | 供需单据类型 | `doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 11 | `code` | 单据号 | `code` | String |
| 12 | `docId` | 单据 | `doc_id` | Long |
| 13 | `docLineNo` | 单据行号 | `doc_line_no` | String |
| 14 | `docLineId` | 单据行 | `doc_line_id` | Long |
| 15 | `vouchdate` | 单据日期 | `vouchdate` | DateTime |
| 16 | `status` | 单据状态 | `status` | Short |
| 17 | `productId` | 物料 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 18 | `freeCharacteristics` | 自由特征组实体 | `free_characteristics` | b1b97470-0f1a-44e2-a84e-2df25e5e488a |
| 19 | `mainUom` | 主单位 | `main_uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 20 | `docMainQty` | 主单位数量 | `doc_main_qty` | Decimal |
| 21 | `uom` | 单位 | `uom` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 22 | `docQty` | 单据数量 | `doc_qty` | Decimal |
| 23 | `sdDate` | 供需日期 | `sd_date` | DateTime |
| 24 | `bomId` | BOM表体ID | `bom_id` | f494c08f-f466-474b-937a-4773d56696ed |
| 25 | `invOrgId` | 入库组织 | `inv_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 26 | `departmentId` | 部门ID | `department_id` | 8e8fa65a-f8d9-454d-a8f8-4b7af543cdd5 |
| 27 | `warehouseId` | 仓库 | `warehouse_id` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 28 | `vendorId` | 供应商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 29 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 30 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 31 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 32 | `reserveid` | 跟踪线索Id | `reserveid` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 33 | `priority` | 优先级 | `priority` | Long |
| 34 | `remark` | 备注 | `remark` | String |
| 35 | `userDefineCharacter` | 自定义项特征实体 | `user_define_character` | 96f7a2e3-e457-4d6b-8170-ed917bf5931e |
| 36 | `datasub` | 应用来源 | `datasub` | String |
| 37 | `dr` | 逻辑删除标记 | `dr` | Short |
| 38 | `sourceType` | 来源单据类型编码 | `source_type` | DocTypeEnum |
| 39 | `srcDocTypeId` | 来源单据类型 | `src_doc_type_id` | b1ac8af8-72c2-4b2d-939f-9d7e22bd2f9c |
| 40 | `srcDocNo` | 来源单据号 | `src_doc_no` | String |
| 41 | `srcDocId` | 来源单据 | `src_doc_id` | Long |
| 42 | `srcDocLineNo` | 来源单据行号 | `src_doc_line_no` | String |
| 43 | `srcDocLineId` | 来源单据行 | `src_doc_line_id` | Long |
| 44 | `srcDocDate` | 来源单据日期 | `src_doc_date` | DateTime |
| 45 | `rootDocTypeCode` | 源头单据类型编码 | `root_doc_type_code` | String |
| 46 | `rootDocNo` | 源头单据号 | `root_doc_no` | String |
| 47 | `rootDocId` | 源头单据 | `root_doc_id` | Long |
| 48 | `rootDocLineNo` | 源头单据行号 | `root_doc_line_no` | String |
| 49 | `rootDocLineId` | 源头单据行id | `root_doc_line_id` | Long |
| 50 | `creator` | 创建人名称 | `creator` | String |
| 51 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 52 | `createDate` | 创建日期 | `create_date` | Date |
| 53 | `createTime` | 创建时间 | `create_time` | DateTime |
| 54 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 55 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 56 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 57 | `modifier` | 修改人名称 | `modifier` | String |
| 58 | `tplid` | 模板id | `tplid` | Long |
| 59 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（21个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | BOM表体ID | `ed.bom.Bom` | Service |  |
| 2 | `docOrg` | 供需组织 | `org.func.BaseOrg` | Service |  |
| 3 | `productId` | 物料 | `pc.product.Product` | Service |  |
| 4 | `userDefineCharacter` | 自定义项特征实体 | `mr.mrp.UserDefSDDocDCT` | None |  |
| 5 | `reserveid` | 跟踪线索Id | `st.reservation.Reservation` | Service |  |
| 6 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `departmentId` | 部门ID | `aa.baseorg.DeptMV` | Service |  |
| 9 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 10 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 11 | `vendorId` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 12 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 13 | `srcDocTypeId` | 来源单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 14 | `mainUom` | 主单位 | `pc.unit.Unit` | Service |  |
| 15 | `uom` | 单位 | `pc.unit.Unit` | Service |  |
| 16 | `freeCharacteristics` | 自由特征组实体 | `mr.mrp.UserDefSDDocFCT` | None |  |
| 17 | `warehouseId` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 18 | `docTypeId` | 供需单据类型 | `mr.sdDocType.SDDocType` | None |  |
| 19 | `invOrgId` | 入库组织 | `org.func.BaseOrg` | Service |  |
| 20 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
| 21 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
