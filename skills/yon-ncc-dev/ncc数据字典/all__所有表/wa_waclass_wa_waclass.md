# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12916.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_class | pk_wa_class | pk_wa_class | char(20) | √ |
| 2 | addflag | addflag | addflag | char(1) |  |  | 'N' |
| 3 | checkflowflag | checkflowflag | checkflowflag | char(1) |  |  | 'N' |
| 4 | code | code | code | varchar2(110) | √ |
| 5 | collectflag | collectflag | collectflag | char(1) | √ |  | 'N' |
| 6 | cperiod | cperiod | cperiod | char(2) |
| 7 | currid | currid | currid | varchar2(20) | √ |
| 8 | cyear | cyear | cyear | char(4) |
| 9 | displaytaxitem | displaytaxitem | displaytaxitem | varchar2(100) |
| 10 | idisplayorder | idisplayorder | idisplayorder | number(38, 0) |
| 11 | isapporve | isapporve | isapporve | varchar2(1) |  |  | 'Y' |
| 12 | leaveflag | leaveflag | leaveflag | char(1) |
| 13 | mutipleflag | mutipleflag | mutipleflag | char(1) | √ |  | 'N' |
| 14 | name | name | name | varchar2(100) | √ |
| 15 | name2 | name2 | name2 | varchar2(100) |
| 16 | name3 | name3 | name3 | varchar2(100) |
| 17 | name4 | name4 | name4 | varchar2(100) |
| 18 | name5 | name5 | name5 | varchar2(100) |
| 19 | name6 | name6 | name6 | varchar2(100) |
| 20 | pk_country | pk_country | pk_country | varchar2(20) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 22 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 23 | pk_periodscheme | pk_periodscheme | pk_periodscheme | varchar2(20) |
| 24 | pk_wa_taxsetbase | pk_wa_taxsetbase | pk_wa_taxsetbase | varchar2(20) |
| 25 | showflag | showflag | showflag | char(1) | √ |
| 26 | startperiod | startperiod | startperiod | char(2) |
| 27 | startyear | startyear | startyear | char(4) |
| 28 | stopflag | stopflag | stopflag | char(1) | √ |  | 'N' |
| 29 | taxcurrid | taxcurrid | taxcurrid | varchar2(20) | √ |
| 30 | taxmode | taxmode | taxmode | number(38, 0) | √ |  | 1 |
| 31 | voucherflag | voucherflag | voucherflag | char(1) | √ |  | 'N' |
| 32 | yearbonusflag | yearbonusflag | yearbonusflag | char(1) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |