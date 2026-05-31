# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10723.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype | pk_transtype | pk_transtype | char(20) | √ |
| 2 | check_type | check_type | check_type | number(38, 0) |
| 3 | pay_mode | pay_mode | pay_mode | number(38, 0) |
| 4 | pk_checkrequest | pk_checkrequest | pk_checkrequest | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | transtype_code | transtype_code | transtype_code | varchar2(20) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |