# |<<

**HR统计条件关联记录 (iufo_hr_statrela / nc.vo.iufo.hr.hrstatcond.HRStatRelaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3462.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rela | 主键 | pk_rela | char(20) | √ | 主键 (UFID) |
| 2 | pk_statcond | 统计条件主键 | pk_statcond | varchar(20) |  | 统计条件 (hrstatcond) |
| 3 | pk_report | 报表主键 | pk_report | varchar(20) |  | 报表表样 (ufoereportinfo) |