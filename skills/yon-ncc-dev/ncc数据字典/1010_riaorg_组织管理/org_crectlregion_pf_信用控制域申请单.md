# |<<

**信用控制域申请单 (org_crectlregion_pf / nc.vo.org.creditpf.CreditPfVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4036.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccregion_pf | 信用控制域申请单主键 | pk_ccregion_pf | varchar(20) | √ | 主键 (UFID) |
| 2 | name | 信用控制域名称 | name | varchar(50) |  | 字符串 (String) |
| 3 | code | 信用控制域编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 申请组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 申请集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | billno | 申请单号 | billno | varchar(50) |  | 字符串 (String) |
| 7 | destorg | 目的组织 | destorg | int |  | 目的组织 (destorg) |  | 0=本组织; |