# |<<

**分摊对象 (cca_arsobj / nc.vo.cca.rulescheme.allocruleset.ARSObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1274.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arsobj | 主键 | pk_arsobj | char(20) | √ | 主键 (UFID) |
| 2 | accountobj | 核算对象 | accountobj | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 3 | sendfetchway | 发送取数方式 | sendfetchway | int |  | 发送取数方式 (sendfetchway) |  | 0=组; |