# |<<

**计划期间 (ps_period / nc.vo.ps.period.PeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4679.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_period | 主键 | pk_period | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | prdname | 名称 | prdname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | prdunit | 期间单位 | prdunit | smallint |  | 期间单位 (prdunit) |  | 1=年; |