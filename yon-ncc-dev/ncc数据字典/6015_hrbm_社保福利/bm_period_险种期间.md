# |<<

**险种期间 (bm_period / nc.vo.bm.period.BmPeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1230.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bm_period | 险种期间主键 | pk_bm_period | char(20) | √ | 主键 (UFID) |
| 2 | pk_periodscheme | 险种期间方案主键 | pk_periodscheme | varchar(20) |  | 险种期间方案 (BmPeriodSchemeVO) |
| 3 | year | 险种年度 | year | varchar(50) |  | 字符串 (String) |
| 4 | period | 险种期间 | period | varchar(50) |  | 字符串 (String) |
| 5 | cstartdate | 开始日期 | cstartdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 6 | cenddate | 结束日期 | cenddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | caccyear | 基准年度 | caccyear | varchar(50) | √ | 字符串 (String) |
| 8 | caccperiod | 基准期间 | caccperiod | varchar(50) | √ | 字符串 (String) |