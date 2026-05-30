# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13029.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sysrely | pk_sysrely | pk_sysrely | char(20) | √ |
| 2 | orderid | orderid | orderid | number(38, 0) |
| 3 | pk_rely_sysattrtype | pk_rely_sysattrtype | pk_rely_sysattrtype | varchar2(20) |  |  | '~' |
| 4 | pk_sysattrtype | pk_sysattrtype | pk_sysattrtype | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |