# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6787.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busitype_class | pk_busitype_class | pk_busitype_class | char(20) | √ |
| 2 | comp | comp | comp | varchar2(50) |
| 3 | name | name | name | varchar2(50) |
| 4 | parentpk | parentpk | parentpk | varchar2(20) |  |  | '~' |
| 5 | propid | propid | propid | number(38, 0) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |