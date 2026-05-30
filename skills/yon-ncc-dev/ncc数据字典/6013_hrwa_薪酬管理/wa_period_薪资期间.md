# |<<

**薪资期间 (wa_period / nc.vo.wa.period.PeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_period | 薪资期间主键 | pk_wa_period | char(20) | √ | 主键 (UFID) |
| 2 | pk_periodscheme | 薪资期间方案主键 | pk_periodscheme | varchar(25) |  | 主键 (UFID) |
| 3 | cyear | 薪资年度 | cyear | char(4) |  | 主键 (UFID) |
| 4 | cperiod | 薪资期间 | cperiod | char(2) | √ | 主键 (UFID) |
| 5 | cstartdate | 开始日期 | cstartdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 6 | cenddate | 截止日期 | cenddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | vcalyear | 福利年度 | vcalyear | char(4) |  | 主键 (UFID) |
| 8 | vcalmonth | 福利期间 | vcalmonth | char(2) |  | 主键 (UFID) |
| 9 | caccyear | 基准年度 | caccyear | char(4) |  | 主键 (UFID) |
| 10 | caccperiod | 基准期间 | caccperiod | char(2) |  | 主键 (UFID) |
| 11 | taxyear | 纳税年度 | taxyear | char(4) |  | 主键 (UFID) |
| 12 | taxperiod | 纳税期间 | taxperiod | char(2) |  | 主键 (UFID) |