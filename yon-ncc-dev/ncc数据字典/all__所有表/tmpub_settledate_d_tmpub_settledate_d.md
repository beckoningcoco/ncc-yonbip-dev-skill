# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12169.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_setdate_d | pk_setdate_d | pk_setdate_d | char(20) | √ |
| 2 | pk_setdate | pk_setdate | pk_setdate | char(20) | √ |
| 3 | settleday | settleday | settleday | number(38, 0) |
| 4 | settledetaino | settledetaino | settledetaino | varchar2(50) |
| 5 | settleleapday | settleleapday | settleleapday | varchar2(20) |
| 6 | settlemonth | settlemonth | settlemonth | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |