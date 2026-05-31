# |<<

**影像扫描单据类型信息 (bd_scanbilltypeinfo / nc.vo.imag.ScanBilltypeInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/962.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scanbilltypeinfo | 主键 | pk_scanbilltypeinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(20) |  | 单据类型 (BilltypeVO) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | ownmodule | 所属模块 | ownmodule | varchar(50) |  | 字符串 (String) |
| 5 | factorycode | 影像厂商 | factorycode | varchar(50) |  | 字符串 (String) |
| 6 | voclasspath | VO类路径 | voclasspath | varchar(1000) |  | 字符串 (String) |