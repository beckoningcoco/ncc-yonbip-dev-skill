# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11488.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliverylog_h | pk_deliverylog_h | pk_deliverylog_h | char(20) | √ |
| 2 | bankname_r | bankname_r | bankname_r | varchar2(20) |  |  | '~' |
| 3 | deliverybillno | deliverybillno | deliverybillno | varchar2(50) |
| 4 | memo | memo | memo | varchar2(181) |
| 5 | pd_delivery_h | pd_delivery_h | pd_delivery_h | varchar2(50) |
| 6 | pk_bankacc_r | pk_bankacc_r | pk_bankacc_r | varchar2(20) |  |  | '~' |
| 7 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 8 | pk_deliveryrule_h | pk_deliveryrule_h | pk_deliveryrule_h | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | rulecode | rulecode | rulecode | varchar2(50) |
| 13 | rulename | rulename | rulename | varchar2(50) |
| 14 | vuserdef1 | vuserdef1 | vuserdef1 | varchar2(50) |
| 15 | vuserdef2 | vuserdef2 | vuserdef2 | varchar2(50) |
| 16 | vuserdef3 | vuserdef3 | vuserdef3 | varchar2(50) |
| 17 | vuserdef4 | vuserdef4 | vuserdef4 | varchar2(50) |
| 18 | vuserdef5 | vuserdef5 | vuserdef5 | varchar2(50) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |