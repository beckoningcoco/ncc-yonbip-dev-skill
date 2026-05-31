# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_varieties | pk_varieties | pk_varieties | char(20) | √ |
| 2 | beginamount | beginamount | beginamount | number(28, 8) |
| 3 | depositperiod | depositperiod | depositperiod | number(38, 0) |
| 4 | mindrawamount | mindrawamount | mindrawamount | number(28, 8) |
| 5 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 6 | periodunit | periodunit | periodunit | varchar2(50) |
| 7 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 8 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 9 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 14 | varcode | varcode | varcode | varchar2(50) |
| 15 | varname | varname | varname | varchar2(200) |
| 16 | varname2 | varname2 | varname2 | varchar2(200) |
| 17 | varname3 | varname3 | varname3 | varchar2(200) |
| 18 | varname4 | varname4 | varname4 | varchar2(200) |
| 19 | varname5 | varname5 | varname5 | varchar2(200) |
| 20 | varname6 | varname6 | varname6 | varchar2(200) |
| 21 | varproperty | varproperty | varproperty | varchar2(50) |
| 22 | vartype | vartype | vartype | varchar2(50) |
| 23 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 24 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 25 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 26 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 27 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 28 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 29 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 30 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 31 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 32 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 33 | creationtime | creationtime | creationtime | char(19) |
| 34 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 37 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 38 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |