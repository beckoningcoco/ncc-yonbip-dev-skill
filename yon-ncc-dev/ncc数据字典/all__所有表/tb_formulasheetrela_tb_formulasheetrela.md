# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12028.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | formula_type | formula_type | formula_type | char(1) |
| 3 | pk_sheet_orig | pk_sheet_orig | pk_sheet_orig | varchar2(20) |
| 4 | pk_sheet_target | pk_sheet_target | pk_sheet_target | varchar2(20) |
| 5 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) |
| 6 | def1 | def1 | def1 | varchar2(100) |
| 7 | def2 | def2 | def2 | varchar2(100) |
| 8 | def3 | def3 | def3 | varchar2(100) |
| 9 | def4 | def4 | def4 | varchar2(100) |
| 10 | def5 | def5 | def5 | varchar2(100) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |