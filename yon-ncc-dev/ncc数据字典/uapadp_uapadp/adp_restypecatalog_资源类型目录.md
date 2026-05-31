# |<<

**资源类型目录 (adp_restypecatalog / nc.vo.uap.distribution.restype.ResourceTypeCatalogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/22.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | catalogid | 记录ID | catalogid | char(20) | √ | 主键 (UFID) |
| 2 | catalogcode | 目录编码 | catalogcode | varchar(50) | √ | 字符串 (String) |
| 3 | catalogname | 目录名称 | catalogname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | parentcatalogid | 父目录ID | parentcatalogid | varchar(20) |  | 资源类型目录 (resourcetypecatalog) |
| 5 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |