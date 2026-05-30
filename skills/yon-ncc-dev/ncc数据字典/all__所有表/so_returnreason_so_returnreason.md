# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11728.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_returnreason | pk_returnreason | pk_returnreason | char(20) | √ |
| 2 | freasontype | freasontype | freasontype | number(38, 0) |
| 3 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 4 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 5 | vnote | vnote | vnote | varchar2(181) |
| 6 | vreasoncode | vreasoncode | vreasoncode | varchar2(50) |
| 7 | vreasonname | vreasonname | vreasonname | varchar2(300) |
| 8 | vreasonname2 | vreasonname2 | vreasonname2 | varchar2(300) |
| 9 | vreasonname3 | vreasonname3 | vreasonname3 | varchar2(300) |
| 10 | vreasonname4 | vreasonname4 | vreasonname4 | varchar2(300) |
| 11 | vreasonname5 | vreasonname5 | vreasonname5 | varchar2(300) |
| 12 | vreasonname6 | vreasonname6 | vreasonname6 | varchar2(300) |
| 13 | vreturnmode | vreturnmode | vreturnmode | varchar2(181) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |