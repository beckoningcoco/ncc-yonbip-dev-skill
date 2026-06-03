---
tags: [BIP, 元数据, 数据字典, bd.duty.Position]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 岗位 (`bd.duty.Position`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_position` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`6dfc18b4-bfff-4e51-96e6-baf8bf978001`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 岗位 |
| 物理表 | `bd_position` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 73 个 |
| 子表 | 1 个 |
| 关联引用 | 22 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.duty.PositionDefine` | composition |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `maxrank_id` | `ucf-staff-center.bd_graderef` |
| `modifier` | `` |
| `degree` | `hrcloud-staff-mgr.hred_degreeref` |
| `os_base_post_id_post_sequence_id` | `MDDHR.postsequence_ref` |
| `secret_id` | `` |
| `suporior` | `ucf-staff-center.bd_position_ref` |
| `jobtype_id` | `ucf-staff-center.bd_dutyType` |
| `parentid` | `ucf-staff-center.bd_position_ref` |
| `os_base_post_id` | `MDDHR.basepost_ref` |
| `professional` | `ucfbasedoc.0024` |
| `` | `` |
| `user_define_character` | `` |
| `jobgrade_id` | `ucf-staff-center.bd_rankref` |
| `reqedu` | `hrcloud-staff-mgr.hred_educationref` |
| `job_id` | `ucf-staff-center.bd_duty` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `minrank_id` | `ucf-staff-center.bd_graderef` |
| `reqtitle` | `ucfbasedoc.0011` |
| `dept_id` | `ucf-org-center.admin_dept_tree_ref` |
| `tenantid` | `` |

## 继承接口 (10个, 20字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **UCF公共租户相关** (`basedoc.basedocItf.BasedocITenant`)
  - `tenantid` → `tenantid`
- **树型结构** (`basedoc.basedocItf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **审批信息** (`bd.itf.ISystemInfo`)
  - `dr` → `dr`
  - `enable` → `enable`
  - `sysid` → `sysid`
  - `tenantid` → `tenantid`
  - `ts` → `ts`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **时间轴档案** (`hred.itf.ITimeLineDoc`)
  - `end_time` → `end_time`
  - `start_time` → `start_time`
- **时间轴业务实体** (`hred.itf.ITimeLineBusiness`)
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`ucfbase.ucfbaseItf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 73 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 岗位编码 |
| `reqworkyear` | `reqworkyear` | `reqworkyear` | 最低工作年限 |
| `age` | `age` | `age` | 年龄要求 |
| `reqexp` | `reqexp` | `reqexp` | 工作经验要求  |
| `reqother` | `reqother` | `reqother` | 其他要求 |
| `duties` | `duties` | `duties` | 职责 |
| `attachlist` | `attachlist` | `attachlist` | 附件 |
| `name2` | `name2` | `name2` | 名称备用2 |
| `name3` | `name3` | `name3` | 名称备用3 |
| `name4` | `name4` | `name4` | 名称备用4 |
| `name5` | `name5` | `name5` | 名称备用5 |
| `name6` | `name6` | `name6` | 名称备用6 |
| `memo2` | `memo2` | `memo2` | 备注备用2 |
| `memo3` | `memo3` | `memo3` | 备注备用3 |
| `memo4` | `memo4` | `memo4` | 备注备用4 |
| `memo5` | `memo5` | `memo5` | 备注备用5 |
| `memo6` | `memo6` | `memo6` | 备注备用6 |
| `objid` | `objid` | `objid` | 友企联同步主键 |
| `businessid` | `businessid` | `businessid` | 友企联同步业务主键 |
| `distribution_site` | `distribution_site` | `distributionSite` | 来源站点 |
| `log` | `log` | `log` | 删除引用日志 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `loc_id` | `loc_id` | `loc_id` | 地点 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `path` | `path` | `path` | 路径 |
| `reqcert` | `reqcert` | `reqcert` | 资格证书要求  |
| `reqsex` | `reqsex` | `reqsex` | 性别要求  |
| `sysid` | `sysid` | `sysid` | 应用主键 |
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `org_id` | 所属组织 |
| `dept_id` | `dept_id` | `dept_id` | 所属部门 |
| `parentid` | `parentid` | `parentid` | 上级岗位 |
| `os_base_post_id` | `os_base_post_id` | `os_base_post_id` | 基准职位 |
| `os_base_post_id_post_sequence_id` | `os_base_post_id_post_sequence_id` | `os_base_post_id_post_sequence_id` | 职位序列 |
| `jobtype_id` | `jobtype_id` | `jobtype_id` | 职务类别 |
| `job_id` | `job_id` | `job_id` | 职务 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `maxrank_id` | `maxrank_id` | `maxrank_id` | 最高职等 |
| `minrank_id` | `minrank_id` | `minrank_id` | 最低职等 |
| `professional` | `professional` | `professional` | 专业类别要求  |
| `reqedu` | `reqedu` | `reqedu` | 最低学历要求  |
| `degree` | `degree` | `degree` | 最低学位要求  |
| `reqtitle` | `reqtitle` | `reqtitle` | 最低职称要求 |
| `secret_id` | `secret_id` | `secretId` | 岗位密级 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `suporior` | `suporior` | `suporior` | 直接上级 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `establishdate` | `establishdate` | `establishdate` | 成立日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `freeze` | `freeze` | `freeze` | 冻结状态 |
| `enable` | `enable` | `enable` | 状态 |
| `secret_level` | `secret_level` | `secret_level` | 密级 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `level` | `level` | `level` | 层级 |
| `maxage` | `maxage` | `maxage` | 最高年龄要求  |
| `minage` | `minage` | `minage` | 最低年龄要求  |
| `reqworktime` | `reqworktime` | `reqworktime` | 最低工作年限  |
| `sort_num` | `sort_num` | `sort` | 排序号 |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 岗位名称 |
| `memo` | `memo` | `memo` | 备注 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `user_define_character` | `user_define_character` | `user_define_character` | 特征 |

### timestamp (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `ts` | `ts` | `ts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `synchts` | `synchts` | `synchts` | 友企联同步时间戳 |
| `end_time` | `end_time` | `endtime` | 结束时间 |
| `start_time` | `start_time` | `starttime` | 开始时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 岗位自定义项 |
