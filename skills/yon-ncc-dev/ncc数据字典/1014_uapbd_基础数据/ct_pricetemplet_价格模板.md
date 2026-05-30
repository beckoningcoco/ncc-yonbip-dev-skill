# |<<

**价格模板 (ct_pricetemplet / nc.vo.ct.pricetemplet.entity.PriceTempletHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1663.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricetemplet | 主键 | pk_pricetemplet | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | vcode | 价格模板编码 | vcode | varchar(50) |  | 字符串 (String) |
| 5 | vname | 价格模板名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 7 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 9 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |