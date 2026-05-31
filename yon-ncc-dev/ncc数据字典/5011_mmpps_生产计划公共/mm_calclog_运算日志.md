# |<<

**运算日志 (mm_calclog / nc.vo.mmpps.calc.entity.log.LogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3642.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppslogid | 运算日志 | cppslogid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | ndestmatnum | 目标物料数 | ndestmatnum | decimal(28, 0) |  | 数值 (UFDouble) |
| 6 | nsuccessnum | 计算成功物料数 | nsuccessnum | decimal(28, 0) |  | 数值 (UFDouble) |
| 7 | ngenpomatnum | 需补货物料数 | ngenpomatnum | decimal(28, 0) |  | 数值 (UFDouble) |
| 8 | druntime | 计划起始日期 | druntime | char(19) |  | 日期 (UFDate) |
| 9 | tstarttime | 开始时间 | tstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | tendtime | 结束时间 | tendtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | trunningtime | 运行时间 | trunningtime | varchar(50) |  | 字符串 (String) |
| 12 | runner | 计划人 | runner | varchar(20) |  | 用户 (user) |
| 13 | computecode | 运算标识 | computecode | varchar(40) |  | 字符串 (String) |
| 14 | fcalculatestatus | 运算状态 | fcalculatestatus | int |  | 运算状态 (CalculateStatus) |  | 1=初始化; |