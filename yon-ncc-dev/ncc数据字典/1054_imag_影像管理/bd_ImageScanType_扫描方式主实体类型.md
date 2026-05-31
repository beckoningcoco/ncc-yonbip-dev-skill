# |<<

**扫描方式主实体类型 (bd_ImageScanType / nc.vo.imag.ImageScanTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | 扫描方式主实体类型 | pk_id | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 上级对象 | pk_parent | varchar(20) |  | 扫描方式主实体类型 (ImageScanType) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | pk_billtypecode | 单据类型PK | pk_billtypecode | char(20) |  | 主键 (UFID) |
| 6 | orgrefclass | 主组织参照 | orgrefclass | varchar(500) |  | 字符串 (String) |
| 7 | billtypecode | 单据类型编码 | billtypecode | varchar(50) |  | 字符串 (String) |