# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11957.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | uuid | uuid | uuid | varchar2(40) | √ |
| 2 | action | action | action | varchar2(40) |
| 3 | actionstatus | actionstatus | actionstatus | varchar2(20) |
| 4 | bizid | bizid | bizid | varchar2(40) |
| 5 | channelcode | channelcode | channelcode | varchar2(50) |
| 6 | createtime | createtime | createtime | char(20) |
| 7 | data | data | data | clob |
| 8 | dealmessage | dealmessage | dealmessage | varchar2(1024) |
| 9 | dealstatus | dealstatus | dealstatus | varchar2(20) |
| 10 | message | message | message | varchar2(1024) |
| 11 | param | param | param | clob |
| 12 | receiptdata | receiptdata | receiptdata | clob |
| 13 | receiptmessage | receiptmessage | receiptmessage | varchar2(1024) |
| 14 | receiptresult | receiptresult | receiptresult | clob |
| 15 | receiptstatus | receiptstatus | receiptstatus | varchar2(20) |
| 16 | receipttimes | receipttimes | receipttimes | number(38, 0) |
| 17 | taskid | taskid | taskid | varchar2(40) | √ |
| 18 | tenantid | tenantid | tenantid | varchar2(40) |
| 19 | updatetime | updatetime | updatetime | varchar2(20) |
| 20 | userid | userid | userid | varchar2(20) |
| 21 | ts | ts | ts | varchar2(20) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |