# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10118.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post | pk_post | pk_post | char(20) | √ |
| 2 | abortdate | abortdate | abortdate | char(10) |
| 3 | builddate | builddate | builddate | char(10) |
| 4 | dataoriginflag | dataoriginflag | dataoriginflag | number(38, 0) |  |  | 0 |
| 5 | degree | degree | degree | char(20) |
| 6 | employment | employment | employment | varchar2(20) |  |  | '~' |
| 7 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 8 | hrcanceldate | hrcanceldate | hrcanceldate | char(19) |
| 9 | hrcanceled | hrcanceled | hrcanceled | char(1) |
| 10 | inheritflag | inheritflag | inheritflag | char(1) |
| 11 | innercode | innercode | innercode | varchar2(50) |
| 12 | isabort | isabort | isabort | char(1) |
| 13 | isdeptrespon | isdeptrespon | isdeptrespon | char(1) |
| 14 | iskeypost | iskeypost | iskeypost | char(1) |
| 15 | isstd | isstd | isstd | char(1) |
| 16 | junior | junior | junior | varchar2(4000) |
| 17 | maxage | maxage | maxage | number(38, 0) |
| 18 | minage | minage | minage | number(38, 0) |
| 19 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 20 | pk_grade_source | pk_grade_source | pk_grade_source | char(20) |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_hrorg | pk_hrorg | pk_hrorg | char(20) |  |  | '~' |
| 23 | pk_job | pk_job | pk_job | varchar2(20) |  |  | '~' |
| 24 | pk_level_source | pk_level_source | pk_level_source | char(20) |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_postseries | pk_postseries | pk_postseries | varchar2(20) |  |  | '~' |
| 27 | pk_poststd | pk_poststd | pk_poststd | varchar2(20) |  |  | '~' |
| 28 | postcode | postcode | postcode | varchar2(40) | √ |
| 29 | postname | postname | postname | varchar2(300) | √ |
| 30 | postname2 | postname2 | postname2 | varchar2(300) |
| 31 | postname3 | postname3 | postname3 | varchar2(300) |
| 32 | postname4 | postname4 | postname4 | varchar2(300) |
| 33 | postname5 | postname5 | postname5 | varchar2(300) |
| 34 | postname6 | postname6 | postname6 | varchar2(300) |
| 35 | professional | professional | professional | char(20) |
| 36 | reqedu | reqedu | reqedu | varchar2(20) |  |  | '~' |
| 37 | reqexp | reqexp | reqexp | varchar2(1024) |
| 38 | reqother | reqother | reqother | varchar2(1024) |
| 39 | reqpro | reqpro | reqpro | varchar2(20) |  |  | '~' |
| 40 | reqsex | reqsex | reqsex | number(38, 0) |
| 41 | reqworktime | reqworktime | reqworktime | number(38, 0) |
| 42 | reqyold | reqyold | reqyold | varchar2(1024) |
| 43 | sealflag | sealflag | sealflag | char(1) |
| 44 | seq | seq | seq | varchar2(50) |
| 45 | sourcetype | sourcetype | sourcetype | number(38, 0) |
| 46 | suporior | suporior | suporior | varchar2(20) |  |  | '~' |
| 47 | worksumm | worksumm | worksumm | varchar2(1024) |
| 48 | worktype | worktype | worktype | varchar2(20) |  |  | '~' |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |