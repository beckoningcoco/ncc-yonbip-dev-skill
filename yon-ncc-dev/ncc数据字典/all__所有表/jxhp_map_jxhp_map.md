# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hpmap | pk_hpmap | pk_hpmap | char(20) | √ |
| 2 | eu_itemtype | eu_itemtype | eu_itemtype | number(38, 0) | √ |
| 3 | his_code | his_code | his_code | varchar2(50) | √ |
| 4 | his_mnecode | his_mnecode | his_mnecode | varchar2(50) |
| 5 | his_name | his_name | his_name | varchar2(100) | √ |
| 6 | hp_code | hp_code | hp_code | varchar2(50) |
| 7 | hp_name | hp_name | hp_name | varchar2(100) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_hisitem | pk_hisitem | pk_hisitem | varchar2(50) | √ |
| 10 | pk_hpitem | pk_hpitem | pk_hpitem | varchar2(50) |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |