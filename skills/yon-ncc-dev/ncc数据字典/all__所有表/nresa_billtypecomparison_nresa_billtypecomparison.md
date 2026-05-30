# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10014.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypecomparison | pk_billtypecomparison | pk_billtypecomparison | char(20) | √ |
| 2 | billtype_new | billtype_new | billtype_new | varchar2(20) |  |  | '~' |
| 3 | billtype_old | billtype_old | billtype_old | varchar2(20) |  |  | '~' |
| 4 | check_description | check_description | check_description | varchar2(400) |
| 5 | check_status | check_status | check_status | number(38, 0) | √ |  | 1 |
| 6 | module_new | module_new | module_new | varchar2(20) |  |  | '~' |
| 7 | module_old | module_old | module_old | varchar2(20) |  |  | '~' |
| 8 | pk_app_upgrade | pk_app_upgrade | pk_app_upgrade | char(20) | √ |
| 9 | transtype_new | transtype_new | transtype_new | varchar2(20) |  |  | '~' |
| 10 | transtype_old | transtype_old | transtype_old | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |