# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6755.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_avgrate | pk_avgrate | pk_avgrate | char(20) | √ |
| 2 | avgrate_halfyear | avgrate_halfyear | avgrate_halfyear | number(38, 0) |
| 3 | avgrate_month | avgrate_month | avgrate_month | number(38, 0) |
| 4 | avgrate_quarter | avgrate_quarter | avgrate_quarter | number(38, 0) |
| 5 | avgrate_year | avgrate_year | avgrate_year | number(38, 0) |
| 6 | offsetmonth | offsetmonth | offsetmonth | number(38, 0) |
| 7 | pk_currinfo | pk_currinfo | pk_currinfo | char(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |