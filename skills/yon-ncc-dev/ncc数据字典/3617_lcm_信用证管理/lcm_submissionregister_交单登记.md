# |<<

**交单登记 (lcm_submissionregister / nc.vo.lcm.receive.submissionregister.SubmissionRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3585.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_submissionregister | 交单登记主表主键 | pk_submissionregister | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 6 | pk_billtypeid | 单据类型主键 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 7 | vbillno | 单据编号 | vbillno | varchar(40) |  | 字符串 (String) |
| 8 | isinitial | 期初 | isinitial | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | lcno | 信用证号 | lcno | varchar(20) |  | 收证登记 (receiveregister) |
| 10 | pk_currtype | 信用证币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 11 | isbatch | 分批 | isbatch | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_customer | 客户 | pk_customer | varchar(20) |  | 客户基本信息 (customer) |
| 13 | pk_receivebank | 收单银行 | pk_receivebank | varchar(20) |  | 银行档案 (bankdoc) |
| 14 | paytype | 兑付方式 | paytype | int |  | 兑付方式 (LCPaytype) |  | 1=即期付款; |