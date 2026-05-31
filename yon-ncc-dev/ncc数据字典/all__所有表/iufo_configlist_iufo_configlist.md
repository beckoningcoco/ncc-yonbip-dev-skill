# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9507.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_configlist | pk_configlist | pk_configlist | char(20) | √ |
| 2 | content | content | content | blob |
| 3 | modulename | modulename | modulename | varchar2(50) |
| 4 | pk_task | pk_task | pk_task | char(20) | √ |
| 5 | pk_user | pk_user | pk_user | char(20) | √ |
| 6 | type | type | type | number(38, 0) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |