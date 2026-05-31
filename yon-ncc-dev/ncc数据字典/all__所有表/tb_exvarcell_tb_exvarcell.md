# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12020.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | cellid | cellid | cellid | varchar2(30) |
| 3 | dimvector | dimvector | dimvector | varchar2(200) |
| 4 | fml | fml | fml | varchar2(200) |
| 5 | fmlheader | fmlheader | fmlheader | varchar2(200) |
| 6 | pk_dimlevel | pk_dimlevel | pk_dimlevel | varchar2(50) |
| 7 | pk_inputent | pk_inputent | pk_inputent | varchar2(20) |
| 8 | pk_levelvalue | pk_levelvalue | pk_levelvalue | varchar2(20) |
| 9 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) | √ |
| 10 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 11 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) | √ |
| 12 | value | value | value | varchar2(1000) |
| 13 | varid | varid | varid | varchar2(60) | √ |
| 14 | var_col | var_col | var_col | number(10, 0) |
| 15 | var_row | var_row | var_row | number(10, 0) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |