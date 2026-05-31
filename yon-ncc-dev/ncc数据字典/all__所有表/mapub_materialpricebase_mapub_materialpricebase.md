# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9795.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterialpriceid | cmaterialpriceid | cmaterialpriceid | char(20) | √ |
| 2 | blockingflag | blockingflag | blockingflag | char(1) |
| 3 | ccrrencyid | ccrrencyid | ccrrencyid | varchar2(20) |  |  | '~' |
| 4 | dbegindate | dbegindate | dbegindate | char(19) |
| 5 | denddate | denddate | denddate | char(19) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | vnote | vnote | vnote | varchar2(181) |
| 10 | vpricecode | vpricecode | vpricecode | varchar2(200) |
| 11 | vpricename | vpricename | vpricename | varchar2(50) |
| 12 | vpricesourcenum | vpricesourcenum | vpricesourcenum | varchar2(1000) |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |