# |<<

**协同公共对象明细 (cp_doc_list / uap.lfw.dbl.vo.CpDocListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1636.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_doclist | pk_doclist | pk_doclist | varchar(50) | √ | 字符串 (String) |
| 2 | pk_docstart | 父对象主键 | pk_docstart | varchar(20) |  | 协同公共对象 (wapdoc_doc) |
| 3 | pk_docend | 子对象主键 | pk_docend | varchar(20) |  | 协同公共对象 (wapdoc_doc) |