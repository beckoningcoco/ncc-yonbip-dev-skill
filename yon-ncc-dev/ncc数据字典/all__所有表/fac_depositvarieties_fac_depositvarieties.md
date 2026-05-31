# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8068.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | beginamount | beginamount | beginamount | number(28, 8) |
| 2 | depositperiod | depositperiod | depositperiod | number(38, 0) |
| 3 | mindrawamount | mindrawamount | mindrawamount | number(28, 8) |
| 4 | mrate | mrate | mrate | number(28, 8) |
| 5 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 6 | periodunit | periodunit | periodunit | varchar2(50) |
| 7 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 8 | pk_branch | pk_branch | pk_branch | varchar2(20) |  |  | '~' |
| 9 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 10 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 11 | pk_finvariety | pk_finvariety | pk_finvariety | varchar2(20) |  |  | '~' |
| 12 | pk_largebanks | pk_largebanks | pk_largebanks | varchar2(20) |  |  | '~' |
| 13 | pk_varieties | pk_varieties | pk_varieties | char(20) | √ |
| 14 | rate | rate | rate | number(28, 8) |
| 15 | redeposittype | redeposittype | redeposittype | varchar2(32) |
| 16 | repayintstmethod | repayintstmethod | repayintstmethod | varchar2(50) |
| 17 | varcode | varcode | varcode | varchar2(50) |
| 18 | variety_name | variety_name | variety_name | varchar2(20) |  |  | '~' |
| 19 | varname | varname | varname | varchar2(200) |
| 20 | varname2 | varname2 | varname2 | varchar2(200) |
| 21 | varname3 | varname3 | varname3 | varchar2(200) |
| 22 | varname4 | varname4 | varname4 | varchar2(200) |
| 23 | varname5 | varname5 | varname5 | varchar2(200) |
| 24 | varname6 | varname6 | varname6 | varchar2(200) |
| 25 | varproperty | varproperty | varproperty | varchar2(50) |
| 26 | vartype | vartype | vartype | varchar2(50) |
| 27 | yrate | yrate | yrate | number(28, 8) |
| 28 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 29 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 30 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 31 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 32 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 33 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 34 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 35 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 36 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 37 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 38 | creationtime | creationtime | creationtime | char(19) |
| 39 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 40 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 41 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 42 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 43 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |