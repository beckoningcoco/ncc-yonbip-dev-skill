---
tags: [BIP, 元数据, 数据字典, aim.equip.EquipHeadExtendVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 资产卡片扩展属性 (`aim.equip.EquipHeadExtendVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_equip_extend` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 资产卡片扩展属性 |
| 物理表 | `pam_equip_extend` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 99 个 |
| 子表 | 0 个 |
| 关联引用 | 23 个 |

## 关联引用 (23个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity` | `` |
| `ytenant_id` | `` |
| `gis_operator` | `` |
| `project_currency_src` | `` |
| `pk_house_type` | `` |
| `wbs` | `` |
| `wbs_src` | `` |
| `activity_src` | `` |
| `calibration_organization` | `` |
| `fk_parent_history` | `` |
| `measure_unit` | `` |
| `unit` | `` |
| `pk_equip` | `` |
| `pk_measure_instrument_category` | `` |
| `line_previous_point` | `` |
| `verification_organization` | `` |
| `id` | `` |
| `last_print_user` | `` |
| `project_src` | `` |
| `run_status` | `` |
| `stock_unit` | `` |
| `tenantid` | `` |
| `line_measure_unit` | `` |

## 继承接口 (4个, 5字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 99 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accuracy_level` | `accuracy_level` | `accuracy_level` | 准确度等级 |
| `calibration_certificate` | `calibration_certificate` | `calibration_certificate` | 校准证书编号 |
| `coordinate_group` | `coordinate_group` | `coordinate_group` | 坐标组 |
| `image_group` | `image_group` | `image_group` | 图片 |
| `line_direction` | `line_direction` | `line_direction` | 方向 |
| `line_end_lat` | `line_end_lat` | `line_end_lat` | 终点纬度 |
| `line_end_lng` | `line_end_lng` | `line_end_lng` | 终点经度 |
| `line_end_memo` | `line_end_memo` | `line_end_memo` | 终点描述 |
| `line_explain` | `line_explain` | `line_explain` | 说明 |
| `line_start_lat` | `line_start_lat` | `line_start_lat` | 起点纬度 |
| `line_start_lng` | `line_start_lng` | `line_start_lng` | 起点经度 |
| `line_start_memo` | `line_start_memo` | `line_start_memo` | 起点描述 |
| `measure_range` | `measure_range` | `measure_range` | 测量范围 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `uncertainty` | `uncertainty` | `uncertainty` | 不确定度 |
| `use_certificate` | `use_certificate` | `use_certificate` | 使用登记证 |
| `use_certificate_no` | `use_certificate_no` | `use_certificate_no` | 使用登记证编号 |
| `verification_certificate` | `verification_certificate` | `verification_certificate` | 检定证书编号 |
| `year_built` | `year_built` | `year_built` | 建成年份 |

### 引用字段 (23个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity` | `activity` | `activity` | 活动 |
| `activity_src` | `activity_src` | `activity_src` | 来源活动 |
| `calibration_organization` | `calibration_organization` | `calibration_organization` | 校准机构 |
| `fk_parent_history` | `fk_parent_history` | `fk_parent_history` | 历史父资产 |
| `gis_operator` | `gis_operator` | `gis_operator` | GIS关联操作人 |
| `id` | `id` | `id` | ID |
| `last_print_user` | `last_print_user` | `last_print_user` | 最后打印人 |
| `line_measure_unit` | `line_measure_unit` | `line_measure_unit` | 测量单位 |
| `line_previous_point` | `line_previous_point` | `line_previous_point` | 上一连接点 |
| `measure_unit` | `measure_unit` | `measure_unit` | 计量项目单位 |
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_house_type` | `pk_house_type` | `pk_house_type` | 户型 |
| `pk_measure_instrument_category` | `pk_measure_instrument_category` | `pk_measure_instrument_category` | 计量器具类别 |
| `project_currency_src` | `project_currency_src` | `project_currency_src` | 来源项目币种 |
| `project_src` | `project_src` | `project_src` | 来源项目 |
| `run_status` | `run_status` | `runStatus` | 运行状态 |
| `stock_unit` | `stock_unit` | `stock_unit` | 库存单位 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `unit` | `unit` | `unit` | 主计量单位 |
| `verification_organization` | `verification_organization` | `verification_organization` | 检定机构 |
| `wbs` | `wbs` | `wbs` | WBS |
| `wbs_src` | `wbs_src` | `wbs_src` | 来源WBS任务 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calibration_date` | `calibration_date` | `calibration_date` | 校准日期 |
| `calibration_date_next` | `calibration_date_next` | `calibration_date_next` | 下次校准日期 |
| `last_print_time` | `last_print_time` | `last_print_time` | 最后打印时间 |
| `project_asset_date` | `project_asset_date` | `project_asset_date` | 转资日期 |
| `verification_date` | `verification_date` | `verification_date` | 检定日期 |
| `verification_period` | `verification_period` | `verification_period` | 检定有效期至 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `gis_flag` | `gis_flag` | `gis_flag` | 关联GIS标识 |
| `public_facing` | `public_facing` | `public_facing` | 面向公众 |
| `wait_ia_flag` | `wait_ia_flag` | `wait_ia_flag` | 待存货核算 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amortization_way` | `amortization_way` | `amortization_way` | 摊销方式 |
| `calibration_cycle` | `calibration_cycle` | `calibration_cycle` | 校准周期 |
| `line_measure_precision` | `line_measure_precision` | `line_measure_precision` | 测量精度 |
| `mold_cavity_num` | `mold_cavity_num` | `mold_cavity_num` | 模具腔数 |
| `print_sum` | `print_sum` | `print_sum` | 打印次数 |
| `verification_cycle` | `verification_cycle` | `verification_cycle` | 检定周期 |

### 短整数 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_business` | `asset_business` | `assetBusiness` | 资产业务分类 |
| `business_type` | `business_type` | `business_type` | 经营类型 |
| `calibration_cycle_unit` | `calibration_cycle_unit` | `calibration_cycle_unit` | 校准周期单位 |
| `check_status` | `check_status` | `check_status` | 计量器具检定状态 |
| `cosm_status` | `cosm_status` | `cosm_status` | 周转材状态 |
| `design_life` | `design_life` | `designLife` | 设计寿命（月） |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `floors_number` | `floors_number` | `floors_number` | 楼层总数 |
| `register_cancel_status` | `register_cancel_status` | `register_cancel_status` | 注册注销状态 |
| `source_type` | `source_type` | `sourceType` | 来源类型 |
| `supervision_mode` | `supervision_mode` | `supervision_mode` | 监管方式 |
| `verification_cycle_unit` | `verification_cycle_unit` | `verification_cycle_unit` | 检定周期单位 |
| `verification_method` | `verification_method` | `verification_method` | 检定方式 |
| `verification_result` | `verification_result` | `verification_result` | 检定结论 |

### 数值字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accu_usage_after_amort` | `accu_usage_after_amort` | `accu_usage_after_amort` | 摊销后累计使用量 |
| `accumulated_amortization` | `accumulated_amortization` | `accumulated_amortization` | 累计摊销额 |
| `amount` | `amount` | `amount` | 金额 |
| `evaluate_value` | `evaluate_value` | `evaluateValue` | 评估价值 |
| `leased_occupy_area` | `leased_occupy_area` | `leasedOccupyArea` | 租赁预占面积 |
| `line_end_measure` | `line_end_measure` | `line_end_measure` | 终点测量 |
| `line_length` | `line_length` | `line_length` | 长度 |
| `line_start_measure` | `line_start_measure` | `line_start_measure` | 起点测量 |
| `measure_num` | `measure_num` | `measure_num` | 计量项目数量 |
| `molding_time` | `molding_time` | `molding_time` | 成型时间 |
| `net_amount` | `net_amount` | `net_amount` | 净额 |
| `number_packages` | `number_packages` | `number_packages` | 件数 |
| `plan_rental_area` | `plan_rental_area` | `planRentalArea` | 规划可租面积 |
| `plan_saleable_area` | `plan_saleable_area` | `planSaleableArea` | 规划可售面积 |
| `plan_usable_area` | `plan_usable_area` | `planUsableArea` | 规划可用面积 |
| `project_origin_value` | `project_origin_value` | `project_origin_value` | 项目入账原值 |
| `rented_area` | `rented_area` | `rentedArea` | 已租面积 |
| `requisition_num` | `requisition_num` | `requisition_num` | 累计领用件数 |
| `self_use_area` | `self_use_area` | `selfUseArea` | 自用面积 |
| `sold_area` | `sold_area` | `soldArea` | 已售面积 |
| `unit_price` | `unit_price` | `unit_price` | 单价 |
| `usage_to_be_amortized` | `usage_to_be_amortized` | `usage_to_be_amortized` | 待摊销使用量 |
| `use_times_remain` | `use_times_remain` | `use_times_remain` | 剩余使用量 |
| `use_times_sum` | `use_times_sum` | `use_times_sum` | 累计使用量 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `gis_relation_time` | `gis_relation_time` | `gis_relation_time` | GIS关联时间 |
| `gis_update_time` | `gis_update_time` | `gis_update_time` | GIS更新时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `run_status_time` | `run_status_time` | `runStatusTime` | 运行状态时间 |
