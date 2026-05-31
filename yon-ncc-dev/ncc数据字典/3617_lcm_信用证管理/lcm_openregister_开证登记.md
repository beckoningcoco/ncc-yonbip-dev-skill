# |<<

**开证登记 (lcm_openregister / nc.vo.lcm.open.register.OpenRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3571.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_register | 主键 | pk_register | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 7 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 8 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | vbillstatus | 审批状态 | vbillstatus | int |  | 信用证单据状态 (LCBillStatus) |  | -1=自由态; |