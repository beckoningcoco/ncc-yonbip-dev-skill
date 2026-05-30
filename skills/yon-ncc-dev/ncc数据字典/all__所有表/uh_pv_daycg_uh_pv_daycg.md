# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12736.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvdaycg | pk_pvdaycg | pk_pvdaycg | char(20) | √ |
| 2 | date_bedcg | date_bedcg | date_bedcg | char(19) |
| 3 | date_daycg | date_daycg | date_daycg | char(19) |
| 4 | eu_daycgset | eu_daycgset | eu_daycgset | varchar2(50) |
| 5 | flag_stop_bed | flag_stop_bed | flag_stop_bed | char(1) |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_pv | pk_pv | pk_pv | varchar2(20) |  |  | '~' |
| 9 | def1 | def1 | def1 | varchar2(50) |
| 10 | def2 | def2 | def2 | varchar2(50) |
| 11 | def3 | def3 | def3 | varchar2(50) |
| 12 | def4 | def4 | def4 | varchar2(50) |
| 13 | def5 | def5 | def5 | varchar2(50) |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |