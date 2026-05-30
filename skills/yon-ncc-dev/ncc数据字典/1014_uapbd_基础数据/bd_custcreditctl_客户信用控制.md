# |<<

**客户信用控制 (bd_custcreditctl / nc.vo.bd.cust.creditctl.CustCreditCtlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/438.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_custcreditctl | 信用控制主键 | pk_custcreditctl | char(20) | √ | 主键 (UFID) |
| 2 | pk_customer | 客户基本信息 | pk_customer | char(0) | √ | 客户基本信息 (customer) |
| 3 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 所属信用控制域 | pk_org | char(20) | √ | 组织_信用控制域 (creditctlregion) |
| 5 | freeofcremnycheck | 免于信用额度检查 | freeofcremnycheck | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 6 | freeofacclmtcheck | 免于帐期检查 | freeofacclmtcheck | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 7 | creditcontrol | 基于上级客户信用控制 | creditcontrol | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 8 | acclimitcontrol | 基于上级客户账期控制 | acclimitcontrol | char(1) | √ | 布尔类型 (UFBoolean) | N |
| 9 | creditlevel | 信用等级 | creditlevel | varchar(20) |  | 信用等级(自定义档案) (Defdoc-BD003_0xx) |
| 10 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |