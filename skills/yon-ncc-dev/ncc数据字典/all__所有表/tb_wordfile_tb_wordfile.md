# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | filedata | filedata | filedata | blob |
| 3 | filename | filename | filename | varchar2(100) |
| 4 | filepath | filepath | filepath | varchar2(100) |
| 5 | formid | formid | formid | varchar2(100) |
| 6 | pk_father | pk_father | pk_father | varchar2(100) |
| 7 | uploadtime | uploadtime | uploadtime | varchar2(20) |
| 8 | uploaduser | uploaduser | uploaduser | varchar2(100) |
| 9 | uploadusername | uploadusername | uploadusername | varchar2(100) |
| 10 | wordtype | wordtype | wordtype | number(2, 0) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |