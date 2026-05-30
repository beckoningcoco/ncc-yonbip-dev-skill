# |<<

**辅助核算维度定义 (nresa_AssDimVO / nc.vo.nresa.voucher.ass.AssDimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3835.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pkdim | 主键 | pkdim | char(20) | √ | 主键 (UFID) |
| 2 | tablename | 对应表名 | tablename | varchar(50) |  | 字符串 (String) |
| 3 | colname | 对应列名 | colname | varchar(50) |  | 字符串 (String) |
| 4 | pkassist | 辅助核算项目 | pkassist | varchar(20) |  | 会计辅助核算项目 (accassitem) |