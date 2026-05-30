# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12890.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_periodstate | pk_periodstate | pk_periodstate | char(20) | √ |
| 2 | accountmark | accountmark | accountmark | char(1) | √ |  | 'N' |
| 3 | caculateflag | caculateflag | caculateflag | char(1) | √ |  | 'N' |
| 4 | checkflag | checkflag | checkflag | char(1) | √ |  | 'N' |
| 5 | classtype | classtype | classtype | number(38, 0) |  |  | 0 |
| 6 | cpaydate | cpaydate | cpaydate | char(19) |
| 7 | cpreclassid | cpreclassid | cpreclassid | varchar2(200) |
| 8 | daccdate | daccdate | daccdate | char(19) |
| 9 | enableflag | enableflag | enableflag | char(1) | √ |  | 'N' |
| 10 | isapporve | isapporve | isapporve | varchar2(1) |  |  | 'Y' |
| 11 | isapproved | isapproved | isapproved | char(1) |  |  | 'N' |
| 12 | operatorid | operatorid | operatorid | varchar2(20) |
| 13 | payoffflag | payoffflag | payoffflag | char(1) | √ |  | 'N' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 15 | pk_org | pk_org | pk_org | varchar2(20) | √ |
| 16 | pk_wa_class | pk_wa_class | pk_wa_class | varchar2(20) | √ |
| 17 | pk_wa_period | pk_wa_period | pk_wa_period | varchar2(20) | √ |
| 18 | vpaycomment | vpaycomment | vpaycomment | varchar2(2000) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |