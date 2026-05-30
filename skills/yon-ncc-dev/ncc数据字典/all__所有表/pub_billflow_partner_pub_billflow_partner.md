# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10899.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bfpartner | pk_bfpartner | pk_bfpartner | char(20) | √ |
| 2 | billtype | billtype | billtype | varchar2(20) |
| 3 | busitype | busitype | busitype | char(20) | √ |
| 4 | parnter_pk | parnter_pk | parnter_pk | char(20) | √ |
| 5 | parnter_type | parnter_type | parnter_type | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | transtype | transtype | transtype | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |