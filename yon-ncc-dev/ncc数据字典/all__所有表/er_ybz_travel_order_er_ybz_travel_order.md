# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7996.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | char(20) | √ |
| 2 | djbh | djbh | djbh | varchar2(30) |  |  | '~' |
| 3 | orderno | orderno | orderno | varchar2(100) |  |  | '~' |
| 4 | order_classification | order_classification | order_classification | varchar2(100) |  |  | '~' |
| 5 | pk_busitem | pk_busitem | pk_busitem | varchar2(100) |  |  | '~' |
| 6 | pk_jkbx | pk_jkbx | pk_jkbx | varchar2(20) |  |  | '~' |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |