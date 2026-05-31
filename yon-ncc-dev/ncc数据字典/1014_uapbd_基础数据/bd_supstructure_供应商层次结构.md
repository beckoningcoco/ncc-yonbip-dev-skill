# |<<

**供应商层次结构 (bd_supstructure / nc.vo.uapbd.supstructure.SupStructureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/989.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supplier | 供应商基本信息主键 | pk_supplier | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 上级供应商 | pk_parent | varchar(20) |  | 供应商层次结构 (supstructure) |
| 3 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |