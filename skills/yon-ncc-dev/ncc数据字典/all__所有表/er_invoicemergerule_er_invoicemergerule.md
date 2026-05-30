# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7970.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_erminvoicemerge | pk_erminvoicemerge | pk_erminvoicemerge | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | description | description | description | varchar2(2000) |
| 4 | djlxbm | djlxbm | djlxbm | varchar2(50) |
| 5 | fplx | fplx | fplx | varchar2(50) |
| 6 | ismerge | ismerge | ismerge | char(1) |
| 7 | name | name | name | varchar2(50) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_tradtypeid | pk_tradtypeid | pk_tradtypeid | varchar2(20) |  |  | '~' |
| 11 | def1 | def1 | def1 | varchar2(101) |
| 12 | def2 | def2 | def2 | varchar2(101) |
| 13 | def3 | def3 | def3 | varchar2(101) |
| 14 | def4 | def4 | def4 | varchar2(101) |
| 15 | def5 | def5 | def5 | varchar2(101) |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) | √ |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |