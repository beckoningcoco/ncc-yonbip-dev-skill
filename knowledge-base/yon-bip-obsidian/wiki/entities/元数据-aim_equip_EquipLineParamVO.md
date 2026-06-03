---
tags: [BIP, 元数据, 数据字典, aim.equip.EquipLineParamVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 线性参数 (`aim.equip.EquipLineParamVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pam_equip_line_param` | domain：`ucf-amc-ambd` | 应用：`AIM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 线性参数 |
| 物理表 | `pam_equip_line_param` |
| 数据库 schema | `ucf-amc-ambd` |
| 所属应用 | `AIM` |
| 直连字段 | 74 个 |
| 子表 | 1 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `aim.equip.EquipLineParamVODefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_equip` | `` |
| `user_defines` | `` |
| `ytenant_id` | `` |
| `pk_line_refer_start` | `` |
| `pk_line_refer_end` | `` |
| `tenantid` | `` |
| `pk_line_refer` | `ucf-amc-ambd.ampub_line_param_ref` |
| `` | `` |

## 继承接口 (3个, 3字段)

- **逻辑删除接口** (`baseapp.itf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`baseapp.itf.ITenant`)
  - `tenantid` → `tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 74 个直连字段

### 文本字段 (61个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `param_value` | `param_value` | `param_value` | 线性参数值 |
| `memo` | `memo` | `memo` | 备注 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `line_end_lat` | `line_end_lat` | `line_end_lat` | 结束纬度 |
| `line_end_lng` | `line_end_lng` | `line_end_lng` | 结束经度 |
| `line_explain` | `line_explain` | `line_explain` | 位置说明 |
| `line_param1` | `line_param1` | `line_param1` | 线性参数1 |
| `line_param10` | `line_param10` | `line_param10` | 线性参数10 |
| `line_param11` | `line_param11` | `line_param11` | 线性参数11 |
| `line_param12` | `line_param12` | `line_param12` | 线性参数12 |
| `line_param13` | `line_param13` | `line_param13` | 线性参数13 |
| `line_param14` | `line_param14` | `line_param14` | 线性参数14 |
| `line_param15` | `line_param15` | `line_param15` | 线性参数15 |
| `line_param16` | `line_param16` | `line_param16` | 线性参数16 |
| `line_param17` | `line_param17` | `line_param17` | 线性参数17 |
| `line_param18` | `line_param18` | `line_param18` | 线性参数18 |
| `line_param19` | `line_param19` | `line_param19` | 线性参数19 |
| `line_param2` | `line_param2` | `line_param2` | 线性参数2 |
| `line_param20` | `line_param20` | `line_param20` | 线性参数20 |
| `line_param21` | `line_param21` | `line_param21` | 线性参数21 |
| `line_param22` | `line_param22` | `line_param22` | 线性参数22 |
| `line_param23` | `line_param23` | `line_param23` | 线性参数23 |
| `line_param24` | `line_param24` | `line_param24` | 线性参数24 |
| `line_param25` | `line_param25` | `line_param25` | 线性参数25 |
| `line_param26` | `line_param26` | `line_param26` | 线性参数26 |
| `line_param27` | `line_param27` | `line_param27` | 线性参数27 |
| `line_param28` | `line_param28` | `line_param28` | 线性参数28 |
| `line_param29` | `line_param29` | `line_param29` | 线性参数29 |
| `line_param3` | `line_param3` | `line_param3` | 线性参数3 |
| `line_param30` | `line_param30` | `line_param30` | 线性参数30 |
| `line_param31` | `line_param31` | `line_param31` | 线性参数31 |
| `line_param32` | `line_param32` | `line_param32` | 线性参数32 |
| `line_param33` | `line_param33` | `line_param33` | 线性参数33 |
| `line_param34` | `line_param34` | `line_param34` | 线性参数34 |
| `line_param35` | `line_param35` | `line_param35` | 线性参数35 |
| `line_param36` | `line_param36` | `line_param36` | 线性参数36 |
| `line_param37` | `line_param37` | `line_param37` | 线性参数37 |
| `line_param38` | `line_param38` | `line_param38` | 线性参数38 |
| `line_param39` | `line_param39` | `line_param39` | 线性参数39 |
| `line_param4` | `line_param4` | `line_param4` | 线性参数4 |
| `line_param40` | `line_param40` | `line_param40` | 线性参数40 |
| `line_param41` | `line_param41` | `line_param41` | 线性参数41 |
| `line_param42` | `line_param42` | `line_param42` | 线性参数42 |
| `line_param43` | `line_param43` | `line_param43` | 线性参数43 |
| `line_param44` | `line_param44` | `line_param44` | 线性参数44 |
| `line_param45` | `line_param45` | `line_param45` | 线性参数45 |
| `line_param46` | `line_param46` | `line_param46` | 线性参数46 |
| `line_param47` | `line_param47` | `line_param47` | 线性参数47 |
| `line_param48` | `line_param48` | `line_param48` | 线性参数48 |
| `line_param49` | `line_param49` | `line_param49` | 线性参数49 |
| `line_param5` | `line_param5` | `line_param5` | 线性参数5 |
| `line_param50` | `line_param50` | `line_param50` | 线性参数50 |
| `line_param6` | `line_param6` | `line_param6` | 线性参数6 |
| `line_param7` | `line_param7` | `line_param7` | 线性参数7 |
| `line_param8` | `line_param8` | `line_param8` | 线性参数8 |
| `line_param9` | `line_param9` | `line_param9` | 线性参数9 |
| `line_start_lat` | `line_start_lat` | `line_start_lat` | 开始纬度 |
| `line_start_lng` | `line_start_lng` | `line_start_lng` | 开始经度 |
| `pk_category` | `pk_category` | `pk_category` | 资产类别 |
| `source` | `source` | `source` | 来源 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_equip` | `pk_equip` | `pk_equip` | 资产卡片 |
| `pk_line_refer` | `pk_line_refer` | `pk_line_param` | 参数名称 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `pk_line_refer_end` | `pk_line_refer_end` | `pk_line_refer_end` | 结束参考点 |
| `pk_line_refer_start` | `pk_line_refer_start` | `pk_line_refer_start` | 开始参考点 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |
| `gis_status` | `gis_status` | `gis_status` | 状态 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `start_offset` | `start_offset` | `start_offset` | 与起点偏移量 |
| `continuation_length` | `continuation_length` | `continuation_length` | 连续长度 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_defines` | `user_defines` | `userDefines` | 线性参数自定义项 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 线性参数自定义项 |
