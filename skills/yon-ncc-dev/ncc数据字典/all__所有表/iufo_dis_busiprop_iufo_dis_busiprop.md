# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9523.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_item | pk_item | pk_item | varchar2(20) | √ |  | '~' |
| 2 | pk_task | pk_task | pk_task | varchar2(20) | √ |
| 3 | receiverid | receiverid | receiverid | varchar2(20) | √ |
| 4 | senderid | senderid | senderid | varchar2(20) | √ |
| 5 | itemdesc | itemdesc | itemdesc | varchar2(200) |
| 6 | lasttranstime | lasttranstime | lasttranstime | char(19) |
| 7 | operate | operate | operate | char(3) |
| 8 | receiptmsg | receiptmsg | receiptmsg | varchar2(400) |
| 9 | recentmodtime | recentmodtime | recentmodtime | char(19) |
| 10 | status | status | status | char(3) |
| 11 | transresid | transresid | transresid | varchar2(100) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |