# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fieldcontrast | pk_fieldcontrast | pk_fieldcontrast | char(20) | √ |
| 2 | app_scene | app_scene | app_scene | number(38, 0) | √ |
| 3 | des_billtype | des_billtype | des_billtype | varchar2(50) | √ |  | '~' |
| 4 | des_billtypepk | des_billtypepk | des_billtypepk | varchar2(20) |  |  | '~' |
| 5 | des_fieldcode | des_fieldcode | des_fieldcode | varchar2(50) | √ |
| 6 | des_fieldname | des_fieldname | des_fieldname | varchar2(200) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | src_billtype | src_billtype | src_billtype | varchar2(50) | √ |  | '~' |
| 10 | src_billtypepk | src_billtypepk | src_billtypepk | varchar2(20) |  |  | '~' |
| 11 | src_busitype | src_busitype | src_busitype | varchar2(50) |
| 12 | src_fieldcode | src_fieldcode | src_fieldcode | varchar2(50) | √ |
| 13 | src_fieldname | src_fieldname | src_fieldname | varchar2(200) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |