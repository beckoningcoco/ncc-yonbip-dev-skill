# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supply | pk_supply | pk_supply | varchar2(40) | √ |
| 2 | cmaterialoid | cmaterialoid | cmaterialoid | varchar2(20) |  |  | '~' |
| 3 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 4 | csupplybillbid | csupplybillbid | csupplybillbid | varchar2(20) |
| 5 | csupplybillid | csupplybillid | csupplybillid | varchar2(20) |
| 6 | csupplycode | csupplycode | csupplycode | varchar2(50) |
| 7 | csupplytrantype | csupplytrantype | csupplytrantype | varchar2(20) |  |  | '~' |
| 8 | csupplytype | csupplytype | csupplytype | varchar2(20) |  |  | '~' |
| 9 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 10 | dbilldate | dbilldate | dbilldate | char(19) |
| 11 | dorgsupplydate | dorgsupplydate | dorgsupplydate | char(10) |
| 12 | dsupplydate | dsupplydate | dsupplydate | char(19) |
| 13 | ipriority | ipriority | ipriority | number(38, 0) |
| 14 | itimebucket | itimebucket | itimebucket | number(38, 0) |
| 15 | nnum | nnum | nnum | number(28, 8) |
| 16 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 17 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 18 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 19 | vsupplyrowno | vsupplyrowno | vsupplyrowno | varchar2(50) |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |