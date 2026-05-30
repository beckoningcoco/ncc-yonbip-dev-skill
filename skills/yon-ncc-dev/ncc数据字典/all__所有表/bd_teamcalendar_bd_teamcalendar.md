# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_teamcalendar | pk_teamcalendar | pk_teamcalendar | char(20) | √ |
| 2 | calendar | calendar | calendar | char(10) |
| 3 | cancelflag | cancelflag | cancelflag | char(1) |
| 4 | cwkid | cwkid | cwkid | varchar2(20) |  |  | '~' |
| 5 | gzsj | gzsj | gzsj | number(28, 8) |
| 6 | if_rest | if_rest | if_rest | char(1) |
| 7 | isflexiblefinal | isflexiblefinal | isflexiblefinal | char(1) |
| 8 | ismanuctrl | ismanuctrl | ismanuctrl | char(1) |
| 9 | iswtrecreate | iswtrecreate | iswtrecreate | char(1) |
| 10 | original_shift_b4cut | original_shift_b4cut | original_shift_b4cut | varchar2(20) |  |  | '~' |
| 11 | original_shift_b4exg | original_shift_b4exg | original_shift_b4exg | varchar2(20) |  |  | '~' |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | pk_shift | pk_shift | pk_shift | varchar2(20) |  |  | '~' |
| 16 | pk_team | pk_team | pk_team | varchar2(20) |  |  | '~' |
| 17 | vnote | vnote | vnote | varchar2(181) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | varchar2(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |