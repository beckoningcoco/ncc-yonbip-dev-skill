# |<<

**折算规则组织表 (ufoc_cvtruleorg / nc.vo.ufoc.convert.CvtruleorgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cvtorg | 主键 | pk_cvtorg | char(20) | √ | 主键 (UFID) |
| 2 | pk_convertrule | 折算规则主键 | pk_convertrule | varchar(20) |  | 折算规则 (ConvertRuleVO) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |