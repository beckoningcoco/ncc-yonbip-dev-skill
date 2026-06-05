---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.equip.EquipServiceInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 设备服务信息 (`pes.equip.EquipServiceInfo`)

> IMP_PES | 物理表：`sms_sis`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 设备服务信息 |
| 物理表 | `sms_sis` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:17:22.5990` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（71个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `equipServiceInfoDetailList` | 设备服务信息详情 | `` | 5b4b5a42-0d80-4743-be4e-3e5537ec38b1 |
| 2 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 3 | `equipmentId` | 设备ID | `equipment_id` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 4 | `equipmentCode` | 设备编码 | `equipment_code` | String |
| 5 | `equipmentName` | 设备名称 | `equipment_name` | String |
| 6 | `equCategoryId` | 设备类别 | `equ_categoryId` | 2cc09807-e5f0-4c71-a7ac-c4f932b8bdb7 |
| 7 | `equCategoryName` | 设备类别名称 | `equ_categoryName` | String |
| 8 | `equipmentUsedStatus` | 设备状态 | `equipment_used_status` | 6c5e29e8-10de-4a61-88cd-7f97ca7608d0 |
| 9 | `productId` | 产品 | `product_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 10 | `saleContract` | 销售合同 | `sale_contract` | String |
| 11 | `manufactureDate` | 生产日期 | `manufacture_date` | Date |
| 12 | `purchaseDate` | 采购日期 | `purchase_date` | Date |
| 13 | `deliveryDate` | 发货日期 | `delivery_date` | String |
| 14 | `acceptDate` | 验收日期 | `accept_date` | String |
| 15 | `slcId` | 质保期计算规则 | `slc_id` | af0d9ff5-5188-4b43-acc1-c597e586f093 |
| 16 | `qaDate` | 质保到期日 | `qa_date` | String |
| 17 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 18 | `customFactory` | 客户工厂 | `custom_factory` | cfde0823-db21-43ef-94cd-0b511e013ba6 |
| 19 | `customerContactName` | 客户联系人 | `customer_contactName` | String |
| 20 | `ymsencCustomerContactPhone` | 客户联系人电话 | `ymsenc_customer_contactPhone` | String |
| 21 | `customerContactPhone` | 客户联系人电话 | `customer_contactPhone` | String |
| 22 | `regionID` | 所属区域 | `region_ID` | 95577e23-979f-4f09-a629-61fea93e576d |
| 23 | `address` | 安装地址 | `address` | String |
| 24 | `log` | 经度 | `log` | String |
| 25 | `lot` | 纬度 | `lot` | String |
| 26 | `country` | 国家 | `country` | String |
| 27 | `province` | 省市 | `province` | String |
| 28 | `city` | 市区 | `city` | String |
| 29 | `district` | 县 | `district` | String |
| 30 | `street` | 街道 | `street` | String |
| 31 | `memo` | 备注 | `memo` | String |
| 32 | `installCount` | 安装次数 | `install_count` | Short |
| 33 | `installStatus` | 安装状态 | `install_status` | String |
| 34 | `latestInstallTime` | 最近安装时间 | `latest_install_time` | String |
| 35 | `debugCount` | 调试次数 | `debug_count` | Short |
| 36 | `debugStatus` | 调试状态 | `debug_status` | String |
| 37 | `latestDebugTime` | 最近调试时间 | `latest_debug_time` | String |
| 38 | `acceptanceCount` | 验收次数 | `acceptance_count` | Short |
| 39 | `acceptanceStatus` | 验收状态 | `acceptance_status` | String |
| 40 | `latestAcceptanceTime` | 最近验收时间 | `latest_acceptance_time` | String |
| 41 | `salesNo` | 销售订单编号 | `sales_no` | String |
| 42 | `salesOutNo` | 销售出库单编号 | `sales_out_no` | String |
| 43 | `bomId` | 设备BOM | `bomId` | 86c1accf-1b85-4301-b35f-0980b4d7a9d5 |
| 44 | `sisDefineCharacter` | 自定义项特征 | `sis_define_character` | d79de060-a1c1-4b77-b703-445f7d4a6be6 |
| 45 | `srcId` | 来源ID | `src_id` | String |
| 46 | `srcType` | 来源类型 | `src_type` | String |
| 47 | `taskPlanId` | 安装计划 | `task_plan_id` | c20e1a0b-799a-419e-997d-d8c9c59a4b77 |
| 48 | `isEffective` | 启用状态 | `is_effective` | Short |
| 49 | `attachmentId` | 附件Id | `attachmentId` | String |
| 50 | `id` | ID | `id` | String |
| 51 | `irId` | 标识解析id | `ir_id` | String |
| 52 | `dr` | DR | `dr` | Short |
| 53 | `serviceOrgId` | 服务组织 | `service_org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 54 | `vendorId` | 服务商 | `vendor_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 55 | `posId` | 服务点 | `pos_id` | c685b8cd-eb64-47a1-b5a2-fcf3296b3c7d |
| 56 | `serviceTeamId` | 服务团队 | `serviceTeam_id` | 7b7859d5-26ea-433e-8fee-007cb85c64d7 |
| 57 | `serverPersonId` | 服务人员 | `server_person_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 58 | `serverContact` | 服务人员电话 | `server_contact` | String |
| 59 | `deptId` | 服务部门 | `dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 60 | `createTime` | 创建时间 | `create_time` | DateTime |
| 61 | `createDate` | 创建日期 | `create_date` | Date |
| 62 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 63 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 64 | `creator` | 创建人名称 | `creator` | String |
| 65 | `modifier` | 修改人名称 | `modifier` | String |
| 66 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 67 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 68 | `tenant` | 租户ID | `tenant_id` | String |
| 69 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 70 | `pubts` | 时间戳 | `pubts` | DateTime |
| 71 | `equipServiceInfoRecordList` | 设备服务记录 | `` | d7751ecc-298c-45ce-bf8f-9a8b77159803 |

---

## 关联属性（23个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bomId` | 设备BOM | `pes.equipBom.EquipBOMInfo` | None |  |
| 2 | `slcId` | 质保期计算规则 | `PES.slc.SlcVO` | None |  |
| 3 | `serverPersonId` | 服务人员 | `bd.staff.Staff` | Service |  |
| 4 | `productId` | 产品 | `pc.product.Product` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `deptId` | 服务部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `vendorId` | 服务商 | `aa.vendor.Vendor` | Service |  |
| 10 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 11 | `equipmentId` | 设备ID | `aim.equip.EquipHeadVO` | Service |  |
| 12 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
| 13 | `equipServiceInfoRecordList` | 设备服务记录 | `pes.equip.EquipServiceInfoRecord` | None | true |
| 14 | `sisDefineCharacter` | 自定义项特征 | `pes.equip.EquipServiceInfoDefineCharacter` | None |  |
| 15 | `posId` | 服务点 | `pes.pos.Pos` | None |  |
| 16 | `taskPlanId` | 安装计划 | `pes.installPlan.InstallPlan` | None |  |
| 17 | `regionID` | 所属区域 | `bd.region.BaseRegionVO` | Service |  |
| 18 | `customFactory` | 客户工厂 | `pes.customFactory.CustomFactory` | None |  |
| 19 | `equCategoryId` | 设备类别 | `ampub.ambase.CategoryVO` | Service |  |
| 20 | `equipServiceInfoDetailList` | 设备服务信息详情 | `pes.equip.EquipServiceInfoDetail` | None | true |
| 21 | `serviceOrgId` | 服务组织 | `org.func.BaseOrg` | Service |  |
| 22 | `equipmentUsedStatus` | 设备状态 | `ampub.equipbase.StatusVO` | Service |  |
| 23 | `serviceTeamId` | 服务团队 | `pes.serviceTeam.serviceTeam` | None |  |
