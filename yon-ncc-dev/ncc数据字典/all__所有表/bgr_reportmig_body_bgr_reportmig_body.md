# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7289.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_datamig_body | pk_datamig_body | pk_datamig_body | char(20) | √ |
| 2 | datafilename | datafilename | datafilename | varchar2(200) |
| 3 | filepath | filepath | filepath | varchar2(200) |
| 4 | fk_datamig | fk_datamig | fk_datamig | char(20) | √ |
| 5 | period | period | period | varchar2(50) |
| 6 | pk_datamig_head | pk_datamig_head | pk_datamig_head | varchar2(20) |  |  | '~' |
| 7 | def1 | def1 | def1 | varchar2(100) |
| 8 | def2 | def2 | def2 | varchar2(100) |
| 9 | def3 | def3 | def3 | varchar2(100) |
| 10 | def4 | def4 | def4 | varchar2(100) |
| 11 | def5 | def5 | def5 | varchar2(100) |
| 12 | def6 | def6 | def6 | varchar2(100) |
| 13 | def7 | def7 | def7 | varchar2(100) |
| 14 | def8 | def8 | def8 | varchar2(100) |
| 15 | def9 | def9 | def9 | varchar2(100) |
| 16 | def10 | def10 | def10 | varchar2(100) |
| 17 | creationtime | creationtime | creationtime | char(19) |
| 18 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 21 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |