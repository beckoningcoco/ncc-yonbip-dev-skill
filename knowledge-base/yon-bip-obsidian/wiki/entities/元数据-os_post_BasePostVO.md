---
tags: [BIP, 元数据, 数据字典, os.post.BasePostVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 基准职位 (`os.post.BasePostVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`os_base_post` | domain：`MDDHR` | 应用：`HRORG` | 业务对象ID：`d017c688-acae-4ef4-a54a-ff1f27a336f3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 基准职位 |
| 物理表 | `os_base_post` |
| domain/服务域 | `MDDHR` |
| schema | `hr_orgsystem` |
| 所属应用 | `HRORG` |
| 直连字段 | 45 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `education` | `hrcloud-staff-mgr.hred_educationref` |
| `major_id` | `ucfbasedoc.0024` |
| `ytenant_id` | `` |
| `maxrank_id` | `ucf-staff-center.bd_graderef` |
| `job_title` | `ucfbasedoc.0011` |
| `modifier` | `` |
| `degree` | `hrcloud-staff-mgr.hred_degreeref` |
| `job_type_id` | `ucf-staff-center.bd_dutyType` |
| `org_id` | `ucf-org-center.bd_adminorgtreeviewref` |
| `user_define_character` | `` |
| `jobrank_id` | `ucf-staff-center.bd_rankref` |
| `post_sequence_id` | `MDDHR.postsequence_ref` |
| `duty_id` | `ucf-org-center.bd_duty` |
| `distribution_site` | `` |
| `minrank_id` | `ucf-staff-center.bd_graderef` |

## 继承接口 (9个, 14字段)

- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **逻辑删除相关** (`ucfbase.ucfbaseItf.LogicDelete`)
  - `dr` → `dr`
- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **时间轴档案** (`hred.itf.ITimeLineDoc`)
  - `end_time` → `end_time`
  - `start_time` → `start_time`
- **时间轴业务实体** (`hred.itf.ITimeLineBusiness`)
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **站点** (`hrbase.hrbaseItf.IDistributionSource`)
  - `distribution_site` → `distribution_site`

## 字段列表（按类型分组）

> 共 45 个直连字段

### 文本字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 基准职位编码 |
| `jobduty` | `jobduty` | `jobDuty` | 工作职责 |
| `work_experience` | `work_experience` | `workExperience` | 工作经验要求 |
| `workyear` | `workyear` | `workYear` | 最低工作年限 |
| `age` | `age` | `age` | 年龄要求 |
| `other` | `other` | `other` | 其他要求 |
| `attachlist` | `attachlist` | `attachlist` | 附件 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 适用组织范围 |
| `name2` | `name2` | `name2` | 名称备注2 |
| `name3` | `name3` | `name3` | 名称备注3 |
| `name4` | `name4` | `name4` | 名称备注4 |
| `name5` | `name5` | `name5` | 名称备注5 |
| `name6` | `name6` | `name6` | 名称备注6 |
| `objid` | `objid` | `objid` | 同步主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `professional` | `professional` | `professional` | 职业 |
| `job_kind` | `job_kind` | `jobKind` | 工种 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `orgId` | 所属组织 |
| `post_sequence_id` | `post_sequence_id` | `postSequenceId` | 职位序列 |
| `job_type_id` | `job_type_id` | `jobtype_id` | 职务类别 |
| `duty_id` | `duty_id` | `job_id` | 职务 |
| `jobrank_id` | `jobrank_id` | `jobgrade_id` | 职级 |
| `minrank_id` | `minrank_id` | `minrank_id` | 最低职等 |
| `maxrank_id` | `maxrank_id` | `maxrank_id` | 最高职等 |
| `major_id` | `major_id` | `majorId` | 专业类别 |
| `education` | `education` | `education` | 最低学历要求 |
| `degree` | `degree` | `degree` | 最低学位要求 |
| `job_title` | `job_title` | `jobTitle` | 最低职称要求 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectivedate` | `effectivedate` | `effectiveDate` | 生效日期 |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除标记 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 基准职位名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `start_time` | `start_time` | `starttime` | 开始时间 |
| `end_time` | `end_time` | `endtime` | 结束时间 |
