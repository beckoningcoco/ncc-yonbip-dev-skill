# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6720.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acchalfyear | pk_acchalfyear | pk_acchalfyear | char(20) | √ |
| 2 | beginmonth | beginmonth | beginmonth | char(2) | √ |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 4 | endmonth | endmonth | endmonth | char(2) | √ |
| 5 | halfyear | halfyear | halfyear | number(38, 0) | √ |
| 6 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 7 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | char(20) | √ |
| 8 | pk_org | pk_org | pk_org | char(20) | √ |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |