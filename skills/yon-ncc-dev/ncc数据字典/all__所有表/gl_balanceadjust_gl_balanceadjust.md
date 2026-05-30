# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8435.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balanceadjust | pk_balanceadjust | pk_balanceadjust | char(20) | √ |
| 2 | account | account | account | varchar2(50) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approver | approver | approver | varchar2(50) |
| 5 | bankbalance | bankbalance | bankbalance | number(28, 8) |
| 6 | bankbalanceafter | bankbalanceafter | bankbalanceafter | number(28, 8) |
| 7 | begdate | begdate | begdate | char(19) |
| 8 | billbalance | billbalance | billbalance | number(28, 8) |
| 9 | billbalanceafter | billbalanceafter | billbalanceafter | number(28, 8) |
| 10 | enddate | enddate | enddate | char(19) |
| 11 | linkmemo | linkmemo | linkmemo | varchar2(272) |
| 12 | pk_account | pk_account | pk_account | varchar2(20) |
| 13 | pk_approver | pk_approver | pk_approver | varchar2(20) |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |
| 15 | pk_link | pk_link | pk_link | varchar2(20) |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |
| 17 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 18 | startdate | startdate | startdate | char(19) |
| 19 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 20 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |