# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12855.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_cashcard | pk_wa_cashcard | pk_wa_cashcard | char(20) | √ |
| 2 | cperiod | cperiod | cperiod | char(2) |
| 3 | cyear | cyear | cyear | char(4) |
| 4 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |
| 5 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) |
| 6 | yurref | yurref | yurref | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |