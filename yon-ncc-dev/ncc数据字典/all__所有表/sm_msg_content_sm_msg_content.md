# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11588.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_message | pk_message | pk_message | char(20) | √ |
| 2 | billid | billid | billid | varchar2(50) |
| 3 | billtype | billtype | billtype | varchar2(50) |
| 4 | content | content | content | varchar2(1536) |
| 5 | contenttype | contenttype | contenttype | varchar2(20) |
| 6 | destination | destination | destination | varchar2(20) |
| 7 | detail | detail | detail | varchar2(300) |
| 8 | domainflag | domainflag | domainflag | varchar2(50) |
| 9 | expiration | expiration | expiration | char(19) |
| 10 | extfield | extfield | extfield | varchar2(300) |
| 11 | isactived | isactived | isactived | number(38, 0) |  |  | 1 |
| 12 | isdelete | isdelete | isdelete | char(1) |
| 13 | ishandled | ishandled | ishandled | char(1) |
| 14 | isread | isread | isread | char(1) |
| 15 | msgsendpk | msgsendpk | msgsendpk | varchar2(20) |
| 16 | msgsourcetype | msgsourcetype | msgsourcetype | varchar2(50) |
| 17 | msgtype | msgtype | msgtype | varchar2(50) |
| 18 | pk_colorkey | pk_colorkey | pk_colorkey | varchar2(30) |
| 19 | pk_detail | pk_detail | pk_detail | varchar2(50) |
| 20 | pk_group | pk_group | pk_group | varchar2(50) |
| 21 | pk_org | pk_org | pk_org | varchar2(50) |
| 22 | priority | priority | priority | number(38, 0) |
| 23 | receipt | receipt | receipt | char(1) |
| 24 | receiver | receiver | receiver | varchar2(4000) |
| 25 | resendtimes | resendtimes | resendtimes | number(38, 0) |
| 26 | sender | sender | sender | varchar2(50) |
| 27 | sendstate | sendstate | sendstate | char(1) |
| 28 | sendtime | sendtime | sendtime | char(19) |
| 29 | subcolor | subcolor | subcolor | varchar2(20) |
| 30 | subject | subject | subject | varchar2(300) |
| 31 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 32 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |