# |<<

**通知存入单 (fac_noticedepositprocess / nc.vo.fac.noticedepositprocess.NoticeDepositProcessVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2100.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deposit | 主键 | pk_deposit | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | depositdate | 存款日期 | depositdate | char(19) |  | 日期(开始) (UFDateBegin) |
| 6 | vbillcode | 单据号 | vbillcode | varchar(50) |  | 字符串 (String) |
| 7 | depositcode | 存单号 | depositcode | varchar(50) |  | 字符串 (String) |
| 8 | vbillstate | 单据状态 | vbillstate | int |  | 银行存款单据状态 (BankBillStatus) |  | 1=已记账; |