# |<<

**关联单据 (fiarc_relatedbills / nc.vo.archive.archiveinit.RelatedBillsVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2213.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relatedbills | 关联单据主键 | pk_relatedbills | char(20) | √ | 主键 (UFID) |
| 2 | pk_system | 来源系统 | pk_system | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 交易类型 (transtype) |
| 5 | pk_billtemplate | 归档模板 | pk_billtemplate | varchar(50) |  | PDF模板样式 (PDFPrintStyle) |  | test1=模板1; |