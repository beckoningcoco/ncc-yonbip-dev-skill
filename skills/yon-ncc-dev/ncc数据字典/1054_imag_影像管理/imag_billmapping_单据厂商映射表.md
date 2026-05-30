# |<<

**单据厂商映射表 (imag_billmapping / nc.vo.imag.billmapping.BillMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3118.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mapping | 主键 | pk_mapping | varchar(20) | √ | 字符串 (String) |
| 2 | pk_org | 组织pk | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | billtype | 单据类型 | billtype | varchar(50) |  | 字符串 (String) |
| 4 | transitype | 交易类型 | transitype | varchar(50) |  | 字符串 (String) |
| 5 | pk_factory | 厂商pk | pk_factory | varchar(20) |  | 字符串 (String) |
| 6 | servicetype | 厂商服务类型 | servicetype | varchar(50) |  | 字符串 (String) |
| 7 | next_mapping | 自动进行下一步 | next_mapping | varchar(20) |  | 字符串 (String) |
| 8 | sign | 数据源唯一标识 | sign | varchar(32) |  | 字符串 (String) |