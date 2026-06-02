---
tags: [BIP, 元数据, 数据字典, bd, bd.duty.Position]
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

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_position` | 应用: `DPMSTF`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（73 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 4 | `org_id` | org_id | `org_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 5 | `dept_id` | dept_id | `dept_id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 6 | `parentid` | parentid | `parentid` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |  | true |
| 7 | `os_base_post_id` | os_base_post_id | `os_base_post_id` | 1f2ee834-9d35-46db-aa22-095ecc9822d5 | `quote` |  | true |
| 8 | `os_base_post_id_post_sequence_id` | os_base_post_id_post_sequence_id | `os_base_post_id_post_sequence_id` | 15d5b4d6-dff7-43f4-888f-e7819f438f39 | `quote` |  | true |
| 9 | `jobtype_id` | jobtype_id | `jobtype_id` | b2f08443-e693-453c-a005-3c1dcc11af06 | `quote` |  | true |
| 10 | `job_id` | job_id | `job_id` | 9703c8bf-0092-4566-96bd-933cc03c0acd | `quote` |  | true |
| 11 | `jobgrade_id` | jobgrade_id | `jobgrade_id` | 7dfa7985-5073-4394-8f4f-cea8d1829b84 | `quote` |  | true |
| 12 | `maxrank_id` | maxrank_id | `maxrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |  | true |
| 13 | `minrank_id` | minrank_id | `minrank_id` | e00dd36a-aace-43d2-9e87-156b36799fef | `quote` |  | true |
| 14 | `reqworkyear` | reqworkyear | `reqworkyear` | String | `text` |  | true |
| 15 | `age` | age | `age` | String | `text` |  | true |
| 16 | `reqexp` | reqexp | `reqexp` | String | `text` |  | true |
| 17 | `professional` | professional | `professional` | 8935eea7-a8ae-456e-85a4-59f1abc98510 | `quote` |  | true |
| 18 | `reqedu` | reqedu | `reqedu` | 7d8e412e-5d19-49be-8ce6-3cb86a119303 | `quote` |  | true |
| 19 | `degree` | degree | `degree` | 14179483-26fd-4645-9b5d-d839ea01c3b7 | `quote` |  | true |
| 20 | `reqtitle` | reqtitle | `reqtitle` | 0d044175-47e5-4e07-87bd-4ebcc83a16a9 | `quote` |  | true |
| 21 | `reqother` | reqother | `reqother` | String | `text` |  | true |
| 22 | `user_define_character` | user_define_character | `user_define_character` | 5a8e35d3-31c9-404d-b05a-769b57656940 | `UserDefine` |  | true |
| 23 | `duties` | duties | `duties` | String | `text` |  | true |
| 24 | `memo` | 备注 | `memo` | String | `multiLanguage` |  | true |
| 25 | `attachlist` | attachlist | `attachlist` | String | `text` |  | true |
| 26 | `freeze` | freeze | `freeze` | Integer | `int` |  | true |
| 27 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 28 | `secretId` | secretID | `secret_id` | c988512d-0515-4700-9b26-2ea43685ce64 | `quote` |  | true |
| 29 | `secret_level` | secret_level | `secret_level` | Integer | `int` |  | true |
| 30 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 31 | `createTime` | 创建时间 | `creationtime` | DateTime | `timestamp` |  | true |
| 32 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 33 | `modifyTime` | 修改时间 | `modifiedtime` | DateTime | `timestamp` |  | true |
| 34 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 35 | `name2` | name2 | `name2` | String | `text` |  | true |
| 36 | `name3` | name3 | `name3` | String | `text` |  | true |
| 37 | `name4` | name4 | `name4` | String | `text` |  | true |
| 38 | `name5` | name5 | `name5` | String | `text` |  | true |
| 39 | `name6` | name6 | `name6` | String | `text` |  | true |
| 40 | `memo2` | memo2 | `memo2` | String | `text` |  | true |
| 41 | `memo3` | memo3 | `memo3` | String | `text` |  | true |
| 42 | `memo4` | memo4 | `memo4` | String | `text` |  | true |
| 43 | `memo5` | memo5 | `memo5` | String | `text` |  | true |
| 44 | `memo6` | memo6 | `memo6` | String | `text` |  | true |
| 45 | `ts` | ts | `ts` | DateTime | `timestamp` |  | false |
| 46 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 47 | `objid` | objid | `objid` | String | `text` |  | true |
| 48 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 49 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 50 | `distributionSite` | distributionSite | `distribution_site` | String | `text` |  | true |
| 51 | `log` | log | `log` | String | `text` |  | true |
| 52 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 53 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 54 | `tenantid` | tenantid | `tenantid` | String | `text` |  | true |
| 55 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |
| 56 | `establishdate` | establishdate | `establishdate` | Date | `date` |  | true |
| 57 | `innercode` | innercode | `innercode` | String | `text` |  | true |
| 58 | `isEnd` | 是否End | `isEnd` | Boolean | `switch` |  | true |
| 59 | `level` | level | `level` | Integer | `int` |  | true |
| 60 | `loc_id` | loc_id | `loc_id` | String | `text` |  | true |
| 61 | `maxage` | maxage | `maxage` | Integer | `int` |  | true |
| 62 | `minage` | minage | `minage` | Integer | `int` |  | true |
| 63 | `parent` | parent | `parent_id` | String | `text` |  | true |
| 64 | `path` | path | `path` | String | `text` |  | true |
| 65 | `reqcert` | reqcert | `reqcert` | String | `text` |  | true |
| 66 | `reqsex` | reqsex | `reqsex` | String | `text` |  | true |
| 67 | `reqworktime` | reqworktime | `reqworktime` | Integer | `int` |  | true |
| 68 | `sort` | sort | `sort_num` | Integer | `int` |  | true |
| 69 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 70 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 71 | `suporior` | suporior | `suporior` | a06cee30-92b1-4a03-b399-3886f55e4ba1 | `quote` |  | true |
| 72 | `bu_id` | bu_id | `bu_id` | String | `text` |  | true |
| 73 | `defines` | defines | `` | 2070104d-d725-44b1-aabc-d1ede6329d92 | `` |  |  |

## 关联属性（22 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `maxrank_id` | `bd.duty.Grade` | `maxrank_id` |  |  |  |
| 4 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |
| 5 | `degree` | `hred.degreefiles.Degreefiles` | `degree` |  |  |  |
| 6 | `os_base_post_id_post_sequence_id` | `os.post.PostSequenceVO` | `os_base_post_id_post_sequence_id` |  |  |  |
| 7 | `secretId` | `sys.secret.UserSecretObj` | `secret_id` |  |  |  |
| 8 | `suporior` | `bd.duty.Position` | `suporior` |  |  |  |
| 9 | `jobtype_id` | `bd.duty.DutyType` | `jobtype_id` |  |  |  |
| 10 | `parentid` | `bd.duty.Position` | `parentid` |  |  |  |
| 11 | `os_base_post_id` | `os.post.BasePostVO` | `os_base_post_id` |  |  |  |
| 12 | `professional` | `bd.customerdoc_0024.0024` | `professional` |  |  |  |
| 13 | `defines` | `bd.duty.PositionDefine` | `` | 1 | Y |  |
| 14 | `user_define_character` | `bd.duty.PositionDefineCharacter` | `user_define_character` |  |  |  |
| 15 | `jobgrade_id` | `bd.duty.Rank` | `jobgrade_id` |  |  |  |
| 16 | `reqedu` | `hred.education.Education` | `reqedu` |  |  |  |
| 17 | `job_id` | `bd.duty.Duty` | `job_id` |  |  |  |
| 18 | `org_id` | `bd.adminOrg.AdminOrgVO` | `org_id` |  |  |  |
| 19 | `minrank_id` | `bd.duty.Grade` | `minrank_id` |  |  |  |
| 20 | `reqtitle` | `bd.customerdoc_0011.0011` | `reqtitle` |  |  |  |
| 21 | `dept_id` | `bd.adminOrg.AdminOrgVO` | `dept_id` |  |  |  |
| 22 | `tenant` | `yht.tenant.YhtTenant` | `tenantid` |  |  |  |

## 依赖接口（10 个）

- `BasedocIState` → `basedoc.basedocItf.BasedocIState` (v101)
- `BasedocITenant` → `basedoc.basedocItf.BasedocITenant` (v103)
- `ITree` → `basedoc.basedocItf.ITree` (v336)
- `ISystemInfo` → `bd.itf.ISystemInfo` (v77)
- `IAutoCode` → `voucher.base.IAutoCode` (v49)
- `ITimeLineDoc` → `hred.itf.ITimeLineDoc` (v75)
- `ITimeLineBusiness` → `hred.itf.ITimeLineBusiness` (v24)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `LogicDelete` → `basedoc.basedocItf.LogicDelete` (v31)
- `IAuditInfo` → `ucfbase.ucfbaseItf.IAuditInfo` (v192)

## SQL 示例

```sql
SELECT id, code, name, org_id, dept_id, parentid, os_base_post_id, os_base_post_id_post_sequence_id
FROM bd_position
```