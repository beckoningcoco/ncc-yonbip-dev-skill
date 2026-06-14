---
tags: [BIP, 元数据, 数据字典, aim.equip.EquipHeadVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产卡片 (`aim.equip.EquipHeadVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_equip` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：`8380afd9-a7fe-4208-ab21-856e40d57c08`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产卡片 |
| 物理表 | `pam_equip` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 199 个 |
| 子表 | 19 个 |
| 关联引用 | 72 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `equip_extend` | `aim.equip.EquipHeadExtendVO` | composition |
| `equip_line_param` | `aim.equip.EquipLineParamVO` | composition |
| `tag_history` | `aim.equip.TagHistoryVO` | composition |
| `keyparts` | `aim.equip.EquipKeyPartsVO` | composition |
| `measurepoint` | `aim.equip.MeasurePointVO` | composition |
| `subvos` | `aim.equip.SubEquipVO` | composition |
| `line_refer_point` | `aim.equip.LineReferPointVO` | composition |
| `special_asset` | `aim.equip.SpecialAssetVO` | composition |
| `portraitlabels` | `aim.equip.EquipPortraitLabelVO` | composition |
| `defines` | `aim.equip.EquipHeadVODefine` | composition |
| `rentobject` | `aim.equip.RentObjectVO` | composition |
| `techparams` | `aim.equip.TechValueVo` | composition |
| `spare_part` | `aim.equip.SparePartVO` | composition |
| `equipimage` | `aim.equip.EquipImageVO` | composition |
| `equip_coordinate` | `aim.equip.EquipCoordinateVO` | composition |
| `personliable` | `aim.equip.PersonLiableVO` | composition |
| `equipgrading` | `aim.equip.EquipGradingVO` | composition |
| `equip_management` | `aim.equip.EquipManagementVO` | composition |
| `equip_assignment` | `aim.equip.EquipAssignment` | composition |

## 关联引用 (72个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_currency_tax` | `ucfbasedoc.bd_currencytenantref` |
| `pk_transitype_src` | `transtype.bd_billtyperef` |
| `modifier` | `` |
| `pk_usedept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_usedunit` | `ucf-org-center.org_unit_tree_ref` |
| `` | `` |
| `pk_location` | `ucf-amc-ambd.ampub_location_ref` |
| `pk_org` | `ucf-org-center.org_assets_tree_ref` |
| `pk_costcenter_use` | `finbd.bd_costcenterref` |
| `pk_supplier` | `yssupplier.aa_vendor` |
| `pk_material` | `productcenter.productref` |
| `pk_transitype` | `transtype.bd_billtyperef` |
| `pk_icorg` | `ucf-org-center.bd_inventoryorg` |
| `fk_parent` | `ucf-amc-ambd.aim_equip_new_ref` |
| `pk_usedept_src` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_currency_inst` | `ucfbasedoc.bd_currencytenantref` |
| `pk_profitcenter_use` | `finbd.bd_allaccbodyref_inner` |
| `pk_used_status` | `ucf-amc-ambd.ampub_status_ref` |
| `tenantid` | `` |
| `pk_usedept_dist` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_costcenter_manage` | `finbd.bd_costcenterref` |
| `pk_special_type` | `ucf-amc-aum.sem_catalogue_ref` |
| `billmaker` | `iuap-apcom-bipuser.bip_user_ref` |
| `pk_specialty` | `ucf-amc-ambd.ampub_specialty_ref` |
| `id` | `` |
| `pk_currency_fi` | `ucfbasedoc.bd_currencytenantref` |
| `pk_project_src` | `` |
| `pk_usedorg` | `ucf-org-center.org_assets_tree_ref` |
| `pk_priority` | `ucf-amc-ambd.ampub_priority_ref` |
| `pk_card` | `yonyoufi.at_fixedassetsref` |
| `bizFlowId` | `` |
| `pk_capital_source` | `ucf-amc-aim.ampub_capitalsource_ref` |
| `pk_user` | `ucf-staff-center.bd_staff_outer_ref` |
| `install_location` | `` |
| `pk_mandept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_currency_purc` | `ucfbasedoc.bd_currencytenantref` |
| `pk_ownerorg` | `ucf-org-center.org_assets_tree_ref` |
| `material_free` | `` |
| `pk_fiorg` | `ucf-org-center.bd_financeorgtreeref` |
| `user_defines` | `` |
| `pk_profitcenter_manage` | `finbd.bd_allaccbodyref_inner` |
| `pk_ownerunit` | `ucf-org-center.bd_financeorgtreeref` |
| `creator` | `` |
| `ytenant_id` | `` |
| `auditor` | `` |
| `pk_category` | `ucf-amc-ambd.ampub_category_ref` |
| `pk_equip` | `` |
| `pk_jobmngfil` | `ucfbasedoc.bd_projectNewRef` |
| `pk_material_sku` | `productcenter.productskuref` |
| `pk_manager` | `ucf-staff-center.bd_staff_outer_ref` |
| `customer` | `productcenter.aa_merchantref` |

## 继承接口 (11个, 35字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **审计信息** (`baseapp.itf.IAuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **流程信息** (`baseapp.itf.IFlowBizItf`)
  - `auditor` → `auditor`
  - `audittime` → `audittime`
  - `billmaker` → `billmaker`
  - `billmaketime` → `billmaketime`
  - `bill_status` → `bill_status`
  - `bill_type` → `bill_type`
  - `busi_type` → `busi_type`
  - `check_opinion` → `check_opinion`
  - `pk_transitype` → `pk_transitype`
  - `transi_type` → `transi_type`
- **自动编码** (`baseapp.itf.IAutoCode`)
- **审批流信息** (`baseapp.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **树型结构** (`baseapp.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **特征适配相关信息** (`gscm.itf.CharacterInfo`)
  - `stockSensClue` → `stockSensClue`

## 字段列表（按类型分组）

> 共 199 个直连字段

### 文本字段 (50个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `equip_code` | `equip_code` | `equip_code` | 资产编码 |
| `asset_code` | `asset_code` | `asset_code` | 固定资产编码 |
| `asset_name` | `asset_name` | `asset_name` | 固定资产名称 |
| `map_location` | `map_location` | `map_location` | 坐标位置 |
| `spec` | `spec` | `spec` | 规格 |
| `model` | `model` | `model` | 型号 |
| `pk_material_batchno` | `pk_material_batchno` | `pk_material_batchno` | 批次号 |
| `facturer_name` | `facturer_name` | `facturer_name` | 生产厂商 |
| `precoding` | `precoding` | `precoding` | 出厂编码 |
| `install_address` | `install_address` | `install_address` | 安装具体地址 |
| `check_opinion` | `check_opinion` | `check_opinion` | 审核意见 |
| `id` | `id` | `id` | 资产卡片 |
| `memo` | `memo` | `memo` | 备注 |
| `path` | `path` | `path` | 路径 |
| `pk_currency_dist` | `pk_currency_dist` | `pk_currency_dist` | 目的币种 |
| `pk_currency_src` | `pk_currency_src` | `pk_currency_src` | 来源币种 |
| `transfer_price` | `transfer_price` | `transfer_price` | 入账价值 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `pk_currency_tfr` | `pk_currency_tfr` | `pk_currency_tfr` | 项目币种 |
| `stockSensClue` | `stockSensClue` | `stockSensClue` | 现存量特征敏感线索 |
| `pk_equipmap` | `pk_equipmap` | `pk_equipmap` | 地图关联 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编码 |
| `pk_group_dist` | `pk_group_dist` | `pk_group_dist` | 去向集团 |
| `tag_rule` | `tag_rule` | `tag_rule` | 条码规则 |
| `epc` | `epc` | `epc` | RFID编码 |
| `busi_type` | `busi_type` | `busi_type` | 业务类型 |
| `techvalue` | `techvalue` | `techvalue` | 技术参数 |
| `bar_code` | `bar_code` | `bar_code` | 识别码 |
| `serial_num` | `serial_num` | `serial_num` | 序列号 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `pk_org_src` | `pk_org_src` | `pk_org_src` | 来源组织 |
| `pk_org_dist` | `pk_org_dist` | `pk_org_dist` | 去向组织 |
| `bill_type_dist` | `bill_type_dist` | `bill_type_dist` | 资产去向 |
| `transi_type_dist` | `transi_type_dist` | `transi_type_dist` | 去向交易类型编码 |
| `pk_transitype_dist` | `pk_transitype_dist` | `pk_transitype_dist` | 目的交易类型 |
| `pk_bill_dist` | `pk_bill_dist` | `pk_bill_dist` | 去向单据 |
| `pk_bill_b_dist` | `pk_bill_b_dist` | `pk_bill_b_dist` | 去向单据表体 |
| `bill_code_dist` | `bill_code_dist` | `bill_code_dist` | 去向单据编码 |
| `branchcode` | `branchcode` | `branchcode` | 分支编码 |
| `innercode` | `innercode` | `innercode` | 内部编码 |
| `transi_type` | `transi_type` | `transi_type` | 交易类型编码 |
| `bill_type` | `bill_type` | `bill_type` | 单据类型 |
| `transi_type_src` | `transi_type_src` | `transi_type_src` | 来源交易类型编码 |
| `pk_bill_b_src` | `pk_bill_b_src` | `pk_bill_b_src` | 来源单据子表 |
| `` | `source` | `source` | 来源单据 |
| `bill_code_src` | `bill_code_src` | `bill_code_src` | 来源单据编码 |
| `pk_bill_src` | `pk_bill_src` | `pk_bill_src` | 来源单据主表 |
| `bill_type_src` | `bill_type_src` | `bill_type_src` | 来源单据类型 |
| `sysid` | `sysid` | `sysid` | 系统标识 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |

### 引用字段 (51个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fk_parent` | `fk_parent` | `fk_parent` | 父资产 |
| `pk_ownerunit` | `pk_ownerunit` | `pk_ownerunit` | 所有权 |
| `pk_ownerorg` | `pk_ownerorg` | `pk_ownerorg` | 资产管理组织 |
| `pk_mandept` | `pk_mandept` | `pk_mandept` | 管理部门 |
| `pk_manager` | `pk_manager` | `pk_manager` | 管理人 |
| `pk_org` | `pk_org` | `pk_org` | 资产组织 |
| `pk_usedorg` | `pk_usedorg` | `pk_usedorg` | 使用单位 |
| `pk_usedept` | `pk_usedept` | `pk_usedept` | 使用部门 |
| `pk_user` | `pk_user` | `pk_user` | 责任人 |
| `pk_location` | `pk_location` | `pk_location` | 位置 |
| `pk_category` | `pk_category` | `pk_category` | 资产类别 |
| `pk_specialty` | `pk_specialty` | `pk_specialty` | 专业 |
| `pk_capital_source` | `pk_capital_source` | `pk_capital_source` | 资金来源 |
| `pk_priority` | `pk_priority` | `pk_priority` | 关键程度 |
| `customer` | `customer` | `customer` | 客户 |
| `pk_supplier` | `pk_supplier` | `pk_supplier` | 供应商 |
| `pk_jobmngfil` | `pk_jobmngfil` | `pk_jobmngfil` | 项目 |
| `pk_used_status` | `pk_used_status` | `pk_used_status` | 资产状态 |
| `install_location` | `install_location` | `install_location` | 行政区划 |
| `pk_card` | `pk_card` | `pk_card_efa` | 固定资产卡片 |
| `pk_card` | `pk_card` | `pk_card_fa` | 固定资产卡片 |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程 |
| `pk_usedunit` | `pk_usedunit` | `pk_usedunit` | 使用权 |
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_project_src` | `pk_project_src` | `pk_project_src` | 来源项目 |
| `fk_parent` | `fk_parent` | `fk_parent_auth` | 资产卡片数据权限 |
| `id` | `id` | `id_auth` | 资产卡片数据权限 |
| `pk_material` | `pk_material` | `pk_material_auth` | 物料数据权限 |
| `pk_icorg` | `pk_icorg` | `pk_icorg` | 库存组织 |
| `pk_material` | `pk_material` | `pk_material` | 物料编码 |
| `pk_currency_purc` | `pk_currency_purc` | `pk_currency_purc` | 采购币种 |
| `pk_currency_tax` | `pk_currency_tax` | `pk_currency_tax` | 税金币种 |
| `pk_material_sku` | `pk_material_sku` | `pk_material_sku` | 物料sku |
| `pk_fiorg` | `pk_fiorg` | `pk_fiorg` | 会计主体 |
| `pk_currency_fi` | `pk_currency_fi` | `pk_currency_fi` | 财务币种 |
| `pk_costcenter_manage` | `pk_costcenter_manage` | `pk_costcenter_manage` | 管理成本中心 |
| `pk_profitcenter_manage` | `pk_profitcenter_manage` | `pk_profitcenter_manage` | 管理利润中心 |
| `pk_costcenter_use` | `pk_costcenter_use` | `pk_costcenter_use` | 使用成本中心 |
| `pk_profitcenter_use` | `pk_profitcenter_use` | `pk_profitcenter_use` | 使用利润中心 |
| `pk_special_type` | `pk_special_type` | `pk_special_type` | 特种设备类别 |
| `pk_usedept_src` | `pk_usedept_src` | `pk_usedept_src` | 来源部门版本 |
| `pk_usedept_dist` | `pk_usedept_dist` | `pk_usedept_dist` | 去向部门版本 |
| `pk_currency_inst` | `pk_currency_inst` | `pk_currency_inst` | 安装调试费用币种 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `creator` | `creator` | `creator` | 创建人 |
| `billmaker` | `billmaker` | `billmaker` | 制单人 |
| `auditor` | `auditor` | `auditor` | 审核人 |
| `pk_transitype` | `pk_transitype` | `pk_transitype` | 交易类型 |
| `pk_transitype_src` | `pk_transitype_src` | `pk_transitype_src` | 来源交易类型 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |

### 日期字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status_date` | `status_date` | `status_date` | 状态日期 |
| `manufacture_date` | `manufacture_date` | `manufacture_date` | 生产日期 |
| `start_used_date` | `start_used_date` | `start_used_date` | 投用日期 |
| `pre_mro_date` | `pre_mro_date` | `pre_mro_date` | 保修截止日期 |
| `purchase_date` | `purchase_date` | `purchase_date` | 购买日期 |
| `issuance_date` | `issuance_date` | `issuance_date` | 发货日期 |
| `warranty_date` | `warranty_date` | `warranty_date` | 质保日期 |
| `accept_date` | `accept_date` | `accept_date` | 验收日期 |
| `begin_date` | `begin_date` | `begin_date` | 开始使用日期 |

### 布尔字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sealflag` | `sealflag` | `sealflag` | 封存标记 |
| `assignment_flag` | `assignment_flag` | `assignment_flag` | 分配标记 |
| `real_estate` | `real_estate` | `real_estate` | 不动产标记 |
| `repair_apply_flag` | `repair_apply_flag` | `repair_apply_flag` | 维修申请标记 |
| `transfer_flag` | `transfer_flag` | `transfer_flag` | 转移申请标记 |
| `intactrpt_flag` | `intactrpt_flag` | `intactrpt_flag` | 是否完好 |
| `share_flag` | `share_flag` | `share_flag` | 共享状态 |
| `line_flag` | `line_flag` | `line_flag` | 线性资产 |
| `special_flag` | `special_flag` | `special_flag` | 特种设备 |
| `` | `isEnd` | `isEnd` | 是否末级 |
| `used_dept_follow_user` | `used_dept_follow_user` | `used_dept_follow_user` | 使用部门随责任人变动 |
| `borrow_flag` | `borrow_flag` | `borrow_flag` | 借用标记 |
| `assign_flag` | `assign_flag` | `assign_flag` | 领用标记 |
| `reduce_flag` | `reduce_flag` | `reduce_flag` | 减少标记 |
| `fa_flag` | `fa_flag` | `fa_flag` | 固定资产核算 |
| `associate_flag` | `associate_flag` | `associate_flag` | 联动固定资产 |
| `measure_instrument` | `measure_instrument` | `measure_instrument` | 计量器具 |
| `whole_rent_flag` | `whole_rent_flag` | `whole_rent_flag` | 整租标识 |
| `deploy_flag` | `deploy_flag` | `deploy_flag` | 调拨标记 |
| `rent_flag` | `rent_flag` | `rent_flag` | 租赁标记 |
| `mortgage_flag` | `mortgage_flag` | `mortgage_flag` | 抵押标志 |
| `out_flag` | `out_flag` | `out_flag` | 外部租入资产标志 |
| `associate_status_flag` | `associate_status_flag` | `associate_status_flag` | 联动固定资产状态 |
| `is_pre` | `is_pre` | `is_pre` | 期初资产 |
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否流程核心单据 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `service_month` | `service_month` | `service_month` | 使用月限 |
| `used_month` | `used_month` | `used_month` | 已计提期数 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `level` | `level` | `level` | 层级 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `rent_status` | `rent_status` | `rent_status` | 租赁状态 |
| `asset_type` | `asset_type` | `asset_type` | 资产类型 |
| `bill_status` | `bill_status` | `bill_status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_card` | `pk_card` | `pk_card` | 固定资产 |
| `` | `sourceid` | `sourceid` | 来源单据主表 |
| `` | `sourceautoid` | `sourceautoid` | 来源单据子表 |

### 数值字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `lat` | `lat` | `lat` | 纬度 |
| `lng` | `lng` | `lng` | 经度 |
| `equip_num` | `equip_num` | `equip_num` | 数量 |
| `tax_group` | `tax_group` | `tax_group` | 集团本位币税金 |
| `purc_price_tax_global` | `purc_price_tax_global` | `purc_price_tax_global` | 全局本位币含税价格 |
| `area` | `area` | `area` | 规划总面积 |
| `purc_price_tax` | `purc_price_tax` | `purc_price_tax` | 价税合计 |
| `purc_price` | `purc_price` | `purc_price` | 无税价格 |
| `tax` | `tax` | `tax` | 税金 |
| `origin_value` | `origin_value` | `origin_value` | 本币原值 |
| `accu_dep` | `accu_dep` | `accu_dep` | 累计折旧 |
| `new_value` | `new_value` | `new_value` | 净值 |
| `pre_devaluate` | `pre_devaluate` | `pre_devaluate` | 减值准备 |
| `net_money` | `net_money` | `net_money` | 净额 |
| `salvage_rate` | `salvage_rate` | `salvage_rate` | 净残值率% |
| `salvage` | `salvage` | `salvage` | 净残值 |
| `dep_amount` | `dep_amount` | `dep_amount` | 月折旧额 |
| `install_fee` | `install_fee` | `install_fee` | 安装调试费用 |
| `purc_price_tax_group` | `purc_price_tax_group` | `purc_price_tax_group` | 本位币含税价格 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `equip_name` | `equip_name` | `equip_name` | 资产名称 |

### timestamp (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `fa_writeback_time` | `fa_writeback_time` | `fa_writeback_time` | 价值回传时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `billmaketime` | `billmaketime` | `billmaketime` | 制单时间 |
| `audittime` | `audittime` | `audittime` | 审核时间 |
| `src_head_ts` | `src_head_ts` | `src_head_ts` | 来源单据主表时间戳 |
| `src_body_ts` | `src_body_ts` | `src_body_ts` | 来源单据子表时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 资产卡片自定义项 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_free` | `material_free` | `materialFree` | 自由项特征组 |

### other (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 资产卡片自定义项 |
| `` | `` | `equip_assignment` | 分配信息 |
| `` | `` | `equip_coordinate` | 资产坐标 |
| `` | `` | `equip_extend` | 资产卡片扩展属性 |
| `` | `` | `equip_line_param` | 线性参数 |
| `` | `` | `equip_management` | 经营权 |
| `` | `` | `equipgrading` | 资产定级级别 |
| `` | `` | `equipimage` | 资产图片 |
| `` | `` | `keyparts` | 资产部位 |
| `` | `` | `line_refer_point` | 线性参考点 |
| `` | `` | `measurepoint` | 测量点 |
| `` | `` | `personliable` | 其他责任人 |
| `` | `` | `portraitlabels` | 资产画像标签 |
| `` | `` | `rentobject` | 租赁对象 |
| `` | `` | `spare_part` | 零部件 |
| `` | `` | `special_asset` | 特种设备 |
| `` | `` | `subvos` | 子资产 |
| `` | `` | `tag_history` | 标签打印历史 |
| `` | `` | `techparams` | 技术参数值表 |
