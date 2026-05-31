# |<<

**电子归档初始设置 (fiarc_archiveinit / nc.vo.archive.archiveinit.ArchiveInitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_archivedcommonset | 主表初始设置主键 | pk_archivedcommonset | char(20) | √ | 主键 (UFID) |
| 2 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) | √ | 账簿_账簿类型 (setofbook) |
| 3 | pk_accperiod | 会计期间方案 | pk_accperiod | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 4 | pk_currtype | 本位币 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 5 | accbookfrequency | 归档频度 | accbookfrequency | varchar(50) |  | 归档频度 (enum2) |  | 1=日; |