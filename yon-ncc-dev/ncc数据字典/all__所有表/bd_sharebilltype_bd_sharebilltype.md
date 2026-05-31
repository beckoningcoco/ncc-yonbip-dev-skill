# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7067.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(30) |
| 3 | classtype | classtype | classtype | number(38, 0) | √ |
| 4 | istransaction | istransaction | istransaction | char(1) |  |  | 'N' |
| 5 | isuse | isuse | isuse | char(1) |  |  | 'Y' |
| 6 | parentbilltype | parentbilltype | parentbilltype | varchar2(30) |
| 7 | pk_group | pk_group | pk_group | varchar2(30) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |