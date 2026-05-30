# |<<

**单据影响因素关联 (fip_billfactor / nc.vo.fip.billfactor.BillFactorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2219.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billfactor | 对象标识 | pk_billfactor | char(20) | √ | 主键 (UFID) |
| 2 | pk_factor | 影响因素 | pk_factor | varchar(20) |  | 影响因素 (factor) |
| 3 | pk_systypecode | 系统类型 | pk_systypecode | varchar(20) |  | 字符串 (String) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | entity_attr | 单据属性 | entity_attr | varchar(101) |  | 自定义项 (Custom) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |