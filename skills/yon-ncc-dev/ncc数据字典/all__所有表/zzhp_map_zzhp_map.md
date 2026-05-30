# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/13054.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpmap | pk_hpmap | pk_hpmap | char(20) | √ |
| 2 | eu_hptype | eu_hptype | eu_hptype | varchar2(20) |  |  | '~' |
| 3 | eu_itemtype | eu_itemtype | eu_itemtype | number(38, 0) |
| 4 | flag_use | flag_use | flag_use | char(1) |
| 5 | hiscode | hiscode | hiscode | varchar2(30) |
| 6 | hisname | hisname | hisname | varchar2(50) |
| 7 | hpcode | hpcode | hpcode | varchar2(50) |
| 8 | hpitemcode | hpitemcode | hpitemcode | varchar2(50) |
| 9 | hpitemname | hpitemname | hpitemname | varchar2(256) |
| 10 | hpname | hpname | hpname | varchar2(50) |
| 11 | note | note | note | varchar2(256) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_hp | pk_hp | pk_hp | varchar2(20) |
| 14 | pk_hpitem | pk_hpitem | pk_hpitem | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pk_srv | pk_srv | pk_srv | varchar2(50) |  |  | '~' |
| 17 | ratio_self | ratio_self | ratio_self | number(14, 2) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |