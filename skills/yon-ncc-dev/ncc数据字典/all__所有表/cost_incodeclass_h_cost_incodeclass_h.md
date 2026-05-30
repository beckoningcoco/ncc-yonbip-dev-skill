# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7692.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomeclass | pk_incomeclass | pk_incomeclass | char(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | enablestate | enablestate | enablestate | char(1) |
| 4 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 5 | grade | grade | grade | number(38, 0) |
| 6 | inforesourse | inforesourse | inforesourse | varchar2(50) |
| 7 | innercode | innercode | innercode | varchar2(50) |
| 8 | name | name | name | varchar2(50) | √ |
| 9 | parentid | parentid | parentid | char(20) |
| 10 | parentname | parentname | parentname | varchar2(50) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | vmemo | vmemo | vmemo | varchar2(50) |
| 15 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 16 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 17 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 18 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 19 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 20 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 21 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 22 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 23 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 24 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 25 | vdef11 | vdef11 | vdef11 | varchar2(101) |
| 26 | vdef12 | vdef12 | vdef12 | varchar2(101) |
| 27 | vdef13 | vdef13 | vdef13 | varchar2(101) |
| 28 | vdef14 | vdef14 | vdef14 | varchar2(101) |
| 29 | vdef15 | vdef15 | vdef15 | varchar2(101) |
| 30 | vdef16 | vdef16 | vdef16 | varchar2(101) |
| 31 | vdef17 | vdef17 | vdef17 | varchar2(101) |
| 32 | vdef18 | vdef18 | vdef18 | varchar2(101) |
| 33 | vdef19 | vdef19 | vdef19 | varchar2(101) |
| 34 | vdef20 | vdef20 | vdef20 | varchar2(101) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |