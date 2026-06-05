---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckRecord"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验记录 (`QMSDFM.dfmCheck.QmsDfmCheckRecord`)

> QIC | 物理表：`qms_dfm_check_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验记录 |
| 物理表 | `qms_dfm_check_record` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:42:25.2100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 检验记录主键 |
| 编码 | `bill_code` | String | 检验单号 |

---

## 直接属性（119个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | 检验记录主键 | `id` | Long |
| 3 | `pkOrg` | 质检组织 | `pk_org` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `billCode` | 检验单号 | `bill_code` | String |
| 5 | `checkType` | 检验类型 | `check_type` | String |
| 6 | `billSourceNum` | 请检来源数量 | `bill_source_num` | Decimal |
| 7 | `checkNum` | 检验件数 | `check_num` | Decimal |
| 8 | `checkUnit` | 检验单位 | `check_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 9 | `coord` | 是否协同 | `coord` | Boolean |
| 10 | `coordStatus` | 协同状态 | `coord_status` | Short |
| 11 | `inspect_dept` | 检验部门 | `inspect_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 12 | `inspector` | 检验员 | `inspector` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 13 | `orderbilltype` | 请检源头单据类型 | `orderbilltype` | String |
| 14 | `pk_inspectionplan` | 检验方案 | `pk_inspectionplan` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 15 | `pk_test` | 检测依据 | `pk_test` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 16 | `externalSourceId` | 外部来源ID | `externalSourceId` | String |
| 17 | `projectId` | 项目 | `project_id` | b1e7cbf6-094a-4200-b451-36bfa3ac3ff4 |
| 18 | `isExternalSource` | 是否外部请检 | `is_external_source` | Short |
| 19 | `checkPlanDetailId` | 检验方案主表id | `check_plan_detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 20 | `wbs` | WBS | `wbs` | 145cc7d2-79cf-4f3a-934c-c03b46d0fd42 |
| 21 | `activity` | 活动 | `activity` | b4a90beb-49ed-4301-b12e-9221d0d12fd1 |
| 22 | `isCheckCompleted` | 检验完成 | `isCheckCompleted` | Boolean |
| 23 | `define30` | 自定义项30 | `define30` | String |
| 24 | `define27` | 自定义项27 | `define27` | String |
| 25 | `define28` | 自定义项28 | `define28` | String |
| 26 | `define29` | 自定义项29 | `define29` | String |
| 27 | `checkRecordSource` | 检验结果来源 | `checkRecordSource` | Short |
| 28 | `define2` | 自定义项2 | `define2` | String |
| 29 | `define1` | 自定义项1 | `define1` | String |
| 30 | `define12` | 自定义项12 | `define12` | String |
| 31 | `define9` | 自定义项9 | `define9` | String |
| 32 | `define13` | 自定义项13 | `define13` | String |
| 33 | `define8` | 自定义项8 | `define8` | String |
| 34 | `define14` | 自定义项14 | `define14` | String |
| 35 | `define7` | 自定义项7 | `define7` | String |
| 36 | `define15` | 自定义项15 | `define15` | String |
| 37 | `define6` | 自定义项6 | `define6` | String |
| 38 | `define5` | 自定义项5 | `define5` | String |
| 39 | `define4` | 自定义项4 | `define4` | String |
| 40 | `define10` | 自定义项10 | `define10` | String |
| 41 | `define3` | 自定义项3 | `define3` | String |
| 42 | `define11` | 自定义项11 | `define11` | String |
| 43 | `define23` | 自定义项23 | `define23` | String |
| 44 | `define24` | 自定义项24 | `define24` | String |
| 45 | `define25` | 自定义项25 | `define25` | String |
| 46 | `define26` | 自定义项26 | `define26` | String |
| 47 | `define20` | 自定义项20 | `define20` | String |
| 48 | `define21` | 自定义项21 | `define21` | String |
| 49 | `define22` | 自定义项22 | `define22` | String |
| 50 | `define16` | 自定义项16 | `define16` | String |
| 51 | `define17` | 自定义项17 | `define17` | String |
| 52 | `define18` | 自定义项18 | `define18` | String |
| 53 | `define19` | 自定义项19 | `define19` | String |
| 54 | `publishDate` | 发布时间 | `publish_date` | DateTime |
| 55 | `publishUser` | 发布人 | `publish_user` | String |
| 56 | `purchaseOrg` | 采购/委外组织 | `purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 57 | `purchaseRemark` | 供应商反馈 | `purchase_remark` | String |
| 58 | `purchaseUser` | 采购/委外业务员 | `purchase_user` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 59 | `qualifiedNum` | 合格数量 | `qualified_num` | Decimal |
| 60 | `record_definect` | 检验记录自定义项特征 | `record_definect` | 7d5b76ea-7670-4370-a234-3d8e8cd6bbfd |
| 61 | `rectification` | 是否整改 | `rectification` | Boolean |
| 62 | `samplingNum` | 抽样件数 | `sampling_num` | Decimal |
| 63 | `samplingQuaility` | 抽样数量 | `sampling_quaility` | Decimal |
| 64 | `supplierContacts` | 供应商联系人 | `supplier_contacts` | String |
| 65 | `supplierContactsId` | 供应商联系人ID | `supplier_contacts_id` | b94fa77c-2f2b-464c-96fb-d028543825ee |
| 66 | `unqualifiedNum` | 不合格数量 | `unqualified_num` | Decimal |
| 67 | `vchangerate` | 换算率 | `vchangerate` | String |
| 68 | `vendorAuth` | 供应商权限 | `pk_supplier` | 4267e0aa-1efb-4b5e-b921-25dca8392171 |
| 69 | `createDate` | 创建日期 | `create_date` | Date |
| 70 | `dr` | 逻辑删除标记 | `dr` | Short |
| 71 | `freect_h` | 自由项特征组 | `freect_h` | 7b6a90e5-b6b6-4312-90f1-314834d5fbef |
| 72 | `groupTaskKey` | 分组任务KEY | `groupTaskKey` | String |
| 73 | `inspectvalueUnit` | 计量单位 | `inspectvalue_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 74 | `makeRuleCode` | 生单规则编号 | `makerule_code` | String |
| 75 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 76 | `pkMaterial` | 物料 | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 77 | `pkMaterialsku` | 物料sku | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 78 | `pkSupplier` | 供应商 | `pk_supplier` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 79 | `pk_applycheckorg` | 请检组织 | `pk_applycheckorg` | 598482c6-0ad7-493a-b944-5493a8b9fb8e |
| 80 | `productAuth` | 物料权限 | `pk_material` | 19097936-a02d-4ea4-8fa2-d3c7cb555913 |
| 81 | `pubts` | 时间戳 | `pubts` | DateTime |
| 82 | `source` | 上游单据类型 | `source` | String |
| 83 | `sourceMainPubts` | 时间戳 | `sourceMainPubts` | DateTime |
| 84 | `sourceautoid` | 上游单据子表id | `sourceautoid` | Long |
| 85 | `sourceid` | 上游单据主表id | `sourceid` | Long |
| 86 | `sourcerowno` | 请检来源单据行号 | `sourcerowno` | String |
| 87 | `tenant` | 租户ID | `tenant_id` | String |
| 88 | `upcode` | 上游单据号 | `upcode` | String |
| 89 | `vorderrowId` | 请检源头单据行id | `vorderrowId` | String |
| 90 | `vorderrowno` | 请检源头单据行号 | `vorderrowno` | String |
| 91 | `pk_batchcode` | 批次号 | `pk_batchcode` | String |
| 92 | `inspectastNum` | 检验数量 | `inspectast_num` | Decimal |
| 93 | `inspectDate` | 检验日期 | `inspect_date` | Date |
| 94 | `combineCheck` | 合并检验 | `combine_check` | Boolean |
| 95 | `applyBilltype` | 请检来源单据类型 | `apply_bill_type` | String |
| 96 | `applyBillNo` | 请检来源单据号 | `apply_bill_no` | String |
| 97 | `busDate` | 业务日期 | `bus_date` | Date |
| 98 | `recheck` | 复检 | `recheck` | Boolean |
| 99 | `qicSourceBillType` | 来源单据类型 | `qic_source_bill_type` | String |
| 100 | `qicSourceBillId` | 来源单据id | `qic_source_billid` | String |
| 101 | `qicSourceBillNo` | 来源单据号 | `qic_source_billno` | String |
| 102 | `pkApplyBillId` | 请检来源单据id | `pk_apply_billId` | String |
| 103 | `pkSourceBillRowId` | 请检来源单据行id | `pk_source_bill_rowId` | String |
| 104 | `pkApplySourceId` | 请检源头单据id | `pk_apply_source_id` | String |
| 105 | `applySourceNo` | 请检源头单据号 | `apply_source_no` | String |
| 106 | `upstream_id` | 上游id | `upstream_id` | String |
| 107 | `create_method` | 创建方式 | `create_method` | MethodType |
| 108 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 109 | `creator` | 创建人 | `creator` | String |
| 110 | `createTime` | 创建时间 | `create_time` | DateTime |
| 111 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 112 | `modifier` | 修改人 | `modifier` | String |
| 113 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 114 | `QmsDfmCheckRecordExpinfoList` | 检验记录扩展信息 | `` | 42df6ba8-3bb9-4700-9a47-1e43eb42d123 |
| 115 | `qmsDfmCheckInfo` | 检验信息 | `` | 0fa66411-6b81-45b0-b20d-e1d77fa8aa57 |
| 116 | `qmsDfmCheckLog` | 检验协同日志 | `` | cd360694-2651-4178-9cfe-02a73f7e4283 |
| 117 | `qmsDfmCheckResult` | 检验记录处理结果明细 | `` | 2a6cf07e-35bd-4452-b1f2-41a012211384 |
| 118 | `qmsDfmCheckSimple` | 样本记录 | `` | aab3af91-38c2-4723-af35-099e734a53e8 |
| 119 | `qmsDfmCheckSource` | 检验记录源单信息 | `` | 2be54fc7-ea67-41b6-b698-6258fc0254fc |

---

## 关联属性（31个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `activity` | 活动 | `pgrm.projecttask.ProjectScheduleTask` | Service |  |
| 2 | `pk_inspectionplan` | 检验方案 | `QMSDFM.inspectionPlan.inspectionPlan` | None |  |
| 3 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 5 | `qmsDfmCheckLog` | 检验协同日志 | `QMSDFM.dfmCheck.QmsDfmCheckCoordLog` | None | true |
| 6 | `wbs` | WBS | `BGDM.wbs.wbs_doc` | Service |  |
| 7 | `vendorAuth` | 供应商权限 | `pb.dataauth.VendorDataAuth` | None |  |
| 8 | `qmsDfmCheckInfo` | 检验信息 | `QMSDFM.dfmCheck.QmsDfmCheckInfo` | None | true |
| 9 | `qmsDfmCheckResult` | 检验记录处理结果明细 | `QMSDFM.dfmCheck.QmsDfmCheckResult` | None | true |
| 10 | `qmsDfmCheckSource` | 检验记录源单信息 | `QMSDFM.dfmCheck.QmsDfmCheckSource` | None | true |
| 11 | `freect_h` | 自由项特征组 | `QMSDFM.dfmCheck.QmsDfmCheckFreeitem` | None |  |
| 12 | `pkSupplier` | 供应商 | `aa.vendor.Vendor` | Service |  |
| 13 | `pk_test` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | None |  |
| 14 | `checkPlanDetailId` | 检验方案主表id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None |  |
| 15 | `inspect_dept` | 检验部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 16 | `pkMaterialsku` | 物料sku | `pc.product.ProductSKU` | Service |  |
| 17 | `purchaseOrg` | 采购/委外组织 | `org.func.PurchaseOrg` | Service |  |
| 18 | `QmsDfmCheckRecordExpinfoList` | 检验记录扩展信息 | `QMSDFM.dfmCheck.QmsDfmCheckRecordExpinfo` | None | true |
| 19 | `qmsDfmCheckSimple` | 样本记录 | `QMSDFM.dfmCheck.QmsDfmCheckSimple` | None | true |
| 20 | `supplierContactsId` | 供应商联系人ID | `aa.vendor.VendorContacts` | Service |  |
| 21 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 22 | `pk_applycheckorg` | 请检组织 | `bd.adminOrg.InventoryOrgVO` | Service |  |
| 23 | `inspector` | 检验员 | `bd.staff.Staff` | Service |  |
| 24 | `pkMaterial` | 物料 | `pc.product.Product` | Service |  |
| 25 | `checkUnit` | 检验单位 | `pc.unit.Unit` | Service |  |
| 26 | `record_definect` | 检验记录自定义项特征 | `QMSDFM.dfmCheck.CheckRecordDefineCharacter` | None |  |
| 27 | `pkOrg` | 质检组织 | `org.func.QualityOrg` | Service |  |
| 28 | `productAuth` | 物料权限 | `pb.dataauth.ProductDataAuth` | None |  |
| 29 | `purchaseUser` | 采购/委外业务员 | `bd.staff.Staff` | Service |  |
| 30 | `inspectvalueUnit` | 计量单位 | `pc.unit.Unit` | Service |  |
| 31 | `projectId` | 项目 | `bd.project.ProjectVO` | Service |  |
