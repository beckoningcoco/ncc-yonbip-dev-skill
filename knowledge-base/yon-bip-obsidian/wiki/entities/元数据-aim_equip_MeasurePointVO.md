---
tags: [BIP, 元数据, 数据字典, aim.equip.MeasurePointVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 测量点 (`aim.equip.MeasurePointVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_measure_point` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 测量点 |
| 物理表 | `pam_measure_point` |
| domain/服务域 | `ucf-amc-ambd` |
| schema | `amc_ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 52 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.MeasurePointVODefine` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_meas_items` | `` |
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `pk_rent_object` | `` |
| `pk_location` | `` |
| `pk_org` | `` |
| `` | `` |
| `pk_equip` | `` |
| `pk_last_measpsn` | `` |
| `user_defines` | `` |
| `pk_sealer` | `` |
| `tenantid` | `` |

## 字段列表（按类型分组）

> 共 52 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `measure_point_code` | `measure_point_code` | `measure_point_code` | 测量点编码 |
| `measure_point_name` | `measure_point_name` | `measure_point_name` | 测量点名称 |
| `meas_item_explain` | `meas_item_explain` | `meas_item_explain` | 测量项目说明 |
| `identifier` | `identifier` | `identifier` | 测量标识符 |
| `process_no` | `process_no` | `process_no` | 工艺位号 |
| `memo` | `memo` | `memo` | 备注 |
| `id` | `id` | `id` | ID |
| `main_id` | `main_id` | `main_id` | 主表id |
| `start_time` | `start_time` | `start_time` | 有效开始时间 |
| `end_time` | `end_time` | `end_time` | 有效结束时间 |
| `cause_synchronization` | `cause_synchronization` | `cause_synchronization` | 同步失败原因 |
| `iot_device_name` | `iot_device_name` | `iot_device_name` | IOT设备名称 |
| `iot_device_code` | `iot_device_code` | `iot_device_code` | IOT设备编码 |
| `iot_property_name` | `iot_property_name` | `iot_property_name` | IOT属性名称 |
| `connect_config_code` | `connect_config_code` | `connect_config_code` | 连接配置编码 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `origin_type` | `origin_type` | `origin_type` | 来源单据类型 |
| `origin_no` | `origin_no` | `origin_no` | 来源单据编号 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_org` | `pk_org` | `pk_org` | 测量点组织 |
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_location` | `pk_location` | `pk_location` | 位置 |
| `pk_meas_items` | `pk_meas_items` | `pk_meas_items` | 测量项目 |
| `pk_last_measpsn` | `pk_last_measpsn` | `pk_last_measpsn` | 最后测量人 |
| `pk_rent_object` | `pk_rent_object` | `pk_rent_object` | 租赁对象 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 最后修改人 |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `pk_sealer` | `pk_sealer` | `pk_sealer` | 启用人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `frequency` | `frequency` | `frequency` | 频率 |
| `statistical_duration` | `statistical_duration` | `statistical_duration` | 统计时长 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `frequency_unit` | `frequency_unit` | `frequency_unit` | 频率单位 |
| `range` | `range` | `range` | 取值范围 |
| `statistical_unit` | `statistical_unit` | `statistical_unit` | 统计单位 |
| `synchronous_state` | `synchronous_state` | `synchronous_state` | 同步状态 |
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `enablestate` | `enablestate` | `enablestate` | 启用状态 |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `last_meas_result` | `last_meas_result` | `last_meas_result` | 最后测量结果 |
| `warning_upper` | `warning_upper` | `warning_upper` | 预警上限 |
| `warning_lower` | `warning_lower` | `warning_lower` | 预警下限 |
| `work_upper` | `work_upper` | `work_upper` | 操作上限 |
| `work_lower` | `work_lower` | `work_lower` | 操作下限 |

### timestamp (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `last_meas_time` | `last_meas_time` | `last_meas_time` | 最后测量时间 |
| `start_number_time` | `start_number_time` | `start_number_time` | 开始取数时间 |
| `last_sync_time` | `last_sync_time` | `last_sync_time` | 最后同步时间 |
| `the_last_time` | `the_last_time` | `the_last_time` | 最后取数时间 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 最后修改时间 |
| `seal_time` | `seal_time` | `seal_time` | 启用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 测量点自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 测量点自定义项 |
