# |<<

**绩效看板模板 (sscpfm_kpi_template / nc.vo.sscpfm.kpi.PFMKpiTemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5577.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar(36) | √ | 字符串 (String) |
| 2 | name | 名称 | name | varchar(150) |  | 字符串 (String) |
| 3 | url | 链接 | url | varchar(2048) |  | 字符串 (String) |
| 4 | showorder | 排序 | showorder | int |  | 整数 (Integer) |
| 5 | templatecode | 模板编码 | templatecode | varchar(254) |  | 字符串 (String) |
| 6 | imagecode | imagecode | imagecode | varchar(254) |  | 字符串 (String) |
| 7 | searchcondition | 模板查询条件 | searchcondition | text(0) |  | BLOB (BLOB) |
| 8 | usercode | 单点登录用户编码 | usercode | varchar(50) |  | 字符串 (String) |
| 9 | pk_org | 共享中心编码 | pk_org | varchar(50) |  | 字符串 (String) |
| 10 | type | 报表种类 | type | int |  | 整数 (Integer) | 1 |