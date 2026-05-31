# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11849.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | auditstatus | auditstatus | auditstatus | varchar2(254) |
| 3 | billno | billno | billno | varchar2(254) |
| 4 | businessid | businessid | businessid | varchar2(36) |
| 5 | endtime | endtime | endtime | char(19) |
| 6 | isautoapprove | isautoapprove | isautoapprove | char(1) |
| 7 | ismatchapproverule | ismatchapproverule | ismatchapproverule | char(1) |
| 8 | issscfinish | issscfinish | issscfinish | char(1) |
| 9 | maker | maker | maker | varchar2(36) |
| 10 | oprationtime | oprationtime | oprationtime | char(19) |
| 11 | pk_billtype | pk_billtype | pk_billtype | varchar2(50) |
| 12 | pk_org | pk_org | pk_org | varchar2(50) |
| 13 | pk_sscunit | pk_sscunit | pk_sscunit | varchar2(50) |
| 14 | rejectstatus | rejectstatus | rejectstatus | varchar2(50) |
| 15 | sscendtime | sscendtime | sscendtime | char(19) |
| 16 | sscnode | sscnode | sscnode | varchar2(36) |
| 17 | sscpost | sscpost | sscpost | varchar2(36) |
| 18 | sscstarttime | sscstarttime | sscstarttime | char(19) |
| 19 | ssctaketime | ssctaketime | ssctaketime | char(19) |
| 20 | ssctaskregister | ssctaskregister | ssctaskregister | varchar2(36) |
| 21 | sscuser | sscuser | sscuser | varchar2(36) |
| 22 | taskstatus | taskstatus | taskstatus | varchar2(254) |
| 23 | tasktype | tasktype | tasktype | varchar2(50) |
| 24 | urgent | urgent | urgent | varchar2(10) |
| 25 | warningtime | warningtime | warningtime | char(19) |
| 26 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 27 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |