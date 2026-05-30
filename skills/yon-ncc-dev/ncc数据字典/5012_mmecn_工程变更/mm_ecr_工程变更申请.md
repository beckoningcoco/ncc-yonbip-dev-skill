# |<<

**工程变更申请 (mm_ecr / nc.vo.ecn.ecr.entity.EcrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3683.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecr | 工程变更申请主键 | pk_ecr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbillcode | 申请单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 申请日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | pk_applyorg | 申请组织 | pk_applyorg | varchar(20) |  | 组织 (org) |
| 8 | pk_applyorg_v | 申请组织版本 | pk_applyorg_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 9 | cdeptid | 申请部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 10 | cdeptvid | 申请部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | fbillstatus | 单据状态 | fbillstatus | int | √ | 工程变更申请状态 (FEcrBillstatusEnum) |  | -1=自由; |