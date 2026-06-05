---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.dfmCheck.QmsDfmCheckResult"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验记录处理结果明细 (`QMSDFM.dfmCheck.QmsDfmCheckResult`)

> QIC | 物理表：`qms_dfm_check_result`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验记录处理结果明细 |
| 物理表 | `qms_dfm_check_result` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:25.6480` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（178个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | String |
| 3 | `pk_org` | 质检组织 | `pk_org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 4 | `pkDfmCheckRecord` | 检验记录id | `check_record_id` | 631cb01f-3080-4010-9744-e5b5bea34d6a |
| 5 | `pk_initmaterial` | 初始物料ID | `pk_initmaterial` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 6 | `check_sourcetype` | 请检来源单据类型 | `check_sourcetype` | String |
| 7 | `check_sourcetnum` | 请检来源单据号 | `check_sourcetnum` | String |
| 8 | `check_sourcetindex` | 请检来源单据行号 | `check_sourcetindex` | String |
| 9 | `check_sourcetID` | 请检来源单据ID | `check_sourcetID` | String |
| 10 | `check_sourcetrowID` | 请检来源单据行ID | `check_sourcetrowID` | String |
| 11 | `insres_sourcetype` | 检验结果来源单据类型 | `insres_sourcetype` | String |
| 12 | `main_num` | 主数量 | `main_num` | Decimal |
| 13 | `pk_unit` | 主单位 | `pk_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 14 | `is_qualified` | 是否合格 | `is_qualified` | Boolean |
| 15 | `treat_method` | 处理方式 | `treat_method` | 4406ea9f-9ed2-49d2-af46-8af10cca2b1a |
| 16 | `pk_inventorystate` | 库存状态 | `pk_inventorystate` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 17 | `emegerelease_state` | 紧急放行单状态 | `emegerelease_state` | String |
| 18 | `insres_sourceID` | 检验结果来源单据ID | `insres_sourceID` | String |
| 19 | `insres_sourceBodyID` | 检验结果来源单据子表ID | `insres_sourceBodyID` | String |
| 20 | `pk_dept` | 生产部门 | `pk_dept` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 21 | `inspectDate` | 检验日期 | `inspectDate` | Date |
| 22 | `inspectType` | 检验类型 | `inspectType` | String |
| 23 | `createmethod` | 创建方式 | `createmethod` | String |
| 24 | `pk_baditem` | 不良项目 | `pk_baditem` | 3de0c23e-ee02-46b4-bae7-0a982de498ce |
| 25 | `check_firstbilltype` | 请检源头单据类型 | `check_firstbilltype` | String |
| 26 | `check_firstbillcode` | 请检源头单据号 | `check_firstbillcode` | String |
| 27 | `check_firstrowno` | 请检源头单据行号 | `check_firstrowno` | String |
| 28 | `check_firstID` | 请检源头单据ID | `check_firstID` | String |
| 29 | `check_firstrowID` | 请检源头单据行ID | `check_firstrowID` | String |
| 30 | `businessdate` | 业务日期 | `businessdate` | DateTime |
| 31 | `invaliddate` | 检验前有效期 | `invaliddate` | DateTime |
| 32 | `firstStoredDate` | 首次入库日期 | `firstStoredDate` | DateTime |
| 33 | `offset_num` | 销抵数量 | `offset_num` | Decimal |
| 34 | `canin_num` | 可执行数量 | `canin_num` | Decimal |
| 35 | `sync_status` | 同步库存单状态 | `sync_status` | String |
| 36 | `vchangerate` | 换算率 | `vchangerate` | String |
| 37 | `nnumber` | 件数 | `nnumber` | Decimal |
| 38 | `inspect_unit` | 检验单位 | `inspect_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 39 | `goods_position` | 货位 | `goods_position` | 79b90356-9fc7-4bc2-ac1a-400520fa80cc |
| 40 | `valid_until` | 检验前有效期至 | `valid_until` | Date |
| 41 | `product_date` | 检验前生产日期 | `product_date` | Date |
| 42 | `shelflife` | 检验前保质期 | `shelflife` | String |
| 43 | `description` | 规格说明 | `description` | String |
| 44 | `model` | 型号 | `model` | String |
| 45 | `frozeState` | 质检冻结状态 | `froze_state` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 46 | `makebilltype` | 生成单据类型 | `makebilltype` | String |
| 47 | `stock_unit` | 库存单位 | `stock_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 48 | `stock_num` | 库存件数 | `stock_num` | Decimal |
| 49 | `source_incominspect_billcode` | 源头检验单号 | `source_incominspect_billcode` | String |
| 50 | `passStatus` | 放行状态 | `pass_status` | String |
| 51 | `partyResponsible` | 责任方 | `party_responsible` | String |
| 52 | `freect_b` | 表体物料自由项特征组实体 | `freect_b` | 02246d1b-35a6-41c0-b8cd-3a24b69e07f4 |
| 53 | `freect_bchg` | 表体改判物料自由项特征组实体 | `freect_bchg` | 8b81451d-777a-4e41-bbbe-120db7b4a55f |
| 54 | `orderProcessSn` | 工序顺序号 | `order_process_sn` | String |
| 55 | `badReasonId` | 不良原因 | `bad_reason_id` | 75cfe910-ecb0-4392-b67c-c22e0d6129d0 |
| 56 | `scrapDeptId` | 责任部门 | `scrap_dept_id` | ca871996-b447-42f9-8dac-dd7c21ee0662 |
| 57 | `scrapLeaderId` | 责任人 | `scrap_leader_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 58 | `qualifyGradeResult` | 质量等级 | `quality_grade` | String |
| 59 | `coord` | 是否协同 | `coord` | Boolean |
| 60 | `isAutoPublish` | 是否自动发布 | `is_auto_publish` | Boolean |
| 61 | `baditem_name` | 不良项目名称 | `baditem_name` | String |
| 62 | `treat_method_name` | 处理方式名称 | `treat_method_name` | String |
| 63 | `qualify_grade_id` | 质量等级ID | `qualify_grade_id` | 0807260c-f881-4419-9dab-a412fad4e530 |
| 64 | `qualityScore` | 质量计分 | `quality_score` | Decimal |
| 65 | `inspectDetail_definect` | 质检结果明细自定义项特征 | `inspectDetail_definect` | 8bf326c0-89e9-4dbe-90fe-4b38e365bf48 |
| 66 | `pk_apply_org` | 请检组织 | `pk_apply_org` | 598482c6-0ad7-493a-b944-5493a8b9fb8e |
| 67 | `warehouse` | 仓库 | `warehouse` | 4256da1b-7d9f-49d6-b510-a05e771d17b0 |
| 68 | `orderProcessId` | 工序 | `order_process_id` | 5929debb-7319-44fb-8583-5c7d0d5af701 |
| 69 | `workCenterId` | 工作中心 | `work_center_id` | 2c63b6a3-15b5-49e8-bd53-72b1ddab2d0f |
| 70 | `scrapProcessId` | 责任工序 | `scrap_process_id` | Long |
| 71 | `reworkProcessId` | 建议返工工序 | `rework_process_id` | Long |
| 72 | `checkApplyStStatus` | 请检库存状态 | `checkapply_ststatus` | 5275f074-3e60-4b90-9771-20970f1e905c |
| 73 | `inventorystate_code` | 库存状态编码 | `inventorystate_code` | String |
| 74 | `h_define1` | 检验前批次属性1 | `h_define1` | String |
| 75 | `h_define2` | 检验前批次属性2 | `h_define2` | String |
| 76 | `h_define3` | 检验前批次属性3 | `h_define3` | String |
| 77 | `h_define4` | 检验前批次属性4 | `h_define4` | String |
| 78 | `h_define5` | 检验前批次属性5 | `h_define5` | String |
| 79 | `h_define6` | 检验前批次属性6 | `h_define6` | String |
| 80 | `h_define7` | 检验前批次属性7 | `h_define7` | String |
| 81 | `h_define8` | 检验前批次属性8 | `h_define8` | String |
| 82 | `h_define9` | 检验前批次属性9 | `h_define9` | String |
| 83 | `h_define10` | 检验前批次属性10 | `h_define10` | String |
| 84 | `h_define11` | 检验前批次属性11 | `h_define11` | String |
| 85 | `h_define12` | 检验前批次属性12 | `h_define12` | String |
| 86 | `h_define13` | 检验前批次属性13 | `h_define13` | String |
| 87 | `h_define14` | 检验前批次属性14 | `h_define14` | String |
| 88 | `h_define15` | 检验前批次属性15 | `h_define15` | String |
| 89 | `h_define16` | 检验前批次属性16 | `h_define16` | String |
| 90 | `h_define17` | 检验前批次属性17 | `h_define17` | String |
| 91 | `h_define18` | 检验前批次属性18 | `h_define18` | String |
| 92 | `h_define19` | 检验前批次属性19 | `h_define19` | String |
| 93 | `h_define20` | 检验前批次属性20 | `h_define20` | String |
| 94 | `h_define21` | 检验前批次属性21 | `h_define21` | String |
| 95 | `h_define22` | 检验前批次属性22 | `h_define22` | String |
| 96 | `h_define23` | 检验前批次属性23 | `h_define23` | String |
| 97 | `h_define24` | 检验前批次属性24 | `h_define24` | String |
| 98 | `h_define25` | 检验前批次属性25 | `h_define25` | String |
| 99 | `h_define26` | 检验前批次属性26 | `h_define26` | String |
| 100 | `h_define27` | 检验前批次属性27 | `h_define27` | String |
| 101 | `h_define28` | 检验前批次属性28 | `h_define28` | String |
| 102 | `h_define29` | 检验前批次属性29 | `h_define29` | String |
| 103 | `h_define30` | 检验前批次属性30 | `h_define30` | String |
| 104 | `customId` | 客户 | `custom_id` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 105 | `pkPurchaseOrg` | 采购组织 | `pk_purchase_org` | a4916c85-f087-4e87-a178-0ad37aff7cd0 |
| 106 | `salesOrg` | 销售组织 | `sales_org` | 4991976e-11ee-406e-bdbb-0f73f9f89ff2 |
| 107 | `checkApplyCode` | 检验申请单号 | `checkapply_code` | String |
| 108 | `checkApplyID` | 检验申请ID | `checkapply_id` | String |
| 109 | `destroySimpleResult` | 是否破坏性样本处理结果 | `destroy_simple_result` | Boolean |
| 110 | `destroySimpleMagType` | 破坏样本管理方式 | `destroy_simple_mag_type` | Short |
| 111 | `isExternalSource` | 是否外部请检 | `is_external_source` | Short |
| 112 | `stock_vchangerate` | 库存换算率 | `stock_vchangerate` | Decimal |
| 113 | `source_incominspect_id` | 源头检验单id | `source_incominspect_id` | String |
| 114 | `shelflife_unit` | 检验前保质期单位 | `shelflife_unit` | String |
| 115 | `attachmentId` | 附件 | `attachmentId` | String |
| 116 | `groupedKey4Sn` | 序列号检分组key | `groupedKey4Sn` | String |
| 117 | `reserve` | 跟踪线索 | `reserve` | fdc23f28-4a7f-46e8-844b-345f01c13996 |
| 118 | `insres_sourcenum` | 检验结果来源单据号 | `insres_sourcenum` | String |
| 119 | `is_storage` | 是否可出入库 | `is_storage` | Boolean |
| 120 | `pk_batchno` | 出入库批次 | `pk_batchno` | 9458cb44-2675-4988-8e64-f6a59fefed89 |
| 121 | `pk_batchcode` | 出入库批次号 | `pk_batchcode` | String |
| 122 | `storage_num` | 累计出入库数量 | `storage_num` | Decimal |
| 123 | `pk_inspectinfo` | 质检结果表头 | `pk_inspectinfo` | 3526de2a-c4bf-42e8-b6c2-54ab856dacb4 |
| 124 | `changed_valid_until` | 有效期至 | `changed_valid_until` | Date |
| 125 | `is_out` | 是否可出库 | `is_out` | Boolean |
| 126 | `changed_product_date` | 生产日期 | `changed_product_date` | Date |
| 127 | `sumout_num` | 累计出库数量 | `sumout_num` | Decimal |
| 128 | `material_code` | 物料编码 | `material_code` | String |
| 129 | `pk_material` | 改判物料编码 | `pk_material` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 130 | `changed_shelflife` | 保质期 | `changed_shelflife` | String |
| 131 | `changed_shelflife_unit` | 保质期单位 | `changed_shelflife_unit` | String |
| 132 | `changed_invaliddate` | 有效期 | `changed_invaliddate` | DateTime |
| 133 | `pk_materialsku` | 改判物料SKU编码 | `pk_materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 134 | `materialsku` | 物料sku | `materialsku` | 3e9ddc6d-edd0-4508-afcc-e4a20535f2f9 |
| 135 | `materialsku_code` | 物料sku编码 | `materialsku_code` | String |
| 136 | `batchno` | 批次号 | `batchno` | String |
| 137 | `dr` | 逻辑删除标记 | `dr` | Short |
| 138 | `tenant` | 租户ID | `tenant_id` | String |
| 139 | `define1` | 自定义项1 | `define1` | String |
| 140 | `define2` | 自定义项2 | `define2` | String |
| 141 | `define3` | 自定义项3 | `define3` | String |
| 142 | `define4` | 自定义项4 | `define4` | String |
| 143 | `define5` | 自定义项5 | `define5` | String |
| 144 | `define6` | 自定义项6 | `define6` | String |
| 145 | `define7` | 自定义项7 | `define7` | String |
| 146 | `define8` | 自定义项8 | `define8` | String |
| 147 | `define9` | 自定义项9 | `define9` | String |
| 148 | `define10` | 自定义项10 | `define10` | String |
| 149 | `define11` | 自定义项11 | `define11` | String |
| 150 | `define12` | 自定义项12 | `define12` | String |
| 151 | `define13` | 自定义项13 | `define13` | String |
| 152 | `define14` | 自定义项14 | `define14` | String |
| 153 | `define15` | 自定义项15 | `define15` | String |
| 154 | `define16` | 自定义项16 | `define16` | String |
| 155 | `define17` | 自定义项17 | `define17` | String |
| 156 | `define18` | 自定义项18 | `define18` | String |
| 157 | `define19` | 自定义项19 | `define19` | String |
| 158 | `define20` | 自定义项20 | `define20` | String |
| 159 | `define21` | 自定义项21 | `define21` | String |
| 160 | `define22` | 自定义项22 | `define22` | String |
| 161 | `define23` | 自定义项23 | `define23` | String |
| 162 | `define24` | 自定义项24 | `define24` | String |
| 163 | `define25` | 自定义项25 | `define25` | String |
| 164 | `define26` | 自定义项26 | `define26` | String |
| 165 | `define27` | 自定义项27 | `define27` | String |
| 166 | `define28` | 自定义项28 | `define28` | String |
| 167 | `define29` | 自定义项29 | `define29` | String |
| 168 | `define30` | 自定义项30 | `define30` | String |
| 169 | `createTime` | 创建时间 | `create_time` | DateTime |
| 170 | `createDate` | 创建日期 | `create_date` | Date |
| 171 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 172 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 173 | `creator` | 创建人名称 | `creator` | String |
| 174 | `modifier` | 修改人名称 | `modifier` | String |
| 175 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 176 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 177 | `pubts` | 时间戳 | `pubts` | DateTime |
| 178 | `detailExpinfo` | 检验记录处理结果明细扩展表 | `` | 31472744-3aab-441b-a74d-fcbbc489244b |

---

## 关联属性（37个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `detailExpinfo` | 检验记录处理结果明细扩展表 | `QMSDFM.dfmCheck.QmsDfmCheckResultExt` | None | true |
| 2 | `badReasonId` | 不良原因 | `aa.reason.Reason` | Service |  |
| 3 | `inspectDetail_definect` | 质检结果明细自定义项特征 | `QMSDFM.inspectinfo.InspectDetailDefineCharacter` | None |  |
| 4 | `scrapDeptId` | 责任部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `pk_unit` | 主单位 | `pc.unit.Unit` | Service |  |
| 8 | `salesOrg` | 销售组织 | `org.func.SalesOrg` | Service |  |
| 9 | `customId` | 客户 | `aa.merchant.Merchant` | Service |  |
| 10 | `pk_org` | 质检组织 | `org.func.BaseOrg` | Service |  |
| 11 | `pk_inspectinfo` | 质检结果表头 | `QMSDFM.inspectinfo.inspectinfo` | None |  |
| 12 | `pk_materialsku` | 改判物料SKU编码 | `pc.product.ProductSKU` | Service |  |
| 13 | `pk_apply_org` | 请检组织 | `bd.adminOrg.InventoryOrgVO` | Service |  |
| 14 | `pk_material` | 改判物料编码 | `pc.product.Product` | Service |  |
| 15 | `pkPurchaseOrg` | 采购组织 | `org.func.PurchaseOrg` | Service |  |
| 16 | `freect_b` | 表体物料自由项特征组实体 | `QMSDFM.inspectinfo.InspectResultDetailFree` | None |  |
| 17 | `workCenterId` | 工作中心 | `ed.workcenter.WorkCenter` | Service |  |
| 18 | `reserve` | 跟踪线索 | `st.reservation.Reservation` | Service |  |
| 19 | `pkDfmCheckRecord` | 检验记录id | `QMSDFM.dfmCheck.QmsDfmCheckRecord` | None | true |
| 20 | `treat_method` | 处理方式 | `QMSDFM.treatmethod.treatmethod` | None |  |
| 21 | `frozeState` | 质检冻结状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 22 | `pk_initmaterial` | 初始物料ID | `pc.product.Product` | Service |  |
| 23 | `inspect_unit` | 检验单位 | `pc.unit.Unit` | Service |  |
| 24 | `qualify_grade_id` | 质量等级ID | `QMSDFM.qualityGrade.qualityGradeBody` | None |  |
| 25 | `materialsku` | 物料sku | `pc.product.ProductSKU` | Service |  |
| 26 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 27 | `scrapLeaderId` | 责任人 | `bd.staff.Staff` | Service |  |
| 28 | `goods_position` | 货位 | `aa.goodsposition.GoodsPosition` | Service |  |
| 29 | `pk_inventorystate` | 库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 30 | `warehouse` | 仓库 | `aa.warehouse.Warehouse` | Service |  |
| 31 | `freect_bchg` | 表体改判物料自由项特征组实体 | `QMSDFM.inspectinfo.InspectResultDetailCommuteFree` | None |  |
| 32 | `pk_baditem` | 不良项目 | `QMSDFM.badItems.badItems` | None |  |
| 33 | `pk_batchno` | 出入库批次 | `st.batchno.Batchno` | Service |  |
| 34 | `pk_dept` | 生产部门 | `bd.adminOrg.DeptOrgVO` | Service |  |
| 35 | `checkApplyStStatus` | 请检库存状态 | `st.stockStatusRecord.stockStatusRecord` | Service |  |
| 36 | `orderProcessId` | 工序 | `ed.operation.Operation` | Service |  |
| 37 | `stock_unit` | 库存单位 | `pc.unit.Unit` | Service |  |
