# |<<

**工程变更单 (mm_eco / nc.vo.ecn.eco.entity.EcoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3678.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eco | 工程变更单 | pk_eco | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillcode | 工程变更单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | vbilltype | 单据类型 | vbilltype | varchar(4) |  | 字符串 (String) | 19A3 |
| 7 | pk_applyorg | 申请组织 | pk_applyorg | varchar(20) |  | 组织 (org) |
| 8 | pk_applyorg_v | 申请组织版本 | pk_applyorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | capplydeptid | 申请部门 | capplydeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | capplydeptvid | 申请部门版本 | capplydeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | cchangedeptid | 变更部门 | cchangedeptid | varchar(20) |  | 组织_部门 (dept) |
| 12 | cchangedeptvid | 变更部门版本 | cchangedeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 13 | capplier | 申请人 | capplier | varchar(20) |  | 人员基本信息 (psndoc) |
| 14 | fchangeobj | 变更对象 | fchangeobj | int | √ | 变更对象 (FChangeObjEnum) | 0 | 0=BOM; |