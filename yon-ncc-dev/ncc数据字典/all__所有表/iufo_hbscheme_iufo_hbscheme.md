# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9630.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbscheme | pk_hbscheme | pk_hbscheme | char(20) | √ |
| 2 | code | code | code | number(38, 0) |
| 3 | commitcheck | commitcheck | commitcheck | number(38, 0) |  |  | 0 |
| 4 | commitmode | commitmode | commitmode | number(38, 0) |  |  | 0 |
| 5 | commitopt | commitopt | commitopt | number(38, 0) |  |  | 0 |
| 6 | commit_end_day | commit_end_day | commit_end_day | number(38, 0) |
| 7 | dataorigin | dataorigin | dataorigin | varchar2(50) |
| 8 | enablestate | enablestate | enablestate | number(38, 0) |
| 9 | ischeckerrorcommit | ischeckerrorcommit | ischeckerrorcommit | number(38, 0) |  |  | 0 |
| 10 | isdxreportverify | isdxreportverify | isdxreportverify | char(1) |
| 11 | ishberportverify | ishberportverify | ishberportverify | char(1) |
| 12 | ispermithb | ispermithb | ispermithb | char(1) |  |  | 'Y' |
| 13 | issreportverify | issreportverify | issreportverify | char(1) |
| 14 | keygroupname | keygroupname | keygroupname | varchar2(100) |
| 15 | name | name | name | varchar2(300) |
| 16 | name2 | name2 | name2 | varchar2(300) |
| 17 | name3 | name3 | name3 | varchar2(300) |
| 18 | name4 | name4 | name4 | varchar2(300) |
| 19 | name5 | name5 | name5 | varchar2(300) |
| 20 | name6 | name6 | name6 | varchar2(300) |
| 21 | note | note | note | varchar2(2000) |
| 22 | pk_accperiodscheme | pk_accperiodscheme | pk_accperiodscheme | varchar2(20) |  |  | '~' |
| 23 | pk_adjustscheme | pk_adjustscheme | pk_adjustscheme | varchar2(20) |  |  | '~' |
| 24 | pk_dxscheme | pk_dxscheme | pk_dxscheme | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_investscheme | pk_investscheme | pk_investscheme | varchar2(20) |  |  | '~' |
| 27 | pk_keygroup | pk_keygroup | pk_keygroup | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_repmanastru | pk_repmanastru | pk_repmanastru | varchar2(20) |  |  | '~' |
| 30 | pk_task | pk_task | pk_task | varchar2(20) |  |  | '~' |
| 31 | sealflag | sealflag | sealflag | char(1) |
| 32 | showdefaultdraft | showdefaultdraft | showdefaultdraft | char(1) |
| 33 | userdflag | userdflag | userdflag | char(1) |
| 34 | version | version | version | number(38, 0) |
| 35 | creationtime | creationtime | creationtime | char(19) |
| 36 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 37 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 38 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 39 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 40 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |