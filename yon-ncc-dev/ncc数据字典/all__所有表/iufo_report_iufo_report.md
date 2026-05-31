# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9680.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_report | pk_report | pk_report | char(20) | √ |
| 2 | busi_prop | busi_prop | busi_prop | varchar2(20) |  |  | '~' |
| 3 | code | code | code | varchar2(20) |
| 4 | dataauthflag | dataauthflag | dataauthflag | char(1) |
| 5 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 6 | fmledit_type | fmledit_type | fmledit_type | number(38, 0) |
| 7 | hbbbctrolflag | hbbbctrolflag | hbbbctrolflag | char(1) |
| 8 | isintrade | isintrade | isintrade | char(1) |
| 9 | keymeasures | keymeasures | keymeasures | blob |
| 10 | name | name | name | varchar2(300) |
| 11 | name2 | name2 | name2 | varchar2(300) |
| 12 | name3 | name3 | name3 | varchar2(300) |
| 13 | name4 | name4 | name4 | varchar2(300) |
| 14 | name5 | name5 | name5 | varchar2(300) |
| 15 | name6 | name6 | name6 | varchar2(300) |
| 16 | note | note | note | varchar2(200) |
| 17 | pk_dir | pk_dir | pk_dir | varchar2(20) |  |  | '~' |
| 18 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 19 | pk_key_comb | pk_key_comb | pk_key_comb | varchar2(20) |  |  | '~' |
| 20 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 21 | repinfo | repinfo | repinfo | blob |
| 22 | reptype | reptype | reptype | number(38, 0) |
| 23 | def1 | def1 | def1 | varchar2(101) |
| 24 | def2 | def2 | def2 | varchar2(101) |
| 25 | def3 | def3 | def3 | varchar2(101) |
| 26 | def4 | def4 | def4 | varchar2(101) |
| 27 | def5 | def5 | def5 | varchar2(101) |
| 28 | creationtime | creationtime | creationtime | char(19) |
| 29 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 30 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 31 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 32 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |