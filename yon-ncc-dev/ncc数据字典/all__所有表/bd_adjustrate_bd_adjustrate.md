# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustrate | pk_adjustrate | pk_adjustrate | char(20) | √ |
| 2 | adjustrate | adjustrate | adjustrate | number(15, 8) |
| 3 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 4 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 5 | pk_accperiodmonth | pk_accperiodmonth | pk_accperiodmonth | varchar2(20) |  |  | '~' |
| 6 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | varchar2(20) |  |  | '~' |
| 7 | pk_currinfo | pk_currinfo | pk_currinfo | char(20) | √ |
| 8 | ratemonth | ratemonth | ratemonth | char(2) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |