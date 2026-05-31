# |<<

**许可状态 (ewm_permitstatus / nc.vo.ewm.permitstatus.PermitStatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_permitstatus | 许可状态主键 | pk_permitstatus | char(20) | √ | 主键 (UFID) |
| 2 | statuscode | 状态编码 | statuscode | varchar(40) |  | 字符串 (String) |
| 3 | statusname | 状态名称 | statusname | varchar(80) |  | 多语文本 (MultiLangText) |
| 4 | statustype | 状态类别 | statustype | int |  | 许可状态类别 (permitstatustype) |  | 0=已创建; |