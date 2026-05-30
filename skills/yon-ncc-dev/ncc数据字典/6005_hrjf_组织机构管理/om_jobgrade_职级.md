# |<<

**职级 (om_jobgrade / nc.vo.om.job.JobGradeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3935.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobgrade | 职级主键 | pk_jobgrade | char(50) | √ | 字符串 (String) |
| 2 | jobgradename | 职级名称 | jobgradename | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | jobgradecode | 职级编码 | jobgradecode | varchar(50) |  | 字符串 (String) |
| 4 | jobgradedesc | 职级概要/描述 | jobgradedesc | varchar(50) |  | 字符串 (String) |
| 5 | pk_jobrank | 对应职等 | pk_jobrank | varchar(20) |  | 职等 (jobrank) |
| 6 | pk_job | 职务 | pk_job | varchar(20) |  | 职务 (om_job) |
| 7 | pk_jobtype | 职务类别 | pk_jobtype | varchar(20) |  | 职务类别 (jobtype) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |