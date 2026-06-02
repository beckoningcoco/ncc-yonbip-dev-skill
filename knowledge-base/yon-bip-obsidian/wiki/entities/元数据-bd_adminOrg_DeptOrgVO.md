---
tags: [BIP, 元数据, 数据字典, bd, bd.adminOrg.DeptOrgVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 部门(内部专用) (`bd.adminOrg.DeptOrgVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_admin` | 应用: `GZTORG` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 部门(内部专用) |
| 物理表 | `org_admin` |
| 应用 | `GZTORG` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-23 00:06:21:000
- 安装来源: `/app/orgcenter/iuap-apcom-org/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apcom-org/0010_iuap_common/DML/0270_iuap_metadata/202604/202604201907_metadata_bd-adminOrg_delta.zip`

## 术语标记

`isAssigned`, `isExtend`, `isMultiCodeRule`, `MasterData`, `isMain`, `isOrg`, `report`, `doc`, `DirectConnection`, `state_tag`, `isUseCondition`

## 依赖接口（7 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BasedocITenant (`BasedocITenant`) | `basedoc.basedocItf.BasedocITenant` | 103 | 1 |
| ITree (`ITree`) | `basedoc.basedocItf.ITree` | 336 | 5 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |
| IDept (`IDept`) | `org.base.IDept` | 10 | 3 |

---

## 全部属性（83 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `shortname` | shortname | `shortname` | String | `multiLanguage` |  | true |
| 5 | `companytype` | ompanytype | `companytype` | 45cbc79d-a41a-41e4-af94-b264ce83596a | `quote` |  | true |
| 6 | `parent` | parent | `parentid` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |  | true |
| 7 | `parentid` | parentid | `parentid` | ca871996-b447-42f9-8dac-dd7c21ee0662 | `quote` |  | true |
| 8 | `innercode` | nnercode(ID) | `innercode` | String | `text` |  | true |
| 9 | `is_biz_unit` | 是否_biz_unit | `is_biz_unit` | Integer | `int` |  | true |
| 10 | `isbizunit` | 是否bizunit | `is_biz_unit` | Integer | `int` |  | true |
| 11 | `parentorgid` | parentorgid | `parentorgid` | 14302233-1394-4a70-94e1-bed51636f312 | `quote` |  | true |
| 12 | `orgtype` | orgtype | `orgtype` | Integer | `int` |  | true |
| 13 | `depttype` | epttype(日期) | `depttype` | 3bb6a10a-b3a8-438b-a891-3f81baf7a850 | `quote` |  | true |
| 14 | `principal` | principal | `principal` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 15 | `branchleader` | branchleader | `branchleader` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 | `quote` |  | true |
| 16 | `locationid` | locationid | `locationid` | 95256905-1d37-4ca6-a37f-ddbdab4d1c25 | `quote` |  | true |
| 17 | `taxpayerid` | taxpayerid | `taxpayerid` | String | `text` |  | true |
| 18 | `address` | 地址 | `address` | String | `multiLanguage` |  | true |
| 19 | `contact` | ontact | `contact` | String | `text` |  | true |
| 20 | `telephone` | telephone | `telephone` | String | `text` |  | true |
| 21 | `timezone` | timezone | `timezone` | String | `text` |  | true |
| 22 | `description` | 描述 | `description` | String | `multiLanguage` |  | true |
| 23 | `level` | level | `level` | Integer | `int` |  | true |
| 24 | `displayorder` | isplayorder(日期) | `displayorder` | Integer | `int` |  | true |
| 25 | `sort` | 排序号 | `displayorder` | Integer | `int` |  | true |
| 26 | `globalorder` | globalorder | `global_order` | Integer | `int` |  | true |
| 27 | `objid` | objid | `objid` | String | `text` |  | true |
| 28 | `countryzone` | ountryzone | `countryzone` | String | `text` |  | true |
| 29 | `corpid` | orpid | `corpid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 30 | `deptdefinefeature` | eptdefinefeature(日期) | `deptcharacterid` | f1a3c9b3-db68-45b4-98ed-c77e912d1e9d | `UserDefine` |  | true |
| 31 | `isdefault` | 是否default | `isdefault` | Integer | `int` |  | true |
| 32 | `isEnd` | 是否End | `isEnd` | Integer | `int` |  | true |
| 33 | `orgfunctype` | orgfunctype | `log` | String | `text` |  | true |
| 34 | `frozen` | rozen(金额) | `frozen` | Integer | `int` |  | true |
| 35 | `frozentime` | rozentime(金额) | `frozen_time` | Date | `date` |  | true |
| 36 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 37 | `starttime` | starttime | `start_time` | DateTime | `timestamp` |  | true |
| 38 | `effectivedate` | effectivedate | `effectivedate` | DateTime | `timestamp` |  | true |
| 39 | `endtime` | endtime | `end_time` | DateTime | `timestamp` |  | true |
| 40 | `expirationdate` | expirationdate | `expirationdate` | DateTime | `timestamp` |  | true |
| 41 | `closed` | losed | `closed` | Integer | `int` |  | true |
| 42 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 43 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 44 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 45 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 46 | `sourceid` | sourceid | `sourceid` | String | `text` |  | true |
| 47 | `externalorg` | externalorg | `external_org` | Integer | `int` |  | true |
| 48 | `tenant` | tenant | `tenantid` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 49 | `tenantid` | tenantid | `tenantid` | String | `text` |  | true |
| 50 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 51 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 52 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 53 | `synchts` | synchts | `synchts` | DateTime | `timestamp` |  | true |
| 54 | `dr` | 逻辑删除 | `dr` | Short | `short` |  | true |
| 55 | `orgid` | orgid | `orgid` | 8aaf4bce-2eb3-443c-bce1-0fb94fec3c0c | `quote` |  | true |
| 56 | `region` | region | `region` | String | `text` |  | true |
| 57 | `orgform` | orgform | `orgform` | String | `text` |  | true |
| 58 | `orglevel` | orglevel | `orglevel` | String | `text` |  | true |
| 59 | `path` | path | `path` | String | `text` |  | true |
| 60 | `businessid` | businessid | `businessid` | String | `text` |  | true |
| 61 | `log` | log | `log` | String | `text` |  | true |
| 62 | `canEmployee` | anEmployee | `can_employee` | Integer | `int` |  | true |
| 63 | `employerOrg` | employerOrg | `employer_org` | Integer | `int` |  | true |
| 64 | `AdminOrgVO` | AdminOrgVO | `id` | a4352e3c-3eda-4539-a7a9-ec00799be118 | `quote` |  | true |
| 65 | `shortname2` | shortname2 | `shortname2` | String | `text` |  |  |
| 66 | `shortname4` | shortname4 | `shortname4` | String | `text` |  |  |
| 67 | `shortname3` | shortname3 | `shortname3` | String | `text` |  |  |
| 68 | `shortname6` | shortname6 | `shortname6` | String | `text` |  |  |
| 69 | `shortname5` | shortname5 | `shortname5` | String | `text` |  |  |
| 70 | `name2` | name2 | `name2` | String | `text` |  |  |
| 71 | `name3` | name3 | `name3` | String | `text` |  |  |
| 72 | `name4` | name4 | `name4` | String | `text` |  |  |
| 73 | `name5` | name5 | `name5` | String | `text` |  |  |
| 74 | `name6` | name6 | `name6` | String | `text` |  |  |
| 75 | `deptdefines` | eptdefines(日期) | `` | 1385ab1a-aabc-40c6-a471-9576ad563b2d | `` |  |  |
| 76 | `deptOrgExt` | eptOrgExt(日期) | `` | 031ff5ad-d815-4a0d-95cb-94a39108fb5a | `` |  |  |
| 77 | `deptnature` | eptnature(日期) | `dept_nature` | Short | `short` |  |  |
| 78 | `description2` | escription2(日期) | `description2` | String | `text` |  |  |
| 79 | `description3` | escription3(日期) | `description3` | String | `text` |  |  |
| 80 | `description4` | escription4(日期) | `description4` | String | `text` |  |  |
| 81 | `description5` | escription5(日期) | `description5` | String | `text` |  |  |
| 82 | `description6` | escription6(日期) | `description6` | String | `text` |  |  |
| 83 | `iscontrolunit` | 是否controlunit | `is_control_unit` | Integer | `int` |  | true |

## 关联属性（18 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `parent` | parent | `bd.adminOrg.DeptOrgVO` | `parentid` | 外键 |  |  | None |  |
| 2 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 3 | `corpid` | orpid | `bd.adminOrg.BaseOrgVO` | `corpid` | 外键 |  |  | None |  |
| 4 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 5 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 6 | `deptOrgExt` | eptOrgExt(日期) | `bd.adminOrg.DeptOrgExtB` | `` | deptOrgExt → id | 1 | Y | None |  |
| 7 | `deptdefines` | eptdefines(日期) | `bd.adminOrg.DeptOrgDefineB` | `` | deptdefines → id | 1 | Y | None |  |
| 8 | `orgid` | orgid | `bd.adminOrg.BaseOrgVO` | `orgid` | deptOrgVO → orgid | 0..n | Y | None | true |
| 9 | `parentid` | parentid | `bd.adminOrg.DeptOrgVO` | `parentid` | 外键 |  |  | None |  |
| 10 | `principal` | principal | `bd.staff.Staff` | `principal` | 外键 |  |  | Service |  |
| 11 | `branchleader` | branchleader | `bd.staff.Staff` | `branchleader` | 外键 |  |  | Service |  |
| 12 | `locationid` | locationid | `hrcm.location.Location` | `locationid` | 外键 |  |  | Service |  |
| 13 | `parentorgid` | parentorgid | `org.func.BaseOrg` | `parentorgid` | 外键 |  |  | None |  |
| 14 | `companytype` | ompanytype | `org.doc.CompanyType` | `companytype` | 外键 |  |  | None |  |
| 15 | `depttype` | epttype(日期) | `org.doc.DeptType` | `depttype` | 外键 |  |  | None |  |
| 16 | `AdminOrgVO` | AdminOrgVO | `bd.adminOrg.AdminOrgVO` | `id` | 外键 |  |  | None |  |
| 17 | `tenant` | tenant | `yht.tenant.YhtTenant` | `tenantid` | 外键 |  |  | Service |  |
| 18 | `deptdefinefeature` | eptdefinefeature(日期) | `bd.adminOrg.DeptVOFeature` | `deptcharacterid` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, shortname, companytype, parentid, parentid, innercode
FROM org_admin
```