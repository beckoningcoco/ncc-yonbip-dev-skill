# |<<

**影像扫描字段映射 (bd_scanconvertor / nc.vo.imag.ScanConvertorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/963.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scanconvertor | 主键 | pk_scanconvertor | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | billfield | 单据字段 | billfield | varchar(50) |  | 字符串 (String) |
| 4 | cmfield | 影像字段 | cmfield | varchar(50) |  | 字符串 (String) |
| 5 | convertor | 转换实现类 | convertor | varchar(1000) |  | 字符串 (String) |
| 6 | constantvalue | 常量 | constantvalue | varchar(1000) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | ownmodule | 所属模块 | ownmodule | varchar(50) |  | 字符串 (String) |
| 9 | factory_code | 影像厂商编码 | factory_code | varchar(50) |  | 字符串 (String) |