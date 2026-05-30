# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobcalculate | pk_jobcalculate | pk_jobcalculate | char(20) | √ |
| 2 | amount_book | amount_book | amount_book | number(28, 8) |
| 3 | amount_glb | amount_glb | amount_glb | number(28, 8) |
| 4 | amount_grp | amount_grp | amount_grp | number(28, 8) |
| 5 | jobvolume | jobvolume | jobvolume | number(28, 8) |
| 6 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |  |  | '~' |
| 7 | pk_accperiod | pk_accperiod | pk_accperiod | varchar2(20) |  |  | '~' |
| 8 | pk_activity | pk_activity | pk_activity | varchar2(20) |  |  | '~' |
| 9 | pk_activityprice | pk_activityprice | pk_activityprice | varchar2(20) |
| 10 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_jobresult | pk_jobresult | pk_jobresult | varchar2(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_tbversion | pk_tbversion | pk_tbversion | varchar2(20) |  |  | '~' |
| 16 | pricetype | pricetype | pricetype | number(38, 0) |
| 17 | unitprice_book | unitprice_book | unitprice_book | number(28, 8) |
| 18 | unitprice_glb | unitprice_glb | unitprice_glb | number(28, 8) |
| 19 | unitprice_grp | unitprice_grp | unitprice_grp | number(28, 8) |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |