# |<<

**档案转换 (fip_docmap / nc.vo.fip.docmap.DocMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2233.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmap | 对象标识 | pk_docmap | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | docmapcode | 编码 | docmapcode | varchar(50) |  | 字符串 (String) |
| 5 | docmapname | 名称 | docmapname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | explanation | 说明 | explanation | varchar(500) |  | 字符串 (String) |