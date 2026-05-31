# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9698.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_task | pk_task | pk_task | char(20) | √ |
| 2 | accbooktype | accbooktype | accbooktype | varchar2(20) |  |  | '~' |
| 3 | approvemode | approvemode | approvemode | number(38, 0) |  |  | 0 |
| 4 | assignorgtype | assignorgtype | assignorgtype | varchar2(50) |
| 5 | autohasten | autohasten | autohasten | number(38, 0) |
| 6 | busi_prop | busi_prop | busi_prop | varchar2(20) |  |  | '~' |
| 7 | code | code | code | varchar2(50) | √ |
| 8 | commitcheck | commitcheck | commitcheck | number(38, 0) |
| 9 | commitmode | commitmode | commitmode | number(38, 0) |
| 10 | commitopt | commitopt | commitopt | number(38, 0) |
| 11 | commit_end_day | commit_end_day | commit_end_day | number(38, 0) |
| 12 | commit_end_time | commit_end_time | commit_end_time | char(8) |
| 13 | commstrategy | commstrategy | commstrategy | number(38, 0) |
| 14 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 15 | data_contype | data_contype | data_contype | number(38, 0) |
| 16 | enablestate | enablestate | enablestate | number(38, 0) |
| 17 | end_date | end_date | end_date | char(19) |
| 18 | flag_deffiter | flag_deffiter | flag_deffiter | char(1) |
| 19 | fml_edittype | fml_edittype | fml_edittype | number(38, 0) |
| 20 | hasten_bef_day | hasten_bef_day | hasten_bef_day | number(38, 0) |
| 21 | isaccbookcheck | isaccbookcheck | isaccbookcheck | varchar2(50) |
| 22 | isapproveerrorcommit | isapproveerrorcommit | isapproveerrorcommit | number(38, 0) |
| 23 | iscellimport | iscellimport | iscellimport | number(38, 0) |
| 24 | ischeckerrorcommit | ischeckerrorcommit | ischeckerrorcommit | number(38, 0) |
| 25 | isonlyselfcancel | isonlyselfcancel | isonlyselfcancel | number(38, 0) |
| 26 | isselfandcancancel | isselfandcancancel | isselfandcancancel | varchar2(50) |
| 27 | istaskunitcancel | istaskunitcancel | istaskunitcancel | number(38, 0) |
| 28 | iswarnchecked | iswarnchecked | iswarnchecked | number(38, 0) |
| 29 | name | name | name | varchar2(300) |
| 30 | name2 | name2 | name2 | varchar2(300) |
| 31 | name3 | name3 | name3 | varchar2(300) |
| 32 | name4 | name4 | name4 | varchar2(300) |
| 33 | name5 | name5 | name5 | varchar2(300) |
| 34 | name6 | name6 | name6 | varchar2(300) |
| 35 | nodetype | nodetype | nodetype | char(1) |
| 36 | note | note | note | varchar2(1024) |
| 37 | pk_accscheme | pk_accscheme | pk_accscheme | varchar2(20) |  |  | '~' |
| 38 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 39 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(20) |  |  | '~' |
| 40 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 41 | pk_tasksort | pk_tasksort | pk_tasksort | char(20) | √ |
| 42 | sealflag | sealflag | sealflag | char(1) |
| 43 | start_date | start_date | start_date | char(19) |
| 44 | templatefilecount | templatefilecount | templatefilecount | number(38, 0) |  |  | 0 |
| 45 | templatefilename | templatefilename | templatefilename | varchar2(500) |
| 46 | usedflag | usedflag | usedflag | char(1) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |