# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_holiday | pk_holiday | pk_holiday | char(20) | √ |
| 2 | allflag | allflag | allflag | char(1) | √ |  | 'Y' |
| 3 | code | code | code | varchar2(80) | √ |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |
| 5 | eightswitch | eightswitch | eightswitch | char(10) |
| 6 | eightswitchto | eightswitchto | eightswitchto | char(10) |
| 7 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 8 | endtime | endtime | endtime | char(19) | √ |
| 9 | fiveswitch | fiveswitch | fiveswitch | char(10) |
| 10 | fiveswitchto | fiveswitchto | fiveswitchto | char(10) |
| 11 | formula | formula | formula | varchar2(4000) |
| 12 | formulastr | formulastr | formulastr | varchar2(4000) |
| 13 | fourswitch | fourswitch | fourswitch | char(10) |
| 14 | fourswitchto | fourswitchto | fourswitchto | char(10) |
| 15 | holidayyear | holidayyear | holidayyear | varchar2(10) |
| 16 | isdeftime | isdeftime | isdeftime | char(1) | √ |  | 'N' |
| 17 | memo | memo | memo | varchar2(512) |
| 18 | name | name | name | varchar2(300) | √ |
| 19 | name2 | name2 | name2 | varchar2(300) |
| 20 | name3 | name3 | name3 | varchar2(300) |
| 21 | name4 | name4 | name4 | varchar2(300) |
| 22 | name5 | name5 | name5 | varchar2(300) |
| 23 | name6 | name6 | name6 | varchar2(300) |
| 24 | oneswitch | oneswitch | oneswitch | char(10) |
| 25 | oneswitchto | oneswitchto | oneswitchto | char(10) |
| 26 | pk_group | pk_group | pk_group | char(20) | √ |
| 27 | pk_holidaysort | pk_holidaysort | pk_holidaysort | char(20) | √ |
| 28 | pk_org | pk_org | pk_org | char(20) | √ |
| 29 | sevenswitch | sevenswitch | sevenswitch | char(10) |
| 30 | sevenswitchto | sevenswitchto | sevenswitchto | char(10) |
| 31 | sixswitch | sixswitch | sixswitch | char(10) |
| 32 | sixswitchto | sixswitchto | sixswitchto | char(10) |
| 33 | starttime | starttime | starttime | char(19) | √ |
| 34 | threeswitch | threeswitch | threeswitch | char(10) |
| 35 | threeswitchto | threeswitchto | threeswitchto | char(10) |
| 36 | twoswitch | twoswitch | twoswitch | char(10) |
| 37 | twoswitchto | twoswitchto | twoswitchto | char(10) |
| 38 | creationtime | creationtime | creationtime | char(19) | √ |
| 39 | creator | creator | creator | char(20) | √ |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 42 | modifier | modifier | modifier | char(20) |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |