# |<<

**资源类型规则 (adp_restyperule / nc.vo.uap.distribution.restype.ResourceTypeRule)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/24.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ruleid | 规则ID | ruleid | char(20) | √ | 主键 (UFID) |
| 2 | restypeid | 资源类型 | restypeid | varchar(20) |  | 传输资源注册信息 (resourcetyperegister) |
| 3 | addenable | 可增加 | addenable | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 4 | updateenable | 可修改 | updateenable | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 5 | deleteenable | 可删除 | deleteenable | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 6 | overrideenable | 可覆盖 | overrideenable | char(1) | √ | 布尔类型 (UFBoolean) | Y |
| 7 | extrule | 扩展规则 | extrule | varchar(2000) |  | 字符串 (String) |