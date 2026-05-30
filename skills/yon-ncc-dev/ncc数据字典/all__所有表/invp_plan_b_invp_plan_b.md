# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan_b | pk_plan_b | pk_plan_b | varchar2(40) | √ |
| 2 | bshowred | bshowred | bshowred | char(1) |  |  | 'N' |
| 3 | dtfreqdate | dtfreqdate | dtfreqdate | char(10) |
| 4 | icycleth | icycleth | icycleth | number(38, 0) |
| 5 | itimebucket | itimebucket | itimebucket | number(38, 0) |
| 6 | nallocnum | nallocnum | nallocnum | number(28, 8) |
| 7 | nendpab | nendpab | nendpab | number(28, 8) |
| 8 | nforecastnum | nforecastnum | nforecastnum | number(28, 8) |
| 9 | ngrossreqnum | ngrossreqnum | ngrossreqnum | number(28, 8) |
| 10 | ninitpabnum | ninitpabnum | ninitpabnum | number(28, 8) |
| 11 | nnetreqnum | nnetreqnum | nnetreqnum | number(28, 8) |
| 12 | nplanrecnum | nplanrecnum | nplanrecnum | number(28, 8) |
| 13 | nplanreleasenum | nplanreleasenum | nplanreleasenum | number(28, 8) |
| 14 | nreqnum | nreqnum | nreqnum | number(28, 8) |
| 15 | nscheduledrecnum | nscheduledrecnum | nscheduledrecnum | number(28, 8) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | pk_plan | pk_plan | pk_plan | varchar2(40) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |