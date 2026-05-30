# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13050.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpdetail | pk_hpdetail | pk_hpdetail | char(20) | √ |
| 2 | amount | amount | amount | number(14, 2) |
| 3 | chargelevel | chargelevel | chargelevel | number(14, 2) |
| 4 | flag_use | flag_use | flag_use | char(1) |
| 5 | hissrvcode | hissrvcode | hissrvcode | varchar2(50) |
| 6 | hpcard | hpcard | hpcard | varchar2(50) |
| 7 | hpcode | hpcode | hpcode | varchar2(50) |
| 8 | hpsrvcode | hpsrvcode | hpsrvcode | varchar2(50) |
| 9 | outlimitpay | outlimitpay | outlimitpay | number(14, 2) |
| 10 | outtreatmoey | outtreatmoey | outtreatmoey | number(14, 2) |
| 11 | patiname | patiname | patiname | varchar2(50) |
| 12 | payratio | payratio | payratio | number(14, 2) |
| 13 | pk_hp | pk_hp | pk_hp | varchar2(20) |  |  | '~' |
| 14 | pk_pi | pk_pi | pk_pi | varchar2(20) |  |  | '~' |
| 15 | pk_psn | pk_psn | pk_psn | varchar2(50) |
| 16 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 17 | price | price | price | number(14, 2) |
| 18 | privatemoney | privatemoney | privatemoney | number(14, 2) |
| 19 | psnname | psnname | psnname | varchar2(50) |
| 20 | quan | quan | quan | number(14, 2) |
| 21 | selfmoney | selfmoney | selfmoney | number(14, 2) |
| 22 | srvname | srvname | srvname | varchar2(256) |
| 23 | creationtime | creationtime | creationtime | char(19) |
| 24 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 27 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 28 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |