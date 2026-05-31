# |<<

**还款方式 (tmpub_RepayMet / nc.vo.tmpub.bd.repaymentmethod.RepaymentMethodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5771.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repaymentmethod | 主键 | pk_repaymentmethod | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 还款方式编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 还款方式名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | repay_prcpl_method | 还本方式 | repay_prcpl_method | varchar(50) |  | 还本方式 (RepayPrcplMethodEnum) |  | 1=按月; |