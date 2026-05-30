# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10365.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_category | pk_category | pk_category | char(20) | √ |
| 2 | associate_fa_flag | associate_fa_flag | associate_fa_flag | char(1) |
| 3 | category_code | category_code | category_code | varchar2(40) |
| 4 | category_name | category_name | category_name | varchar2(120) |
| 5 | category_name2 | category_name2 | category_name2 | varchar2(120) |
| 6 | category_name3 | category_name3 | category_name3 | varchar2(120) |
| 7 | category_name4 | category_name4 | category_name4 | varchar2(120) |
| 8 | category_name5 | category_name5 | category_name5 | varchar2(120) |
| 9 | category_name6 | category_name6 | category_name6 | varchar2(120) |
| 10 | cooperate_flag | cooperate_flag | cooperate_flag | char(1) |
| 11 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 12 | fk_parent | fk_parent | fk_parent | varchar2(20) |  |  | '~' |
| 13 | innercode | innercode | innercode | varchar2(60) |
| 14 | inv_flag | inv_flag | inv_flag | char(1) |
| 15 | max_inner_code | max_inner_code | max_inner_code | varchar2(60) |
| 16 | memo | memo | memo | varchar2(200) |
| 17 | name_pre_flag | name_pre_flag | name_pre_flag | char(1) |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 20 | special_flag | special_flag | special_flag | char(1) |
| 21 | transi_type | transi_type | transi_type | varchar2(20) |  |  | '~' |
| 22 | def1 | def1 | def1 | varchar2(101) |
| 23 | def2 | def2 | def2 | varchar2(101) |
| 24 | def3 | def3 | def3 | varchar2(101) |
| 25 | def4 | def4 | def4 | varchar2(101) |
| 26 | def5 | def5 | def5 | varchar2(101) |
| 27 | def6 | def6 | def6 | varchar2(101) |
| 28 | def7 | def7 | def7 | varchar2(101) |
| 29 | def8 | def8 | def8 | varchar2(101) |
| 30 | def9 | def9 | def9 | varchar2(101) |
| 31 | def10 | def10 | def10 | varchar2(101) |
| 32 | def11 | def11 | def11 | varchar2(101) |
| 33 | def12 | def12 | def12 | varchar2(101) |
| 34 | def13 | def13 | def13 | varchar2(101) |
| 35 | def14 | def14 | def14 | varchar2(101) |
| 36 | def15 | def15 | def15 | varchar2(101) |
| 37 | def16 | def16 | def16 | varchar2(101) |
| 38 | def17 | def17 | def17 | varchar2(101) |
| 39 | def18 | def18 | def18 | varchar2(101) |
| 40 | def19 | def19 | def19 | varchar2(101) |
| 41 | def20 | def20 | def20 | varchar2(101) |
| 42 | creationtime | creationtime | creationtime | char(19) |
| 43 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 44 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 45 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 46 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 47 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |