---
tags: [BIP, 元数据, 数据字典, znbzbx.expenserecord.ExpenseRecordBVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程明细 (`znbzbx.expenserecord.ExpenseRecordBVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expenserecord_b` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程明细 |
| 物理表 | `znbz_expenserecord_b` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 79 个 |
| 子表 | 0 个 |
| 关联引用 | 22 个 |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_beglocation` | `` |
| `activity` | `` |
| `pk_mileagerecord` | `` |
| `ytenant_id` | `` |
| `wbs` | `` |
| `pk_endaddr` | `` |
| `vcurrency` | `` |
| `pk_begaddr` | `` |
| `pk_beglocation_modify` | `` |
| `expenseRecordBDcs` | `` |
| `pk_endlocatin` | `` |
| `vnatcurrency` | `` |
| `pk_endlocatin_modify` | `` |
| `pk_expenserecord` | `` |
| `vnatexchratetype` | `` |
| `pk_handlepsn` | `` |
| `pk_dutypost` | `ucf-staff-center.bd_positiontreeref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |

## 继承接口 (3个, 4字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 79 个直连字段

### 文本字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_endlocatin_modify_name` | `pk_endlocatin_modify_name` | `pk_endlocatin_modify_name` | 到达地点 |
| `joblistid` | `joblistid` | `joblistid` | 任职ID |
| `pk_beglocation_modify_name` | `pk_beglocation_modify_name` | `pk_beglocation_modify_name` | 出发地点 |
| `vreason` | `vreason` | `vreason` | 事由 |
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

### 引用字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 员工 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 报销人部门 |
| `chandleorg` | `chandleorg` | `chandleorg` | 报销人组织 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | BIP档案地点-到达地 |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | BIP档案地点-出发地 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `pk_endlocatin` | `pk_endlocatin` | `pk_endlocatin` | 到达地点 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_beglocation_modify` | `pk_beglocation_modify` | `pk_beglocation_modify` | 出发地点(修改后) |
| `pk_mileagerecord` | `pk_mileagerecord` | `pk_mileagerecord` | 里程记录主表主键 |
| `pk_beglocation` | `pk_beglocation` | `pk_beglocation` | 出发地点 |
| `pk_endlocatin_modify` | `pk_endlocatin_modify` | `pk_endlocatin_modify` | 到达地点(修改后) |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `vcurrency` | `vcurrency` | `vcurrency` | 币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `pk_expenserecord` | `pk_expenserecord` | `pk_expenserecord` | 主表id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `islocationmodified` | `islocationmodified` | `islocationmodified` | 是否修改过定位 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imileageunit` | `imileageunit` | `imileageunit` | 里程单位 |
| `itraffictype` | `itraffictype` | `itraffictype` | 交通费用类型 |
| `mileagetype` | `mileagetype` | `mileagetype` | 里程模式 |
| `itimeunit` | `itimeunit` | `itimeunit` | 时间单位 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nmileage` | `nmileage` | `nmileage` | 里程(参考里程) |
| `nmileagemodify` | `nmileagemodify` | `nmileagemodify` | 里程(修改后) |
| `nmileagetotaltime` | `nmileagetotaltime` | `nmileagetotaltime` | 里程总时间 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |
| `nsubsidymny` | `nsubsidymny` | `nsubsidymny` | 里程补贴(预估) |
| `nsubsidymodifymny` | `nsubsidymodifymny` | `nsubsidymodifymny` | 里程补贴(修改后) |
| `nnatsubsidymny` | `nnatsubsidymny` | `nnatsubsidymny` | 里程补贴(预估)-本币 |
| `nnatsubsidymodifymny` | `nnatsubsidymodifymny` | `nnatsubsidymodifymny` | 里程补贴(修改后)-本币 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `ndefnum6` | `ndefnum6` | `ndefnum6` | 自定义项(小数)6 |
| `ndefnum7` | `ndefnum7` | `ndefnum7` | 自定义项(小数)7 |
| `ndefnum8` | `ndefnum8` | `ndefnum8` | 自定义项(小数)8 |
| `ndefnum9` | `ndefnum9` | `ndefnum9` | 自定义项(小数)9 |
| `ndefnum10` | `ndefnum10` | `ndefnum10` | 自定义项(小数)10 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expenseRecordBDcs` | `expenseRecordBDcs` | `expenseRecordBDcs` | 费用记事子表自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dbegintime` | `dbegintime` | `dbegintime` | 出发时间 |
| `dendtime` | `dendtime` | `dendtime` | 到达时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
