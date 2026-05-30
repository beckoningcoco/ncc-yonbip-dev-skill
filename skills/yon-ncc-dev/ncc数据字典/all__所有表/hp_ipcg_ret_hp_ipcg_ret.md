# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpret | pk_hpret | pk_hpret | char(28) | √ |
| 2 | chargelevel | chargelevel | chargelevel | varchar2(20) |  |  | '~' |
| 3 | outlimitpay | outlimitpay | outlimitpay | varchar2(20) |
| 4 | outtreatmoney | outtreatmoney | outtreatmoney | varchar2(20) |
| 5 | payratio | payratio | payratio | number(28, 8) |
| 6 | pk_cg | pk_cg | pk_cg | varchar2(36) |  |  | '~' |
| 7 | pk_pv | pk_pv | pk_pv | varchar2(36) |  |  | '~' |
| 8 | privatemoney | privatemoney | privatemoney | varchar2(20) |
| 9 | selfmoney | selfmoney | selfmoney | varchar2(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |