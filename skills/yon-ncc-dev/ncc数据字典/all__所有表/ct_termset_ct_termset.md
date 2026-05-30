# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_termset | pk_ct_termset | pk_ct_termset | char(20) | √ |
| 2 | memo | memo | memo | varchar2(181) |
| 3 | pk_ct_termtype | pk_ct_termtype | pk_ct_termtype | varchar2(20) |  |  | '~' |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | vtermcode | vtermcode | vtermcode | varchar2(30) |
| 7 | vtermcontent | vtermcontent | vtermcontent | varchar2(996) |
| 8 | vtermname | vtermname | vtermname | varchar2(90) |
| 9 | vtermname2 | vtermname2 | vtermname2 | varchar2(90) |
| 10 | vtermname3 | vtermname3 | vtermname3 | varchar2(90) |
| 11 | vtermname4 | vtermname4 | vtermname4 | varchar2(90) |
| 12 | vtermname5 | vtermname5 | vtermname5 | varchar2(90) |
| 13 | vtermname6 | vtermname6 | vtermname6 | varchar2(90) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |