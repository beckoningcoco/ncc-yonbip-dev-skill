# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | cubecode | cubecode | cubecode | varchar2(50) | √ |
| 3 | excel_x | excel_x | excel_x | number(10, 0) | √ |
| 4 | excel_y | excel_y | excel_y | number(10, 0) | √ |
| 5 | nc_x | nc_x | nc_x | number(10, 0) | √ |
| 6 | nc_y | nc_y | nc_y | number(10, 0) | √ |
| 7 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) | √ |
| 8 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 9 | savetime | savetime | savetime | char(19) |
| 10 | uniqkey | uniqkey | uniqkey | varchar2(99) | √ |
| 11 | updatetime | updatetime | updatetime | char(19) |
| 12 | vyear | vyear | vyear | varchar2(28) |
| 13 | writable | writable | writable | number(38, 0) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |