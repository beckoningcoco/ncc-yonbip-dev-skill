# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12094.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | cubecode | cubecode | cubecode | varchar2(50) | √ |
| 3 | express | express | express | varchar2(512) |
| 4 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(20) | √ |
| 5 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) | √ |
| 6 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 7 | rulemember | rulemember | rulemember | varchar2(50) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |