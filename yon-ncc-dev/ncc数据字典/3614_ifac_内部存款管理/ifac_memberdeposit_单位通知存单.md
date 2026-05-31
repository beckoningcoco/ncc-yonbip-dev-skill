# |<<

**单位通知存单 (ifac_memberdeposit / nc.vo.ifac.depositreceipt.MemberNoticeDepositVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3101.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_depositreceipt | 主键 | pk_depositreceipt | char(20) | √ | 主键 (UFID) |
| 2 | deposittype | 存单类型 | deposittype | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | depositcode | 存单号 | depositcode | varchar(50) |  | 字符串 (String) |
| 7 | billstate | 单据状态 | billstate | varchar(50) |  | 存单状态 (DepositBillStateEnum) |  | 1=在执行; |