---
tags: [BIP, 元数据, 数据字典, znbzbx.mileagerecord.MileageRecordVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 里程记录 (`znbzbx.mileagerecord.MileageRecordVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_mileagerecord` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`6ce4e7da-e2e5-47f8-8543-e0aeb105a8fa`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 里程记录 |
| 物理表 | `znbz_mileagerecord` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 83 个 |
| 子表 | 2 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `mileagerecordbs` | `znbzbx.mileagerecord.MileageRecordBVO` | composition |
| `mileagerecordgps` | `znbzbx.mileagerecord.MileageRecordGpsBVO` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `pk_begareaclass` | `znbzbx_areaclassref` |
| `pk_endareaclass` | `znbzbx_areaclassref` |
| `` | `` |
| `pk_endaddr` | `ucfbasedoc.location_list_ref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_begaddr` | `ucfbasedoc.location_list_ref` |
| `pk_endlocatin` | `znbzbx_mileagerecordref` |
| `mileagerecordDcs` | `` |
| `pk_expenserecord` | `` |
| `pk_dutypost` | `ucf-staff-center.bd_positiontreeref` |
| `tenant_id` | `` |
| `pk_dutygrade` | `ucf-staff-center.bd_graderef` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_beglocation` | `znbzbx_mileagerecordref` |
| `ytenant_id` | `` |
| `bustype` | `ucfbasedoc.bd_billtyperef` |
| `pk_mileagecontrol` | `znbzbx_mileagecontrolref` |
| `pk_beglocation_modify` | `znbzbx_mileagerecordref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_endlocatin_modify` | `znbzbx_mileagerecordref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (4个, 11字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``

## 字段列表（按类型分组）

> 共 83 个直连字段

### 文本字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 里程记录编号 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `` | `creator` | `creator` | 创建人名称 |
| `vcause` | `vcause` | `vcause` | 事由 |
| `vperiod` | `vperiod` | `vperiod` | 里程期间 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `joblistid` | `joblistid` | `joblistid` | 任职 |
| `vtravelingtrackurl` | `vtravelingtrackurl` | `vtravelingtrackurl` | 行程轨迹 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 附件id |
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

### 引用字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_beglocation` | `pk_beglocation` | `pk_beglocation` | 出发地点 |
| `pk_beglocation_modify` | `pk_beglocation_modify` | `pk_beglocation_modify` | 出发地点 |
| `pk_endlocatin` | `pk_endlocatin` | `pk_endlocatin` | 到达地点 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_expenserecord` | `pk_expenserecord` | `pk_expenserecord` | 费用记事表头 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `pk_endlocatin_modify` | `pk_endlocatin_modify` | `pk_endlocatin_modify` | 到达地点 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 报销人 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `pk_mileagecontrol` | `pk_mileagecontrol` | `pk_mileagecontrol` | 控制规则 |
| `chandleorg` | `chandleorg` | `chandleorg` | 报销人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 报销人部门 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | BIP档案地点-出发地 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | BIP档案地点-到达地 |
| `pk_dutygrade` | `pk_dutygrade` | `pk_dutygrade` | 职等 |
| `pk_begareaclass` | `pk_begareaclass` | `pk_begareaclass` | BIP城市分级-出发地 |
| `pk_endareaclass` | `pk_endareaclass` | `pk_endareaclass` | BIP城市分级-到达地 |
| `vcurrency` | `vcurrency` | `vcurrency` | 原币币种 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dmileagedate` | `dmileagedate` | `dmileagedate` | 里程日期 |
| `vouchdate` | `vouchdate` | `vouchdate` | 单据日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `islocationmodified` | `islocationmodified` | `islocationmodified` | 是否修改过定位 |
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |

### 短整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `irecordcreatetype` | `irecordcreatetype` | `irecordcreatetype` | 里程模式 |
| `itraffictype` | `itraffictype` | `itraffictype` | 交通费用类型 |
| `imileageunit` | `imileageunit` | `imileageunit` | 里程单位 |
| `itimeunit` | `itimeunit` | `itimeunit` | 时间单位 |
| `status` | `status` | `status` | 状态 |
| `iexpensestatus` | `iexpensestatus` | `iexpensestatus` | 报销状态 |
| `imapprovider` | `imapprovider` | `imapprovider` | 地图供给方 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nmileage` | `nmileage` | `nmileage` | 参考里程 |
| `nmileagemodify` | `nmileagemodify` | `nmileagemodify` | 实际里程 |
| `nsubsidymny` | `nsubsidymny` | `nsubsidymny` | 里程补贴(预估) |
| `nsubsidymodifymny` | `nsubsidymodifymny` | `nsubsidymodifymny` | 里程补贴(修改后) |
| `nmileagetotaltime` | `nmileagetotaltime` | `nmileagetotaltime` | 里程总时间 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 基准汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 汇率 |
| `nnatsubsidymodifymny` | `nnatsubsidymodifymny` | `nnatsubsidymodifymny` | 补贴金额(修改后)-本币 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dbegintime` | `dbegintime` | `dbegintime` | 出发时间 |
| `dendtime` | `dendtime` | `dendtime` | 到达时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `mileagerecordDcs` | `mileagerecordDcs` | `mileagerecordDcs` | 里程记录自定义项 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `mileagerecordbs` | 里程记录子表 |
| `` | `` | `mileagerecordgps` | 里程轨迹打点信息表 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
