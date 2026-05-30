# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7210.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_que | pk_que | pk_que | char(20) | √ |
| 2 | addr_board | addr_board | addr_board | varchar2(256) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(50) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestatus | approvestatus | approvestatus | number(38, 0) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billno | billno | billno | varchar2(50) |
| 9 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 10 | billversionpk | billversionpk | billversionpk | varchar2(50) |
| 11 | busitype | busitype | busitype | varchar2(50) |
| 12 | code_que | code_que | code_que | varchar2(30) |
| 13 | dt_quetype | dt_quetype | dt_quetype | varchar2(50) |
| 14 | emendenum | emendenum | emendenum | number(38, 0) |
| 15 | enablestate | enablestate | enablestate | char(1) |
| 16 | flag_quesite | flag_quesite | flag_quesite | char(1) |
| 17 | lastmaketime | lastmaketime | lastmaketime | char(19) |
| 18 | maketime | maketime | maketime | char(19) |
| 19 | name_que | name_que | name_que | varchar2(200) |
| 20 | name_que2 | name_que2 | name_que2 | varchar2(200) |
| 21 | name_que3 | name_que3 | name_que3 | varchar2(200) |
| 22 | name_que4 | name_que4 | name_que4 | varchar2(200) |
| 23 | name_que5 | name_que5 | name_que5 | varchar2(200) |
| 24 | name_que6 | name_que6 | name_que6 | varchar2(200) |
| 25 | pk_dept | pk_dept | pk_dept | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_pvquerule | pk_pvquerule | pk_pvquerule | varchar2(20) |  |  | '~' |
| 30 | pk_pvques | pk_pvques | pk_pvques | varchar2(20) |  |  | '~' |
| 31 | pk_quetype | pk_quetype | pk_quetype | varchar2(20) |  |  | '~' |
| 32 | pk_res | pk_res | pk_res | varchar2(50) |  |  | '~' |
| 33 | pk_schsrv | pk_schsrv | pk_schsrv | varchar2(50) |  |  | '~' |
| 34 | quan_limit | quan_limit | quan_limit | number(38, 0) |
| 35 | srcbillid | srcbillid | srcbillid | varchar2(50) |
| 36 | srcbilltype | srcbilltype | srcbilltype | varchar2(50) |
| 37 | transtype | transtype | transtype | varchar2(50) |
| 38 | transtypepk | transtypepk | transtypepk | varchar2(20) |  |  | '~' |
| 39 | creationtime | creationtime | creationtime | char(19) |
| 40 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 41 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 42 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 43 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 44 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |