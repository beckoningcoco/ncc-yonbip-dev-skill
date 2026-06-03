---
tags: [BIP, 元数据, 数据字典, znbzbx.expenserecord.ExpenseRecordVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 费用记事主表 (`znbzbx.expenserecord.ExpenseRecordVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expenserecord` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`e0cc05c5-cc2e-4993-83db-bcc407f37148`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 费用记事主表 |
| 物理表 | `znbz_expenserecord` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 95 个 |
| 子表 | 2 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `expenserecordbs` | `znbzbx.expenserecord.ExpenseRecordBVO` | composition |
| `exprecordinvdetails` | `znbzbx.expenserecord.ExpRecordInvDetailVO` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `activity` | `` |
| `` | `` |
| `wbs` | `` |
| `pk_endaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `pk_project` | `` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_begaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `pk_expensebill_b` | `` |
| `pk_expensebill` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `expenseRecordDcs` | `` |
| `pk_dutypost` | `` |
| `tenant_id` | `` |
| `pk_dutyjob` | `` |
| `pk_dutyrank` | `` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `bustype` | `bd_billtyperef` |
| `pk_busimemo` | `bd_expenseitemref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_costpsndoc` | `ucf-staff-center.bd_staff_ref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (4个, 7字段)

- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 95 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 记事编号 |
| `travelalgorithmgranularity` | `travelalgorithmgranularity` | `travelalgorithmgranularity` | 参与行程算法 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `pk_endlocatin_modify_name` | `pk_endlocatin_modify_name` | `pk_endlocatin_modify_name` | 到达地点 |
| `joblistid` | `joblistid` | `joblistid` | 任职ID |
| `pk_beglocation_modify_name` | `pk_beglocation_modify_name` | `pk_beglocation_modify_name` | 出发地点 |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `vreason` | `vreason` | `vreason` | 事由 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
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

### 引用字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_expensebill_b` | `pk_expensebill_b` | `pk_expensebill_b` | 报销单明细行ID |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发地点 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 到达地点 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 报销单主表主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 职位 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 报销人 |
| `pk_costpsndoc` | `pk_costpsndoc` | `pk_costpsndoc` | 费用归属人 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 报销人部门 |
| `chandleorg` | `chandleorg` | `chandleorg` | 报销人组织 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `vcurrency` | `vcurrency` | `vcurrency` | 记事币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `denddate` | `denddate` | `denddate` | 结束日期 |
| `dbegindate` | `dbegindate` | `dbegindate` | 开始日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 记事日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `blongdistance` | `blongdistance` | `blongdistance` | 是否长途交通 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mileageCount` | `mileageCount` | `mileageCount` | 里程数量 |
| `invoiceCount` | `invoiceCount` | `invoiceCount` | 里程数量 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `recordtype` | `recordtype` | `recordtype` | 记事类型 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `ibusistatus` | `ibusistatus` | `ibusistatus` | 业务状态 |
| `imileageunit` | `imileageunit` | `imileageunit` | 里程单位 |
| `` | `status` | `status` | 状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nmileage` | `nmileage` | `nmileage` | 里程(参考里程) |
| `nmileagemodify` | `nmileagemodify` | `nmileagemodify` | 里程(修改后) |
| `nrecordsubsidymny` | `nrecordsubsidymny` | `nrecordsubsidymny` | 记事补贴金额 |
| `ninvsummny` | `ninvsummny` | `ninvsummny` | 发票价税合计 |
| `ninvtaxmny` | `ninvtaxmny` | `ninvtaxmny` | 发票可抵扣税额 |
| `ninvuntaxmny` | `ninvuntaxmny` | `ninvuntaxmny` | 发票不含税金额 |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 可报销金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 可抵扣税额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |
| `nnatrecordsubsidymny` | `nnatrecordsubsidymny` | `nnatrecordsubsidymny` | 记事补贴金额-本币 |
| `nnatinvsummny` | `nnatinvsummny` | `nnatinvsummny` | 发票价税合计-本币 |
| `nnatinvtaxmny` | `nnatinvtaxmny` | `nnatinvtaxmny` | 发票可抵扣税额-本币 |
| `nnatinvuntaxmny` | `nnatinvuntaxmny` | `nnatinvuntaxmny` | 发票不含税金额-本币 |
| `nnatexpensemny` | `nnatexpensemny` | `nnatexpensemny` | 可报销金额-本币 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 可抵扣税额-本币 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `expenserecordbs` | 里程明细 |
| `` | `` | `exprecordinvdetails` | 费用记事账单明细 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expenseRecordDcs` | `expenseRecordDcs` | `expenseRecordDcs` | 费用记事自定义项 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
