# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6869.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_defdoclist | pk_defdoclist | pk_defdoclist | char(20) | √ |
| 2 | associatename | associatename | associatename | varchar2(200) |
| 3 | bpfcomponentid | bpfcomponentid | bpfcomponentid | varchar2(50) |
| 4 | code | code | code | varchar2(30) | √ |
| 5 | codectlgrade | codectlgrade | codectlgrade | varchar2(50) |
| 6 | coderule | coderule | coderule | varchar2(40) |
| 7 | comp | comp | comp | varchar2(50) |
| 8 | componentid | componentid | componentid | varchar2(50) |
| 9 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 10 | docclass | docclass | docclass | varchar2(50) |
| 11 | doclevel | doclevel | doclevel | number(38, 0) |
| 12 | doctype | doctype | doctype | number(38, 0) |
| 13 | funcode | funcode | funcode | varchar2(40) |
| 14 | isgrade | isgrade | isgrade | char(1) |
| 15 | isrelease | isrelease | isrelease | char(1) |
| 16 | mngctlmode | mngctlmode | mngctlmode | number(38, 0) | √ |
| 17 | name | name | name | varchar2(105) | √ |
| 18 | name2 | name2 | name2 | varchar2(105) |
| 19 | name3 | name3 | name3 | varchar2(105) |
| 20 | name4 | name4 | name4 | varchar2(105) |
| 21 | name5 | name5 | name5 | varchar2(105) |
| 22 | name6 | name6 | name6 | varchar2(105) |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | creationtime | creationtime | creationtime | char(19) |
| 26 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 27 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 28 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 29 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |