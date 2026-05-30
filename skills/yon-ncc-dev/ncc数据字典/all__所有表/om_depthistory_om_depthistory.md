# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10101.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depthistory | pk_depthistory | pk_depthistory | char(20) | √ |
| 2 | approvedept | approvedept | approvedept | varchar2(256) |
| 3 | approvenum | approvenum | approvenum | varchar2(50) |
| 4 | changenum | changenum | changenum | char(20) |
| 5 | changetype | changetype | changetype | varchar2(50) |
| 6 | code | code | code | varchar2(40) |
| 7 | deptlevel | deptlevel | deptlevel | varchar2(20) |  |  | '~' |
| 8 | effectdate | effectdate | effectdate | char(10) |
| 9 | isreceived | isreceived | isreceived | char(1) |
| 10 | memo | memo | memo | varchar2(300) |
| 11 | name | name | name | varchar2(300) |
| 12 | name2 | name2 | name2 | varchar2(300) |
| 13 | name3 | name3 | name3 | varchar2(300) |
| 14 | name4 | name4 | name4 | varchar2(300) |
| 15 | name5 | name5 | name5 | varchar2(300) |
| 16 | name6 | name6 | name6 | varchar2(300) |
| 17 | pk_dept | pk_dept | pk_dept | char(20) |  |  | '~' |
| 18 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 19 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 20 | principal | principal | principal | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |