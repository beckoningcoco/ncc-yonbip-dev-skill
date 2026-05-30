# |<<

**工艺变更单 (pd_ecn / nc.vo.ecn.eco.routing.entity.EcnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4354.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cecnid | 工程变更单 | cecnid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillcode | 工程变更单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | vbilltype | 单据类型 | vbilltype | varchar(4) |  | 字符串 (String) | 19A1 |
| 7 | capplydeptid | 申请部门 | capplydeptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | capplydeptvid | 申请部门版本 | capplydeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | cchangedeptid | 变更部门 | cchangedeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | cchangedeptvid | 变更部门版本 | cchangedeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | capplier | 申请人 | capplier | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | fchangeobj | 变更对象 | fchangeobj | int | √ | 变更对象 (FChangeObjEnum) | 1 | 1=工艺路线; |