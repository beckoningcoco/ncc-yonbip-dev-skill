# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9241.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balance | pk_balance | pk_balance | char(20) | √ |
| 2 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 3 | dplancreator | dplancreator | dplancreator | varchar2(20) |
| 4 | dplandate | dplandate | dplandate | varchar2(19) |
| 5 | fmatchtype | fmatchtype | fmatchtype | number(38, 0) |
| 6 | fno | fno | fno | number(38, 0) |
| 7 | itimebucket | itimebucket | itimebucket | number(38, 0) |
| 8 | nnum | nnum | nnum | number(28, 8) |
| 9 | nreq | nreq | nreq | number(28, 8) |
| 10 | nsupply | nsupply | nsupply | number(28, 8) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | pk_require | pk_require | pk_require | varchar2(40) |  |  | '~' |
| 15 | pk_supply | pk_supply | pk_supply | varchar2(40) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |