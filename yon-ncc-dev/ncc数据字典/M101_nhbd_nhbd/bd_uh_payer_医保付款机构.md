# |<<

**医保付款机构 (bd_uh_payer / nc.vo.nhbd.price.PayerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1063.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_payer | 主键 | pk_payer | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | payercode | 付款机构编码 | payercode | varchar(50) | √ | 字符串 (String) |
| 5 | payername | 付款机构名称 | payername | varchar(50) | √ | 字符串 (String) |
| 6 | innercode | 内联码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | father_pk | 上级 | father_pk | varchar(20) |  | 医保付款机构 (PayerVO) |
| 8 | pk_type | 付款机构类型 | pk_type | varchar(20) | √ | 付款机构类型(自定义档案) (Defdoc-040000) |
| 9 | dt_type | 付款机构类型编码 | dt_type | varchar(50) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |