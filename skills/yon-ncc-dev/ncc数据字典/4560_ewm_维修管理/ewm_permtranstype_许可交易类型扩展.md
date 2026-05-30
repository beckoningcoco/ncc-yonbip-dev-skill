# |<<

**许可交易类型扩展 (ewm_permtranstype / nc.vo.ewm.permtranstype.PermTranstypeHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype | 交易类型扩展主键 | pk_transtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | transtypecode | 交易类型编码 | transtypecode | varchar(30) |  | 字符串 (String) |
| 4 | permmanage | 许可管理模式 | permmanage | int |  | 许可管理模式 (PermManage) |  | 0=即时状态管理; |