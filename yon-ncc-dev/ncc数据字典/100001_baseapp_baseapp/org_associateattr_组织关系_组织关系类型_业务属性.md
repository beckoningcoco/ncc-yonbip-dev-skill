# |<<

**组织关系_组织关系类型_业务属性 (org_associateattr / nc.vo.org.orgmodel.AssociateAttrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4000.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_associateattr | 组织类型业务范围主键 | pk_associateattr | char(0) | √ | 组织关系_组织类型业务范围 (orgtypebusiregion) |
| 2 | attrname | 业务范围名称 | attrname | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | orderindex | 显示次序 | orderindex | int | √ | 整数 (Integer) |  | [1 , 10] |