# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11429.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | bill_4a | bill_4a | bill_4a | char(1) |
| 2 | bill_4k | bill_4k | bill_4k | char(1) |
| 3 | bill_5a | bill_5a | bill_5a | char(1) |
| 4 | bill_5x | bill_5x | bill_5x | char(1) |
| 5 | bill_20 | bill_20 | bill_20 | char(1) |
| 6 | bill_21 | bill_21 | bill_21 | char(1) |
| 7 | bill_45 | bill_45 | bill_45 | char(1) |
| 8 | bill_422x | bill_422x | bill_422x | char(1) |
| 9 | bill_4455 | bill_4455 | bill_4455 | char(1) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | pk_scmmp01 | pk_scmmp01 | pk_scmmp01 | char(20) | √ |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |