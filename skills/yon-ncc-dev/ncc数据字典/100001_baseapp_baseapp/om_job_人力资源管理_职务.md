# |<<

**人力资源管理_职务 (om_job / nc.vo.org.JobVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3930.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_job | 职务主键 | pk_job | char(20) | √ | 主键 (UFID) |
| 2 | jobcode | 职务编码 | jobcode | varchar(50) | √ | 字符串 (String) |
| 3 | jobname | 职务名称 | jobname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | jobdesc | 职务概要 | jobdesc | varchar(1024) |  | 备注 (Memo) |
| 5 | pk_jobtype | 职务类别 | pk_jobtype | varchar(20) | √ | 人力资源管理_职务类别 (jobtype) |
| 6 | pk_grade_source | 职级来源 | pk_grade_source | varchar(20) |  | 主键 (UFID) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | reqedu | 学历要求 | reqedu | varchar(200) |  | 字符串 (String) |
| 9 | reqsex | 性别要求 | reqsex | int |  | 字符串 (String) |
| 10 | reqyold | 年龄要求 | reqyold | varchar(200) |  | 字符串 (String) |
| 11 | reqpro | 专业背景要求 | reqpro | varchar(200) |  | 字符串 (String) |
| 12 | reqexp | 工作经验要求 | reqexp | varchar(200) |  | 字符串 (String) |
| 13 | reqtlimit | 工作时间要求 | reqtlimit | int |  | 字符串 (String) |
| 14 | reqother | 其他要求 | reqother | varchar(1000) |  | 字符串 (String) |
| 15 | originaldocid | 分配者主键 | originaldocid | varchar(200) |  | 主键 (UFID) |
| 16 | redefineflag | 是否重新定义 | redefineflag | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 1 | 1=未启用; |