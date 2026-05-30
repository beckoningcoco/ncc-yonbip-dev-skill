# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11287.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fundreport_mid | pk_fundreport_mid | pk_fundreport_mid | char(20) | √ |
| 2 | amountmoney | amountmoney | amountmoney | number(28, 8) |
| 3 | comcode | comcode | comcode | varchar2(50) |
| 4 | comname | comname | comname | varchar2(200) |
| 5 | dayidx | dayidx | dayidx | varchar2(50) |
| 6 | moneyuse | moneyuse | moneyuse | varchar2(50) |
| 7 | moneyuseexplain | moneyuseexplain | moneyuseexplain | varchar2(500) |
| 8 | opertype | opertype | opertype | varchar2(50) |
| 9 | payunitname | payunitname | payunitname | varchar2(200) |
| 10 | receiveunitname | receiveunitname | receiveunitname | varchar2(200) |
| 11 | recordid | recordid | recordid | varchar2(100) |
| 12 | remark | remark | remark | varchar2(500) |
| 13 | reserved1 | reserved1 | reserved1 | varchar2(200) |
| 14 | reserved2 | reserved2 | reserved2 | varchar2(200) |
| 15 | reserved3 | reserved3 | reserved3 | varchar2(200) |
| 16 | reserved4 | reserved4 | reserved4 | varchar2(200) |
| 17 | reserved5 | reserved5 | reserved5 | varchar2(200) |
| 18 | sumlevel | sumlevel | sumlevel | number(28, 8) |
| 19 | upload_flag | upload_flag | upload_flag | varchar2(50) |
| 20 | upload_time | upload_time | upload_time | char(19) |
| 21 | year | year | year | varchar2(50) |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |