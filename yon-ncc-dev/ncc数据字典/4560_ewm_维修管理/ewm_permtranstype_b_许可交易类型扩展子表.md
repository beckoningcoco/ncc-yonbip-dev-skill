# |<<

**许可交易类型扩展子表 (ewm_permtranstype_b / nc.vo.ewm.permtranstype.PermTranstypeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1947.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype_b | 交易类型扩展子表主键 | pk_transtype_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_permitstatus | 许可状态 | pk_permitstatus | varchar(20) |  | 许可状态 (permitstatus) |
| 3 | perm_statustype | 许可状态类别 | perm_statustype | int |  | 许可状态类别 (permitstatustype) |  | 0=已创建; |