---
tags: [BIP, 元数据, 数据字典, znbzbx.mileageallowance.AllowancePriceBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程补贴单价维护 (`znbzbx.mileageallowance.AllowancePriceBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileageallowance_price_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程补贴单价维护 |
| 物理表 | `znbz_mileageallowance_price_b` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 37 个 |
| 子表 | 1 个 |
| 关联引用 | 18 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `SeniorLadderVO` | `znbzbx.mileageallowance.SeniorLadderVO` | composition |

## 关联引用 (18个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `` |
| `vhandledeptid` | `` |
| `pk_dutyrank` | `` |
| `pk_begareaclass` | `` |
| `pk_endareaclass` | `` |
| `ytenant_id` | `` |
| `pk_endaddr` | `` |
| `pk_mileagecontrol` | `` |
| `vcurrency` | `` |
| `pk_begaddr` | `` |
| `allowancePriceBDcs` | `` |
| `` | `` |
| `pk_handlepsn` | `` |
| `pk_dutypost` | `` |
| `tenant_id` | `` |
| `pk_dutygrade` | `` |
| `pk_dutyjob` | `` |
| `pk_price` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `price` | `price` | `price` | 金额/里程单位(里程单价) |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |

### 引用字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `chandleorg` | `chandleorg` | `chandleorg` | 业务单元 |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | BIP档案地点-出发地 |
| `pk_begareaclass` | `pk_begareaclass` | `pk_begareaclass` | BIP城市分级-出发地 |
| `pk_dutygrade` | `pk_dutygrade` | `pk_dutygrade` | 职等 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 职位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | BIP档案地点-到达地 |
| `pk_endareaclass` | `pk_endareaclass` | `pk_endareaclass` | BIP城市分级-到达地 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 员工(报销人) |
| `pk_mileagecontrol` | `pk_mileagecontrol` | `pk_mileagecontrol` | 控制规则 |
| `pk_price` | `pk_price` | `pk_price` | 里程补贴单价主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 原币币种 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imileageunit` | `imileageunit` | `imileageunit` | 里程单位 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `SeniorLadderVO` | 高级配置阶梯单价 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allowancePriceBDcs` | `allowancePriceBDcs` | `allowancePriceBDcs` | 里程补贴单价维护自定义项 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
