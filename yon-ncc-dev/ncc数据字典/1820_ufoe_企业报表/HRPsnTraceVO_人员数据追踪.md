# |<<

**人员数据追踪 (HRPsnTraceVO / nc.vo.iufo.hr.trace.HRPsnTraceVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_org | 组织主键 | pk_org | char(20) | √ | 组织_业务单元_报表组织 (reportorg) |
| 2 | psn_count | 人数 | psn_count | int |  | 整数 (Integer) |
| 3 | pk_fatherorg | 上级组织 | pk_fatherorg | varchar(50) |  | 字符串 (String) |
| 4 | orgname | 单位名称 | orgname | varchar(50) |  | 字符串 (String) |