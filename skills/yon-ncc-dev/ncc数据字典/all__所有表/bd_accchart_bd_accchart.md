# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accchart | pk_accchart | pk_accchart | char(20) | √ |
| 2 | accpolicychart | accpolicychart | accpolicychart | char(1) |  |  | 'N' |
| 3 | alterchart | alterchart | alterchart | varchar2(20) |  |  | '~' |
| 4 | beginperiod | beginperiod | beginperiod | char(10) |  |  | '0000-00-00' |
| 5 | code | code | code | varchar2(40) | √ |
| 6 | ctrllevel | ctrllevel | ctrllevel | number(38, 0) | √ |  | -1 |
| 7 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 8 | dispnamemodel | dispnamemodel | dispnamemodel | number(38, 0) | √ |  | 0 |
| 9 | endperiod | endperiod | endperiod | char(10) |  |  | '9999-99-99' |
| 10 | innercode | innercode | innercode | varchar2(200) |
| 11 | isplychart | isplychart | isplychart | char(1) |  |  | 'N' |
| 12 | memo | memo | memo | varchar2(300) |
| 13 | name | name | name | varchar2(300) | √ |
| 14 | name2 | name2 | name2 | varchar2(300) |
| 15 | name3 | name3 | name3 | varchar2(300) |
| 16 | name4 | name4 | name4 | varchar2(300) |
| 17 | name5 | name5 | name5 | varchar2(300) |
| 18 | name6 | name6 | name6 | varchar2(300) |
| 19 | originalchart | originalchart | originalchart | varchar2(20) |  |  | '~' |
| 20 | pk_accctrlrule | pk_accctrlrule | pk_accctrlrule | varchar2(20) |  |  | '~' |
| 21 | pk_accsystem | pk_accsystem | pk_accsystem | varchar2(20) |  |  | '~' |
| 22 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 23 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 24 | tempchartid | tempchartid | tempchartid | varchar2(20) |  |  | '~' |
| 25 | tempversionflag | tempversionflag | tempversionflag | char(1) | √ |  | 'N' |
| 26 | creationtime | creationtime | creationtime | char(19) |
| 27 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 30 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 31 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |