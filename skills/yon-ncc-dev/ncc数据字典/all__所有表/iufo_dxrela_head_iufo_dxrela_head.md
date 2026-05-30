# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9608.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dxrela_head | pk_dxrela_head | pk_dxrela_head | char(20) | √ |
| 2 | balancetype | balancetype | balancetype | number(38, 0) |
| 3 | code | code | code | varchar2(100) |
| 4 | contenttype | contenttype | contenttype | number(38, 0) |
| 5 | credit | credit | credit | varchar2(500) |
| 6 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 7 | debit | debit | debit | varchar2(500) |
| 8 | diff | diff | diff | varchar2(200) |
| 9 | diffrule | diffrule | diffrule | varchar2(200) |
| 10 | isbuiltin | isbuiltin | isbuiltin | char(1) |
| 11 | name | name | name | varchar2(300) |
| 12 | name2 | name2 | name2 | varchar2(300) |
| 13 | name3 | name3 | name3 | varchar2(300) |
| 14 | name4 | name4 | name4 | varchar2(300) |
| 15 | name5 | name5 | name5 | varchar2(300) |
| 16 | name6 | name6 | name6 | varchar2(300) |
| 17 | note | note | note | varchar2(2000) |
| 18 | occurtype | occurtype | occurtype | number(38, 0) |
| 19 | pk_contrastrule | pk_contrastrule | pk_contrastrule | varchar2(20) |  |  | '~' |
| 20 | pk_dxrela_sort | pk_dxrela_sort | pk_dxrela_sort | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 23 | rulename | rulename | rulename | varchar2(50) |
| 24 | sealflag | sealflag | sealflag | char(1) |
| 25 | type | type | type | varchar2(50) | √ |  | '1' |
| 26 | usedflag | usedflag | usedflag | char(1) |
| 27 | creationtime | creationtime | creationtime | char(19) |
| 28 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 31 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |