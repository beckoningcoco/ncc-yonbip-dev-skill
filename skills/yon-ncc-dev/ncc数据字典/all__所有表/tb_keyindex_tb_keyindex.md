# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12048.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | cellposition | cellposition | cellposition | varchar2(10) |
| 3 | cubecode | cubecode | cubecode | varchar2(100) |
| 4 | dimexpress | dimexpress | dimexpress | varchar2(2000) |
| 5 | dimshowname | dimshowname | dimshowname | varchar2(200) |
| 6 | isrulemember | isrulemember | isrulemember | varchar2(10) |
| 7 | keyindexpos | keyindexpos | keyindexpos | varchar2(100) |
| 8 | pk_dimdef | pk_dimdef | pk_dimdef | varchar2(20) |
| 9 | pk_sheet | pk_sheet | pk_sheet | varchar2(50) | √ |
| 10 | pk_workbook | pk_workbook | pk_workbook | varchar2(20) | √ |
| 11 | realexpress | realexpress | realexpress | varchar2(2000) |
| 12 | rulename | rulename | rulename | varchar2(20) |
| 13 | freevalue1 | freevalue1 | freevalue1 | varchar2(512) |
| 14 | freevalue2 | freevalue2 | freevalue2 | varchar2(512) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |