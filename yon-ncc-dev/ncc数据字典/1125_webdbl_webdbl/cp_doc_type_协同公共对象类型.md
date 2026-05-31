# |<<

**协同公共对象类型 (cp_doc_type / uap.lfw.dbl.vo.CpDocTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1640.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doctype | pk_doctype | pk_doctype | char(20) | √ | 主键 (UFID) |
| 2 | typecode | 类型编码 | typecode | varchar(50) |  | 字符串 (String) |
| 3 | typename | 类型名称 | typename | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_parent | 父对象类型 | pk_parent | varchar(20) |  | 协同公共对象类型 (wapdoc_type) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |