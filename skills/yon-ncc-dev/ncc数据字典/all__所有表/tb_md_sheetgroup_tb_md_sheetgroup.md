# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12059.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | groupcolor | groupcolor | groupcolor | number(10, 0) |
| 3 | grouptype | grouptype | grouptype | char(1) |
| 4 | objname | objname | objname | varchar2(100) | √ |
| 5 | pk_object | pk_object | pk_object | varchar2(20) |
| 6 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |