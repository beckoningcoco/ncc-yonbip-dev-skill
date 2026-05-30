# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7665.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_servicestatus_b | pk_servicestatus_b | pk_servicestatus_b | char(20) | √ |
| 2 | cstatus | cstatus | cstatus | varchar2(1) |  |  | '~' |
| 3 | pk_group | pk_group | pk_group | varchar2(20) | √ |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) | √ |  | '~' |
| 5 | pk_period | pk_period | pk_period | varchar2(20) | √ |  | '~' |
| 6 | pk_servicestatus | pk_servicestatus | pk_servicestatus | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |