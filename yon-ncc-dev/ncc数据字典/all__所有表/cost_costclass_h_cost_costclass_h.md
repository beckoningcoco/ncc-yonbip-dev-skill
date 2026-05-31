# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_costclass | pk_costclass | pk_costclass | char(20) | √ |
| 2 | capitalres | capitalres | capitalres | char(1) |
| 3 | code | code | code | varchar2(50) |
| 4 | drugtype | drugtype | drugtype | number(38, 0) |
| 5 | enablestate | enablestate | enablestate | char(1) |
| 6 | father_pk | father_pk | father_pk | varchar2(50) |
| 7 | grade | grade | grade | number(38, 0) |
| 8 | inforesourse | inforesourse | inforesourse | varchar2(50) |
| 9 | innercode | innercode | innercode | varchar2(50) |
| 10 | iscal | iscal | iscal | char(1) |
| 11 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 12 | maketime | maketime | maketime | char(19) |
| 13 | name | name | name | varchar2(50) |
| 14 | parentid | parentid | parentid | char(20) |
| 15 | parentname | parentname | parentname | varchar2(20) |  |  | '~' |
| 16 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | vmemo | vmemo | vmemo | varchar2(50) |
| 20 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 21 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 22 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 23 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 24 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 25 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 26 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 27 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 28 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 29 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 30 | creationtime | creationtime | creationtime | char(19) |
| 31 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 34 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 35 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |