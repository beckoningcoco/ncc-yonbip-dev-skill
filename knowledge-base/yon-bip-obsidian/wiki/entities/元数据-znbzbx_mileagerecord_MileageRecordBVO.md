---
tags: [BIP, 元数据, 数据字典, znbzbx.mileagerecord.MileageRecordBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程记录子表 (`znbzbx.mileagerecord.MileageRecordBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileagerecord_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程记录子表 |
| 物理表 | `znbz_mileagerecord_b` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 41 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `pk_tracklocation_modify` | `znbzbx_mileagerecordref` |
| `pk_mileagerecord` | `` |
| `ytenant_id` | `` |
| `pk_tracklocation` | `znbzbx_mileagerecordref` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 41 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `vdef11` | `vdef11` | `vdef11` | 自定义项11 |
| `vdef12` | `vdef12` | `vdef12` | 自定义项12 |
| `vdef13` | `vdef13` | `vdef13` | 自定义项13 |
| `vdef14` | `vdef14` | `vdef14` | 自定义项14 |
| `vdef15` | `vdef15` | `vdef15` | 自定义项15 |
| `vdef16` | `vdef16` | `vdef16` | 自定义项16 |
| `vdef17` | `vdef17` | `vdef17` | 自定义项17 |
| `vdef18` | `vdef18` | `vdef18` | 自定义项18 |
| `vdef19` | `vdef19` | `vdef19` | 自定义项19 |
| `vdef20` | `vdef20` | `vdef20` | 自定义项20 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 附件id |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_mileagerecord` | `pk_mileagerecord` | `pk_mileagerecord` | 主表主键 |
| `pk_tracklocation` | `pk_tracklocation` | `pk_tracklocation` | 途径地点 |
| `pk_tracklocation_modify` | `pk_tracklocation_modify` | `pk_tracklocation_modify` | 途径地点（修改后） |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `itrackseq` | `itrackseq` | `itrackseq` | 途径地点序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项（小数）1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项（小数）2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项（小数）3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项（小数）4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项（小数）5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项（小数）6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项（小数）7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项（小数）8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项（小数）9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项（小数）10 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dtracktime` | `dtracktime` | `dtracktime` | 途径时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
