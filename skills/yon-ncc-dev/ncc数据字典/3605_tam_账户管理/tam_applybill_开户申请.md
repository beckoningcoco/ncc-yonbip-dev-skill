# |<<

**开户申请 (tam_applybill / nc.vo.tam.account.apply.ApplyBillVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5674.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applybill | 开户申请主键 | pk_applybill | char(20) | √ | 主键 (UFID) |
| 2 | isinneracc | 是否内部账户 | isinneracc | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_org | 开户财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | isdesaccount | 是否已经销户 | isdesaccount | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | apply_type | 申请类型 | apply_type | int |  | 申请类型 (applytype) |  | 1=开户; |