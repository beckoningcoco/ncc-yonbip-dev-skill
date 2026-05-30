# |<<

**工单交易类型扩展 (ewm_transtype / nc.vo.ewm.transtype.WOTranstypeExtendVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1955.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype | 交易类型扩展主键 | pk_transtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | transtypecode | 交易类型编码 | transtypecode | varchar(30) |  | 字符串 (String) |
| 4 | bwoafter_flag | 是否事后汇报 | bwoafter_flag | char(1) |  | 布尔类型 (UFBoolean) |