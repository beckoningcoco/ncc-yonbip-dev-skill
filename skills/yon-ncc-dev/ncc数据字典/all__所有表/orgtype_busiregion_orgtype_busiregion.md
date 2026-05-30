# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10142.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_region | pk_region | pk_region | char(20) | √ |
| 2 | code | code | code | varchar2(200) |
| 3 | comp | comp | comp | varchar2(50) |
| 4 | name | name | name | varchar2(300) |
| 5 | pk_orgtype | pk_orgtype | pk_orgtype | varchar2(20) |  |  | '~' |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |