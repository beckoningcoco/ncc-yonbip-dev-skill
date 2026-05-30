# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11597.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_message | pk_message | pk_message | char(20) | √ |
| 2 | actions | actions | actions | varchar2(500) |
| 3 | billid | billid | billid | varchar2(50) |
| 4 | billno | billno | billno | varchar2(50) |
| 5 | billtype | billtype | billtype | varchar2(50) |
| 6 | canbatch | canbatch | canbatch | char(1) |
| 7 | content | content | content | varchar2(4000) |
| 8 | contenttype | contenttype | contenttype | varchar2(20) |
| 9 | detail | detail | detail | varchar2(4000) |
| 10 | domainflag | domainflag | domainflag | varchar2(50) |
| 11 | funccode | funccode | funccode | varchar2(100) |
| 12 | funcid | funcid | funcid | varchar2(20) |
| 13 | message_service | message_service | message_service | varchar2(50) |
| 14 | msgsourcetype | msgsourcetype | msgsourcetype | varchar2(50) |
| 15 | msgtype | msgtype | msgtype | varchar2(50) |
| 16 | params | params | params | varchar2(500) |
| 17 | pk_detail | pk_detail | pk_detail | varchar2(50) |
| 18 | pk_group | pk_group | pk_group | varchar2(50) |
| 19 | pk_org | pk_org | pk_org | varchar2(50) |
| 20 | priority | priority | priority | number(38, 0) |
| 21 | receipt | receipt | receipt | char(1) |
| 22 | receiver | receiver | receiver | varchar2(4000) |
| 23 | resendtimes | resendtimes | resendtimes | number(38, 0) |
| 24 | sender | sender | sender | varchar2(50) |
| 25 | sendstate | sendstate | sendstate | char(1) |
| 26 | sendtime | sendtime | sendtime | char(19) |
| 27 | subject | subject | subject | varchar2(300) |
| 28 | workflowtype | workflowtype | workflowtype | varchar2(20) |
| 29 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 30 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |