# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_resource | pk_resource | pk_resource | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | name | name | name | varchar2(75) | √ |
| 4 | pk_metadata | pk_metadata | pk_metadata | varchar2(36) | √ |
| 5 | pk_module | pk_module | pk_module | char(20) | √ |
| 6 | prioritypolicy | prioritypolicy | prioritypolicy | varchar2(50) | √ |
| 7 | regtablename | regtablename | regtablename | varchar2(50) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |