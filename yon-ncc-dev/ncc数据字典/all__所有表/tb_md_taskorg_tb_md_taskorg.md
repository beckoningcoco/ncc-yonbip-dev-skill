# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12067.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | objparam | objparam | objparam | number(38, 0) |  |  | 0 |
| 3 | pk_dataent | pk_dataent | pk_dataent | varchar2(20) | √ |
| 4 | pk_dataent_s | pk_dataent_s | pk_dataent_s | varchar2(20) |
| 5 | pk_orgstruct | pk_orgstruct | pk_orgstruct | varchar2(20) | √ |
| 6 | pk_planent | pk_planent | pk_planent | varchar2(20) |
| 7 | pk_planent_s | pk_planent_s | pk_planent_s | varchar2(20) |
| 8 | pk_taskdef | pk_taskdef | pk_taskdef | varchar2(20) | √ |
| 9 | sheetlist | sheetlist | sheetlist | varchar2(1024) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |