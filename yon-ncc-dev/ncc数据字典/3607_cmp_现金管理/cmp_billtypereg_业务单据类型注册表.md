# |<<

**业务单据类型注册表 (cmp_billtypereg / nc.vo.cmp.settlement.BillRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1540.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billtypereg | 注册表主键 | pk_billtypereg | char(20) | √ | 主键 (UFID) |
| 2 | modelcode | 模块名称 | modelcode | varchar(25) |  | 字符串 (String) |
| 3 | billtype | 交易类型 | billtype | varchar(25) |  | 字符串 (String) |
| 4 | uiclassname | 业务ui接口实现类 | uiclassname | varchar(80) |  | 字符串 (String) |
| 5 | serverclassname | 业务后台服务实现类 | serverclassname | varchar(80) |  | 字符串 (String) |
| 6 | settlementinfofetcher | 结算信息提取类 | settlementinfofetcher | varchar(80) |  | 字符串 (String) |