# |<<

**计划价批量调整单 (ia_planedprice / nc.vo.ia.m2801.entity.PlanedPriceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2856.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 计划价批量调整单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 集团 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 4 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 5 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 6 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | cdeptvid | 部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | cpsnid | 业务员 | cpsnid | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | bautoauditflag | 自动审核调整单据 | bautoauditflag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 11 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 12 | taudittime | 审核日期 | taudittime | char(19) |  | 日期 (UFDate) |
| 13 | iprintcount | 打印次数 | iprintcount | int |  | 整数 (Integer) |
| 14 | fstatusflag | 单据状态 | fstatusflag | int |  | 单据状态 (Fstatusflag) |  | 1=自由; |