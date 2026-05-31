# |<<

**通知收款 (lcm_collectionnotice / nc.vo.lcm.receive.collectionnotice.CollectionNoticeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3557.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_collectionnotice | 通知收款主键 | pk_collectionnotice | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 7 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 8 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isdocubills | 押汇 | isdocubills | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | voucherflag | 已制证 | voucherflag | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_submissionno | 交单登记单号 | pk_submissionno | varchar(20) |  | 交单登记 (submissionregister) |
| 12 | pk_lcno | 信用证号 | pk_lcno | varchar(20) |  | 收证登记 (receiveregister) |
| 13 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 14 | pk_receivebank | 收单银行 | pk_receivebank | varchar(20) |  | 银行档案 (bankdoc) |
| 15 | pk_lccurrtype | 信用证币种 | pk_lccurrtype | varchar(20) |  | 币种 (currtype) |
| 16 | vbillstatus | 审批状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |