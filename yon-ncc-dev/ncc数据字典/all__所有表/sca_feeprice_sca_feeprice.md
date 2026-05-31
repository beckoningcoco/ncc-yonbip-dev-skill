# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11408.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_feeprice | pk_feeprice | pk_feeprice | char(20) | √ |
| 2 | cactivityid | cactivityid | cactivityid | varchar2(20) |  |  | '~' |
| 3 | cmarcostclassid | cmarcostclassid | cmarcostclassid | varchar2(20) |  |  | '~' |
| 4 | dbillratio | dbillratio | dbillratio | number(28, 8) |
| 5 | dfeerate | dfeerate | dfeerate | number(28, 8) |
| 6 | effectiveperiod | effectiveperiod | effectiveperiod | varchar2(20) |  |  | '~' |
| 7 | invalidperiod | invalidperiod | invalidperiod | varchar2(20) |  |  | '~' |
| 8 | pk_bd_wk | pk_bd_wk | pk_bd_wk | varchar2(20) |  |  | '~' |
| 9 | pk_costtypeid | pk_costtypeid | pk_costtypeid | varchar2(20) |  |  | '~' |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | relcactivityid | relcactivityid | relcactivityid | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |