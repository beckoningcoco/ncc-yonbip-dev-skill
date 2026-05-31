# |<<

**客户申请单 (bd_customer_pf / nc.vo.bd.cust.pf.CustomerPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/445.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_customerpf | 客户申请单主键 | pk_customerpf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 申请集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 申请组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | billnumber | 单据号 | billnumber | varchar(50) | √ | 字符串 (String) |
| 5 | destorg | 目的组织 | destorg | int | √ | 目的组织 (destorg) |  | 0=本组织; |