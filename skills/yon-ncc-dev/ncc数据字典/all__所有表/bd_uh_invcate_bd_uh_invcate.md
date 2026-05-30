# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7160.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcate | pk_invcate | pk_invcate | char(20) | √ |
| 2 | code | code | code | varchar2(30) |
| 3 | eu_invissue | eu_invissue | eu_invissue | number(38, 0) |  |  | 0 |
| 4 | eu_invmana | eu_invmana | eu_invmana | number(38, 0) |
| 5 | eu_invnum | eu_invnum | eu_invnum | number(38, 0) |
| 6 | eu_invtype | eu_invtype | eu_invtype | number(38, 0) |
| 7 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 8 | fiinvbookcn | fiinvbookcn | fiinvbookcn | number(38, 0) |
| 9 | flag_active | flag_active | flag_active | char(1) |
| 10 | flag_regi_chk | flag_regi_chk | flag_regi_chk | char(1) |
| 11 | flag_writeoff_auto | flag_writeoff_auto | flag_writeoff_auto | char(1) |
| 12 | flag_writeoff_chk | flag_writeoff_chk | flag_writeoff_chk | char(1) |
| 13 | innercode | innercode | innercode | varchar2(50) |
| 14 | invfix | invfix | invfix | varchar2(50) |
| 15 | invlenth | invlenth | invlenth | number(38, 0) |
| 16 | name | name | name | varchar2(50) |
| 17 | name_invtemp | name_invtemp | name_invtemp | varchar2(256) |
| 18 | note | note | note | varchar2(256) |
| 19 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | unit_inv | unit_inv | unit_inv | varchar2(50) |
| 22 | creationtime | creationtime | creationtime | char(19) |
| 23 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 24 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 25 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 26 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |