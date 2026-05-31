# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchrule | pk_batchrule | pk_batchrule | char(20) | √ |
| 2 | mainorg | mainorg | mainorg | varchar2(20) |  |  | '~' |
| 3 | name | name | name | varchar2(50) |
| 4 | pk_adjscheme | pk_adjscheme | pk_adjscheme | varchar2(20) |  |  | '~' |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_hbscheme | pk_hbscheme | pk_hbscheme | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | roothbscheme | roothbscheme | roothbscheme | varchar2(20) |  |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(101) |
| 10 | def2 | def2 | def2 | varchar2(101) |
| 11 | def3 | def3 | def3 | varchar2(101) |
| 12 | def4 | def4 | def4 | varchar2(101) |
| 13 | def5 | def5 | def5 | varchar2(101) |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |