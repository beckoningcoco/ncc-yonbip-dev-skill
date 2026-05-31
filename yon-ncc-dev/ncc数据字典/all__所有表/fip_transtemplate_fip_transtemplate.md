# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtemplate | pk_transtemplate | pk_transtemplate | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | desbillmode | desbillmode | desbillmode | number(38, 0) |
| 4 | description | description | description | varchar2(500) |
| 5 | des_billtype | des_billtype | des_billtype | varchar2(20) |  |  | '~' |
| 6 | effectflag | effectflag | effectflag | char(1) |
| 7 | expmessage1 | expmessage1 | expmessage1 | varchar2(2000) |
| 8 | expmessage2 | expmessage2 | expmessage2 | varchar2(2000) |
| 9 | expmessage3 | expmessage3 | expmessage3 | varchar2(2000) |
| 10 | generatemode | generatemode | generatemode | number(38, 0) |
| 11 | isdefault | isdefault | isdefault | char(1) |
| 12 | isinit | isinit | isinit | char(1) |  |  | '~' |
| 13 | isleachbody | isleachbody | isleachbody | char(1) |
| 14 | name | name | name | varchar2(300) |
| 15 | name2 | name2 | name2 | varchar2(300) |
| 16 | name3 | name3 | name3 | varchar2(300) |
| 17 | name4 | name4 | name4 | varchar2(300) |
| 18 | name5 | name5 | name5 | varchar2(300) |
| 19 | name6 | name6 | name6 | varchar2(300) |
| 20 | pk_docconvert | pk_docconvert | pk_docconvert | varchar2(20) |  |  | '~' |
| 21 | pk_glsumrule | pk_glsumrule | pk_glsumrule | varchar2(101) |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | pk_rasumrule | pk_rasumrule | pk_rasumrule | varchar2(101) |
| 25 | pk_sumrule | pk_sumrule | pk_sumrule | varchar2(101) |
| 26 | src_billtype | src_billtype | src_billtype | varchar2(20) |  |  | '~' |
| 27 | def1 | def1 | def1 | varchar2(101) |
| 28 | def2 | def2 | def2 | varchar2(101) |
| 29 | def3 | def3 | def3 | varchar2(101) |
| 30 | def4 | def4 | def4 | varchar2(101) |
| 31 | def5 | def5 | def5 | varchar2(101) |
| 32 | def6 | def6 | def6 | varchar2(101) |
| 33 | def7 | def7 | def7 | varchar2(101) |
| 34 | def8 | def8 | def8 | varchar2(101) |
| 35 | def9 | def9 | def9 | varchar2(101) |
| 36 | def10 | def10 | def10 | varchar2(101) |
| 37 | factor1 | factor1 | factor1 | varchar2(101) |
| 38 | factor2 | factor2 | factor2 | varchar2(101) |
| 39 | factor3 | factor3 | factor3 | varchar2(101) |
| 40 | creationtime | creationtime | creationtime | char(19) |
| 41 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 42 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 43 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 44 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 45 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |