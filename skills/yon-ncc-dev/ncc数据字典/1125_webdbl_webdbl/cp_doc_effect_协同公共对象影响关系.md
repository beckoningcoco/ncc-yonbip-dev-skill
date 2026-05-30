# |<<

**协同公共对象影响关系 (cp_doc_effect / uap.lfw.dbl.vo.CpDocEffectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1635.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_effect | pk_effect | pk_effect | char(20) | √ | 主键 (UFID) |
| 2 | pk_docstart | 影响对象主键 | pk_docstart | varchar(20) |  | 协同公共对象 (wapdoc_doc) |
| 3 | pk_docend | 被影响对象主键 | pk_docend | varchar(20) |  | 协同公共对象 (wapdoc_doc) |