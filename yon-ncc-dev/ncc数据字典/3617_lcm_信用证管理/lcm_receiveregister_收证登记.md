# |<<

**收证登记 (lcm_receiveregister / nc.vo.lcm.receive.receiveregister.ReceiveRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3580.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receiptregister | 收证登记主键 | pk_receiptregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 5 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |