---
tags: [BIP, 元数据, 数据字典, bd.duty.Posts]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 职位 (`bd.duty.Posts`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_posts` | domain：`ucf-staff-center` | 应用：`DPMSTF` | 业务对象ID：`51e49037-374b-499c-bcd3-0e4f6c50c1ee`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 职位 |
| 物理表 | `bd_posts` |
| 数据库 schema | `ucf-staff-center` |
| 所属应用 | `DPMSTF` |
| 直连字段 | 71 个 |
| 子表 | 1 个 |
| 关联引用 | 21 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.duty.PostsDefine` | composition |

## 关联引用 (21个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `maxrank_id` | `bd_graderef` |
| `modifier` | `` |
| `degree` | `` |
| `os_base_post_id_post_sequence_id` | `MDDHR.postsequence_ref` |
| `secret_id` | `` |
| `suporior` | `ucf-staff-center.bd_posts_ref` |
| `jobtype_id` | `bd_dutyType` |
| `parentid` | `ucf-staff-center.bd_posts_ref` |
| `os_base_post_id` | `MDDHR.basepost_ref` |
| `professional` | `` |
| `` | `ucf-staff-center.bd_dept_tier_ref` |
| `user_define_character` | `` |
| `jobgrade_id` | `bd_rankref` |
| `reqedu` | `` |
| `job_id` | `bd_duty` |
| `org_id` | `ucf-org-center.orgcenter_admin_tree_ref` |
| `minrank_id` | `bd_graderef` |
| `reqtitle` | `` |
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

> 共 71 个直连字段

### 文本字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `code` | `code` | `code` | 职位编码 |
| `duties` | `duties` | `duties` | 职责 |
| `reqworkyear` | `reqworkyear` | `reqworkyear` | 最低工作年限 |
| `reqexp` | `reqexp` | `reqexp` | 工作经验要求 |
| `age` | `age` | `age` | 年龄要求 |
| `reqother` | `reqother` | `reqother` | 其他要求 |
| `attachlist` | `attachlist` | `attachlist` | 附件 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 适用组织范围 |
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
| `log` | `log` | `log` | 删除引用日志 |
| `tenantid` | `tenantid` | `tenantid` | 租户标识 |
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `path` | `path` | `path` | 路径 |
| `sysid` | `sysid` | `sysid` | 应用主键 |
| `innercode` | `innercode` | `innercode` | 内部码 |
| `reqsex` | `reqsex` | `reqsex` | 性别要求  |
| `reqcert` | `reqcert` | `reqcert` | 资格证书要求  |
| `loc_id` | `loc_id` | `loc_id` | 地点 |
| `bu_id` | `bu_id` | `bu_id` | 所属业务群 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org_id` | `org_id` | `org_id` | 所属组织 |
| `os_base_post_id` | `os_base_post_id` | `os_base_post_id` | 基准职位 |
| `os_base_post_id_post_sequence_id` | `os_base_post_id_post_sequence_id` | `os_base_post_id_post_sequence_id` | 职位序列 |
| `job_id` | `job_id` | `job_id` | 职务 |
| `jobtype_id` | `jobtype_id` | `jobtype_id` | 职务类别 |
| `jobgrade_id` | `jobgrade_id` | `jobgrade_id` | 职级 |
| `maxrank_id` | `maxrank_id` | `maxrank_id` | 最高职等 |
| `minrank_id` | `minrank_id` | `minrank_id` | 最低职等 |
| `degree` | `degree` | `degree` | 最低学位要求 |
| `reqedu` | `reqedu` | `reqedu` | 最低学历要求 |
| `professional` | `professional` | `professional` | 专业类别要求 |
| `reqtitle` | `reqtitle` | `reqtitle` | 最低职称要求 |
| `secret_id` | `secret_id` | `secretId` | 职位密级 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户ID |
| `tenantid` | `tenantid` | `tenant` | 租户 |
| `parentid` | `parentid` | `parentid` | 上级职位 |
| `suporior` | `suporior` | `suporior` | 直接上级 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `establishdate` | `establishdate` | `establishdate` | 成立日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isEnd` | `isEnd` | 是否末级 |

### 整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `secret_level` | `secret_level` | `secret_level` | 密级 |
| `dr` | `dr` | `dr` | 逻辑删除标识 |
| `level` | `level` | `level` | 层级 |
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `maxage` | `maxage` | `maxage` | 最高年龄要求  |
| `minage` | `minage` | `minage` | 最低年龄要求  |
| `reqworktime` | `reqworktime` | `reqworktime` | 最低工作年限  |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 职位名称 |
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
| `start_time` | `start_time` | `starttime` | 开始时间 |
| `end_time` | `end_time` | `endtime` | 结束时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `defines` | 职位自定义项 |
