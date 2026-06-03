---
tags: [BIP, 元数据, 数据字典, znbzbx.commonexpensebill.CommonExpenseBillMileageVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 通用报销单记事 (`znbzbx.commonexpensebill.CommonExpenseBillMileageVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expensebill_mileage` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 通用报销单记事 |
| 物理表 | `znbz_expensebill_mileage` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 79 个 |
| 子表 | 1 个 |
| 关联引用 | 26 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `expensebillmileageuserdefs` | `znbzbx.commonexpensebill.CommonExpenseBillMileageUserdefVO` | composition |

## 关联引用 (26个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `activity` | `` |
| `expensebillmileageDcs` | `` |
| `wbs` | `` |
| `pk_endaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `pk_project` | `` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_begaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `pk_expensebill` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_expenserecord` | `` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `` | `` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `bd_billtyperef` |
| `pk_busimemo` | `` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_costpsndoc` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 字段列表（按类型分组）

> 共 79 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `travelalgorithmgranularity` | `travelalgorithmgranularity` | `travelalgorithmgranularity` | 参与行程算法 |
| `vtriprelatefield` | `vtriprelatefield` | `vtriprelatefield` | 报销行程关联字段 |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `pk_beglocation_modify_name` | `pk_beglocation_modify_name` | `pk_beglocation_modify_name` | 出发地点 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `pk_endlocatin_modify_name` | `pk_endlocatin_modify_name` | `pk_endlocatin_modify_name` | 到达地点 |
| `recordcode` | `recordcode` | `recordcode` | 记事编号 |
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
| `vreason` | `vreason` | `vreason` | 事由 |

### 引用字段 (24个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `chandleorg` | `chandleorg` | `chandleorg` | 报销人组织 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发城市 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_costpsndoc` | `pk_costpsndoc` | `pk_costpsndoc` | 费用归属人 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 到达城市 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 通用报销单主表id |
| `pk_expenserecord` | `pk_expenserecord` | `pk_expenserecord` | 记事id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 报销人 |
| `vcurrency` | `vcurrency` | `vcurrency` | 记事币种 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 报销人部门 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dbegindate` | `dbegindate` | `dbegindate` | 开始日期 |
| `denddate` | `denddate` | `denddate` | 结束日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 记事日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `blongdistance` | `blongdistance` | `blongdistance` | 是否长途交通 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ibusistatus` | `ibusistatus` | `ibusistatus` | 业务状态 |
| `imileageunit` | `imileageunit` | `imileageunit` | 里程单位 |
| `recordtype` | `recordtype` | `recordtype` | 记事类型 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_expensetrip` | `pk_expensetrip` | `pk_expensetrip` | 报销行程id |

### 数值字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 可报销金额 |
| `ninvsummny` | `ninvsummny` | `ninvsummny` | 账单价税合计 |
| `ninvtaxmny` | `ninvtaxmny` | `ninvtaxmny` | 账单可抵扣税额 |
| `ninvuntaxmny` | `ninvuntaxmny` | `ninvuntaxmny` | 账单不含税金额 |
| `nmileage` | `nmileage` | `nmileage` | 里程(参考里程) |
| `nmileagemodify` | `nmileagemodify` | `nmileagemodify` | 里程(修改后) |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatexpensemny` | `nnatexpensemny` | `nnatexpensemny` | 可报销金额-本币 |
| `nnatinvsummny` | `nnatinvsummny` | `nnatinvsummny` | 账单价税合计-本币 |
| `nnatinvtaxmny` | `nnatinvtaxmny` | `nnatinvtaxmny` | 账单可抵扣税额-本币 |
| `nnatinvuntaxmny` | `nnatinvuntaxmny` | `nnatinvuntaxmny` | 账单不含税金额-本币 |
| `nnatrecordsubsidymny` | `nnatrecordsubsidymny` | `nnatrecordsubsidymny` | 记事补贴金额-本币 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 可抵扣税额-本币 |
| `nrecordsubsidymny` | `nrecordsubsidymny` | `nrecordsubsidymny` | 记事补贴金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 可抵扣税额 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `expensebillmileageuserdefs` | 通用报销单记事（自定义项）表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expensebillmileageDcs` | `expensebillmileageDcs` | `expensebillmileageDcs` | 记事自定义项 |
